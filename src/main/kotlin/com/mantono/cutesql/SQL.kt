package com.mantono.cutesql

import java.util.*

class SQL(
	val query: Queue<Query> = LinkedList(),
	val q: SQL.() -> Unit
) {

	//val query: Queue<Query> = LinkedList()

	operator fun invoke(q: SQL.() -> Unit) {}

	fun select() {}
	fun from() {}
	fun where() {}
}


fun test() {

	SQL {
		select()
		from()
		where()
	}

}