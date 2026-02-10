package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.EmployeeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class EmployeeApiController @Inject()(cc: ControllerComponents, api: EmployeeApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/employee/assign?accountId=[value]&managerAccountId=[value]&employeeAccountId=[value]&role=[value]
    */
  def assignEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): EmployeeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val managerAccountId = request.getQueryString("managerAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("managerAccountId", "query string")
        }
        
      val employeeAccountId = request.getQueryString("employeeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("employeeAccountId", "query string")
        }
        
      val role = request.getQueryString("role")
        
      api.assignEmployee(version, accountId, managerAccountId, employeeAccountId, role)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/assignToLocation?accountId=[value]&employeeAccountId=[value]&retailerLocationId=[value]&assign=[value]
    */
  def assignToLocationEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val employeeAccountId = request.getQueryString("employeeAccountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerLocationId", "query string")
        }
        
      val assign = request.getQueryString("assign")
        .map(value => value.toBoolean)
        
      api.assignToLocationEmployee(version, accountId, retailerLocationId, employeeAccountId, assign)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/create?accountId=[value]&managerAccountId=[value]&username=[value]&password=[value]&name=[value]&prefixName=[value]&firstName=[value]&middleName=[value]&lastName=[value]&suffixName=[value]&title=[value]&aboutUs=[value]&assetId=[value]&gender=[value]&homePhone=[value]&cellPhone=[value]&cellPhoneCarrier=[value]&businessPhone=[value]&emailAddress=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&zipcode=[value]&country=[value]&role=[value]&retailerLocationIds=[value]&settingsAppKey=[value]&appBlob=[value]&assignedDeviceId=[value]
    */
  def createEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): EmployeeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val managerAccountId = request.getQueryString("managerAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("managerAccountId", "query string")
        }
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val prefixName = request.getQueryString("prefixName")
        
      val firstName = request.getQueryString("firstName")
        
      val middleName = request.getQueryString("middleName")
        
      val lastName = request.getQueryString("lastName")
        
      val suffixName = request.getQueryString("suffixName")
        
      val title = request.getQueryString("title")
        
      val aboutUs = request.getQueryString("aboutUs")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val gender = request.getQueryString("gender")
        
      val homePhone = request.getQueryString("homePhone")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val cellPhoneCarrier = request.getQueryString("cellPhoneCarrier")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val zipcode = request.getQueryString("zipcode")
        
      val country = request.getQueryString("country")
        
      val role = request.getQueryString("role")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val settingsAppKey = request.getQueryString("settingsAppKey")
        
      val appBlob = request.getQueryString("appBlob")
        
      val assignedDeviceId = request.getQueryString("assignedDeviceId")
        
      api.createEmployee(version, accountId, managerAccountId, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, aboutUs, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/delete?accountId=[value]&employeeAccountId=[value]
    */
  def deleteEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val employeeAccountId = request.getQueryString("employeeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("employeeAccountId", "query string")
        }
        
      api.deleteEmployee(version, accountId, employeeAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/get?accountId=[value]&employeeAccountId=[value]&settingsAppKey=[value]
    */
  def getEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): EmployeeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val employeeAccountId = request.getQueryString("employeeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("employeeAccountId", "query string")
        }
        
      val settingsAppKey = request.getQueryString("settingsAppKey")
        
      api.getEmployee(version, accountId, employeeAccountId, settingsAppKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/search?accountId=[value]&role=[value]&retailerId=[value]&retailerLocationId=[value]&q=[value]&keyword=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&activeOnly=[value]&managedOnly=[value]&settingsAppKey=[value]&categoryIds=[value]&query=[value]
    */
  def searchEmployees(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[EmployeeResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val role = request.getQueryString("role")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val managedOnly = request.getQueryString("managedOnly")
        .map(value => value.toBoolean)
        
      val settingsAppKey = request.getQueryString("settingsAppKey")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val query = request.getQueryString("query")
        
      api.searchEmployees(version, accountId, role, retailerId, retailerLocationId, q, keyword, sortField, descending, i, start, l, limit, activeOnly, managedOnly, settingsAppKey, categoryIds, query)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/unassign?accountId=[value]&employeeAccountId=[value]
    */
  def unassignEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): EmployeeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val employeeAccountId = request.getQueryString("employeeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("employeeAccountId", "query string")
        }
        
      api.unassignEmployee(version, accountId, employeeAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/employee/update?accountId=[value]&employeeAccountId=[value]&managerAccountId=[value]&name=[value]&prefixName=[value]&firstName=[value]&middleName=[value]&lastName=[value]&suffixName=[value]&title=[value]&assetId=[value]&gender=[value]&homePhone=[value]&cellPhone=[value]&cellPhoneCarrier=[value]&businessPhone=[value]&emailAddress=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&zipcode=[value]&country=[value]&role=[value]&active=[value]&password=[value]&retailerLocationIds=[value]&settingsAppKey=[value]&appBlob=[value]&assignedDeviceId=[value]
    */
  def updateEmployee(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): EmployeeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val employeeAccountId = request.getQueryString("employeeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("employeeAccountId", "query string")
        }
        
      val managerAccountId = request.getQueryString("managerAccountId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val prefixName = request.getQueryString("prefixName")
        
      val firstName = request.getQueryString("firstName")
        
      val middleName = request.getQueryString("middleName")
        
      val lastName = request.getQueryString("lastName")
        
      val suffixName = request.getQueryString("suffixName")
        
      val title = request.getQueryString("title")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val gender = request.getQueryString("gender")
        
      val homePhone = request.getQueryString("homePhone")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val cellPhoneCarrier = request.getQueryString("cellPhoneCarrier")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val zipcode = request.getQueryString("zipcode")
        
      val country = request.getQueryString("country")
        
      val role = request.getQueryString("role")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val password = request.getQueryString("password")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val settingsAppKey = request.getQueryString("settingsAppKey")
        
      val appBlob = request.getQueryString("appBlob")
        
      val assignedDeviceId = request.getQueryString("assignedDeviceId")
        
      api.updateEmployee(version, accountId, employeeAccountId, managerAccountId, name, prefixName, firstName, middleName, lastName, suffixName, title, assetId, gender, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, role, active, password, retailerLocationIds, settingsAppKey, appBlob, assignedDeviceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
