package api

import play.api.libs.json._
import model.Program

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ProgramApi {
  /**
    * Create Program
    * Create a new program
    */
  def createProgram(body: Option[Program]): Program

  /**
    * Delete Program
    * Delete an existing program
    * @param id the id of the program
    */
  def deleteProgram(id: Long): Unit

  /**
    * Get Program
    * Get an existing program
    * @param id the id of the program
    */
  def getProgram(id: Long): Program

  /**
    * Update Program
    * Update an existing program
    * @param id the id of the program
    */
  def postProgram(id: Long, body: Option[Program]): Program

  /**
    * Update Program
    * Update an existing program
    * @param id the id of the program
    */
  def putProgram(id: Long, body: Option[Program]): Program

  /**
    * Search Programs
    * Search for programs
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param keyword The keyword to filter results by
    */
  def searchPrograms(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String]): List[Program]
}
