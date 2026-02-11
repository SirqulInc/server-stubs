package api

import model.PreviewPersonaResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[PreviewPersonaApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class PreviewPersonaApiImpl extends PreviewPersonaApi {
  /**
    * @inheritdoc
    */
  override def createPersona(accountId: Long, title: String, previewAccounts: Option[String], date: Option[Long], age: Option[Int], gender: Option[String], gameExperienceLevel: Option[String], latitude: Option[Double], longitude: Option[Double]): PreviewPersonaResponse = {
    // TODO: Implement better logic

    PreviewPersonaResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deletePersona(accountId: Long, personaId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPersonaList(accountId: Long, personaId: Long): PreviewPersonaResponse = {
    // TODO: Implement better logic

    PreviewPersonaResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPersona(accountId: Long, start: Int, limit: Int): PreviewPersonaResponse = {
    // TODO: Implement better logic

    PreviewPersonaResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updatePersona(accountId: Long, personaId: Long, title: Option[String], previewAccounts: Option[String], active: Option[Boolean], date: Option[Long], age: Option[Int], gender: Option[String], gameExperienceLevel: Option[String], latitude: Option[Double], longitude: Option[Double]): PreviewPersonaResponse = {
    // TODO: Implement better logic

    PreviewPersonaResponse(None, None, None, None, None, None, None, None, None, None)
  }
}
