package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.GeocodeLatLngResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AudienceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceResponse {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable Double radius;

  private @Nullable Boolean sendSuggestion;

  private @Nullable String description;

  private @Nullable Boolean active;

  private @Nullable String searchTags;

  private @Nullable Long ownerId;

  private @Nullable String gender;

  @Valid
  private List<@Valid AgeGroupResponse> ageGroups = new ArrayList<>();

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @Valid
  private List<@Valid ApplicationShortResponse> applications = new ArrayList<>();

  @Valid
  private List<@Valid AudienceDeviceResponse> devices = new ArrayList<>();

  private @Nullable String gameExperienceLevel;

  @Valid
  private List<@Valid GeocodeLatLngResponse> locations = new ArrayList<>();

  private @Nullable String associateType;

  private @Nullable Long associateId;

  private @Nullable String associateDescription;

  public AudienceResponse id(@Nullable Long id) {
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

  public AudienceResponse name(@Nullable String name) {
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

  public AudienceResponse latitude(@Nullable Double latitude) {
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

  public AudienceResponse longitude(@Nullable Double longitude) {
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

  public AudienceResponse radius(@Nullable Double radius) {
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

  public AudienceResponse sendSuggestion(@Nullable Boolean sendSuggestion) {
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

  public AudienceResponse description(@Nullable String description) {
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

  public AudienceResponse active(@Nullable Boolean active) {
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

  public AudienceResponse searchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
    return this;
  }

  /**
   * Get searchTags
   * @return searchTags
   */
  
  @Schema(name = "searchTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchTags")
  public @Nullable String getSearchTags() {
    return searchTags;
  }

  public void setSearchTags(@Nullable String searchTags) {
    this.searchTags = searchTags;
  }

  public AudienceResponse ownerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   */
  
  @Schema(name = "ownerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public @Nullable Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(@Nullable Long ownerId) {
    this.ownerId = ownerId;
  }

  public AudienceResponse gender(@Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable String getGender() {
    return gender;
  }

  public void setGender(@Nullable String gender) {
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
   */
  @Valid 
  @Schema(name = "ageGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ageGroups")
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
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
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
   */
  @Valid 
  @Schema(name = "applications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applications")
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
   */
  @Valid 
  @Schema(name = "devices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("devices")
  public List<@Valid AudienceDeviceResponse> getDevices() {
    return devices;
  }

  public void setDevices(List<@Valid AudienceDeviceResponse> devices) {
    this.devices = devices;
  }

  public AudienceResponse gameExperienceLevel(@Nullable String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
    return this;
  }

  /**
   * Get gameExperienceLevel
   * @return gameExperienceLevel
   */
  
  @Schema(name = "gameExperienceLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameExperienceLevel")
  public @Nullable String getGameExperienceLevel() {
    return gameExperienceLevel;
  }

  public void setGameExperienceLevel(@Nullable String gameExperienceLevel) {
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
   */
  @Valid 
  @Schema(name = "locations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locations")
  public List<@Valid GeocodeLatLngResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid GeocodeLatLngResponse> locations) {
    this.locations = locations;
  }

  public AudienceResponse associateType(@Nullable String associateType) {
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

  public AudienceResponse associateId(@Nullable Long associateId) {
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

  public AudienceResponse associateDescription(@Nullable String associateDescription) {
    this.associateDescription = associateDescription;
    return this;
  }

  /**
   * Get associateDescription
   * @return associateDescription
   */
  
  @Schema(name = "associateDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associateDescription")
  public @Nullable String getAssociateDescription() {
    return associateDescription;
  }

  public void setAssociateDescription(@Nullable String associateDescription) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

