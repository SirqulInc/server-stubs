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
import java.util.List;
import org.openapitools.model.AssetResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BaseOfferResponse   {
  
  private String title;
  private String details;
  private String subTitle;
  private Long activated;
  private Long expiration;
  private Long redeemableStart;
  private Long redeemableEnd;
  private String offerType;
  private String offerVisibility;
  private Boolean favorite;
  private Long deleted;
  private Double fullPrice;
  private Double discountPrice;
  private String image;
  private String image1;
  private String image2;
  private String image3;
  private String image4;
  private String image5;
  private List<@Valid AssetResponse> images = new ArrayList<>();
  private String barcode;
  private String externalUrl;
  private Boolean active;
  private String subDetails;
  private String externalRedeemOptions;
  private String publisher;
  private Integer viewedCount;
  private Integer clickedCount;
  private Integer addedLimit;
  private Integer addedCount;
  private Integer usedCount;
  private Integer removedCount;
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
  private Long billableEntityId;
  private Long responsibleAccountId;
  private String availabilitySummary;
  private Long flagCount;
  private Long flagThreshold;
  private String externalId;
  private BaseOfferResponse parentOffer;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  @JsonProperty("offerVisibility")
  public String getOfferVisibility() {
    return offerVisibility;
  }
  public void setOfferVisibility(String offerVisibility) {
    this.offerVisibility = offerVisibility;
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
  @JsonProperty("deleted")
  public Long getDeleted() {
    return deleted;
  }
  public void setDeleted(Long deleted) {
    this.deleted = deleted;
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
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }
  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagThreshold")
  public Long getFlagThreshold() {
    return flagThreshold;
  }
  public void setFlagThreshold(Long flagThreshold) {
    this.flagThreshold = flagThreshold;
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
  public BaseOfferResponse getParentOffer() {
    return parentOffer;
  }
  public void setParentOffer(BaseOfferResponse parentOffer) {
    this.parentOffer = parentOffer;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

