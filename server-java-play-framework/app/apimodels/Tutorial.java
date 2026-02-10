package apimodels;

import apimodels.Asset;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Tutorial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Tutorial   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
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

    private final String value;

    AlignmentEnum(String value) {
      this.value = value;
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

  @JsonProperty("alignment")
  
  private AlignmentEnum alignment;

  @JsonProperty("image")
  @Valid

  private Asset image;

  @JsonProperty("orderIndex")
  
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

    private final String value;

    TutorialObjectTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("tutorialObjectType")
  
  private TutorialObjectTypeEnum tutorialObjectType;

  public Tutorial id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tutorial active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Tutorial valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Tutorial name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tutorial description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tutorial alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Get alignment
   * @return alignment
  **/
  public AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public Tutorial image(Asset image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public Asset getImage() {
    return image;
  }

  public void setImage(Asset image) {
    this.image = image;
  }

  public Tutorial orderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

   /**
   * Get orderIndex
   * @return orderIndex
  **/
  public Long getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(Long orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Tutorial tutorialObjectType(TutorialObjectTypeEnum tutorialObjectType) {
    this.tutorialObjectType = tutorialObjectType;
    return this;
  }

   /**
   * Get tutorialObjectType
   * @return tutorialObjectType
  **/
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
    return Objects.equals(id, tutorial.id) &&
        Objects.equals(active, tutorial.active) &&
        Objects.equals(valid, tutorial.valid) &&
        Objects.equals(name, tutorial.name) &&
        Objects.equals(description, tutorial.description) &&
        Objects.equals(alignment, tutorial.alignment) &&
        Objects.equals(image, tutorial.image) &&
        Objects.equals(orderIndex, tutorial.orderIndex) &&
        Objects.equals(tutorialObjectType, tutorial.tutorialObjectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, alignment, image, orderIndex, tutorialObjectType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

