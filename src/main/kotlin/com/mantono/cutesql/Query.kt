package com.mantono.cutesql

import java.sql.PreparedStatement
import java.sql.Timestamp
import java.time.Instant
import java.time.LocalDate

typealias Query = Triple<SqlKeyword, String?, Array<out Any>>

private val nonEscapableChars: List<Char> = listOf('?', ',', '=')

private const val PAD_CHAR = '`'

internal fun escape(query: String?): String {
	if(query == null)
		return ""

	return query
		.split(Regex("\\s"))
		.asSequence()
		.map {
			if(pad(it)) {
				it
					.replace(".", "$PAD_CHAR.$PAD_CHAR")
					.addPrefix(PAD_CHAR)
					.plus(PAD_CHAR)
					.replace(",$PAD_CHAR", "$PAD_CHAR,")
			}
			else {
				it
			}
		}
		.joinToString(separator = " ", prefix = " ") { it }
}

private fun pad(s: String): Boolean = !s.isKeyword() && !s.isSymbol() && !s.isPadded()

private fun String.isSymbol(): Boolean = this.length == 1 && this.first() in nonEscapableChars
private fun String.isKeyword(): Boolean = this.matches(Regex("[A-Z]+"))
private fun String.isPadded(): Boolean = matches(Regex("`[\\w.`]+`,?"))
private fun String.addPrefix(prefix: Char): String = prefix + this

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