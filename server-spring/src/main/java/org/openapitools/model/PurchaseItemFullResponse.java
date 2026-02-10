package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PurchaseItemFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseItemFullResponse {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Integer tickets;

  private @Nullable AssetShortResponse coverAsset;

  private @Nullable AssetShortResponse promoAsset;

  private @Nullable Boolean giftable;

  private @Nullable Boolean assetable;

  private @Nullable String gameType;

  private @Nullable Float price;

  private @Nullable String purchaseType;

  private @Nullable String purchaseCode;

  private @Nullable Integer purchaseLimit;

  private @Nullable Integer quantity;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ServiceActionEnum serviceAction;

  private @Nullable String appName;

  private @Nullable String secretKey;

  private @Nullable String appKey;

  private @Nullable Boolean allocateTickets;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Long points;

  public PurchaseItemFullResponse id(@Nullable Long id) {
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

  public PurchaseItemFullResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public PurchaseItemFullResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public PurchaseItemFullResponse tickets(@Nullable Integer tickets) {
    this.tickets = tickets;
    return this;
  }

  /**
   * Get tickets
   * @return tickets
   */
  
  @Schema(name = "tickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tickets")
  public @Nullable Integer getTickets() {
    return tickets;
  }

  public void setTickets(@Nullable Integer tickets) {
    this.tickets = tickets;
  }

  public PurchaseItemFullResponse coverAsset(@Nullable AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
    return this;
  }

  /**
   * Get coverAsset
   * @return coverAsset
   */
  @Valid 
  @Schema(name = "coverAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coverAsset")
  public @Nullable AssetShortResponse getCoverAsset() {
    return coverAsset;
  }

  public void setCoverAsset(@Nullable AssetShortResponse coverAsset) {
    this.coverAsset = coverAsset;
  }

  public PurchaseItemFullResponse promoAsset(@Nullable AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
    return this;
  }

  /**
   * Get promoAsset
   * @return promoAsset
   */
  @Valid 
  @Schema(name = "promoAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoAsset")
  public @Nullable AssetShortResponse getPromoAsset() {
    return promoAsset;
  }

  public void setPromoAsset(@Nullable AssetShortResponse promoAsset) {
    this.promoAsset = promoAsset;
  }

  public PurchaseItemFullResponse giftable(@Nullable Boolean giftable) {
    this.giftable = giftable;
    return this;
  }

  /**
   * Get giftable
   * @return giftable
   */
  
  @Schema(name = "giftable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("giftable")
  public @Nullable Boolean getGiftable() {
    return giftable;
  }

  public void setGiftable(@Nullable Boolean giftable) {
    this.giftable = giftable;
  }

  public PurchaseItemFullResponse assetable(@Nullable Boolean assetable) {
    this.assetable = assetable;
    return this;
  }

  /**
   * Get assetable
   * @return assetable
   */
  
  @Schema(name = "assetable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetable")
  public @Nullable Boolean getAssetable() {
    return assetable;
  }

  public void setAssetable(@Nullable Boolean assetable) {
    this.assetable = assetable;
  }

  public PurchaseItemFullResponse gameType(@Nullable String gameType) {
    this.gameType = gameType;
    return this;
  }

  /**
   * Get gameType
   * @return gameType
   */
  
  @Schema(name = "gameType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameType")
  public @Nullable String getGameType() {
    return gameType;
  }

  public void setGameType(@Nullable String gameType) {
    this.gameType = gameType;
  }

  public PurchaseItemFullResponse price(@Nullable Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable Float getPrice() {
    return price;
  }

  public void setPrice(@Nullable Float price) {
    this.price = price;
  }

  public PurchaseItemFullResponse purchaseType(@Nullable String purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  /**
   * Get purchaseType
   * @return purchaseType
   */
  
  @Schema(name = "purchaseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseType")
  public @Nullable String getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(@Nullable String purchaseType) {
    this.purchaseType = purchaseType;
  }

  public PurchaseItemFullResponse purchaseCode(@Nullable String purchaseCode) {
    this.purchaseCode = purchaseCode;
    return this;
  }

  /**
   * Get purchaseCode
   * @return purchaseCode
   */
  
  @Schema(name = "purchaseCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseCode")
  public @Nullable String getPurchaseCode() {
    return purchaseCode;
  }

  public void setPurchaseCode(@Nullable String purchaseCode) {
    this.purchaseCode = purchaseCode;
  }

  public PurchaseItemFullResponse purchaseLimit(@Nullable Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
    return this;
  }

  /**
   * Get purchaseLimit
   * @return purchaseLimit
   */
  
  @Schema(name = "purchaseLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseLimit")
  public @Nullable Integer getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(@Nullable Integer purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  public PurchaseItemFullResponse quantity(@Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public PurchaseItemFullResponse serviceAction(@Nullable ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
    return this;
  }

  /**
   * Get serviceAction
   * @return serviceAction
   */
  
  @Schema(name = "serviceAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceAction")
  public @Nullable ServiceActionEnum getServiceAction() {
    return serviceAction;
  }

  public void setServiceAction(@Nullable ServiceActionEnum serviceAction) {
    this.serviceAction = serviceAction;
  }

  public PurchaseItemFullResponse appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public @Nullable String getAppName() {
    return appName;
  }

  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public PurchaseItemFullResponse secretKey(@Nullable String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  /**
   * Get secretKey
   * @return secretKey
   */
  
  @Schema(name = "secretKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secretKey")
  public @Nullable String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(@Nullable String secretKey) {
    this.secretKey = secretKey;
  }

  public PurchaseItemFullResponse appKey(@Nullable String appKey) {
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

  public PurchaseItemFullResponse allocateTickets(@Nullable Boolean allocateTickets) {
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

  public PurchaseItemFullResponse ticketType(@Nullable String ticketType) {
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

  public PurchaseItemFullResponse ticketCount(@Nullable Long ticketCount) {
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

  public PurchaseItemFullResponse points(@Nullable Long points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public @Nullable Long getPoints() {
    return points;
  }

  public void setPoints(@Nullable Long points) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

