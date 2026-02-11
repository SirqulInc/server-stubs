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
import java.util.Map;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.EventResponse;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.MediaResponse;
import org.openapitools.model.MissionListResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.OfferShortResponse;
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
 * RetailerOfferResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerOfferResponse {

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

  private @Nullable String address;

  private @Nullable String details;

  private @Nullable String finePrint;

  private @Nullable String retailerPhoneNumber;

  private @Nullable String ticketPriceType;

  private @Nullable Long ticketPrice;

  private @Nullable Double discountPercentage;

  private @Nullable Double paymentFees;

  private @Nullable Double voucherPrice;

  private @Nullable Integer purchasesRemaining;

  private @Nullable Integer redemptionsRemaining;

  private @Nullable Integer redemptionStatus;

  private @Nullable String redemptionCode;

  @Valid
  private List<@Valid AudienceResponse> audiences = new ArrayList<>();

  private @Nullable Integer audienceCount;

  private @Nullable Integer walletCount;

  private @Nullable String qrCodeUrl;

  private @Nullable Boolean showRemaining;

  private @Nullable Boolean showRedeemed;

  private @Nullable Integer purchaseLimit;

  private @Nullable Integer purchaseLimitPerUser;

  private @Nullable Integer redemptionLimit;

  private @Nullable Integer userRedemptionLimit;

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @Valid
  private List<@Valid FilterResponse> filters = new ArrayList<>();

  @Valid
  private List<Map<String, Object>> locations = new ArrayList<>();

  private @Nullable String returning;

  public RetailerOfferResponse valid(@Nullable Boolean valid) {
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

  public RetailerOfferResponse message(@Nullable String message) {
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

  public RetailerOfferResponse version(@Nullable Double version) {
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

  public RetailerOfferResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public RetailerOfferResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public RetailerOfferResponse errorCode(@Nullable String errorCode) {
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

  public RetailerOfferResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public RetailerOfferResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public RetailerOfferResponse offerLocationId(@Nullable Long offerLocationId) {
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

  public RetailerOfferResponse offerId(@Nullable Long offerId) {
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

  public RetailerOfferResponse retailerId(@Nullable Long retailerId) {
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

  public RetailerOfferResponse transactionId(@Nullable Long transactionId) {
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

  public RetailerOfferResponse favoriteId(@Nullable Long favoriteId) {
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

  public RetailerOfferResponse offerName(@Nullable String offerName) {
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

  public RetailerOfferResponse subTitle(@Nullable String subTitle) {
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

  public RetailerOfferResponse locationName(@Nullable String locationName) {
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

  public RetailerOfferResponse starts(@Nullable OffsetDateTime starts) {
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

  public RetailerOfferResponse expires(@Nullable OffsetDateTime expires) {
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

  public RetailerOfferResponse activated(@Nullable Long activated) {
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

  public RetailerOfferResponse expiration(@Nullable Long expiration) {
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

  public RetailerOfferResponse redeemableStart(@Nullable Long redeemableStart) {
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

  public RetailerOfferResponse redeemableEnd(@Nullable Long redeemableEnd) {
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

  public RetailerOfferResponse distance(@Nullable Double distance) {
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

  public RetailerOfferResponse offerType(@Nullable String offerType) {
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

  public RetailerOfferResponse longitude(@Nullable Double longitude) {
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

  public RetailerOfferResponse latitude(@Nullable Double latitude) {
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

  public RetailerOfferResponse favorite(@Nullable Boolean favorite) {
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

  public RetailerOfferResponse fullPrice(@Nullable Double fullPrice) {
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

  public RetailerOfferResponse discountPrice(@Nullable Double discountPrice) {
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

  public RetailerOfferResponse estimatedValue(@Nullable Double estimatedValue) {
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

  public RetailerOfferResponse voucherDiscountPrice(@Nullable Double voucherDiscountPrice) {
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

  public RetailerOfferResponse missionListResponse(@Nullable MissionListResponse missionListResponse) {
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

  public RetailerOfferResponse image(@Nullable String image) {
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

  public RetailerOfferResponse image1(@Nullable String image1) {
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

  public RetailerOfferResponse image2(@Nullable String image2) {
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

  public RetailerOfferResponse image3(@Nullable String image3) {
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

  public RetailerOfferResponse image4(@Nullable String image4) {
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

  public RetailerOfferResponse image5(@Nullable String image5) {
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

  public RetailerOfferResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public RetailerOfferResponse addImagesItem(AssetResponse imagesItem) {
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

  public RetailerOfferResponse barcode(@Nullable String barcode) {
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

  public RetailerOfferResponse externalUrl(@Nullable String externalUrl) {
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

  public RetailerOfferResponse sqootUrl(@Nullable String sqootUrl) {
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

  public RetailerOfferResponse active(@Nullable Boolean active) {
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

  public RetailerOfferResponse location(@Nullable RetailerLocationResponse location) {
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

  public RetailerOfferResponse subDetails(@Nullable String subDetails) {
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

  public RetailerOfferResponse externalRedeemAuth(@Nullable Integer externalRedeemAuth) {
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

  public RetailerOfferResponse externalRedeemOptions(@Nullable String externalRedeemOptions) {
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

  public RetailerOfferResponse publisher(@Nullable String publisher) {
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

  public RetailerOfferResponse product(@Nullable ProductResponse product) {
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

  public RetailerOfferResponse event(@Nullable EventResponse event) {
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

  public RetailerOfferResponse media(@Nullable MediaResponse media) {
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

  public RetailerOfferResponse viewedCount(@Nullable Integer viewedCount) {
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

  public RetailerOfferResponse clickedCount(@Nullable Integer clickedCount) {
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

  public RetailerOfferResponse addedLimit(@Nullable Integer addedLimit) {
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

  public RetailerOfferResponse addedCount(@Nullable Integer addedCount) {
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

  public RetailerOfferResponse usedCount(@Nullable Integer usedCount) {
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

  public RetailerOfferResponse removedCount(@Nullable Integer removedCount) {
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

  public RetailerOfferResponse locationAddedCount(@Nullable Integer locationAddedCount) {
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

  public RetailerOfferResponse barcodeEntry(@Nullable String barcodeEntry) {
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

  public RetailerOfferResponse barcodeType(@Nullable BarcodeTypeEnum barcodeType) {
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

  public RetailerOfferResponse ticketsReward(@Nullable Long ticketsReward) {
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

  public RetailerOfferResponse ticketsRewardType(@Nullable String ticketsRewardType) {
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

  public RetailerOfferResponse specialOfferType(@Nullable SpecialOfferTypeEnum specialOfferType) {
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

  public RetailerOfferResponse likeCount(@Nullable Long likeCount) {
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

  public RetailerOfferResponse dislikeCount(@Nullable Long dislikeCount) {
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

  public RetailerOfferResponse favoriteCount(@Nullable Long favoriteCount) {
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

  public RetailerOfferResponse noteCount(@Nullable Long noteCount) {
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

  public RetailerOfferResponse logId(@Nullable Long logId) {
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

  public RetailerOfferResponse billableEntityId(@Nullable Long billableEntityId) {
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

  public RetailerOfferResponse responsibleAccountId(@Nullable Long responsibleAccountId) {
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

  public RetailerOfferResponse availabilitySummary(@Nullable String availabilitySummary) {
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

  public RetailerOfferResponse externalId(@Nullable String externalId) {
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

  public RetailerOfferResponse parentOffer(@Nullable OfferShortResponse parentOffer) {
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

  public RetailerOfferResponse address(@Nullable String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable String getAddress() {
    return address;
  }

  public void setAddress(@Nullable String address) {
    this.address = address;
  }

  public RetailerOfferResponse details(@Nullable String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public @Nullable String getDetails() {
    return details;
  }

  public void setDetails(@Nullable String details) {
    this.details = details;
  }

  public RetailerOfferResponse finePrint(@Nullable String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

  /**
   * Get finePrint
   * @return finePrint
   */
  
  @Schema(name = "finePrint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finePrint")
  public @Nullable String getFinePrint() {
    return finePrint;
  }

  public void setFinePrint(@Nullable String finePrint) {
    this.finePrint = finePrint;
  }

  public RetailerOfferResponse retailerPhoneNumber(@Nullable String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
    return this;
  }

  /**
   * Get retailerPhoneNumber
   * @return retailerPhoneNumber
   */
  
  @Schema(name = "retailerPhoneNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerPhoneNumber")
  public @Nullable String getRetailerPhoneNumber() {
    return retailerPhoneNumber;
  }

  public void setRetailerPhoneNumber(@Nullable String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
  }

  public RetailerOfferResponse ticketPriceType(@Nullable String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
    return this;
  }

  /**
   * Get ticketPriceType
   * @return ticketPriceType
   */
  
  @Schema(name = "ticketPriceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketPriceType")
  public @Nullable String getTicketPriceType() {
    return ticketPriceType;
  }

  public void setTicketPriceType(@Nullable String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
  }

  public RetailerOfferResponse ticketPrice(@Nullable Long ticketPrice) {
    this.ticketPrice = ticketPrice;
    return this;
  }

  /**
   * Get ticketPrice
   * @return ticketPrice
   */
  
  @Schema(name = "ticketPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketPrice")
  public @Nullable Long getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(@Nullable Long ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public RetailerOfferResponse discountPercentage(@Nullable Double discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

  /**
   * Get discountPercentage
   * @return discountPercentage
   */
  
  @Schema(name = "discountPercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountPercentage")
  public @Nullable Double getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(@Nullable Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public RetailerOfferResponse paymentFees(@Nullable Double paymentFees) {
    this.paymentFees = paymentFees;
    return this;
  }

  /**
   * Get paymentFees
   * @return paymentFees
   */
  
  @Schema(name = "paymentFees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentFees")
  public @Nullable Double getPaymentFees() {
    return paymentFees;
  }

  public void setPaymentFees(@Nullable Double paymentFees) {
    this.paymentFees = paymentFees;
  }

  public RetailerOfferResponse voucherPrice(@Nullable Double voucherPrice) {
    this.voucherPrice = voucherPrice;
    return this;
  }

  /**
   * Get voucherPrice
   * @return voucherPrice
   */
  
  @Schema(name = "voucherPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voucherPrice")
  public @Nullable Double getVoucherPrice() {
    return voucherPrice;
  }

  public void setVoucherPrice(@Nullable Double voucherPrice) {
    this.voucherPrice = voucherPrice;
  }

  public RetailerOfferResponse purchasesRemaining(@Nullable Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
    return this;
  }

  /**
   * Get purchasesRemaining
   * @return purchasesRemaining
   */
  
  @Schema(name = "purchasesRemaining", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchasesRemaining")
  public @Nullable Integer getPurchasesRemaining() {
    return purchasesRemaining;
  }

  public void setPurchasesRemaining(@Nullable Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
  }

  public RetailerOfferResponse redemptionsRemaining(@Nullable Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
    return this;
  }

  /**
   * Get redemptionsRemaining
   * @return redemptionsRemaining
   */
  
  @Schema(name = "redemptionsRemaining", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionsRemaining")
  public @Nullable Integer getRedemptionsRemaining() {
    return redemptionsRemaining;
  }

  public void setRedemptionsRemaining(@Nullable Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
  }

  public RetailerOfferResponse redemptionStatus(@Nullable Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
    return this;
  }

  /**
   * Get redemptionStatus
   * @return redemptionStatus
   */
  
  @Schema(name = "redemptionStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionStatus")
  public @Nullable Integer getRedemptionStatus() {
    return redemptionStatus;
  }

  public void setRedemptionStatus(@Nullable Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  public RetailerOfferResponse redemptionCode(@Nullable String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

  /**
   * Get redemptionCode
   * @return redemptionCode
   */
  
  @Schema(name = "redemptionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionCode")
  public @Nullable String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(@Nullable String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public RetailerOfferResponse audiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
    return this;
  }

  public RetailerOfferResponse addAudiencesItem(AudienceResponse audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

  /**
   * Get audiences
   * @return audiences
   */
  @Valid 
  @Schema(name = "audiences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audiences")
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  public RetailerOfferResponse audienceCount(@Nullable Integer audienceCount) {
    this.audienceCount = audienceCount;
    return this;
  }

  /**
   * Get audienceCount
   * @return audienceCount
   */
  
  @Schema(name = "audienceCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audienceCount")
  public @Nullable Integer getAudienceCount() {
    return audienceCount;
  }

  public void setAudienceCount(@Nullable Integer audienceCount) {
    this.audienceCount = audienceCount;
  }

  public RetailerOfferResponse walletCount(@Nullable Integer walletCount) {
    this.walletCount = walletCount;
    return this;
  }

  /**
   * Get walletCount
   * @return walletCount
   */
  
  @Schema(name = "walletCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("walletCount")
  public @Nullable Integer getWalletCount() {
    return walletCount;
  }

  public void setWalletCount(@Nullable Integer walletCount) {
    this.walletCount = walletCount;
  }

  public RetailerOfferResponse qrCodeUrl(@Nullable String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

  /**
   * Get qrCodeUrl
   * @return qrCodeUrl
   */
  
  @Schema(name = "qrCodeUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qrCodeUrl")
  public @Nullable String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(@Nullable String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  public RetailerOfferResponse showRemaining(@Nullable Boolean showRemaining) {
    this.showRemaining = showRemaining;
    return this;
  }

  /**
   * Get showRemaining
   * @return showRemaining
   */
  
  @Schema(name = "showRemaining", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showRemaining")
  public @Nullable Boolean getShowRemaining() {
    return showRemaining;
  }

  public void setShowRemaining(@Nullable Boolean showRemaining) {
    this.showRemaining = showRemaining;
  }

  public RetailerOfferResponse showRedeemed(@Nullable Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
    return this;
  }

  /**
   * Get showRedeemed
   * @return showRedeemed
   */
  
  @Schema(name = "showRedeemed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showRedeemed")
  public @Nullable Boolean getShowRedeemed() {
    return showRedeemed;
  }

  public void setShowRedeemed(@Nullable Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
  }

  public RetailerOfferResponse purchaseLimit(@Nullable Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
    return this;
  }

  /**
   * Get purchaseLimit
   * @return purchaseLimit
   */
  
  @Schema(name = "purchaseLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseLimit")
  public @Nullable Integer getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(@Nullable Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  public RetailerOfferResponse purchaseLimitPerUser(@Nullable Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
    return this;
  }

  /**
   * Get purchaseLimitPerUser
   * @return purchaseLimitPerUser
   */
  
  @Schema(name = "purchaseLimitPerUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseLimitPerUser")
  public @Nullable Integer getPurchaseLimitPerUser() {
    return purchaseLimitPerUser;
  }

  public void setPurchaseLimitPerUser(@Nullable Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
  }

  public RetailerOfferResponse redemptionLimit(@Nullable Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
    return this;
  }

  /**
   * Get redemptionLimit
   * @return redemptionLimit
   */
  
  @Schema(name = "redemptionLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redemptionLimit")
  public @Nullable Integer getRedemptionLimit() {
    return redemptionLimit;
  }

  public void setRedemptionLimit(@Nullable Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
  }

  public RetailerOfferResponse userRedemptionLimit(@Nullable Integer userRedemptionLimit) {
    this.userRedemptionLimit = userRedemptionLimit;
    return this;
  }

  /**
   * Get userRedemptionLimit
   * @return userRedemptionLimit
   */
  
  @Schema(name = "userRedemptionLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userRedemptionLimit")
  public @Nullable Integer getUserRedemptionLimit() {
    return userRedemptionLimit;
  }

  public void setUserRedemptionLimit(@Nullable Integer userRedemptionLimit) {
    this.userRedemptionLimit = userRedemptionLimit;
  }

  public RetailerOfferResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public RetailerOfferResponse addCategoriesItem(CategoryResponse categoriesItem) {
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

  public RetailerOfferResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public RetailerOfferResponse addFiltersItem(FilterResponse filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  public RetailerOfferResponse locations(List<Map<String, Object>> locations) {
    this.locations = locations;
    return this;
  }

  public RetailerOfferResponse addLocationsItem(Map<String, Object> locationsItem) {
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
  public List<Map<String, Object>> getLocations() {
    return locations;
  }

  public void setLocations(List<Map<String, Object>> locations) {
    this.locations = locations;
  }

  public RetailerOfferResponse returning(@Nullable String returning) {
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
    RetailerOfferResponse retailerOfferResponse = (RetailerOfferResponse) o;
    return Objects.equals(this.valid, retailerOfferResponse.valid) &&
        Objects.equals(this.message, retailerOfferResponse.message) &&
        Objects.equals(this.version, retailerOfferResponse.version) &&
        Objects.equals(this.serializeNulls, retailerOfferResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, retailerOfferResponse.startTimeLog) &&
        Objects.equals(this.errorCode, retailerOfferResponse.errorCode) &&
        Objects.equals(this.request, retailerOfferResponse.request) &&
        Objects.equals(this.offerLocationId, retailerOfferResponse.offerLocationId) &&
        Objects.equals(this.offerId, retailerOfferResponse.offerId) &&
        Objects.equals(this.retailerId, retailerOfferResponse.retailerId) &&
        Objects.equals(this.transactionId, retailerOfferResponse.transactionId) &&
        Objects.equals(this.favoriteId, retailerOfferResponse.favoriteId) &&
        Objects.equals(this.offerName, retailerOfferResponse.offerName) &&
        Objects.equals(this.subTitle, retailerOfferResponse.subTitle) &&
        Objects.equals(this.locationName, retailerOfferResponse.locationName) &&
        Objects.equals(this.starts, retailerOfferResponse.starts) &&
        Objects.equals(this.expires, retailerOfferResponse.expires) &&
        Objects.equals(this.activated, retailerOfferResponse.activated) &&
        Objects.equals(this.expiration, retailerOfferResponse.expiration) &&
        Objects.equals(this.redeemableStart, retailerOfferResponse.redeemableStart) &&
        Objects.equals(this.redeemableEnd, retailerOfferResponse.redeemableEnd) &&
        Objects.equals(this.distance, retailerOfferResponse.distance) &&
        Objects.equals(this.offerType, retailerOfferResponse.offerType) &&
        Objects.equals(this.longitude, retailerOfferResponse.longitude) &&
        Objects.equals(this.latitude, retailerOfferResponse.latitude) &&
        Objects.equals(this.favorite, retailerOfferResponse.favorite) &&
        Objects.equals(this.fullPrice, retailerOfferResponse.fullPrice) &&
        Objects.equals(this.discountPrice, retailerOfferResponse.discountPrice) &&
        Objects.equals(this.estimatedValue, retailerOfferResponse.estimatedValue) &&
        Objects.equals(this.voucherDiscountPrice, retailerOfferResponse.voucherDiscountPrice) &&
        Objects.equals(this.missionListResponse, retailerOfferResponse.missionListResponse) &&
        Objects.equals(this.image, retailerOfferResponse.image) &&
        Objects.equals(this.image1, retailerOfferResponse.image1) &&
        Objects.equals(this.image2, retailerOfferResponse.image2) &&
        Objects.equals(this.image3, retailerOfferResponse.image3) &&
        Objects.equals(this.image4, retailerOfferResponse.image4) &&
        Objects.equals(this.image5, retailerOfferResponse.image5) &&
        Objects.equals(this.images, retailerOfferResponse.images) &&
        Objects.equals(this.barcode, retailerOfferResponse.barcode) &&
        Objects.equals(this.externalUrl, retailerOfferResponse.externalUrl) &&
        Objects.equals(this.sqootUrl, retailerOfferResponse.sqootUrl) &&
        Objects.equals(this.active, retailerOfferResponse.active) &&
        Objects.equals(this.location, retailerOfferResponse.location) &&
        Objects.equals(this.subDetails, retailerOfferResponse.subDetails) &&
        Objects.equals(this.externalRedeemAuth, retailerOfferResponse.externalRedeemAuth) &&
        Objects.equals(this.externalRedeemOptions, retailerOfferResponse.externalRedeemOptions) &&
        Objects.equals(this.publisher, retailerOfferResponse.publisher) &&
        Objects.equals(this.product, retailerOfferResponse.product) &&
        Objects.equals(this.event, retailerOfferResponse.event) &&
        Objects.equals(this.media, retailerOfferResponse.media) &&
        Objects.equals(this.viewedCount, retailerOfferResponse.viewedCount) &&
        Objects.equals(this.clickedCount, retailerOfferResponse.clickedCount) &&
        Objects.equals(this.addedLimit, retailerOfferResponse.addedLimit) &&
        Objects.equals(this.addedCount, retailerOfferResponse.addedCount) &&
        Objects.equals(this.usedCount, retailerOfferResponse.usedCount) &&
        Objects.equals(this.removedCount, retailerOfferResponse.removedCount) &&
        Objects.equals(this.locationAddedCount, retailerOfferResponse.locationAddedCount) &&
        Objects.equals(this.barcodeEntry, retailerOfferResponse.barcodeEntry) &&
        Objects.equals(this.barcodeType, retailerOfferResponse.barcodeType) &&
        Objects.equals(this.ticketsReward, retailerOfferResponse.ticketsReward) &&
        Objects.equals(this.ticketsRewardType, retailerOfferResponse.ticketsRewardType) &&
        Objects.equals(this.specialOfferType, retailerOfferResponse.specialOfferType) &&
        Objects.equals(this.likeCount, retailerOfferResponse.likeCount) &&
        Objects.equals(this.dislikeCount, retailerOfferResponse.dislikeCount) &&
        Objects.equals(this.favoriteCount, retailerOfferResponse.favoriteCount) &&
        Objects.equals(this.noteCount, retailerOfferResponse.noteCount) &&
        Objects.equals(this.logId, retailerOfferResponse.logId) &&
        Objects.equals(this.billableEntityId, retailerOfferResponse.billableEntityId) &&
        Objects.equals(this.responsibleAccountId, retailerOfferResponse.responsibleAccountId) &&
        Objects.equals(this.availabilitySummary, retailerOfferResponse.availabilitySummary) &&
        Objects.equals(this.externalId, retailerOfferResponse.externalId) &&
        Objects.equals(this.parentOffer, retailerOfferResponse.parentOffer) &&
        Objects.equals(this.address, retailerOfferResponse.address) &&
        Objects.equals(this.details, retailerOfferResponse.details) &&
        Objects.equals(this.finePrint, retailerOfferResponse.finePrint) &&
        Objects.equals(this.retailerPhoneNumber, retailerOfferResponse.retailerPhoneNumber) &&
        Objects.equals(this.ticketPriceType, retailerOfferResponse.ticketPriceType) &&
        Objects.equals(this.ticketPrice, retailerOfferResponse.ticketPrice) &&
        Objects.equals(this.discountPercentage, retailerOfferResponse.discountPercentage) &&
        Objects.equals(this.paymentFees, retailerOfferResponse.paymentFees) &&
        Objects.equals(this.voucherPrice, retailerOfferResponse.voucherPrice) &&
        Objects.equals(this.purchasesRemaining, retailerOfferResponse.purchasesRemaining) &&
        Objects.equals(this.redemptionsRemaining, retailerOfferResponse.redemptionsRemaining) &&
        Objects.equals(this.redemptionStatus, retailerOfferResponse.redemptionStatus) &&
        Objects.equals(this.redemptionCode, retailerOfferResponse.redemptionCode) &&
        Objects.equals(this.audiences, retailerOfferResponse.audiences) &&
        Objects.equals(this.audienceCount, retailerOfferResponse.audienceCount) &&
        Objects.equals(this.walletCount, retailerOfferResponse.walletCount) &&
        Objects.equals(this.qrCodeUrl, retailerOfferResponse.qrCodeUrl) &&
        Objects.equals(this.showRemaining, retailerOfferResponse.showRemaining) &&
        Objects.equals(this.showRedeemed, retailerOfferResponse.showRedeemed) &&
        Objects.equals(this.purchaseLimit, retailerOfferResponse.purchaseLimit) &&
        Objects.equals(this.purchaseLimitPerUser, retailerOfferResponse.purchaseLimitPerUser) &&
        Objects.equals(this.redemptionLimit, retailerOfferResponse.redemptionLimit) &&
        Objects.equals(this.userRedemptionLimit, retailerOfferResponse.userRedemptionLimit) &&
        Objects.equals(this.categories, retailerOfferResponse.categories) &&
        Objects.equals(this.filters, retailerOfferResponse.filters) &&
        Objects.equals(this.locations, retailerOfferResponse.locations) &&
        Objects.equals(this.returning, retailerOfferResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, offerLocationId, offerId, retailerId, transactionId, favoriteId, offerName, subTitle, locationName, starts, expires, activated, expiration, redeemableStart, redeemableEnd, distance, offerType, longitude, latitude, favorite, fullPrice, discountPrice, estimatedValue, voucherDiscountPrice, missionListResponse, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, sqootUrl, active, location, subDetails, externalRedeemAuth, externalRedeemOptions, publisher, product, event, media, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, locationAddedCount, barcodeEntry, barcodeType, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, logId, billableEntityId, responsibleAccountId, availabilitySummary, externalId, parentOffer, address, details, finePrint, retailerPhoneNumber, ticketPriceType, ticketPrice, discountPercentage, paymentFees, voucherPrice, purchasesRemaining, redemptionsRemaining, redemptionStatus, redemptionCode, audiences, audienceCount, walletCount, qrCodeUrl, showRemaining, showRedeemed, purchaseLimit, purchaseLimitPerUser, redemptionLimit, userRedemptionLimit, categories, filters, locations, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerOfferResponse {\n");
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
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    finePrint: ").append(toIndentedString(finePrint)).append("\n");
    sb.append("    retailerPhoneNumber: ").append(toIndentedString(retailerPhoneNumber)).append("\n");
    sb.append("    ticketPriceType: ").append(toIndentedString(ticketPriceType)).append("\n");
    sb.append("    ticketPrice: ").append(toIndentedString(ticketPrice)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    paymentFees: ").append(toIndentedString(paymentFees)).append("\n");
    sb.append("    voucherPrice: ").append(toIndentedString(voucherPrice)).append("\n");
    sb.append("    purchasesRemaining: ").append(toIndentedString(purchasesRemaining)).append("\n");
    sb.append("    redemptionsRemaining: ").append(toIndentedString(redemptionsRemaining)).append("\n");
    sb.append("    redemptionStatus: ").append(toIndentedString(redemptionStatus)).append("\n");
    sb.append("    redemptionCode: ").append(toIndentedString(redemptionCode)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    audienceCount: ").append(toIndentedString(audienceCount)).append("\n");
    sb.append("    walletCount: ").append(toIndentedString(walletCount)).append("\n");
    sb.append("    qrCodeUrl: ").append(toIndentedString(qrCodeUrl)).append("\n");
    sb.append("    showRemaining: ").append(toIndentedString(showRemaining)).append("\n");
    sb.append("    showRedeemed: ").append(toIndentedString(showRedeemed)).append("\n");
    sb.append("    purchaseLimit: ").append(toIndentedString(purchaseLimit)).append("\n");
    sb.append("    purchaseLimitPerUser: ").append(toIndentedString(purchaseLimitPerUser)).append("\n");
    sb.append("    redemptionLimit: ").append(toIndentedString(redemptionLimit)).append("\n");
    sb.append("    userRedemptionLimit: ").append(toIndentedString(userRedemptionLimit)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

