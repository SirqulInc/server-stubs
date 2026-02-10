package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PurchaseItemFullResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Integer tickets;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse coverAsset;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse promoAsset;

  @ApiModelProperty(value = "")

  private Boolean giftable;

  @ApiModelProperty(value = "")

  private Boolean assetable;

  @ApiModelProperty(value = "")

  private String gameType;

  @ApiModelProperty(value = "")

  private Float price;

  @ApiModelProperty(value = "")

  private String purchaseType;

  @ApiModelProperty(value = "")

  private String purchaseCode;

  @ApiModelProperty(value = "")

  private Integer purchaseLimit;

  @ApiModelProperty(value = "")

  private Integer quantity;

public enum ServiceActionEnum {

DAY_PREMIUM(String.valueOf("DAY_PREMIUM")), WEEK_PREMIUM(String.valueOf("WEEK_PREMIUM")), MONTH_PREMIUM(String.valueOf("MONTH_PREMIUM")), YEAR_PREMIUM(String.valueOf("YEAR_PREMIUM")), LIFETIME_PREMIUM(String.valueOf("LIFETIME_PREMIUM")), ADD_TICKET(String.valueOf("ADD_TICKET")), ADD_GIFT(String.valueOf("ADD_GIFT")), ADD_POINTS(String.valueOf("ADD_POINTS"));


    private String value;

