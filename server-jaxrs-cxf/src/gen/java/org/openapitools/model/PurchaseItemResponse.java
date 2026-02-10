package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PurchaseItemResponse  {
  
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

  public PurchaseItemResponse id(Long id) {
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

  public PurchaseItemResponse name(String name) {
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

  public PurchaseItemResponse description(String description) {
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

  public PurchaseItemResponse tickets(Integer tickets) {
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

  public PurchaseItemResponse coverAsset(AssetShortResponse coverAsset) {
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

  public PurchaseItemResponse promoAsset(AssetShortResponse promoAsset) {
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

  public PurchaseItemResponse giftable(Boolean giftable) {
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

  public PurchaseItemResponse assetable(Boolean assetable) {
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

  public PurchaseItemResponse gameType(String gameType) {
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

  public PurchaseItemResponse price(Float price) {
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

  public PurchaseItemResponse purchaseType(String purchaseType) {
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

  public PurchaseItemResponse purchaseCode(String purchaseCode) {
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

  public PurchaseItemResponse purchaseLimit(Integer purchaseLimit) {
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

  public PurchaseItemResponse quantity(Integer quantity) {
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

  public PurchaseItemResponse serviceAction(ServiceActionEnum serviceAction) {
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

  public PurchaseItemResponse appName(String appName) {
    this.appName = appName;
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
    PurchaseItemResponse purchaseItemResponse = (PurchaseItemResponse) o;
    return Objects.equals(this.id, purchaseItemResponse.id) &&
        Objects.equals(this.name, purchaseItemResponse.name) &&
        Objects.equals(this.description, purchaseItemResponse.description) &&
        Objects.equals(this.tickets, purchaseItemResponse.tickets) &&
        Objects.equals(this.coverAsset, purchaseItemResponse.coverAsset) &&
        Objects.equals(this.promoAsset, purchaseItemResponse.promoAsset) &&
        Objects.equals(this.giftable, purchaseItemResponse.giftable) &&
        Objects.equals(this.assetable, purchaseItemResponse.assetable) &&
        Objects.equals(this.gameType, purchaseItemResponse.gameType) &&
        Objects.equals(this.price, purchaseItemResponse.price) &&
        Objects.equals(this.purchaseType, purchaseItemResponse.purchaseType) &&
        Objects.equals(this.purchaseCode, purchaseItemResponse.purchaseCode) &&
        Objects.equals(this.purchaseLimit, purchaseItemResponse.purchaseLimit) &&
        Objects.equals(this.quantity, purchaseItemResponse.quantity) &&
        Objects.equals(this.serviceAction, purchaseItemResponse.serviceAction) &&
        Objects.equals(this.appName, purchaseItemResponse.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tickets, coverAsset, promoAsset, giftable, assetable, gameType, price, purchaseType, purchaseCode, purchaseLimit, quantity, serviceAction, appName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseItemResponse {\n");
    
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

