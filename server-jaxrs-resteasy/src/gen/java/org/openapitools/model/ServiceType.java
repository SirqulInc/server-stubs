package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Address;
import org.openapitools.model.ModelLocalTime;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ServiceType   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Retailer business;
  private ServiceHub hub;
  private String name;
  private Long additionalLoadTime;
  private Address pickupAddressOverride;
  private Address dropoffAddressOverride;
  private ModelLocalTime pickupStartTimeOverride;
  private ModelLocalTime pickupEndTimeOverride;
  private ModelLocalTime dropoffStartTimeOverride;
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
    private String value;

    DateOverrideEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private DateOverrideEnum dateOverride;

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
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("business")
  @Valid
  public Retailer getBusiness() {
    return business;
  }
  public void setBusiness(Retailer business) {
    this.business = business;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hub")
  @Valid
  public ServiceHub getHub() {
    return hub;
  }
  public void setHub(ServiceHub hub) {
    this.hub = hub;
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
  @JsonProperty("additionalLoadTime")
  public Long getAdditionalLoadTime() {
    return additionalLoadTime;
  }
  public void setAdditionalLoadTime(Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickupAddressOverride")
  @Valid
  public Address getPickupAddressOverride() {
    return pickupAddressOverride;
  }
  public void setPickupAddressOverride(Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropoffAddressOverride")
  @Valid
  public Address getDropoffAddressOverride() {
    return dropoffAddressOverride;
  }
  public void setDropoffAddressOverride(Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickupStartTimeOverride")
  @Valid
  public ModelLocalTime getPickupStartTimeOverride() {
    return pickupStartTimeOverride;
  }
  public void setPickupStartTimeOverride(ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pickupEndTimeOverride")
  @Valid
  public ModelLocalTime getPickupEndTimeOverride() {
    return pickupEndTimeOverride;
  }
  public void setPickupEndTimeOverride(ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropoffStartTimeOverride")
  @Valid
  public ModelLocalTime getDropoffStartTimeOverride() {
    return dropoffStartTimeOverride;
  }
  public void setDropoffStartTimeOverride(ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dropoffEndTimeOverride")
  @Valid
  public ModelLocalTime getDropoffEndTimeOverride() {
    return dropoffEndTimeOverride;
  }
  public void setDropoffEndTimeOverride(ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dateOverride")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

