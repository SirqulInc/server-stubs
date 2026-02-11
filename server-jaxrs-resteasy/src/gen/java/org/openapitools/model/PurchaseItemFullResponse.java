package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseItemFullResponse   {
  
  private Long id;
  private String name;
  private String description;
  private Integer tickets;
  private AssetShortResponse coverAsset;
  private AssetShortResponse promoAsset;
  private Boolean giftable;
  private Boolean assetable;
  private String gameType;
  private Float price;
  private String purchaseType;
  private String purchaseCode;
  private Integer purchaseLimit;
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
    private String value;

    ServiceActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ServiceActionEnum serviceAction;
  private String appName;
  private String secretKey;
  private String appKey;
  private Boolean allocateTickets;
  private String ticketType;
  private Long ticketCount;
  private Long points;

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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tickets")
  public Integer getTickets() {
    return tickets;
  }
  public void setTickets(Integer tickets) {
    this.tickets = tickets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("coverAsset")
  @Valid
  public AssetShortResponse getCoverAsset() {
    return coverAsset;
  }
  public void setCoverAsset(AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("promoAsset")
  @Valid
  public AssetShortResponse getPromoAsset() {
    return promoAsset;
  }
  public void setPromoAsset(AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("giftable")
  public Boolean getGiftable() {
    return giftable;
  }
  public void setGiftable(Boolean giftable) {
    this.giftable = giftable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetable")
  public Boolean getAssetable() {
    return assetable;
  }
  public void setAssetable(Boolean assetable) {
    this.assetable = assetable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gameType")
  public String getGameType() {
    return gameType;
  }
  public void setGameType(String gameType) {
    this.gameType = gameType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseType")
  public String getPurchaseType() {
    return purchaseType;
  }
  public void setPurchaseType(String purchaseType) {
    this.purchaseType = purchaseType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseCode")
  public String getPurchaseCode() {
    return purchaseCode;
  }
  public void setPurchaseCode(String purchaseCode) {
    this.purchaseCode = purchaseCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseLimit")
  public Integer getPurchaseLimit() {
    return purchaseLimit;
  }
  public void setPurchaseLimit(Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceAction")
  public ServiceActionEnum getServiceAction() {
    return serviceAction;
  }
  public void setServiceAction(ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secretKey")
  public String getSecretKey() {
    return secretKey;
  }
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
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
  @JsonProperty("points")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

