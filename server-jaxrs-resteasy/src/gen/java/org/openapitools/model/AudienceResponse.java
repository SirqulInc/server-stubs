package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceResponse   {
  
  private Long id;
  private String name;
  private Double latitude;
  private Double longitude;
  private Double radius;
  private Boolean sendSuggestion;
  private String description;
  private Boolean active;
  private String searchTags;
  private Long ownerId;
  private String gender;
  private List<@Valid AgeGroupResponse> ageGroups = new ArrayList<>();
  private List<@Valid CategoryResponse> categories = new ArrayList<>();
  private List<@Valid ApplicationShortResponse> applications = new ArrayList<>();
  private List<@Valid AudienceDeviceResponse> devices = new ArrayList<>();
  private String gameExperienceLevel;
  private List<@Valid GeocodeLatLngResponse> locations = new ArrayList<>();
  private String associateType;
  private Long associateId;
  private String associateDescription;

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
  @JsonProperty("searchTags")
  public String getSearchTags() {
    return searchTags;
  }
  public void setSearchTags(String searchTags) {
    this.searchTags = searchTags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerId")
  public Long getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ageGroups")
  @Valid
  public List<@Valid AgeGroupResponse> getAgeGroups() {
    return ageGroups;
  }
  public void setAgeGroups(List<@Valid AgeGroupResponse> ageGroups) {
    this.ageGroups = ageGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applications")
  @Valid
  public List<@Valid ApplicationShortResponse> getApplications() {
    return applications;
  }
  public void setApplications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("devices")
  @Valid
  public List<@Valid AudienceDeviceResponse> getDevices() {
    return devices;
  }
  public void setDevices(List<@Valid AudienceDeviceResponse> devices) {
    this.devices = devices;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameExperienceLevel")
  public String getGameExperienceLevel() {
    return gameExperienceLevel;
  }
  public void setGameExperienceLevel(String gameExperienceLevel) {
    this.gameExperienceLevel = gameExperienceLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locations")
  @Valid
  public List<@Valid GeocodeLatLngResponse> getLocations() {
    return locations;
  }
  public void setLocations(List<@Valid GeocodeLatLngResponse> locations) {
    this.locations = locations;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("associateDescription")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

