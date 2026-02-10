package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.AudienceDeviceVersionRange;
import org.openapitools.model.AudienceLocation;
import org.openapitools.model.AudienceTargetType;
import org.openapitools.model.Category;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Audience  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Boolean display;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

public enum GenderEnum {

MALE(String.valueOf("MALE")), FEMALE(String.valueOf("FEMALE")), ANY(String.valueOf("ANY"));


    private String value;

    GenderEnum (String v) {
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
    public static GenderEnum fromValue(String value) {
        for (GenderEnum b : GenderEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private GenderEnum gender;

public enum AgeGroupsEnum {

AGE_0_13(String.valueOf("AGE_0_13")), AGE_14_17(String.valueOf("AGE_14_17")), AGE_18_22(String.valueOf("AGE_18_22")), AGE_23_30(String.valueOf("AGE_23_30")), AGE_31_54(String.valueOf("AGE_31_54")), AGE_55_PLUS(String.valueOf("AGE_55_PLUS"));


    private String value;

    AgeGroupsEnum (String v) {
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
    public static AgeGroupsEnum fromValue(String value) {
        for (AgeGroupsEnum b : AgeGroupsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private List<AgeGroupsEnum> ageGroups = new ArrayList<>();

public enum GameExperienceLevelEnum {

ANY(String.valueOf("ANY")), NEW(String.valueOf("NEW")), BEGINNER(String.valueOf("BEGINNER")), INTERMEDIATE(String.valueOf("INTERMEDIATE")), EXPERT(String.valueOf("EXPERT"));


    private String value;

    GameExperienceLevelEnum (String v) {
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
    public static GameExperienceLevelEnum fromValue(String value) {
        for (GameExperienceLevelEnum b : GameExperienceLevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private GameExperienceLevelEnum gameExperienceLevel;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AudienceDeviceVersionRange> deviceVersionRanges = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Application> applications = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Double radius;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AudienceLocation> locations = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean sendSuggestion;

  @ApiModelProperty(value = "")

  private Integer startTimeOffset;

  @ApiModelProperty(value = "")

  private Integer endTimeOffset;

  @ApiModelProperty(value = "")

  @Valid

  private AudienceTargetType target;

  @ApiModelProperty(value = "")

  private String associateContentName;

  @ApiModelProperty(value = "")

  private String polygon;

  @ApiModelProperty(value = "")

  private String associateType;

  @ApiModelProperty(value = "")

  private Long associateId;
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

  public Audience id(Long id) {
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

  public Audience active(Boolean active) {
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

  public Audience valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Audience latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Audience longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Audience locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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

  public Audience name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public Boolean getDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public Audience display(Boolean display) {
    this.display = display;
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

  public Audience description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Audience owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    if (gender == null) {
      return null;
    }
    return gender.value();
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Audience gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get ageGroups
   * @return ageGroups
  **/
  @JsonProperty("ageGroups")
  public List<AgeGroupsEnum> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<AgeGroupsEnum> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public Audience ageGroups(List<AgeGroupsEnum> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public Audience addAgeGroupsItem(AgeGroupsEnum ageGroupsItem) {
    this.ageGroups.add(ageGroupsItem);
    return this;
  }

 /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
  **/
  @JsonProperty("gameExperienceLevel")
  public String getGameExperienceLevel() {
    if (gameExperienceLevel == null) {
      return null;
    }
    return gameExperienceLevel.value();
  }

  public void setGameExperienceLevel(GameExperienceLevelEnum gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public Audience gameExperienceLevel(GameExperienceLevelEnum gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

 /**
   * Get deviceVersionRanges
   * @return deviceVersionRanges
  **/
  @JsonProperty("deviceVersionRanges")
  public List<@Valid AudienceDeviceVersionRange> getDeviceVersionRanges() {
    return deviceVersionRanges;
  }

  public void setDeviceVersionRanges(List<@Valid AudienceDeviceVersionRange> deviceVersionRanges) {
    this.deviceVersionRanges = deviceVersionRanges;
  }

  public Audience deviceVersionRanges(List<@Valid AudienceDeviceVersionRange> deviceVersionRanges) {
    this.deviceVersionRanges = deviceVersionRanges;
    return this;
  }

  public Audience addDeviceVersionRangesItem(AudienceDeviceVersionRange deviceVersionRangesItem) {
    this.deviceVersionRanges.add(deviceVersionRangesItem);
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Audience categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Audience addCategoriesItem(Category categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get applications
   * @return applications
  **/
  @JsonProperty("applications")
  public List<@Valid Application> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid Application> applications) {
    this.applications = applications;
  }

  public Audience applications(List<@Valid Application> applications) {
    this.applications = applications;
    return this;
  }

  public Audience addApplicationsItem(Application applicationsItem) {
    this.applications.add(applicationsItem);
    return this;
  }

 /**
   * Get radius
   * @return radius
  **/
  @JsonProperty("radius")
  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public Audience radius(Double radius) {
    this.radius = radius;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public List<@Valid AudienceLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid AudienceLocation> locations) {
    this.locations = locations;
  }

  public Audience locations(List<@Valid AudienceLocation> locations) {
    this.locations = locations;
    return this;
  }

  public Audience addLocationsItem(AudienceLocation locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

 /**
   * Get sendSuggestion
   * @return sendSuggestion
  **/
  @JsonProperty("sendSuggestion")
  public Boolean getSendSuggestion() {
    return sendSuggestion;
  }

  public void setSendSuggestion(Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
  }

  public Audience sendSuggestion(Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
    return this;
  }

 /**
   * Get startTimeOffset
   * @return startTimeOffset
  **/
  @JsonProperty("startTimeOffset")
  public Integer getStartTimeOffset() {
    return startTimeOffset;
  }

  public void setStartTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
  }

  public Audience startTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
    return this;
  }

 /**
   * Get endTimeOffset
   * @return endTimeOffset
  **/
  @JsonProperty("endTimeOffset")
  public Integer getEndTimeOffset() {
    return endTimeOffset;
  }

  public void setEndTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
  }

  public Audience endTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
    return this;
  }

 /**
   * Get target
   * @return target
  **/
  @JsonProperty("target")
  public AudienceTargetType getTarget() {
    return target;
  }

  public void setTarget(AudienceTargetType target) {
    this.target = target;
  }

  public Audience target(AudienceTargetType target) {
    this.target = target;
    return this;
  }

 /**
   * Get associateContentName
   * @return associateContentName
  **/
  @JsonProperty("associateContentName")
  public String getAssociateContentName() {
    return associateContentName;
  }

  public void setAssociateContentName(String associateContentName) {
    this.associateContentName = associateContentName;
  }

  public Audience associateContentName(String associateContentName) {
    this.associateContentName = associateContentName;
    return this;
  }

 /**
   * Get polygon
   * @return polygon
  **/
  @JsonProperty("polygon")
  public String getPolygon() {
    return polygon;
  }

  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  public Audience polygon(String polygon) {
    this.polygon = polygon;
    return this;
  }

 /**
   * Get associateType
   * @return associateType
  **/
  @JsonProperty("associateType")
  public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }

  public Audience associateType(String associateType) {
    this.associateType = associateType;
    return this;
  }

 /**
   * Get associateId
   * @return associateId
  **/
  @JsonProperty("associateId")
  public Long getAssociateId() {
    return associateId;
  }

  public void setAssociateId(Long associateId) {
    this.associateId = associateId;
  }

  public Audience associateId(Long associateId) {
    this.associateId = associateId;
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
    Audience audience = (Audience) o;
    return Objects.equals(this.id, audience.id) &&
        Objects.equals(this.active, audience.active) &&
        Objects.equals(this.valid, audience.valid) &&
        Objects.equals(this.latitude, audience.latitude) &&
        Objects.equals(this.longitude, audience.longitude) &&
        Objects.equals(this.locationDescription, audience.locationDescription) &&
        Objects.equals(this.name, audience.name) &&
        Objects.equals(this.display, audience.display) &&
        Objects.equals(this.description, audience.description) &&
        Objects.equals(this.owner, audience.owner) &&
        Objects.equals(this.gender, audience.gender) &&
        Objects.equals(this.ageGroups, audience.ageGroups) &&
        Objects.equals(this.gameExperienceLevel, audience.gameExperienceLevel) &&
        Objects.equals(this.deviceVersionRanges, audience.deviceVersionRanges) &&
        Objects.equals(this.categories, audience.categories) &&
        Objects.equals(this.applications, audience.applications) &&
        Objects.equals(this.radius, audience.radius) &&
        Objects.equals(this.locations, audience.locations) &&
        Objects.equals(this.sendSuggestion, audience.sendSuggestion) &&
        Objects.equals(this.startTimeOffset, audience.startTimeOffset) &&
        Objects.equals(this.endTimeOffset, audience.endTimeOffset) &&
        Objects.equals(this.target, audience.target) &&
        Objects.equals(this.associateContentName, audience.associateContentName) &&
        Objects.equals(this.polygon, audience.polygon) &&
        Objects.equals(this.associateType, audience.associateType) &&
        Objects.equals(this.associateId, audience.associateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, display, description, owner, gender, ageGroups, gameExperienceLevel, deviceVersionRanges, categories, applications, radius, locations, sendSuggestion, startTimeOffset, endTimeOffset, target, associateContentName, polygon, associateType, associateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audience {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    gameExperienceLevel: ").append(toIndentedString(gameExperienceLevel)).append("\n");
    sb.append("    deviceVersionRanges: ").append(toIndentedString(deviceVersionRanges)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    sendSuggestion: ").append(toIndentedString(sendSuggestion)).append("\n");
    sb.append("    startTimeOffset: ").append(toIndentedString(startTimeOffset)).append("\n");
    sb.append("    endTimeOffset: ").append(toIndentedString(endTimeOffset)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    associateContentName: ").append(toIndentedString(associateContentName)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
    sb.append("    associateType: ").append(toIndentedString(associateType)).append("\n");
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
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

