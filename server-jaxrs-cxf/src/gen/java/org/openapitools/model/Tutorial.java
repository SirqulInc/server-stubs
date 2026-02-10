package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Tutorial  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

public enum AlignmentEnum {

NONE(String.valueOf("NONE")), IMAGE_ABOVE(String.valueOf("IMAGE_ABOVE")), IMAGE_BELOW(String.valueOf("IMAGE_BELOW")), IMAGE_LEFT(String.valueOf("IMAGE_LEFT")), IMAGE_RIGHT(String.valueOf("IMAGE_RIGHT")), IMAGE_ONLY(String.valueOf("IMAGE_ONLY")), TEXT_ONLY(String.valueOf("TEXT_ONLY"));


    private String value;

    AlignmentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AlignmentEnum fromValue(String value) {
        for (AlignmentEnum b : AlignmentEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private AlignmentEnum alignment;

  @ApiModelProperty(value = "")

  @Valid

  private Asset image;

  @ApiModelProperty(value = "")

  private Long orderIndex;

public enum TutorialObjectTypeEnum {

GAME_OBJECT(String.valueOf("GAME_OBJECT")), GAME_LEVEL(String.valueOf("GAME_LEVEL")), PACK(String.valueOf("PACK")), GAME(String.valueOf("GAME")), MISSION(String.valueOf("MISSION")), PROFILE(String.valueOf("PROFILE")), APPLICATION(String.valueOf("APPLICATION")), TICKETS(String.valueOf("TICKETS")), ASSET(String.valueOf("ASSET")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    TutorialObjectTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TutorialObjectTypeEnum fromValue(String value) {
        for (TutorialObjectTypeEnum b : TutorialObjectTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TutorialObjectTypeEnum tutorialObjectType;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tutorial id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Tutorial active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Tutorial valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tutorial name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tutorial description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get alignment
   * @return alignment
  **/
  @JsonProperty("alignment")
  public String getAlignment() {
    if (alignment == null) {
      return null;
    }
    return alignment.value();
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public Tutorial alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Tutorial image(Asset image) {
    this.image = image;
    return this;
  }

 /**
   * Get orderIndex
   * @return orderIndex
  **/
  @JsonProperty("orderIndex")
  public Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Tutorial orderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

 /**
   * Get tutorialObjectType
   * @return tutorialObjectType
  **/
  @JsonProperty("tutorialObjectType")
  public String getTutorialObjectType() {
    if (tutorialObjectType == null) {
      return null;
    }
    return tutorialObjectType.value();
  }

  public void setTutorialObjectType(TutorialObjectTypeEnum tutorialObjectType) {
    this.tutorialObjectType = tutorialObjectType;
  }

  public Tutorial tutorialObjectType(TutorialObjectTypeEnum tutorialObjectType) {
    this.tutorialObjectType = tutorialObjectType;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

