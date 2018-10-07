package com.mantono.cutesql

import com.sun.org.apache.bcel.internal.generic.FREM
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.net.URL
import java.sql.Blob
import java.sql.CallableStatement
import java.sql.Clob
import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.Date
import java.sql.NClob
import java.sql.ParameterMetaData
import java.sql.PreparedStatement
import java.sql.Ref
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.RowId
import java.sql.SQLWarning
import java.sql.SQLXML
import java.sql.Savepoint
import java.sql.Statement
import java.sql.Struct
import java.sql.Time
import java.sql.Timestamp
import java.util.*
import java.util.concurrent.Executor

class TestSqlFunctions {

	@Test
	fun testSelectQuery() {

		val query: String = QueryBuilder
				.select("Labels.name, `Labels`.`id`, Labels.user")
				.from("Labels")
				.where("user = ?", 1)
				.orderBy("priority")
				.asc()
				.build()

		assertEquals("SELECT `Labels`.`name`, `Labels`.`id`, `Labels`.`user` FROM `Labels` WHERE `user` = ? ORDER BY `priority` ASC", query)
	}
}