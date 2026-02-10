package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PurchaseItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PurchaseItemResponse   {
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

  public PurchaseItemResponse id(Long id) {
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

  public PurchaseItemResponse name(String name) {
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

  public PurchaseItemResponse description(String description) {
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

  public PurchaseItemResponse tickets(Integer tickets) {
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

  public PurchaseItemResponse coverAsset(AssetShortResponse coverAsset) {
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

  public PurchaseItemResponse promoAsset(AssetShortResponse promoAsset) {
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

  public PurchaseItemResponse giftable(Boolean giftable) {
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

  public PurchaseItemResponse assetable(Boolean assetable) {
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

  public PurchaseItemResponse gameType(String gameType) {
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

  public PurchaseItemResponse price(Float price) {
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

  public PurchaseItemResponse purchaseType(String purchaseType) {
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

  public PurchaseItemResponse purchaseCode(String purchaseCode) {
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

  public PurchaseItemResponse purchaseLimit(Integer purchaseLimit) {
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

  public PurchaseItemResponse quantity(Integer quantity) {
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

  public PurchaseItemResponse serviceAction(ServiceActionEnum serviceAction) {
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

  public PurchaseItemResponse appName(String appName) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseItemResponse purchaseItemResponse = (PurchaseItemResponse) o;
    return Objects.equals(id, purchaseItemResponse.id) &&
        Objects.equals(name, purchaseItemResponse.name) &&
        Objects.equals(description, purchaseItemResponse.description) &&
        Objects.equals(tickets, purchaseItemResponse.tickets) &&
        Objects.equals(coverAsset, purchaseItemResponse.coverAsset) &&
        Objects.equals(promoAsset, purchaseItemResponse.promoAsset) &&
        Objects.equals(giftable, purchaseItemResponse.giftable) &&
        Objects.equals(assetable, purchaseItemResponse.assetable) &&
        Objects.equals(gameType, purchaseItemResponse.gameType) &&
        Objects.equals(price, purchaseItemResponse.price) &&
        Objects.equals(purchaseType, purchaseItemResponse.purchaseType) &&
        Objects.equals(purchaseCode, purchaseItemResponse.purchaseCode) &&
        Objects.equals(purchaseLimit, purchaseItemResponse.purchaseLimit) &&
        Objects.equals(quantity, purchaseItemResponse.quantity) &&
        Objects.equals(serviceAction, purchaseItemResponse.serviceAction) &&
        Objects.equals(appName, purchaseItemResponse.appName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tickets, coverAsset, promoAsset, giftable, assetable, gameType, price, purchaseType, purchaseCode, purchaseLimit, quantity, serviceAction, appName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

