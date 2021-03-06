package com.mantono.cutesql

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.sql.ResultSet

class TestSqlFunctions {

	@Test
	fun testSqlQuery() {
		val query: SqlQuery = SQL {
			select("Labels.name, `Labels`.`id`, Labels.user")
			from("Labels")
			where("user = ?", 1)
			orderBy("priority")
			asc()
		}

		assertEquals("SELECT `Labels`.`name`, `Labels`.`id`, `Labels`.`user` FROM `Labels` WHERE `user` = ? ORDER BY `priority` ASC", query.build())
	}

	@Test
	fun testFullExecution() {
		val result: ResultSet = SQL {
			select("*")
			from("Table")
			where("id = ?", 1)
		}.executeQuery(MockConnection)
	}
}