package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.BillableEntity;
import apimodels.Category;
import apimodels.Device;
import apimodels.Event;
import apimodels.Filter;
import apimodels.Flag;
import apimodels.FlagThreshold;
import apimodels.Media;
import apimodels.Mission;
import apimodels.Note;
import apimodels.OfferLocation;
import apimodels.Product;
import apimodels.YayOrNay;
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
 * Offer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Offer   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("testField")
  
  private String testField;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntity billableEntity;

  @JsonProperty("offerLocations")
  @Valid

  private List<@Valid OfferLocation> offerLocations = null;

  @JsonProperty("missions")
  @Valid

  private List<@Valid Mission> missions = null;

  @JsonProperty("activated")
  @Valid

  private OffsetDateTime activated;

  @JsonProperty("expires")
  @Valid

  private OffsetDateTime expires;

  @JsonProperty("redeemableStart")
  @Valid

  private OffsetDateTime redeemableStart;

  @JsonProperty("redeemableEnd")
  @Valid

  private OffsetDateTime redeemableEnd;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("subTitle")
  
  private String subTitle;

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

  @JsonProperty("type")
  
  private TypeEnum type;

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

  @JsonProperty("details")
  
  private String details;

  @JsonProperty("subDetails")
  
  private String subDetails;

  @JsonProperty("finePrint")
  
  private String finePrint;

  @JsonProperty("getThereNowNotification")
  
  private String getThereNowNotification;

  @JsonProperty("maxPrints")
  
  private Integer maxPrints;

  @JsonProperty("viewLimit")
  
  private Integer viewLimit;

  @JsonProperty("featured")
  
  private Boolean featured;

  @JsonProperty("replaced")
  
  private Boolean replaced;

  @JsonProperty("showRemaining")
  
  private Boolean showRemaining;

  @JsonProperty("showRedeemed")
  
  private Boolean showRedeemed;

  @JsonProperty("parentOffer")
  @Valid

  private Offer parentOffer;

  @JsonProperty("artwork")
  @Valid

  private Asset artwork;

  @JsonProperty("offerImage1")
  @Valid

  private Asset offerImage1;

  @JsonProperty("offerImage2")
  @Valid

  private Asset offerImage2;

  @JsonProperty("offerImage3")
  @Valid

  private Asset offerImage3;

  @JsonProperty("offerImage4")
  @Valid

  private Asset offerImage4;

  @JsonProperty("offerImage5")
  @Valid

  private Asset offerImage5;

  @JsonProperty("barCode")
  @Valid

  private Asset barCode;

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

  @JsonProperty("barCodeType")
  
  private BarCodeTypeEnum barCodeType;

  @JsonProperty("barCodeEntry")
  
  private String barCodeEntry;

  @JsonProperty("categories")
  @Valid

  private List<@Valid Category> categories = null;

  @JsonProperty("filters")
  @Valid

  private List<@Valid Filter> filters = null;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("ticketPriceType")
  
  private String ticketPriceType;

  @JsonProperty("ticketPrice")
  
  private Long ticketPrice;

  @JsonProperty("fullPrice")
  
  private Double fullPrice;

  @JsonProperty("discountPrice")
  
  private Double discountPrice;

  @JsonProperty("availableLimit")
  
  private Integer availableLimit;

  @JsonProperty("availableLimitPerUser")
  
  private Integer availableLimitPerUser;

  @JsonProperty("addedLimit")
  
  private Integer addedLimit;

  @JsonProperty("usedCount")
  
  private Integer usedCount;

  @JsonProperty("addedCount")
  
  private Integer addedCount;

  @JsonProperty("removedCount")
  
  private Integer removedCount;

  @JsonProperty("viewedCount")
  
  private Integer viewedCount;

  @JsonProperty("clickedCount")
  
  private Integer clickedCount;

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

  @JsonProperty("offerVisibility")
  
  private OfferVisibilityEnum offerVisibility;

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

  @JsonProperty("offerProcessorId")
  
  private OfferProcessorIdEnum offerProcessorId;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("externalUrl")
  
  private String externalUrl;

  @JsonProperty("externalUntrackedUrl")
  
  private String externalUntrackedUrl;

  @JsonProperty("sqootId")
  
  private Long sqootId;

  @JsonProperty("sqootUrl")
  
  private String sqootUrl;

  @JsonProperty("sqootCategorySlug")
  
  private String sqootCategorySlug;

  @JsonProperty("sqootCategoryName")
  
  private String sqootCategoryName;

  @JsonProperty("yipitId")
  
  private Long yipitId;

  @JsonProperty("redeemAuthOptions")
  
  private String redeemAuthOptions;

  @JsonProperty("publisher")
  
  private String publisher;

  @JsonProperty("product")
  @Valid

  private Product product;

  @JsonProperty("media")
  @Valid

  private Media media;

  @JsonProperty("event")
  @Valid

  private Event event;

  @JsonProperty("device")
  @Valid

  private Device device;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("favoriteCount")
  
  private Long favoriteCount;

  @JsonProperty("hasRatings")
  
  private Boolean hasRatings;

  @JsonProperty("likes")
  @Valid

  private List<@Valid YayOrNay> likes = null;

  @JsonProperty("likeCount")
  
  private Long likeCount;

  @JsonProperty("dislikeCount")
  
  private Long dislikeCount;

  @JsonProperty("availabilitySummary")
  
  private String availabilitySummary;

  @JsonProperty("flags")
  @Valid

  private List<@Valid Flag> flags = null;

  @JsonProperty("flagCount")
  
  private Long flagCount;

  @JsonProperty("flagThreshold")
  @Valid

  private FlagThreshold flagThreshold;

  @JsonProperty("savings")
  
  private Double savings;

  @JsonProperty("clickStream")
  
  private Double clickStream;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("categoryTree")
  
  private String categoryTree;

  @JsonProperty("filterTree")
  
  private String filterTree;

  @JsonProperty("indexable")
  
  private Boolean indexable;

  @JsonProperty("billableId")
  
  private Long billableId;

  @JsonProperty("subType")
  
  private String subType;

  @JsonProperty("contentName")
  
  private String contentName;

  @JsonProperty("defaultThreshold")
  
  private Long defaultThreshold;

  @JsonProperty("contentAsset")
  @Valid

  private Asset contentAsset;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("secondaryType")
  
  private String secondaryType;

  @JsonProperty("discountPercentage")
  
  private Double discountPercentage;

  public Offer id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Offer active(Boolean active) {
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

  public Offer valid(Boolean valid) {
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

  public Offer testField(String testField) {
    this.testField = testField;
    return this;
  }

   /**
   * Get testField
   * @return testField
  **/
  public String getTestField() {
    return testField;
  }

  public void setTestField(String testField) {
    this.testField = testField;
  }

  public Offer billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
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
  **/
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
  **/
  public List<@Valid Mission> getMissions() {
    return missions;
  }

  public void setMissions(List<@Valid Mission> missions) {
    this.missions = missions;
  }

  public Offer activated(OffsetDateTime activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  public OffsetDateTime getActivated() {
    return activated;
  }

  public void setActivated(OffsetDateTime activated) {
    this.activated = activated;
  }

  public Offer expires(OffsetDateTime expires) {
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

  public Offer redeemableStart(OffsetDateTime redeemableStart) {
    this.redeemableStart = redeemableStart;
    return this;
  }

   /**
   * Get redeemableStart
   * @return redeemableStart
  **/
  public OffsetDateTime getRedeemableStart() {
    return redeemableStart;
  }

  public void setRedeemableStart(OffsetDateTime redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  public Offer redeemableEnd(OffsetDateTime redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
    return this;
  }

   /**
   * Get redeemableEnd
   * @return redeemableEnd
  **/
  public OffsetDateTime getRedeemableEnd() {
    return redeemableEnd;
  }

  public void setRedeemableEnd(OffsetDateTime redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

  public Offer title(String title) {
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

  public Offer subTitle(String subTitle) {
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

  public Offer type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Offer specialOfferType(SpecialOfferTypeEnum specialOfferType) {
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

  public Offer details(String details) {
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

  public Offer subDetails(String subDetails) {
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

  public Offer finePrint(String finePrint) {
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

  public Offer getThereNowNotification(String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
    return this;
  }

   /**
   * Get getThereNowNotification
   * @return getThereNowNotification
  **/
  public String getGetThereNowNotification() {
    return getThereNowNotification;
  }

  public void setGetThereNowNotification(String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
  }

  public Offer maxPrints(Integer maxPrints) {
    this.maxPrints = maxPrints;
    return this;
  }

   /**
   * Get maxPrints
   * @return maxPrints
  **/
  public Integer getMaxPrints() {
    return maxPrints;
  }

  public void setMaxPrints(Integer maxPrints) {
    this.maxPrints = maxPrints;
  }

  public Offer viewLimit(Integer viewLimit) {
    this.viewLimit = viewLimit;
    return this;
  }

   /**
   * Get viewLimit
   * @return viewLimit
  **/
  public Integer getViewLimit() {
    return viewLimit;
  }

  public void setViewLimit(Integer viewLimit) {
    this.viewLimit = viewLimit;
  }

  public Offer featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Offer replaced(Boolean replaced) {
    this.replaced = replaced;
    return this;
  }

   /**
   * Get replaced
   * @return replaced
  **/
  public Boolean getReplaced() {
    return replaced;
  }

  public void setReplaced(Boolean replaced) {
    this.replaced = replaced;
  }

  public Offer showRemaining(Boolean showRemaining) {
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

  public Offer showRedeemed(Boolean showRedeemed) {
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

  public Offer parentOffer(Offer parentOffer) {
    this.parentOffer = parentOffer;
    return this;
  }

   /**
   * Get parentOffer
   * @return parentOffer
  **/
  public Offer getParentOffer() {
    return parentOffer;
  }

  public void setParentOffer(Offer parentOffer) {
    this.parentOffer = parentOffer;
  }

  public Offer artwork(Asset artwork) {
    this.artwork = artwork;
    return this;
  }

   /**
   * Get artwork
   * @return artwork
  **/
  public Asset getArtwork() {
    return artwork;
  }

  public void setArtwork(Asset artwork) {
    this.artwork = artwork;
  }

  public Offer offerImage1(Asset offerImage1) {
    this.offerImage1 = offerImage1;
    return this;
  }

   /**
   * Get offerImage1
   * @return offerImage1
  **/
  public Asset getOfferImage1() {
    return offerImage1;
  }

  public void setOfferImage1(Asset offerImage1) {
    this.offerImage1 = offerImage1;
  }

  public Offer offerImage2(Asset offerImage2) {
    this.offerImage2 = offerImage2;
    return this;
  }

   /**
   * Get offerImage2
   * @return offerImage2
  **/
  public Asset getOfferImage2() {
    return offerImage2;
  }

  public void setOfferImage2(Asset offerImage2) {
    this.offerImage2 = offerImage2;
  }

  public Offer offerImage3(Asset offerImage3) {
    this.offerImage3 = offerImage3;
    return this;
  }

   /**
   * Get offerImage3
   * @return offerImage3
  **/
  public Asset getOfferImage3() {
    return offerImage3;
  }

  public void setOfferImage3(Asset offerImage3) {
    this.offerImage3 = offerImage3;
  }

  public Offer offerImage4(Asset offerImage4) {
    this.offerImage4 = offerImage4;
    return this;
  }

   /**
   * Get offerImage4
   * @return offerImage4
  **/
  public Asset getOfferImage4() {
    return offerImage4;
  }

  public void setOfferImage4(Asset offerImage4) {
    this.offerImage4 = offerImage4;
  }

  public Offer offerImage5(Asset offerImage5) {
    this.offerImage5 = offerImage5;
    return this;
  }

   /**
   * Get offerImage5
   * @return offerImage5
  **/
  public Asset getOfferImage5() {
    return offerImage5;
  }

  public void setOfferImage5(Asset offerImage5) {
    this.offerImage5 = offerImage5;
  }

  public Offer barCode(Asset barCode) {
    this.barCode = barCode;
    return this;
  }

   /**
   * Get barCode
   * @return barCode
  **/
  public Asset getBarCode() {
    return barCode;
  }

  public void setBarCode(Asset barCode) {
    this.barCode = barCode;
  }

  public Offer barCodeType(BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
    return this;
  }

   /**
   * Get barCodeType
   * @return barCodeType
  **/
  public BarCodeTypeEnum getBarCodeType() {
    return barCodeType;
  }

  public void setBarCodeType(BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
  }

  public Offer barCodeEntry(String barCodeEntry) {
    this.barCodeEntry = barCodeEntry;
    return this;
  }

   /**
   * Get barCodeEntry
   * @return barCodeEntry
  **/
  public String getBarCodeEntry() {
    return barCodeEntry;
  }

  public void setBarCodeEntry(String barCodeEntry) {
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
  **/
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
  **/
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public Offer ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

   /**
   * Get ticketType
   * @return ticketType
  **/
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public Offer allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

   /**
   * Get allocateTickets
   * @return allocateTickets
  **/
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Offer ticketPriceType(String ticketPriceType) {
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

  public Offer ticketPrice(Long ticketPrice) {
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

  public Offer fullPrice(Double fullPrice) {
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

  public Offer discountPrice(Double discountPrice) {
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

  public Offer availableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
    return this;
  }

   /**
   * Get availableLimit
   * @return availableLimit
  **/
  public Integer getAvailableLimit() {
    return availableLimit;
  }

  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  public Offer availableLimitPerUser(Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
    return this;
  }

   /**
   * Get availableLimitPerUser
   * @return availableLimitPerUser
  **/
  public Integer getAvailableLimitPerUser() {
    return availableLimitPerUser;
  }

  public void setAvailableLimitPerUser(Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
  }

  public Offer addedLimit(Integer addedLimit) {
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

  public Offer usedCount(Integer usedCount) {
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

  public Offer addedCount(Integer addedCount) {
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

  public Offer removedCount(Integer removedCount) {
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

  public Offer viewedCount(Integer viewedCount) {
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

  public Offer clickedCount(Integer clickedCount) {
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

  public Offer offerVisibility(OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
    return this;
  }

   /**
   * Get offerVisibility
   * @return offerVisibility
  **/
  public OfferVisibilityEnum getOfferVisibility() {
    return offerVisibility;
  }

  public void setOfferVisibility(OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  public Offer offerProcessorId(OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
    return this;
  }

   /**
   * Get offerProcessorId
   * @return offerProcessorId
  **/
  public OfferProcessorIdEnum getOfferProcessorId() {
    return offerProcessorId;
  }

  public void setOfferProcessorId(OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
  }

  public Offer externalId(String externalId) {
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

  public Offer externalUrl(String externalUrl) {
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

  public Offer externalUntrackedUrl(String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
    return this;
  }

   /**
   * Get externalUntrackedUrl
   * @return externalUntrackedUrl
  **/
  public String getExternalUntrackedUrl() {
    return externalUntrackedUrl;
  }

  public void setExternalUntrackedUrl(String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
  }

  public Offer sqootId(Long sqootId) {
    this.sqootId = sqootId;
    return this;
  }

   /**
   * Get sqootId
   * @return sqootId
  **/
  public Long getSqootId() {
    return sqootId;
  }

  public void setSqootId(Long sqootId) {
    this.sqootId = sqootId;
  }

  public Offer sqootUrl(String sqootUrl) {
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

  public Offer sqootCategorySlug(String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
    return this;
  }

   /**
   * Get sqootCategorySlug
   * @return sqootCategorySlug
  **/
  public String getSqootCategorySlug() {
    return sqootCategorySlug;
  }

  public void setSqootCategorySlug(String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
  }

  public Offer sqootCategoryName(String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
    return this;
  }

   /**
   * Get sqootCategoryName
   * @return sqootCategoryName
  **/
  public String getSqootCategoryName() {
    return sqootCategoryName;
  }

  public void setSqootCategoryName(String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
  }

  public Offer yipitId(Long yipitId) {
    this.yipitId = yipitId;
    return this;
  }

   /**
   * Get yipitId
   * @return yipitId
  **/
  public Long getYipitId() {
    return yipitId;
  }

  public void setYipitId(Long yipitId) {
    this.yipitId = yipitId;
  }

  public Offer redeemAuthOptions(String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
    return this;
  }

   /**
   * Get redeemAuthOptions
   * @return redeemAuthOptions
  **/
  public String getRedeemAuthOptions() {
    return redeemAuthOptions;
  }

  public void setRedeemAuthOptions(String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
  }

  public Offer publisher(String publisher) {
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

  public Offer product(Product product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Offer media(Media media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }

  public Offer event(Event event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public Offer device(Device device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
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
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Offer noteCount(Long noteCount) {
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

  public Offer favoriteCount(Long favoriteCount) {
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

  public Offer hasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
    return this;
  }

   /**
   * Get hasRatings
   * @return hasRatings
  **/
  public Boolean getHasRatings() {
    return hasRatings;
  }

  public void setHasRatings(Boolean hasRatings) {
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
  **/
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Offer likeCount(Long likeCount) {
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

  public Offer dislikeCount(Long dislikeCount) {
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

  public Offer availabilitySummary(String availabilitySummary) {
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
  **/
  public List<@Valid Flag> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  public Offer flagCount(Long flagCount) {
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

  public Offer flagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
    return this;
  }

   /**
   * Get flagThreshold
   * @return flagThreshold
  **/
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }

  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  public Offer savings(Double savings) {
    this.savings = savings;
    return this;
  }

   /**
   * Get savings
   * @return savings
  **/
  public Double getSavings() {
    return savings;
  }

  public void setSavings(Double savings) {
    this.savings = savings;
  }

  public Offer clickStream(Double clickStream) {
    this.clickStream = clickStream;
    return this;
  }

   /**
   * Get clickStream
   * @return clickStream
  **/
  public Double getClickStream() {
    return clickStream;
  }

  public void setClickStream(Double clickStream) {
    this.clickStream = clickStream;
  }

  public Offer ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

   /**
   * Get ticketCount
   * @return ticketCount
  **/
  public Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Offer display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public Offer appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public Offer categoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
    return this;
  }

   /**
   * Get categoryTree
   * @return categoryTree
  **/
  public String getCategoryTree() {
    return categoryTree;
  }

  public void setCategoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
  }

  public Offer filterTree(String filterTree) {
    this.filterTree = filterTree;
    return this;
  }

   /**
   * Get filterTree
   * @return filterTree
  **/
  public String getFilterTree() {
    return filterTree;
  }

  public void setFilterTree(String filterTree) {
    this.filterTree = filterTree;
  }

  public Offer indexable(Boolean indexable) {
    this.indexable = indexable;
    return this;
  }

   /**
   * Get indexable
   * @return indexable
  **/
  public Boolean getIndexable() {
    return indexable;
  }

  public void setIndexable(Boolean indexable) {
    this.indexable = indexable;
  }

  public Offer billableId(Long billableId) {
    this.billableId = billableId;
    return this;
  }

   /**
   * Get billableId
   * @return billableId
  **/
  public Long getBillableId() {
    return billableId;
  }

  public void setBillableId(Long billableId) {
    this.billableId = billableId;
  }

  public Offer subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public Offer contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Offer defaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
    return this;
  }

   /**
   * Get defaultThreshold
   * @return defaultThreshold
  **/
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }

  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  public Offer contentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
    return this;
  }

   /**
   * Get contentAsset
   * @return contentAsset
  **/
  public Asset getContentAsset() {
    return contentAsset;
  }

  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  public Offer owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Offer secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

   /**
   * Get secondaryType
   * @return secondaryType
  **/
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public Offer discountPercentage(Double discountPercentage) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(id, offer.id) &&
        Objects.equals(active, offer.active) &&
        Objects.equals(valid, offer.valid) &&
        Objects.equals(testField, offer.testField) &&
        Objects.equals(billableEntity, offer.billableEntity) &&
        Objects.equals(offerLocations, offer.offerLocations) &&
        Objects.equals(missions, offer.missions) &&
        Objects.equals(activated, offer.activated) &&
        Objects.equals(expires, offer.expires) &&
        Objects.equals(redeemableStart, offer.redeemableStart) &&
        Objects.equals(redeemableEnd, offer.redeemableEnd) &&
        Objects.equals(title, offer.title) &&
        Objects.equals(subTitle, offer.subTitle) &&
        Objects.equals(type, offer.type) &&
        Objects.equals(specialOfferType, offer.specialOfferType) &&
        Objects.equals(details, offer.details) &&
        Objects.equals(subDetails, offer.subDetails) &&
        Objects.equals(finePrint, offer.finePrint) &&
        Objects.equals(getThereNowNotification, offer.getThereNowNotification) &&
        Objects.equals(maxPrints, offer.maxPrints) &&
        Objects.equals(viewLimit, offer.viewLimit) &&
        Objects.equals(featured, offer.featured) &&
        Objects.equals(replaced, offer.replaced) &&
        Objects.equals(showRemaining, offer.showRemaining) &&
        Objects.equals(showRedeemed, offer.showRedeemed) &&
        Objects.equals(parentOffer, offer.parentOffer) &&
        Objects.equals(artwork, offer.artwork) &&
        Objects.equals(offerImage1, offer.offerImage1) &&
        Objects.equals(offerImage2, offer.offerImage2) &&
        Objects.equals(offerImage3, offer.offerImage3) &&
        Objects.equals(offerImage4, offer.offerImage4) &&
        Objects.equals(offerImage5, offer.offerImage5) &&
        Objects.equals(barCode, offer.barCode) &&
        Objects.equals(barCodeType, offer.barCodeType) &&
        Objects.equals(barCodeEntry, offer.barCodeEntry) &&
        Objects.equals(categories, offer.categories) &&
        Objects.equals(filters, offer.filters) &&
        Objects.equals(ticketType, offer.ticketType) &&
        Objects.equals(allocateTickets, offer.allocateTickets) &&
        Objects.equals(ticketPriceType, offer.ticketPriceType) &&
        Objects.equals(ticketPrice, offer.ticketPrice) &&
        Objects.equals(fullPrice, offer.fullPrice) &&
        Objects.equals(discountPrice, offer.discountPrice) &&
        Objects.equals(availableLimit, offer.availableLimit) &&
        Objects.equals(availableLimitPerUser, offer.availableLimitPerUser) &&
        Objects.equals(addedLimit, offer.addedLimit) &&
        Objects.equals(usedCount, offer.usedCount) &&
        Objects.equals(addedCount, offer.addedCount) &&
        Objects.equals(removedCount, offer.removedCount) &&
        Objects.equals(viewedCount, offer.viewedCount) &&
        Objects.equals(clickedCount, offer.clickedCount) &&
        Objects.equals(offerVisibility, offer.offerVisibility) &&
        Objects.equals(offerProcessorId, offer.offerProcessorId) &&
        Objects.equals(externalId, offer.externalId) &&
        Objects.equals(externalUrl, offer.externalUrl) &&
        Objects.equals(externalUntrackedUrl, offer.externalUntrackedUrl) &&
        Objects.equals(sqootId, offer.sqootId) &&
        Objects.equals(sqootUrl, offer.sqootUrl) &&
        Objects.equals(sqootCategorySlug, offer.sqootCategorySlug) &&
        Objects.equals(sqootCategoryName, offer.sqootCategoryName) &&
        Objects.equals(yipitId, offer.yipitId) &&
        Objects.equals(redeemAuthOptions, offer.redeemAuthOptions) &&
        Objects.equals(publisher, offer.publisher) &&
        Objects.equals(product, offer.product) &&
        Objects.equals(media, offer.media) &&
        Objects.equals(event, offer.event) &&
        Objects.equals(device, offer.device) &&
        Objects.equals(notes, offer.notes) &&
        Objects.equals(noteCount, offer.noteCount) &&
        Objects.equals(favoriteCount, offer.favoriteCount) &&
        Objects.equals(hasRatings, offer.hasRatings) &&
        Objects.equals(likes, offer.likes) &&
        Objects.equals(likeCount, offer.likeCount) &&
        Objects.equals(dislikeCount, offer.dislikeCount) &&
        Objects.equals(availabilitySummary, offer.availabilitySummary) &&
        Objects.equals(flags, offer.flags) &&
        Objects.equals(flagCount, offer.flagCount) &&
        Objects.equals(flagThreshold, offer.flagThreshold) &&
        Objects.equals(savings, offer.savings) &&
        Objects.equals(clickStream, offer.clickStream) &&
        Objects.equals(ticketCount, offer.ticketCount) &&
        Objects.equals(display, offer.display) &&
        Objects.equals(appKey, offer.appKey) &&
        Objects.equals(categoryTree, offer.categoryTree) &&
        Objects.equals(filterTree, offer.filterTree) &&
        Objects.equals(indexable, offer.indexable) &&
        Objects.equals(billableId, offer.billableId) &&
        Objects.equals(subType, offer.subType) &&
        Objects.equals(contentName, offer.contentName) &&
        Objects.equals(defaultThreshold, offer.defaultThreshold) &&
        Objects.equals(contentAsset, offer.contentAsset) &&
        Objects.equals(owner, offer.owner) &&
        Objects.equals(secondaryType, offer.secondaryType) &&
        Objects.equals(discountPercentage, offer.discountPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, testField, billableEntity, offerLocations, missions, activated, expires, redeemableStart, redeemableEnd, title, subTitle, type, specialOfferType, details, subDetails, finePrint, getThereNowNotification, maxPrints, viewLimit, featured, replaced, showRemaining, showRedeemed, parentOffer, artwork, offerImage1, offerImage2, offerImage3, offerImage4, offerImage5, barCode, barCodeType, barCodeEntry, categories, filters, ticketType, allocateTickets, ticketPriceType, ticketPrice, fullPrice, discountPrice, availableLimit, availableLimitPerUser, addedLimit, usedCount, addedCount, removedCount, viewedCount, clickedCount, offerVisibility, offerProcessorId, externalId, externalUrl, externalUntrackedUrl, sqootId, sqootUrl, sqootCategorySlug, sqootCategoryName, yipitId, redeemAuthOptions, publisher, product, media, event, device, notes, noteCount, favoriteCount, hasRatings, likes, likeCount, dislikeCount, availabilitySummary, flags, flagCount, flagThreshold, savings, clickStream, ticketCount, display, appKey, categoryTree, filterTree, indexable, billableId, subType, contentName, defaultThreshold, contentAsset, owner, secondaryType, discountPercentage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

