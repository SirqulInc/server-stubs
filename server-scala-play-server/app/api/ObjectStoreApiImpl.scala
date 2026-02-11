package api

import model.ObjectStoreResponse

/**
  * Provides a default implementation for [[ObjectStoreApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ObjectStoreApiImpl extends ObjectStoreApi {
  /**
    * @inheritdoc
    */
  override def addField(accountId: Long, appKey: String, objectName: String, fieldName: String, fieldType: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def createData(objectName: String, accountId: Option[Long], body: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def createObject(accountId: Long, appKey: String, objectName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteData(objectName: String, objectId: String, accountId: Option[Long]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteField(accountId: Long, appKey: String, objectName: String, fieldName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteObject(accountId: Long, appKey: String, objectName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def getData(objectName: String, objectId: String, accountId: Option[Long], include: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def getObject(accountId: Long, appKey: String, objectName: String): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchData(objectName: String, count: Boolean, start: Long, limit: Long, accountId: Option[Long], criteria: Option[String], order: Option[String], include: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchObject(accountId: Long, appKey: String, start: Long, limit: Long, keyword: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateData(objectName: String, objectId: String, accountId: Option[Long], body: Option[String]): ObjectStoreResponse = {
    // TODO: Implement better logic

    ObjectStoreResponse(None, None)
  }
}
