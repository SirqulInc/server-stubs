package apimodels;

import apimodels.AssetResponse;
import apimodels.AudienceResponse;
import apimodels.CategoryResponse;
import apimodels.EventResponse;
import apimodels.FilterResponse;
import apimodels.MediaResponse;
import apimodels.MissionListResponse;
import apimodels.NameStringValueResponse;
import apimodels.OfferShortResponse;
import apimodels.ProductResponse;
import apimodels.RetailerLocationResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RetailerOfferResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailerOfferResponse   {
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

  @JsonProperty("address")
  
  private String address;

  @JsonProperty("details")
  
  private String details;

  @JsonProperty("finePrint")
  
  private String finePrint;

  @JsonProperty("retailerPhoneNumber")
  
  private String retailerPhoneNumber;

  @JsonProperty("ticketPriceType")
  
  private String ticketPriceType;

  @JsonProperty("ticketPrice")
  
  private Long ticketPrice;

  @JsonProperty("discountPercentage")
  
  private Double discountPercentage;

  @JsonProperty("paymentFees")
  
  private Double paymentFees;

  @JsonProperty("voucherPrice")
  
  private Double voucherPrice;

  @JsonProperty("purchasesRemaining")
  
  private Integer purchasesRemaining;

  @JsonProperty("redemptionsRemaining")
  
  private Integer redemptionsRemaining;

  @JsonProperty("redemptionStatus")
  
  private Integer redemptionStatus;

  @JsonProperty("redemptionCode")
  
  private String redemptionCode;

  @JsonProperty("audiences")
  @Valid

  private List<@Valid AudienceResponse> audiences = null;

  @JsonProperty("audienceCount")
  
  private Integer audienceCount;

  @JsonProperty("walletCount")
  
  private Integer walletCount;

  @JsonProperty("qrCodeUrl")
  
  private String qrCodeUrl;

  @JsonProperty("showRemaining")
  
  private Boolean showRemaining;

  @JsonProperty("showRedeemed")
  
  private Boolean showRedeemed;

  @JsonProperty("purchaseLimit")
  
  private Integer purchaseLimit;

  @JsonProperty("purchaseLimitPerUser")
  
  private Integer purchaseLimitPerUser;

  @JsonProperty("redemptionLimit")
  
  private Integer redemptionLimit;

  @JsonProperty("userRedemptionLimit")
  
  private Integer userRedemptionLimit;

  @JsonProperty("categories")
  @Valid

  private List<@Valid CategoryResponse> categories = null;

  @JsonProperty("filters")
  @Valid

  private List<@Valid FilterResponse> filters = null;

  @JsonProperty("locations")
  @Valid

  private List<Map<String, Object>> locations = null;

  @JsonProperty("returning")
  
  private String returning;

  public RetailerOfferResponse valid(Boolean valid) {
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

  public RetailerOfferResponse message(String message) {
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

  public RetailerOfferResponse version(Double version) {
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

  public RetailerOfferResponse serializeNulls(Boolean serializeNulls) {
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

  public RetailerOfferResponse startTimeLog(Long startTimeLog) {
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

  public RetailerOfferResponse errorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public RetailerOfferResponse offerLocationId(Long offerLocationId) {
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

  public RetailerOfferResponse offerId(Long offerId) {
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

  public RetailerOfferResponse retailerId(Long retailerId) {
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

  public RetailerOfferResponse transactionId(Long transactionId) {
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

  public RetailerOfferResponse favoriteId(Long favoriteId) {
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

  public RetailerOfferResponse offerName(String offerName) {
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

  public RetailerOfferResponse subTitle(String subTitle) {
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

  public RetailerOfferResponse locationName(String locationName) {
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

  public RetailerOfferResponse starts(OffsetDateTime starts) {
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

  public RetailerOfferResponse expires(OffsetDateTime expires) {
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

  public RetailerOfferResponse activated(Long activated) {
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

  public RetailerOfferResponse expiration(Long expiration) {
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

  public RetailerOfferResponse redeemableStart(Long redeemableStart) {
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

  public RetailerOfferResponse redeemableEnd(Long redeemableEnd) {
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

  public RetailerOfferResponse distance(Double distance) {
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

  public RetailerOfferResponse offerType(String offerType) {
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

  public RetailerOfferResponse longitude(Double longitude) {
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

  public RetailerOfferResponse latitude(Double latitude) {
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

  public RetailerOfferResponse favorite(Boolean favorite) {
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

  public RetailerOfferResponse fullPrice(Double fullPrice) {
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

  public RetailerOfferResponse discountPrice(Double discountPrice) {
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

  public RetailerOfferResponse estimatedValue(Double estimatedValue) {
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

  public RetailerOfferResponse voucherDiscountPrice(Double voucherDiscountPrice) {
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

  public RetailerOfferResponse missionListResponse(MissionListResponse missionListResponse) {
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

  public RetailerOfferResponse image(String image) {
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

  public RetailerOfferResponse image1(String image1) {
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

  public RetailerOfferResponse image2(String image2) {
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

  public RetailerOfferResponse image3(String image3) {
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

  public RetailerOfferResponse image4(String image4) {
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

  public RetailerOfferResponse image5(String image5) {
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
  **/
  public List<@Valid AssetResponse> getImages() {
    return images;
  }

  public void setImages(List<@Valid AssetResponse> images) {
    this.images = images;
  }

  public RetailerOfferResponse barcode(String barcode) {
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

  public RetailerOfferResponse externalUrl(String externalUrl) {
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

  public RetailerOfferResponse sqootUrl(String sqootUrl) {
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

  public RetailerOfferResponse active(Boolean active) {
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

  public RetailerOfferResponse location(RetailerLocationResponse location) {
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

  public RetailerOfferResponse subDetails(String subDetails) {
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

  public RetailerOfferResponse externalRedeemAuth(Integer externalRedeemAuth) {
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

  public RetailerOfferResponse externalRedeemOptions(String externalRedeemOptions) {
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

  public RetailerOfferResponse publisher(String publisher) {
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

  public RetailerOfferResponse product(ProductResponse product) {
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

  public RetailerOfferResponse event(EventResponse event) {
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

  public RetailerOfferResponse media(MediaResponse media) {
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

  public RetailerOfferResponse viewedCount(Integer viewedCount) {
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

  public RetailerOfferResponse clickedCount(Integer clickedCount) {
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

  public RetailerOfferResponse addedLimit(Integer addedLimit) {
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

  public RetailerOfferResponse addedCount(Integer addedCount) {
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

  public RetailerOfferResponse usedCount(Integer usedCount) {
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

  public RetailerOfferResponse removedCount(Integer removedCount) {
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

  public RetailerOfferResponse locationAddedCount(Integer locationAddedCount) {
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

  public RetailerOfferResponse barcodeEntry(String barcodeEntry) {
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

  public RetailerOfferResponse barcodeType(BarcodeTypeEnum barcodeType) {
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

  public RetailerOfferResponse ticketsReward(Long ticketsReward) {
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

  public RetailerOfferResponse ticketsRewardType(String ticketsRewardType) {
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

  public RetailerOfferResponse specialOfferType(SpecialOfferTypeEnum specialOfferType) {
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

  public RetailerOfferResponse likeCount(Long likeCount) {
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

  public RetailerOfferResponse dislikeCount(Long dislikeCount) {
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

  public RetailerOfferResponse favoriteCount(Long favoriteCount) {
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

  public RetailerOfferResponse noteCount(Long noteCount) {
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

  public RetailerOfferResponse logId(Long logId) {
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

  public RetailerOfferResponse billableEntityId(Long billableEntityId) {
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

  public RetailerOfferResponse responsibleAccountId(Long responsibleAccountId) {
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

  public RetailerOfferResponse availabilitySummary(String availabilitySummary) {
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

  public RetailerOfferResponse externalId(String externalId) {
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

  public RetailerOfferResponse parentOffer(OfferShortResponse parentOffer) {
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

  public RetailerOfferResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public RetailerOfferResponse details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public RetailerOfferResponse finePrint(String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

   /**
   * Get finePrint
   * @return finePrint
  **/
  public String getFinePrint() {
    return finePrint;
  }

  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  public RetailerOfferResponse retailerPhoneNumber(String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
    return this;
  }

   /**
   * Get retailerPhoneNumber
   * @return retailerPhoneNumber
  **/
  public String getRetailerPhoneNumber() {
    return retailerPhoneNumber;
  }

  public void setRetailerPhoneNumber(String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
  }

  public RetailerOfferResponse ticketPriceType(String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
    return this;
  }

   /**
   * Get ticketPriceType
   * @return ticketPriceType
  **/
  public String getTicketPriceType() {
    return ticketPriceType;
  }

  public void setTicketPriceType(String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
  }

  public RetailerOfferResponse ticketPrice(Long ticketPrice) {
    this.ticketPrice = ticketPrice;
    return this;
  }

   /**
   * Get ticketPrice
   * @return ticketPrice
  **/
  public Long getTicketPrice() {
    return ticketPrice;
  }

  public void setTicketPrice(Long ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public RetailerOfferResponse discountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

   /**
   * Get discountPercentage
   * @return discountPercentage
  **/
  public Double getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public RetailerOfferResponse paymentFees(Double paymentFees) {
    this.paymentFees = paymentFees;
    return this;
  }

   /**
   * Get paymentFees
   * @return paymentFees
  **/
  public Double getPaymentFees() {
    return paymentFees;
  }

  public void setPaymentFees(Double paymentFees) {
    this.paymentFees = paymentFees;
  }

  public RetailerOfferResponse voucherPrice(Double voucherPrice) {
    this.voucherPrice = voucherPrice;
    return this;
  }

   /**
   * Get voucherPrice
   * @return voucherPrice
  **/
  public Double getVoucherPrice() {
    return voucherPrice;
  }

  public void setVoucherPrice(Double voucherPrice) {
    this.voucherPrice = voucherPrice;
  }

  public RetailerOfferResponse purchasesRemaining(Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
    return this;
  }

   /**
   * Get purchasesRemaining
   * @return purchasesRemaining
  **/
  public Integer getPurchasesRemaining() {
    return purchasesRemaining;
  }

  public void setPurchasesRemaining(Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
  }

  public RetailerOfferResponse redemptionsRemaining(Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
    return this;
  }

   /**
   * Get redemptionsRemaining
   * @return redemptionsRemaining
  **/
  public Integer getRedemptionsRemaining() {
    return redemptionsRemaining;
  }

  public void setRedemptionsRemaining(Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
  }

  public RetailerOfferResponse redemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
    return this;
  }

   /**
   * Get redemptionStatus
   * @return redemptionStatus
  **/
  public Integer getRedemptionStatus() {
    return redemptionStatus;
  }

  public void setRedemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  public RetailerOfferResponse redemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
    return this;
  }

   /**
   * Get redemptionCode
   * @return redemptionCode
  **/
  public String getRedemptionCode() {
    return redemptionCode;
  }

  public void setRedemptionCode(String redemptionCode) {
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
  **/
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }

  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  public RetailerOfferResponse audienceCount(Integer audienceCount) {
    this.audienceCount = audienceCount;
    return this;
  }

   /**
   * Get audienceCount
   * @return audienceCount
  **/
  public Integer getAudienceCount() {
    return audienceCount;
  }

  public void setAudienceCount(Integer audienceCount) {
    this.audienceCount = audienceCount;
  }

  public RetailerOfferResponse walletCount(Integer walletCount) {
    this.walletCount = walletCount;
    return this;
  }

   /**
   * Get walletCount
   * @return walletCount
  **/
  public Integer getWalletCount() {
    return walletCount;
  }

  public void setWalletCount(Integer walletCount) {
    this.walletCount = walletCount;
  }

  public RetailerOfferResponse qrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
    return this;
  }

   /**
   * Get qrCodeUrl
   * @return qrCodeUrl
  **/
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  public RetailerOfferResponse showRemaining(Boolean showRemaining) {
    this.showRemaining = showRemaining;
    return this;
  }

   /**
   * Get showRemaining
   * @return showRemaining
  **/
  public Boolean getShowRemaining() {
    return showRemaining;
  }

  public void setShowRemaining(Boolean showRemaining) {
    this.showRemaining = showRemaining;
  }

  public RetailerOfferResponse showRedeemed(Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
    return this;
  }

   /**
   * Get showRedeemed
   * @return showRedeemed
  **/
  public Boolean getShowRedeemed() {
    return showRedeemed;
  }

  public void setShowRedeemed(Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
  }

  public RetailerOfferResponse purchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
    return this;
  }

   /**
   * Get purchaseLimit
   * @return purchaseLimit
  **/
  public Integer getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  public RetailerOfferResponse purchaseLimitPerUser(Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
    return this;
  }

   /**
   * Get purchaseLimitPerUser
   * @return purchaseLimitPerUser
  **/
  public Integer getPurchaseLimitPerUser() {
    return purchaseLimitPerUser;
  }

  public void setPurchaseLimitPerUser(Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
  }

  public RetailerOfferResponse redemptionLimit(Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
    return this;
  }

   /**
   * Get redemptionLimit
   * @return redemptionLimit
  **/
  public Integer getRedemptionLimit() {
    return redemptionLimit;
  }

  public void setRedemptionLimit(Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
  }

  public RetailerOfferResponse userRedemptionLimit(Integer userRedemptionLimit) {
    this.userRedemptionLimit = userRedemptionLimit;
    return this;
  }

   /**
   * Get userRedemptionLimit
   * @return userRedemptionLimit
  **/
  public Integer getUserRedemptionLimit() {
    return userRedemptionLimit;
  }

  public void setUserRedemptionLimit(Integer userRedemptionLimit) {
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
  **/
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
  **/
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
  **/
  public List<Map<String, Object>> getLocations() {
    return locations;
  }

  public void setLocations(List<Map<String, Object>> locations) {
    this.locations = locations;
  }

  public RetailerOfferResponse returning(String returning) {
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
    RetailerOfferResponse retailerOfferResponse = (RetailerOfferResponse) o;
    return Objects.equals(valid, retailerOfferResponse.valid) &&
        Objects.equals(message, retailerOfferResponse.message) &&
        Objects.equals(version, retailerOfferResponse.version) &&
        Objects.equals(serializeNulls, retailerOfferResponse.serializeNulls) &&
        Objects.equals(startTimeLog, retailerOfferResponse.startTimeLog) &&
        Objects.equals(errorCode, retailerOfferResponse.errorCode) &&
        Objects.equals(request, retailerOfferResponse.request) &&
        Objects.equals(offerLocationId, retailerOfferResponse.offerLocationId) &&
        Objects.equals(offerId, retailerOfferResponse.offerId) &&
        Objects.equals(retailerId, retailerOfferResponse.retailerId) &&
        Objects.equals(transactionId, retailerOfferResponse.transactionId) &&
        Objects.equals(favoriteId, retailerOfferResponse.favoriteId) &&
        Objects.equals(offerName, retailerOfferResponse.offerName) &&
        Objects.equals(subTitle, retailerOfferResponse.subTitle) &&
        Objects.equals(locationName, retailerOfferResponse.locationName) &&
        Objects.equals(starts, retailerOfferResponse.starts) &&
        Objects.equals(expires, retailerOfferResponse.expires) &&
        Objects.equals(activated, retailerOfferResponse.activated) &&
        Objects.equals(expiration, retailerOfferResponse.expiration) &&
        Objects.equals(redeemableStart, retailerOfferResponse.redeemableStart) &&
        Objects.equals(redeemableEnd, retailerOfferResponse.redeemableEnd) &&
        Objects.equals(distance, retailerOfferResponse.distance) &&
        Objects.equals(offerType, retailerOfferResponse.offerType) &&
        Objects.equals(longitude, retailerOfferResponse.longitude) &&
        Objects.equals(latitude, retailerOfferResponse.latitude) &&
        Objects.equals(favorite, retailerOfferResponse.favorite) &&
        Objects.equals(fullPrice, retailerOfferResponse.fullPrice) &&
        Objects.equals(discountPrice, retailerOfferResponse.discountPrice) &&
        Objects.equals(estimatedValue, retailerOfferResponse.estimatedValue) &&
        Objects.equals(voucherDiscountPrice, retailerOfferResponse.voucherDiscountPrice) &&
        Objects.equals(missionListResponse, retailerOfferResponse.missionListResponse) &&
        Objects.equals(image, retailerOfferResponse.image) &&
        Objects.equals(image1, retailerOfferResponse.image1) &&
        Objects.equals(image2, retailerOfferResponse.image2) &&
        Objects.equals(image3, retailerOfferResponse.image3) &&
        Objects.equals(image4, retailerOfferResponse.image4) &&
        Objects.equals(image5, retailerOfferResponse.image5) &&
        Objects.equals(images, retailerOfferResponse.images) &&
        Objects.equals(barcode, retailerOfferResponse.barcode) &&
        Objects.equals(externalUrl, retailerOfferResponse.externalUrl) &&
        Objects.equals(sqootUrl, retailerOfferResponse.sqootUrl) &&
        Objects.equals(active, retailerOfferResponse.active) &&
        Objects.equals(location, retailerOfferResponse.location) &&
        Objects.equals(subDetails, retailerOfferResponse.subDetails) &&
        Objects.equals(externalRedeemAuth, retailerOfferResponse.externalRedeemAuth) &&
        Objects.equals(externalRedeemOptions, retailerOfferResponse.externalRedeemOptions) &&
        Objects.equals(publisher, retailerOfferResponse.publisher) &&
        Objects.equals(product, retailerOfferResponse.product) &&
        Objects.equals(event, retailerOfferResponse.event) &&
        Objects.equals(media, retailerOfferResponse.media) &&
        Objects.equals(viewedCount, retailerOfferResponse.viewedCount) &&
        Objects.equals(clickedCount, retailerOfferResponse.clickedCount) &&
        Objects.equals(addedLimit, retailerOfferResponse.addedLimit) &&
        Objects.equals(addedCount, retailerOfferResponse.addedCount) &&
        Objects.equals(usedCount, retailerOfferResponse.usedCount) &&
        Objects.equals(removedCount, retailerOfferResponse.removedCount) &&
        Objects.equals(locationAddedCount, retailerOfferResponse.locationAddedCount) &&
        Objects.equals(barcodeEntry, retailerOfferResponse.barcodeEntry) &&
        Objects.equals(barcodeType, retailerOfferResponse.barcodeType) &&
        Objects.equals(ticketsReward, retailerOfferResponse.ticketsReward) &&
        Objects.equals(ticketsRewardType, retailerOfferResponse.ticketsRewardType) &&
        Objects.equals(specialOfferType, retailerOfferResponse.specialOfferType) &&
        Objects.equals(likeCount, retailerOfferResponse.likeCount) &&
        Objects.equals(dislikeCount, retailerOfferResponse.dislikeCount) &&
        Objects.equals(favoriteCount, retailerOfferResponse.favoriteCount) &&
        Objects.equals(noteCount, retailerOfferResponse.noteCount) &&
        Objects.equals(logId, retailerOfferResponse.logId) &&
        Objects.equals(billableEntityId, retailerOfferResponse.billableEntityId) &&
        Objects.equals(responsibleAccountId, retailerOfferResponse.responsibleAccountId) &&
        Objects.equals(availabilitySummary, retailerOfferResponse.availabilitySummary) &&
        Objects.equals(externalId, retailerOfferResponse.externalId) &&
        Objects.equals(parentOffer, retailerOfferResponse.parentOffer) &&
        Objects.equals(address, retailerOfferResponse.address) &&
        Objects.equals(details, retailerOfferResponse.details) &&
        Objects.equals(finePrint, retailerOfferResponse.finePrint) &&
        Objects.equals(retailerPhoneNumber, retailerOfferResponse.retailerPhoneNumber) &&
        Objects.equals(ticketPriceType, retailerOfferResponse.ticketPriceType) &&
        Objects.equals(ticketPrice, retailerOfferResponse.ticketPrice) &&
        Objects.equals(discountPercentage, retailerOfferResponse.discountPercentage) &&
        Objects.equals(paymentFees, retailerOfferResponse.paymentFees) &&
        Objects.equals(voucherPrice, retailerOfferResponse.voucherPrice) &&
        Objects.equals(purchasesRemaining, retailerOfferResponse.purchasesRemaining) &&
        Objects.equals(redemptionsRemaining, retailerOfferResponse.redemptionsRemaining) &&
        Objects.equals(redemptionStatus, retailerOfferResponse.redemptionStatus) &&
        Objects.equals(redemptionCode, retailerOfferResponse.redemptionCode) &&
        Objects.equals(audiences, retailerOfferResponse.audiences) &&
        Objects.equals(audienceCount, retailerOfferResponse.audienceCount) &&
        Objects.equals(walletCount, retailerOfferResponse.walletCount) &&
        Objects.equals(qrCodeUrl, retailerOfferResponse.qrCodeUrl) &&
        Objects.equals(showRemaining, retailerOfferResponse.showRemaining) &&
        Objects.equals(showRedeemed, retailerOfferResponse.showRedeemed) &&
        Objects.equals(purchaseLimit, retailerOfferResponse.purchaseLimit) &&
        Objects.equals(purchaseLimitPerUser, retailerOfferResponse.purchaseLimitPerUser) &&
        Objects.equals(redemptionLimit, retailerOfferResponse.redemptionLimit) &&
        Objects.equals(userRedemptionLimit, retailerOfferResponse.userRedemptionLimit) &&
        Objects.equals(categories, retailerOfferResponse.categories) &&
        Objects.equals(filters, retailerOfferResponse.filters) &&
        Objects.equals(locations, retailerOfferResponse.locations) &&
        Objects.equals(returning, retailerOfferResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, offerLocationId, offerId, retailerId, transactionId, favoriteId, offerName, subTitle, locationName, starts, expires, activated, expiration, redeemableStart, redeemableEnd, distance, offerType, longitude, latitude, favorite, fullPrice, discountPrice, estimatedValue, voucherDiscountPrice, missionListResponse, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, sqootUrl, active, location, subDetails, externalRedeemAuth, externalRedeemOptions, publisher, product, event, media, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, locationAddedCount, barcodeEntry, barcodeType, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, logId, billableEntityId, responsibleAccountId, availabilitySummary, externalId, parentOffer, address, details, finePrint, retailerPhoneNumber, ticketPriceType, ticketPrice, discountPercentage, paymentFees, voucherPrice, purchasesRemaining, redemptionsRemaining, redemptionStatus, redemptionCode, audiences, audienceCount, walletCount, qrCodeUrl, showRemaining, showRedeemed, purchaseLimit, purchaseLimitPerUser, redemptionLimit, userRedemptionLimit, categories, filters, locations, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

