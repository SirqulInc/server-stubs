package api

import model.BigDecimal
import model.Program

/**
  * Provides a default implementation for [[ProgramApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ProgramApiImpl extends ProgramApi {
  /**
    * @inheritdoc
    */
  override def createProgram(version: BigDecimal, body: Option[Program]): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteProgram(version: BigDecimal, id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getProgram(version: BigDecimal, id: Long): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def postProgram(version: BigDecimal, id: Long, body: Option[Program]): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def putProgram(version: BigDecimal, id: Long, body: Option[Program]): Program = {
    // TODO: Implement better logic

    Program(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPrograms(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String]): List[Program] = {
    // TODO: Implement better logic

    List.empty[Program]
  }
}
