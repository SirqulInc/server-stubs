package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.AccountProfileInfo;
import org.openapitools.model.Address;
import org.openapitools.model.Asset;
import org.openapitools.model.CellCarrier;
import org.openapitools.model.Region;
import org.openapitools.model.RetailerLocation;
import org.openapitools.model.ThirdPartyCredentials;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Account  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Date created;

  @ApiModelProperty(value = "")

  private Date updated;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  @Valid

  private Region currentRegion;

  @ApiModelProperty(value = "")

  private Date locationLastUpdated;

  @ApiModelProperty(value = "")

  private String currentPostalCode;

  @ApiModelProperty(value = "")

  private Double currentPostalCodeLatitude;

  @ApiModelProperty(value = "")

  private Double currentPostalCodeLongitude;

  @ApiModelProperty(value = "")

  private Boolean locationUpdated;

  @ApiModelProperty(value = "")

  private Long premigrationId;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String locale;

  @ApiModelProperty(value = "")

  private String inviteCode;

  @ApiModelProperty(value = "")

  private String retailerInviteCode;

  @ApiModelProperty(value = "")

  private String aboutUs;

  @ApiModelProperty(value = "")

  private String businessName;

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ThirdPartyCredentials> thirdPartyCredentials = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean partnerActive;

  @ApiModelProperty(value = "")

  private String resetToken;

  @ApiModelProperty(value = "")

  private String profileImage;

  @ApiModelProperty(value = "")

  private String accountType;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Asset> media = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private Asset picture;

  @ApiModelProperty(value = "")

  private String firstName;

  @ApiModelProperty(value = "")

  private String middleName;

  @ApiModelProperty(value = "")

  private String lastName;

  @ApiModelProperty(value = "")

  private String prefix;

  @ApiModelProperty(value = "")

  private String suffix;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String homePhone;

  @ApiModelProperty(value = "")

  private String cellPhone;

  @ApiModelProperty(value = "")

  @Valid

  private CellCarrier cellCarrier;

  @ApiModelProperty(value = "")

  private String businessPhone;

  @ApiModelProperty(value = "")

  private String businessPhoneExt;

  @ApiModelProperty(value = "")

  private String faxNumber;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private String utcOffset;

  @ApiModelProperty(value = "")

  private String code501c3;

  @ApiModelProperty(value = "")

  private String emailAddress;

  @ApiModelProperty(value = "")

  @Valid

  private Address address;

  @ApiModelProperty(value = "")

  private String web;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String website;

  @ApiModelProperty(value = "")

  private String consumersNotes;

  @ApiModelProperty(value = "")

  private String consumersAboutUs;

  @ApiModelProperty(value = "")

  @Valid

  private AccountProfileInfo accountProfile;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid RetailerLocation> retailerLocations = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean executive;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private Long defaultThreshold;

public enum AudienceInfoGenderEnum {

MALE(String.valueOf("MALE")), FEMALE(String.valueOf("FEMALE")), ANY(String.valueOf("ANY"));


    private String value;

