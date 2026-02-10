package apimodels;

import apimodels.Address;
import apimodels.ModelLocalTime;
import apimodels.Retailer;
import apimodels.ServiceHub;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ServiceType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ServiceType   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("business")
  @Valid

  private Retailer business;

  @JsonProperty("hub")
  @Valid

  private ServiceHub hub;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("additionalLoadTime")
  
  private Long additionalLoadTime;

  @JsonProperty("pickupAddressOverride")
  @Valid

  private Address pickupAddressOverride;

  @JsonProperty("dropoffAddressOverride")
  @Valid

  private Address dropoffAddressOverride;

  @JsonProperty("pickupStartTimeOverride")
  @Valid

  private ModelLocalTime pickupStartTimeOverride;

  @JsonProperty("pickupEndTimeOverride")
  @Valid

  private ModelLocalTime pickupEndTimeOverride;

  @JsonProperty("dropoffStartTimeOverride")
  @Valid

  private ModelLocalTime dropoffStartTimeOverride;

  @JsonProperty("dropoffEndTimeOverride")
  @Valid

  private ModelLocalTime dropoffEndTimeOverride;

  /**
   * Gets or Sets dateOverride
   */
  public enum DateOverrideEnum {
    NONE("NONE"),
    
    PICKUP_START("PICKUP_START"),
    
    PICKUP_END("PICKUP_END"),
    
    DROPOFF_START("DROPOFF_START"),
    
    DROPOFF_END("DROPOFF_END");

    private final String value;

    DateOverrideEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DateOverrideEnum fromValue(String value) {
      for (DateOverrideEnum b : DateOverrideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("dateOverride")
  
  private DateOverrideEnum dateOverride;

  public ServiceType id(Long id) {
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

  public ServiceType active(Boolean active) {
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

  public ServiceType valid(Boolean valid) {
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

  public ServiceType business(Retailer business) {
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  public Retailer getBusiness() {
    return business;
  }

  public void setBusiness(Retailer business) {
    this.business = business;
  }

  public ServiceType hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

   /**
   * Get hub
   * @return hub
  **/
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public ServiceType name(String name) {
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

  public ServiceType additionalLoadTime(Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
    return this;
  }

   /**
   * Get additionalLoadTime
   * @return additionalLoadTime
  **/
  public Long getAdditionalLoadTime() {
    return additionalLoadTime;
  }

  public void setAdditionalLoadTime(Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
  }

  public ServiceType pickupAddressOverride(Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
    return this;
  }

   /**
   * Get pickupAddressOverride
   * @return pickupAddressOverride
  **/
  public Address getPickupAddressOverride() {
    return pickupAddressOverride;
  }

  public void setPickupAddressOverride(Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
  }

  public ServiceType dropoffAddressOverride(Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
    return this;
  }

   /**
   * Get dropoffAddressOverride
   * @return dropoffAddressOverride
  **/
  public Address getDropoffAddressOverride() {
    return dropoffAddressOverride;
  }

  public void setDropoffAddressOverride(Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
  }

  public ServiceType pickupStartTimeOverride(ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
    return this;
  }

   /**
   * Get pickupStartTimeOverride
   * @return pickupStartTimeOverride
  **/
  public ModelLocalTime getPickupStartTimeOverride() {
    return pickupStartTimeOverride;
  }

  public void setPickupStartTimeOverride(ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
  }

  public ServiceType pickupEndTimeOverride(ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
    return this;
  }

   /**
   * Get pickupEndTimeOverride
   * @return pickupEndTimeOverride
  **/
  public ModelLocalTime getPickupEndTimeOverride() {
    return pickupEndTimeOverride;
  }

  public void setPickupEndTimeOverride(ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
  }

  public ServiceType dropoffStartTimeOverride(ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
    return this;
  }

   /**
   * Get dropoffStartTimeOverride
   * @return dropoffStartTimeOverride
  **/
  public ModelLocalTime getDropoffStartTimeOverride() {
    return dropoffStartTimeOverride;
  }

  public void setDropoffStartTimeOverride(ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
  }

  public ServiceType dropoffEndTimeOverride(ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
    return this;
  }

   /**
   * Get dropoffEndTimeOverride
   * @return dropoffEndTimeOverride
  **/
  public ModelLocalTime getDropoffEndTimeOverride() {
    return dropoffEndTimeOverride;
  }

  public void setDropoffEndTimeOverride(ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
  }

  public ServiceType dateOverride(DateOverrideEnum dateOverride) {
    this.dateOverride = dateOverride;
    return this;
  }

   /**
   * Get dateOverride
   * @return dateOverride
  **/
  public DateOverrideEnum getDateOverride() {
    return dateOverride;
  }

  public void setDateOverride(DateOverrideEnum dateOverride) {
    this.dateOverride = dateOverride;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceType serviceType = (ServiceType) o;
    return Objects.equals(id, serviceType.id) &&
        Objects.equals(active, serviceType.active) &&
        Objects.equals(valid, serviceType.valid) &&
        Objects.equals(business, serviceType.business) &&
        Objects.equals(hub, serviceType.hub) &&
        Objects.equals(name, serviceType.name) &&
        Objects.equals(additionalLoadTime, serviceType.additionalLoadTime) &&
        Objects.equals(pickupAddressOverride, serviceType.pickupAddressOverride) &&
        Objects.equals(dropoffAddressOverride, serviceType.dropoffAddressOverride) &&
        Objects.equals(pickupStartTimeOverride, serviceType.pickupStartTimeOverride) &&
        Objects.equals(pickupEndTimeOverride, serviceType.pickupEndTimeOverride) &&
        Objects.equals(dropoffStartTimeOverride, serviceType.dropoffStartTimeOverride) &&
        Objects.equals(dropoffEndTimeOverride, serviceType.dropoffEndTimeOverride) &&
        Objects.equals(dateOverride, serviceType.dateOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, business, hub, name, additionalLoadTime, pickupAddressOverride, dropoffAddressOverride, pickupStartTimeOverride, pickupEndTimeOverride, dropoffStartTimeOverride, dropoffEndTimeOverride, dateOverride);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    additionalLoadTime: ").append(toIndentedString(additionalLoadTime)).append("\n");
    sb.append("    pickupAddressOverride: ").append(toIndentedString(pickupAddressOverride)).append("\n");
    sb.append("    dropoffAddressOverride: ").append(toIndentedString(dropoffAddressOverride)).append("\n");
    sb.append("    pickupStartTimeOverride: ").append(toIndentedString(pickupStartTimeOverride)).append("\n");
    sb.append("    pickupEndTimeOverride: ").append(toIndentedString(pickupEndTimeOverride)).append("\n");
    sb.append("    dropoffStartTimeOverride: ").append(toIndentedString(dropoffStartTimeOverride)).append("\n");
    sb.append("    dropoffEndTimeOverride: ").append(toIndentedString(dropoffEndTimeOverride)).append("\n");
    sb.append("    dateOverride: ").append(toIndentedString(dateOverride)).append("\n");
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