    ServiceActionEnum (String v) {
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
    public static ServiceActionEnum fromValue(String value) {
        for (ServiceActionEnum b : ServiceActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ServiceActionEnum serviceAction;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  private String secretKey;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private Boolean allocateTickets;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  private Long ticketCount;

  @ApiModelProperty(value = "")

  private Long points;
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

  public PurchaseItemFullResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PurchaseItemFullResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PurchaseItemFullResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get tickets
   * @return tickets
  **/
  @JsonProperty("tickets")
  public Integer getTickets() {
    return tickets;
  }

  public void setTickets(Integer tickets) {
    this.tickets = tickets;
  }

  public PurchaseItemFullResponse tickets(Integer tickets) {
    this.tickets = tickets;
    return this;
  }

 /**
   * Get coverAsset
   * @return coverAsset
  **/
  @JsonProperty("coverAsset")
  public AssetShortResponse getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  public PurchaseItemFullResponse coverAsset(AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

 /**
   * Get promoAsset
   * @return promoAsset
  **/
  @JsonProperty("promoAsset")
  public AssetShortResponse getPromoAsset() {
    return promoAsset;
  }

  public void setPromoAsset(AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
  }

  public PurchaseItemFullResponse promoAsset(AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
    return this;
  }

 /**
   * Get giftable
   * @return giftable
  **/
  @JsonProperty("giftable")
  public Boolean getGiftable() {
    return giftable;
  }

  public void setGiftable(Boolean giftable) {
    this.giftable = giftable;
  }

  public PurchaseItemFullResponse giftable(Boolean giftable) {
    this.giftable = giftable;
    return this;
  }

 /**
   * Get assetable
   * @return assetable
  **/
  @JsonProperty("assetable")
  public Boolean getAssetable() {
    return assetable;
  }

  public void setAssetable(Boolean assetable) {
    this.assetable = assetable;
  }

  public PurchaseItemFullResponse assetable(Boolean assetable) {
    this.assetable = assetable;
    return this;
  }

 /**
   * Get gameType
   * @return gameType
  **/
  @JsonProperty("gameType")
  public String getGameType() {
    return gameType;
  }

  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  public PurchaseItemFullResponse gameType(String gameType) {
    this.gameType = gameType;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public PurchaseItemFullResponse price(Float price) {
    this.price = price;
    return this;
  }

 /**
   * Get purchaseType
   * @return purchaseType
  **/
  @JsonProperty("purchaseType")
  public String getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
  }

  public PurchaseItemFullResponse purchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

 /**
   * Get purchaseCode
   * @return purchaseCode
  **/
  @JsonProperty("purchaseCode")
  public String getPurchaseCode() {
    return purchaseCode;
  }

  public void setPurchaseCode(String purchaseCode) {
    this.purchaseCode = purchaseCode;
  }

  public PurchaseItemFullResponse purchaseCode(String purchaseCode) {
    this.purchaseCode = purchaseCode;
    return this;
  }

 /**
   * Get purchaseLimit
   * @return purchaseLimit
  **/
  @JsonProperty("purchaseLimit")
  public Integer getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  public PurchaseItemFullResponse purchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PurchaseItemFullResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get serviceAction
   * @return serviceAction
  **/
  @JsonProperty("serviceAction")
  public String getServiceAction() {
    if (serviceAction == null) {
      return null;
    }
    return serviceAction.value();
  }

  public void setServiceAction(ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
  }

  public PurchaseItemFullResponse serviceAction(ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
    return this;
  }

 /**
   * Get appName
   * @return appName
  **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public PurchaseItemFullResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get secretKey
   * @return secretKey
  **/
  @JsonProperty("secretKey")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public PurchaseItemFullResponse secretKey(String secretKey) {
    this.secretKey = secretKey;
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

  public PurchaseItemFullResponse appKey(String appKey) {
    this.appKey = appKey;
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

  public PurchaseItemFullResponse allocateTickets(Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
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

  public PurchaseItemFullResponse ticketType(String ticketType) {
    this.ticketType = ticketType;
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

  public PurchaseItemFullResponse ticketCount(Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

 /**
   * Get points
   * @return points
  **/
  @JsonProperty("points")
  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public PurchaseItemFullResponse points(Long points) {
    this.points = points;
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
    PurchaseItemFullResponse purchaseItemFullResponse = (PurchaseItemFullResponse) o;
    return Objects.equals(this.id, purchaseItemFullResponse.id) &&
        Objects.equals(this.name, purchaseItemFullResponse.name) &&
        Objects.equals(this.description, purchaseItemFullResponse.description) &&
        Objects.equals(this.tickets, purchaseItemFullResponse.tickets) &&
        Objects.equals(this.coverAsset, purchaseItemFullResponse.coverAsset) &&
        Objects.equals(this.promoAsset, purchaseItemFullResponse.promoAsset) &&
        Objects.equals(this.giftable, purchaseItemFullResponse.giftable) &&
        Objects.equals(this.assetable, purchaseItemFullResponse.assetable) &&
        Objects.equals(this.gameType, purchaseItemFullResponse.gameType) &&
        Objects.equals(this.price, purchaseItemFullResponse.price) &&
        Objects.equals(this.purchaseType, purchaseItemFullResponse.purchaseType) &&
        Objects.equals(this.purchaseCode, purchaseItemFullResponse.purchaseCode) &&
        Objects.equals(this.purchaseLimit, purchaseItemFullResponse.purchaseLimit) &&
        Objects.equals(this.quantity, purchaseItemFullResponse.quantity) &&
        Objects.equals(this.serviceAction, purchaseItemFullResponse.serviceAction) &&
        Objects.equals(this.appName, purchaseItemFullResponse.appName) &&
        Objects.equals(this.secretKey, purchaseItemFullResponse.secretKey) &&
        Objects.equals(this.appKey, purchaseItemFullResponse.appKey) &&
        Objects.equals(this.allocateTickets, purchaseItemFullResponse.allocateTickets) &&
        Objects.equals(this.ticketType, purchaseItemFullResponse.ticketType) &&
        Objects.equals(this.ticketCount, purchaseItemFullResponse.ticketCount) &&
        Objects.equals(this.points, purchaseItemFullResponse.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tickets, coverAsset, promoAsset, giftable, assetable, gameType, price, purchaseType, purchaseCode, purchaseLimit, quantity, serviceAction, appName, secretKey, appKey, allocateTickets, ticketType, ticketCount, points);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

