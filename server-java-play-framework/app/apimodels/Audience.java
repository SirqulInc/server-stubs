package apimodels;

import apimodels.Account;
import apimodels.Application;
import apimodels.AudienceDeviceVersionRange;
import apimodels.AudienceLocation;
import apimodels.AudienceTargetType;
import apimodels.Category;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Audience
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Audience   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("display")
  
  private Boolean display;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("owner")
  @Valid

  private Account owner;

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

  @JsonProperty("gender")
  
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

    private final String value;

    AgeGroupsEnum(String value) {
      this.value = value;
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

  @JsonProperty("ageGroups")
  
  private List<AgeGroupsEnum> ageGroups = null;

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

  @JsonProperty("gameExperienceLevel")
  
  private GameExperienceLevelEnum gameExperienceLevel;

  @JsonProperty("deviceVersionRanges")
  @Valid

  private List<@Valid AudienceDeviceVersionRange> deviceVersionRanges = null;

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("applications")
  @Valid

  private List<@Valid Application> applications = null;

  @JsonProperty("radius")
  
  private Double radius;

  @JsonProperty("locations")
  @Valid

  private List<@Valid AudienceLocation> locations = null;

  @JsonProperty("sendSuggestion")
  
  private Boolean sendSuggestion;

  @JsonProperty("startTimeOffset")
  
  private Integer startTimeOffset;

  @JsonProperty("endTimeOffset")
  
  private Integer endTimeOffset;

  @JsonProperty("target")
  @Valid

  private AudienceTargetType target;

  @JsonProperty("associateContentName")
  
  private String associateContentName;

  @JsonProperty("polygon")
  
  private String polygon;

  @JsonProperty("associateType")
  
  private String associateType;

  @JsonProperty("associateId")
  
  private Long associateId;

  public Audience id(Long id) {
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

  public Audience active(Boolean active) {
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

  public Audience valid(Boolean valid) {
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

  public Audience latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Audience longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Audience locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Audience name(String name) {
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

  public Audience display(Boolean display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public Boolean getDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public Audience description(String description) {
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

  public Audience owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Audience gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
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
  **/
  public List<AgeGroupsEnum> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<AgeGroupsEnum> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public Audience gameExperienceLevel(GameExperienceLevelEnum gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

   /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
  **/
  public GameExperienceLevelEnum getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(GameExperienceLevelEnum gameExperienceLevel) {
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
  **/
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
  **/
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
  **/
  public List<@Valid Application> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid Application> applications) {
    this.applications = applications;
  }

  public Audience radius(Double radius) {
    this.radius = radius;
    return this;
  }

   /**
   * Get radius
   * @return radius
  **/
  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
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
  **/
  public List<@Valid AudienceLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid AudienceLocation> locations) {
    this.locations = locations;
  }

  public Audience sendSuggestion(Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
    return this;
  }

   /**
   * Get sendSuggestion
   * @return sendSuggestion
  **/
  public Boolean getSendSuggestion() {
    return sendSuggestion;
  }

  public void setSendSuggestion(Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
  }

  public Audience startTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
    return this;
  }

   /**
   * Get startTimeOffset
   * @return startTimeOffset
  **/
  public Integer getStartTimeOffset() {
    return startTimeOffset;
  }

  public void setStartTimeOffset(Integer startTimeOffset) {
    this.startTimeOffset = startTimeOffset;
  }

  public Audience endTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
    return this;
  }

   /**
   * Get endTimeOffset
   * @return endTimeOffset
  **/
  public Integer getEndTimeOffset() {
    return endTimeOffset;
  }

  public void setEndTimeOffset(Integer endTimeOffset) {
    this.endTimeOffset = endTimeOffset;
  }

  public Audience target(AudienceTargetType target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  public AudienceTargetType getTarget() {
    return target;
  }

  public void setTarget(AudienceTargetType target) {
    this.target = target;
  }

  public Audience associateContentName(String associateContentName) {
    this.associateContentName = associateContentName;
    return this;
  }

   /**
   * Get associateContentName
   * @return associateContentName
  **/
  public String getAssociateContentName() {
    return associateContentName;
  }

  public void setAssociateContentName(String associateContentName) {
    this.associateContentName = associateContentName;
  }

  public Audience polygon(String polygon) {
    this.polygon = polygon;
    return this;
  }

   /**
   * Get polygon
   * @return polygon
  **/
  public String getPolygon() {
    return polygon;
  }

  public void setPolygon(String polygon) {
    this.polygon = polygon;
  }

  public Audience associateType(String associateType) {
    this.associateType = associateType;
    return this;
  }

   /**
   * Get associateType
   * @return associateType
  **/
  public String getAssociateType() {
    return associateType;
  }

  public void setAssociateType(String associateType) {
    this.associateType = associateType;
  }

  public Audience associateId(Long associateId) {
    this.associateId = associateId;
    return this;
  }

   /**
   * Get associateId
   * @return associateId
  **/
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
    return Objects.equals(id, audience.id) &&
        Objects.equals(active, audience.active) &&
        Objects.equals(valid, audience.valid) &&
        Objects.equals(latitude, audience.latitude) &&
        Objects.equals(longitude, audience.longitude) &&
        Objects.equals(locationDescription, audience.locationDescription) &&
        Objects.equals(name, audience.name) &&
        Objects.equals(display, audience.display) &&
        Objects.equals(description, audience.description) &&
        Objects.equals(owner, audience.owner) &&
        Objects.equals(gender, audience.gender) &&
        Objects.equals(ageGroups, audience.ageGroups) &&
        Objects.equals(gameExperienceLevel, audience.gameExperienceLevel) &&
        Objects.equals(deviceVersionRanges, audience.deviceVersionRanges) &&
        Objects.equals(categories, audience.categories) &&
        Objects.equals(applications, audience.applications) &&
        Objects.equals(radius, audience.radius) &&
        Objects.equals(locations, audience.locations) &&
        Objects.equals(sendSuggestion, audience.sendSuggestion) &&
        Objects.equals(startTimeOffset, audience.startTimeOffset) &&
        Objects.equals(endTimeOffset, audience.endTimeOffset) &&
        Objects.equals(target, audience.target) &&
        Objects.equals(associateContentName, audience.associateContentName) &&
        Objects.equals(polygon, audience.polygon) &&
        Objects.equals(associateType, audience.associateType) &&
        Objects.equals(associateId, audience.associateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, display, description, owner, gender, ageGroups, gameExperienceLevel, deviceVersionRanges, categories, applications, radius, locations, sendSuggestion, startTimeOffset, endTimeOffset, target, associateContentName, polygon, associateType, associateId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

