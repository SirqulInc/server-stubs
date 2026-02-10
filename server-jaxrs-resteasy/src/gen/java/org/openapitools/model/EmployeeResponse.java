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
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.ContactResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EmployeeResponse   {
  
  private Long accountId;
  private String locationDisplay;
  private String display;
  private String username;
  private String accountType;
  private String profileImage;

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
  private String contactEmail;
  private ContactResponse contact;
  private AccountMiniResponse manager;
  private Boolean active;
  private List<@Valid RetailerLocationShortResponse> locations = new ArrayList<>();
  private Boolean hasDelegateAccess;
  private Double latitude;
  private Double longitude;
  private Long locationLastUpdated;
  private Integer locationCount;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }
  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
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
  @JsonProperty("contactEmail")
  public String getContactEmail() {
    return contactEmail;
  }
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contact")
  @Valid
  public ContactResponse getContact() {
    return contact;
  }
  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("manager")
  @Valid
  public AccountMiniResponse getManager() {
    return manager;
  }
  public void setManager(AccountMiniResponse manager) {
    this.manager = manager;
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
  @JsonProperty("locations")
  @Valid
  public List<@Valid RetailerLocationShortResponse> getLocations() {
    return locations;
  }
  public void setLocations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasDelegateAccess")
  public Boolean getHasDelegateAccess() {
    return hasDelegateAccess;
  }
  public void setHasDelegateAccess(Boolean hasDelegateAccess) {
    this.hasDelegateAccess = hasDelegateAccess;
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
  @JsonProperty("locationLastUpdated")
  public Long getLocationLastUpdated() {
    return locationLastUpdated;
  }
  public void setLocationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationCount")
  public Integer getLocationCount() {
    return locationCount;
  }
  public void setLocationCount(Integer locationCount) {
    this.locationCount = locationCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeResponse employeeResponse = (EmployeeResponse) o;
    return Objects.equals(this.accountId, employeeResponse.accountId) &&
        Objects.equals(this.locationDisplay, employeeResponse.locationDisplay) &&
        Objects.equals(this.display, employeeResponse.display) &&
        Objects.equals(this.username, employeeResponse.username) &&
        Objects.equals(this.accountType, employeeResponse.accountType) &&
        Objects.equals(this.profileImage, employeeResponse.profileImage) &&
        Objects.equals(this.gender, employeeResponse.gender) &&
        Objects.equals(this.contactEmail, employeeResponse.contactEmail) &&
        Objects.equals(this.contact, employeeResponse.contact) &&
        Objects.equals(this.manager, employeeResponse.manager) &&
        Objects.equals(this.active, employeeResponse.active) &&
        Objects.equals(this.locations, employeeResponse.locations) &&
        Objects.equals(this.hasDelegateAccess, employeeResponse.hasDelegateAccess) &&
        Objects.equals(this.latitude, employeeResponse.latitude) &&
        Objects.equals(this.longitude, employeeResponse.longitude) &&
        Objects.equals(this.locationLastUpdated, employeeResponse.locationLastUpdated) &&
        Objects.equals(this.locationCount, employeeResponse.locationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, locationDisplay, display, username, accountType, profileImage, gender, contactEmail, contact, manager, active, locations, hasDelegateAccess, latitude, longitude, locationLastUpdated, locationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    hasDelegateAccess: ").append(toIndentedString(hasDelegateAccess)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationLastUpdated: ").append(toIndentedString(locationLastUpdated)).append("\n");
    sb.append("    locationCount: ").append(toIndentedString(locationCount)).append("\n");
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

