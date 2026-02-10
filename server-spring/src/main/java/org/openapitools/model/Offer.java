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
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.BillableEntity;
import org.openapitools.model.Category;
import org.openapitools.model.Device;
import org.openapitools.model.Event;
import org.openapitools.model.Filter;
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.Media;
import org.openapitools.model.Mission;
import org.openapitools.model.Note;
import org.openapitools.model.OfferLocation;
import org.openapitools.model.Product;
import org.openapitools.model.YayOrNay;
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
 * Offer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Offer {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String testField;

  private @Nullable BillableEntity billableEntity;

  @Valid
  private List<@Valid OfferLocation> offerLocations = new ArrayList<>();

  @Valid
  private List<@Valid Mission> missions = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime activated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime expires;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime redeemableStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime redeemableEnd;

  private @Nullable String title;

  private @Nullable String subTitle;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    VOUCHER("VOUCHER"),
    
    COUPON("COUPON"),
    
    PRODUCT("PRODUCT"),
    
    MEDIA("MEDIA"),
    
    EVENT("EVENT"),
    
    DEVICE("DEVICE");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

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

  private @Nullable String details;

  private @Nullable String subDetails;

  private @Nullable String finePrint;

  private @Nullable String getThereNowNotification;

  private @Nullable Integer maxPrints;

  private @Nullable Integer viewLimit;

  private @Nullable Boolean featured;

  private @Nullable Boolean replaced;

  private @Nullable Boolean showRemaining;

  private @Nullable Boolean showRedeemed;

  private @Nullable Offer parentOffer;

  private @Nullable Asset artwork;

  private @Nullable Asset offerImage1;

  private @Nullable Asset offerImage2;

  private @Nullable Asset offerImage3;

  private @Nullable Asset offerImage4;

  private @Nullable Asset offerImage5;

  private @Nullable Asset barCode;

  /**
   * Gets or Sets barCodeType
   */
  public enum BarCodeTypeEnum {
    NONE("NONE"),
    
    UPC("UPC"),
    
    CODE_128("CODE_128"),
    
    QR("QR"),
    
    CUSTOM_MEDIA("CUSTOM_MEDIA");

    private final String value;

    BarCodeTypeEnum(String value) {
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
    public static BarCodeTypeEnum fromValue(String value) {
      for (BarCodeTypeEnum b : BarCodeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable BarCodeTypeEnum barCodeType;

  private @Nullable String barCodeEntry;

  @Valid
  private List<@Valid Category> categories = new ArrayList<>();

  @Valid
  private List<@Valid Filter> filters = new ArrayList<>();

  private @Nullable String ticketType;

  private @Nullable Boolean allocateTickets;

  private @Nullable String ticketPriceType;

  private @Nullable Long ticketPrice;

  private @Nullable Double fullPrice;

  private @Nullable Double discountPrice;

  private @Nullable Integer availableLimit;

  private @Nullable Integer availableLimitPerUser;

  private @Nullable Integer addedLimit;

  private @Nullable Integer usedCount;

  private @Nullable Integer addedCount;

  private @Nullable Integer removedCount;

  private @Nullable Integer viewedCount;

  private @Nullable Integer clickedCount;

  /**
   * Gets or Sets offerVisibility
   */
  public enum OfferVisibilityEnum {
    PUBLIC("PUBLIC"),
    
    LISTABLE("LISTABLE"),
    
    REWARDABLE("REWARDABLE"),
    
    TRIGGERABLE("TRIGGERABLE"),
    
    PRIVATE("PRIVATE");

    private final String value;

    OfferVisibilityEnum(String value) {
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
    public static OfferVisibilityEnum fromValue(String value) {
      for (OfferVisibilityEnum b : OfferVisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable OfferVisibilityEnum offerVisibility;

  /**
   * Gets or Sets offerProcessorId
   */
  public enum OfferProcessorIdEnum {
    SQOOT("SQOOT"),
    
    YIPIT("YIPIT"),
    
    API("API"),
    
    CSV("CSV");

    private final String value;

    OfferProcessorIdEnum(String value) {
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
    public static OfferProcessorIdEnum fromValue(String value) {
      for (OfferProcessorIdEnum b : OfferProcessorIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable OfferProcessorIdEnum offerProcessorId;

  private @Nullable String externalId;

  private @Nullable String externalUrl;

  private @Nullable String externalUntrackedUrl;

  private @Nullable Long sqootId;

  private @Nullable String sqootUrl;

  private @Nullable String sqootCategorySlug;

  private @Nullable String sqootCategoryName;

  private @Nullable Long yipitId;

  private @Nullable String redeemAuthOptions;

  private @Nullable String publisher;

  private @Nullable Product product;

  private @Nullable Media media;

  private @Nullable Event event;

  private @Nullable Device device;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  private @Nullable Long favoriteCount;

  private @Nullable Boolean hasRatings;

  @Valid
  private List<@Valid YayOrNay> likes = new ArrayList<>();

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable String availabilitySummary;

  @Valid
  private List<@Valid Flag> flags = new ArrayList<>();

  private @Nullable Long flagCount;

  private @Nullable FlagThreshold flagThreshold;

  private @Nullable Double savings;

  private @Nullable Double clickStream;

  private @Nullable Long ticketCount;

  private @Nullable String display;

  private @Nullable String appKey;

  private @Nullable String categoryTree;

  private @Nullable String filterTree;

  private @Nullable Boolean indexable;

  private @Nullable Long billableId;

  private @Nullable String subType;

  private @Nullable String contentName;

  private @Nullable Long defaultThreshold;

  private @Nullable Asset contentAsset;

  private @Nullable Account owner;

  private @Nullable String secondaryType;

  private @Nullable Double discountPercentage;

  public Offer id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Offer active(@Nullable Boolean active) {
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

  public Offer valid(@Nullable Boolean valid) {
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

  public Offer testField(@Nullable String testField) {
    this.testField = testField;
    return this;
  }

  /**
   * Get testField
   * @return testField
   */
  
  @Schema(name = "testField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testField")
  public @Nullable String getTestField() {
    return testField;
  }

  public void setTestField(@Nullable String testField) {
    this.testField = testField;
  }

  public Offer billableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Offer offerLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
    return this;
  }

  public Offer addOfferLocationsItem(OfferLocation offerLocationsItem) {
    if (this.offerLocations == null) {
      this.offerLocations = new ArrayList<>();
    }
    this.offerLocations.add(offerLocationsItem);
    return this;
  }

  /**
   * Get offerLocations
   * @return offerLocations
   */
  @Valid 
  @Schema(name = "offerLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerLocations")
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }

  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  public Offer missions(List<@Valid Mission> missions) {
    this.missions = missions;
    return this;
  }

  public Offer addMissionsItem(Mission missionsItem) {
    if (this.missions == null) {
      this.missions = new ArrayList<>();
    }
    this.missions.add(missionsItem);
    return this;
  }

  /**
   * Get missions
   * @return missions
   */
  @Valid 
  @Schema(name = "missions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missions")
  public List<@Valid Mission> getMissions() {
    return missions;
  }

  public void setMissions(List<@Valid Mission> missions) {
    this.missions = missions;
  }

  public Offer activated(@Nullable OffsetDateTime activated) {
    this.activated = activated;
    return this;
  }

  /**
   * Get activated
   * @return activated
   */
  @Valid 
  @Schema(name = "activated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activated")
  public @Nullable OffsetDateTime getActivated() {
    return activated;
  }

  public void setActivated(@Nullable OffsetDateTime activated) {
    this.activated = activated;
  }

  public Offer expires(@Nullable OffsetDateTime expires) {
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

  public Offer redeemableStart(@Nullable OffsetDateTime redeemableStart) {
    this.redeemableStart = redeemableStart;
    return this;
  }

  /**
   * Get redeemableStart
   * @return redeemableStart
   */
  @Valid 
  @Schema(name = "redeemableStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redeemableStart")
  public @Nullable OffsetDateTime getRedeemableStart() {
    return redeemableStart;
  }

  public void setRedeemableStart(@Nullable OffsetDateTime redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  public Offer redeemableEnd(@Nullable OffsetDateTime redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
    return this;
  }

  /**
   * Get redeemableEnd
   * @return redeemableEnd
   */
  @Valid 
  @Schema(name = "redeemableEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redeemableEnd")
  public @Nullable OffsetDateTime getRedeemableEnd() {
    return redeemableEnd;
  }

  public void setRedeemableEnd(@Nullable OffsetDateTime redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  public Offer title(@Nullable String title) {
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

  public Offer subTitle(@Nullable String subTitle) {
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

  public Offer type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public Offer specialOfferType(@Nullable SpecialOfferTypeEnum specialOfferType) {
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

  public Offer details(@Nullable String details) {
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

  public Offer subDetails(@Nullable String subDetails) {
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

  public Offer finePrint(@Nullable String finePrint) {
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

  public Offer getThereNowNotification(@Nullable String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
    return this;
  }

  /**
   * Get getThereNowNotification
   * @return getThereNowNotification
   */
  
  @Schema(name = "getThereNowNotification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("getThereNowNotification")
  public @Nullable String getGetThereNowNotification() {
    return getThereNowNotification;
  }

  public void setGetThereNowNotification(@Nullable String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
  }

  public Offer maxPrints(@Nullable Integer maxPrints) {
    this.maxPrints = maxPrints;
    return this;
  }

  /**
   * Get maxPrints
   * @return maxPrints
   */
  
  @Schema(name = "maxPrints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPrints")
  public @Nullable Integer getMaxPrints() {
    return maxPrints;
  }

  public void setMaxPrints(@Nullable Integer maxPrints) {
    this.maxPrints = maxPrints;
  }

  public Offer viewLimit(@Nullable Integer viewLimit) {
    this.viewLimit = viewLimit;
    return this;
  }

  /**
   * Get viewLimit
   * @return viewLimit
   */
  
  @Schema(name = "viewLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewLimit")
  public @Nullable Integer getViewLimit() {
    return viewLimit;
  }

  public void setViewLimit(@Nullable Integer viewLimit) {
    this.viewLimit = viewLimit;
  }

  public Offer featured(@Nullable Boolean featured) {
    this.featured = featured;
    return this;
  }

  /**
   * Get featured
   * @return featured
   */
  
  @Schema(name = "featured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featured")
  public @Nullable Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(@Nullable Boolean featured) {
    this.featured = featured;
  }

  public Offer replaced(@Nullable Boolean replaced) {
    this.replaced = replaced;
    return this;
  }

  /**
   * Get replaced
   * @return replaced
   */
  
  @Schema(name = "replaced", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replaced")
  public @Nullable Boolean getReplaced() {
    return replaced;
  }

  public void setReplaced(@Nullable Boolean replaced) {
    this.replaced = replaced;
  }

  public Offer showRemaining(@Nullable Boolean showRemaining) {
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

  public Offer showRedeemed(@Nullable Boolean showRedeemed) {
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

  public Offer parentOffer(@Nullable Offer parentOffer) {
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
  public @Nullable Offer getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(@Nullable Offer parentOffer) {
    this.parentOffer = parentOffer;
  }

  public Offer artwork(@Nullable Asset artwork) {
    this.artwork = artwork;
    return this;
  }

  /**
   * Get artwork
   * @return artwork
   */
  @Valid 
  @Schema(name = "artwork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artwork")
  public @Nullable Asset getArtwork() {
    return artwork;
  }

  public void setArtwork(@Nullable Asset artwork) {
    this.artwork = artwork;
  }

  public Offer offerImage1(@Nullable Asset offerImage1) {
    this.offerImage1 = offerImage1;
    return this;
  }

  /**
   * Get offerImage1
   * @return offerImage1
   */
  @Valid 
  @Schema(name = "offerImage1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerImage1")
  public @Nullable Asset getOfferImage1() {
    return offerImage1;
  }

  public void setOfferImage1(@Nullable Asset offerImage1) {
    this.offerImage1 = offerImage1;
  }

  public Offer offerImage2(@Nullable Asset offerImage2) {
    this.offerImage2 = offerImage2;
    return this;
  }

  /**
   * Get offerImage2
   * @return offerImage2
   */
  @Valid 
  @Schema(name = "offerImage2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerImage2")
  public @Nullable Asset getOfferImage2() {
    return offerImage2;
  }

  public void setOfferImage2(@Nullable Asset offerImage2) {
    this.offerImage2 = offerImage2;
  }

  public Offer offerImage3(@Nullable Asset offerImage3) {
    this.offerImage3 = offerImage3;
    return this;
  }

  /**
   * Get offerImage3
   * @return offerImage3
   */
  @Valid 
  @Schema(name = "offerImage3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerImage3")
  public @Nullable Asset getOfferImage3() {
    return offerImage3;
  }

  public void setOfferImage3(@Nullable Asset offerImage3) {
    this.offerImage3 = offerImage3;
  }

  public Offer offerImage4(@Nullable Asset offerImage4) {
    this.offerImage4 = offerImage4;
    return this;
  }

  /**
   * Get offerImage4
   * @return offerImage4
   */
  @Valid 
  @Schema(name = "offerImage4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerImage4")
  public @Nullable Asset getOfferImage4() {
    return offerImage4;
  }

  public void setOfferImage4(@Nullable Asset offerImage4) {
    this.offerImage4 = offerImage4;
  }

  public Offer offerImage5(@Nullable Asset offerImage5) {
    this.offerImage5 = offerImage5;
    return this;
  }

  /**
   * Get offerImage5
   * @return offerImage5
   */
  @Valid 
  @Schema(name = "offerImage5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerImage5")
  public @Nullable Asset getOfferImage5() {
    return offerImage5;
  }

  public void setOfferImage5(@Nullable Asset offerImage5) {
    this.offerImage5 = offerImage5;
  }

  public Offer barCode(@Nullable Asset barCode) {
    this.barCode = barCode;
    return this;
  }

  /**
   * Get barCode
   * @return barCode
   */
  @Valid 
  @Schema(name = "barCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barCode")
  public @Nullable Asset getBarCode() {
    return barCode;
  }

  public void setBarCode(@Nullable Asset barCode) {
    this.barCode = barCode;
  }

  public Offer barCodeType(@Nullable BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
    return this;
  }

  /**
   * Get barCodeType
   * @return barCodeType
   */
  
  @Schema(name = "barCodeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barCodeType")
  public @Nullable BarCodeTypeEnum getBarCodeType() {
    return barCodeType;
  }

  public void setBarCodeType(@Nullable BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
  }

  public Offer barCodeEntry(@Nullable String barCodeEntry) {
    this.barCodeEntry = barCodeEntry;
    return this;
  }

  /**
   * Get barCodeEntry
   * @return barCodeEntry
   */
  
  @Schema(name = "barCodeEntry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("barCodeEntry")
  public @Nullable String getBarCodeEntry() {
    return barCodeEntry;
  }

  public void setBarCodeEntry(@Nullable String barCodeEntry) {
    this.barCodeEntry = barCodeEntry;
  }

  public Offer categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Offer addCategoriesItem(Category categoriesItem) {
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
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Offer filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Offer addFiltersItem(Filter filtersItem) {
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
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public Offer ticketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * Get ticketType
   * @return ticketType
   */
  
  @Schema(name = "ticketType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketType")
  public @Nullable String getTicketType() {
    return ticketType;
  }

  public void setTicketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
  }

  public Offer allocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

  /**
   * Get allocateTickets
   * @return allocateTickets
   */
  
  @Schema(name = "allocateTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allocateTickets")
  public @Nullable Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Offer ticketPriceType(@Nullable String ticketPriceType) {
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

  public Offer ticketPrice(@Nullable Long ticketPrice) {
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

  public Offer fullPrice(@Nullable Double fullPrice) {
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

  public Offer discountPrice(@Nullable Double discountPrice) {
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

  public Offer availableLimit(@Nullable Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

  /**
   * Get availableLimit
   * @return availableLimit
   */
  
  @Schema(name = "availableLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableLimit")
  public @Nullable Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(@Nullable Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public Offer availableLimitPerUser(@Nullable Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
    return this;
  }

  /**
   * Get availableLimitPerUser
   * @return availableLimitPerUser
   */
  
  @Schema(name = "availableLimitPerUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableLimitPerUser")
  public @Nullable Integer getAvailableLimitPerUser() {
    return availableLimitPerUser;
  }

  public void setAvailableLimitPerUser(@Nullable Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
  }

  public Offer addedLimit(@Nullable Integer addedLimit) {
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

  public Offer usedCount(@Nullable Integer usedCount) {
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

  public Offer addedCount(@Nullable Integer addedCount) {
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

  public Offer removedCount(@Nullable Integer removedCount) {
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

  public Offer viewedCount(@Nullable Integer viewedCount) {
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

  public Offer clickedCount(@Nullable Integer clickedCount) {
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

  public Offer offerVisibility(@Nullable OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
    return this;
  }

  /**
   * Get offerVisibility
   * @return offerVisibility
   */
  
  @Schema(name = "offerVisibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerVisibility")
  public @Nullable OfferVisibilityEnum getOfferVisibility() {
    return offerVisibility;
  }

  public void setOfferVisibility(@Nullable OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  public Offer offerProcessorId(@Nullable OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
    return this;
  }

  /**
   * Get offerProcessorId
   * @return offerProcessorId
   */
  
  @Schema(name = "offerProcessorId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerProcessorId")
  public @Nullable OfferProcessorIdEnum getOfferProcessorId() {
    return offerProcessorId;
  }

  public void setOfferProcessorId(@Nullable OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
  }

  public Offer externalId(@Nullable String externalId) {
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

  public Offer externalUrl(@Nullable String externalUrl) {
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

  public Offer externalUntrackedUrl(@Nullable String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
    return this;
  }

  /**
   * Get externalUntrackedUrl
   * @return externalUntrackedUrl
   */
  
  @Schema(name = "externalUntrackedUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalUntrackedUrl")
  public @Nullable String getExternalUntrackedUrl() {
    return externalUntrackedUrl;
  }

  public void setExternalUntrackedUrl(@Nullable String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
  }

  public Offer sqootId(@Nullable Long sqootId) {
    this.sqootId = sqootId;
    return this;
  }

  /**
   * Get sqootId
   * @return sqootId
   */
  
  @Schema(name = "sqootId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootId")
  public @Nullable Long getSqootId() {
    return sqootId;
  }

  public void setSqootId(@Nullable Long sqootId) {
    this.sqootId = sqootId;
  }

  public Offer sqootUrl(@Nullable String sqootUrl) {
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

  public Offer sqootCategorySlug(@Nullable String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
    return this;
  }

  /**
   * Get sqootCategorySlug
   * @return sqootCategorySlug
   */
  
  @Schema(name = "sqootCategorySlug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootCategorySlug")
  public @Nullable String getSqootCategorySlug() {
    return sqootCategorySlug;
  }

  public void setSqootCategorySlug(@Nullable String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
  }

  public Offer sqootCategoryName(@Nullable String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
    return this;
  }

  /**
   * Get sqootCategoryName
   * @return sqootCategoryName
   */
  
  @Schema(name = "sqootCategoryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootCategoryName")
  public @Nullable String getSqootCategoryName() {
    return sqootCategoryName;
  }

  public void setSqootCategoryName(@Nullable String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
  }

  public Offer yipitId(@Nullable Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

  /**
   * Get yipitId
   * @return yipitId
   */
  
  @Schema(name = "yipitId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yipitId")
  public @Nullable Long getYipitId() {
    return yipitId;
  }

  public void setYipitId(@Nullable Long yipitId) {
    this.yipitId = yipitId;
  }

  public Offer redeemAuthOptions(@Nullable String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
    return this;
  }

  /**
   * Get redeemAuthOptions
   * @return redeemAuthOptions
   */
  
  @Schema(name = "redeemAuthOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redeemAuthOptions")
  public @Nullable String getRedeemAuthOptions() {
    return redeemAuthOptions;
  }

  public void setRedeemAuthOptions(@Nullable String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
  }

  public Offer publisher(@Nullable String publisher) {
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

  public Offer product(@Nullable Product product) {
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
  public @Nullable Product getProduct() {
    return product;
  }

  public void setProduct(@Nullable Product product) {
    this.product = product;
  }

  public Offer media(@Nullable Media media) {
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
  public @Nullable Media getMedia() {
    return media;
  }

  public void setMedia(@Nullable Media media) {
    this.media = media;
  }

  public Offer event(@Nullable Event event) {
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
  public @Nullable Event getEvent() {
    return event;
  }

  public void setEvent(@Nullable Event event) {
    this.event = event;
  }

  public Offer device(@Nullable Device device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   */
  @Valid 
  @Schema(name = "device", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device")
  public @Nullable Device getDevice() {
    return device;
  }

  public void setDevice(@Nullable Device device) {
    this.device = device;
  }

  public Offer notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Offer addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @Valid 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Offer noteCount(@Nullable Long noteCount) {
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

  public Offer favoriteCount(@Nullable Long favoriteCount) {
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

  public Offer hasRatings(@Nullable Boolean hasRatings) {
    this.hasRatings = hasRatings;
    return this;
  }

  /**
   * Get hasRatings
   * @return hasRatings
   */
  
  @Schema(name = "hasRatings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasRatings")
  public @Nullable Boolean getHasRatings() {
    return hasRatings;
  }

  public void setHasRatings(@Nullable Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  public Offer likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Offer addLikesItem(YayOrNay likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Get likes
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Offer likeCount(@Nullable Long likeCount) {
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

  public Offer dislikeCount(@Nullable Long dislikeCount) {
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

  public Offer availabilitySummary(@Nullable String availabilitySummary) {
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

  public Offer flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Offer addFlagsItem(Flag flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Get flags
   * @return flags
   */
  @Valid 
  @Schema(name = "flags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flags")
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Offer flagCount(@Nullable Long flagCount) {
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

  public Offer flagThreshold(@Nullable FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

  /**
   * Get flagThreshold
   * @return flagThreshold
   */
  @Valid 
  @Schema(name = "flagThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flagThreshold")
  public @Nullable FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(@Nullable FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public Offer savings(@Nullable Double savings) {
    this.savings = savings;
    return this;
  }

  /**
   * Get savings
   * @return savings
   */
  
  @Schema(name = "savings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("savings")
  public @Nullable Double getSavings() {
    return savings;
  }

  public void setSavings(@Nullable Double savings) {
    this.savings = savings;
  }

  public Offer clickStream(@Nullable Double clickStream) {
    this.clickStream = clickStream;
    return this;
  }

  /**
   * Get clickStream
   * @return clickStream
   */
  
  @Schema(name = "clickStream", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clickStream")
  public @Nullable Double getClickStream() {
    return clickStream;
  }

  public void setClickStream(@Nullable Double clickStream) {
    this.clickStream = clickStream;
  }

  public Offer ticketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

  /**
   * Get ticketCount
   * @return ticketCount
   */
  
  @Schema(name = "ticketCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketCount")
  public @Nullable Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Offer display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public Offer appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public Offer categoryTree(@Nullable String categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

  /**
   * Get categoryTree
   * @return categoryTree
   */
  
  @Schema(name = "categoryTree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTree")
  public @Nullable String getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(@Nullable String categoryTree) {
    this.categoryTree = categoryTree;
  }

  public Offer filterTree(@Nullable String filterTree) {
    this.filterTree = filterTree;
    return this;
  }

  /**
   * Get filterTree
   * @return filterTree
   */
  
  @Schema(name = "filterTree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filterTree")
  public @Nullable String getFilterTree() {
    return filterTree;
  }

  public void setFilterTree(@Nullable String filterTree) {
    this.filterTree = filterTree;
  }

  public Offer indexable(@Nullable Boolean indexable) {
    this.indexable = indexable;
    return this;
  }

  /**
   * Get indexable
   * @return indexable
   */
  
  @Schema(name = "indexable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("indexable")
  public @Nullable Boolean getIndexable() {
    return indexable;
  }

  public void setIndexable(@Nullable Boolean indexable) {
    this.indexable = indexable;
  }

  public Offer billableId(@Nullable Long billableId) {
    this.billableId = billableId;
    return this;
  }

  /**
   * Get billableId
   * @return billableId
   */
  
  @Schema(name = "billableId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableId")
  public @Nullable Long getBillableId() {
    return billableId;
  }

  public void setBillableId(@Nullable Long billableId) {
    this.billableId = billableId;
  }

  public Offer subType(@Nullable String subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Get subType
   * @return subType
   */
  
  @Schema(name = "subType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subType")
  public @Nullable String getSubType() {
    return subType;
  }

  public void setSubType(@Nullable String subType) {
    this.subType = subType;
  }

  public Offer contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  public Offer defaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

  /**
   * Get defaultThreshold
   * @return defaultThreshold
   */
  
  @Schema(name = "defaultThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultThreshold")
  public @Nullable Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(@Nullable Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Offer contentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

  /**
   * Get contentAsset
   * @return contentAsset
   */
  @Valid 
  @Schema(name = "contentAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentAsset")
  public @Nullable Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(@Nullable Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Offer owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Offer secondaryType(@Nullable String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

  /**
   * Get secondaryType
   * @return secondaryType
   */
  
  @Schema(name = "secondaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryType")
  public @Nullable String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(@Nullable String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public Offer discountPercentage(@Nullable Double discountPercentage) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.id, offer.id) &&
        Objects.equals(this.active, offer.active) &&
        Objects.equals(this.valid, offer.valid) &&
        Objects.equals(this.testField, offer.testField) &&
        Objects.equals(this.billableEntity, offer.billableEntity) &&
        Objects.equals(this.offerLocations, offer.offerLocations) &&
        Objects.equals(this.missions, offer.missions) &&
        Objects.equals(this.activated, offer.activated) &&
        Objects.equals(this.expires, offer.expires) &&
        Objects.equals(this.redeemableStart, offer.redeemableStart) &&
        Objects.equals(this.redeemableEnd, offer.redeemableEnd) &&
        Objects.equals(this.title, offer.title) &&
        Objects.equals(this.subTitle, offer.subTitle) &&
        Objects.equals(this.type, offer.type) &&
        Objects.equals(this.specialOfferType, offer.specialOfferType) &&
        Objects.equals(this.details, offer.details) &&
        Objects.equals(this.subDetails, offer.subDetails) &&
        Objects.equals(this.finePrint, offer.finePrint) &&
        Objects.equals(this.getThereNowNotification, offer.getThereNowNotification) &&
        Objects.equals(this.maxPrints, offer.maxPrints) &&
        Objects.equals(this.viewLimit, offer.viewLimit) &&
        Objects.equals(this.featured, offer.featured) &&
        Objects.equals(this.replaced, offer.replaced) &&
        Objects.equals(this.showRemaining, offer.showRemaining) &&
        Objects.equals(this.showRedeemed, offer.showRedeemed) &&
        Objects.equals(this.parentOffer, offer.parentOffer) &&
        Objects.equals(this.artwork, offer.artwork) &&
        Objects.equals(this.offerImage1, offer.offerImage1) &&
        Objects.equals(this.offerImage2, offer.offerImage2) &&
        Objects.equals(this.offerImage3, offer.offerImage3) &&
        Objects.equals(this.offerImage4, offer.offerImage4) &&
        Objects.equals(this.offerImage5, offer.offerImage5) &&
        Objects.equals(this.barCode, offer.barCode) &&
        Objects.equals(this.barCodeType, offer.barCodeType) &&
        Objects.equals(this.barCodeEntry, offer.barCodeEntry) &&
        Objects.equals(this.categories, offer.categories) &&
        Objects.equals(this.filters, offer.filters) &&
        Objects.equals(this.ticketType, offer.ticketType) &&
        Objects.equals(this.allocateTickets, offer.allocateTickets) &&
        Objects.equals(this.ticketPriceType, offer.ticketPriceType) &&
        Objects.equals(this.ticketPrice, offer.ticketPrice) &&
        Objects.equals(this.fullPrice, offer.fullPrice) &&
        Objects.equals(this.discountPrice, offer.discountPrice) &&
        Objects.equals(this.availableLimit, offer.availableLimit) &&
        Objects.equals(this.availableLimitPerUser, offer.availableLimitPerUser) &&
        Objects.equals(this.addedLimit, offer.addedLimit) &&
        Objects.equals(this.usedCount, offer.usedCount) &&
        Objects.equals(this.addedCount, offer.addedCount) &&
        Objects.equals(this.removedCount, offer.removedCount) &&
        Objects.equals(this.viewedCount, offer.viewedCount) &&
        Objects.equals(this.clickedCount, offer.clickedCount) &&
        Objects.equals(this.offerVisibility, offer.offerVisibility) &&
        Objects.equals(this.offerProcessorId, offer.offerProcessorId) &&
        Objects.equals(this.externalId, offer.externalId) &&
        Objects.equals(this.externalUrl, offer.externalUrl) &&
        Objects.equals(this.externalUntrackedUrl, offer.externalUntrackedUrl) &&
        Objects.equals(this.sqootId, offer.sqootId) &&
        Objects.equals(this.sqootUrl, offer.sqootUrl) &&
        Objects.equals(this.sqootCategorySlug, offer.sqootCategorySlug) &&
        Objects.equals(this.sqootCategoryName, offer.sqootCategoryName) &&
        Objects.equals(this.yipitId, offer.yipitId) &&
        Objects.equals(this.redeemAuthOptions, offer.redeemAuthOptions) &&
        Objects.equals(this.publisher, offer.publisher) &&
        Objects.equals(this.product, offer.product) &&
        Objects.equals(this.media, offer.media) &&
        Objects.equals(this.event, offer.event) &&
        Objects.equals(this.device, offer.device) &&
        Objects.equals(this.notes, offer.notes) &&
        Objects.equals(this.noteCount, offer.noteCount) &&
        Objects.equals(this.favoriteCount, offer.favoriteCount) &&
        Objects.equals(this.hasRatings, offer.hasRatings) &&
        Objects.equals(this.likes, offer.likes) &&
        Objects.equals(this.likeCount, offer.likeCount) &&
        Objects.equals(this.dislikeCount, offer.dislikeCount) &&
        Objects.equals(this.availabilitySummary, offer.availabilitySummary) &&
        Objects.equals(this.flags, offer.flags) &&
        Objects.equals(this.flagCount, offer.flagCount) &&
        Objects.equals(this.flagThreshold, offer.flagThreshold) &&
        Objects.equals(this.savings, offer.savings) &&
        Objects.equals(this.clickStream, offer.clickStream) &&
        Objects.equals(this.ticketCount, offer.ticketCount) &&
        Objects.equals(this.display, offer.display) &&
        Objects.equals(this.appKey, offer.appKey) &&
        Objects.equals(this.categoryTree, offer.categoryTree) &&
        Objects.equals(this.filterTree, offer.filterTree) &&
        Objects.equals(this.indexable, offer.indexable) &&
        Objects.equals(this.billableId, offer.billableId) &&
        Objects.equals(this.subType, offer.subType) &&
        Objects.equals(this.contentName, offer.contentName) &&
        Objects.equals(this.defaultThreshold, offer.defaultThreshold) &&
        Objects.equals(this.contentAsset, offer.contentAsset) &&
        Objects.equals(this.owner, offer.owner) &&
        Objects.equals(this.secondaryType, offer.secondaryType) &&
        Objects.equals(this.discountPercentage, offer.discountPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, testField, billableEntity, offerLocations, missions, activated, expires, redeemableStart, redeemableEnd, title, subTitle, type, specialOfferType, details, subDetails, finePrint, getThereNowNotification, maxPrints, viewLimit, featured, replaced, showRemaining, showRedeemed, parentOffer, artwork, offerImage1, offerImage2, offerImage3, offerImage4, offerImage5, barCode, barCodeType, barCodeEntry, categories, filters, ticketType, allocateTickets, ticketPriceType, ticketPrice, fullPrice, discountPrice, availableLimit, availableLimitPerUser, addedLimit, usedCount, addedCount, removedCount, viewedCount, clickedCount, offerVisibility, offerProcessorId, externalId, externalUrl, externalUntrackedUrl, sqootId, sqootUrl, sqootCategorySlug, sqootCategoryName, yipitId, redeemAuthOptions, publisher, product, media, event, device, notes, noteCount, favoriteCount, hasRatings, likes, likeCount, dislikeCount, availabilitySummary, flags, flagCount, flagThreshold, savings, clickStream, ticketCount, display, appKey, categoryTree, filterTree, indexable, billableId, subType, contentName, defaultThreshold, contentAsset, owner, secondaryType, discountPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    testField: ").append(toIndentedString(testField)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    offerLocations: ").append(toIndentedString(offerLocations)).append("\n");
    sb.append("    missions: ").append(toIndentedString(missions)).append("\n");
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    redeemableStart: ").append(toIndentedString(redeemableStart)).append("\n");
    sb.append("    redeemableEnd: ").append(toIndentedString(redeemableEnd)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    specialOfferType: ").append(toIndentedString(specialOfferType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    subDetails: ").append(toIndentedString(subDetails)).append("\n");
    sb.append("    finePrint: ").append(toIndentedString(finePrint)).append("\n");
    sb.append("    getThereNowNotification: ").append(toIndentedString(getThereNowNotification)).append("\n");
    sb.append("    maxPrints: ").append(toIndentedString(maxPrints)).append("\n");
    sb.append("    viewLimit: ").append(toIndentedString(viewLimit)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    replaced: ").append(toIndentedString(replaced)).append("\n");
    sb.append("    showRemaining: ").append(toIndentedString(showRemaining)).append("\n");
    sb.append("    showRedeemed: ").append(toIndentedString(showRedeemed)).append("\n");
    sb.append("    parentOffer: ").append(toIndentedString(parentOffer)).append("\n");
    sb.append("    artwork: ").append(toIndentedString(artwork)).append("\n");
    sb.append("    offerImage1: ").append(toIndentedString(offerImage1)).append("\n");
    sb.append("    offerImage2: ").append(toIndentedString(offerImage2)).append("\n");
    sb.append("    offerImage3: ").append(toIndentedString(offerImage3)).append("\n");
    sb.append("    offerImage4: ").append(toIndentedString(offerImage4)).append("\n");
    sb.append("    offerImage5: ").append(toIndentedString(offerImage5)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    barCodeType: ").append(toIndentedString(barCodeType)).append("\n");
    sb.append("    barCodeEntry: ").append(toIndentedString(barCodeEntry)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    ticketPriceType: ").append(toIndentedString(ticketPriceType)).append("\n");
    sb.append("    ticketPrice: ").append(toIndentedString(ticketPrice)).append("\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    availableLimit: ").append(toIndentedString(availableLimit)).append("\n");
    sb.append("    availableLimitPerUser: ").append(toIndentedString(availableLimitPerUser)).append("\n");
    sb.append("    addedLimit: ").append(toIndentedString(addedLimit)).append("\n");
    sb.append("    usedCount: ").append(toIndentedString(usedCount)).append("\n");
    sb.append("    addedCount: ").append(toIndentedString(addedCount)).append("\n");
    sb.append("    removedCount: ").append(toIndentedString(removedCount)).append("\n");
    sb.append("    viewedCount: ").append(toIndentedString(viewedCount)).append("\n");
    sb.append("    clickedCount: ").append(toIndentedString(clickedCount)).append("\n");
    sb.append("    offerVisibility: ").append(toIndentedString(offerVisibility)).append("\n");
    sb.append("    offerProcessorId: ").append(toIndentedString(offerProcessorId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalUntrackedUrl: ").append(toIndentedString(externalUntrackedUrl)).append("\n");
    sb.append("    sqootId: ").append(toIndentedString(sqootId)).append("\n");
    sb.append("    sqootUrl: ").append(toIndentedString(sqootUrl)).append("\n");
    sb.append("    sqootCategorySlug: ").append(toIndentedString(sqootCategorySlug)).append("\n");
    sb.append("    sqootCategoryName: ").append(toIndentedString(sqootCategoryName)).append("\n");
    sb.append("    yipitId: ").append(toIndentedString(yipitId)).append("\n");
    sb.append("    redeemAuthOptions: ").append(toIndentedString(redeemAuthOptions)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    hasRatings: ").append(toIndentedString(hasRatings)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    availabilitySummary: ").append(toIndentedString(availabilitySummary)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    savings: ").append(toIndentedString(savings)).append("\n");
    sb.append("    clickStream: ").append(toIndentedString(clickStream)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    categoryTree: ").append(toIndentedString(categoryTree)).append("\n");
    sb.append("    filterTree: ").append(toIndentedString(filterTree)).append("\n");
    sb.append("    indexable: ").append(toIndentedString(indexable)).append("\n");
    sb.append("    billableId: ").append(toIndentedString(billableId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    defaultThreshold: ").append(toIndentedString(defaultThreshold)).append("\n");
    sb.append("    contentAsset: ").append(toIndentedString(contentAsset)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    secondaryType: ").append(toIndentedString(secondaryType)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
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

