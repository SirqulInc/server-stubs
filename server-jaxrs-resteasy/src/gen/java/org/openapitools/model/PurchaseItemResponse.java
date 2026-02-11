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
public class PurchaseItemResponse   {
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

