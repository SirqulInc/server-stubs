package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Asset;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Tutorial
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Tutorial {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String description;

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

    private final String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable AlignmentEnum alignment;

  private @Nullable Asset image;

  private @Nullable Long orderIndex;

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

    private final String value;

    TutorialObjectTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable TutorialObjectTypeEnum tutorialObjectType;

  public Tutorial id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Tutorial active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public Tutorial valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Tutorial name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Tutorial description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public Tutorial alignment(@Nullable AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

  /**
   * Get alignment
   * @return alignment
   */
  
  @Schema(name = "alignment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alignment")
  public @Nullable AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(@Nullable AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public Tutorial image(@Nullable Asset image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable Asset getImage() {
    return image;
  }

  public void setImage(@Nullable Asset image) {
    this.image = image;
  }

  public Tutorial orderIndex(@Nullable Long orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

  /**
   * Get orderIndex
   * @return orderIndex
   */
  
  @Schema(name = "orderIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderIndex")
  public @Nullable Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(@Nullable Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Tutorial tutorialObjectType(@Nullable TutorialObjectTypeEnum tutorialObjectType) {
    this.tutorialObjectType = tutorialObjectType;
    return this;
  }

  /**
   * Get tutorialObjectType
   * @return tutorialObjectType
   */
  
  @Schema(name = "tutorialObjectType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tutorialObjectType")
  public @Nullable TutorialObjectTypeEnum getTutorialObjectType() {
    return tutorialObjectType;
  }

  public void setTutorialObjectType(@Nullable TutorialObjectTypeEnum tutorialObjectType) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

