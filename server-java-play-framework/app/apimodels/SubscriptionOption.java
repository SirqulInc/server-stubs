package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SubscriptionOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SubscriptionOption   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("price")
  
  private Double price;

  @JsonProperty("quantity")
  
  private Integer quantity;

  @JsonProperty("threshold")
  
  private Integer threshold;

  @JsonProperty("visible")
  
  private Boolean visible;

  /**
   * Gets or Sets optionType
   */
  public enum OptionTypeEnum {
    MISSION("MISSION"),
    
    LOCATION("LOCATION"),
    
    OFFER("OFFER"),
    
    NOTIFICATION("NOTIFICATION"),
    
    REQUEST("REQUEST"),
    
    STORAGE_S3("STORAGE_S3"),
    
    STORAGE_DB("STORAGE_DB");

    private final String value;

    OptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OptionTypeEnum fromValue(String value) {
      for (OptionTypeEnum b : OptionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("optionType")
  
  private OptionTypeEnum optionType;

  /**
   * Gets or Sets offerType
   */
  public enum OfferTypeEnum {
    VOUCHER("VOUCHER"),
    
    COUPON("COUPON"),
    
    PRODUCT("PRODUCT"),
    
    MEDIA("MEDIA"),
    
    EVENT("EVENT"),
    
    DEVICE("DEVICE");

    private final String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfferTypeEnum fromValue(String value) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("offerType")
  
  private OfferTypeEnum offerType;

  public SubscriptionOption id(Long id) {
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

  public SubscriptionOption active(Boolean active) {
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

  public SubscriptionOption valid(Boolean valid) {
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

  public SubscriptionOption name(String name) {
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

  public SubscriptionOption price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public SubscriptionOption quantity(Integer quantity) {
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

  public SubscriptionOption threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public SubscriptionOption visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public SubscriptionOption optionType(OptionTypeEnum optionType) {
    this.optionType = optionType;
    return this;
  }

   /**
   * Get optionType
   * @return optionType
  **/
  public OptionTypeEnum getOptionType() {
    return optionType;
  }

  public void setOptionType(OptionTypeEnum optionType) {
    this.optionType = optionType;
  }

  public SubscriptionOption offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Get offerType
   * @return offerType
  **/
  public OfferTypeEnum getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionOption subscriptionOption = (SubscriptionOption) o;
    return Objects.equals(id, subscriptionOption.id) &&
        Objects.equals(active, subscriptionOption.active) &&
        Objects.equals(valid, subscriptionOption.valid) &&
        Objects.equals(name, subscriptionOption.name) &&
        Objects.equals(price, subscriptionOption.price) &&
        Objects.equals(quantity, subscriptionOption.quantity) &&
        Objects.equals(threshold, subscriptionOption.threshold) &&
        Objects.equals(visible, subscriptionOption.visible) &&
        Objects.equals(optionType, subscriptionOption.optionType) &&
        Objects.equals(offerType, subscriptionOption.offerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, price, quantity, threshold, visible, optionType, offerType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
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

