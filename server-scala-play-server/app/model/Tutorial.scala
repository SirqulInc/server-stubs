package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Tutorial.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Tutorial(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  alignment: Option[Tutorial.Alignment.Value],
  image: Option[Asset],
  orderIndex: Option[Long],
  tutorialObjectType: Option[Tutorial.TutorialObjectType.Value]
)

object Tutorial {
  implicit lazy val tutorialJsonFormat: Format[Tutorial] = Json.format[Tutorial]

  // noinspection TypeAnnotation
  object Alignment extends Enumeration {
    val NONE = Value("NONE")
    val IMAGEABOVE = Value("IMAGE_ABOVE")
    val IMAGEBELOW = Value("IMAGE_BELOW")
    val IMAGELEFT = Value("IMAGE_LEFT")
    val IMAGERIGHT = Value("IMAGE_RIGHT")
    val IMAGEONLY = Value("IMAGE_ONLY")
    val TEXTONLY = Value("TEXT_ONLY")

    type Alignment = Value
    implicit lazy val AlignmentJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object TutorialObjectType extends Enumeration {
    val GAMEOBJECT = Value("GAME_OBJECT")
    val GAMELEVEL = Value("GAME_LEVEL")
    val PACK = Value("PACK")
    val GAME = Value("GAME")
    val MISSION = Value("MISSION")
    val PROFILE = Value("PROFILE")
    val APPLICATION = Value("APPLICATION")
    val TICKETS = Value("TICKETS")
    val ASSET = Value("ASSET")
    val CUSTOM = Value("CUSTOM")

    type TutorialObjectType = Value
    implicit lazy val TutorialObjectTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

