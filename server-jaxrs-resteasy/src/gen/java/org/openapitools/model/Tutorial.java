package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Tutorial   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String description;

  /**
   * Gets or Sets alignment
   */
  public enum AlignmentEnum {
    NONE("NONE"),

        IMAGE_ABOVE("IMAGE_ABOVE"),

        IMAGE_BELOW("IMAGE_BELOW"),

        IMAGE_LEFT("IMAGE_LEFT"),

        IMAGE_RIGHT("IMAGE_RIGHT"),

        IMAGE_ONLY("IMAGE_ONLY"),

        TEXT_ONLY("TEXT_ONLY");
    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AlignmentEnum alignment;
  private Asset image;
  private Long orderIndex;

  /**
   * Gets or Sets tutorialObjectType
   */
  public enum TutorialObjectTypeEnum {
    GAME_OBJECT("GAME_OBJECT"),

        GAME_LEVEL("GAME_LEVEL"),

        PACK("PACK"),

        GAME("GAME"),

        MISSION("MISSION"),

        PROFILE("PROFILE"),

        APPLICATION("APPLICATION"),

        TICKETS("TICKETS"),

        ASSET("ASSET"),

        CUSTOM("CUSTOM");
    private String value;

    TutorialObjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TutorialObjectTypeEnum tutorialObjectType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alignment")
  public AlignmentEnum getAlignment() {
    return alignment;
  }
  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  @Valid
  public Asset getImage() {
    return image;
  }
  public void setImage(Asset image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderIndex")
  public Long getOrderIndex() {
    return orderIndex;
  }
  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tutorialObjectType")
  public TutorialObjectTypeEnum getTutorialObjectType() {
    return tutorialObjectType;
  }
  public void setTutorialObjectType(TutorialObjectTypeEnum tutorialObjectType) {
    this.tutorialObjectType = tutorialObjectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tutorial tutorial = (Tutorial) o;
    return Objects.equals(this.id, tutorial.id) &&
        Objects.equals(this.active, tutorial.active) &&
        Objects.equals(this.valid, tutorial.valid) &&
        Objects.equals(this.name, tutorial.name) &&
        Objects.equals(this.description, tutorial.description) &&
        Objects.equals(this.alignment, tutorial.alignment) &&
        Objects.equals(this.image, tutorial.image) &&
        Objects.equals(this.orderIndex, tutorial.orderIndex) &&
        Objects.equals(this.tutorialObjectType, tutorial.tutorialObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, alignment, image, orderIndex, tutorialObjectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tutorial {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
    sb.append("    tutorialObjectType: ").append(toIndentedString(tutorialObjectType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

