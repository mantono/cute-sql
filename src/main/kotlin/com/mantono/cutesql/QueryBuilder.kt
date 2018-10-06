package com.mantono.cutesql

import java.lang.UnsupportedOperationException
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Timestamp
import java.time.Instant
import java.time.LocalDate
import java.util.*

typealias Query = Triple<SqlKeyword, String?, Array<out Any>>

class QueryBuilder private constructor() {

	val query: Queue<Query> = LinkedList()

	operator fun plus(other: QueryBuilder): QueryBuilder = this.also {
		query.addAll(other.query)
	}

	fun from(query: String, vararg preparedArgs: Any): QueryBuilder =
			genericQuery(SqlKeyword.FROM, query, preparedArgs)

	fun where(query: String, vararg preparedArgs: Any): QueryBuilder =
			genericQuery(SqlKeyword.WHERE, query, preparedArgs)

	fun orderBy(query: String, vararg preparedArgs: Any): QueryBuilder =
			genericQuery(SqlKeyword.ORDER_BY, query, preparedArgs)

	fun join(query: String, vararg preparedArgs: Any): QueryBuilder =
			genericQuery(SqlKeyword.JOIN, query, preparedArgs)

	fun asc(): QueryBuilder = genericQuery(SqlKeyword.ASC)

	fun desc(): QueryBuilder = genericQuery(SqlKeyword.DESC)

	fun executeQuery(connection: Connection): ResultSet = compile(connection).executeQuery()

	override fun toString(): String = build()

	fun build(): String = query.joinToString(separator = " ") { q ->
		"${q.first}${q.second?.let { " $it" } ?: ""}"
	}

	private fun toPreparedStatement(connection: Connection): PreparedStatement =
			connection.prepareStatement(build())

	fun compile(connection: Connection): PreparedStatement {
		val statement = toPreparedStatement(connection)
		query.asSequence()
				.filter { it.third.isNotEmpty() }
				.map { it.third }
				.flatMap { it.asSequence() }
				.forEachIndexed { index, arg ->
					val i = index + 1
					statement.set(i, arg)
				}

		return statement
	}

	companion object {
		fun select(query: String, vararg preparedArgs: Any): QueryBuilder =
				QueryBuilder().genericQuery(SqlKeyword.SELECT, query, preparedArgs)

		fun insert(query: String, vararg preparedArgs: Any): QueryBuilder =
			QueryBuilder().genericQuery(SqlKeyword.INSERT, query, preparedArgs)

		fun update(query: String, vararg preparedArgs: Any): QueryBuilder =
			QueryBuilder().genericQuery(SqlKeyword.UPDATE, query, preparedArgs)

		fun delete(query: String, vararg preparedArgs: Any): QueryBuilder =
			QueryBuilder().genericQuery(SqlKeyword.DELETE, query, preparedArgs)
	}
}

fun PreparedStatement.set(i: Int, arg: Any) {
	when(arg) {
		is Int -> setInt(i, arg)
		is Long -> setLong(i, arg)
		is Double -> setDouble(i, arg)
		is Byte -> setByte(i, arg)
		is ByteArray -> setBytes(i, arg)
		is String -> setString(i, arg)
		is Short -> setShort(i, arg)
		is Float -> setFloat(i, arg)
		is Instant -> setTimestamp(i, Timestamp.from(arg))
		is Boolean -> setBoolean(i, arg)
		is LocalDate -> setDate(i, java.sql.Date.valueOf(arg))
		else -> throw UnsupportedOperationException("Cannot find suitable SQL type for $arg")
	}
}