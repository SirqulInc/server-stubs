package apimodels;

import apimodels.AssetResponse;
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
 * BaseOfferResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BaseOfferResponse   {
  @JsonProperty("title")
  
  private String title;

  @JsonProperty("details")
  
  private String details;

  @JsonProperty("subTitle")
  
  private String subTitle;

  @JsonProperty("activated")
  
  private Long activated;

  @JsonProperty("expiration")
  
  private Long expiration;

  @JsonProperty("redeemableStart")
  
  private Long redeemableStart;

  @JsonProperty("redeemableEnd")
  
  private Long redeemableEnd;

  @JsonProperty("offerType")
  
  private String offerType;

  @JsonProperty("offerVisibility")
  
  private String offerVisibility;

  @JsonProperty("favorite")
  
  private Boolean favorite;

  @JsonProperty("deleted")
  
  private Long deleted;

  @JsonProperty("fullPrice")
  
  private Double fullPrice;

  @JsonProperty("discountPrice")
  
  private Double discountPrice;

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

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("subDetails")
  
  private String subDetails;

  @JsonProperty("externalRedeemOptions")
  
  private String externalRedeemOptions;

  @JsonProperty("publisher")
  
  private String publisher;

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

  @JsonProperty("billableEntityId")
  
  private Long billableEntityId;

  @JsonProperty("responsibleAccountId")
  
  private Long responsibleAccountId;

  @JsonProperty("availabilitySummary")
  
  private String availabilitySummary;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("flagThreshold")
  
  private Long flagThreshold;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("parentOffer")
  @Valid

  private BaseOfferResponse parentOffer;

  public BaseOfferResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BaseOfferResponse details(String details) {
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

  public BaseOfferResponse subTitle(String subTitle) {
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

  public BaseOfferResponse activated(Long activated) {
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

  public BaseOfferResponse expiration(Long expiration) {
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

  public BaseOfferResponse redeemableStart(Long redeemableStart) {
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

  public BaseOfferResponse redeemableEnd(Long redeemableEnd) {
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

  public BaseOfferResponse offerType(String offerType) {
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

  public BaseOfferResponse offerVisibility(String offerVisibility) {
    this.offerVisibility = offerVisibility;
    return this;
  }

   /**
   * Get offerVisibility
   * @return offerVisibility
  **/
  public String getOfferVisibility() {
    return offerVisibility;
  }

  public void setOfferVisibility(String offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  public BaseOfferResponse favorite(Boolean favorite) {
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

  public BaseOfferResponse deleted(Long deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  public Long getDeleted() {
    return deleted;
  }

  public void setDeleted(Long deleted) {
    this.deleted = deleted;
  }

  public BaseOfferResponse fullPrice(Double fullPrice) {
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

  public BaseOfferResponse discountPrice(Double discountPrice) {
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

  public BaseOfferResponse image(String image) {
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

  public BaseOfferResponse image1(String image1) {
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

  public BaseOfferResponse image2(String image2) {
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

  public BaseOfferResponse image3(String image3) {
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

  public BaseOfferResponse image4(String image4) {
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

  public BaseOfferResponse image5(String image5) {
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

  public BaseOfferResponse images(List<@Valid AssetResponse> images) {
    this.images = images;
    return this;
  }

  public BaseOfferResponse addImagesItem(AssetResponse imagesItem) {
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

  public BaseOfferResponse barcode(String barcode) {
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

  public BaseOfferResponse externalUrl(String externalUrl) {
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

  public BaseOfferResponse active(Boolean active) {
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

  public BaseOfferResponse subDetails(String subDetails) {
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

  public BaseOfferResponse externalRedeemOptions(String externalRedeemOptions) {
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

  public BaseOfferResponse publisher(String publisher) {
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

  public BaseOfferResponse viewedCount(Integer viewedCount) {
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

  public BaseOfferResponse clickedCount(Integer clickedCount) {
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

  public BaseOfferResponse addedLimit(Integer addedLimit) {
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

  public BaseOfferResponse addedCount(Integer addedCount) {
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

  public BaseOfferResponse usedCount(Integer usedCount) {
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

  public BaseOfferResponse removedCount(Integer removedCount) {
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

  public BaseOfferResponse ticketsReward(Long ticketsReward) {
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

  public BaseOfferResponse ticketsRewardType(String ticketsRewardType) {
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

  public BaseOfferResponse specialOfferType(SpecialOfferTypeEnum specialOfferType) {
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

  public BaseOfferResponse likeCount(Long likeCount) {
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

  public BaseOfferResponse dislikeCount(Long dislikeCount) {
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

  public BaseOfferResponse favoriteCount(Long favoriteCount) {
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

  public BaseOfferResponse noteCount(Long noteCount) {
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

  public BaseOfferResponse billableEntityId(Long billableEntityId) {
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

  public BaseOfferResponse responsibleAccountId(Long responsibleAccountId) {
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

  public BaseOfferResponse availabilitySummary(String availabilitySummary) {
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

  public BaseOfferResponse flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

   /**
   * Get flagCount
   * @return flagCount
  **/
  public Long getFlagCount() {
    return flagCount;
  }

  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  public BaseOfferResponse flagThreshold(Long flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

   /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  public Long getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(Long flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public BaseOfferResponse externalId(String externalId) {
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

  public BaseOfferResponse parentOffer(BaseOfferResponse parentOffer) {
    this.parentOffer = parentOffer;
    return this;
  }

   /**
   * Get parentOffer
   * @return parentOffer
  **/
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
    return Objects.equals(title, baseOfferResponse.title) &&
        Objects.equals(details, baseOfferResponse.details) &&
        Objects.equals(subTitle, baseOfferResponse.subTitle) &&
        Objects.equals(activated, baseOfferResponse.activated) &&
        Objects.equals(expiration, baseOfferResponse.expiration) &&
        Objects.equals(redeemableStart, baseOfferResponse.redeemableStart) &&
        Objects.equals(redeemableEnd, baseOfferResponse.redeemableEnd) &&
        Objects.equals(offerType, baseOfferResponse.offerType) &&
        Objects.equals(offerVisibility, baseOfferResponse.offerVisibility) &&
        Objects.equals(favorite, baseOfferResponse.favorite) &&
        Objects.equals(deleted, baseOfferResponse.deleted) &&
        Objects.equals(fullPrice, baseOfferResponse.fullPrice) &&
        Objects.equals(discountPrice, baseOfferResponse.discountPrice) &&
        Objects.equals(image, baseOfferResponse.image) &&
        Objects.equals(image1, baseOfferResponse.image1) &&
        Objects.equals(image2, baseOfferResponse.image2) &&
        Objects.equals(image3, baseOfferResponse.image3) &&
        Objects.equals(image4, baseOfferResponse.image4) &&
        Objects.equals(image5, baseOfferResponse.image5) &&
        Objects.equals(images, baseOfferResponse.images) &&
        Objects.equals(barcode, baseOfferResponse.barcode) &&
        Objects.equals(externalUrl, baseOfferResponse.externalUrl) &&
        Objects.equals(active, baseOfferResponse.active) &&
        Objects.equals(subDetails, baseOfferResponse.subDetails) &&
        Objects.equals(externalRedeemOptions, baseOfferResponse.externalRedeemOptions) &&
        Objects.equals(publisher, baseOfferResponse.publisher) &&
        Objects.equals(viewedCount, baseOfferResponse.viewedCount) &&
        Objects.equals(clickedCount, baseOfferResponse.clickedCount) &&
        Objects.equals(addedLimit, baseOfferResponse.addedLimit) &&
        Objects.equals(addedCount, baseOfferResponse.addedCount) &&
        Objects.equals(usedCount, baseOfferResponse.usedCount) &&
        Objects.equals(removedCount, baseOfferResponse.removedCount) &&
        Objects.equals(ticketsReward, baseOfferResponse.ticketsReward) &&
        Objects.equals(ticketsRewardType, baseOfferResponse.ticketsRewardType) &&
        Objects.equals(specialOfferType, baseOfferResponse.specialOfferType) &&
        Objects.equals(likeCount, baseOfferResponse.likeCount) &&
        Objects.equals(dislikeCount, baseOfferResponse.dislikeCount) &&
        Objects.equals(favoriteCount, baseOfferResponse.favoriteCount) &&
        Objects.equals(noteCount, baseOfferResponse.noteCount) &&
        Objects.equals(billableEntityId, baseOfferResponse.billableEntityId) &&
        Objects.equals(responsibleAccountId, baseOfferResponse.responsibleAccountId) &&
        Objects.equals(availabilitySummary, baseOfferResponse.availabilitySummary) &&
        Objects.equals(flagCount, baseOfferResponse.flagCount) &&
        Objects.equals(flagThreshold, baseOfferResponse.flagThreshold) &&
        Objects.equals(externalId, baseOfferResponse.externalId) &&
        Objects.equals(parentOffer, baseOfferResponse.parentOffer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, details, subTitle, activated, expiration, redeemableStart, redeemableEnd, offerType, offerVisibility, favorite, deleted, fullPrice, discountPrice, image, image1, image2, image3, image4, image5, images, barcode, externalUrl, active, subDetails, externalRedeemOptions, publisher, viewedCount, clickedCount, addedLimit, addedCount, usedCount, removedCount, ticketsReward, ticketsRewardType, specialOfferType, likeCount, dislikeCount, favoriteCount, noteCount, billableEntityId, responsibleAccountId, availabilitySummary, flagCount, flagThreshold, externalId, parentOffer);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

