package com.mantono.cutesql

enum class SqlKeyword {
	SELECT,
	INSERT,
	VALUES,
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