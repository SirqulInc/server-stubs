package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Offer  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String testField;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntity billableEntity;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid OfferLocation> offerLocations = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Mission> missions = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Date activated;

  @ApiModelProperty(value = "")

  private Date expires;

  @ApiModelProperty(value = "")

  private Date redeemableStart;

  @ApiModelProperty(value = "")

  private Date redeemableEnd;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String subTitle;

public enum TypeEnum {

VOUCHER(String.valueOf("VOUCHER")), COUPON(String.valueOf("COUPON")), PRODUCT(String.valueOf("PRODUCT")), MEDIA(String.valueOf("MEDIA")), EVENT(String.valueOf("EVENT")), DEVICE(String.valueOf("DEVICE"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TypeEnum type;

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

  private String details;

  @ApiModelProperty(value = "")

  private String subDetails;

  @ApiModelProperty(value = "")

  private String finePrint;

  @ApiModelProperty(value = "")

  private String getThereNowNotification;

  @ApiModelProperty(value = "")

  private Integer maxPrints;

  @ApiModelProperty(value = "")

  private Integer viewLimit;

  @ApiModelProperty(value = "")

  private Boolean featured;

  @ApiModelProperty(value = "")

  private Boolean replaced;

  @ApiModelProperty(value = "")

  private Boolean showRemaining;

  @ApiModelProperty(value = "")

  private Boolean showRedeemed;

  @ApiModelProperty(value = "")

  @Valid

  private Offer parentOffer;

  @ApiModelProperty(value = "")

  @Valid

  private Asset artwork;

  @ApiModelProperty(value = "")

  @Valid

  private Asset offerImage1;

  @ApiModelProperty(value = "")

  @Valid

  private Asset offerImage2;

  @ApiModelProperty(value = "")

  @Valid

  private Asset offerImage3;

  @ApiModelProperty(value = "")

  @Valid

  private Asset offerImage4;

  @ApiModelProperty(value = "")

  @Valid

  private Asset offerImage5;

  @ApiModelProperty(value = "")

  @Valid

  private Asset barCode;

public enum BarCodeTypeEnum {

NONE(String.valueOf("NONE")), UPC(String.valueOf("UPC")), CODE_128(String.valueOf("CODE_128")), QR(String.valueOf("QR")), CUSTOM_MEDIA(String.valueOf("CUSTOM_MEDIA"));


    private String value;

    BarCodeTypeEnum (String v) {
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
    public static BarCodeTypeEnum fromValue(String value) {
        for (BarCodeTypeEnum b : BarCodeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private BarCodeTypeEnum barCodeType;

  @ApiModelProperty(value = "")

  private String barCodeEntry;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Category> categories = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Filter> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String ticketPriceType;

  @ApiModelProperty(value = "")

  private Long ticketPrice;

  @ApiModelProperty(value = "")

  private Double fullPrice;

  @ApiModelProperty(value = "")

  private Double discountPrice;

  @ApiModelProperty(value = "")

  private Integer availableLimit;

  @ApiModelProperty(value = "")

  private Integer availableLimitPerUser;

  @ApiModelProperty(value = "")

  private Integer addedLimit;

  @ApiModelProperty(value = "")

  private Integer usedCount;

  @ApiModelProperty(value = "")

  private Integer addedCount;

  @ApiModelProperty(value = "")

  private Integer removedCount;

  @ApiModelProperty(value = "")

  private Integer viewedCount;

  @ApiModelProperty(value = "")

  private Integer clickedCount;

public enum OfferVisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), LISTABLE(String.valueOf("LISTABLE")), REWARDABLE(String.valueOf("REWARDABLE")), TRIGGERABLE(String.valueOf("TRIGGERABLE")), PRIVATE(String.valueOf("PRIVATE"));


    private String value;

    OfferVisibilityEnum (String v) {
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
    public static OfferVisibilityEnum fromValue(String value) {
        for (OfferVisibilityEnum b : OfferVisibilityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private OfferVisibilityEnum offerVisibility;

public enum OfferProcessorIdEnum {

SQOOT(String.valueOf("SQOOT")), YIPIT(String.valueOf("YIPIT")), API(String.valueOf("API")), CSV(String.valueOf("CSV"));


    private String value;

    OfferProcessorIdEnum (String v) {
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
    public static OfferProcessorIdEnum fromValue(String value) {
        for (OfferProcessorIdEnum b : OfferProcessorIdEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private OfferProcessorIdEnum offerProcessorId;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String externalUrl;

  @ApiModelProperty(value = "")

  private String externalUntrackedUrl;

  @ApiModelProperty(value = "")

  private Long sqootId;

  @ApiModelProperty(value = "")

  private String sqootUrl;

  @ApiModelProperty(value = "")

  private String sqootCategorySlug;

  @ApiModelProperty(value = "")

  private String sqootCategoryName;

  @ApiModelProperty(value = "")

  private Long yipitId;

  @ApiModelProperty(value = "")

  private String redeemAuthOptions;

  @ApiModelProperty(value = "")

  private String publisher;

  @ApiModelProperty(value = "")

  @Valid

  private Product product;

  @ApiModelProperty(value = "")

  @Valid

  private Media media;

  @ApiModelProperty(value = "")

  @Valid

  private Event event;

  @ApiModelProperty(value = "")

  @Valid

  private Device device;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private Long favoriteCount;

  @ApiModelProperty(value = "")

  private Boolean hasRatings;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private String availabilitySummary;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Flag> flags = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long flagCount;

  @ApiModelProperty(value = "")

  @Valid

  private FlagThreshold flagThreshold;

  @ApiModelProperty(value = "")

  private Double savings;

  @ApiModelProperty(value = "")

  private Double clickStream;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private String categoryTree;

  @ApiModelProperty(value = "")

  private String filterTree;

  @ApiModelProperty(value = "")

  private Boolean indexable;

  @ApiModelProperty(value = "")

  private Long billableId;

  @ApiModelProperty(value = "")

  private String subType;

  @ApiModelProperty(value = "")

  private String contentName;

  @ApiModelProperty(value = "")

  private Long defaultThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private Asset contentAsset;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String secondaryType;

  @ApiModelProperty(value = "")

  private Double discountPercentage;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Offer id(Long id) {
    this.id = id;
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

  public Offer active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public Offer valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get testField
   * @return testField
  **/
  @JsonProperty("testField")
  public String getTestField() {
    return testField;
  }

  public void setTestField(String testField) {
    this.testField = testField;
  }

  public Offer testField(String testField) {
    this.testField = testField;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public Offer billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

 /**
   * Get offerLocations
   * @return offerLocations
  **/
  @JsonProperty("offerLocations")
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }

  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  public Offer offerLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
    return this;
  }

  public Offer addOfferLocationsItem(OfferLocation offerLocationsItem) {
    this.offerLocations.add(offerLocationsItem);
    return this;
  }

 /**
   * Get missions
   * @return missions
  **/
  @JsonProperty("missions")
  public List<@Valid Mission> getMissions() {
    return missions;
  }

  public void setMissions(List<@Valid Mission> missions) {
    this.missions = missions;
  }

  public Offer missions(List<@Valid Mission> missions) {
    this.missions = missions;
    return this;
  }

  public Offer addMissionsItem(Mission missionsItem) {
    this.missions.add(missionsItem);
    return this;
  }

 /**
   * Get activated
   * @return activated
  **/
  @JsonProperty("activated")
  public Date getActivated() {
    return activated;
  }

  public void setActivated(Date activated) {
    this.activated = activated;
  }

  public Offer activated(Date activated) {
    this.activated = activated;
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

  public Offer expires(Date expires) {
    this.expires = expires;
    return this;
  }

 /**
   * Get redeemableStart
   * @return redeemableStart
  **/
  @JsonProperty("redeemableStart")
  public Date getRedeemableStart() {
    return redeemableStart;
  }

  public void setRedeemableStart(Date redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  public Offer redeemableStart(Date redeemableStart) {
    this.redeemableStart = redeemableStart;
    return this;
  }

 /**
   * Get redeemableEnd
   * @return redeemableEnd
  **/
  @JsonProperty("redeemableEnd")
  public Date getRedeemableEnd() {
    return redeemableEnd;
  }

  public void setRedeemableEnd(Date redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  public Offer redeemableEnd(Date redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
    return this;
  }

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

  public Offer title(String title) {
    this.title = title;
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

  public Offer subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Offer type(TypeEnum type) {
    this.type = type;
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

  public Offer specialOfferType(SpecialOfferTypeEnum specialOfferType) {
    this.specialOfferType = specialOfferType;
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

  public Offer details(String details) {
    this.details = details;
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

  public Offer subDetails(String subDetails) {
    this.subDetails = subDetails;
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

  public Offer finePrint(String finePrint) {
    this.finePrint = finePrint;
    return this;
  }

 /**
   * Get getThereNowNotification
   * @return getThereNowNotification
  **/
  @JsonProperty("getThereNowNotification")
  public String getGetThereNowNotification() {
    return getThereNowNotification;
  }

  public void setGetThereNowNotification(String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
  }

  public Offer getThereNowNotification(String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
    return this;
  }

 /**
   * Get maxPrints
   * @return maxPrints
  **/
  @JsonProperty("maxPrints")
  public Integer getMaxPrints() {
    return maxPrints;
  }

  public void setMaxPrints(Integer maxPrints) {
    this.maxPrints = maxPrints;
  }

  public Offer maxPrints(Integer maxPrints) {
    this.maxPrints = maxPrints;
    return this;
  }

 /**
   * Get viewLimit
   * @return viewLimit
  **/
  @JsonProperty("viewLimit")
  public Integer getViewLimit() {
    return viewLimit;
  }

  public void setViewLimit(Integer viewLimit) {
    this.viewLimit = viewLimit;
  }

  public Offer viewLimit(Integer viewLimit) {
    this.viewLimit = viewLimit;
    return this;
  }

 /**
   * Get featured
   * @return featured
  **/
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Offer featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

 /**
   * Get replaced
   * @return replaced
  **/
  @JsonProperty("replaced")
  public Boolean getReplaced() {
    return replaced;
  }

  public void setReplaced(Boolean replaced) {
    this.replaced = replaced;
  }

  public Offer replaced(Boolean replaced) {
    this.replaced = replaced;
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

  public Offer showRemaining(Boolean showRemaining) {
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

  public Offer showRedeemed(Boolean showRedeemed) {
    this.showRedeemed = showRedeemed;
    return this;
  }

 /**
   * Get parentOffer
   * @return parentOffer
  **/
  @JsonProperty("parentOffer")
  public Offer getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(Offer parentOffer) {
    this.parentOffer = parentOffer;
  }

  public Offer parentOffer(Offer parentOffer) {
    this.parentOffer = parentOffer;
    return this;
  }

 /**
   * Get artwork
   * @return artwork
  **/
  @JsonProperty("artwork")
  public Asset getArtwork() {
    return artwork;
  }

  public void setArtwork(Asset artwork) {
    this.artwork = artwork;
  }

  public Offer artwork(Asset artwork) {
    this.artwork = artwork;
    return this;
  }

 /**
   * Get offerImage1
   * @return offerImage1
  **/
  @JsonProperty("offerImage1")
  public Asset getOfferImage1() {
    return offerImage1;
  }

  public void setOfferImage1(Asset offerImage1) {
    this.offerImage1 = offerImage1;
  }

  public Offer offerImage1(Asset offerImage1) {
    this.offerImage1 = offerImage1;
    return this;
  }

 /**
   * Get offerImage2
   * @return offerImage2
  **/
  @JsonProperty("offerImage2")
  public Asset getOfferImage2() {
    return offerImage2;
  }

  public void setOfferImage2(Asset offerImage2) {
    this.offerImage2 = offerImage2;
  }

  public Offer offerImage2(Asset offerImage2) {
    this.offerImage2 = offerImage2;
    return this;
  }

 /**
   * Get offerImage3
   * @return offerImage3
  **/
  @JsonProperty("offerImage3")
  public Asset getOfferImage3() {
    return offerImage3;
  }

  public void setOfferImage3(Asset offerImage3) {
    this.offerImage3 = offerImage3;
  }

  public Offer offerImage3(Asset offerImage3) {
    this.offerImage3 = offerImage3;
    return this;
  }

 /**
   * Get offerImage4
   * @return offerImage4
  **/
  @JsonProperty("offerImage4")
  public Asset getOfferImage4() {
    return offerImage4;
  }

  public void setOfferImage4(Asset offerImage4) {
    this.offerImage4 = offerImage4;
  }

  public Offer offerImage4(Asset offerImage4) {
    this.offerImage4 = offerImage4;
    return this;
  }

 /**
   * Get offerImage5
   * @return offerImage5
  **/
  @JsonProperty("offerImage5")
  public Asset getOfferImage5() {
    return offerImage5;
  }

  public void setOfferImage5(Asset offerImage5) {
    this.offerImage5 = offerImage5;
  }

  public Offer offerImage5(Asset offerImage5) {
    this.offerImage5 = offerImage5;
    return this;
  }

 /**
   * Get barCode
   * @return barCode
  **/
  @JsonProperty("barCode")
  public Asset getBarCode() {
    return barCode;
  }

  public void setBarCode(Asset barCode) {
    this.barCode = barCode;
  }

  public Offer barCode(Asset barCode) {
    this.barCode = barCode;
    return this;
  }

 /**
   * Get barCodeType
   * @return barCodeType
  **/
  @JsonProperty("barCodeType")
  public String getBarCodeType() {
    if (barCodeType == null) {
      return null;
    }
    return barCodeType.value();
  }

  public void setBarCodeType(BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
  }

  public Offer barCodeType(BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
    return this;
  }

 /**
   * Get barCodeEntry
   * @return barCodeEntry
  **/
  @JsonProperty("barCodeEntry")
  public String getBarCodeEntry() {
    return barCodeEntry;
  }

  public void setBarCodeEntry(String barCodeEntry) {
    this.barCodeEntry = barCodeEntry;
  }

  public Offer barCodeEntry(String barCodeEntry) {
    this.barCodeEntry = barCodeEntry;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<@Valid Category> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  public Offer categories(List<@Valid Category> categories) {
    this.categories = categories;
    return this;
  }

  public Offer addCategoriesItem(Category categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public Offer filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Offer addFiltersItem(Filter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get ticketType
   * @return ticketType
  **/
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public Offer ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

 /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Offer allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
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

  public Offer ticketPriceType(String ticketPriceType) {
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

  public Offer ticketPrice(Long ticketPrice) {
    this.ticketPrice = ticketPrice;
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

  public Offer fullPrice(Double fullPrice) {
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

  public Offer discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

 /**
   * Get availableLimit
   * @return availableLimit
  **/
  @JsonProperty("availableLimit")
  public Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public Offer availableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

 /**
   * Get availableLimitPerUser
   * @return availableLimitPerUser
  **/
  @JsonProperty("availableLimitPerUser")
  public Integer getAvailableLimitPerUser() {
    return availableLimitPerUser;
  }

  public void setAvailableLimitPerUser(Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
  }

  public Offer availableLimitPerUser(Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
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

  public Offer addedLimit(Integer addedLimit) {
    this.addedLimit = addedLimit;
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

  public Offer usedCount(Integer usedCount) {
    this.usedCount = usedCount;
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

  public Offer addedCount(Integer addedCount) {
    this.addedCount = addedCount;
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

  public Offer removedCount(Integer removedCount) {
    this.removedCount = removedCount;
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

  public Offer viewedCount(Integer viewedCount) {
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

  public Offer clickedCount(Integer clickedCount) {
    this.clickedCount = clickedCount;
    return this;
  }

 /**
   * Get offerVisibility
   * @return offerVisibility
  **/
  @JsonProperty("offerVisibility")
  public String getOfferVisibility() {
    if (offerVisibility == null) {
      return null;
    }
    return offerVisibility.value();
  }

  public void setOfferVisibility(OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  public Offer offerVisibility(OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
    return this;
  }

 /**
   * Get offerProcessorId
   * @return offerProcessorId
  **/
  @JsonProperty("offerProcessorId")
  public String getOfferProcessorId() {
    if (offerProcessorId == null) {
      return null;
    }
    return offerProcessorId.value();
  }

  public void setOfferProcessorId(OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
  }

  public Offer offerProcessorId(OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
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

  public Offer externalId(String externalId) {
    this.externalId = externalId;
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

  public Offer externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

 /**
   * Get externalUntrackedUrl
   * @return externalUntrackedUrl
  **/
  @JsonProperty("externalUntrackedUrl")
  public String getExternalUntrackedUrl() {
    return externalUntrackedUrl;
  }

  public void setExternalUntrackedUrl(String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
  }

  public Offer externalUntrackedUrl(String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
    return this;
  }

 /**
   * Get sqootId
   * @return sqootId
  **/
  @JsonProperty("sqootId")
  public Long getSqootId() {
    return sqootId;
  }

  public void setSqootId(Long sqootId) {
    this.sqootId = sqootId;
  }

  public Offer sqootId(Long sqootId) {
    this.sqootId = sqootId;
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

  public Offer sqootUrl(String sqootUrl) {
    this.sqootUrl = sqootUrl;
    return this;
  }

 /**
   * Get sqootCategorySlug
   * @return sqootCategorySlug
  **/
  @JsonProperty("sqootCategorySlug")
  public String getSqootCategorySlug() {
    return sqootCategorySlug;
  }

  public void setSqootCategorySlug(String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
  }

  public Offer sqootCategorySlug(String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
    return this;
  }

 /**
   * Get sqootCategoryName
   * @return sqootCategoryName
  **/
  @JsonProperty("sqootCategoryName")
  public String getSqootCategoryName() {
    return sqootCategoryName;
  }

  public void setSqootCategoryName(String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
  }

  public Offer sqootCategoryName(String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
    return this;
  }

 /**
   * Get yipitId
   * @return yipitId
  **/
  @JsonProperty("yipitId")
  public Long getYipitId() {
    return yipitId;
  }

  public void setYipitId(Long yipitId) {
    this.yipitId = yipitId;
  }

  public Offer yipitId(Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

 /**
   * Get redeemAuthOptions
   * @return redeemAuthOptions
  **/
  @JsonProperty("redeemAuthOptions")
  public String getRedeemAuthOptions() {
    return redeemAuthOptions;
  }

  public void setRedeemAuthOptions(String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
  }

  public Offer redeemAuthOptions(String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
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

  public Offer publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Offer product(Product product) {
    this.product = product;
    return this;
  }

 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }

  public Offer media(Media media) {
    this.media = media;
    return this;
  }

 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public Offer event(Event event) {
    this.event = event;
    return this;
  }

 /**
   * Get device
   * @return device
  **/
  @JsonProperty("device")
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public Offer device(Device device) {
    this.device = device;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Offer notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Offer addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
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

  public Offer noteCount(Long noteCount) {
    this.noteCount = noteCount;
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

  public Offer favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get hasRatings
   * @return hasRatings
  **/
  @JsonProperty("hasRatings")
  public Boolean getHasRatings() {
    return hasRatings;
  }

  public void setHasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  public Offer hasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
    return this;
  }

 /**
   * Get likes
   * @return likes
  **/
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Offer likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Offer addLikesItem(YayOrNay likesItem) {
    this.likes.add(likesItem);
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

  public Offer likeCount(Long likeCount) {
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

  public Offer dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
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

  public Offer availabilitySummary(String availabilitySummary) {
    this.availabilitySummary = availabilitySummary;
    return this;
  }

 /**
   * Get flags
   * @return flags
  **/
  @JsonProperty("flags")
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Offer flags(List<@Valid Flag> flags) {
    this.flags = flags;
    return this;
  }

  public Offer addFlagsItem(Flag flagsItem) {
    this.flags.add(flagsItem);
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

  public Offer flagCount(Long flagCount) {
    this.flagCount = flagCount;
    return this;
  }

 /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  @JsonProperty("flagThreshold")
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public Offer flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

 /**
   * Get savings
   * @return savings
  **/
  @JsonProperty("savings")
  public Double getSavings() {
    return savings;
  }

  public void setSavings(Double savings) {
    this.savings = savings;
  }

  public Offer savings(Double savings) {
    this.savings = savings;
    return this;
  }

 /**
   * Get clickStream
   * @return clickStream
  **/
  @JsonProperty("clickStream")
  public Double getClickStream() {
    return clickStream;
  }

  public void setClickStream(Double clickStream) {
    this.clickStream = clickStream;
  }

  public Offer clickStream(Double clickStream) {
    this.clickStream = clickStream;
    return this;
  }

 /**
   * Get ticketCount
   * @return ticketCount
  **/
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Offer ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Offer display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public Offer appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

 /**
   * Get categoryTree
   * @return categoryTree
  **/
  @JsonProperty("categoryTree")
  public String getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
  }

  public Offer categoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

 /**
   * Get filterTree
   * @return filterTree
  **/
  @JsonProperty("filterTree")
  public String getFilterTree() {
    return filterTree;
  }

  public void setFilterTree(String filterTree) {
    this.filterTree = filterTree;
  }

  public Offer filterTree(String filterTree) {
    this.filterTree = filterTree;
    return this;
  }

 /**
   * Get indexable
   * @return indexable
  **/
  @JsonProperty("indexable")
  public Boolean getIndexable() {
    return indexable;
  }

  public void setIndexable(Boolean indexable) {
    this.indexable = indexable;
  }

  public Offer indexable(Boolean indexable) {
    this.indexable = indexable;
    return this;
  }

 /**
   * Get billableId
   * @return billableId
  **/
  @JsonProperty("billableId")
  public Long getBillableId() {
    return billableId;
  }

  public void setBillableId(Long billableId) {
    this.billableId = billableId;
  }

  public Offer billableId(Long billableId) {
    this.billableId = billableId;
    return this;
  }

 /**
   * Get subType
   * @return subType
  **/
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public Offer subType(String subType) {
    this.subType = subType;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Offer contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

 /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Offer defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

 /**
   * Get contentAsset
   * @return contentAsset
  **/
  @JsonProperty("contentAsset")
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Offer contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Offer owner(Account owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get secondaryType
   * @return secondaryType
  **/
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public Offer secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
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

  public Offer discountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

