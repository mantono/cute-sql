package com.mantono.cutesql

enum class SqlKeyword {
	SELECT,
	INSERT,
	UPDATE,
	DELETE,
	WHERE,
	FROM,
	ORDER_BY,
	JOIN,
	INNER_JOIN,
	LEFT_JOIN,
	RIGHT_JOIN,
	LIMIT,
	DESC,
	ASC;

	override fun toString(): String = name.replace("_", " ")
}

fun QueryBuilder.genericQuery(
		keyword: SqlKeyword,
		query: String? = null,
		preparedArgs: Array<out Any> = emptyArray()
): QueryBuilder {
	val expectedArgs: Int = query?.asSequence()?.count { it == '?' } ?: 0
	val givenArgs: Int = preparedArgs.count()
	require(expectedArgs == givenArgs) {
		"Arguments size does not match, got $givenArgs, expected $expectedArgs"
	}

	this.query.add(Triple(keyword, query, preparedArgs))
	return this
}