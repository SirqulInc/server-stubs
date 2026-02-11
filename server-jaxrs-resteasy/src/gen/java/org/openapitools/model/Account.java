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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Account   {
  
  private Long id;
  private Date created;
  private Date updated;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Region currentRegion;
  private Date locationLastUpdated;
  private String currentPostalCode;
  private Double currentPostalCodeLatitude;
  private Double currentPostalCodeLongitude;
  private Boolean locationUpdated;
  private Long premigrationId;
  private String username;
  private String locale;
  private String inviteCode;
  private String retailerInviteCode;
  private String aboutUs;
  private String businessName;
  private Long likeCount;
  private Long dislikeCount;
  private List<@Valid ThirdPartyCredentials> thirdPartyCredentials = new ArrayList<>();
  private Boolean partnerActive;
  private String resetToken;
  private String profileImage;
  private String accountType;
  private List<@Valid Asset> media = new ArrayList<>();
  private Asset picture;
  private String firstName;
  private String middleName;
  private String lastName;
  private String prefix;
  private String suffix;
  private String title;
  private String homePhone;
  private String cellPhone;
  private CellCarrier cellCarrier;
  private String businessPhone;
  private String businessPhoneExt;
  private String faxNumber;
  private String timeZone;
  private String utcOffset;
  private String code501c3;
  private String emailAddress;
  private Address address;
  private String web;
  private String display;
  private String website;
  private String consumersNotes;
  private String consumersAboutUs;
  private AccountProfileInfo accountProfile;
  private List<@Valid RetailerLocation> retailerLocations = new ArrayList<>();
  private Boolean executive;
  private String contentName;
  private Long defaultThreshold;

  /**
   * Gets or Sets audienceInfoGender
   */
  public enum AudienceInfoGenderEnum {
    MALE("MALE"),

        FEMALE("FEMALE"),

        ANY("ANY");
    private String value;

    AudienceInfoGenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AudienceInfoGenderEnum audienceInfoGender;
  private Long flagThresholdId;
  private String contentType;

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
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
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
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentRegion")
  @Valid
  public Region getCurrentRegion() {
    return currentRegion;
  }
  public void setCurrentRegion(Region currentRegion) {
    this.currentRegion = currentRegion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationLastUpdated")
  public Date getLocationLastUpdated() {
    return locationLastUpdated;
  }
  public void setLocationLastUpdated(Date locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentPostalCode")
  public String getCurrentPostalCode() {
    return currentPostalCode;
  }
  public void setCurrentPostalCode(String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentPostalCodeLatitude")
  public Double getCurrentPostalCodeLatitude() {
    return currentPostalCodeLatitude;
  }
  public void setCurrentPostalCodeLatitude(Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentPostalCodeLongitude")
  public Double getCurrentPostalCodeLongitude() {
    return currentPostalCodeLongitude;
  }
  public void setCurrentPostalCodeLongitude(Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationUpdated")
  public Boolean getLocationUpdated() {
    return locationUpdated;
  }
  public void setLocationUpdated(Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("premigrationId")
  public Long getPremigrationId() {
    return premigrationId;
  }
  public void setPremigrationId(Long premigrationId) {
    this.premigrationId = premigrationId;
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
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviteCode")
  public String getInviteCode() {
    return inviteCode;
  }
  public void setInviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerInviteCode")
  public String getRetailerInviteCode() {
    return retailerInviteCode;
  }
  public void setRetailerInviteCode(String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aboutUs")
  public String getAboutUs() {
    return aboutUs;
  }
  public void setAboutUs(String aboutUs) {
    this.aboutUs = aboutUs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }
  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }
  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyCredentials")
  @Valid
  public List<@Valid ThirdPartyCredentials> getThirdPartyCredentials() {
    return thirdPartyCredentials;
  }
  public void setThirdPartyCredentials(List<@Valid ThirdPartyCredentials> thirdPartyCredentials) {
    this.thirdPartyCredentials = thirdPartyCredentials;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("partnerActive")
  public Boolean getPartnerActive() {
    return partnerActive;
  }
  public void setPartnerActive(Boolean partnerActive) {
    this.partnerActive = partnerActive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("resetToken")
  public String getResetToken() {
    return resetToken;
  }
  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
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
  @JsonProperty("media")
  @Valid
  public List<@Valid Asset> getMedia() {
    return media;
  }
  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("picture")
  @Valid
  public Asset getPicture() {
    return picture;
  }
  public void setPicture(Asset picture) {
    this.picture = picture;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellCarrier")
  @Valid
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }
  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }
  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }
  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }
  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }
  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }
  public void setWeb(String web) {
    this.web = web;
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
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consumersNotes")
  public String getConsumersNotes() {
    return consumersNotes;
  }
  public void setConsumersNotes(String consumersNotes) {
    this.consumersNotes = consumersNotes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("consumersAboutUs")
  public String getConsumersAboutUs() {
    return consumersAboutUs;
  }
  public void setConsumersAboutUs(String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountProfile")
  @Valid
  public AccountProfileInfo getAccountProfile() {
    return accountProfile;
  }
  public void setAccountProfile(AccountProfileInfo accountProfile) {
    this.accountProfile = accountProfile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocations")
  @Valid
  public List<@Valid RetailerLocation> getRetailerLocations() {
    return retailerLocations;
  }
  public void setRetailerLocations(List<@Valid RetailerLocation> retailerLocations) {
    this.retailerLocations = retailerLocations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("executive")
  public Boolean getExecutive() {
    return executive;
  }
  public void setExecutive(Boolean executive) {
    this.executive = executive;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }
  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audienceInfo_gender")
  public AudienceInfoGenderEnum getAudienceInfoGender() {
    return audienceInfoGender;
  }
  public void setAudienceInfoGender(AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagThreshold_id")
  public Long getFlagThresholdId() {
    return flagThresholdId;
  }
  public void setFlagThresholdId(Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentType")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

