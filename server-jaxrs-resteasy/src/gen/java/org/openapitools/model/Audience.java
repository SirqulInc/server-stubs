package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Audience   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private String name;
  private Boolean display;
  private String description;
  private Account owner;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),

        FEMALE("FEMALE"),

        ANY("ANY");
    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GenderEnum gender;

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
    private String value;

    AgeGroupsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

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
    private String value;

    GameExperienceLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GameExperienceLevelEnum gameExperienceLevel;
  private List<@Valid AudienceDeviceVersionRange> deviceVersionRanges = new ArrayList<>();
  private List<@Valid Category> categories = new ArrayList<>();
  private List<@Valid Application> applications = new ArrayList<>();
  private Double radius;
  private List<@Valid AudienceLocation> locations = new ArrayList<>();
  private Boolean sendSuggestion;
  private Integer startTimeOffset;
  private Integer endTimeOffset;
  private AudienceTargetType target;
  private String associateContentName;
  private String polygon;
  private String associateType;
  private Long associateId;

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
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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
  @JsonProperty("display")
  public Boolean getDisplay() {
    return display;
  }
  public void setDisplay(Boolean display) {
    this.display = display;
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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ageGroups")
  public List<AgeGroupsEnum> getAgeGroups() {
    return ageGroups;
  }
  public void setAgeGroups(List<AgeGroupsEnum> ageGroups) {
    this.ageGroups = ageGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameExperienceLevel")
  public GameExperienceLevelEnum getGameExperienceLevel() {
    return gameExperienceLevel;
  }
  public void setGameExperienceLevel(GameExperienceLevelEnum gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceVersionRanges")
  @Valid
  public List<@Valid AudienceDeviceVersionRange> getDeviceVersionRanges() {
    return deviceVersionRanges;
  }
  public void setDeviceVersionRanges(List<@Valid AudienceDeviceVersionRange> deviceVersionRanges) {
    this.deviceVersionRanges = deviceVersionRanges;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid Category> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applications")
  @Valid
  public List<@Valid Application> getApplications() {
    return applications;
  }
  public void setApplications(List<@Valid Application> applications) {
    this.applications = applications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("radius")
  public Double getRadius() {
    return radius;
  }
  public void setRadius(Double radius) {
    this.radius = radius;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  @Valid
  public List<@Valid AudienceLocation> getLocations() {
    return locations;
  }
  public void setLocations(List<@Valid AudienceLocation> locations) {
    this.locations = locations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sendSuggestion")
  public Boolean getSendSuggestion() {
    return sendSuggestion;
  }
  public void setSendSuggestion(Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeOffset")
  public Integer getStartTimeOffset() {
    return startTimeOffset;
  }
  public void setStartTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endTimeOffset")
  public Integer getEndTimeOffset() {
    return endTimeOffset;
  }
  public void setEndTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("target")
  @Valid
  public AudienceTargetType getTarget() {
    return target;
  }
  public void setTarget(AudienceTargetType target) {
    this.target = target;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("associateContentName")
  public String getAssociateContentName() {
    return associateContentName;
  }
  public void setAssociateContentName(String associateContentName) {
    this.associateContentName = associateContentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("polygon")
  public String getPolygon() {
    return polygon;
  }
  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("associateType")
  public String getAssociateType() {
    return associateType;
  }
  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("associateId")
  public Long getAssociateId() {
    return associateId;
  }
  public void setAssociateId(Long associateId) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

