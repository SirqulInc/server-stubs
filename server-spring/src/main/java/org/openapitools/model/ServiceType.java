package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Address;
import org.openapitools.model.ModelLocalTime;
import org.openapitools.model.Retailer;
import org.openapitools.model.ServiceHub;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ServiceType {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Retailer business;

  private @Nullable ServiceHub hub;

  private @Nullable String name;

  private @Nullable Long additionalLoadTime;

  private @Nullable Address pickupAddressOverride;

  private @Nullable Address dropoffAddressOverride;

  private @Nullable ModelLocalTime pickupStartTimeOverride;

  private @Nullable ModelLocalTime pickupEndTimeOverride;

  private @Nullable ModelLocalTime dropoffStartTimeOverride;

  private @Nullable ModelLocalTime dropoffEndTimeOverride;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable DateOverrideEnum dateOverride;

  public ServiceType id(@Nullable Long id) {
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

  public ServiceType active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ServiceType valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public ServiceType business(@Nullable Retailer business) {
    this.business = business;
    return this;
  }

  /**
   * Get business
   * @return business
   */
  @Valid 
  @Schema(name = "business", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business")
  public @Nullable Retailer getBusiness() {
    return business;
  }

  public void setBusiness(@Nullable Retailer business) {
    this.business = business;
  }

  public ServiceType hub(@Nullable ServiceHub hub) {
    this.hub = hub;
    return this;
  }

  /**
   * Get hub
   * @return hub
   */
  @Valid 
  @Schema(name = "hub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hub")
  public @Nullable ServiceHub getHub() {
    return hub;
  }

  public void setHub(@Nullable ServiceHub hub) {
    this.hub = hub;
  }

  public ServiceType name(@Nullable String name) {
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

  public ServiceType additionalLoadTime(@Nullable Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
    return this;
  }

  /**
   * Get additionalLoadTime
   * @return additionalLoadTime
   */
  
  @Schema(name = "additionalLoadTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalLoadTime")
  public @Nullable Long getAdditionalLoadTime() {
    return additionalLoadTime;
  }

  public void setAdditionalLoadTime(@Nullable Long additionalLoadTime) {
    this.additionalLoadTime = additionalLoadTime;
  }

  public ServiceType pickupAddressOverride(@Nullable Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
    return this;
  }

  /**
   * Get pickupAddressOverride
   * @return pickupAddressOverride
   */
  @Valid 
  @Schema(name = "pickupAddressOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupAddressOverride")
  public @Nullable Address getPickupAddressOverride() {
    return pickupAddressOverride;
  }

  public void setPickupAddressOverride(@Nullable Address pickupAddressOverride) {
    this.pickupAddressOverride = pickupAddressOverride;
  }

  public ServiceType dropoffAddressOverride(@Nullable Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
    return this;
  }

  /**
   * Get dropoffAddressOverride
   * @return dropoffAddressOverride
   */
  @Valid 
  @Schema(name = "dropoffAddressOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropoffAddressOverride")
  public @Nullable Address getDropoffAddressOverride() {
    return dropoffAddressOverride;
  }

  public void setDropoffAddressOverride(@Nullable Address dropoffAddressOverride) {
    this.dropoffAddressOverride = dropoffAddressOverride;
  }

  public ServiceType pickupStartTimeOverride(@Nullable ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
    return this;
  }

  /**
   * Get pickupStartTimeOverride
   * @return pickupStartTimeOverride
   */
  @Valid 
  @Schema(name = "pickupStartTimeOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupStartTimeOverride")
  public @Nullable ModelLocalTime getPickupStartTimeOverride() {
    return pickupStartTimeOverride;
  }

  public void setPickupStartTimeOverride(@Nullable ModelLocalTime pickupStartTimeOverride) {
    this.pickupStartTimeOverride = pickupStartTimeOverride;
  }

  public ServiceType pickupEndTimeOverride(@Nullable ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
    return this;
  }

  /**
   * Get pickupEndTimeOverride
   * @return pickupEndTimeOverride
   */
  @Valid 
  @Schema(name = "pickupEndTimeOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupEndTimeOverride")
  public @Nullable ModelLocalTime getPickupEndTimeOverride() {
    return pickupEndTimeOverride;
  }

  public void setPickupEndTimeOverride(@Nullable ModelLocalTime pickupEndTimeOverride) {
    this.pickupEndTimeOverride = pickupEndTimeOverride;
  }

  public ServiceType dropoffStartTimeOverride(@Nullable ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
    return this;
  }

  /**
   * Get dropoffStartTimeOverride
   * @return dropoffStartTimeOverride
   */
  @Valid 
  @Schema(name = "dropoffStartTimeOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropoffStartTimeOverride")
  public @Nullable ModelLocalTime getDropoffStartTimeOverride() {
    return dropoffStartTimeOverride;
  }

  public void setDropoffStartTimeOverride(@Nullable ModelLocalTime dropoffStartTimeOverride) {
    this.dropoffStartTimeOverride = dropoffStartTimeOverride;
  }

  public ServiceType dropoffEndTimeOverride(@Nullable ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
    return this;
  }

  /**
   * Get dropoffEndTimeOverride
   * @return dropoffEndTimeOverride
   */
  @Valid 
  @Schema(name = "dropoffEndTimeOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropoffEndTimeOverride")
  public @Nullable ModelLocalTime getDropoffEndTimeOverride() {
    return dropoffEndTimeOverride;
  }

  public void setDropoffEndTimeOverride(@Nullable ModelLocalTime dropoffEndTimeOverride) {
    this.dropoffEndTimeOverride = dropoffEndTimeOverride;
  }

  public ServiceType dateOverride(@Nullable DateOverrideEnum dateOverride) {
    this.dateOverride = dateOverride;
    return this;
  }

  /**
   * Get dateOverride
   * @return dateOverride
   */
  
  @Schema(name = "dateOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateOverride")
  public @Nullable DateOverrideEnum getDateOverride() {
    return dateOverride;
  }

  public void setDateOverride(@Nullable DateOverrideEnum dateOverride) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

