package apimodels;

import apimodels.AgeGroupResponse;
import apimodels.ApplicationShortResponse;
import apimodels.AudienceDeviceResponse;
import apimodels.CategoryResponse;
import apimodels.GeocodeLatLngResponse;
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
 * AudienceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("radius")
  
  private Double radius;

  @JsonProperty("sendSuggestion")
  
  private Boolean sendSuggestion;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("searchTags")
  
  private String searchTags;

  @JsonProperty("ownerId")
  
  private Long ownerId;

  @JsonProperty("gender")
  
  private String gender;

  @JsonProperty("ageGroups")
  @Valid

  private List<@Valid AgeGroupResponse> ageGroups = null;

  @JsonProperty("categories")
  @Valid

  private List<@Valid CategoryResponse> categories = null;

  @JsonProperty("applications")
  @Valid

  private List<@Valid ApplicationShortResponse> applications = null;

  @JsonProperty("devices")
  @Valid

  private List<@Valid AudienceDeviceResponse> devices = null;

  @JsonProperty("gameExperienceLevel")
  
  private String gameExperienceLevel;

  @JsonProperty("locations")
  @Valid

  private List<@Valid GeocodeLatLngResponse> locations = null;

  @JsonProperty("associateType")
  
  private String associateType;

  @JsonProperty("associateId")
  
  private Long associateId;

  @JsonProperty("associateDescription")
  
  private String associateDescription;

  public AudienceResponse id(Long id) {
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

  public AudienceResponse name(String name) {
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

  public AudienceResponse latitude(Double latitude) {
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

  public AudienceResponse longitude(Double longitude) {
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

  public AudienceResponse radius(Double radius) {
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

  public AudienceResponse sendSuggestion(Boolean sendSuggestion) {
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

  public AudienceResponse description(String description) {
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

  public AudienceResponse active(Boolean active) {
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

  public AudienceResponse searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

   /**
   * Get searchTags
   * @return searchTags
  **/
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public AudienceResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public AudienceResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public AudienceResponse ageGroups(List<@Valid AgeGroupResponse> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public AudienceResponse addAgeGroupsItem(AgeGroupResponse ageGroupsItem) {
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
  public List<@Valid AgeGroupResponse> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<@Valid AgeGroupResponse> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public AudienceResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceResponse addCategoriesItem(CategoryResponse categoriesItem) {
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
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public AudienceResponse applications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
    return this;
  }

  public AudienceResponse addApplicationsItem(ApplicationShortResponse applicationsItem) {
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
  public List<@Valid ApplicationShortResponse> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
  }

  public AudienceResponse devices(List<@Valid AudienceDeviceResponse> devices) {
    this.devices = devices;
    return this;
  }

  public AudienceResponse addDevicesItem(AudienceDeviceResponse devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  public List<@Valid AudienceDeviceResponse> getDevices() {
    return devices;
  }

  public void setDevices(List<@Valid AudienceDeviceResponse> devices) {
    this.devices = devices;
  }

  public AudienceResponse gameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

   /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
  **/
  public String getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public AudienceResponse locations(List<@Valid GeocodeLatLngResponse> locations) {
    this.locations = locations;
    return this;
  }

  public AudienceResponse addLocationsItem(GeocodeLatLngResponse locationsItem) {
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
  public List<@Valid GeocodeLatLngResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid GeocodeLatLngResponse> locations) {
    this.locations = locations;
  }

  public AudienceResponse associateType(String associateType) {
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

  public AudienceResponse associateId(Long associateId) {
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

  public AudienceResponse associateDescription(String associateDescription) {
    this.associateDescription = associateDescription;
    return this;
  }

   /**
   * Get associateDescription
   * @return associateDescription
  **/
  public String getAssociateDescription() {
    return associateDescription;
  }

  public void setAssociateDescription(String associateDescription) {
    this.associateDescription = associateDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceResponse audienceResponse = (AudienceResponse) o;
    return Objects.equals(id, audienceResponse.id) &&
        Objects.equals(name, audienceResponse.name) &&
        Objects.equals(latitude, audienceResponse.latitude) &&
        Objects.equals(longitude, audienceResponse.longitude) &&
        Objects.equals(radius, audienceResponse.radius) &&
        Objects.equals(sendSuggestion, audienceResponse.sendSuggestion) &&
        Objects.equals(description, audienceResponse.description) &&
        Objects.equals(active, audienceResponse.active) &&
        Objects.equals(searchTags, audienceResponse.searchTags) &&
        Objects.equals(ownerId, audienceResponse.ownerId) &&
        Objects.equals(gender, audienceResponse.gender) &&
        Objects.equals(ageGroups, audienceResponse.ageGroups) &&
        Objects.equals(categories, audienceResponse.categories) &&
        Objects.equals(applications, audienceResponse.applications) &&
        Objects.equals(devices, audienceResponse.devices) &&
        Objects.equals(gameExperienceLevel, audienceResponse.gameExperienceLevel) &&
        Objects.equals(locations, audienceResponse.locations) &&
        Objects.equals(associateType, audienceResponse.associateType) &&
        Objects.equals(associateId, audienceResponse.associateId) &&
        Objects.equals(associateDescription, audienceResponse.associateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, latitude, longitude, radius, sendSuggestion, description, active, searchTags, ownerId, gender, ageGroups, categories, applications, devices, gameExperienceLevel, locations, associateType, associateId, associateDescription);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    sendSuggestion: ").append(toIndentedString(sendSuggestion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ageGroups: ").append(toIndentedString(ageGroups)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    gameExperienceLevel: ").append(toIndentedString(gameExperienceLevel)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    associateType: ").append(toIndentedString(associateType)).append("\n");
    sb.append("    associateId: ").append(toIndentedString(associateId)).append("\n");
    sb.append("    associateDescription: ").append(toIndentedString(associateDescription)).append("\n");
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

