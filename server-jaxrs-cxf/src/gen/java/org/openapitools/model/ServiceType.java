package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Address;
import org.openapitools.model.ModelLocalTime;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ServiceType  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Retailer business;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Long additionalLoadTime;

  @ApiModelProperty(value = "")

  @Valid

  private Address pickupAddressOverride;

  @ApiModelProperty(value = "")

  @Valid

  private Address dropoffAddressOverride;

  @ApiModelProperty(value = "")

  @Valid

  private ModelLocalTime pickupStartTimeOverride;

  @ApiModelProperty(value = "")

  @Valid

  private ModelLocalTime pickupEndTimeOverride;

  @ApiModelProperty(value = "")

  @Valid

  private ModelLocalTime dropoffStartTimeOverride;

  @ApiModelProperty(value = "")

  @Valid

  private ModelLocalTime dropoffEndTimeOverride;

public enum DateOverrideEnum {

NONE(String.valueOf("NONE")), PICKUP_START(String.valueOf("PICKUP_START")), PICKUP_END(String.valueOf("PICKUP_END")), DROPOFF_START(String.valueOf("DROPOFF_START")), DROPOFF_END(String.valueOf("DROPOFF_END"));


    private String value;

    DateOverrideEnum (String v) {
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
    public static DateOverrideEnum fromValue(String value) {
        for (DateOverrideEnum b : DateOverrideEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private DateOverrideEnum dateOverride;
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

  public ServiceType id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ServiceType active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ServiceType valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get business
   * @return business
  **/
  @JsonProperty("business")
  public Retailer getBusiness() {
    return business;
  }

  public void setBusiness(Retailer business) {
    this.business = business;
  }

  public ServiceType business(Retailer business) {
    this.business = business;
    return this;
  }

 /**
   * Get hub
   * @return hub
  **/
  @JsonProperty("hub")
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public ServiceType hub(ServiceHub hub) {
    this.hub = hub;
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

  public ServiceType name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get additionalLoadTime
   * @return additionalLoadTime
  **/
  @JsonProperty("additionalLoadTime")
  public Long getAdditionalLoadTime() {
    return additionalLoadTime;
  }

  public void setAdditionalLoadTime(Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
  }

  public ServiceType additionalLoadTime(Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
    return this;
  }

 /**
   * Get pickupAddressOverride
   * @return pickupAddressOverride
  **/
  @JsonProperty("pickupAddressOverride")
  public Address getPickupAddressOverride() {
    return pickupAddressOverride;
  }

  public void setPickupAddressOverride(Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
  }

  public ServiceType pickupAddressOverride(Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
    return this;
  }

 /**
   * Get dropoffAddressOverride
   * @return dropoffAddressOverride
  **/
  @JsonProperty("dropoffAddressOverride")
  public Address getDropoffAddressOverride() {
    return dropoffAddressOverride;
  }

  public void setDropoffAddressOverride(Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
  }

  public ServiceType dropoffAddressOverride(Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
    return this;
  }

 /**
   * Get pickupStartTimeOverride
   * @return pickupStartTimeOverride
  **/
  @JsonProperty("pickupStartTimeOverride")
  public ModelLocalTime getPickupStartTimeOverride() {
    return pickupStartTimeOverride;
  }

  public void setPickupStartTimeOverride(ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
  }

  public ServiceType pickupStartTimeOverride(ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
    return this;
  }

 /**
   * Get pickupEndTimeOverride
   * @return pickupEndTimeOverride
  **/
  @JsonProperty("pickupEndTimeOverride")
  public ModelLocalTime getPickupEndTimeOverride() {
    return pickupEndTimeOverride;
  }

  public void setPickupEndTimeOverride(ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
  }

  public ServiceType pickupEndTimeOverride(ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
    return this;
  }

 /**
   * Get dropoffStartTimeOverride
   * @return dropoffStartTimeOverride
  **/
  @JsonProperty("dropoffStartTimeOverride")
  public ModelLocalTime getDropoffStartTimeOverride() {
    return dropoffStartTimeOverride;
  }

  public void setDropoffStartTimeOverride(ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
  }

  public ServiceType dropoffStartTimeOverride(ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
    return this;
  }

 /**
   * Get dropoffEndTimeOverride
   * @return dropoffEndTimeOverride
  **/
  @JsonProperty("dropoffEndTimeOverride")
  public ModelLocalTime getDropoffEndTimeOverride() {
    return dropoffEndTimeOverride;
  }

  public void setDropoffEndTimeOverride(ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
  }

  public ServiceType dropoffEndTimeOverride(ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
    return this;
  }

 /**
   * Get dateOverride
   * @return dateOverride
  **/
  @JsonProperty("dateOverride")
  public String getDateOverride() {
    if (dateOverride == null) {
      return null;
    }
    return dateOverride.value();
  }

  public void setDateOverride(DateOverrideEnum dateOverride) {
    this.dateOverride = dateOverride;
  }

  public ServiceType dateOverride(DateOverrideEnum dateOverride) {
    this.dateOverride = dateOverride;
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
    ServiceType serviceType = (ServiceType) o;
    return Objects.equals(this.id, serviceType.id) &&
        Objects.equals(this.active, serviceType.active) &&
        Objects.equals(this.valid, serviceType.valid) &&
        Objects.equals(this.business, serviceType.business) &&
        Objects.equals(this.hub, serviceType.hub) &&
        Objects.equals(this.name, serviceType.name) &&
        Objects.equals(this.additionalLoadTime, serviceType.additionalLoadTime) &&
        Objects.equals(this.pickupAddressOverride, serviceType.pickupAddressOverride) &&
        Objects.equals(this.dropoffAddressOverride, serviceType.dropoffAddressOverride) &&
        Objects.equals(this.pickupStartTimeOverride, serviceType.pickupStartTimeOverride) &&
        Objects.equals(this.pickupEndTimeOverride, serviceType.pickupEndTimeOverride) &&
        Objects.equals(this.dropoffStartTimeOverride, serviceType.dropoffStartTimeOverride) &&
        Objects.equals(this.dropoffEndTimeOverride, serviceType.dropoffEndTimeOverride) &&
        Objects.equals(this.dateOverride, serviceType.dateOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, business, hub, name, additionalLoadTime, pickupAddressOverride, dropoffAddressOverride, pickupStartTimeOverride, pickupEndTimeOverride, dropoffStartTimeOverride, dropoffEndTimeOverride, dateOverride);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

