package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.ContactResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EmployeeResponse  {
  
  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  private String locationDisplay;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String accountType;

  @ApiModelProperty(value = "")

  private String profileImage;

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

  @ApiModelProperty(value = "")

  private String contactEmail;

  @ApiModelProperty(value = "")

  @Valid

  private ContactResponse contact;

  @ApiModelProperty(value = "")

  @Valid

  private AccountMiniResponse manager;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RetailerLocationShortResponse> locations = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean hasDelegateAccess;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Long locationLastUpdated;

  @ApiModelProperty(value = "")

  private Integer locationCount;
 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public EmployeeResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  @JsonProperty("locationDisplay")
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public EmployeeResponse locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public EmployeeResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public EmployeeResponse username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get accountType
   * @return accountType
  **/
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public EmployeeResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get profileImage
   * @return profileImage
  **/
  @JsonProperty("profileImage")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public EmployeeResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
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

  public EmployeeResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get contactEmail
   * @return contactEmail
  **/
  @JsonProperty("contactEmail")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public EmployeeResponse contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public ContactResponse getContact() {
    return contact;
  }

  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  public EmployeeResponse contact(ContactResponse contact) {
    this.contact = contact;
    return this;
  }

 /**
   * Get manager
   * @return manager
  **/
  @JsonProperty("manager")
  public AccountMiniResponse getManager() {
    return manager;
  }

  public void setManager(AccountMiniResponse manager) {
    this.manager = manager;
  }

  public EmployeeResponse manager(AccountMiniResponse manager) {
    this.manager = manager;
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

  public EmployeeResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public List<@Valid RetailerLocationShortResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
  }

  public EmployeeResponse locations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
    return this;
  }

  public EmployeeResponse addLocationsItem(RetailerLocationShortResponse locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

 /**
   * Get hasDelegateAccess
   * @return hasDelegateAccess
  **/
  @JsonProperty("hasDelegateAccess")
  public Boolean getHasDelegateAccess() {
    return hasDelegateAccess;
  }

  public void setHasDelegateAccess(Boolean hasDelegateAccess) {
    this.hasDelegateAccess = hasDelegateAccess;
  }

  public EmployeeResponse hasDelegateAccess(Boolean hasDelegateAccess) {
    this.hasDelegateAccess = hasDelegateAccess;
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

  public EmployeeResponse latitude(Double latitude) {
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

  public EmployeeResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get locationLastUpdated
   * @return locationLastUpdated
  **/
  @JsonProperty("locationLastUpdated")
  public Long getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public EmployeeResponse locationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

 /**
   * Get locationCount
   * @return locationCount
  **/
  @JsonProperty("locationCount")
  public Integer getLocationCount() {
    return locationCount;
  }

  public void setLocationCount(Integer locationCount) {
    this.locationCount = locationCount;
  }

  public EmployeeResponse locationCount(Integer locationCount) {
    this.locationCount = locationCount;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

