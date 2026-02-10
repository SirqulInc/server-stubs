package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.EventResponse;
import org.openapitools.model.MediaResponse;
import org.openapitools.model.MissionListResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.ProductResponse;
import org.openapitools.model.RetailerLocationResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferShortResponse  {
  
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

  public OfferShortResponse valid(Boolean valid) {
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

  public OfferShortResponse message(String message) {
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

  public OfferShortResponse version(Double version) {
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

  public OfferShortResponse serializeNulls(Boolean serializeNulls) {
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

  public OfferShortResponse startTimeLog(Long startTimeLog) {
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

  public OfferShortResponse errorCode(String errorCode) {
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

  public OfferShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public OfferShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public OfferShortResponse offerLocationId(Long offerLocationId) {
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

  public OfferShortResponse offerId(Long offerId) {
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

  public OfferShortResponse retailerId(Long retailerId) {
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

  public OfferShortResponse transactionId(Long transactionId) {
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

  public OfferShortResponse favoriteId(Long favoriteId) {
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

  public OfferShortResponse offerName(String offerName) {
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

  public OfferShortResponse subTitle(String subTitle) {
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

  public OfferShortResponse locationName(String locationName) {
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

  public OfferShortResponse starts(Date starts) {
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

  public OfferShortResponse expires(Date expires) {
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

  public OfferShortResponse activated(Long activated) {
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

  public OfferShortResponse expiration(Long expiration) {
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

  public OfferShortResponse redeemableStart(Long redeemableStart) {
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

  public OfferShortResponse redeemableEnd(Long redeemableEnd) {
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

  public OfferShortResponse distance(Double distance) {
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

  public OfferShortResponse offerType(String offerType) {
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

  public OfferShortResponse longitude(Double longitude) {
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

  public OfferShortResponse latitude(Double latitude) {
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

  public OfferShortResponse favorite(Boolean favorite) {
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

  public OfferShortResponse fullPrice(Double fullPrice) {
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

  public OfferShortResponse discountPrice(Double discountPrice) {
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

  public OfferShortResponse estimatedValue(Double estimatedValue) {
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

  public OfferShortResponse voucherDiscountPrice(Double voucherDiscountPrice) {
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

  public OfferShortResponse missionListResponse(MissionListResponse missionListResponse) {
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

  public OfferShortResponse image(String image) {
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

  public OfferShortResponse image1(String image1) {
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

  public OfferShortResponse image2(String image2) {
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

  public OfferShortResponse image3(String image3) {
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

  public OfferShortResponse image4(String image4) {
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

  public OfferShortResponse image5(String image5) {
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

  public OfferShortResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public OfferShortResponse addImagesItem(AssetResponse imagesItem) {
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

  public OfferShortResponse barcode(String barcode) {
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

  public OfferShortResponse externalUrl(String externalUrl) {
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

  public OfferShortResponse sqootUrl(String sqootUrl) {
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

  public OfferShortResponse active(Boolean active) {
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

  public OfferShortResponse location(RetailerLocationResponse location) {
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

  public OfferShortResponse subDetails(String subDetails) {
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

  public OfferShortResponse externalRedeemAuth(Integer externalRedeemAuth) {
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

  public OfferShortResponse externalRedeemOptions(String externalRedeemOptions) {
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

  public OfferShortResponse publisher(String publisher) {
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

  public OfferShortResponse product(ProductResponse product) {
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

  public OfferShortResponse event(EventResponse event) {
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

  public OfferShortResponse media(MediaResponse media) {
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

  public OfferShortResponse viewedCount(Integer viewedCount) {
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

  public OfferShortResponse clickedCount(Integer clickedCount) {
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

  public OfferShortResponse addedLimit(Integer addedLimit) {
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

  public OfferShortResponse addedCount(Integer addedCount) {
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

  public OfferShortResponse usedCount(Integer usedCount) {
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

  public OfferShortResponse removedCount(Integer removedCount) {
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

  public OfferShortResponse locationAddedCount(Integer locationAddedCount) {
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

  public OfferShortResponse barcodeEntry(String barcodeEntry) {
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

  public OfferShortResponse barcodeType(BarcodeTypeEnum barcodeType) {
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

  public OfferShortResponse ticketsReward(Long ticketsReward) {
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

  public OfferShortResponse ticketsRewardType(String ticketsRewardType) {
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

  public OfferShortResponse specialOfferType(SpecialOfferTypeEnum specialOfferType) {
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

  public OfferShortResponse likeCount(Long likeCount) {
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

  public OfferShortResponse dislikeCount(Long dislikeCount) {
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

  public OfferShortResponse favoriteCount(Long favoriteCount) {
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

  public OfferShortResponse noteCount(Long noteCount) {
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

  public OfferShortResponse logId(Long logId) {
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

  public OfferShortResponse billableEntityId(Long billableEntityId) {
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

  public OfferShortResponse responsibleAccountId(Long responsibleAccountId) {
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

  public OfferShortResponse availabilitySummary(String availabilitySummary) {
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

  public OfferShortResponse externalId(String externalId) {
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

  public OfferShortResponse parentOffer(OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
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

  public OfferShortResponse returning(String returning) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