    AudienceInfoGenderEnum (String v) {
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
    public static AudienceInfoGenderEnum fromValue(String value) {
        for (AudienceInfoGenderEnum b : AudienceInfoGenderEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private AudienceInfoGenderEnum audienceInfoGender;

  @ApiModelProperty(value = "")

  private Long flagThresholdId;

  @ApiModelProperty(value = "")

  private String contentType;
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

  public Account id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Account created(Date created) {
    this.created = created;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Account updated(Date updated) {
    this.updated = updated;
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

  public Account active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Account valid(Boolean valid) {
    this.valid = valid;
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

  public Account latitude(Double latitude) {
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

  public Account longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Account locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get currentRegion
   * @return currentRegion
  **/
  @JsonProperty("currentRegion")
  public Region getCurrentRegion() {
    return currentRegion;
  }

  public void setCurrentRegion(Region currentRegion) {
    this.currentRegion = currentRegion;
  }

  public Account currentRegion(Region currentRegion) {
    this.currentRegion = currentRegion;
    return this;
  }

 /**
   * Get locationLastUpdated
   * @return locationLastUpdated
  **/
  @JsonProperty("locationLastUpdated")
  public Date getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(Date locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public Account locationLastUpdated(Date locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

 /**
   * Get currentPostalCode
   * @return currentPostalCode
  **/
  @JsonProperty("currentPostalCode")
  public String getCurrentPostalCode() {
    return currentPostalCode;
  }

  public void setCurrentPostalCode(String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  public Account currentPostalCode(String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
    return this;
  }

 /**
   * Get currentPostalCodeLatitude
   * @return currentPostalCodeLatitude
  **/
  @JsonProperty("currentPostalCodeLatitude")
  public Double getCurrentPostalCodeLatitude() {
    return currentPostalCodeLatitude;
  }

  public void setCurrentPostalCodeLatitude(Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
  }

  public Account currentPostalCodeLatitude(Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
    return this;
  }

 /**
   * Get currentPostalCodeLongitude
   * @return currentPostalCodeLongitude
  **/
  @JsonProperty("currentPostalCodeLongitude")
  public Double getCurrentPostalCodeLongitude() {
    return currentPostalCodeLongitude;
  }

  public void setCurrentPostalCodeLongitude(Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
  }

  public Account currentPostalCodeLongitude(Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
    return this;
  }

 /**
   * Get locationUpdated
   * @return locationUpdated
  **/
  @JsonProperty("locationUpdated")
  public Boolean getLocationUpdated() {
    return locationUpdated;
  }

  public void setLocationUpdated(Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
  }

  public Account locationUpdated(Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
    return this;
  }

 /**
   * Get premigrationId
   * @return premigrationId
  **/
  @JsonProperty("premigrationId")
  public Long getPremigrationId() {
    return premigrationId;
  }

  public void setPremigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  public Account premigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
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

  public Account username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get locale
   * @return locale
  **/
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Account locale(String locale) {
    this.locale = locale;
    return this;
  }

 /**
   * Get inviteCode
   * @return inviteCode
  **/
  @JsonProperty("inviteCode")
  public String getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
  }

  public Account inviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
    return this;
  }

 /**
   * Get retailerInviteCode
   * @return retailerInviteCode
  **/
  @JsonProperty("retailerInviteCode")
  public String getRetailerInviteCode() {
    return retailerInviteCode;
  }

  public void setRetailerInviteCode(String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
  }

  public Account retailerInviteCode(String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
    return this;
  }

 /**
   * Get aboutUs
   * @return aboutUs
  **/
  @JsonProperty("aboutUs")
  public String getAboutUs() {
    return aboutUs;
  }

  public void setAboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
  }

  public Account aboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
    return this;
  }

 /**
   * Get businessName
   * @return businessName
  **/
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

 /**
   * Get likeCount
   * @return likeCount
  **/
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public Account likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

 /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public Account dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

 /**
   * Get thirdPartyCredentials
   * @return thirdPartyCredentials
  **/
  @JsonProperty("thirdPartyCredentials")
  public List<@Valid ThirdPartyCredentials> getThirdPartyCredentials() {
    return thirdPartyCredentials;
  }

  public void setThirdPartyCredentials(List<@Valid ThirdPartyCredentials> thirdPartyCredentials) {
    this.thirdPartyCredentials = thirdPartyCredentials;
  }

  public Account thirdPartyCredentials(List<@Valid ThirdPartyCredentials> thirdPartyCredentials) {
    this.thirdPartyCredentials = thirdPartyCredentials;
    return this;
  }

  public Account addThirdPartyCredentialsItem(ThirdPartyCredentials thirdPartyCredentialsItem) {
    this.thirdPartyCredentials.add(thirdPartyCredentialsItem);
    return this;
  }

 /**
   * Get partnerActive
   * @return partnerActive
  **/
  @JsonProperty("partnerActive")
  public Boolean getPartnerActive() {
    return partnerActive;
  }

  public void setPartnerActive(Boolean partnerActive) {
    this.partnerActive = partnerActive;
  }

  public Account partnerActive(Boolean partnerActive) {
    this.partnerActive = partnerActive;
    return this;
  }

 /**
   * Get resetToken
   * @return resetToken
  **/
  @JsonProperty("resetToken")
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  public Account resetToken(String resetToken) {
    this.resetToken = resetToken;
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

  public Account profileImage(String profileImage) {
    this.profileImage = profileImage;
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

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public List<@Valid Asset> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  public Account media(List<@Valid Asset> media) {
    this.media = media;
    return this;
  }

  public Account addMediaItem(Asset mediaItem) {
    this.media.add(mediaItem);
    return this;
  }

 /**
   * Get picture
   * @return picture
  **/
  @JsonProperty("picture")
  public Asset getPicture() {
    return picture;
  }

  public void setPicture(Asset picture) {
    this.picture = picture;
  }

  public Account picture(Asset picture) {
    this.picture = picture;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Account firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get middleName
   * @return middleName
  **/
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Account middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Account lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get prefix
   * @return prefix
  **/
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Account prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

 /**
   * Get suffix
   * @return suffix
  **/
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public Account suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Account title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get homePhone
   * @return homePhone
  **/
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public Account homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

 /**
   * Get cellPhone
   * @return cellPhone
  **/
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Account cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

 /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  @JsonProperty("cellCarrier")
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Account cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

 /**
   * Get businessPhone
   * @return businessPhone
  **/
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Account businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

 /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Account businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

 /**
   * Get faxNumber
   * @return faxNumber
  **/
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Account faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

 /**
   * Get timeZone
   * @return timeZone
  **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Account timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get utcOffset
   * @return utcOffset
  **/
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Account utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

 /**
   * Get code501c3
   * @return code501c3
  **/
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public Account code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

 /**
   * Get emailAddress
   * @return emailAddress
  **/
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Account emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Account address(Address address) {
    this.address = address;
    return this;
  }

 /**
   * Get web
   * @return web
  **/
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public Account web(String web) {
    this.web = web;
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

  public Account display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get website
   * @return website
  **/
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Account website(String website) {
    this.website = website;
    return this;
  }

 /**
   * Get consumersNotes
   * @return consumersNotes
  **/
  @JsonProperty("consumersNotes")
  public String getConsumersNotes() {
    return consumersNotes;
  }

  public void setConsumersNotes(String consumersNotes) {
    this.consumersNotes = consumersNotes;
  }

  public Account consumersNotes(String consumersNotes) {
    this.consumersNotes = consumersNotes;
    return this;
  }

 /**
   * Get consumersAboutUs
   * @return consumersAboutUs
  **/
  @JsonProperty("consumersAboutUs")
  public String getConsumersAboutUs() {
    return consumersAboutUs;
  }

  public void setConsumersAboutUs(String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
  }

  public Account consumersAboutUs(String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
    return this;
  }

 /**
   * Get accountProfile
   * @return accountProfile
  **/
  @JsonProperty("accountProfile")
  public AccountProfileInfo getAccountProfile() {
    return accountProfile;
  }

  public void setAccountProfile(AccountProfileInfo accountProfile) {
    this.accountProfile = accountProfile;
  }

  public Account accountProfile(AccountProfileInfo accountProfile) {
    this.accountProfile = accountProfile;
    return this;
  }

 /**
   * Get retailerLocations
   * @return retailerLocations
  **/
  @JsonProperty("retailerLocations")
  public List<@Valid RetailerLocation> getRetailerLocations() {
    return retailerLocations;
  }

  public void setRetailerLocations(List<@Valid RetailerLocation> retailerLocations) {
    this.retailerLocations = retailerLocations;
  }

  public Account retailerLocations(List<@Valid RetailerLocation> retailerLocations) {
    this.retailerLocations = retailerLocations;
    return this;
  }

  public Account addRetailerLocationsItem(RetailerLocation retailerLocationsItem) {
    this.retailerLocations.add(retailerLocationsItem);
    return this;
  }

 /**
   * Get executive
   * @return executive
  **/
  @JsonProperty("executive")
  public Boolean getExecutive() {
    return executive;
  }

  public void setExecutive(Boolean executive) {
    this.executive = executive;
  }

  public Account executive(Boolean executive) {
    this.executive = executive;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Account contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Account defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

 /**
   * Get audienceInfoGender
   * @return audienceInfoGender
  **/
  @JsonProperty("audienceInfo_gender")
  public String getAudienceInfoGender() {
    if (audienceInfoGender == null) {
      return null;
    }
    return audienceInfoGender.value();
  }

  public void setAudienceInfoGender(AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
  }

  public Account audienceInfoGender(AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
    return this;
  }

 /**
   * Get flagThresholdId
   * @return flagThresholdId
  **/
  @JsonProperty("flagThreshold_id")
  public Long getFlagThresholdId() {
    return flagThresholdId;
  }

  public void setFlagThresholdId(Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
  }

  public Account flagThresholdId(Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public Account contentType(String contentType) {
    this.contentType = contentType;
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
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.created, account.created) &&
        Objects.equals(this.updated, account.updated) &&
        Objects.equals(this.active, account.active) &&
        Objects.equals(this.valid, account.valid) &&
        Objects.equals(this.latitude, account.latitude) &&
        Objects.equals(this.longitude, account.longitude) &&
        Objects.equals(this.locationDescription, account.locationDescription) &&
        Objects.equals(this.currentRegion, account.currentRegion) &&
        Objects.equals(this.locationLastUpdated, account.locationLastUpdated) &&
        Objects.equals(this.currentPostalCode, account.currentPostalCode) &&
        Objects.equals(this.currentPostalCodeLatitude, account.currentPostalCodeLatitude) &&
        Objects.equals(this.currentPostalCodeLongitude, account.currentPostalCodeLongitude) &&
        Objects.equals(this.locationUpdated, account.locationUpdated) &&
        Objects.equals(this.premigrationId, account.premigrationId) &&
        Objects.equals(this.username, account.username) &&
        Objects.equals(this.locale, account.locale) &&
        Objects.equals(this.inviteCode, account.inviteCode) &&
        Objects.equals(this.retailerInviteCode, account.retailerInviteCode) &&
        Objects.equals(this.aboutUs, account.aboutUs) &&
        Objects.equals(this.businessName, account.businessName) &&
        Objects.equals(this.likeCount, account.likeCount) &&
        Objects.equals(this.dislikeCount, account.dislikeCount) &&
        Objects.equals(this.thirdPartyCredentials, account.thirdPartyCredentials) &&
        Objects.equals(this.partnerActive, account.partnerActive) &&
        Objects.equals(this.resetToken, account.resetToken) &&
        Objects.equals(this.profileImage, account.profileImage) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.media, account.media) &&
        Objects.equals(this.picture, account.picture) &&
        Objects.equals(this.firstName, account.firstName) &&
        Objects.equals(this.middleName, account.middleName) &&
        Objects.equals(this.lastName, account.lastName) &&
        Objects.equals(this.prefix, account.prefix) &&
        Objects.equals(this.suffix, account.suffix) &&
        Objects.equals(this.title, account.title) &&
        Objects.equals(this.homePhone, account.homePhone) &&
        Objects.equals(this.cellPhone, account.cellPhone) &&
        Objects.equals(this.cellCarrier, account.cellCarrier) &&
        Objects.equals(this.businessPhone, account.businessPhone) &&
        Objects.equals(this.businessPhoneExt, account.businessPhoneExt) &&
        Objects.equals(this.faxNumber, account.faxNumber) &&
        Objects.equals(this.timeZone, account.timeZone) &&
        Objects.equals(this.utcOffset, account.utcOffset) &&
        Objects.equals(this.code501c3, account.code501c3) &&
        Objects.equals(this.emailAddress, account.emailAddress) &&
        Objects.equals(this.address, account.address) &&
        Objects.equals(this.web, account.web) &&
        Objects.equals(this.display, account.display) &&
        Objects.equals(this.website, account.website) &&
        Objects.equals(this.consumersNotes, account.consumersNotes) &&
        Objects.equals(this.consumersAboutUs, account.consumersAboutUs) &&
        Objects.equals(this.accountProfile, account.accountProfile) &&
        Objects.equals(this.retailerLocations, account.retailerLocations) &&
        Objects.equals(this.executive, account.executive) &&
        Objects.equals(this.contentName, account.contentName) &&
        Objects.equals(this.defaultThreshold, account.defaultThreshold) &&
        Objects.equals(this.audienceInfoGender, account.audienceInfoGender) &&
        Objects.equals(this.flagThresholdId, account.flagThresholdId) &&
        Objects.equals(this.contentType, account.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, active, valid, latitude, longitude, locationDescription, currentRegion, locationLastUpdated, currentPostalCode, currentPostalCodeLatitude, currentPostalCodeLongitude, locationUpdated, premigrationId, username, locale, inviteCode, retailerInviteCode, aboutUs, businessName, likeCount, dislikeCount, thirdPartyCredentials, partnerActive, resetToken, profileImage, accountType, media, picture, firstName, middleName, lastName, prefix, suffix, title, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, display, website, consumersNotes, consumersAboutUs, accountProfile, retailerLocations, executive, contentName, defaultThreshold, audienceInfoGender, flagThresholdId, contentType);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

