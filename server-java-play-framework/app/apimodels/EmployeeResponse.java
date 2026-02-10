package apimodels;

import apimodels.AccountMiniResponse;
import apimodels.ContactResponse;
import apimodels.RetailerLocationShortResponse;
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
 * EmployeeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EmployeeResponse   {
  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("locationDisplay")
  
  private String locationDisplay;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("accountType")
  
  private String accountType;

  @JsonProperty("profileImage")
  
  private String profileImage;

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

  @JsonProperty("contactEmail")
  
  private String contactEmail;

  @JsonProperty("contact")
  @Valid

  private ContactResponse contact;

  @JsonProperty("manager")
  @Valid

  private AccountMiniResponse manager;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("locations")
  @Valid

  private List<@Valid RetailerLocationShortResponse> locations = null;

  @JsonProperty("hasDelegateAccess")
  
  private Boolean hasDelegateAccess;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("locationLastUpdated")
  
  private Long locationLastUpdated;

  @JsonProperty("locationCount")
  
  private Integer locationCount;

  public EmployeeResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public EmployeeResponse locationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

   /**
   * Get locationDisplay
   * @return locationDisplay
  **/
  public String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public EmployeeResponse display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public EmployeeResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public EmployeeResponse accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public EmployeeResponse profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public EmployeeResponse gender(GenderEnum gender) {
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

  public EmployeeResponse contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public EmployeeResponse contact(ContactResponse contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public ContactResponse getContact() {
    return contact;
  }

  public void setContact(ContactResponse contact) {
    this.contact = contact;
  }

  public EmployeeResponse manager(AccountMiniResponse manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  public AccountMiniResponse getManager() {
    return manager;
  }

  public void setManager(AccountMiniResponse manager) {
    this.manager = manager;
  }

  public EmployeeResponse active(Boolean active) {
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

  public EmployeeResponse locations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
    return this;
  }

  public EmployeeResponse addLocationsItem(RetailerLocationShortResponse locationsItem) {
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
  public List<@Valid RetailerLocationShortResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
  }

  public EmployeeResponse hasDelegateAccess(Boolean hasDelegateAccess) {
    this.hasDelegateAccess = hasDelegateAccess;
    return this;
  }

   /**
   * Get hasDelegateAccess
   * @return hasDelegateAccess
  **/
  public Boolean getHasDelegateAccess() {
    return hasDelegateAccess;
  }

  public void setHasDelegateAccess(Boolean hasDelegateAccess) {
    this.hasDelegateAccess = hasDelegateAccess;
  }

  public EmployeeResponse latitude(Double latitude) {
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

  public EmployeeResponse longitude(Double longitude) {
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

  public EmployeeResponse locationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

   /**
   * Get locationLastUpdated
   * @return locationLastUpdated
  **/
  public Long getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(Long locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public EmployeeResponse locationCount(Integer locationCount) {
    this.locationCount = locationCount;
    return this;
  }

   /**
   * Get locationCount
   * @return locationCount
  **/
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
    return Objects.equals(accountId, employeeResponse.accountId) &&
        Objects.equals(locationDisplay, employeeResponse.locationDisplay) &&
        Objects.equals(display, employeeResponse.display) &&
        Objects.equals(username, employeeResponse.username) &&
        Objects.equals(accountType, employeeResponse.accountType) &&
        Objects.equals(profileImage, employeeResponse.profileImage) &&
        Objects.equals(gender, employeeResponse.gender) &&
        Objects.equals(contactEmail, employeeResponse.contactEmail) &&
        Objects.equals(contact, employeeResponse.contact) &&
        Objects.equals(manager, employeeResponse.manager) &&
        Objects.equals(active, employeeResponse.active) &&
        Objects.equals(locations, employeeResponse.locations) &&
        Objects.equals(hasDelegateAccess, employeeResponse.hasDelegateAccess) &&
        Objects.equals(latitude, employeeResponse.latitude) &&
        Objects.equals(longitude, employeeResponse.longitude) &&
        Objects.equals(locationLastUpdated, employeeResponse.locationLastUpdated) &&
        Objects.equals(locationCount, employeeResponse.locationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, locationDisplay, display, username, accountType, profileImage, gender, contactEmail, contact, manager, active, locations, hasDelegateAccess, latitude, longitude, locationLastUpdated, locationCount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

