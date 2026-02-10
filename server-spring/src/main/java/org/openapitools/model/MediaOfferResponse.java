package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.BaseOfferResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.FilterResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MediaOfferResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MediaOfferResponse {

  private @Nullable String title;

  private @Nullable String details;

  private @Nullable String subTitle;

  private @Nullable Long activated;

  private @Nullable Long expiration;

  private @Nullable Long redeemableStart;

  private @Nullable Long redeemableEnd;

  private @Nullable String offerType;

  private @Nullable String offerVisibility;

  private @Nullable Boolean favorite;

  private @Nullable Long deleted;

  private @Nullable Double fullPrice;

  private @Nullable Double discountPrice;

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

  private @Nullable Boolean active;

  private @Nullable String subDetails;

  private @Nullable String externalRedeemOptions;

  private @Nullable String publisher;

  private @Nullable Integer viewedCount;

  private @Nullable Integer clickedCount;

  private @Nullable Integer addedLimit;

  private @Nullable Integer addedCount;

  private @Nullable Integer usedCount;

  private @Nullable Integer removedCount;

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

  private @Nullable Long billableEntityId;

  private @Nullable Long responsibleAccountId;

  private @Nullable String availabilitySummary;

  private @Nullable Long flagCount;

  private @Nullable Long flagThreshold;

  private @Nullable String externalId;

  private @Nullable BaseOfferResponse parentOffer;

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  @Valid
  private List<@Valid FilterResponse> filters = new ArrayList<>();

  public MediaOfferResponse title(@Nullable String title) {
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

  public MediaOfferResponse details(@Nullable String details) {
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

  public MediaOfferResponse subTitle(@Nullable String subTitle) {
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

  public MediaOfferResponse activated(@Nullable Long activated) {
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

  public MediaOfferResponse expiration(@Nullable Long expiration) {
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

  public MediaOfferResponse redeemableStart(@Nullable Long redeemableStart) {
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

  public MediaOfferResponse redeemableEnd(@Nullable Long redeemableEnd) {
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

  public MediaOfferResponse offerType(@Nullable String offerType) {
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

  public MediaOfferResponse offerVisibility(@Nullable String offerVisibility) {
    this.offerVisibility = offerVisibility;
    return this;
  }

  /**
   * Get offerVisibility
   * @return offerVisibility
   */
  
  @Schema(name = "offerVisibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerVisibility")
  public @Nullable String getOfferVisibility() {
    return offerVisibility;
  }

  public void setOfferVisibility(@Nullable String offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  public MediaOfferResponse favorite(@Nullable Boolean favorite) {
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

  public MediaOfferResponse deleted(@Nullable Long deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
   */
  
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public @Nullable Long getDeleted() {
    return deleted;
  }

  public void setDeleted(@Nullable Long deleted) {
    this.deleted = deleted;
  }

  public MediaOfferResponse fullPrice(@Nullable Double fullPrice) {
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

  public MediaOfferResponse discountPrice(@Nullable Double discountPrice) {
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

  public MediaOfferResponse image(@Nullable String image) {
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

  public MediaOfferResponse image1(@Nullable String image1) {
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

  public MediaOfferResponse image2(@Nullable String image2) {
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

  public MediaOfferResponse image3(@Nullable String image3) {
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

  public MediaOfferResponse image4(@Nullable String image4) {
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

  public MediaOfferResponse image5(@Nullable String image5) {
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

  public MediaOfferResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public MediaOfferResponse addImagesItem(AssetResponse imagesItem) {
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

  public MediaOfferResponse barcode(@Nullable String barcode) {
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

  public MediaOfferResponse externalUrl(@Nullable String externalUrl) {
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

  public MediaOfferResponse active(@Nullable Boolean active) {
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

  public MediaOfferResponse subDetails(@Nullable String subDetails) {
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

  public MediaOfferResponse externalRedeemOptions(@Nullable String externalRedeemOptions) {
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

  public MediaOfferResponse publisher(@Nullable String publisher) {
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

  public MediaOfferResponse viewedCount(@Nullable Integer viewedCount) {
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

  public MediaOfferResponse clickedCount(@Nullable Integer clickedCount) {
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

  public MediaOfferResponse addedLimit(@Nullable Integer addedLimit) {
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

  public MediaOfferResponse addedCount(@Nullable Integer addedCount) {
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

  public MediaOfferResponse usedCount(@Nullable Integer usedCount) {
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

  public MediaOfferResponse removedCount(@Nullable Integer removedCount) {
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

  public MediaOfferResponse ticketsReward(@Nullable Long ticketsReward) {
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

  public MediaOfferResponse ticketsRewardType(@Nullable String ticketsRewardType) {
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

  public MediaOfferResponse specialOfferType(@Nullable SpecialOfferTypeEnum specialOfferType) {
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

  public MediaOfferResponse likeCount(@Nullable Long likeCount) {
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

  public MediaOfferResponse dislikeCount(@Nullable Long dislikeCount) {
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

  public MediaOfferResponse favoriteCount(@Nullable Long favoriteCount) {
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

  public MediaOfferResponse noteCount(@Nullable Long noteCount) {
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

  public MediaOfferResponse billableEntityId(@Nullable Long billableEntityId) {
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

  public MediaOfferResponse responsibleAccountId(@Nullable Long responsibleAccountId) {
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

  public MediaOfferResponse availabilitySummary(@Nullable String availabilitySummary) {
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

  public MediaOfferResponse flagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

  /**
   * Get flagCount
   * @return flagCount
   */
  
  @Schema(name = "flagCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagCount")
  public @Nullable Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(@Nullable Long flagCount) {
    this.flagCount = flagCount;
  }

  public MediaOfferResponse flagThreshold(@Nullable Long flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

  /**
   * Get flagThreshold
   * @return flagThreshold
   */
  
  @Schema(name = "flagThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagThreshold")
  public @Nullable Long getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(@Nullable Long flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public MediaOfferResponse externalId(@Nullable String externalId) {
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

  public MediaOfferResponse parentOffer(@Nullable BaseOfferResponse parentOffer) {
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
  public @Nullable BaseOfferResponse getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(@Nullable BaseOfferResponse parentOffer) {
    this.parentOffer = parentOffer;
  }

  public MediaOfferResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public MediaOfferResponse addCategoriesItem(CategoryResponse categoriesItem) {
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

  public MediaOfferResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public MediaOfferResponse addFiltersItem(FilterResponse filtersItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaOfferResponse mediaOfferResponse = (MediaOfferResponse) o;
    return Objects.equals(this.title, mediaOfferResponse.title) &&
        Objects.equals(this.details, mediaOfferResponse.details) &&
        Objects.equals(this.subTitle, mediaOfferResponse.subTitle) &&
        Objects.equals(this.activated, mediaOfferResponse.activated) &&
        Objects.equals(this.expiration, mediaOfferResponse.expiration) &&
        Objects.equals(this.redeemableStart, mediaOfferResponse.redeemableStart) &&
        Objects.equals(this.redeemableEnd, mediaOfferResponse.redeemableEnd) &&
        Objects.equals(this.offerType, mediaOfferResponse.offerType) &&
        Objects.equals(this.offerVisibility, mediaOfferResponse.offerVisibility) &&
        Objects.equals(this.favorite, mediaOfferResponse.favorite) &&
        Objects.equals(this.deleted, mediaOfferResponse.deleted) &&
        Objects.equals(this.fullPrice, mediaOfferResponse.fullPrice) &&
        Objects.equals(this.discountPrice, mediaOfferResponse.discountPrice) &&
        Objects.equals(this.image, mediaOfferResponse.image) &&
        Objects.equals(this.image1, mediaOfferResponse.image1) &&
        Objects.equals(this.image2, mediaOfferResponse.image2) &&
        Objects.equals(this.image3, mediaOfferResponse.image3) &&
        Objects.equals(this.image4, mediaOfferResponse.image4) &&
        Objects.equals(this.image5, mediaOfferResponse.image5) &&
        Objects.equals(this.images, mediaOfferResponse.images) &&
        Objects.equals(this.barcode, mediaOfferResponse.barcode) &&
        Objects.equals(this.externalUrl, mediaOfferResponse.externalUrl) &&
        Objects.equals(this.active, mediaOfferResponse.active) &&
        Objects.equals(this.subDetails, mediaOfferResponse.subDetails) &&
        Objects.equals(this.externalRedeemOptions, mediaOfferResponse.externalRedeemOptions) &&
        Objects.equals(this.publisher, mediaOfferResponse.publisher) &&
        Objects.equals(this.viewedCount, mediaOfferResponse.viewedCount) &&
        Objects.equals(this.clickedCount, mediaOfferResponse.clickedCount) &&
        Objects.equals(this.addedLimit, mediaOfferResponse.addedLimit) &&
        Objects.equals(this.addedCount, mediaOfferResponse.addedCount) &&
        Objects.equals(this.usedCount, mediaOfferResponse.usedCount) &&
        Objects.equals(this.removedCount, mediaOfferResponse.removedCount) &&
        Objects.equals(this.ticketsReward, mediaOfferResponse.ticketsReward) &&
        Objects.equals(this.ticketsRewardType, mediaOfferResponse.ticketsRewardType) &&
        Objects.equals(this.specialOfferType, mediaOfferResponse.specialOfferType) &&
        Objects.equals(this.likeCount, mediaOfferResponse.likeCount) &&
        Objects.equals(this.dislikeCount, mediaOfferResponse.dislikeCount) &&
        Objects.equals(this.favoriteCount, mediaOfferResponse.favoriteCount) &&
        Objects.equals(this.noteCount, mediaOfferResponse.noteCount) &&
        Objects.equals(this.billableEntityId, mediaOfferResponse.billableEntityId) &&
        Objects.equals(this.responsibleAccountId, mediaOfferResponse.responsibleAccountId) &&
        Objects.equals(this.availabilitySummary, mediaOfferResponse.availabilitySummary) &&
        Objects.equals(this.flagCount, mediaOfferResponse.flagCount) &&
        Objects.equals(this.flagThreshold, mediaOfferResponse.flagThreshold) &&
        Objects.equals(this.externalId, mediaOfferResponse.externalId) &&
        Objects.equals(this.parentOffer, mediaOfferResponse.parentOffer) &&
        Objects.equals(this.categories, mediaOfferResponse.categories) &&
        Objects.equals(this.filters, mediaOfferResponse.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, details, subTitle, activated, expiration, redeemableStart, redeemableEnd, offerType, offerVisibility, favorite, deleted, fullPrice, discountPrice, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, active, subDetails, externalRedeemOptions, publisher, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, billableEntityId, responsibleAccountId, availabilitySummary, flagCount, flagThreshold, externalId, parentOffer, categories, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaOfferResponse {\n");
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
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

