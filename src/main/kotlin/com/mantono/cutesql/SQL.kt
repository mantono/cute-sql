package com.mantono.cutesql

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.util.*

class SQL(query: SQL.() -> Unit): SqlQuery {
	private val fullQuery: Queue<Query> = LinkedList()

	init {
		this.query()
	}

	fun select(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.SELECT, query, preparedArgs)

	fun insert(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.INSERT, query, preparedArgs)

	fun values(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.VALUES, query, preparedArgs)

	fun update(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.UPDATE, query, preparedArgs)

	fun delete(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.DELETE, query, preparedArgs)

	fun from(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.FROM, query, preparedArgs)

	fun where(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.WHERE, query, preparedArgs)

	fun orderBy(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.ORDER_BY, query, preparedArgs)

	fun join(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.JOIN, query, preparedArgs)

	fun innerJoin(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.INNER_JOIN, query, preparedArgs)

	fun leftJoin(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.LEFT_JOIN, query, preparedArgs)

	fun rightJoin(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.RIGHT_JOIN, query, preparedArgs)

	fun limit(query: String, vararg preparedArgs: Any): Unit =
		genericQuery(SqlKeyword.LIMIT, query, preparedArgs)

	fun asc(): Unit = genericQuery(SqlKeyword.ASC)

	fun desc(): Unit = genericQuery(SqlKeyword.DESC)

	private fun genericQuery(
		keyword: SqlKeyword,
		query: String? = null,
		preparedArgs: Array<out Any> = emptyArray()
	) {
		val expectedArgs: Int = query?.asSequence()?.count { it == '?' } ?: 0
		val givenArgs: Int = preparedArgs.count()
		require(expectedArgs == givenArgs) {
			"Arguments size does not match, got $givenArgs, expected $expectedArgs"
		}

		fullQuery.add(Triple(keyword, query, preparedArgs))
	}

	override fun toString(): String = build()

	override fun prepare(connection: Connection): PreparedStatement = compile(connection)

	override fun build(): String = fullQuery.joinToString(separator = " ") { q ->
		"${q.first}${escape(q.second)}"
	}

	private fun compile(connection: Connection): PreparedStatement {
		val statement = toPreparedStatement(connection)
		fullQuery.asSequence()
			.filter { it.third.isNotEmpty() }
			.map { it.third }
			.flatMap { it.asSequence() }
			.forEachIndexed { index, arg ->
				val i = index + 1
				statement.set(i, arg)
			}

		return statement
	}

	private fun toPreparedStatement(connection: Connection): PreparedStatement =
		connection.prepareStatement(build())
}