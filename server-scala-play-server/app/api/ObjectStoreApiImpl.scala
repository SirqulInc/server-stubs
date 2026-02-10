package api

import model.BigDecimal
import model.ObjectStoreResponse

/**
  * Provides a default implementation for [[ObjectStoreApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ObjectStoreApiImpl extends ObjectStoreApi {
  /**
    * @inheritdoc
    */
  override def addField(version: BigDecimal, accountId: Long, appKey: String, objectName: String, fieldName: String, fieldType: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def createData(version: BigDecimal, objectName: String, accountId: Option[Long], body: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def createObject(version: BigDecimal, accountId: Long, appKey: String, objectName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteData(version: BigDecimal, objectName: String, objectId: String, accountId: Option[Long]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteField(version: BigDecimal, accountId: Long, appKey: String, objectName: String, fieldName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteObject(version: BigDecimal, accountId: Long, appKey: String, objectName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def getData(version: BigDecimal, objectName: String, objectId: String, accountId: Option[Long], include: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def getObject(version: BigDecimal, accountId: Long, appKey: String, objectName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchData(version: BigDecimal, objectName: String, count: Boolean, start: Long, limit: Long, accountId: Option[Long], criteria: Option[String], order: Option[String], include: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchObject(version: BigDecimal, accountId: Long, appKey: String, start: Long, limit: Long, keyword: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateData(version: BigDecimal, objectName: String, objectId: String, accountId: Option[Long], body: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }
}
