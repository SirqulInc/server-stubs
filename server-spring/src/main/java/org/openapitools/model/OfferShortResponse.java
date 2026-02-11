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
import org.openapitools.model.AssetResponse;
import org.openapitools.model.EventResponse;
import org.openapitools.model.MediaResponse;
import org.openapitools.model.MissionListResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ProductResponse;
import org.openapitools.model.RetailerLocationResponse;
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
 * OfferShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferShortResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long offerLocationId;

  private @Nullable Long offerId;

  private @Nullable Long retailerId;

  private @Nullable Long transactionId;

  private @Nullable Long favoriteId;

  private @Nullable String offerName;

  private @Nullable String subTitle;

  private @Nullable String locationName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime starts;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime expires;

  private @Nullable Long activated;

  private @Nullable Long expiration;

  private @Nullable Long redeemableStart;

  private @Nullable Long redeemableEnd;

  private @Nullable Double distance;

  private @Nullable String offerType;

  private @Nullable Double longitude;

  private @Nullable Double latitude;

  private @Nullable Boolean favorite;

  private @Nullable Double fullPrice;

  private @Nullable Double discountPrice;

  private @Nullable Double estimatedValue;

  private @Nullable Double voucherDiscountPrice;

  private @Nullable MissionListResponse missionListResponse;

  private @Nullable String image;

  private @Nullable String image1;

  private @Nullable String image2;

  private @Nullable String image3;

  private @Nullable String image4;

  private @Nullable String image5;

  @Valid
  private List<@Valid AssetResponse> images = new ArrayList<>();

  private @Nullable String barcode;

  private @Nullable String externalUrl;

  private @Nullable String sqootUrl;

  private @Nullable Boolean active;

  private @Nullable RetailerLocationResponse location;

  private @Nullable String subDetails;

  private @Nullable Integer externalRedeemAuth;

  private @Nullable String externalRedeemOptions;

  private @Nullable String publisher;

  private @Nullable ProductResponse product;

  private @Nullable EventResponse event;

  private @Nullable MediaResponse media;

  private @Nullable Integer viewedCount;

  private @Nullable Integer clickedCount;

  private @Nullable Integer addedLimit;

  private @Nullable Integer addedCount;

  private @Nullable Integer usedCount;

  private @Nullable Integer removedCount;

  private @Nullable Integer locationAddedCount;

  private @Nullable String barcodeEntry;

  /**
   * Gets or Sets barcodeType
   */
  public enum BarcodeTypeEnum {
    NONE("NONE"),
    
    UPC("UPC"),
    
    CODE_128("CODE_128"),
    
    QR("QR"),
    
    CUSTOM_MEDIA("CUSTOM_MEDIA");

    private final String value;

    BarcodeTypeEnum(String value) {
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
    public static BarcodeTypeEnum fromValue(String value) {
      for (BarcodeTypeEnum b : BarcodeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable BarcodeTypeEnum barcodeType;

  private @Nullable Long ticketsReward;

  private @Nullable String ticketsRewardType;

  /**
   * Gets or Sets specialOfferType
   */
  public enum SpecialOfferTypeEnum {
    ALL("ALL"),
    
    RESERVABLE("RESERVABLE"),
    
    REGULAR_OFFER("REGULAR_OFFER"),
    
    ACT_NOW("ACT_NOW"),
    
    GET_THERE_NOW("GET_THERE_NOW"),
    
    SQOOT("SQOOT"),
    
    TICKETS("TICKETS"),
    
    YIPIT("YIPIT");

    private final String value;

    SpecialOfferTypeEnum(String value) {
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
    public static SpecialOfferTypeEnum fromValue(String value) {
      for (SpecialOfferTypeEnum b : SpecialOfferTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SpecialOfferTypeEnum specialOfferType;

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable Long favoriteCount;

  private @Nullable Long noteCount;

  private @Nullable Long logId;

  private @Nullable Long billableEntityId;

  private @Nullable Long responsibleAccountId;

  private @Nullable String availabilitySummary;

  private @Nullable String externalId;

  private @Nullable OfferShortResponse parentOffer;

  private @Nullable String returning;

  public OfferShortResponse valid(@Nullable Boolean valid) {
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

  public OfferShortResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public OfferShortResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public OfferShortResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public OfferShortResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public OfferShortResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public OfferShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public OfferShortResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public OfferShortResponse offerLocationId(@Nullable Long offerLocationId) {
    this.offerLocationId = offerLocationId;
    return this;
  }

  /**
   * Get offerLocationId
   * @return offerLocationId
   */
  
  @Schema(name = "offerLocationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerLocationId")
  public @Nullable Long getOfferLocationId() {
    return offerLocationId;
  }

  public void setOfferLocationId(@Nullable Long offerLocationId) {
    this.offerLocationId = offerLocationId;
  }

  public OfferShortResponse offerId(@Nullable Long offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
   */
  
  @Schema(name = "offerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerId")
  public @Nullable Long getOfferId() {
    return offerId;
  }

  public void setOfferId(@Nullable Long offerId) {
    this.offerId = offerId;
  }

  public OfferShortResponse retailerId(@Nullable Long retailerId) {
    this.retailerId = retailerId;
    return this;
  }

  /**
   * Get retailerId
   * @return retailerId
   */
  
  @Schema(name = "retailerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerId")
  public @Nullable Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(@Nullable Long retailerId) {
    this.retailerId = retailerId;
  }

  public OfferShortResponse transactionId(@Nullable Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   */
  
  @Schema(name = "transactionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactionId")
  public @Nullable Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(@Nullable Long transactionId) {
    this.transactionId = transactionId;
  }

  public OfferShortResponse favoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

  /**
   * Get favoriteId
   * @return favoriteId
   */
  
  @Schema(name = "favoriteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteId")
  public @Nullable Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public OfferShortResponse offerName(@Nullable String offerName) {
    this.offerName = offerName;
    return this;
  }

  /**
   * Get offerName
   * @return offerName
   */
  
  @Schema(name = "offerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerName")
  public @Nullable String getOfferName() {
    return offerName;
  }

  public void setOfferName(@Nullable String offerName) {
    this.offerName = offerName;
  }

  public OfferShortResponse subTitle(@Nullable String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  /**
   * Get subTitle
   * @return subTitle
   */
  
  @Schema(name = "subTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subTitle")
  public @Nullable String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(@Nullable String subTitle) {
    this.subTitle = subTitle;
  }

  public OfferShortResponse locationName(@Nullable String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * Get locationName
   * @return locationName
   */
  
  @Schema(name = "locationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationName")
  public @Nullable String getLocationName() {
    return locationName;
  }

  public void setLocationName(@Nullable String locationName) {
    this.locationName = locationName;
  }

  public OfferShortResponse starts(@Nullable OffsetDateTime starts) {
    this.starts = starts;
    return this;
  }

  /**
   * Get starts
   * @return starts
   */
  @Valid 
  @Schema(name = "starts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("starts")
  public @Nullable OffsetDateTime getStarts() {
    return starts;
  }

  public void setStarts(@Nullable OffsetDateTime starts) {
    this.starts = starts;
  }

  public OfferShortResponse expires(@Nullable OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * @return expires
   */
  @Valid 
  @Schema(name = "expires", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires")
  public @Nullable OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(@Nullable OffsetDateTime expires) {
    this.expires = expires;
  }

  public OfferShortResponse activated(@Nullable Long activated) {
    this.activated = activated;
    return this;
  }

  /**
   * Get activated
   * @return activated
   */
  
  @Schema(name = "activated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activated")
  public @Nullable Long getActivated() {
    return activated;
  }

  public void setActivated(@Nullable Long activated) {
    this.activated = activated;
  }

  public OfferShortResponse expiration(@Nullable Long expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
   */
  
  @Schema(name = "expiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiration")
  public @Nullable Long getExpiration() {
    return expiration;
  }

  public void setExpiration(@Nullable Long expiration) {
    this.expiration = expiration;
  }

  public OfferShortResponse redeemableStart(@Nullable Long redeemableStart) {
    this.redeemableStart = redeemableStart;
    return this;
  }

  /**
   * Get redeemableStart
   * @return redeemableStart
   */
  
  @Schema(name = "redeemableStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redeemableStart")
  public @Nullable Long getRedeemableStart() {
    return redeemableStart;
  }

  public void setRedeemableStart(@Nullable Long redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  public OfferShortResponse redeemableEnd(@Nullable Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
    return this;
  }

  /**
   * Get redeemableEnd
   * @return redeemableEnd
   */
  
  @Schema(name = "redeemableEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redeemableEnd")
  public @Nullable Long getRedeemableEnd() {
    return redeemableEnd;
  }

  public void setRedeemableEnd(@Nullable Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  public OfferShortResponse distance(@Nullable Double distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
   */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public @Nullable Double getDistance() {
    return distance;
  }

  public void setDistance(@Nullable Double distance) {
    this.distance = distance;
  }

  public OfferShortResponse offerType(@Nullable String offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Get offerType
   * @return offerType
   */
  
  @Schema(name = "offerType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerType")
  public @Nullable String getOfferType() {
    return offerType;
  }

  public void setOfferType(@Nullable String offerType) {
    this.offerType = offerType;
  }

  public OfferShortResponse longitude(@Nullable Double longitude) {
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

  public OfferShortResponse latitude(@Nullable Double latitude) {
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

  public OfferShortResponse favorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
   */
  
  @Schema(name = "favorite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favorite")
  public @Nullable Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
  }

  public OfferShortResponse fullPrice(@Nullable Double fullPrice) {
    this.fullPrice = fullPrice;
    return this;
  }

  /**
   * Get fullPrice
   * @return fullPrice
   */
  
  @Schema(name = "fullPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullPrice")
  public @Nullable Double getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(@Nullable Double fullPrice) {
    this.fullPrice = fullPrice;
  }

  public OfferShortResponse discountPrice(@Nullable Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

  /**
   * Get discountPrice
   * @return discountPrice
   */
  
  @Schema(name = "discountPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountPrice")
  public @Nullable Double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(@Nullable Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public OfferShortResponse estimatedValue(@Nullable Double estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

  /**
   * Get estimatedValue
   * @return estimatedValue
   */
  
  @Schema(name = "estimatedValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedValue")
  public @Nullable Double getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(@Nullable Double estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public OfferShortResponse voucherDiscountPrice(@Nullable Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
    return this;
  }

  /**
   * Get voucherDiscountPrice
   * @return voucherDiscountPrice
   */
  
  @Schema(name = "voucherDiscountPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voucherDiscountPrice")
  public @Nullable Double getVoucherDiscountPrice() {
    return voucherDiscountPrice;
  }

  public void setVoucherDiscountPrice(@Nullable Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
  }

  public OfferShortResponse missionListResponse(@Nullable MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
    return this;
  }

  /**
   * Get missionListResponse
   * @return missionListResponse
   */
  @Valid 
  @Schema(name = "missionListResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missionListResponse")
  public @Nullable MissionListResponse getMissionListResponse() {
    return missionListResponse;
  }

  public void setMissionListResponse(@Nullable MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
  }

  public OfferShortResponse image(@Nullable String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable String getImage() {
    return image;
  }

  public void setImage(@Nullable String image) {
    this.image = image;
  }

  public OfferShortResponse image1(@Nullable String image1) {
    this.image1 = image1;
    return this;
  }

  /**
   * Get image1
   * @return image1
   */
  
  @Schema(name = "image1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image1")
  public @Nullable String getImage1() {
    return image1;
  }

  public void setImage1(@Nullable String image1) {
    this.image1 = image1;
  }

  public OfferShortResponse image2(@Nullable String image2) {
    this.image2 = image2;
    return this;
  }

  /**
   * Get image2
   * @return image2
   */
  
  @Schema(name = "image2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image2")
  public @Nullable String getImage2() {
    return image2;
  }

  public void setImage2(@Nullable String image2) {
    this.image2 = image2;
  }

  public OfferShortResponse image3(@Nullable String image3) {
    this.image3 = image3;
    return this;
  }

  /**
   * Get image3
   * @return image3
   */
  
  @Schema(name = "image3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image3")
  public @Nullable String getImage3() {
    return image3;
  }

  public void setImage3(@Nullable String image3) {
    this.image3 = image3;
  }

  public OfferShortResponse image4(@Nullable String image4) {
    this.image4 = image4;
    return this;
  }

  /**
   * Get image4
   * @return image4
   */
  
  @Schema(name = "image4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image4")
  public @Nullable String getImage4() {
    return image4;
  }

  public void setImage4(@Nullable String image4) {
    this.image4 = image4;
  }

  public OfferShortResponse image5(@Nullable String image5) {
    this.image5 = image5;
    return this;
  }

  /**
   * Get image5
   * @return image5
   */
  
  @Schema(name = "image5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image5")
  public @Nullable String getImage5() {
    return image5;
  }

  public void setImage5(@Nullable String image5) {
    this.image5 = image5;
  }

  public OfferShortResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public OfferShortResponse addImagesItem(AssetResponse imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public List<@Valid AssetResponse> getImages() {
    return images;
  }

  public void setImages(List<@Valid AssetResponse> images) {
    this.images = images;
  }

  public OfferShortResponse barcode(@Nullable String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
   */
  
  @Schema(name = "barcode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barcode")
  public @Nullable String getBarcode() {
    return barcode;
  }

  public void setBarcode(@Nullable String barcode) {
    this.barcode = barcode;
  }

  public OfferShortResponse externalUrl(@Nullable String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * Get externalUrl
   * @return externalUrl
   */
  
  @Schema(name = "externalUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalUrl")
  public @Nullable String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(@Nullable String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public OfferShortResponse sqootUrl(@Nullable String sqootUrl) {
    this.sqootUrl = sqootUrl;
    return this;
  }

  /**
   * Get sqootUrl
   * @return sqootUrl
   */
  
  @Schema(name = "sqootUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootUrl")
  public @Nullable String getSqootUrl() {
    return sqootUrl;
  }

  public void setSqootUrl(@Nullable String sqootUrl) {
    this.sqootUrl = sqootUrl;
  }

  public OfferShortResponse active(@Nullable Boolean active) {
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

  public OfferShortResponse location(@Nullable RetailerLocationResponse location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable RetailerLocationResponse getLocation() {
    return location;
  }

  public void setLocation(@Nullable RetailerLocationResponse location) {
    this.location = location;
  }

  public OfferShortResponse subDetails(@Nullable String subDetails) {
    this.subDetails = subDetails;
    return this;
  }

  /**
   * Get subDetails
   * @return subDetails
   */
  
  @Schema(name = "subDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subDetails")
  public @Nullable String getSubDetails() {
    return subDetails;
  }

  public void setSubDetails(@Nullable String subDetails) {
    this.subDetails = subDetails;
  }

  public OfferShortResponse externalRedeemAuth(@Nullable Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
    return this;
  }

  /**
   * Get externalRedeemAuth
   * @return externalRedeemAuth
   */
  
  @Schema(name = "externalRedeemAuth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalRedeemAuth")
  public @Nullable Integer getExternalRedeemAuth() {
    return externalRedeemAuth;
  }

  public void setExternalRedeemAuth(@Nullable Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
  }

  public OfferShortResponse externalRedeemOptions(@Nullable String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
    return this;
  }

  /**
   * Get externalRedeemOptions
   * @return externalRedeemOptions
   */
  
  @Schema(name = "externalRedeemOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalRedeemOptions")
  public @Nullable String getExternalRedeemOptions() {
    return externalRedeemOptions;
  }

  public void setExternalRedeemOptions(@Nullable String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
  }

  public OfferShortResponse publisher(@Nullable String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   * @return publisher
   */
  
  @Schema(name = "publisher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publisher")
  public @Nullable String getPublisher() {
    return publisher;
  }

  public void setPublisher(@Nullable String publisher) {
    this.publisher = publisher;
  }

  public OfferShortResponse product(@Nullable ProductResponse product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
   */
  @Valid 
  @Schema(name = "product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product")
  public @Nullable ProductResponse getProduct() {
    return product;
  }

  public void setProduct(@Nullable ProductResponse product) {
    this.product = product;
  }

  public OfferShortResponse event(@Nullable EventResponse event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public @Nullable EventResponse getEvent() {
    return event;
  }

  public void setEvent(@Nullable EventResponse event) {
    this.event = event;
  }

  public OfferShortResponse media(@Nullable MediaResponse media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public @Nullable MediaResponse getMedia() {
    return media;
  }

  public void setMedia(@Nullable MediaResponse media) {
    this.media = media;
  }

  public OfferShortResponse viewedCount(@Nullable Integer viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

  /**
   * Get viewedCount
   * @return viewedCount
   */
  
  @Schema(name = "viewedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewedCount")
  public @Nullable Integer getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(@Nullable Integer viewedCount) {
    this.viewedCount = viewedCount;
  }

  public OfferShortResponse clickedCount(@Nullable Integer clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

  /**
   * Get clickedCount
   * @return clickedCount
   */
  
  @Schema(name = "clickedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clickedCount")
  public @Nullable Integer getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(@Nullable Integer clickedCount) {
    this.clickedCount = clickedCount;
  }

  public OfferShortResponse addedLimit(@Nullable Integer addedLimit) {
    this.addedLimit = addedLimit;
    return this;
  }

  /**
   * Get addedLimit
   * @return addedLimit
   */
  
  @Schema(name = "addedLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addedLimit")
  public @Nullable Integer getAddedLimit() {
    return addedLimit;
  }

  public void setAddedLimit(@Nullable Integer addedLimit) {
    this.addedLimit = addedLimit;
  }

  public OfferShortResponse addedCount(@Nullable Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

  /**
   * Get addedCount
   * @return addedCount
   */
  
  @Schema(name = "addedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addedCount")
  public @Nullable Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(@Nullable Integer addedCount) {
    this.addedCount = addedCount;
  }

  public OfferShortResponse usedCount(@Nullable Integer usedCount) {
    this.usedCount = usedCount;
    return this;
  }

  /**
   * Get usedCount
   * @return usedCount
   */
  
  @Schema(name = "usedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usedCount")
  public @Nullable Integer getUsedCount() {
    return usedCount;
  }

  public void setUsedCount(@Nullable Integer usedCount) {
    this.usedCount = usedCount;
  }

  public OfferShortResponse removedCount(@Nullable Integer removedCount) {
    this.removedCount = removedCount;
    return this;
  }

  /**
   * Get removedCount
   * @return removedCount
   */
  
  @Schema(name = "removedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removedCount")
  public @Nullable Integer getRemovedCount() {
    return removedCount;
  }

  public void setRemovedCount(@Nullable Integer removedCount) {
    this.removedCount = removedCount;
  }

  public OfferShortResponse locationAddedCount(@Nullable Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
    return this;
  }

  /**
   * Get locationAddedCount
   * @return locationAddedCount
   */
  
  @Schema(name = "locationAddedCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationAddedCount")
  public @Nullable Integer getLocationAddedCount() {
    return locationAddedCount;
  }

  public void setLocationAddedCount(@Nullable Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
  }

  public OfferShortResponse barcodeEntry(@Nullable String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
    return this;
  }

  /**
   * Get barcodeEntry
   * @return barcodeEntry
   */
  
  @Schema(name = "barcodeEntry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barcodeEntry")
  public @Nullable String getBarcodeEntry() {
    return barcodeEntry;
  }

  public void setBarcodeEntry(@Nullable String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
  }

  public OfferShortResponse barcodeType(@Nullable BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

  /**
   * Get barcodeType
   * @return barcodeType
   */
  
  @Schema(name = "barcodeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barcodeType")
  public @Nullable BarcodeTypeEnum getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(@Nullable BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
  }

  public OfferShortResponse ticketsReward(@Nullable Long ticketsReward) {
    this.ticketsReward = ticketsReward;
    return this;
  }

  /**
   * Get ticketsReward
   * @return ticketsReward
   */
  
  @Schema(name = "ticketsReward", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsReward")
  public @Nullable Long getTicketsReward() {
    return ticketsReward;
  }

  public void setTicketsReward(@Nullable Long ticketsReward) {
    this.ticketsReward = ticketsReward;
  }

  public OfferShortResponse ticketsRewardType(@Nullable String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
    return this;
  }

  /**
   * Get ticketsRewardType
   * @return ticketsRewardType
   */
  
  @Schema(name = "ticketsRewardType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketsRewardType")
  public @Nullable String getTicketsRewardType() {
    return ticketsRewardType;
  }

  public void setTicketsRewardType(@Nullable String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
  }

  public OfferShortResponse specialOfferType(@Nullable SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
    return this;
  }

  /**
   * Get specialOfferType
   * @return specialOfferType
   */
  
  @Schema(name = "specialOfferType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialOfferType")
  public @Nullable SpecialOfferTypeEnum getSpecialOfferType() {
    return specialOfferType;
  }

  public void setSpecialOfferType(@Nullable SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
  }

  public OfferShortResponse likeCount(@Nullable Long likeCount) {
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

  public OfferShortResponse dislikeCount(@Nullable Long dislikeCount) {
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

  public OfferShortResponse favoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

  /**
   * Get favoriteCount
   * @return favoriteCount
   */
  
  @Schema(name = "favoriteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteCount")
  public @Nullable Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public OfferShortResponse noteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

  /**
   * Get noteCount
   * @return noteCount
   */
  
  @Schema(name = "noteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteCount")
  public @Nullable Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
  }

  public OfferShortResponse logId(@Nullable Long logId) {
    this.logId = logId;
    return this;
  }

  /**
   * Get logId
   * @return logId
   */
  
  @Schema(name = "logId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logId")
  public @Nullable Long getLogId() {
    return logId;
  }

  public void setLogId(@Nullable Long logId) {
    this.logId = logId;
  }

  public OfferShortResponse billableEntityId(@Nullable Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

  /**
   * Get billableEntityId
   * @return billableEntityId
   */
  
  @Schema(name = "billableEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntityId")
  public @Nullable Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(@Nullable Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public OfferShortResponse responsibleAccountId(@Nullable Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
    return this;
  }

  /**
   * Get responsibleAccountId
   * @return responsibleAccountId
   */
  
  @Schema(name = "responsibleAccountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsibleAccountId")
  public @Nullable Long getResponsibleAccountId() {
    return responsibleAccountId;
  }

  public void setResponsibleAccountId(@Nullable Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
  }

  public OfferShortResponse availabilitySummary(@Nullable String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
    return this;
  }

  /**
   * Get availabilitySummary
   * @return availabilitySummary
   */
  
  @Schema(name = "availabilitySummary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availabilitySummary")
  public @Nullable String getAvailabilitySummary() {
    return availabilitySummary;
  }

  public void setAvailabilitySummary(@Nullable String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
  }

  public OfferShortResponse externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public OfferShortResponse parentOffer(@Nullable OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
    return this;
  }

  /**
   * Get parentOffer
   * @return parentOffer
   */
  @Valid 
  @Schema(name = "parentOffer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentOffer")
  public @Nullable OfferShortResponse getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(@Nullable OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
  }

  public OfferShortResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferShortResponse offerShortResponse = (OfferShortResponse) o;
    return Objects.equals(this.valid, offerShortResponse.valid) &&
        Objects.equals(this.message, offerShortResponse.message) &&
        Objects.equals(this.version, offerShortResponse.version) &&
        Objects.equals(this.serializeNulls, offerShortResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, offerShortResponse.startTimeLog) &&
        Objects.equals(this.errorCode, offerShortResponse.errorCode) &&
        Objects.equals(this.request, offerShortResponse.request) &&
        Objects.equals(this.offerLocationId, offerShortResponse.offerLocationId) &&
        Objects.equals(this.offerId, offerShortResponse.offerId) &&
        Objects.equals(this.retailerId, offerShortResponse.retailerId) &&
        Objects.equals(this.transactionId, offerShortResponse.transactionId) &&
        Objects.equals(this.favoriteId, offerShortResponse.favoriteId) &&
        Objects.equals(this.offerName, offerShortResponse.offerName) &&
        Objects.equals(this.subTitle, offerShortResponse.subTitle) &&
        Objects.equals(this.locationName, offerShortResponse.locationName) &&
        Objects.equals(this.starts, offerShortResponse.starts) &&
        Objects.equals(this.expires, offerShortResponse.expires) &&
        Objects.equals(this.activated, offerShortResponse.activated) &&
        Objects.equals(this.expiration, offerShortResponse.expiration) &&
        Objects.equals(this.redeemableStart, offerShortResponse.redeemableStart) &&
        Objects.equals(this.redeemableEnd, offerShortResponse.redeemableEnd) &&
        Objects.equals(this.distance, offerShortResponse.distance) &&
        Objects.equals(this.offerType, offerShortResponse.offerType) &&
        Objects.equals(this.longitude, offerShortResponse.longitude) &&
        Objects.equals(this.latitude, offerShortResponse.latitude) &&
        Objects.equals(this.favorite, offerShortResponse.favorite) &&
        Objects.equals(this.fullPrice, offerShortResponse.fullPrice) &&
        Objects.equals(this.discountPrice, offerShortResponse.discountPrice) &&
        Objects.equals(this.estimatedValue, offerShortResponse.estimatedValue) &&
        Objects.equals(this.voucherDiscountPrice, offerShortResponse.voucherDiscountPrice) &&
        Objects.equals(this.missionListResponse, offerShortResponse.missionListResponse) &&
        Objects.equals(this.image, offerShortResponse.image) &&
        Objects.equals(this.image1, offerShortResponse.image1) &&
        Objects.equals(this.image2, offerShortResponse.image2) &&
        Objects.equals(this.image3, offerShortResponse.image3) &&
        Objects.equals(this.image4, offerShortResponse.image4) &&
        Objects.equals(this.image5, offerShortResponse.image5) &&
        Objects.equals(this.images, offerShortResponse.images) &&
        Objects.equals(this.barcode, offerShortResponse.barcode) &&
        Objects.equals(this.externalUrl, offerShortResponse.externalUrl) &&
        Objects.equals(this.sqootUrl, offerShortResponse.sqootUrl) &&
        Objects.equals(this.active, offerShortResponse.active) &&
        Objects.equals(this.location, offerShortResponse.location) &&
        Objects.equals(this.subDetails, offerShortResponse.subDetails) &&
        Objects.equals(this.externalRedeemAuth, offerShortResponse.externalRedeemAuth) &&
        Objects.equals(this.externalRedeemOptions, offerShortResponse.externalRedeemOptions) &&
        Objects.equals(this.publisher, offerShortResponse.publisher) &&
        Objects.equals(this.product, offerShortResponse.product) &&
        Objects.equals(this.event, offerShortResponse.event) &&
        Objects.equals(this.media, offerShortResponse.media) &&
        Objects.equals(this.viewedCount, offerShortResponse.viewedCount) &&
        Objects.equals(this.clickedCount, offerShortResponse.clickedCount) &&
        Objects.equals(this.addedLimit, offerShortResponse.addedLimit) &&
        Objects.equals(this.addedCount, offerShortResponse.addedCount) &&
        Objects.equals(this.usedCount, offerShortResponse.usedCount) &&
        Objects.equals(this.removedCount, offerShortResponse.removedCount) &&
        Objects.equals(this.locationAddedCount, offerShortResponse.locationAddedCount) &&
        Objects.equals(this.barcodeEntry, offerShortResponse.barcodeEntry) &&
        Objects.equals(this.barcodeType, offerShortResponse.barcodeType) &&
        Objects.equals(this.ticketsReward, offerShortResponse.ticketsReward) &&
        Objects.equals(this.ticketsRewardType, offerShortResponse.ticketsRewardType) &&
        Objects.equals(this.specialOfferType, offerShortResponse.specialOfferType) &&
        Objects.equals(this.likeCount, offerShortResponse.likeCount) &&
        Objects.equals(this.dislikeCount, offerShortResponse.dislikeCount) &&
        Objects.equals(this.favoriteCount, offerShortResponse.favoriteCount) &&
        Objects.equals(this.noteCount, offerShortResponse.noteCount) &&
        Objects.equals(this.logId, offerShortResponse.logId) &&
        Objects.equals(this.billableEntityId, offerShortResponse.billableEntityId) &&
        Objects.equals(this.responsibleAccountId, offerShortResponse.responsibleAccountId) &&
        Objects.equals(this.availabilitySummary, offerShortResponse.availabilitySummary) &&
        Objects.equals(this.externalId, offerShortResponse.externalId) &&
        Objects.equals(this.parentOffer, offerShortResponse.parentOffer) &&
        Objects.equals(this.returning, offerShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, offerLocationId, offerId, retailerId, transactionId, favoriteId, offerName, subTitle, locationName, starts, expires, activated, expiration, redeemableStart, redeemableEnd, distance, offerType, longitude, latitude, favorite, fullPrice, discountPrice, estimatedValue, voucherDiscountPrice, missionListResponse, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, sqootUrl, active, location, subDetails, externalRedeemAuth, externalRedeemOptions, publisher, product, event, media, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, locationAddedCount, barcodeEntry, barcodeType, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, logId, billableEntityId, responsibleAccountId, availabilitySummary, externalId, parentOffer, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferShortResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    offerLocationId: ").append(toIndentedString(offerLocationId)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    starts: ").append(toIndentedString(starts)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    redeemableStart: ").append(toIndentedString(redeemableStart)).append("\n");
    sb.append("    redeemableEnd: ").append(toIndentedString(redeemableEnd)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    estimatedValue: ").append(toIndentedString(estimatedValue)).append("\n");
    sb.append("    voucherDiscountPrice: ").append(toIndentedString(voucherDiscountPrice)).append("\n");
    sb.append("    missionListResponse: ").append(toIndentedString(missionListResponse)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    image1: ").append(toIndentedString(image1)).append("\n");
    sb.append("    image2: ").append(toIndentedString(image2)).append("\n");
    sb.append("    image3: ").append(toIndentedString(image3)).append("\n");
    sb.append("    image4: ").append(toIndentedString(image4)).append("\n");
    sb.append("    image5: ").append(toIndentedString(image5)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    sqootUrl: ").append(toIndentedString(sqootUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    subDetails: ").append(toIndentedString(subDetails)).append("\n");
    sb.append("    externalRedeemAuth: ").append(toIndentedString(externalRedeemAuth)).append("\n");
    sb.append("    externalRedeemOptions: ").append(toIndentedString(externalRedeemOptions)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    viewedCount: ").append(toIndentedString(viewedCount)).append("\n");
    sb.append("    clickedCount: ").append(toIndentedString(clickedCount)).append("\n");
    sb.append("    addedLimit: ").append(toIndentedString(addedLimit)).append("\n");
    sb.append("    addedCount: ").append(toIndentedString(addedCount)).append("\n");
    sb.append("    usedCount: ").append(toIndentedString(usedCount)).append("\n");
    sb.append("    removedCount: ").append(toIndentedString(removedCount)).append("\n");
    sb.append("    locationAddedCount: ").append(toIndentedString(locationAddedCount)).append("\n");
    sb.append("    barcodeEntry: ").append(toIndentedString(barcodeEntry)).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    ticketsReward: ").append(toIndentedString(ticketsReward)).append("\n");
    sb.append("    ticketsRewardType: ").append(toIndentedString(ticketsRewardType)).append("\n");
    sb.append("    specialOfferType: ").append(toIndentedString(specialOfferType)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    billableEntityId: ").append(toIndentedString(billableEntityId)).append("\n");
    sb.append("    responsibleAccountId: ").append(toIndentedString(responsibleAccountId)).append("\n");
    sb.append("    availabilitySummary: ").append(toIndentedString(availabilitySummary)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    parentOffer: ").append(toIndentedString(parentOffer)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

