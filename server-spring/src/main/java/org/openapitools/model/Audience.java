package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Audience
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Audience {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable String name;

  private @Nullable Boolean display;

  private @Nullable String description;

  private @Nullable Account owner;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    ANY("ANY");

    private final String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GenderEnum gender;

  /**
   * Gets or Sets ageGroups
   */
  public enum AgeGroupsEnum {
    AGE_0_13("AGE_0_13"),
    
    AGE_14_17("AGE_14_17"),
    
    AGE_18_22("AGE_18_22"),
    
    AGE_23_30("AGE_23_30"),
    
    AGE_31_54("AGE_31_54"),
    
    AGE_55_PLUS("AGE_55_PLUS");

    private final String value;

    AgeGroupsEnum(String value) {
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
    public static AgeGroupsEnum fromValue(String value) {
      for (AgeGroupsEnum b : AgeGroupsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<AgeGroupsEnum> ageGroups = new ArrayList<>();

  /**
   * Gets or Sets gameExperienceLevel
   */
  public enum GameExperienceLevelEnum {
    ANY("ANY"),
    
    NEW("NEW"),
    
    BEGINNER("BEGINNER"),
    
    INTERMEDIATE("INTERMEDIATE"),
    
    EXPERT("EXPERT");

    private final String value;

    GameExperienceLevelEnum(String value) {
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
    public static GameExperienceLevelEnum fromValue(String value) {
      for (GameExperienceLevelEnum b : GameExperienceLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GameExperienceLevelEnum gameExperienceLevel;

  @Valid
  private List<@Valid AudienceDeviceVersionRange> deviceVersionRanges = new ArrayList<>();

  @Valid
  private List<@Valid Category> categories = new ArrayList<>();

  @Valid
  private List<@Valid Application> applications = new ArrayList<>();

  private @Nullable Double radius;

  @Valid
  private List<@Valid AudienceLocation> locations = new ArrayList<>();

  private @Nullable Boolean sendSuggestion;

  private @Nullable Integer startTimeOffset;

  private @Nullable Integer endTimeOffset;

  private @Nullable AudienceTargetType target;

  private @Nullable String associateContentName;

  private @Nullable String polygon;

  private @Nullable String associateType;

  private @Nullable Long associateId;

  public Audience id(@Nullable Long id) {
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

  public Audience active(@Nullable Boolean active) {
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

  public Audience valid(@Nullable Boolean valid) {
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

  public Audience latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public Audience longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public Audience locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Audience name(@Nullable String name) {
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

  public Audience display(@Nullable Boolean display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable Boolean getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable Boolean display) {
    this.display = display;
  }

  public Audience description(@Nullable String description) {
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

  public Audience owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Audience gender(@Nullable GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable GenderEnum getGender() {
    return gender;
  }

  public void setGender(@Nullable GenderEnum gender) {
    this.gender = gender;
  }

  public Audience ageGroups(List<AgeGroupsEnum> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public Audience addAgeGroupsItem(AgeGroupsEnum ageGroupsItem) {
    if (this.ageGroups == null) {
      this.ageGroups = new ArrayList<>();
    }
    this.ageGroups.add(ageGroupsItem);
    return this;
  }

  /**
   * Get ageGroups
   * @return ageGroups
   */
  
  @Schema(name = "ageGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ageGroups")
  public List<AgeGroupsEnum> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<AgeGroupsEnum> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public Audience gameExperienceLevel(@Nullable GameExperienceLevelEnum gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

  /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
   */
  
  @Schema(name = "gameExperienceLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameExperienceLevel")
  public @Nullable GameExperienceLevelEnum getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(@Nullable GameExperienceLevelEnum gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public Audience deviceVersionRanges(List<@Valid AudienceDeviceVersionRange> deviceVersionRanges) {
    this.deviceVersionRanges = deviceVersionRanges;
    return this;
  }

  public Audience addDeviceVersionRangesItem(AudienceDeviceVersionRange deviceVersionRangesItem) {
    if (this.deviceVersionRanges == null) {
      this.deviceVersionRanges = new ArrayList<>();
    }
    this.deviceVersionRanges.add(deviceVersionRangesItem);
    return this;
  }

  /**
   * Get deviceVersionRanges
   * @return deviceVersionRanges
   */
  @Valid 
  @Schema(name = "deviceVersionRanges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceVersionRanges")
  public List<@Valid AudienceDeviceVersionRange> getDeviceVersionRanges() {
    return deviceVersionRanges;
  }

  public void setDeviceVersionRanges(List<@Valid AudienceDeviceVersionRange> deviceVersionRanges) {
    this.deviceVersionRanges = deviceVersionRanges;
  }

  public Audience categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Audience addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Audience applications(List<@Valid Application> applications) {
    this.applications = applications;
    return this;
  }

  public Audience addApplicationsItem(Application applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * Get applications
   * @return applications
   */
  @Valid 
  @Schema(name = "applications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applications")
  public List<@Valid Application> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid Application> applications) {
    this.applications = applications;
  }

  public Audience radius(@Nullable Double radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Get radius
   * @return radius
   */
  
  @Schema(name = "radius", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("radius")
  public @Nullable Double getRadius() {
    return radius;
  }

  public void setRadius(@Nullable Double radius) {
    this.radius = radius;
  }

  public Audience locations(List<@Valid AudienceLocation> locations) {
    this.locations = locations;
    return this;
  }

  public Audience addLocationsItem(AudienceLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
   */
  @Valid 
  @Schema(name = "locations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locations")
  public List<@Valid AudienceLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid AudienceLocation> locations) {
    this.locations = locations;
  }

  public Audience sendSuggestion(@Nullable Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
    return this;
  }

  /**
   * Get sendSuggestion
   * @return sendSuggestion
   */
  
  @Schema(name = "sendSuggestion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sendSuggestion")
  public @Nullable Boolean getSendSuggestion() {
    return sendSuggestion;
  }

  public void setSendSuggestion(@Nullable Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
  }

  public Audience startTimeOffset(@Nullable Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
    return this;
  }

  /**
   * Get startTimeOffset
   * @return startTimeOffset
   */
  
  @Schema(name = "startTimeOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeOffset")
  public @Nullable Integer getStartTimeOffset() {
    return startTimeOffset;
  }

  public void setStartTimeOffset(@Nullable Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
  }

  public Audience endTimeOffset(@Nullable Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
    return this;
  }

  /**
   * Get endTimeOffset
   * @return endTimeOffset
   */
  
  @Schema(name = "endTimeOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTimeOffset")
  public @Nullable Integer getEndTimeOffset() {
    return endTimeOffset;
  }

  public void setEndTimeOffset(@Nullable Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
  }

  public Audience target(@Nullable AudienceTargetType target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public @Nullable AudienceTargetType getTarget() {
    return target;
  }

  public void setTarget(@Nullable AudienceTargetType target) {
    this.target = target;
  }

  public Audience associateContentName(@Nullable String associateContentName) {
    this.associateContentName = associateContentName;
    return this;
  }

  /**
   * Get associateContentName
   * @return associateContentName
   */
  
  @Schema(name = "associateContentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associateContentName")
  public @Nullable String getAssociateContentName() {
    return associateContentName;
  }

  public void setAssociateContentName(@Nullable String associateContentName) {
    this.associateContentName = associateContentName;
  }

  public Audience polygon(@Nullable String polygon) {
    this.polygon = polygon;
    return this;
  }

  /**
   * Get polygon
   * @return polygon
   */
  
  @Schema(name = "polygon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polygon")
  public @Nullable String getPolygon() {
    return polygon;
  }

  public void setPolygon(@Nullable String polygon) {
    this.polygon = polygon;
  }

  public Audience associateType(@Nullable String associateType) {
    this.associateType = associateType;
    return this;
  }

  /**
   * Get associateType
   * @return associateType
   */
  
  @Schema(name = "associateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associateType")
  public @Nullable String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(@Nullable String associateType) {
    this.associateType = associateType;
  }

  public Audience associateId(@Nullable Long associateId) {
    this.associateId = associateId;
    return this;
  }

  /**
   * Get associateId
   * @return associateId
   */
  
  @Schema(name = "associateId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associateId")
  public @Nullable Long getAssociateId() {
    return associateId;
  }

  public void setAssociateId(@Nullable Long associateId) {
    this.associateId = associateId;
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

