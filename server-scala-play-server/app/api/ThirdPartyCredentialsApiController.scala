package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.ThirdPartyCredentialResponse
import model.ThirdPartyNetworkResponse
import model.ThirdPartyNetworkShortResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ThirdPartyCredentialsApiController @Inject()(cc: ControllerComponents, api: ThirdPartyCredentialsApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/thirdparty/credential/create?accountId=[value]&deviceId=[value]&sessionId=[value]&thirdPartyId=[value]&thirdPartyName=[value]&thirdPartyToken=[value]&networkUID=[value]&appKey=[value]&emailAddress=[value]&signinOnlyMode=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]&metaData=[value]&thirdPartyRefreshToken=[value]&audienceIdsToAdd=[value]&audienceIdsToRemove=[value]
    */
  def createCredential(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val deviceId = request.getQueryString("deviceId")
        
      val sessionId = request.getQueryString("sessionId")
        
      val thirdPartyId = request.getQueryString("thirdPartyId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("thirdPartyId", "query string")
        }
        
      val thirdPartyName = request.getQueryString("thirdPartyName")
        
      val thirdPartyToken = request.getQueryString("thirdPartyToken")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("thirdPartyToken", "query string")
        }
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val signinOnlyMode = request.getQueryString("signinOnlyMode")
        .map(value => value.toBoolean)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val metaData = request.getQueryString("metaData")
        
      val thirdPartyRefreshToken = request.getQueryString("thirdPartyRefreshToken")
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val audienceIdsToRemove = request.getQueryString("audienceIdsToRemove")
        
      api.createCredential(version, thirdPartyId, thirdPartyToken, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyName, emailAddress, signinOnlyMode, responseFilters, latitude, longitude, metaData, thirdPartyRefreshToken, audienceIdsToAdd, audienceIdsToRemove)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/network/create?accountId=[value]&name=[value]&description=[value]&enableIntrospection=[value]&introspectionMethod=[value]&introspectionURL=[value]&introspectionParams=[value]&requiredRootField=[value]&enableMFA=[value]&sizeMFA=[value]&shelfLifeMFA=[value]&oauthTokenURL=[value]&oauthPrivateKey=[value]&oauthPublicKey=[value]&oauthClientId=[value]&oauthSecretKey=[value]
    */
  def createNetwork(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ThirdPartyNetworkResponse = {
      val body = request.body.asJson.map(_.as[String])
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val enableIntrospection = request.getQueryString("enableIntrospection")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("enableIntrospection", "query string")
        }
        
      val introspectionMethod = request.getQueryString("introspectionMethod")
        
      val introspectionURL = request.getQueryString("introspectionURL")
        
      val introspectionParams = request.getQueryString("introspectionParams")
        
      val requiredRootField = request.getQueryString("requiredRootField")
        
      val enableMFA = request.getQueryString("enableMFA")
        .map(value => value.toBoolean)
        
      val sizeMFA = request.getQueryString("sizeMFA")
        .map(value => value.toInt)
        
      val shelfLifeMFA = request.getQueryString("shelfLifeMFA")
        .map(value => value.toInt)
        
      val oauthTokenURL = request.getQueryString("oauthTokenURL")
        
      val oauthPrivateKey = request.getQueryString("oauthPrivateKey")
        
      val oauthPublicKey = request.getQueryString("oauthPublicKey")
        
      val oauthClientId = request.getQueryString("oauthClientId")
        
      val oauthSecretKey = request.getQueryString("oauthSecretKey")
        
      api.createNetwork(version, accountId, name, enableIntrospection, description, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/credential/delete?accountId=[value]&networkUID=[value]&thirdPartyId=[value]&appKey=[value]
    */
  def deleteCredential(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val thirdPartyId = request.getQueryString("thirdPartyId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("thirdPartyId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.deleteCredential(version, accountId, networkUID, thirdPartyId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/network/delete?accountId=[value]&networkUID=[value]
    */
  def deleteNetwork(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      api.deleteNetwork(version, accountId, networkUID)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/credential/get?accountId=[value]&deviceId=[value]&sessionId=[value]&thirdPartyCredentialId=[value]&thirdPartyToken=[value]&thirdPartySecret=[value]&createNewAccount=[value]&networkUID=[value]&appKey=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]&audienceIdsToAdd=[value]&audienceIdsToRemove=[value]&referralAccountId=[value]
    */
  def getCredential(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val deviceId = request.getQueryString("deviceId")
        
      val sessionId = request.getQueryString("sessionId")
        
      val thirdPartyCredentialId = request.getQueryString("thirdPartyCredentialId")
        .map(value => value.toLong)
        
      val thirdPartyToken = request.getQueryString("thirdPartyToken")
        
      val thirdPartySecret = request.getQueryString("thirdPartySecret")
        
      val createNewAccount = request.getQueryString("createNewAccount")
        .map(value => value.toBoolean)
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val audienceIdsToRemove = request.getQueryString("audienceIdsToRemove")
        
      val referralAccountId = request.getQueryString("referralAccountId")
        .map(value => value.toLong)
        
      api.getCredential(version, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyCredentialId, thirdPartyToken, thirdPartySecret, createNewAccount, responseFilters, latitude, longitude, audienceIdsToAdd, audienceIdsToRemove, referralAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/thirdparty/network/get?accountId=[value]&networkUID=[value]
    */
  def getNetwork(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ThirdPartyNetworkResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      api.getNetwork(version, accountId, networkUID)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/thirdparty/credential/search?accountId=[value]&keyword=[value]&networkUID=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchCredentials(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ThirdPartyCredentialResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val networkUID = request.getQueryString("networkUID")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchCredentials(version, accountId, keyword, networkUID, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/thirdparty/network/search?accountId=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&filterBillable=[value]
    */
  def searchNetworks(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ThirdPartyNetworkShortResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val filterBillable = request.getQueryString("filterBillable")
        .map(value => value.toBoolean)
        
      api.searchNetworks(version, accountId, sortField, descending, start, limit, activeOnly, keyword, filterBillable)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/credential/mfa/send?thirdPartyToken=[value]&thirdPartyCredentialId=[value]&networkUID=[value]&appKey=[value]&deviceId=[value]
    */
  def sendMFAChallenge(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val thirdPartyToken = request.getQueryString("thirdPartyToken")
        
      val thirdPartyCredentialId = request.getQueryString("thirdPartyCredentialId")
        .map(value => value.toLong)
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      api.sendMFAChallenge(version, networkUID, appKey, thirdPartyToken, thirdPartyCredentialId, deviceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/credential/update?deviceId=[value]&networkUID=[value]&thirdPartyId=[value]&thirdPartyName=[value]&thirdPartyToken=[value]&appKey=[value]&responseFilters=[value]&metaData=[value]&thirdPartyRefreshToken=[value]
    */
  def updateCredential(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val thirdPartyId = request.getQueryString("thirdPartyId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("thirdPartyId", "query string")
        }
        
      val thirdPartyName = request.getQueryString("thirdPartyName")
        
      val thirdPartyToken = request.getQueryString("thirdPartyToken")
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val metaData = request.getQueryString("metaData")
        
      val thirdPartyRefreshToken = request.getQueryString("thirdPartyRefreshToken")
        
      api.updateCredential(version, networkUID, thirdPartyId, appKey, deviceId, thirdPartyName, thirdPartyToken, responseFilters, metaData, thirdPartyRefreshToken)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/thirdparty/network/update?accountId=[value]&networkUID=[value]&name=[value]&description=[value]&enableIntrospection=[value]&introspectionMethod=[value]&introspectionURL=[value]&introspectionParams=[value]&requiredRootField=[value]&enableMFA=[value]&sizeMFA=[value]&shelfLifeMFA=[value]&oauthTokenURL=[value]&oauthPrivateKey=[value]&oauthPublicKey=[value]&oauthClientId=[value]&oauthSecretKey=[value]
    */
  def updateNetwork(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ThirdPartyNetworkResponse = {
      val body = request.body.asJson.map(_.as[String])
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val enableIntrospection = request.getQueryString("enableIntrospection")
        .map(value => value.toBoolean)
        
      val introspectionMethod = request.getQueryString("introspectionMethod")
        
      val introspectionURL = request.getQueryString("introspectionURL")
        
      val introspectionParams = request.getQueryString("introspectionParams")
        
      val requiredRootField = request.getQueryString("requiredRootField")
        
      val enableMFA = request.getQueryString("enableMFA")
        .map(value => value.toBoolean)
        
      val sizeMFA = request.getQueryString("sizeMFA")
        .map(value => value.toInt)
        
      val shelfLifeMFA = request.getQueryString("shelfLifeMFA")
        .map(value => value.toInt)
        
      val oauthTokenURL = request.getQueryString("oauthTokenURL")
        
      val oauthPrivateKey = request.getQueryString("oauthPrivateKey")
        
      val oauthPublicKey = request.getQueryString("oauthPublicKey")
        
      val oauthClientId = request.getQueryString("oauthClientId")
        
      val oauthSecretKey = request.getQueryString("oauthSecretKey")
        
      api.updateNetwork(version, accountId, networkUID, name, description, enableIntrospection, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body)
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
