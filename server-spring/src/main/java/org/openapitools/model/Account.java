package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountProfileInfo;
import org.openapitools.model.Address;
import org.openapitools.model.Asset;
import org.openapitools.model.CellCarrier;
import org.openapitools.model.Region;
import org.openapitools.model.RetailerLocation;
import org.openapitools.model.ThirdPartyCredentials;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Account
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Account {

  private @Nullable Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime created;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime updated;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable Region currentRegion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime locationLastUpdated;

  private @Nullable String currentPostalCode;

  private @Nullable Double currentPostalCodeLatitude;

  private @Nullable Double currentPostalCodeLongitude;

  private @Nullable Boolean locationUpdated;

  private @Nullable Long premigrationId;

  private @Nullable String username;

  private @Nullable String locale;

  private @Nullable String inviteCode;

  private @Nullable String retailerInviteCode;

  private @Nullable String aboutUs;

  private @Nullable String businessName;

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  @Valid
  private List<@Valid ThirdPartyCredentials> thirdPartyCredentials = new ArrayList<>();

  private @Nullable Boolean partnerActive;

  private @Nullable String resetToken;

  private @Nullable String profileImage;

  private @Nullable String accountType;

  @Valid
  private List<@Valid Asset> media = new ArrayList<>();

  private @Nullable Asset picture;

  private @Nullable String firstName;

  private @Nullable String middleName;

  private @Nullable String lastName;

  private @Nullable String prefix;

  private @Nullable String suffix;

  private @Nullable String title;

  private @Nullable String homePhone;

  private @Nullable String cellPhone;

  private @Nullable CellCarrier cellCarrier;

  private @Nullable String businessPhone;

  private @Nullable String businessPhoneExt;

  private @Nullable String faxNumber;

  private @Nullable String timeZone;

  private @Nullable String utcOffset;

  private @Nullable String code501c3;

  private @Nullable String emailAddress;

  private @Nullable Address address;

  private @Nullable String web;

  private @Nullable String display;

  private @Nullable String website;

  private @Nullable String consumersNotes;

  private @Nullable String consumersAboutUs;

  private @Nullable AccountProfileInfo accountProfile;

  @Valid
  private List<@Valid RetailerLocation> retailerLocations = new ArrayList<>();

  private @Nullable Boolean executive;

  private @Nullable String contentName;

  private @Nullable Long defaultThreshold;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable AudienceInfoGenderEnum audienceInfoGender;

  private @Nullable Long flagThresholdId;

  private @Nullable String contentType;

  public Account id(@Nullable Long id) {
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

  public Account created(@Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @Valid 
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@Nullable OffsetDateTime created) {
    this.created = created;
  }

  public Account updated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  @Valid 
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable OffsetDateTime updated) {
    this.updated = updated;
  }

  public Account active(@Nullable Boolean active) {
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

  public Account valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Account latitude(@Nullable Double latitude) {
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

  public Account longitude(@Nullable Double longitude) {
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

  public Account locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Account currentRegion(@Nullable Region currentRegion) {
    this.currentRegion = currentRegion;
    return this;
  }

  /**
   * Get currentRegion
   * @return currentRegion
   */
  @Valid 
  @Schema(name = "currentRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentRegion")
  public @Nullable Region getCurrentRegion() {
    return currentRegion;
  }

  public void setCurrentRegion(@Nullable Region currentRegion) {
    this.currentRegion = currentRegion;
  }

  public Account locationLastUpdated(@Nullable OffsetDateTime locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
    return this;
  }

  /**
   * Get locationLastUpdated
   * @return locationLastUpdated
   */
  @Valid 
  @Schema(name = "locationLastUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationLastUpdated")
  public @Nullable OffsetDateTime getLocationLastUpdated() {
    return locationLastUpdated;
  }

  public void setLocationLastUpdated(@Nullable OffsetDateTime locationLastUpdated) {
    this.locationLastUpdated = locationLastUpdated;
  }

  public Account currentPostalCode(@Nullable String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
    return this;
  }

  /**
   * Get currentPostalCode
   * @return currentPostalCode
   */
  
  @Schema(name = "currentPostalCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPostalCode")
  public @Nullable String getCurrentPostalCode() {
    return currentPostalCode;
  }

  public void setCurrentPostalCode(@Nullable String currentPostalCode) {
    this.currentPostalCode = currentPostalCode;
  }

  public Account currentPostalCodeLatitude(@Nullable Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
    return this;
  }

  /**
   * Get currentPostalCodeLatitude
   * @return currentPostalCodeLatitude
   */
  
  @Schema(name = "currentPostalCodeLatitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPostalCodeLatitude")
  public @Nullable Double getCurrentPostalCodeLatitude() {
    return currentPostalCodeLatitude;
  }

  public void setCurrentPostalCodeLatitude(@Nullable Double currentPostalCodeLatitude) {
    this.currentPostalCodeLatitude = currentPostalCodeLatitude;
  }

  public Account currentPostalCodeLongitude(@Nullable Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
    return this;
  }

  /**
   * Get currentPostalCodeLongitude
   * @return currentPostalCodeLongitude
   */
  
  @Schema(name = "currentPostalCodeLongitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPostalCodeLongitude")
  public @Nullable Double getCurrentPostalCodeLongitude() {
    return currentPostalCodeLongitude;
  }

  public void setCurrentPostalCodeLongitude(@Nullable Double currentPostalCodeLongitude) {
    this.currentPostalCodeLongitude = currentPostalCodeLongitude;
  }

  public Account locationUpdated(@Nullable Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
    return this;
  }

  /**
   * Get locationUpdated
   * @return locationUpdated
   */
  
  @Schema(name = "locationUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationUpdated")
  public @Nullable Boolean getLocationUpdated() {
    return locationUpdated;
  }

  public void setLocationUpdated(@Nullable Boolean locationUpdated) {
    this.locationUpdated = locationUpdated;
  }

  public Account premigrationId(@Nullable Long premigrationId) {
    this.premigrationId = premigrationId;
    return this;
  }

  /**
   * Get premigrationId
   * @return premigrationId
   */
  
  @Schema(name = "premigrationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("premigrationId")
  public @Nullable Long getPremigrationId() {
    return premigrationId;
  }

  public void setPremigrationId(@Nullable Long premigrationId) {
    this.premigrationId = premigrationId;
  }

  public Account username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public Account locale(@Nullable String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public @Nullable String getLocale() {
    return locale;
  }

  public void setLocale(@Nullable String locale) {
    this.locale = locale;
  }

  public Account inviteCode(@Nullable String inviteCode) {
    this.inviteCode = inviteCode;
    return this;
  }

  /**
   * Get inviteCode
   * @return inviteCode
   */
  
  @Schema(name = "inviteCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviteCode")
  public @Nullable String getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(@Nullable String inviteCode) {
    this.inviteCode = inviteCode;
  }

  public Account retailerInviteCode(@Nullable String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
    return this;
  }

  /**
   * Get retailerInviteCode
   * @return retailerInviteCode
   */
  
  @Schema(name = "retailerInviteCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerInviteCode")
  public @Nullable String getRetailerInviteCode() {
    return retailerInviteCode;
  }

  public void setRetailerInviteCode(@Nullable String retailerInviteCode) {
    this.retailerInviteCode = retailerInviteCode;
  }

  public Account aboutUs(@Nullable String aboutUs) {
    this.aboutUs = aboutUs;
    return this;
  }

  /**
   * Get aboutUs
   * @return aboutUs
   */
  
  @Schema(name = "aboutUs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aboutUs")
  public @Nullable String getAboutUs() {
    return aboutUs;
  }

  public void setAboutUs(@Nullable String aboutUs) {
    this.aboutUs = aboutUs;
  }

  public Account businessName(@Nullable String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Get businessName
   * @return businessName
   */
  
  @Schema(name = "businessName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessName")
  public @Nullable String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(@Nullable String businessName) {
    this.businessName = businessName;
  }

  public Account likeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * Get likeCount
   * @return likeCount
   */
  
  @Schema(name = "likeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likeCount")
  public @Nullable Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
  }

  public Account dislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * Get dislikeCount
   * @return dislikeCount
   */
  
  @Schema(name = "dislikeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikeCount")
  public @Nullable Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(@Nullable Long dislikeCount) {
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
   */
  @Valid 
  @Schema(name = "thirdPartyCredentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyCredentials")
  public List<@Valid ThirdPartyCredentials> getThirdPartyCredentials() {
    return thirdPartyCredentials;
  }

  public void setThirdPartyCredentials(List<@Valid ThirdPartyCredentials> thirdPartyCredentials) {
    this.thirdPartyCredentials = thirdPartyCredentials;
  }

  public Account partnerActive(@Nullable Boolean partnerActive) {
    this.partnerActive = partnerActive;
    return this;
  }

  /**
   * Get partnerActive
   * @return partnerActive
   */
  
  @Schema(name = "partnerActive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerActive")
  public @Nullable Boolean getPartnerActive() {
    return partnerActive;
  }

  public void setPartnerActive(@Nullable Boolean partnerActive) {
    this.partnerActive = partnerActive;
  }

  public Account resetToken(@Nullable String resetToken) {
    this.resetToken = resetToken;
    return this;
  }

  /**
   * Get resetToken
   * @return resetToken
   */
  
  @Schema(name = "resetToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resetToken")
  public @Nullable String getResetToken() {
    return resetToken;
  }

  public void setResetToken(@Nullable String resetToken) {
    this.resetToken = resetToken;
  }

  public Account profileImage(@Nullable String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
   */
  
  @Schema(name = "profileImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profileImage")
  public @Nullable String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(@Nullable String profileImage) {
    this.profileImage = profileImage;
  }

  public Account accountType(@Nullable String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   */
  
  @Schema(name = "accountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountType")
  public @Nullable String getAccountType() {
    return accountType;
  }

  public void setAccountType(@Nullable String accountType) {
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
   */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public List<@Valid Asset> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid Asset> media) {
    this.media = media;
  }

  public Account picture(@Nullable Asset picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Get picture
   * @return picture
   */
  @Valid 
  @Schema(name = "picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture")
  public @Nullable Asset getPicture() {
    return picture;
  }

  public void setPicture(@Nullable Asset picture) {
    this.picture = picture;
  }

  public Account firstName(@Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public @Nullable String getFirstName() {
    return firstName;
  }

  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }

  public Account middleName(@Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
   */
  
  @Schema(name = "middleName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public @Nullable String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public Account lastName(@Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public @Nullable String getLastName() {
    return lastName;
  }

  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  public Account prefix(@Nullable String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   */
  
  @Schema(name = "prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefix")
  public @Nullable String getPrefix() {
    return prefix;
  }

  public void setPrefix(@Nullable String prefix) {
    this.prefix = prefix;
  }

  public Account suffix(@Nullable String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
   */
  
  @Schema(name = "suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public @Nullable String getSuffix() {
    return suffix;
  }

  public void setSuffix(@Nullable String suffix) {
    this.suffix = suffix;
  }

  public Account title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public Account homePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  /**
   * Get homePhone
   * @return homePhone
   */
  
  @Schema(name = "homePhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homePhone")
  public @Nullable String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
  }

  public Account cellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
   */
  
  @Schema(name = "cellPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellPhone")
  public @Nullable String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Account cellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

  /**
   * Get cellCarrier
   * @return cellCarrier
   */
  @Valid 
  @Schema(name = "cellCarrier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellCarrier")
  public @Nullable CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Account businessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

  /**
   * Get businessPhone
   * @return businessPhone
   */
  
  @Schema(name = "businessPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhone")
  public @Nullable String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Account businessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

  /**
   * Get businessPhoneExt
   * @return businessPhoneExt
   */
  
  @Schema(name = "businessPhoneExt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhoneExt")
  public @Nullable String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Account faxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Get faxNumber
   * @return faxNumber
   */
  
  @Schema(name = "faxNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("faxNumber")
  public @Nullable String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Account timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public Account utcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * Get utcOffset
   * @return utcOffset
   */
  
  @Schema(name = "utcOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("utcOffset")
  public @Nullable String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Account code501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

  /**
   * Get code501c3
   * @return code501c3
   */
  
  @Schema(name = "code501c3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code501c3")
  public @Nullable String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
  }

  public Account emailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  
  @Schema(name = "emailAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public @Nullable String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Account address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  public Account web(@Nullable String web) {
    this.web = web;
    return this;
  }

  /**
   * Get web
   * @return web
   */
  
  @Schema(name = "web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web")
  public @Nullable String getWeb() {
    return web;
  }

  public void setWeb(@Nullable String web) {
    this.web = web;
  }

  public Account display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public Account website(@Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
   */
  
  @Schema(name = "website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public @Nullable String getWebsite() {
    return website;
  }

  public void setWebsite(@Nullable String website) {
    this.website = website;
  }

  public Account consumersNotes(@Nullable String consumersNotes) {
    this.consumersNotes = consumersNotes;
    return this;
  }

  /**
   * Get consumersNotes
   * @return consumersNotes
   */
  
  @Schema(name = "consumersNotes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumersNotes")
  public @Nullable String getConsumersNotes() {
    return consumersNotes;
  }

  public void setConsumersNotes(@Nullable String consumersNotes) {
    this.consumersNotes = consumersNotes;
  }

  public Account consumersAboutUs(@Nullable String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
    return this;
  }

  /**
   * Get consumersAboutUs
   * @return consumersAboutUs
   */
  
  @Schema(name = "consumersAboutUs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumersAboutUs")
  public @Nullable String getConsumersAboutUs() {
    return consumersAboutUs;
  }

  public void setConsumersAboutUs(@Nullable String consumersAboutUs) {
    this.consumersAboutUs = consumersAboutUs;
  }

  public Account accountProfile(@Nullable AccountProfileInfo accountProfile) {
    this.accountProfile = accountProfile;
    return this;
  }

  /**
   * Get accountProfile
   * @return accountProfile
   */
  @Valid 
  @Schema(name = "accountProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountProfile")
  public @Nullable AccountProfileInfo getAccountProfile() {
    return accountProfile;
  }

  public void setAccountProfile(@Nullable AccountProfileInfo accountProfile) {
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
   */
  @Valid 
  @Schema(name = "retailerLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocations")
  public List<@Valid RetailerLocation> getRetailerLocations() {
    return retailerLocations;
  }

  public void setRetailerLocations(List<@Valid RetailerLocation> retailerLocations) {
    this.retailerLocations = retailerLocations;
  }

  public Account executive(@Nullable Boolean executive) {
    this.executive = executive;
    return this;
  }

  /**
   * Get executive
   * @return executive
   */
  
  @Schema(name = "executive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executive")
  public @Nullable Boolean getExecutive() {
    return executive;
  }

  public void setExecutive(@Nullable Boolean executive) {
    this.executive = executive;
  }

  public Account contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public Account defaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

  /**
   * Get defaultThreshold
   * @return defaultThreshold
   */
  
  @Schema(name = "defaultThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultThreshold")
  public @Nullable Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Account audienceInfoGender(@Nullable AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
    return this;
  }

  /**
   * Get audienceInfoGender
   * @return audienceInfoGender
   */
  
  @Schema(name = "audienceInfo_gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audienceInfo_gender")
  public @Nullable AudienceInfoGenderEnum getAudienceInfoGender() {
    return audienceInfoGender;
  }

  public void setAudienceInfoGender(@Nullable AudienceInfoGenderEnum audienceInfoGender) {
    this.audienceInfoGender = audienceInfoGender;
  }

  public Account flagThresholdId(@Nullable Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
    return this;
  }

  /**
   * Get flagThresholdId
   * @return flagThresholdId
   */
  
  @Schema(name = "flagThreshold_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagThreshold_id")
  public @Nullable Long getFlagThresholdId() {
    return flagThresholdId;
  }

  public void setFlagThresholdId(@Nullable Long flagThresholdId) {
    this.flagThresholdId = flagThresholdId;
  }

  public Account contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

