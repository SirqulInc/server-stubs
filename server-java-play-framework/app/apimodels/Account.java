package apimodels;

import apimodels.AccountProfileInfo;
import apimodels.Address;
import apimodels.Asset;
import apimodels.CellCarrier;
import apimodels.Region;
import apimodels.RetailerLocation;
import apimodels.ThirdPartyCredentials;
import java.time.OffsetDateTime;
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
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Account   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("created")
  @Valid

  private OffsetDateTime created;

  @JsonProperty("updated")
  @Valid

  private OffsetDateTime updated;

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

  @JsonProperty("currentRegion")
  @Valid

  private Region currentRegion;

  @JsonProperty("locationLastUpdated")
  @Valid

  private OffsetDateTime locationLastUpdated;

  @JsonProperty("currentPostalCode")
  
  private String currentPostalCode;

  @JsonProperty("currentPostalCodeLatitude")
  
  private Double currentPostalCodeLatitude;

  @JsonProperty("currentPostalCodeLongitude")
  
  private Double currentPostalCodeLongitude;

  @JsonProperty("locationUpdated")
  
  private Boolean locationUpdated;

  @JsonProperty("premigrationId")
  
  private Long premigrationId;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("locale")
  
  private String locale;

  @JsonProperty("inviteCode")
  
  private String inviteCode;

  @JsonProperty("retailerInviteCode")
  
  private String retailerInviteCode;

  @JsonProperty("aboutUs")
  
  private String aboutUs;

  @JsonProperty("businessName")
  
  private String businessName;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("thirdPartyCredentials")
  @Valid

  private List<@Valid ThirdPartyCredentials> thirdPartyCredentials = null;

  @JsonProperty("partnerActive")
  
  private Boolean partnerActive;

  @JsonProperty("resetToken")
  
  private String resetToken;

  @JsonProperty("profileImage")
  
  private String profileImage;

  @JsonProperty("accountType")
  
  private String accountType;

  @JsonProperty("media")
  @Valid

  private List<@Valid Asset> media = null;

  @JsonProperty("picture")
  @Valid

  private Asset picture;

  @JsonProperty("firstName")
  
  private String firstName;

  @JsonProperty("middleName")
  
  private String middleName;

  @JsonProperty("lastName")
  
  private String lastName;

  @JsonProperty("prefix")
  
  private String prefix;

  @JsonProperty("suffix")
  
  private String suffix;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("homePhone")
  
  private String homePhone;

  @JsonProperty("cellPhone")
  
  private String cellPhone;

  @JsonProperty("cellCarrier")
  @Valid

  private CellCarrier cellCarrier;

  @JsonProperty("businessPhone")
  
  private String businessPhone;

  @JsonProperty("businessPhoneExt")
  
  private String businessPhoneExt;

  @JsonProperty("faxNumber")
  
  private String faxNumber;

  @JsonProperty("timeZone")
  
  private String timeZone;

  @JsonProperty("utcOffset")
  
  private String utcOffset;

  @JsonProperty("code501c3")
  
  private String code501c3;

  @JsonProperty("emailAddress")
  
  private String emailAddress;

  @JsonProperty("address")
  @Valid

  private Address address;

  @JsonProperty("web")
  
  private String web;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("website")
  
  private String website;

  @JsonProperty("consumersNotes")
  
  private String consumersNotes;

  @JsonProperty("consumersAboutUs")
  
  private String consumersAboutUs;

  @JsonProperty("accountProfile")
  @Valid

  private AccountProfileInfo accountProfile;

  @JsonProperty("retailerLocations")
  @Valid

  private List<@Valid RetailerLocation> retailerLocations = null;

  @JsonProperty("executive")
  
  private Boolean executive;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("defaultThreshold")
  
  private Long defaultThreshold;

  /**
   * Gets or Sets audienceInfoGender
   */
  public enum AudienceInfoGenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    ANY("ANY");

    private final String value;

    AudienceInfoGenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AudienceInfoGenderEnum fromValue(String value) {
      for (AudienceInfoGenderEnum b : AudienceInfoGenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("audienceInfo_gender")
  
  private AudienceInfoGenderEnum audienceInfoGender;

  @JsonProperty("flagThreshold_id")
  
  private Long flagThresholdId;

  @JsonProperty("contentType")
  
  private String contentType;

  public Account id(Long id) {
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

  public Account created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Account updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public Account active(Boolean active) {
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

  public Account valid(Boolean valid) {
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

  public Account latitude(Double latitude) {
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

  public Account longitude(Double longitude) {
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

  public Account locationDescription(String locationDescription) {
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

  public Account currentRegion(Region currentRegion) {
    this.currentRegion = currentRegion;
    return this;
  }

   /**
   * Get currentRegion
   * @return currentRegion
  **/
  public Region getCurrentRegion() {
    return currentRegion;
  }

  public void setCurrentRegion(Region currentRegion) {
    this.currentRegion = currentRegion;
  }

  public Account locationLastUpdated(OffsetDateTime locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

   /**
   * Get locationLastUpdated
   * @return locationLastUpdated
  **/
  public OffsetDateTime getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(OffsetDateTime locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public Account currentPostalCode(String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
    return this;
  }

   /**
   * Get currentPostalCode
   * @return currentPostalCode
  **/
  public String getCurrentPostalCode() {
    return currentPostalCode;
  }

  public void setCurrentPostalCode(String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  public Account currentPostalCodeLatitude(Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
    return this;
  }

   /**
   * Get currentPostalCodeLatitude
   * @return currentPostalCodeLatitude
  **/
  public Double getCurrentPostalCodeLatitude() {
    return currentPostalCodeLatitude;
  }

  public void setCurrentPostalCodeLatitude(Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
  }

  public Account currentPostalCodeLongitude(Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
    return this;
  }

   /**
   * Get currentPostalCodeLongitude
   * @return currentPostalCodeLongitude
  **/
  public Double getCurrentPostalCodeLongitude() {
    return currentPostalCodeLongitude;
  }

  public void setCurrentPostalCodeLongitude(Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
  }

  public Account locationUpdated(Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
    return this;
  }

   /**
   * Get locationUpdated
   * @return locationUpdated
  **/
  public Boolean getLocationUpdated() {
    return locationUpdated;
  }

  public void setLocationUpdated(Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
  }

  public Account premigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
    return this;
  }

   /**
   * Get premigrationId
   * @return premigrationId
  **/
  public Long getPremigrationId() {
    return premigrationId;
  }

  public void setPremigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  public Account username(String username) {
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

  public Account locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Account inviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
    return this;
  }

   /**
   * Get inviteCode
   * @return inviteCode
  **/
  public String getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
  }

  public Account retailerInviteCode(String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
    return this;
  }

   /**
   * Get retailerInviteCode
   * @return retailerInviteCode
  **/
  public String getRetailerInviteCode() {
    return retailerInviteCode;
  }

  public void setRetailerInviteCode(String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
  }

  public Account aboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
    return this;
  }

   /**
   * Get aboutUs
   * @return aboutUs
  **/
  public String getAboutUs() {
    return aboutUs;
  }

  public void setAboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
  }

  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Account likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

   /**
   * Get likeCount
   * @return likeCount
  **/
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public Account dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

   /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public Account thirdPartyCredentials(List<@Valid ThirdPartyCredentials> thirdPartyCredentials) {
    this.thirdPartyCredentials = thirdPartyCredentials;
    return this;
  }

  public Account addThirdPartyCredentialsItem(ThirdPartyCredentials thirdPartyCredentialsItem) {
    if (this.thirdPartyCredentials == null) {
      this.thirdPartyCredentials = new ArrayList<>();
    }
    this.thirdPartyCredentials.add(thirdPartyCredentialsItem);
    return this;
  }

   /**
   * Get thirdPartyCredentials
   * @return thirdPartyCredentials
  **/
  public List<@Valid ThirdPartyCredentials> getThirdPartyCredentials() {
    return thirdPartyCredentials;
  }

  public void setThirdPartyCredentials(List<@Valid ThirdPartyCredentials> thirdPartyCredentials) {
    this.thirdPartyCredentials = thirdPartyCredentials;
  }

  public Account partnerActive(Boolean partnerActive) {
    this.partnerActive = partnerActive;
    return this;
  }

   /**
   * Get partnerActive
   * @return partnerActive
  **/
  public Boolean getPartnerActive() {
    return partnerActive;
  }

  public void setPartnerActive(Boolean partnerActive) {
    this.partnerActive = partnerActive;
  }

  public Account resetToken(String resetToken) {
    this.resetToken = resetToken;
    return this;
  }

   /**
   * Get resetToken
   * @return resetToken
  **/
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  public Account profileImage(String profileImage) {
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

  public Account accountType(String accountType) {
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

  public Account media(List<@Valid Asset> media) {
    this.media = media;
    return this;
  }

  public Account addMediaItem(Asset mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  public List<@Valid Asset> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  public Account picture(Asset picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  public Asset getPicture() {
    return picture;
  }

  public void setPicture(Asset picture) {
    this.picture = picture;
  }

  public Account firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Account middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Account lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Account prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Account suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public Account title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Account homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

   /**
   * Get homePhone
   * @return homePhone
  **/
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public Account cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

   /**
   * Get cellPhone
   * @return cellPhone
  **/
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Account cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

   /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Account businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Get businessPhone
   * @return businessPhone
  **/
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Account businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

   /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Account faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Account timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Account utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Account code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

   /**
   * Get code501c3
   * @return code501c3
  **/
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public Account emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Account address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Account web(String web) {
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public Account display(String display) {
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

  public Account website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Account consumersNotes(String consumersNotes) {
    this.consumersNotes = consumersNotes;
    return this;
  }

   /**
   * Get consumersNotes
   * @return consumersNotes
  **/
  public String getConsumersNotes() {
    return consumersNotes;
  }

  public void setConsumersNotes(String consumersNotes) {
    this.consumersNotes = consumersNotes;
  }

  public Account consumersAboutUs(String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
    return this;
  }

   /**
   * Get consumersAboutUs
   * @return consumersAboutUs
  **/
  public String getConsumersAboutUs() {
    return consumersAboutUs;
  }

  public void setConsumersAboutUs(String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
  }

  public Account accountProfile(AccountProfileInfo accountProfile) {
    this.accountProfile = accountProfile;
    return this;
  }

   /**
   * Get accountProfile
   * @return accountProfile
  **/
  public AccountProfileInfo getAccountProfile() {
    return accountProfile;
  }

  public void setAccountProfile(AccountProfileInfo accountProfile) {
    this.accountProfile = accountProfile;
  }

  public Account retailerLocations(List<@Valid RetailerLocation> retailerLocations) {
    this.retailerLocations = retailerLocations;
    return this;
  }

  public Account addRetailerLocationsItem(RetailerLocation retailerLocationsItem) {
    if (this.retailerLocations == null) {
      this.retailerLocations = new ArrayList<>();
    }
    this.retailerLocations.add(retailerLocationsItem);
    return this;
  }

   /**
   * Get retailerLocations
   * @return retailerLocations
  **/
  public List<@Valid RetailerLocation> getRetailerLocations() {
    return retailerLocations;
  }

  public void setRetailerLocations(List<@Valid RetailerLocation> retailerLocations) {
    this.retailerLocations = retailerLocations;
  }

  public Account executive(Boolean executive) {
    this.executive = executive;
    return this;
  }

   /**
   * Get executive
   * @return executive
  **/
  public Boolean getExecutive() {
    return executive;
  }

  public void setExecutive(Boolean executive) {
    this.executive = executive;
  }

  public Account contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Account defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

   /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Account audienceInfoGender(AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
    return this;
  }

   /**
   * Get audienceInfoGender
   * @return audienceInfoGender
  **/
  public AudienceInfoGenderEnum getAudienceInfoGender() {
    return audienceInfoGender;
  }

  public void setAudienceInfoGender(AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
  }

  public Account flagThresholdId(Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
    return this;
  }

   /**
   * Get flagThresholdId
   * @return flagThresholdId
  **/
  public Long getFlagThresholdId() {
    return flagThresholdId;
  }

  public void setFlagThresholdId(Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
  }

  public Account contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(id, account.id) &&
        Objects.equals(created, account.created) &&
        Objects.equals(updated, account.updated) &&
        Objects.equals(active, account.active) &&
        Objects.equals(valid, account.valid) &&
        Objects.equals(latitude, account.latitude) &&
        Objects.equals(longitude, account.longitude) &&
        Objects.equals(locationDescription, account.locationDescription) &&
        Objects.equals(currentRegion, account.currentRegion) &&
        Objects.equals(locationLastUpdated, account.locationLastUpdated) &&
        Objects.equals(currentPostalCode, account.currentPostalCode) &&
        Objects.equals(currentPostalCodeLatitude, account.currentPostalCodeLatitude) &&
        Objects.equals(currentPostalCodeLongitude, account.currentPostalCodeLongitude) &&
        Objects.equals(locationUpdated, account.locationUpdated) &&
        Objects.equals(premigrationId, account.premigrationId) &&
        Objects.equals(username, account.username) &&
        Objects.equals(locale, account.locale) &&
        Objects.equals(inviteCode, account.inviteCode) &&
        Objects.equals(retailerInviteCode, account.retailerInviteCode) &&
        Objects.equals(aboutUs, account.aboutUs) &&
        Objects.equals(businessName, account.businessName) &&
        Objects.equals(likeCount, account.likeCount) &&
        Objects.equals(dislikeCount, account.dislikeCount) &&
        Objects.equals(thirdPartyCredentials, account.thirdPartyCredentials) &&
        Objects.equals(partnerActive, account.partnerActive) &&
        Objects.equals(resetToken, account.resetToken) &&
        Objects.equals(profileImage, account.profileImage) &&
        Objects.equals(accountType, account.accountType) &&
        Objects.equals(media, account.media) &&
        Objects.equals(picture, account.picture) &&
        Objects.equals(firstName, account.firstName) &&
        Objects.equals(middleName, account.middleName) &&
        Objects.equals(lastName, account.lastName) &&
        Objects.equals(prefix, account.prefix) &&
        Objects.equals(suffix, account.suffix) &&
        Objects.equals(title, account.title) &&
        Objects.equals(homePhone, account.homePhone) &&
        Objects.equals(cellPhone, account.cellPhone) &&
        Objects.equals(cellCarrier, account.cellCarrier) &&
        Objects.equals(businessPhone, account.businessPhone) &&
        Objects.equals(businessPhoneExt, account.businessPhoneExt) &&
        Objects.equals(faxNumber, account.faxNumber) &&
        Objects.equals(timeZone, account.timeZone) &&
        Objects.equals(utcOffset, account.utcOffset) &&
        Objects.equals(code501c3, account.code501c3) &&
        Objects.equals(emailAddress, account.emailAddress) &&
        Objects.equals(address, account.address) &&
        Objects.equals(web, account.web) &&
        Objects.equals(display, account.display) &&
        Objects.equals(website, account.website) &&
        Objects.equals(consumersNotes, account.consumersNotes) &&
        Objects.equals(consumersAboutUs, account.consumersAboutUs) &&
        Objects.equals(accountProfile, account.accountProfile) &&
        Objects.equals(retailerLocations, account.retailerLocations) &&
        Objects.equals(executive, account.executive) &&
        Objects.equals(contentName, account.contentName) &&
        Objects.equals(defaultThreshold, account.defaultThreshold) &&
        Objects.equals(audienceInfoGender, account.audienceInfoGender) &&
        Objects.equals(flagThresholdId, account.flagThresholdId) &&
        Objects.equals(contentType, account.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, active, valid, latitude, longitude, locationDescription, currentRegion, locationLastUpdated, currentPostalCode, currentPostalCodeLatitude, currentPostalCodeLongitude, locationUpdated, premigrationId, username, locale, inviteCode, retailerInviteCode, aboutUs, businessName, likeCount, dislikeCount, thirdPartyCredentials, partnerActive, resetToken, profileImage, accountType, media, picture, firstName, middleName, lastName, prefix, suffix, title, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, display, website, consumersNotes, consumersAboutUs, accountProfile, retailerLocations, executive, contentName, defaultThreshold, audienceInfoGender, flagThresholdId, contentType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    currentRegion: ").append(toIndentedString(currentRegion)).append("\n");
    sb.append("    locationLastUpdated: ").append(toIndentedString(locationLastUpdated)).append("\n");
    sb.append("    currentPostalCode: ").append(toIndentedString(currentPostalCode)).append("\n");
    sb.append("    currentPostalCodeLatitude: ").append(toIndentedString(currentPostalCodeLatitude)).append("\n");
    sb.append("    currentPostalCodeLongitude: ").append(toIndentedString(currentPostalCodeLongitude)).append("\n");
    sb.append("    locationUpdated: ").append(toIndentedString(locationUpdated)).append("\n");
    sb.append("    premigrationId: ").append(toIndentedString(premigrationId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    inviteCode: ").append(toIndentedString(inviteCode)).append("\n");
    sb.append("    retailerInviteCode: ").append(toIndentedString(retailerInviteCode)).append("\n");
    sb.append("    aboutUs: ").append(toIndentedString(aboutUs)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    thirdPartyCredentials: ").append(toIndentedString(thirdPartyCredentials)).append("\n");
    sb.append("    partnerActive: ").append(toIndentedString(partnerActive)).append("\n");
    sb.append("    resetToken: ").append(toIndentedString(resetToken)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    cellCarrier: ").append(toIndentedString(cellCarrier)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhoneExt: ").append(toIndentedString(businessPhoneExt)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    code501c3: ").append(toIndentedString(code501c3)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    consumersNotes: ").append(toIndentedString(consumersNotes)).append("\n");
    sb.append("    consumersAboutUs: ").append(toIndentedString(consumersAboutUs)).append("\n");
    sb.append("    accountProfile: ").append(toIndentedString(accountProfile)).append("\n");
    sb.append("    retailerLocations: ").append(toIndentedString(retailerLocations)).append("\n");
    sb.append("    executive: ").append(toIndentedString(executive)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    defaultThreshold: ").append(toIndentedString(defaultThreshold)).append("\n");
    sb.append("    audienceInfoGender: ").append(toIndentedString(audienceInfoGender)).append("\n");
    sb.append("    flagThresholdId: ").append(toIndentedString(flagThresholdId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

