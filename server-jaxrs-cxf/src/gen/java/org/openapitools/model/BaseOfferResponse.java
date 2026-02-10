package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BaseOfferResponse  {
  
  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String details;

  @ApiModelProperty(value = "")

  private String subTitle;

  @ApiModelProperty(value = "")

  private Long activated;

  @ApiModelProperty(value = "")

  private Long expiration;

  @ApiModelProperty(value = "")

  private Long redeemableStart;

  @ApiModelProperty(value = "")

  private Long redeemableEnd;

  @ApiModelProperty(value = "")

  private String offerType;

  @ApiModelProperty(value = "")

  private String offerVisibility;

  @ApiModelProperty(value = "")

  private Boolean favorite;

  @ApiModelProperty(value = "")

  private Long deleted;

  @ApiModelProperty(value = "")

  private Double fullPrice;

  @ApiModelProperty(value = "")

  private Double discountPrice;

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

  private Boolean active;

  @ApiModelProperty(value = "")

  private String subDetails;

  @ApiModelProperty(value = "")

  private String externalRedeemOptions;

  @ApiModelProperty(value = "")

  private String publisher;

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

  private Long billableEntityId;

  @ApiModelProperty(value = "")

  private Long responsibleAccountId;

  @ApiModelProperty(value = "")

  private String availabilitySummary;

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  private Long flagThreshold;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  @Valid

  private BaseOfferResponse parentOffer;
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

  public BaseOfferResponse title(String title) {
    this.title = title;
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

  public BaseOfferResponse details(String details) {
    this.details = details;
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

  public BaseOfferResponse subTitle(String subTitle) {
    this.subTitle = subTitle;
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

  public BaseOfferResponse activated(Long activated) {
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

  public BaseOfferResponse expiration(Long expiration) {
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

  public BaseOfferResponse redeemableStart(Long redeemableStart) {
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

  public BaseOfferResponse redeemableEnd(Long redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
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

  public BaseOfferResponse offerType(String offerType) {
    this.offerType = offerType;
    return this;
  }

 /**
   * Get offerVisibility
   * @return offerVisibility
  **/
  @JsonProperty("offerVisibility")
  public String getOfferVisibility() {
    return offerVisibility;
  }

  public void setOfferVisibility(String offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  public BaseOfferResponse offerVisibility(String offerVisibility) {
    this.offerVisibility = offerVisibility;
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

  public BaseOfferResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

 /**
   * Get deleted
   * @return deleted
  **/
  @JsonProperty("deleted")
  public Long getDeleted() {
    return deleted;
  }

  public void setDeleted(Long deleted) {
    this.deleted = deleted;
  }

  public BaseOfferResponse deleted(Long deleted) {
    this.deleted = deleted;
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

  public BaseOfferResponse fullPrice(Double fullPrice) {
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

  public BaseOfferResponse discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
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

  public BaseOfferResponse image(String image) {
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

  public BaseOfferResponse image1(String image1) {
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

  public BaseOfferResponse image2(String image2) {
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

  public BaseOfferResponse image3(String image3) {
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

  public BaseOfferResponse image4(String image4) {
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

  public BaseOfferResponse image5(String image5) {
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

  public BaseOfferResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public BaseOfferResponse addImagesItem(AssetResponse imagesItem) {
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

  public BaseOfferResponse barcode(String barcode) {
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

  public BaseOfferResponse externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
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

  public BaseOfferResponse active(Boolean active) {
    this.active = active;
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

  public BaseOfferResponse subDetails(String subDetails) {
    this.subDetails = subDetails;
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

  public BaseOfferResponse externalRedeemOptions(String externalRedeemOptions) {
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

  public BaseOfferResponse publisher(String publisher) {
    this.publisher = publisher;
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

  public BaseOfferResponse viewedCount(Integer viewedCount) {
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

  public BaseOfferResponse clickedCount(Integer clickedCount) {
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

  public BaseOfferResponse addedLimit(Integer addedLimit) {
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

  public BaseOfferResponse addedCount(Integer addedCount) {
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

  public BaseOfferResponse usedCount(Integer usedCount) {
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

  public BaseOfferResponse removedCount(Integer removedCount) {
    this.removedCount = removedCount;
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

  public BaseOfferResponse ticketsReward(Long ticketsReward) {
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

  public BaseOfferResponse ticketsRewardType(String ticketsRewardType) {
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

  public BaseOfferResponse specialOfferType(SpecialOfferTypeEnum specialOfferType) {
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

  public BaseOfferResponse likeCount(Long likeCount) {
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

  public BaseOfferResponse dislikeCount(Long dislikeCount) {
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

  public BaseOfferResponse favoriteCount(Long favoriteCount) {
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

  public BaseOfferResponse noteCount(Long noteCount) {
    this.noteCount = noteCount;
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

  public BaseOfferResponse billableEntityId(Long billableEntityId) {
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

  public BaseOfferResponse responsibleAccountId(Long responsibleAccountId) {
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

  public BaseOfferResponse availabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
    return this;
  }

 /**
   * Get flagCount
   * @return flagCount
  **/
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public BaseOfferResponse flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

 /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  @JsonProperty("flagThreshold")
  public Long getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(Long flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public BaseOfferResponse flagThreshold(Long flagThreshold) {
    this.flagThreshold = flagThreshold;
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

  public BaseOfferResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get parentOffer
   * @return parentOffer
  **/
  @JsonProperty("parentOffer")
  public BaseOfferResponse getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(BaseOfferResponse parentOffer) {
    this.parentOffer = parentOffer;
  }

  public BaseOfferResponse parentOffer(BaseOfferResponse parentOffer) {
    this.parentOffer = parentOffer;
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
    BaseOfferResponse baseOfferResponse = (BaseOfferResponse) o;
    return Objects.equals(this.title, baseOfferResponse.title) &&
        Objects.equals(this.details, baseOfferResponse.details) &&
        Objects.equals(this.subTitle, baseOfferResponse.subTitle) &&
        Objects.equals(this.activated, baseOfferResponse.activated) &&
        Objects.equals(this.expiration, baseOfferResponse.expiration) &&
        Objects.equals(this.redeemableStart, baseOfferResponse.redeemableStart) &&
        Objects.equals(this.redeemableEnd, baseOfferResponse.redeemableEnd) &&
        Objects.equals(this.offerType, baseOfferResponse.offerType) &&
        Objects.equals(this.offerVisibility, baseOfferResponse.offerVisibility) &&
        Objects.equals(this.favorite, baseOfferResponse.favorite) &&
        Objects.equals(this.deleted, baseOfferResponse.deleted) &&
        Objects.equals(this.fullPrice, baseOfferResponse.fullPrice) &&
        Objects.equals(this.discountPrice, baseOfferResponse.discountPrice) &&
        Objects.equals(this.image, baseOfferResponse.image) &&
        Objects.equals(this.image1, baseOfferResponse.image1) &&
        Objects.equals(this.image2, baseOfferResponse.image2) &&
        Objects.equals(this.image3, baseOfferResponse.image3) &&
        Objects.equals(this.image4, baseOfferResponse.image4) &&
        Objects.equals(this.image5, baseOfferResponse.image5) &&
        Objects.equals(this.images, baseOfferResponse.images) &&
        Objects.equals(this.barcode, baseOfferResponse.barcode) &&
        Objects.equals(this.externalUrl, baseOfferResponse.externalUrl) &&
        Objects.equals(this.active, baseOfferResponse.active) &&
        Objects.equals(this.subDetails, baseOfferResponse.subDetails) &&
        Objects.equals(this.externalRedeemOptions, baseOfferResponse.externalRedeemOptions) &&
        Objects.equals(this.publisher, baseOfferResponse.publisher) &&
        Objects.equals(this.viewedCount, baseOfferResponse.viewedCount) &&
        Objects.equals(this.clickedCount, baseOfferResponse.clickedCount) &&
        Objects.equals(this.addedLimit, baseOfferResponse.addedLimit) &&
        Objects.equals(this.addedCount, baseOfferResponse.addedCount) &&
        Objects.equals(this.usedCount, baseOfferResponse.usedCount) &&
        Objects.equals(this.removedCount, baseOfferResponse.removedCount) &&
        Objects.equals(this.ticketsReward, baseOfferResponse.ticketsReward) &&
        Objects.equals(this.ticketsRewardType, baseOfferResponse.ticketsRewardType) &&
        Objects.equals(this.specialOfferType, baseOfferResponse.specialOfferType) &&
        Objects.equals(this.likeCount, baseOfferResponse.likeCount) &&
        Objects.equals(this.dislikeCount, baseOfferResponse.dislikeCount) &&
        Objects.equals(this.favoriteCount, baseOfferResponse.favoriteCount) &&
        Objects.equals(this.noteCount, baseOfferResponse.noteCount) &&
        Objects.equals(this.billableEntityId, baseOfferResponse.billableEntityId) &&
        Objects.equals(this.responsibleAccountId, baseOfferResponse.responsibleAccountId) &&
        Objects.equals(this.availabilitySummary, baseOfferResponse.availabilitySummary) &&
        Objects.equals(this.flagCount, baseOfferResponse.flagCount) &&
        Objects.equals(this.flagThreshold, baseOfferResponse.flagThreshold) &&
        Objects.equals(this.externalId, baseOfferResponse.externalId) &&
        Objects.equals(this.parentOffer, baseOfferResponse.parentOffer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, details, subTitle, activated, expiration, redeemableStart, redeemableEnd, offerType, offerVisibility, favorite, deleted, fullPrice, discountPrice, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, active, subDetails, externalRedeemOptions, publisher, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, billableEntityId, responsibleAccountId, availabilitySummary, flagCount, flagThreshold, externalId, parentOffer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseOfferResponse {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    redeemableStart: ").append(toIndentedString(redeemableStart)).append("\n");
    sb.append("    redeemableEnd: ").append(toIndentedString(redeemableEnd)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    offerVisibility: ").append(toIndentedString(offerVisibility)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    image1: ").append(toIndentedString(image1)).append("\n");
    sb.append("    image2: ").append(toIndentedString(image2)).append("\n");
    sb.append("    image3: ").append(toIndentedString(image3)).append("\n");
    sb.append("    image4: ").append(toIndentedString(image4)).append("\n");
    sb.append("    image5: ").append(toIndentedString(image5)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    subDetails: ").append(toIndentedString(subDetails)).append("\n");
    sb.append("    externalRedeemOptions: ").append(toIndentedString(externalRedeemOptions)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    viewedCount: ").append(toIndentedString(viewedCount)).append("\n");
    sb.append("    clickedCount: ").append(toIndentedString(clickedCount)).append("\n");
    sb.append("    addedLimit: ").append(toIndentedString(addedLimit)).append("\n");
    sb.append("    addedCount: ").append(toIndentedString(addedCount)).append("\n");
    sb.append("    usedCount: ").append(toIndentedString(usedCount)).append("\n");
    sb.append("    removedCount: ").append(toIndentedString(removedCount)).append("\n");
    sb.append("    ticketsReward: ").append(toIndentedString(ticketsReward)).append("\n");
    sb.append("    ticketsRewardType: ").append(toIndentedString(ticketsRewardType)).append("\n");
    sb.append("    specialOfferType: ").append(toIndentedString(specialOfferType)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    billableEntityId: ").append(toIndentedString(billableEntityId)).append("\n");
    sb.append("    responsibleAccountId: ").append(toIndentedString(responsibleAccountId)).append("\n");
    sb.append("    availabilitySummary: ").append(toIndentedString(availabilitySummary)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    parentOffer: ").append(toIndentedString(parentOffer)).append("\n");
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

