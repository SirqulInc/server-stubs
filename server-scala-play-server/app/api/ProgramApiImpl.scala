package api

import model.Program

/**
  * Provides a default implementation for [[ProgramApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ProgramApiImpl extends ProgramApi {
  /**
    * @inheritdoc
    */
  override def createProgram(body: Option[Program]): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteProgram(id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getProgram(id: Long): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def postProgram(id: Long, body: Option[Program]): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def putProgram(id: Long, body: Option[Program]): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPrograms(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String]): List[Program] = {
    // TODO: Implement better logic

    List.empty[Program]
  }
}
