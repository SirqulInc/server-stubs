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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OfferResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long offerLocationId;
  private Long offerId;
  private Long retailerId;
  private Long transactionId;
  private Long favoriteId;
  private String offerName;
  private String subTitle;
  private String locationName;
  private Date starts;
  private Date expires;
  private Long activated;
  private Long expiration;
  private Long redeemableStart;
  private Long redeemableEnd;
  private Double distance;
  private String offerType;
  private Double longitude;
  private Double latitude;
  private Boolean favorite;
  private Double fullPrice;
  private Double discountPrice;
  private Double estimatedValue;
  private Double voucherDiscountPrice;
  private MissionListResponse missionListResponse;
  private String image;
  private String image1;
  private String image2;
  private String image3;
  private String image4;
  private String image5;
  private List<@Valid AssetResponse> images = new ArrayList<>();
  private String barcode;
  private String externalUrl;
  private String sqootUrl;
  private Boolean active;
  private RetailerLocationResponse location;
  private String subDetails;
  private Integer externalRedeemAuth;
  private String externalRedeemOptions;
  private String publisher;
  private ProductResponse product;
  private EventResponse event;
  private MediaResponse media;
  private Integer viewedCount;
  private Integer clickedCount;
  private Integer addedLimit;
  private Integer addedCount;
  private Integer usedCount;
  private Integer removedCount;
  private Integer locationAddedCount;
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
    private String value;

    BarcodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private BarcodeTypeEnum barcodeType;
  private Long ticketsReward;
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
    private String value;

    SpecialOfferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SpecialOfferTypeEnum specialOfferType;
  private Long likeCount;
  private Long dislikeCount;
  private Long favoriteCount;
  private Long noteCount;
  private Long logId;
  private Long billableEntityId;
  private Long responsibleAccountId;
  private String availabilitySummary;
  private String externalId;
  private OfferShortResponse parentOffer;
  private String address;
  private String details;
  private String finePrint;
  private String retailerPhoneNumber;
  private String ticketPriceType;
  private Long ticketPrice;
  private Double discountPercentage;
  private Double paymentFees;
  private Double voucherPrice;
  private Integer purchasesRemaining;
  private Integer redemptionsRemaining;
  private Integer redemptionStatus;
  private String redemptionCode;
  private List<@Valid AudienceResponse> audiences = new ArrayList<>();
  private Integer audienceCount;
  private Integer walletCount;
  private String qrCodeUrl;
  private Boolean showRemaining;
  private Boolean showRedeemed;
  private Integer purchaseLimit;
  private Integer purchaseLimitPerUser;
  private Integer redemptionLimit;
  private Integer userRedemptionLimit;
  private List<@Valid CategoryResponse> categories = new ArrayList<>();
  private List<@Valid FilterResponse> filters = new ArrayList<>();
  private String returning;

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
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerLocationId")
  public Long getOfferLocationId() {
    return offerLocationId;
  }
  public void setOfferLocationId(Long offerLocationId) {
    this.offerLocationId = offerLocationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerId")
  public Long getOfferId() {
    return offerId;
  }
  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerId")
  public Long getRetailerId() {
    return retailerId;
  }
  public void setRetailerId(Long retailerId) {
    this.retailerId = retailerId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transactionId")
  public Long getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }
  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerName")
  public String getOfferName() {
    return offerName;
  }
  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subTitle")
  public String getSubTitle() {
    return subTitle;
  }
  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationName")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("starts")
  public Date getStarts() {
    return starts;
  }
  public void setStarts(Date starts) {
    this.starts = starts;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expires")
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activated")
  public Long getActivated() {
    return activated;
  }
  public void setActivated(Long activated) {
    this.activated = activated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("expiration")
  public Long getExpiration() {
    return expiration;
  }
  public void setExpiration(Long expiration) {
    this.expiration = expiration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redeemableStart")
  public Long getRedeemableStart() {
    return redeemableStart;
  }
  public void setRedeemableStart(Long redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redeemableEnd")
  public Long getRedeemableEnd() {
    return redeemableEnd;
  }
  public void setRedeemableEnd(Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerType")
  public String getOfferType() {
    return offerType;
  }
  public void setOfferType(String offerType) {
    this.offerType = offerType;
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
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fullPrice")
  public Double getFullPrice() {
    return fullPrice;
  }
  public void setFullPrice(Double fullPrice) {
    this.fullPrice = fullPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("discountPrice")
  public Double getDiscountPrice() {
    return discountPrice;
  }
  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("estimatedValue")
  public Double getEstimatedValue() {
    return estimatedValue;
  }
  public void setEstimatedValue(Double estimatedValue) {
    this.estimatedValue = estimatedValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("voucherDiscountPrice")
  public Double getVoucherDiscountPrice() {
    return voucherDiscountPrice;
  }
  public void setVoucherDiscountPrice(Double voucherDiscountPrice) {
    this.voucherDiscountPrice = voucherDiscountPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missionListResponse")
  @Valid
  public MissionListResponse getMissionListResponse() {
    return missionListResponse;
  }
  public void setMissionListResponse(MissionListResponse missionListResponse) {
    this.missionListResponse = missionListResponse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image1")
  public String getImage1() {
    return image1;
  }
  public void setImage1(String image1) {
    this.image1 = image1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image2")
  public String getImage2() {
    return image2;
  }
  public void setImage2(String image2) {
    this.image2 = image2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image3")
  public String getImage3() {
    return image3;
  }
  public void setImage3(String image3) {
    this.image3 = image3;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image4")
  public String getImage4() {
    return image4;
  }
  public void setImage4(String image4) {
    this.image4 = image4;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("image5")
  public String getImage5() {
    return image5;
  }
  public void setImage5(String image5) {
    this.image5 = image5;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  @Valid
  public List<@Valid AssetResponse> getImages() {
    return images;
  }
  public void setImages(List<@Valid AssetResponse> images) {
    this.images = images;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("barcode")
  public String getBarcode() {
    return barcode;
  }
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalUrl")
  public String getExternalUrl() {
    return externalUrl;
  }
  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sqootUrl")
  public String getSqootUrl() {
    return sqootUrl;
  }
  public void setSqootUrl(String sqootUrl) {
    this.sqootUrl = sqootUrl;
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
  @JsonProperty("location")
  @Valid
  public RetailerLocationResponse getLocation() {
    return location;
  }
  public void setLocation(RetailerLocationResponse location) {
    this.location = location;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subDetails")
  public String getSubDetails() {
    return subDetails;
  }
  public void setSubDetails(String subDetails) {
    this.subDetails = subDetails;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalRedeemAuth")
  public Integer getExternalRedeemAuth() {
    return externalRedeemAuth;
  }
  public void setExternalRedeemAuth(Integer externalRedeemAuth) {
    this.externalRedeemAuth = externalRedeemAuth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalRedeemOptions")
  public String getExternalRedeemOptions() {
    return externalRedeemOptions;
  }
  public void setExternalRedeemOptions(String externalRedeemOptions) {
    this.externalRedeemOptions = externalRedeemOptions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publisher")
  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("product")
  @Valid
  public ProductResponse getProduct() {
    return product;
  }
  public void setProduct(ProductResponse product) {
    this.product = product;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event")
  @Valid
  public EventResponse getEvent() {
    return event;
  }
  public void setEvent(EventResponse event) {
    this.event = event;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  @Valid
  public MediaResponse getMedia() {
    return media;
  }
  public void setMedia(MediaResponse media) {
    this.media = media;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("viewedCount")
  public Integer getViewedCount() {
    return viewedCount;
  }
  public void setViewedCount(Integer viewedCount) {
    this.viewedCount = viewedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clickedCount")
  public Integer getClickedCount() {
    return clickedCount;
  }
  public void setClickedCount(Integer clickedCount) {
    this.clickedCount = clickedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addedLimit")
  public Integer getAddedLimit() {
    return addedLimit;
  }
  public void setAddedLimit(Integer addedLimit) {
    this.addedLimit = addedLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("addedCount")
  public Integer getAddedCount() {
    return addedCount;
  }
  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usedCount")
  public Integer getUsedCount() {
    return usedCount;
  }
  public void setUsedCount(Integer usedCount) {
    this.usedCount = usedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("removedCount")
  public Integer getRemovedCount() {
    return removedCount;
  }
  public void setRemovedCount(Integer removedCount) {
    this.removedCount = removedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationAddedCount")
  public Integer getLocationAddedCount() {
    return locationAddedCount;
  }
  public void setLocationAddedCount(Integer locationAddedCount) {
    this.locationAddedCount = locationAddedCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("barcodeEntry")
  public String getBarcodeEntry() {
    return barcodeEntry;
  }
  public void setBarcodeEntry(String barcodeEntry) {
    this.barcodeEntry = barcodeEntry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("barcodeType")
  public BarcodeTypeEnum getBarcodeType() {
    return barcodeType;
  }
  public void setBarcodeType(BarcodeTypeEnum barcodeType) {
    this.barcodeType = barcodeType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsReward")
  public Long getTicketsReward() {
    return ticketsReward;
  }
  public void setTicketsReward(Long ticketsReward) {
    this.ticketsReward = ticketsReward;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketsRewardType")
  public String getTicketsRewardType() {
    return ticketsRewardType;
  }
  public void setTicketsRewardType(String ticketsRewardType) {
    this.ticketsRewardType = ticketsRewardType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("specialOfferType")
  public SpecialOfferTypeEnum getSpecialOfferType() {
    return specialOfferType;
  }
  public void setSpecialOfferType(SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
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
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }
  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }
  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("logId")
  public Long getLogId() {
    return logId;
  }
  public void setLogId(Long logId) {
    this.logId = logId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntityId")
  public Long getBillableEntityId() {
    return billableEntityId;
  }
  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responsibleAccountId")
  public Long getResponsibleAccountId() {
    return responsibleAccountId;
  }
  public void setResponsibleAccountId(Long responsibleAccountId) {
    this.responsibleAccountId = responsibleAccountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availabilitySummary")
  public String getAvailabilitySummary() {
    return availabilitySummary;
  }
  public void setAvailabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentOffer")
  @Valid
  public OfferShortResponse getParentOffer() {
    return parentOffer;
  }
  public void setParentOffer(OfferShortResponse parentOffer) {
    this.parentOffer = parentOffer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("finePrint")
  public String getFinePrint() {
    return finePrint;
  }
  public void setFinePrint(String finePrint) {
    this.finePrint = finePrint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerPhoneNumber")
  public String getRetailerPhoneNumber() {
    return retailerPhoneNumber;
  }
  public void setRetailerPhoneNumber(String retailerPhoneNumber) {
    this.retailerPhoneNumber = retailerPhoneNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketPriceType")
  public String getTicketPriceType() {
    return ticketPriceType;
  }
  public void setTicketPriceType(String ticketPriceType) {
    this.ticketPriceType = ticketPriceType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketPrice")
  public Long getTicketPrice() {
    return ticketPrice;
  }
  public void setTicketPrice(Long ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("discountPercentage")
  public Double getDiscountPercentage() {
    return discountPercentage;
  }
  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentFees")
  public Double getPaymentFees() {
    return paymentFees;
  }
  public void setPaymentFees(Double paymentFees) {
    this.paymentFees = paymentFees;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("voucherPrice")
  public Double getVoucherPrice() {
    return voucherPrice;
  }
  public void setVoucherPrice(Double voucherPrice) {
    this.voucherPrice = voucherPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchasesRemaining")
  public Integer getPurchasesRemaining() {
    return purchasesRemaining;
  }
  public void setPurchasesRemaining(Integer purchasesRemaining) {
    this.purchasesRemaining = purchasesRemaining;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redemptionsRemaining")
  public Integer getRedemptionsRemaining() {
    return redemptionsRemaining;
  }
  public void setRedemptionsRemaining(Integer redemptionsRemaining) {
    this.redemptionsRemaining = redemptionsRemaining;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redemptionStatus")
  public Integer getRedemptionStatus() {
    return redemptionStatus;
  }
  public void setRedemptionStatus(Integer redemptionStatus) {
    this.redemptionStatus = redemptionStatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redemptionCode")
  public String getRedemptionCode() {
    return redemptionCode;
  }
  public void setRedemptionCode(String redemptionCode) {
    this.redemptionCode = redemptionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audiences")
  @Valid
  public List<@Valid AudienceResponse> getAudiences() {
    return audiences;
  }
  public void setAudiences(List<@Valid AudienceResponse> audiences) {
    this.audiences = audiences;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audienceCount")
  public Integer getAudienceCount() {
    return audienceCount;
  }
  public void setAudienceCount(Integer audienceCount) {
    this.audienceCount = audienceCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("walletCount")
  public Integer getWalletCount() {
    return walletCount;
  }
  public void setWalletCount(Integer walletCount) {
    this.walletCount = walletCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("qrCodeUrl")
  public String getQrCodeUrl() {
    return qrCodeUrl;
  }
  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showRemaining")
  public Boolean getShowRemaining() {
    return showRemaining;
  }
  public void setShowRemaining(Boolean showRemaining) {
    this.showRemaining = showRemaining;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showRedeemed")
  public Boolean getShowRedeemed() {
    return showRedeemed;
  }
  public void setShowRedeemed(Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseLimit")
  public Integer getPurchaseLimit() {
    return purchaseLimit;
  }
  public void setPurchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseLimitPerUser")
  public Integer getPurchaseLimitPerUser() {
    return purchaseLimitPerUser;
  }
  public void setPurchaseLimitPerUser(Integer purchaseLimitPerUser) {
    this.purchaseLimitPerUser = purchaseLimitPerUser;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redemptionLimit")
  public Integer getRedemptionLimit() {
    return redemptionLimit;
  }
  public void setRedemptionLimit(Integer redemptionLimit) {
    this.redemptionLimit = redemptionLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("userRedemptionLimit")
  public Integer getUserRedemptionLimit() {
    return userRedemptionLimit;
  }
  public void setUserRedemptionLimit(Integer userRedemptionLimit) {
    this.userRedemptionLimit = userRedemptionLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
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
    OfferResponse offerResponse = (OfferResponse) o;
    return Objects.equals(this.valid, offerResponse.valid) &&
        Objects.equals(this.message, offerResponse.message) &&
        Objects.equals(this.version, offerResponse.version) &&
        Objects.equals(this.serializeNulls, offerResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, offerResponse.startTimeLog) &&
        Objects.equals(this.errorCode, offerResponse.errorCode) &&
        Objects.equals(this.request, offerResponse.request) &&
        Objects.equals(this.offerLocationId, offerResponse.offerLocationId) &&
        Objects.equals(this.offerId, offerResponse.offerId) &&
        Objects.equals(this.retailerId, offerResponse.retailerId) &&
        Objects.equals(this.transactionId, offerResponse.transactionId) &&
        Objects.equals(this.favoriteId, offerResponse.favoriteId) &&
        Objects.equals(this.offerName, offerResponse.offerName) &&
        Objects.equals(this.subTitle, offerResponse.subTitle) &&
        Objects.equals(this.locationName, offerResponse.locationName) &&
        Objects.equals(this.starts, offerResponse.starts) &&
        Objects.equals(this.expires, offerResponse.expires) &&
        Objects.equals(this.activated, offerResponse.activated) &&
        Objects.equals(this.expiration, offerResponse.expiration) &&
        Objects.equals(this.redeemableStart, offerResponse.redeemableStart) &&
        Objects.equals(this.redeemableEnd, offerResponse.redeemableEnd) &&
        Objects.equals(this.distance, offerResponse.distance) &&
        Objects.equals(this.offerType, offerResponse.offerType) &&
        Objects.equals(this.longitude, offerResponse.longitude) &&
        Objects.equals(this.latitude, offerResponse.latitude) &&
        Objects.equals(this.favorite, offerResponse.favorite) &&
        Objects.equals(this.fullPrice, offerResponse.fullPrice) &&
        Objects.equals(this.discountPrice, offerResponse.discountPrice) &&
        Objects.equals(this.estimatedValue, offerResponse.estimatedValue) &&
        Objects.equals(this.voucherDiscountPrice, offerResponse.voucherDiscountPrice) &&
        Objects.equals(this.missionListResponse, offerResponse.missionListResponse) &&
        Objects.equals(this.image, offerResponse.image) &&
        Objects.equals(this.image1, offerResponse.image1) &&
        Objects.equals(this.image2, offerResponse.image2) &&
        Objects.equals(this.image3, offerResponse.image3) &&
        Objects.equals(this.image4, offerResponse.image4) &&
        Objects.equals(this.image5, offerResponse.image5) &&
        Objects.equals(this.images, offerResponse.images) &&
        Objects.equals(this.barcode, offerResponse.barcode) &&
        Objects.equals(this.externalUrl, offerResponse.externalUrl) &&
        Objects.equals(this.sqootUrl, offerResponse.sqootUrl) &&
        Objects.equals(this.active, offerResponse.active) &&
        Objects.equals(this.location, offerResponse.location) &&
        Objects.equals(this.subDetails, offerResponse.subDetails) &&
        Objects.equals(this.externalRedeemAuth, offerResponse.externalRedeemAuth) &&
        Objects.equals(this.externalRedeemOptions, offerResponse.externalRedeemOptions) &&
        Objects.equals(this.publisher, offerResponse.publisher) &&
        Objects.equals(this.product, offerResponse.product) &&
        Objects.equals(this.event, offerResponse.event) &&
        Objects.equals(this.media, offerResponse.media) &&
        Objects.equals(this.viewedCount, offerResponse.viewedCount) &&
        Objects.equals(this.clickedCount, offerResponse.clickedCount) &&
        Objects.equals(this.addedLimit, offerResponse.addedLimit) &&
        Objects.equals(this.addedCount, offerResponse.addedCount) &&
        Objects.equals(this.usedCount, offerResponse.usedCount) &&
        Objects.equals(this.removedCount, offerResponse.removedCount) &&
        Objects.equals(this.locationAddedCount, offerResponse.locationAddedCount) &&
        Objects.equals(this.barcodeEntry, offerResponse.barcodeEntry) &&
        Objects.equals(this.barcodeType, offerResponse.barcodeType) &&
        Objects.equals(this.ticketsReward, offerResponse.ticketsReward) &&
        Objects.equals(this.ticketsRewardType, offerResponse.ticketsRewardType) &&
        Objects.equals(this.specialOfferType, offerResponse.specialOfferType) &&
        Objects.equals(this.likeCount, offerResponse.likeCount) &&
        Objects.equals(this.dislikeCount, offerResponse.dislikeCount) &&
        Objects.equals(this.favoriteCount, offerResponse.favoriteCount) &&
        Objects.equals(this.noteCount, offerResponse.noteCount) &&
        Objects.equals(this.logId, offerResponse.logId) &&
        Objects.equals(this.billableEntityId, offerResponse.billableEntityId) &&
        Objects.equals(this.responsibleAccountId, offerResponse.responsibleAccountId) &&
        Objects.equals(this.availabilitySummary, offerResponse.availabilitySummary) &&
        Objects.equals(this.externalId, offerResponse.externalId) &&
        Objects.equals(this.parentOffer, offerResponse.parentOffer) &&
        Objects.equals(this.address, offerResponse.address) &&
        Objects.equals(this.details, offerResponse.details) &&
        Objects.equals(this.finePrint, offerResponse.finePrint) &&
        Objects.equals(this.retailerPhoneNumber, offerResponse.retailerPhoneNumber) &&
        Objects.equals(this.ticketPriceType, offerResponse.ticketPriceType) &&
        Objects.equals(this.ticketPrice, offerResponse.ticketPrice) &&
        Objects.equals(this.discountPercentage, offerResponse.discountPercentage) &&
        Objects.equals(this.paymentFees, offerResponse.paymentFees) &&
        Objects.equals(this.voucherPrice, offerResponse.voucherPrice) &&
        Objects.equals(this.purchasesRemaining, offerResponse.purchasesRemaining) &&
        Objects.equals(this.redemptionsRemaining, offerResponse.redemptionsRemaining) &&
        Objects.equals(this.redemptionStatus, offerResponse.redemptionStatus) &&
        Objects.equals(this.redemptionCode, offerResponse.redemptionCode) &&
        Objects.equals(this.audiences, offerResponse.audiences) &&
        Objects.equals(this.audienceCount, offerResponse.audienceCount) &&
        Objects.equals(this.walletCount, offerResponse.walletCount) &&
        Objects.equals(this.qrCodeUrl, offerResponse.qrCodeUrl) &&
        Objects.equals(this.showRemaining, offerResponse.showRemaining) &&
        Objects.equals(this.showRedeemed, offerResponse.showRedeemed) &&
        Objects.equals(this.purchaseLimit, offerResponse.purchaseLimit) &&
        Objects.equals(this.purchaseLimitPerUser, offerResponse.purchaseLimitPerUser) &&
        Objects.equals(this.redemptionLimit, offerResponse.redemptionLimit) &&
        Objects.equals(this.userRedemptionLimit, offerResponse.userRedemptionLimit) &&
        Objects.equals(this.categories, offerResponse.categories) &&
        Objects.equals(this.filters, offerResponse.filters) &&
        Objects.equals(this.returning, offerResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, offerLocationId, offerId, retailerId, transactionId, favoriteId, offerName, subTitle, locationName, starts, expires, activated, expiration, redeemableStart, redeemableEnd, distance, offerType, longitude, latitude, favorite, fullPrice, discountPrice, estimatedValue, voucherDiscountPrice, missionListResponse, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, sqootUrl, active, location, subDetails, externalRedeemAuth, externalRedeemOptions, publisher, product, event, media, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, locationAddedCount, barcodeEntry, barcodeType, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, logId, billableEntityId, responsibleAccountId, availabilitySummary, externalId, parentOffer, address, details, finePrint, retailerPhoneNumber, ticketPriceType, ticketPrice, discountPercentage, paymentFees, voucherPrice, purchasesRemaining, redemptionsRemaining, redemptionStatus, redemptionCode, audiences, audienceCount, walletCount, qrCodeUrl, showRemaining, showRedeemed, purchaseLimit, purchaseLimitPerUser, redemptionLimit, userRedemptionLimit, categories, filters, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferResponse {\n");
    
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

