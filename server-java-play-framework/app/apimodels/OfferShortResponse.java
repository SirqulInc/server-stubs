package apimodels;

import apimodels.AssetResponse;
import apimodels.EventResponse;
import apimodels.MediaResponse;
import apimodels.MissionListResponse;
import apimodels.NameStringValueResponse;
import apimodels.ProductResponse;
import apimodels.RetailerLocationResponse;
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
 * OfferShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferShortResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("offerLocationId")
  
  private Long offerLocationId;

  @JsonProperty("offerId")
  
  private Long offerId;

  @JsonProperty("retailerId")
  
  private Long retailerId;

  @JsonProperty("transactionId")
  
  private Long transactionId;

  @JsonProperty("favoriteId")
  
  private Long favoriteId;

  @JsonProperty("offerName")
  
  private String offerName;

  @JsonProperty("subTitle")
  
  private String subTitle;

  @JsonProperty("locationName")
  
  private String locationName;

  @JsonProperty("starts")
  @Valid

  private OffsetDateTime starts;

  @JsonProperty("expires")
  @Valid

  private OffsetDateTime expires;

  @JsonProperty("activated")
  
  private Long activated;

  @JsonProperty("expiration")
  
  private Long expiration;

  @JsonProperty("redeemableStart")
  
  private Long redeemableStart;

  @JsonProperty("redeemableEnd")
  
  private Long redeemableEnd;

  @JsonProperty("distance")
  
  private Double distance;

  @JsonProperty("offerType")
  
  private String offerType;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("favorite")
  
  private Boolean favorite;

  @JsonProperty("fullPrice")
  
  private Double fullPrice;

  @JsonProperty("discountPrice")
  
  private Double discountPrice;

  @JsonProperty("estimatedValue")
  
  private Double estimatedValue;

  @JsonProperty("voucherDiscountPrice")
  
  private Double voucherDiscountPrice;

  @JsonProperty("missionListResponse")
  @Valid

  private MissionListResponse missionListResponse;

  @JsonProperty("image")
  
  private String image;

  @JsonProperty("image1")
  
  private String image1;

  @JsonProperty("image2")
  
  private String image2;

  @JsonProperty("image3")
  
  private String image3;

  @JsonProperty("image4")
  
  private String image4;

  @JsonProperty("image5")
  
  private String image5;

  @JsonProperty("images")
  @Valid

  private List<@Valid AssetResponse> images = null;

  @JsonProperty("barcode")
  
  private String barcode;

  @JsonProperty("externalUrl")
  
  private String externalUrl;

  @JsonProperty("sqootUrl")
  
  private String sqootUrl;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("location")
  @Valid

  private RetailerLocationResponse location;

  @JsonProperty("subDetails")
  
  private String subDetails;

  @JsonProperty("externalRedeemAuth")
  
  private Integer externalRedeemAuth;

  @JsonProperty("externalRedeemOptions")
  
  private String externalRedeemOptions;

  @JsonProperty("publisher")
  
  private String publisher;

  @JsonProperty("product")
  @Valid

  private ProductResponse product;

  @JsonProperty("event")
  @Valid

  private EventResponse event;

  @JsonProperty("media")
  @Valid

  private MediaResponse media;

  @JsonProperty("viewedCount")
  
  private Integer viewedCount;

  @JsonProperty("clickedCount")
  
  private Integer clickedCount;

  @JsonProperty("addedLimit")
  
  private Integer addedLimit;

  @JsonProperty("addedCount")
  
  private Integer addedCount;

  @JsonProperty("usedCount")
  
  private Integer usedCount;

  @JsonProperty("removedCount")
  
  private Integer removedCount;

  @JsonProperty("locationAddedCount")
  
  private Integer locationAddedCount;

  @JsonProperty("barcodeEntry")
  
  private String barcodeEntry;

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

  @JsonProperty("barcodeType")
  
  private BarcodeTypeEnum barcodeType;

  @JsonProperty("ticketsReward")
  
  private Long ticketsReward;

  @JsonProperty("ticketsRewardType")
  
  private String ticketsRewardType;

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

  @JsonProperty("specialOfferType")
  
  private SpecialOfferTypeEnum specialOfferType;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("favoriteCount")
  
  private Long favoriteCount;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("logId")
  
  private Long logId;

  @JsonProperty("billableEntityId")
  
  private Long billableEntityId;

  @JsonProperty("responsibleAccountId")
  
  private Long responsibleAccountId;

  @JsonProperty("availabilitySummary")
  
  private String availabilitySummary;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("parentOffer")
  @Valid

  private OfferShortResponse parentOffer;

  @JsonProperty("returning")
  
  private String returning;

  public OfferShortResponse valid(Boolean valid) {
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

  public OfferShortResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OfferShortResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public OfferShortResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public OfferShortResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public OfferShortResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public OfferShortResponse offerLocationId(Long offerLocationId) {
    this.offerLocationId = offerLocationId;
    return this;
  }

   /**
   * Get offerLocationId
   * @return offerLocationId
  **/
  public Long getOfferLocationId() {
    return offerLocationId;
  }

  public void setOfferLocationId(Long offerLocationId) {
    this.offerLocationId = offerLocationId;
  }

  public OfferShortResponse offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public OfferShortResponse retailerId(Long retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * Get retailerId
   * @return retailerId
  **/
  public Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
  }

  public OfferShortResponse transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public OfferShortResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * Get favoriteId
   * @return favoriteId
  **/
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public OfferShortResponse offerName(String offerName) {
    this.offerName = offerName;
    return this;
  }

   /**
   * Get offerName
   * @return offerName
  **/
  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public OfferShortResponse subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

   /**
   * Get subTitle
   * @return subTitle
  **/
  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public OfferShortResponse locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public OfferShortResponse starts(OffsetDateTime starts) {
    this.starts = starts;
    return this;
  }

   /**
   * Get starts
   * @return starts
  **/
  public OffsetDateTime getStarts() {
    return starts;
  }

  public void setStarts(OffsetDateTime starts) {
    this.starts = starts;
  }

  public OfferShortResponse expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public OfferShortResponse activated(Long activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  public Long getActivated() {
    return activated;
  }

  public void setActivated(Long activated) {
    this.activated = activated;
  }

  public OfferShortResponse expiration(Long expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  public Long getExpiration() {
    return expiration;
  }

  public void setExpiration(Long expiration) {
    this.expiration = expiration;
  }

  public OfferShortResponse redeemableStart(Long redeemableStart) {
    this.redeemableStart = redeemableStart;
    return this;
  }

   /**
   * Get redeemableStart
   * @return redeemableStart
  **/
  public Long getRedeemableStart() {
    return redeemableStart;
  }

  public void setRedeemableStart(Long redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  public OfferShortResponse redeemableEnd(Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
    return this;
  }

   /**
   * Get redeemableEnd
   * @return redeemableEnd
  **/
  public Long getRedeemableEnd() {
    return redeemableEnd;
  }

  public void setRedeemableEnd(Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  public OfferShortResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public OfferShortResponse offerType(String offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Get offerType
   * @return offerType
  **/
  public String getOfferType() {
    return offerType;
  }

  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }

  public OfferShortResponse longitude(Double longitude) {
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

  public OfferShortResponse latitude(Double latitude) {
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

  public OfferShortResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public OfferShortResponse fullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
    return this;
  }

   /**
   * Get fullPrice
   * @return fullPrice
  **/
  public Double getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
  }

  public OfferShortResponse discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * Get discountPrice
   * @return discountPrice
  **/
  public Double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public OfferShortResponse estimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
    return this;
  }

   /**
   * Get estimatedValue
   * @return estimatedValue
  **/
  public Double getEstimatedValue() {
    return estimatedValue;
  }

  public void setEstimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  public OfferShortResponse voucherDiscountPrice(Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
    return this;
  }

   /**
   * Get voucherDiscountPrice
   * @return voucherDiscountPrice
  **/
  public Double getVoucherDiscountPrice() {
    return voucherDiscountPrice;
  }

  public void setVoucherDiscountPrice(Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
  }

  public OfferShortResponse missionListResponse(MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
    return this;
  }

   /**
   * Get missionListResponse
   * @return missionListResponse
  **/
  public MissionListResponse getMissionListResponse() {
    return missionListResponse;
  }

  public void setMissionListResponse(MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
  }

  public OfferShortResponse image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public OfferShortResponse image1(String image1) {
    this.image1 = image1;
    return this;
  }

   /**
   * Get image1
   * @return image1
  **/
  public String getImage1() {
    return image1;
  }

  public void setImage1(String image1) {
    this.image1 = image1;
  }

  public OfferShortResponse image2(String image2) {
    this.image2 = image2;
    return this;
  }

   /**
   * Get image2
   * @return image2
  **/
  public String getImage2() {
    return image2;
  }

  public void setImage2(String image2) {
    this.image2 = image2;
  }

  public OfferShortResponse image3(String image3) {
    this.image3 = image3;
    return this;
  }

   /**
   * Get image3
   * @return image3
  **/
  public String getImage3() {
    return image3;
  }

  public void setImage3(String image3) {
    this.image3 = image3;
  }

  public OfferShortResponse image4(String image4) {
    this.image4 = image4;
    return this;
  }

   /**
   * Get image4
   * @return image4
  **/
  public String getImage4() {
    return image4;
  }

  public void setImage4(String image4) {
    this.image4 = image4;
  }

  public OfferShortResponse image5(String image5) {
    this.image5 = image5;
    return this;
  }

   /**
   * Get image5
   * @return image5
  **/
  public String getImage5() {
    return image5;
  }

  public void setImage5(String image5) {
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
  **/
  public List<@Valid AssetResponse> getImages() {
    return images;
  }

  public void setImages(List<@Valid AssetResponse> images) {
    this.images = images;
  }

  public OfferShortResponse barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public OfferShortResponse externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Get externalUrl
   * @return externalUrl
  **/
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public OfferShortResponse sqootUrl(String sqootUrl) {
    this.sqootUrl = sqootUrl;
    return this;
  }

   /**
   * Get sqootUrl
   * @return sqootUrl
  **/
  public String getSqootUrl() {
    return sqootUrl;
  }

  public void setSqootUrl(String sqootUrl) {
    this.sqootUrl = sqootUrl;
  }

  public OfferShortResponse active(Boolean active) {
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

  public OfferShortResponse location(RetailerLocationResponse location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  public RetailerLocationResponse getLocation() {
    return location;
  }

  public void setLocation(RetailerLocationResponse location) {
    this.location = location;
  }

  public OfferShortResponse subDetails(String subDetails) {
    this.subDetails = subDetails;
    return this;
  }

   /**
   * Get subDetails
   * @return subDetails
  **/
  public String getSubDetails() {
    return subDetails;
  }

  public void setSubDetails(String subDetails) {
    this.subDetails = subDetails;
  }

  public OfferShortResponse externalRedeemAuth(Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
    return this;
  }

   /**
   * Get externalRedeemAuth
   * @return externalRedeemAuth
  **/
  public Integer getExternalRedeemAuth() {
    return externalRedeemAuth;
  }

  public void setExternalRedeemAuth(Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
  }

  public OfferShortResponse externalRedeemOptions(String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
    return this;
  }

   /**
   * Get externalRedeemOptions
   * @return externalRedeemOptions
  **/
  public String getExternalRedeemOptions() {
    return externalRedeemOptions;
  }

  public void setExternalRedeemOptions(String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
  }

  public OfferShortResponse publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public OfferShortResponse product(ProductResponse product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  public ProductResponse getProduct() {
    return product;
  }

  public void setProduct(ProductResponse product) {
    this.product = product;
  }

  public OfferShortResponse event(EventResponse event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  public EventResponse getEvent() {
    return event;
  }

  public void setEvent(EventResponse event) {
    this.event = event;
  }

  public OfferShortResponse media(MediaResponse media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  public MediaResponse getMedia() {
    return media;
  }

  public void setMedia(MediaResponse media) {
    this.media = media;
  }

  public OfferShortResponse viewedCount(Integer viewedCount) {
    this.viewedCount = viewedCount;
    return this;
  }

   /**
   * Get viewedCount
   * @return viewedCount
  **/
  public Integer getViewedCount() {
    return viewedCount;
  }

  public void setViewedCount(Integer viewedCount) {
    this.viewedCount = viewedCount;
  }

  public OfferShortResponse clickedCount(Integer clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

   /**
   * Get clickedCount
   * @return clickedCount
  **/
  public Integer getClickedCount() {
    return clickedCount;
  }

  public void setClickedCount(Integer clickedCount) {
    this.clickedCount = clickedCount;
  }

  public OfferShortResponse addedLimit(Integer addedLimit) {
    this.addedLimit = addedLimit;
    return this;
  }

   /**
   * Get addedLimit
   * @return addedLimit
  **/
  public Integer getAddedLimit() {
    return addedLimit;
  }

  public void setAddedLimit(Integer addedLimit) {
    this.addedLimit = addedLimit;
  }

  public OfferShortResponse addedCount(Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

   /**
   * Get addedCount
   * @return addedCount
  **/
  public Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }

  public OfferShortResponse usedCount(Integer usedCount) {
    this.usedCount = usedCount;
    return this;
  }

   /**
   * Get usedCount
   * @return usedCount
  **/
  public Integer getUsedCount() {
    return usedCount;
  }

  public void setUsedCount(Integer usedCount) {
    this.usedCount = usedCount;
  }

  public OfferShortResponse removedCount(Integer removedCount) {
    this.removedCount = removedCount;
    return this;
  }

   /**
   * Get removedCount
   * @return removedCount
  **/
  public Integer getRemovedCount() {
    return removedCount;
  }

  public void setRemovedCount(Integer removedCount) {
    this.removedCount = removedCount;
  }

  public OfferShortResponse locationAddedCount(Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
    return this;
  }

   /**
   * Get locationAddedCount
   * @return locationAddedCount
  **/
  public Integer getLocationAddedCount() {
    return locationAddedCount;
  }

  public void setLocationAddedCount(Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
  }

  public OfferShortResponse barcodeEntry(String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
    return this;
  }

   /**
   * Get barcodeEntry
   * @return barcodeEntry
  **/
  public String getBarcodeEntry() {
    return barcodeEntry;
  }

  public void setBarcodeEntry(String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
  }

  public OfferShortResponse barcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

   /**
   * Get barcodeType
   * @return barcodeType
  **/
  public BarcodeTypeEnum getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
  }

  public OfferShortResponse ticketsReward(Long ticketsReward) {
    this.ticketsReward = ticketsReward;
    return this;
  }

   /**
   * Get ticketsReward
   * @return ticketsReward
  **/
  public Long getTicketsReward() {
    return ticketsReward;
  }

  public void setTicketsReward(Long ticketsReward) {
    this.ticketsReward = ticketsReward;
  }

  public OfferShortResponse ticketsRewardType(String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
    return this;
  }

   /**
   * Get ticketsRewardType
   * @return ticketsRewardType
  **/
  public String getTicketsRewardType() {
    return ticketsRewardType;
  }

  public void setTicketsRewardType(String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
  }

  public OfferShortResponse specialOfferType(SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
    return this;
  }

   /**
   * Get specialOfferType
   * @return specialOfferType
  **/
  public SpecialOfferTypeEnum getSpecialOfferType() {
    return specialOfferType;
  }

  public void setSpecialOfferType(SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
  }

  public OfferShortResponse likeCount(Long likeCount) {
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

  public OfferShortResponse dislikeCount(Long dislikeCount) {
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

  public OfferShortResponse favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public OfferShortResponse noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

   /**
   * Get noteCount
   * @return noteCount
  **/
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public OfferShortResponse logId(Long logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  public Long getLogId() {
    return logId;
  }

  public void setLogId(Long logId) {
    this.logId = logId;
  }

  public OfferShortResponse billableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

   /**
   * Get billableEntityId
   * @return billableEntityId
  **/
  public Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public OfferShortResponse responsibleAccountId(Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
    return this;
  }

   /**
   * Get responsibleAccountId
   * @return responsibleAccountId
  **/
  public Long getResponsibleAccountId() {
    return responsibleAccountId;
  }

  public void setResponsibleAccountId(Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
  }

  public OfferShortResponse availabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
    return this;
  }

   /**
   * Get availabilitySummary
   * @return availabilitySummary
  **/
  public String getAvailabilitySummary() {
    return availabilitySummary;
  }

  public void setAvailabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
  }

  public OfferShortResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OfferShortResponse parentOffer(OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
    return this;
  }

   /**
   * Get parentOffer
   * @return parentOffer
  **/
  public OfferShortResponse getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
  }

  public OfferShortResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
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
    return Objects.equals(valid, offerShortResponse.valid) &&
        Objects.equals(message, offerShortResponse.message) &&
        Objects.equals(version, offerShortResponse.version) &&
        Objects.equals(serializeNulls, offerShortResponse.serializeNulls) &&
        Objects.equals(startTimeLog, offerShortResponse.startTimeLog) &&
        Objects.equals(errorCode, offerShortResponse.errorCode) &&
        Objects.equals(request, offerShortResponse.request) &&
        Objects.equals(offerLocationId, offerShortResponse.offerLocationId) &&
        Objects.equals(offerId, offerShortResponse.offerId) &&
        Objects.equals(retailerId, offerShortResponse.retailerId) &&
        Objects.equals(transactionId, offerShortResponse.transactionId) &&
        Objects.equals(favoriteId, offerShortResponse.favoriteId) &&
        Objects.equals(offerName, offerShortResponse.offerName) &&
        Objects.equals(subTitle, offerShortResponse.subTitle) &&
        Objects.equals(locationName, offerShortResponse.locationName) &&
        Objects.equals(starts, offerShortResponse.starts) &&
        Objects.equals(expires, offerShortResponse.expires) &&
        Objects.equals(activated, offerShortResponse.activated) &&
        Objects.equals(expiration, offerShortResponse.expiration) &&
        Objects.equals(redeemableStart, offerShortResponse.redeemableStart) &&
        Objects.equals(redeemableEnd, offerShortResponse.redeemableEnd) &&
        Objects.equals(distance, offerShortResponse.distance) &&
        Objects.equals(offerType, offerShortResponse.offerType) &&
        Objects.equals(longitude, offerShortResponse.longitude) &&
        Objects.equals(latitude, offerShortResponse.latitude) &&
        Objects.equals(favorite, offerShortResponse.favorite) &&
        Objects.equals(fullPrice, offerShortResponse.fullPrice) &&
        Objects.equals(discountPrice, offerShortResponse.discountPrice) &&
        Objects.equals(estimatedValue, offerShortResponse.estimatedValue) &&
        Objects.equals(voucherDiscountPrice, offerShortResponse.voucherDiscountPrice) &&
        Objects.equals(missionListResponse, offerShortResponse.missionListResponse) &&
        Objects.equals(image, offerShortResponse.image) &&
        Objects.equals(image1, offerShortResponse.image1) &&
        Objects.equals(image2, offerShortResponse.image2) &&
        Objects.equals(image3, offerShortResponse.image3) &&
        Objects.equals(image4, offerShortResponse.image4) &&
        Objects.equals(image5, offerShortResponse.image5) &&
        Objects.equals(images, offerShortResponse.images) &&
        Objects.equals(barcode, offerShortResponse.barcode) &&
        Objects.equals(externalUrl, offerShortResponse.externalUrl) &&
        Objects.equals(sqootUrl, offerShortResponse.sqootUrl) &&
        Objects.equals(active, offerShortResponse.active) &&
        Objects.equals(location, offerShortResponse.location) &&
        Objects.equals(subDetails, offerShortResponse.subDetails) &&
        Objects.equals(externalRedeemAuth, offerShortResponse.externalRedeemAuth) &&
        Objects.equals(externalRedeemOptions, offerShortResponse.externalRedeemOptions) &&
        Objects.equals(publisher, offerShortResponse.publisher) &&
        Objects.equals(product, offerShortResponse.product) &&
        Objects.equals(event, offerShortResponse.event) &&
        Objects.equals(media, offerShortResponse.media) &&
        Objects.equals(viewedCount, offerShortResponse.viewedCount) &&
        Objects.equals(clickedCount, offerShortResponse.clickedCount) &&
        Objects.equals(addedLimit, offerShortResponse.addedLimit) &&
        Objects.equals(addedCount, offerShortResponse.addedCount) &&
        Objects.equals(usedCount, offerShortResponse.usedCount) &&
        Objects.equals(removedCount, offerShortResponse.removedCount) &&
        Objects.equals(locationAddedCount, offerShortResponse.locationAddedCount) &&
        Objects.equals(barcodeEntry, offerShortResponse.barcodeEntry) &&
        Objects.equals(barcodeType, offerShortResponse.barcodeType) &&
        Objects.equals(ticketsReward, offerShortResponse.ticketsReward) &&
        Objects.equals(ticketsRewardType, offerShortResponse.ticketsRewardType) &&
        Objects.equals(specialOfferType, offerShortResponse.specialOfferType) &&
        Objects.equals(likeCount, offerShortResponse.likeCount) &&
        Objects.equals(dislikeCount, offerShortResponse.dislikeCount) &&
        Objects.equals(favoriteCount, offerShortResponse.favoriteCount) &&
        Objects.equals(noteCount, offerShortResponse.noteCount) &&
        Objects.equals(logId, offerShortResponse.logId) &&
        Objects.equals(billableEntityId, offerShortResponse.billableEntityId) &&
        Objects.equals(responsibleAccountId, offerShortResponse.responsibleAccountId) &&
        Objects.equals(availabilitySummary, offerShortResponse.availabilitySummary) &&
        Objects.equals(externalId, offerShortResponse.externalId) &&
        Objects.equals(parentOffer, offerShortResponse.parentOffer) &&
        Objects.equals(returning, offerShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, offerLocationId, offerId, retailerId, transactionId, favoriteId, offerName, subTitle, locationName, starts, expires, activated, expiration, redeemableStart, redeemableEnd, distance, offerType, longitude, latitude, favorite, fullPrice, discountPrice, estimatedValue, voucherDiscountPrice, missionListResponse, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, sqootUrl, active, location, subDetails, externalRedeemAuth, externalRedeemOptions, publisher, product, event, media, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, locationAddedCount, barcodeEntry, barcodeType, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, logId, billableEntityId, responsibleAccountId, availabilitySummary, externalId, parentOffer, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

