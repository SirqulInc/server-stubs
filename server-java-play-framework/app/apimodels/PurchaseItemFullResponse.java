package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PurchaseItemFullResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PurchaseItemFullResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("tickets")
  
  private Integer tickets;

  @JsonProperty("coverAsset")
  @Valid

  private AssetShortResponse coverAsset;

  @JsonProperty("promoAsset")
  @Valid

  private AssetShortResponse promoAsset;

  @JsonProperty("giftable")
  
  private Boolean giftable;

  @JsonProperty("assetable")
  
  private Boolean assetable;

  @JsonProperty("gameType")
  
  private String gameType;

  @JsonProperty("price")
  
  private Float price;

  @JsonProperty("purchaseType")
  
  private String purchaseType;

  @JsonProperty("purchaseCode")
  
  private String purchaseCode;

  @JsonProperty("purchaseLimit")
  
  private Integer purchaseLimit;

  @JsonProperty("quantity")
  
  private Integer quantity;

  /**
   * Gets or Sets serviceAction
   */
  public enum ServiceActionEnum {
    DAY_PREMIUM("DAY_PREMIUM"),
    
    WEEK_PREMIUM("WEEK_PREMIUM"),
    
    MONTH_PREMIUM("MONTH_PREMIUM"),
    
    YEAR_PREMIUM("YEAR_PREMIUM"),
    
    LIFETIME_PREMIUM("LIFETIME_PREMIUM"),
    
    ADD_TICKET("ADD_TICKET"),
    
    ADD_GIFT("ADD_GIFT"),
    
    ADD_POINTS("ADD_POINTS");

    private final String value;

    ServiceActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceActionEnum fromValue(String value) {
      for (ServiceActionEnum b : ServiceActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("serviceAction")
  
  private ServiceActionEnum serviceAction;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("secretKey")
  
  private String secretKey;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("allocateTickets")
  
  private Boolean allocateTickets;

  @JsonProperty("ticketType")
  
  private String ticketType;

  @JsonProperty("ticketCount")
  
  private Long ticketCount;

  @JsonProperty("points")
  
  private Long points;

  public PurchaseItemFullResponse id(Long id) {
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

  public PurchaseItemFullResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PurchaseItemFullResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PurchaseItemFullResponse tickets(Integer tickets) {
    this.tickets = tickets;
    return this;
  }

   /**
   * Get tickets
   * @return tickets
  **/
  public Integer getTickets() {
    return tickets;
  }

  public void setTickets(Integer tickets) {
    this.tickets = tickets;
  }

  public PurchaseItemFullResponse coverAsset(AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

   /**
   * Get coverAsset
   * @return coverAsset
  **/
  public AssetShortResponse getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  public PurchaseItemFullResponse promoAsset(AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
    return this;
  }

   /**
   * Get promoAsset
   * @return promoAsset
  **/
  public AssetShortResponse getPromoAsset() {
    return promoAsset;
  }

  public void setPromoAsset(AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
  }

  public PurchaseItemFullResponse giftable(Boolean giftable) {
    this.giftable = giftable;
    return this;
  }

   /**
   * Get giftable
   * @return giftable
  **/
  public Boolean getGiftable() {
    return giftable;
  }

  public void setGiftable(Boolean giftable) {
    this.giftable = giftable;
  }

  public PurchaseItemFullResponse assetable(Boolean assetable) {
    this.assetable = assetable;
    return this;
  }

   /**
   * Get assetable
   * @return assetable
  **/
  public Boolean getAssetable() {
    return assetable;
  }

  public void setAssetable(Boolean assetable) {
    this.assetable = assetable;
  }

  public PurchaseItemFullResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

   /**
   * Get gameType
   * @return gameType
  **/
  public String getGameType() {
    return gameType;
  }

  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  public PurchaseItemFullResponse price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public PurchaseItemFullResponse purchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

   /**
   * Get purchaseType
   * @return purchaseType
  **/
  public String getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
  }

  public PurchaseItemFullResponse purchaseCode(String purchaseCode) {
    this.purchaseCode = purchaseCode;
    return this;
  }

   /**
   * Get purchaseCode
   * @return purchaseCode
  **/
  public String getPurchaseCode() {
    return purchaseCode;
  }

  public void setPurchaseCode(String purchaseCode) {
    this.purchaseCode = purchaseCode;
  }

  public PurchaseItemFullResponse purchaseLimit(Integer purchaseLimit) {
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

  public PurchaseItemFullResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PurchaseItemFullResponse serviceAction(ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
    return this;
  }

   /**
   * Get serviceAction
   * @return serviceAction
  **/
  public ServiceActionEnum getServiceAction() {
    return serviceAction;
  }

  public void setServiceAction(ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
  }

  public PurchaseItemFullResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public PurchaseItemFullResponse secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public PurchaseItemFullResponse appKey(String appKey) {
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

  public PurchaseItemFullResponse allocateTickets(Boolean allocateTickets) {
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

  public PurchaseItemFullResponse ticketType(String ticketType) {
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

  public PurchaseItemFullResponse ticketCount(Long ticketCount) {
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

  public PurchaseItemFullResponse points(Long points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseItemFullResponse purchaseItemFullResponse = (PurchaseItemFullResponse) o;
    return Objects.equals(id, purchaseItemFullResponse.id) &&
        Objects.equals(name, purchaseItemFullResponse.name) &&
        Objects.equals(description, purchaseItemFullResponse.description) &&
        Objects.equals(tickets, purchaseItemFullResponse.tickets) &&
        Objects.equals(coverAsset, purchaseItemFullResponse.coverAsset) &&
        Objects.equals(promoAsset, purchaseItemFullResponse.promoAsset) &&
        Objects.equals(giftable, purchaseItemFullResponse.giftable) &&
        Objects.equals(assetable, purchaseItemFullResponse.assetable) &&
        Objects.equals(gameType, purchaseItemFullResponse.gameType) &&
        Objects.equals(price, purchaseItemFullResponse.price) &&
        Objects.equals(purchaseType, purchaseItemFullResponse.purchaseType) &&
        Objects.equals(purchaseCode, purchaseItemFullResponse.purchaseCode) &&
        Objects.equals(purchaseLimit, purchaseItemFullResponse.purchaseLimit) &&
        Objects.equals(quantity, purchaseItemFullResponse.quantity) &&
        Objects.equals(serviceAction, purchaseItemFullResponse.serviceAction) &&
        Objects.equals(appName, purchaseItemFullResponse.appName) &&
        Objects.equals(secretKey, purchaseItemFullResponse.secretKey) &&
        Objects.equals(appKey, purchaseItemFullResponse.appKey) &&
        Objects.equals(allocateTickets, purchaseItemFullResponse.allocateTickets) &&
        Objects.equals(ticketType, purchaseItemFullResponse.ticketType) &&
        Objects.equals(ticketCount, purchaseItemFullResponse.ticketCount) &&
        Objects.equals(points, purchaseItemFullResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tickets, coverAsset, promoAsset, giftable, assetable, gameType, price, purchaseType, purchaseCode, purchaseLimit, quantity, serviceAction, appName, secretKey, appKey, allocateTickets, ticketType, ticketCount, points);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseItemFullResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    coverAsset: ").append(toIndentedString(coverAsset)).append("\n");
    sb.append("    promoAsset: ").append(toIndentedString(promoAsset)).append("\n");
    sb.append("    giftable: ").append(toIndentedString(giftable)).append("\n");
    sb.append("    assetable: ").append(toIndentedString(assetable)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    purchaseType: ").append(toIndentedString(purchaseType)).append("\n");
    sb.append("    purchaseCode: ").append(toIndentedString(purchaseCode)).append("\n");
    sb.append("    purchaseLimit: ").append(toIndentedString(purchaseLimit)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    serviceAction: ").append(toIndentedString(serviceAction)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

