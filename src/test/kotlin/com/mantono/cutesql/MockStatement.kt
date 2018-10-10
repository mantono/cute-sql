package com.mantono.cutesql

import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.net.URL
import java.sql.Blob
import java.sql.Clob
import java.sql.Connection
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
import java.sql.Time
import java.sql.Timestamp
import java.util.*


internal object MockStatement: PreparedStatement {
	override fun setRef(p0: Int, p1: Ref?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBlob(p0: Int, p1: Blob?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBlob(p0: Int, p1: InputStream?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBlob(p0: Int, p1: InputStream?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setCharacterStream(p0: Int, p1: Reader?, p2: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setCharacterStream(p0: Int, p1: Reader?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setCharacterStream(p0: Int, p1: Reader?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setArray(p0: Int, p1: java.sql.Array?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getResultSetType(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setDate(p0: Int, p1: Date?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setDate(p0: Int, p1: Date?, p2: Calendar?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun clearParameters()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun cancel()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getConnection(): Connection
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setObject(p0: Int, p1: Any?, p2: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setObject(p0: Int, p1: Any?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setObject(p0: Int, p1: Any?, p2: Int, p3: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setMaxFieldSize(p0: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBytes(p0: Int, p1: ByteArray?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setLong(p0: Int, p1: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setClob(p0: Int, p1: Clob?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setClob(p0: Int, p1: Reader?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setClob(p0: Int, p1: Reader?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getWarnings(): SQLWarning
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeQuery(): ResultSet
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeQuery(p0: String?): ResultSet
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setUnicodeStream(p0: Int, p1: InputStream?, p2: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun close()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun isClosed(): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNString(p0: Int, p1: String?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getMaxFieldSize(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setURL(p0: Int, p1: URL?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getUpdateCount(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setRowId(p0: Int, p1: RowId?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setFloat(p0: Int, p1: Float)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setFetchDirection(p0: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getFetchSize(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setTime(p0: Int, p1: Time?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setTime(p0: Int, p1: Time?, p2: Calendar?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeBatch(): IntArray
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getQueryTimeout(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun isPoolable(): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBinaryStream(p0: Int, p1: InputStream?, p2: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBinaryStream(p0: Int, p1: InputStream?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBinaryStream(p0: Int, p1: InputStream?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNCharacterStream(p0: Int, p1: Reader?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNCharacterStream(p0: Int, p1: Reader?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setInt(p0: Int, p1: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getGeneratedKeys(): ResultSet
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getResultSetConcurrency(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getResultSet(): ResultSet
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setDouble(p0: Int, p1: Double)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun closeOnCompletion()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getParameterMetaData(): ParameterMetaData
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeUpdate(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeUpdate(p0: String?): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeUpdate(p0: String?, p1: Int): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeUpdate(p0: String?, p1: IntArray?): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun executeUpdate(p0: String?, p1: Array<out String>?): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun clearBatch()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun isCloseOnCompletion(): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun <T : Any?> unwrap(p0: Class<T>?): T
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getMaxRows(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setSQLXML(p0: Int, p1: SQLXML?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBigDecimal(p0: Int, p1: BigDecimal?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setString(p0: Int, p1: String?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setAsciiStream(p0: Int, p1: InputStream?, p2: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setAsciiStream(p0: Int, p1: InputStream?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setAsciiStream(p0: Int, p1: InputStream?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNClob(p0: Int, p1: NClob?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNClob(p0: Int, p1: Reader?, p2: Long)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNClob(p0: Int, p1: Reader?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun isWrapperFor(p0: Class<*>?): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNull(p0: Int, p1: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setNull(p0: Int, p1: Int, p2: String?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setMaxRows(p0: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setTimestamp(p0: Int, p1: Timestamp?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setTimestamp(p0: Int, p1: Timestamp?, p2: Calendar?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setEscapeProcessing(p0: Boolean)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setCursorName(p0: String?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun execute(): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun execute(p0: String?): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun execute(p0: String?, p1: Int): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun execute(p0: String?, p1: IntArray?): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun execute(p0: String?, p1: Array<out String>?): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setPoolable(p0: Boolean)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setShort(p0: Int, p1: Short)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setFetchSize(p0: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun clearWarnings()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getMetaData(): ResultSetMetaData
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun addBatch()
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun addBatch(p0: String?)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setQueryTimeout(p0: Int)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getFetchDirection(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getResultSetHoldability(): Int
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setBoolean(p0: Int, p1: Boolean)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getMoreResults(): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun getMoreResults(p0: Int): Boolean
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

	override fun setByte(p0: Int, p1: Byte)
	{
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}

}