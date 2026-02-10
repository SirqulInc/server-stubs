package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.GeocodeLatLngResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Double radius;

  @ApiModelProperty(value = "")

  private Boolean sendSuggestion;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String searchTags;

  @ApiModelProperty(value = "")

  private Long ownerId;

  @ApiModelProperty(value = "")

  private String gender;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AgeGroupResponse> ageGroups = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ApplicationShortResponse> applications = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AudienceDeviceResponse> devices = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String gameExperienceLevel;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid GeocodeLatLngResponse> locations = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String associateType;

  @ApiModelProperty(value = "")

  private Long associateId;

  @ApiModelProperty(value = "")

  private String associateDescription;
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

  public AudienceResponse id(Long id) {
    this.id = id;
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

  public AudienceResponse name(String name) {
    this.name = name;
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

  public AudienceResponse latitude(Double latitude) {
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

  public AudienceResponse longitude(Double longitude) {
    this.longitude = longitude;
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

  public AudienceResponse radius(Double radius) {
    this.radius = radius;
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

  public AudienceResponse sendSuggestion(Boolean sendSuggestion) {
    this.sendSuggestion = sendSuggestion;
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

  public AudienceResponse description(String description) {
    this.description = description;
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

  public AudienceResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get searchTags
   * @return searchTags
  **/
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  public AudienceResponse searchTags(String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

 /**
   * Get ownerId
   * @return ownerId
  **/
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public AudienceResponse ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public AudienceResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get ageGroups
   * @return ageGroups
  **/
  @JsonProperty("ageGroups")
  public List<@Valid AgeGroupResponse> getAgeGroups() {
    return ageGroups;
  }

  public void setAgeGroups(List<@Valid AgeGroupResponse> ageGroups) {
    this.ageGroups = ageGroups;
  }

  public AudienceResponse ageGroups(List<@Valid AgeGroupResponse> ageGroups) {
    this.ageGroups = ageGroups;
    return this;
  }

  public AudienceResponse addAgeGroupsItem(AgeGroupResponse ageGroupsItem) {
    this.ageGroups.add(ageGroupsItem);
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public AudienceResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceResponse addCategoriesItem(CategoryResponse categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get applications
   * @return applications
  **/
  @JsonProperty("applications")
  public List<@Valid ApplicationShortResponse> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
  }

  public AudienceResponse applications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
    return this;
  }

  public AudienceResponse addApplicationsItem(ApplicationShortResponse applicationsItem) {
    this.applications.add(applicationsItem);
    return this;
  }

 /**
   * Get devices
   * @return devices
  **/
  @JsonProperty("devices")
  public List<@Valid AudienceDeviceResponse> getDevices() {
    return devices;
  }

  public void setDevices(List<@Valid AudienceDeviceResponse> devices) {
    this.devices = devices;
  }

  public AudienceResponse devices(List<@Valid AudienceDeviceResponse> devices) {
    this.devices = devices;
    return this;
  }

  public AudienceResponse addDevicesItem(AudienceDeviceResponse devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

 /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
  **/
  @JsonProperty("gameExperienceLevel")
  public String getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  public AudienceResponse gameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public List<@Valid GeocodeLatLngResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid GeocodeLatLngResponse> locations) {
    this.locations = locations;
  }

  public AudienceResponse locations(List<@Valid GeocodeLatLngResponse> locations) {
    this.locations = locations;
    return this;
  }

  public AudienceResponse addLocationsItem(GeocodeLatLngResponse locationsItem) {
    this.locations.add(locationsItem);
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

  public AudienceResponse associateType(String associateType) {
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

  public AudienceResponse associateId(Long associateId) {
    this.associateId = associateId;
    return this;
  }

 /**
   * Get associateDescription
   * @return associateDescription
  **/
  @JsonProperty("associateDescription")
  public String getAssociateDescription() {
    return associateDescription;
  }

  public void setAssociateDescription(String associateDescription) {
    this.associateDescription = associateDescription;
  }

  public AudienceResponse associateDescription(String associateDescription) {
    this.associateDescription = associateDescription;
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
    AudienceResponse audienceResponse = (AudienceResponse) o;
    return Objects.equals(this.id, audienceResponse.id) &&
        Objects.equals(this.name, audienceResponse.name) &&
        Objects.equals(this.latitude, audienceResponse.latitude) &&
        Objects.equals(this.longitude, audienceResponse.longitude) &&
        Objects.equals(this.radius, audienceResponse.radius) &&
        Objects.equals(this.sendSuggestion, audienceResponse.sendSuggestion) &&
        Objects.equals(this.description, audienceResponse.description) &&
        Objects.equals(this.active, audienceResponse.active) &&
        Objects.equals(this.searchTags, audienceResponse.searchTags) &&
        Objects.equals(this.ownerId, audienceResponse.ownerId) &&
        Objects.equals(this.gender, audienceResponse.gender) &&
        Objects.equals(this.ageGroups, audienceResponse.ageGroups) &&
        Objects.equals(this.categories, audienceResponse.categories) &&
        Objects.equals(this.applications, audienceResponse.applications) &&
        Objects.equals(this.devices, audienceResponse.devices) &&
        Objects.equals(this.gameExperienceLevel, audienceResponse.gameExperienceLevel) &&
        Objects.equals(this.locations, audienceResponse.locations) &&
        Objects.equals(this.associateType, audienceResponse.associateType) &&
        Objects.equals(this.associateId, audienceResponse.associateId) &&
        Objects.equals(this.associateDescription, audienceResponse.associateDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, latitude, longitude, radius, sendSuggestion, description, active, searchTags, ownerId, gender, ageGroups, categories, applications, devices, gameExperienceLevel, locations, associateType, associateId, associateDescription);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

