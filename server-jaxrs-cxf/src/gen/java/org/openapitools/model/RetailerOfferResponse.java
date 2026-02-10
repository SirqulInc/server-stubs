package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RetailerOfferResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long offerLocationId;

  @ApiModelProperty(value = "")

  private Long offerId;

  @ApiModelProperty(value = "")

  private Long retailerId;

  @ApiModelProperty(value = "")

  private Long transactionId;

  @ApiModelProperty(value = "")

  private Long favoriteId;

  @ApiModelProperty(value = "")

  private String offerName;

  @ApiModelProperty(value = "")

  private String subTitle;

  @ApiModelProperty(value = "")

  private String locationName;

  @ApiModelProperty(value = "")

  private Date starts;

  @ApiModelProperty(value = "")

  private Date expires;

  @ApiModelProperty(value = "")

  private Long activated;

  @ApiModelProperty(value = "")

  private Long expiration;

  @ApiModelProperty(value = "")

  private Long redeemableStart;

  @ApiModelProperty(value = "")

  private Long redeemableEnd;

  @ApiModelProperty(value = "")

  private Double distance;

  @ApiModelProperty(value = "")

  private String offerType;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Boolean favorite;

  @ApiModelProperty(value = "")

  private Double fullPrice;

  @ApiModelProperty(value = "")

  private Double discountPrice;

  @ApiModelProperty(value = "")

  private Double estimatedValue;

  @ApiModelProperty(value = "")

  private Double voucherDiscountPrice;

  @ApiModelProperty(value = "")

  @Valid

  private MissionListResponse missionListResponse;

  @ApiModelProperty(value = "")

  private String image;

  @ApiModelProperty(value = "")

  private String image1;

  @ApiModelProperty(value = "")

  private String image2;

  @ApiModelProperty(value = "")

  private String image3;

  @ApiModelProperty(value = "")

  private String image4;

  @ApiModelProperty(value = "")

  private String image5;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AssetResponse> images = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String barcode;

  @ApiModelProperty(value = "")

  private String externalUrl;

  @ApiModelProperty(value = "")

  private String sqootUrl;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerLocationResponse location;

  @ApiModelProperty(value = "")

  private String subDetails;

  @ApiModelProperty(value = "")

  private Integer externalRedeemAuth;

  @ApiModelProperty(value = "")

  private String externalRedeemOptions;

  @ApiModelProperty(value = "")

  private String publisher;

  @ApiModelProperty(value = "")

  @Valid

  private ProductResponse product;

  @ApiModelProperty(value = "")

  @Valid

  private EventResponse event;

  @ApiModelProperty(value = "")

  @Valid

  private MediaResponse media;

  @ApiModelProperty(value = "")

  private Integer viewedCount;

  @ApiModelProperty(value = "")

  private Integer clickedCount;

  @ApiModelProperty(value = "")

  private Integer addedLimit;

  @ApiModelProperty(value = "")

  private Integer addedCount;

  @ApiModelProperty(value = "")

  private Integer usedCount;

  @ApiModelProperty(value = "")

  private Integer removedCount;

  @ApiModelProperty(value = "")

  private Integer locationAddedCount;

  @ApiModelProperty(value = "")

  private String barcodeEntry;

public enum BarcodeTypeEnum {

NONE(String.valueOf("NONE")), UPC(String.valueOf("UPC")), CODE_128(String.valueOf("CODE_128")), QR(String.valueOf("QR")), CUSTOM_MEDIA(String.valueOf("CUSTOM_MEDIA"));


    private String value;

