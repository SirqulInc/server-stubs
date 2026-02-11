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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Offer   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String testField;
  private BillableEntity billableEntity;
  private List<@Valid OfferLocation> offerLocations = new ArrayList<>();
  private List<@Valid Mission> missions = new ArrayList<>();
  private Date activated;
  private Date expires;
  private Date redeemableStart;
  private Date redeemableEnd;
  private String title;
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
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

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
  private String details;
  private String subDetails;
  private String finePrint;
  private String getThereNowNotification;
  private Integer maxPrints;
  private Integer viewLimit;
  private Boolean featured;
  private Boolean replaced;
  private Boolean showRemaining;
  private Boolean showRedeemed;
  private Offer parentOffer;
  private Asset artwork;
  private Asset offerImage1;
  private Asset offerImage2;
  private Asset offerImage3;
  private Asset offerImage4;
  private Asset offerImage5;
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
    private String value;

    BarCodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private BarCodeTypeEnum barCodeType;
  private String barCodeEntry;
  private List<@Valid Category> categories = new ArrayList<>();
  private List<@Valid Filter> filters = new ArrayList<>();
  private String ticketType;
  private Boolean allocateTickets;
  private String ticketPriceType;
  private Long ticketPrice;
  private Double fullPrice;
  private Double discountPrice;
  private Integer availableLimit;
  private Integer availableLimitPerUser;
  private Integer addedLimit;
  private Integer usedCount;
  private Integer addedCount;
  private Integer removedCount;
  private Integer viewedCount;
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
    private String value;

    OfferVisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OfferVisibilityEnum offerVisibility;

  /**
   * Gets or Sets offerProcessorId
   */
  public enum OfferProcessorIdEnum {
    SQOOT("SQOOT"),

        YIPIT("YIPIT"),

        API("API"),

        CSV("CSV");
    private String value;

    OfferProcessorIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private OfferProcessorIdEnum offerProcessorId;
  private String externalId;
  private String externalUrl;
  private String externalUntrackedUrl;
  private Long sqootId;
  private String sqootUrl;
  private String sqootCategorySlug;
  private String sqootCategoryName;
  private Long yipitId;
  private String redeemAuthOptions;
  private String publisher;
  private Product product;
  private Media media;
  private Event event;
  private Device device;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private Long favoriteCount;
  private Boolean hasRatings;
  private List<@Valid YayOrNay> likes = new ArrayList<>();
  private Long likeCount;
  private Long dislikeCount;
  private String availabilitySummary;
  private List<@Valid Flag> flags = new ArrayList<>();
  private Long flagCount;
  private FlagThreshold flagThreshold;
  private Double savings;
  private Double clickStream;
  private Long ticketCount;
  private String display;
  private String appKey;
  private String categoryTree;
  private String filterTree;
  private Boolean indexable;
  private Long billableId;
  private String subType;
  private String contentName;
  private Long defaultThreshold;
  private Asset contentAsset;
  private Account owner;
  private String secondaryType;
  private Double discountPercentage;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("testField")
  public String getTestField() {
    return testField;
  }
  public void setTestField(String testField) {
    this.testField = testField;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerLocations")
  @Valid
  public List<@Valid OfferLocation> getOfferLocations() {
    return offerLocations;
  }
  public void setOfferLocations(List<@Valid OfferLocation> offerLocations) {
    this.offerLocations = offerLocations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("missions")
  @Valid
  public List<@Valid Mission> getMissions() {
    return missions;
  }
  public void setMissions(List<@Valid Mission> missions) {
    this.missions = missions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activated")
  public Date getActivated() {
    return activated;
  }
  public void setActivated(Date activated) {
    this.activated = activated;
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
  @JsonProperty("redeemableStart")
  public Date getRedeemableStart() {
    return redeemableStart;
  }
  public void setRedeemableStart(Date redeemableStart) {
    this.redeemableStart = redeemableStart;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redeemableEnd")
  public Date getRedeemableEnd() {
    return redeemableEnd;
  }
  public void setRedeemableEnd(Date redeemableEnd) {
    this.redeemableEnd = redeemableEnd;
  }

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
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
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
  @JsonProperty("getThereNowNotification")
  public String getGetThereNowNotification() {
    return getThereNowNotification;
  }
  public void setGetThereNowNotification(String getThereNowNotification) {
    this.getThereNowNotification = getThereNowNotification;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPrints")
  public Integer getMaxPrints() {
    return maxPrints;
  }
  public void setMaxPrints(Integer maxPrints) {
    this.maxPrints = maxPrints;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("viewLimit")
  public Integer getViewLimit() {
    return viewLimit;
  }
  public void setViewLimit(Integer viewLimit) {
    this.viewLimit = viewLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("featured")
  public Boolean getFeatured() {
    return featured;
  }
  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("replaced")
  public Boolean getReplaced() {
    return replaced;
  }
  public void setReplaced(Boolean replaced) {
    this.replaced = replaced;
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
  @JsonProperty("parentOffer")
  @Valid
  public Offer getParentOffer() {
    return parentOffer;
  }
  public void setParentOffer(Offer parentOffer) {
    this.parentOffer = parentOffer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("artwork")
  @Valid
  public Asset getArtwork() {
    return artwork;
  }
  public void setArtwork(Asset artwork) {
    this.artwork = artwork;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerImage1")
  @Valid
  public Asset getOfferImage1() {
    return offerImage1;
  }
  public void setOfferImage1(Asset offerImage1) {
    this.offerImage1 = offerImage1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerImage2")
  @Valid
  public Asset getOfferImage2() {
    return offerImage2;
  }
  public void setOfferImage2(Asset offerImage2) {
    this.offerImage2 = offerImage2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerImage3")
  @Valid
  public Asset getOfferImage3() {
    return offerImage3;
  }
  public void setOfferImage3(Asset offerImage3) {
    this.offerImage3 = offerImage3;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerImage4")
  @Valid
  public Asset getOfferImage4() {
    return offerImage4;
  }
  public void setOfferImage4(Asset offerImage4) {
    this.offerImage4 = offerImage4;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerImage5")
  @Valid
  public Asset getOfferImage5() {
    return offerImage5;
  }
  public void setOfferImage5(Asset offerImage5) {
    this.offerImage5 = offerImage5;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("barCode")
  @Valid
  public Asset getBarCode() {
    return barCode;
  }
  public void setBarCode(Asset barCode) {
    this.barCode = barCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("barCodeType")
  public BarCodeTypeEnum getBarCodeType() {
    return barCodeType;
  }
  public void setBarCodeType(BarCodeTypeEnum barCodeType) {
    this.barCodeType = barCodeType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("barCodeEntry")
  public String getBarCodeEntry() {
    return barCodeEntry;
  }
  public void setBarCodeEntry(String barCodeEntry) {
    this.barCodeEntry = barCodeEntry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid Category> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid Category> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid
  public List<@Valid Filter> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }
  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allocateTickets")
  public Boolean getAllocateTickets() {
    return allocateTickets;
  }
  public void setAllocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
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
  @JsonProperty("availableLimit")
  public Integer getAvailableLimit() {
    return availableLimit;
  }
  public void setAvailableLimit(Integer availableLimit) {
    this.availableLimit = availableLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availableLimitPerUser")
  public Integer getAvailableLimitPerUser() {
    return availableLimitPerUser;
  }
  public void setAvailableLimitPerUser(Integer availableLimitPerUser) {
    this.availableLimitPerUser = availableLimitPerUser;
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
  @JsonProperty("offerVisibility")
  public OfferVisibilityEnum getOfferVisibility() {
    return offerVisibility;
  }
  public void setOfferVisibility(OfferVisibilityEnum offerVisibility) {
    this.offerVisibility = offerVisibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offerProcessorId")
  public OfferProcessorIdEnum getOfferProcessorId() {
    return offerProcessorId;
  }
  public void setOfferProcessorId(OfferProcessorIdEnum offerProcessorId) {
    this.offerProcessorId = offerProcessorId;
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
  @JsonProperty("externalUntrackedUrl")
  public String getExternalUntrackedUrl() {
    return externalUntrackedUrl;
  }
  public void setExternalUntrackedUrl(String externalUntrackedUrl) {
    this.externalUntrackedUrl = externalUntrackedUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sqootId")
  public Long getSqootId() {
    return sqootId;
  }
  public void setSqootId(Long sqootId) {
    this.sqootId = sqootId;
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
  @JsonProperty("sqootCategorySlug")
  public String getSqootCategorySlug() {
    return sqootCategorySlug;
  }
  public void setSqootCategorySlug(String sqootCategorySlug) {
    this.sqootCategorySlug = sqootCategorySlug;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sqootCategoryName")
  public String getSqootCategoryName() {
    return sqootCategoryName;
  }
  public void setSqootCategoryName(String sqootCategoryName) {
    this.sqootCategoryName = sqootCategoryName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("yipitId")
  public Long getYipitId() {
    return yipitId;
  }
  public void setYipitId(Long yipitId) {
    this.yipitId = yipitId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("redeemAuthOptions")
  public String getRedeemAuthOptions() {
    return redeemAuthOptions;
  }
  public void setRedeemAuthOptions(String redeemAuthOptions) {
    this.redeemAuthOptions = redeemAuthOptions;
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
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  @Valid
  public Media getMedia() {
    return media;
  }
  public void setMedia(Media media) {
    this.media = media;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event")
  @Valid
  public Event getEvent() {
    return event;
  }
  public void setEvent(Event event) {
    this.event = event;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("device")
  @Valid
  public Device getDevice() {
    return device;
  }
  public void setDevice(Device device) {
    this.device = device;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  @Valid
  public List<@Valid Note> getNotes() {
    return notes;
  }
  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
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
  @JsonProperty("hasRatings")
  public Boolean getHasRatings() {
    return hasRatings;
  }
  public void setHasRatings(Boolean hasRatings) {
    this.hasRatings = hasRatings;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likes")
  @Valid
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }
  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
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
  @JsonProperty("flags")
  @Valid
  public List<@Valid Flag> getFlags() {
    return flags;
  }
  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
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
  @Valid
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }
  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("savings")
  public Double getSavings() {
    return savings;
  }
  public void setSavings(Double savings) {
    this.savings = savings;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clickStream")
  public Double getClickStream() {
    return clickStream;
  }
  public void setClickStream(Double clickStream) {
    this.clickStream = clickStream;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketCount")
  public Long getTicketCount() {
    return ticketCount;
  }
  public void setTicketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoryTree")
  public String getCategoryTree() {
    return categoryTree;
  }
  public void setCategoryTree(String categoryTree) {
    this.categoryTree = categoryTree;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filterTree")
  public String getFilterTree() {
    return filterTree;
  }
  public void setFilterTree(String filterTree) {
    this.filterTree = filterTree;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indexable")
  public Boolean getIndexable() {
    return indexable;
  }
  public void setIndexable(Boolean indexable) {
    this.indexable = indexable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableId")
  public Long getBillableId() {
    return billableId;
  }
  public void setBillableId(Long billableId) {
    this.billableId = billableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }
  public void setSubType(String subType) {
    this.subType = subType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }
  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentAsset")
  @Valid
  public Asset getContentAsset() {
    return contentAsset;
  }
  public void setContentAsset(Asset contentAsset) {
    this.contentAsset = contentAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }
  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

