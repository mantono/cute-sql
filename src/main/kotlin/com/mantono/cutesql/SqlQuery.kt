package com.mantono.cutesql

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet

interface SqlQuery {
	fun build(): String
	fun prepare(connection: Connection): PreparedStatement
}

fun SqlQuery.executeQuery(connection: Connection): ResultSet = prepare(connection).executeQuery()
fun SqlQuery.execute(connection: Connection): Boolean = prepare(connection).execute()
fun SqlQuery.executeUpdate(connection: Connection): Int = prepare(connection).executeUpdate()