    BarcodeTypeEnum (String v) {
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
    public static BarcodeTypeEnum fromValue(String value) {
        for (BarcodeTypeEnum b : BarcodeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private BarcodeTypeEnum barcodeType;

  @ApiModelProperty(value = "")

  private Long ticketsReward;

  @ApiModelProperty(value = "")

  private String ticketsRewardType;

public enum SpecialOfferTypeEnum {

ALL(String.valueOf("ALL")), RESERVABLE(String.valueOf("RESERVABLE")), REGULAR_OFFER(String.valueOf("REGULAR_OFFER")), ACT_NOW(String.valueOf("ACT_NOW")), GET_THERE_NOW(String.valueOf("GET_THERE_NOW")), SQOOT(String.valueOf("SQOOT")), TICKETS(String.valueOf("TICKETS")), YIPIT(String.valueOf("YIPIT"));


    private String value;

    SpecialOfferTypeEnum (String v) {
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
    public static SpecialOfferTypeEnum fromValue(String value) {
        for (SpecialOfferTypeEnum b : SpecialOfferTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SpecialOfferTypeEnum specialOfferType;

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private Long favoriteCount;

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private Long logId;

  @ApiModelProperty(value = "")

  private Long billableEntityId;

  @ApiModelProperty(value = "")

  private Long responsibleAccountId;

  @ApiModelProperty(value = "")

  private String availabilitySummary;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  @Valid

  private OfferShortResponse parentOffer;

  @ApiModelProperty(value = "")

  private String address;

  @ApiModelProperty(value = "")

  private String details;

  @ApiModelProperty(value = "")

  private String finePrint;

  @ApiModelProperty(value = "")

  private String retailerPhoneNumber;

  @ApiModelProperty(value = "")

  private String ticketPriceType;

  @ApiModelProperty(value = "")

  private Long ticketPrice;

  @ApiModelProperty(value = "")

  private Double discountPercentage;

  @ApiModelProperty(value = "")

  private Double paymentFees;

  @ApiModelProperty(value = "")

  private Double voucherPrice;

  @ApiModelProperty(value = "")

  private Integer purchasesRemaining;

  @ApiModelProperty(value = "")

  private Integer redemptionsRemaining;

  @ApiModelProperty(value = "")

  private Integer redemptionStatus;

  @ApiModelProperty(value = "")

  private String redemptionCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AudienceResponse> audiences = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer audienceCount;

  @ApiModelProperty(value = "")

  private Integer walletCount;

  @ApiModelProperty(value = "")

  private String qrCodeUrl;

  @ApiModelProperty(value = "")

  private Boolean showRemaining;

  @ApiModelProperty(value = "")

  private Boolean showRedeemed;

  @ApiModelProperty(value = "")

  private Integer purchaseLimit;

  @ApiModelProperty(value = "")

  private Integer purchaseLimitPerUser;

  @ApiModelProperty(value = "")

  private Integer redemptionLimit;

  @ApiModelProperty(value = "")

  private Integer userRedemptionLimit;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid FilterResponse> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<Map<String, Object>> locations = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String returning;
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

  public RetailerOfferResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RetailerOfferResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public RetailerOfferResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public RetailerOfferResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public RetailerOfferResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public RetailerOfferResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public RetailerOfferResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public RetailerOfferResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get offerLocationId
   * @return offerLocationId
  **/
  @JsonProperty("offerLocationId")
  public Long getOfferLocationId() {
    return offerLocationId;
  }

  public void setOfferLocationId(Long offerLocationId) {
    this.offerLocationId = offerLocationId;
  }

  public RetailerOfferResponse offerLocationId(Long offerLocationId) {
    this.offerLocationId = offerLocationId;
    return this;
  }

 /**
   * Get offerId
   * @return offerId
  **/
  @JsonProperty("offerId")
  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public RetailerOfferResponse offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
   * Get retailerId
   * @return retailerId
  **/
  @JsonProperty("retailerId")
  public Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
  }

  public RetailerOfferResponse retailerId(Long retailerId) {
    this.retailerId = retailerId;
    return this;
  }

 /**
   * Get transactionId
   * @return transactionId
  **/
  @JsonProperty("transactionId")
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public RetailerOfferResponse transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

 /**
   * Get favoriteId
   * @return favoriteId
  **/
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public RetailerOfferResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

 /**
   * Get offerName
   * @return offerName
  **/
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public RetailerOfferResponse offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

 /**
   * Get subTitle
   * @return subTitle
  **/
  @JsonProperty("subTitle")
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public RetailerOfferResponse subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

 /**
   * Get locationName
   * @return locationName
  **/
  @JsonProperty("locationName")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public RetailerOfferResponse locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

 /**
   * Get starts
   * @return starts
  **/
  @JsonProperty("starts")
  public Date getStarts() {
    return starts;
  }

  public void setStarts(Date starts) {
    this.starts = starts;
  }

  public RetailerOfferResponse starts(Date starts) {
    this.starts = starts;
    return this;
  }

 /**
   * Get expires
   * @return expires
  **/
  @JsonProperty("expires")
  public Date getExpires() {
    return expires;
  }

  public void setExpires(Date expires) {
    this.expires = expires;
  }

  public RetailerOfferResponse expires(Date expires) {
    this.expires = expires;
    return this;
  }

 /**
   * Get activated
   * @return activated
  **/
  @JsonProperty("activated")
  public Long getActivated() {
    return activated;
  }

  public void setActivated(Long activated) {
    this.activated = activated;
  }

  public RetailerOfferResponse activated(Long activated) {
    this.activated = activated;
    return this;
  }

 /**
   * Get expiration
   * @return expiration
  **/
  @JsonProperty("expiration")
  public Long getExpiration() {
    return expiration;
  }

  public void setExpiration(Long expiration) {
    this.expiration = expiration;
  }

  public RetailerOfferResponse expiration(Long expiration) {
    this.expiration = expiration;
    return this;
  }

 /**
   * Get redeemableStart
   * @return redeemableStart
  **/
  @JsonProperty("redeemableStart")
  public Long getRedeemableStart() {
    return redeemableStart;
  }

  public void setRedeemableStart(Long redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  public RetailerOfferResponse redeemableStart(Long redeemableStart) {
    this.redeemableStart = redeemableStart;
    return this;
  }

 /**
   * Get redeemableEnd
   * @return redeemableEnd
  **/
  @JsonProperty("redeemableEnd")
  public Long getRedeemableEnd() {
    return redeemableEnd;
  }

  public void setRedeemableEnd(Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  public RetailerOfferResponse redeemableEnd(Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
    return this;
  }

 /**
   * Get distance
   * @return distance
  **/
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public RetailerOfferResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

 /**
   * Get offerType
   * @return offerType
  **/
  @JsonProperty("offerType")
  public String getOfferType() {
    return offerType;
  }

  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }

  public RetailerOfferResponse offerType(String offerType) {
    this.offerType = offerType;
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

  public RetailerOfferResponse longitude(Double longitude) {
    this.longitude = longitude;
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

  public RetailerOfferResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get favorite
   * @return favorite
  **/
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public RetailerOfferResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

 /**
   * Get fullPrice
   * @return fullPrice
  **/
  @JsonProperty("fullPrice")
  public Double getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
  }

  public RetailerOfferResponse fullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
    return this;
  }

 /**
   * Get discountPrice
   * @return discountPrice
  **/
  @JsonProperty("discountPrice")
  public Double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public RetailerOfferResponse discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

 /**
   * Get estimatedValue
   * @return estimatedValue
  **/
  @JsonProperty("estimatedValue")
  public Double getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public RetailerOfferResponse estimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

 /**
   * Get voucherDiscountPrice
   * @return voucherDiscountPrice
  **/
  @JsonProperty("voucherDiscountPrice")
  public Double getVoucherDiscountPrice() {
    return voucherDiscountPrice;
  }

  public void setVoucherDiscountPrice(Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
  }

  public RetailerOfferResponse voucherDiscountPrice(Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
    return this;
  }

 /**
   * Get missionListResponse
   * @return missionListResponse
  **/
  @JsonProperty("missionListResponse")
  public MissionListResponse getMissionListResponse() {
    return missionListResponse;
  }

  public void setMissionListResponse(MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
  }

  public RetailerOfferResponse missionListResponse(MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
    return this;
  }

 /**
   * Get image
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public RetailerOfferResponse image(String image) {
    this.image = image;
    return this;
  }

 /**
   * Get image1
   * @return image1
  **/
  @JsonProperty("image1")
  public String getImage1() {
    return image1;
  }

  public void setImage1(String image1) {
    this.image1 = image1;
  }

  public RetailerOfferResponse image1(String image1) {
    this.image1 = image1;
    return this;
  }

 /**
   * Get image2
   * @return image2
  **/
  @JsonProperty("image2")
  public String getImage2() {
    return image2;
  }

  public void setImage2(String image2) {
    this.image2 = image2;
  }

  public RetailerOfferResponse image2(String image2) {
    this.image2 = image2;
    return this;
  }

 /**
   * Get image3
   * @return image3
  **/
  @JsonProperty("image3")
  public String getImage3() {
    return image3;
  }

  public void setImage3(String image3) {
    this.image3 = image3;
  }

  public RetailerOfferResponse image3(String image3) {
    this.image3 = image3;
    return this;
  }

 /**
   * Get image4
   * @return image4
  **/
  @JsonProperty("image4")
  public String getImage4() {
    return image4;
  }

  public void setImage4(String image4) {
    this.image4 = image4;
  }

  public RetailerOfferResponse image4(String image4) {
    this.image4 = image4;
    return this;
  }

 /**
   * Get image5
   * @return image5
  **/
  @JsonProperty("image5")
  public String getImage5() {
    return image5;
  }

  public void setImage5(String image5) {
    this.image5 = image5;
  }

  public RetailerOfferResponse image5(String image5) {
    this.image5 = image5;
    return this;
  }

 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public List<@Valid AssetResponse> getImages() {
    return images;
  }

  public void setImages(List<@Valid AssetResponse> images) {
    this.images = images;
  }

  public RetailerOfferResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public RetailerOfferResponse addImagesItem(AssetResponse imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

 /**
   * Get barcode
   * @return barcode
  **/
  @JsonProperty("barcode")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public RetailerOfferResponse barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

 /**
   * Get externalUrl
   * @return externalUrl
  **/
  @JsonProperty("externalUrl")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public RetailerOfferResponse externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

 /**
   * Get sqootUrl
   * @return sqootUrl
  **/
  @JsonProperty("sqootUrl")
  public String getSqootUrl() {
    return sqootUrl;
  }

  public void setSqootUrl(String sqootUrl) {
    this.sqootUrl = sqootUrl;
  }

  public RetailerOfferResponse sqootUrl(String sqootUrl) {
    this.sqootUrl = sqootUrl;
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

  public RetailerOfferResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public RetailerLocationResponse getLocation() {
    return location;
  }

  public void setLocation(RetailerLocationResponse location) {
    this.location = location;
  }

  public RetailerOfferResponse location(RetailerLocationResponse location) {
    this.location = location;
    return this;
  }

 /**
   * Get subDetails
   * @return subDetails
  **/
  @JsonProperty("subDetails")
  public String getSubDetails() {
    return subDetails;
  }

  public void setSubDetails(String subDetails) {
    this.subDetails = subDetails;
  }

  public RetailerOfferResponse subDetails(String subDetails) {
    this.subDetails = subDetails;
    return this;
  }

 /**
   * Get externalRedeemAuth
   * @return externalRedeemAuth
  **/
  @JsonProperty("externalRedeemAuth")
  public Integer getExternalRedeemAuth() {
    return externalRedeemAuth;
  }

  public void setExternalRedeemAuth(Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
  }

  public RetailerOfferResponse externalRedeemAuth(Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
    return this;
  }

 /**
   * Get externalRedeemOptions
   * @return externalRedeemOptions
  **/
  @JsonProperty("externalRedeemOptions")
  public String getExternalRedeemOptions() {
    return externalRedeemOptions;
  }

  public void setExternalRedeemOptions(String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
  }

  public RetailerOfferResponse externalRedeemOptions(String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
    return this;
  }

 /**
   * Get publisher
   * @return publisher
  **/
  @JsonProperty("publisher")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public RetailerOfferResponse publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  public ProductResponse getProduct() {
    return product;
  }

  public void setProduct(ProductResponse product) {
    this.product = product;
  }

  public RetailerOfferResponse product(ProductResponse product) {
    this.product = product;
    return this;
  }

 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public EventResponse getEvent() {
    return event;
  }

  public void setEvent(EventResponse event) {
    this.event = event;
  }

  public RetailerOfferResponse event(EventResponse event) {
    this.event = event;
    return this;
  }

 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public MediaResponse getMedia() {
    return media;
  }

  public void setMedia(MediaResponse media) {
    this.media = media;
  }

  public RetailerOfferResponse media(MediaResponse media) {
    this.media = media;
    return this;
  }

 /**
   * Get viewedCount
   * @return viewedCount
  **/
  @JsonProperty("viewedCount")
  public Integer getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(Integer viewedCount) {
    this.viewedCount = viewedCount;
  }

  public RetailerOfferResponse viewedCount(Integer viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

 /**
   * Get clickedCount
   * @return clickedCount
  **/
  @JsonProperty("clickedCount")
  public Integer getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(Integer clickedCount) {
    this.clickedCount = clickedCount;
  }

  public RetailerOfferResponse clickedCount(Integer clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

 /**
   * Get addedLimit
   * @return addedLimit
  **/
  @JsonProperty("addedLimit")
  public Integer getAddedLimit() {
    return addedLimit;
  }

  public void setAddedLimit(Integer addedLimit) {
    this.addedLimit = addedLimit;
  }

  public RetailerOfferResponse addedLimit(Integer addedLimit) {
    this.addedLimit = addedLimit;
    return this;
  }

 /**
   * Get addedCount
   * @return addedCount
  **/
  @JsonProperty("addedCount")
  public Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }

  public RetailerOfferResponse addedCount(Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

 /**
   * Get usedCount
   * @return usedCount
  **/
  @JsonProperty("usedCount")
  public Integer getUsedCount() {
    return usedCount;
  }

  public void setUsedCount(Integer usedCount) {
    this.usedCount = usedCount;
  }

  public RetailerOfferResponse usedCount(Integer usedCount) {
    this.usedCount = usedCount;
    return this;
  }

 /**
   * Get removedCount
   * @return removedCount
  **/
  @JsonProperty("removedCount")
  public Integer getRemovedCount() {
    return removedCount;
  }

  public void setRemovedCount(Integer removedCount) {
    this.removedCount = removedCount;
  }

  public RetailerOfferResponse removedCount(Integer removedCount) {
    this.removedCount = removedCount;
    return this;
  }

 /**
   * Get locationAddedCount
   * @return locationAddedCount
  **/
  @JsonProperty("locationAddedCount")
  public Integer getLocationAddedCount() {
    return locationAddedCount;
  }

  public void setLocationAddedCount(Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
  }

  public RetailerOfferResponse locationAddedCount(Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
    return this;
  }

 /**
   * Get barcodeEntry
   * @return barcodeEntry
  **/
  @JsonProperty("barcodeEntry")
  public String getBarcodeEntry() {
    return barcodeEntry;
  }

  public void setBarcodeEntry(String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
  }

  public RetailerOfferResponse barcodeEntry(String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
    return this;
  }

 /**
   * Get barcodeType
   * @return barcodeType
  **/
  @JsonProperty("barcodeType")
  public String getBarcodeType() {
    if (barcodeType == null) {
      return null;
    }
    return barcodeType.value();
  }

  public void setBarcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
  }

  public RetailerOfferResponse barcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

 /**
   * Get ticketsReward
   * @return ticketsReward
  **/
  @JsonProperty("ticketsReward")
  public Long getTicketsReward() {
    return ticketsReward;
  }

  public void setTicketsReward(Long ticketsReward) {
    this.ticketsReward = ticketsReward;
  }

  public RetailerOfferResponse ticketsReward(Long ticketsReward) {
    this.ticketsReward = ticketsReward;
    return this;
  }

 /**
   * Get ticketsRewardType
   * @return ticketsRewardType
  **/
  @JsonProperty("ticketsRewardType")
  public String getTicketsRewardType() {
    return ticketsRewardType;
  }

  public void setTicketsRewardType(String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
  }

  public RetailerOfferResponse ticketsRewardType(String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
    return this;
  }

 /**
   * Get specialOfferType
   * @return specialOfferType
  **/
  @JsonProperty("specialOfferType")
  public String getSpecialOfferType() {
    if (specialOfferType == null) {
      return null;
    }
    return specialOfferType.value();
  }

  public void setSpecialOfferType(SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
  }

  public RetailerOfferResponse specialOfferType(SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
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

  public RetailerOfferResponse likeCount(Long likeCount) {
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

  public RetailerOfferResponse dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

 /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public RetailerOfferResponse favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get noteCount
   * @return noteCount
  **/
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public RetailerOfferResponse noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get logId
   * @return logId
  **/
  @JsonProperty("logId")
  public Long getLogId() {
    return logId;
  }

  public void setLogId(Long logId) {
    this.logId = logId;
  }

  public RetailerOfferResponse logId(Long logId) {
    this.logId = logId;
    return this;
  }

 /**
   * Get billableEntityId
   * @return billableEntityId
  **/
  @JsonProperty("billableEntityId")
  public Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public RetailerOfferResponse billableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

 /**
   * Get responsibleAccountId
   * @return responsibleAccountId
  **/
  @JsonProperty("responsibleAccountId")
  public Long getResponsibleAccountId() {
    return responsibleAccountId;
  }

  public void setResponsibleAccountId(Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
  }

  public RetailerOfferResponse responsibleAccountId(Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
    return this;
  }

 /**
   * Get availabilitySummary
   * @return availabilitySummary
  **/
  @JsonProperty("availabilitySummary")
  public String getAvailabilitySummary() {
    return availabilitySummary;
  }

  public void setAvailabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
  }

  public RetailerOfferResponse availabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public RetailerOfferResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get parentOffer
   * @return parentOffer
  **/
  @JsonProperty("parentOffer")
  public OfferShortResponse getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
  }

  public RetailerOfferResponse parentOffer(OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public RetailerOfferResponse address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public RetailerOfferResponse details(String details) {
    this.details = details;
    return this;
  }

 /**
   * Get finePrint
   * @return finePrint
  **/
  @JsonProperty("finePrint")
  public String getFinePrint() {
    return finePrint;
  }

  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  public RetailerOfferResponse finePrint(String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

 /**
   * Get retailerPhoneNumber
   * @return retailerPhoneNumber
  **/
  @JsonProperty("retailerPhoneNumber")
  public String getRetailerPhoneNumber() {
    return retailerPhoneNumber;
  }

  public void setRetailerPhoneNumber(String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
  }

  public RetailerOfferResponse retailerPhoneNumber(String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
    return this;
  }

 /**
   * Get ticketPriceType
   * @return ticketPriceType
  **/
  @JsonProperty("ticketPriceType")
  public String getTicketPriceType() {
    return ticketPriceType;
  }

  public void setTicketPriceType(String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
  }

  public RetailerOfferResponse ticketPriceType(String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
    return this;
  }

 /**
   * Get ticketPrice
   * @return ticketPrice
  **/
  @JsonProperty("ticketPrice")
  public Long getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(Long ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public RetailerOfferResponse ticketPrice(Long ticketPrice) {
    this.ticketPrice = ticketPrice;
    return this;
  }

 /**
   * Get discountPercentage
   * @return discountPercentage
  **/
  @JsonProperty("discountPercentage")
  public Double getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public RetailerOfferResponse discountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

 /**
   * Get paymentFees
   * @return paymentFees
  **/
  @JsonProperty("paymentFees")
  public Double getPaymentFees() {
    return paymentFees;
  }

  public void setPaymentFees(Double paymentFees) {
    this.paymentFees = paymentFees;
  }

  public RetailerOfferResponse paymentFees(Double paymentFees) {
    this.paymentFees = paymentFees;
    return this;
  }

 /**
   * Get voucherPrice
   * @return voucherPrice
  **/
  @JsonProperty("voucherPrice")
  public Double getVoucherPrice() {
    return voucherPrice;
  }

  public void setVoucherPrice(Double voucherPrice) {
    this.voucherPrice = voucherPrice;
  }

  public RetailerOfferResponse voucherPrice(Double voucherPrice) {
    this.voucherPrice = voucherPrice;
    return this;
  }

 /**
   * Get purchasesRemaining
   * @return purchasesRemaining
  **/
  @JsonProperty("purchasesRemaining")
  public Integer getPurchasesRemaining() {
    return purchasesRemaining;
  }

  public void setPurchasesRemaining(Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
  }

  public RetailerOfferResponse purchasesRemaining(Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
    return this;
  }

 /**
   * Get redemptionsRemaining
   * @return redemptionsRemaining
  **/
  @JsonProperty("redemptionsRemaining")
  public Integer getRedemptionsRemaining() {
    return redemptionsRemaining;
  }

  public void setRedemptionsRemaining(Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
  }

  public RetailerOfferResponse redemptionsRemaining(Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
    return this;
  }

 /**
   * Get redemptionStatus
   * @return redemptionStatus
  **/
  @JsonProperty("redemptionStatus")
  public Integer getRedemptionStatus() {
    return redemptionStatus;
  }

  public void setRedemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  public RetailerOfferResponse redemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
    return this;
  }

 /**
   * Get redemptionCode
   * @return redemptionCode
  **/
  @JsonProperty("redemptionCode")
  public String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  public RetailerOfferResponse redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

 /**
   * Get audiences
   * @return audiences
  **/
  @JsonProperty("audiences")
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  public RetailerOfferResponse audiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
    return this;
  }

  public RetailerOfferResponse addAudiencesItem(AudienceResponse audiencesItem) {
    this.audiences.add(audiencesItem);
    return this;
  }

 /**
   * Get audienceCount
   * @return audienceCount
  **/
  @JsonProperty("audienceCount")
  public Integer getAudienceCount() {
    return audienceCount;
  }

  public void setAudienceCount(Integer audienceCount) {
    this.audienceCount = audienceCount;
  }

  public RetailerOfferResponse audienceCount(Integer audienceCount) {
    this.audienceCount = audienceCount;
    return this;
  }

 /**
   * Get walletCount
   * @return walletCount
  **/
  @JsonProperty("walletCount")
  public Integer getWalletCount() {
    return walletCount;
  }

  public void setWalletCount(Integer walletCount) {
    this.walletCount = walletCount;
  }

  public RetailerOfferResponse walletCount(Integer walletCount) {
    this.walletCount = walletCount;
    return this;
  }

 /**
   * Get qrCodeUrl
   * @return qrCodeUrl
  **/
  @JsonProperty("qrCodeUrl")
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  public RetailerOfferResponse qrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

 /**
   * Get showRemaining
   * @return showRemaining
  **/
  @JsonProperty("showRemaining")
  public Boolean getShowRemaining() {
    return showRemaining;
  }

  public void setShowRemaining(Boolean showRemaining) {
    this.showRemaining = showRemaining;
  }

  public RetailerOfferResponse showRemaining(Boolean showRemaining) {
    this.showRemaining = showRemaining;
    return this;
  }

 /**
   * Get showRedeemed
   * @return showRedeemed
  **/
  @JsonProperty("showRedeemed")
  public Boolean getShowRedeemed() {
    return showRedeemed;
  }

  public void setShowRedeemed(Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
  }

  public RetailerOfferResponse showRedeemed(Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
    return this;
  }

 /**
   * Get purchaseLimit
   * @return purchaseLimit
  **/
  @JsonProperty("purchaseLimit")
  public Integer getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  public RetailerOfferResponse purchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
    return this;
  }

 /**
   * Get purchaseLimitPerUser
   * @return purchaseLimitPerUser
  **/
  @JsonProperty("purchaseLimitPerUser")
  public Integer getPurchaseLimitPerUser() {
    return purchaseLimitPerUser;
  }

  public void setPurchaseLimitPerUser(Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
  }

  public RetailerOfferResponse purchaseLimitPerUser(Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
    return this;
  }

 /**
   * Get redemptionLimit
   * @return redemptionLimit
  **/
  @JsonProperty("redemptionLimit")
  public Integer getRedemptionLimit() {
    return redemptionLimit;
  }

  public void setRedemptionLimit(Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
  }

  public RetailerOfferResponse redemptionLimit(Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
    return this;
  }

 /**
   * Get userRedemptionLimit
   * @return userRedemptionLimit
  **/
  @JsonProperty("userRedemptionLimit")
  public Integer getUserRedemptionLimit() {
    return userRedemptionLimit;
  }

  public void setUserRedemptionLimit(Integer userRedemptionLimit) {
    this.userRedemptionLimit = userRedemptionLimit;
  }

  public RetailerOfferResponse userRedemptionLimit(Integer userRedemptionLimit) {
    this.userRedemptionLimit = userRedemptionLimit;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public RetailerOfferResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public RetailerOfferResponse addCategoriesItem(CategoryResponse categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  public RetailerOfferResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public RetailerOfferResponse addFiltersItem(FilterResponse filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get locations
   * @return locations
  **/
  @JsonProperty("locations")
  public List<Map<String, Object>> getLocations() {
    return locations;
  }

  public void setLocations(List<Map<String, Object>> locations) {
    this.locations = locations;
  }

  public RetailerOfferResponse locations(List<Map<String, Object>> locations) {
    this.locations = locations;
    return this;
  }

  public RetailerOfferResponse addLocationsItem(Map<String, Object> locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public RetailerOfferResponse returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

