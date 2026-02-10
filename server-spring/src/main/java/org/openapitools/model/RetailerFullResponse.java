package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.ContactInfoResponse;
import org.openapitools.model.ProfileShortResponse;
import org.openapitools.model.RetailerCountResponse;
import org.openapitools.model.RetailerLocationShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RetailerFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RetailerFullResponse {

  private @Nullable Long retailerId;

  private @Nullable String name;

  private @Nullable String facebookUrl;

  private @Nullable String twitterUrl;

  private @Nullable Boolean active;

  private @Nullable ContactInfoResponse contact;

  private @Nullable AssetShortResponse logo;

  private @Nullable AssetShortResponse picture1;

  private @Nullable AssetShortResponse picture2;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String visibility;

  private @Nullable ProfileShortResponse responsible;

  private @Nullable ProfileShortResponse manager;

  private @Nullable BillableEntityResponse billableEntity;

  private @Nullable RetailerCountResponse counts;

  @Valid
  private List<@Valid RetailerLocationShortResponse> locations = new ArrayList<>();

  public RetailerFullResponse retailerId(@Nullable Long retailerId) {
    this.retailerId = retailerId;
    return this;
  }

  /**
   * Get retailerId
   * @return retailerId
   */
  
  @Schema(name = "retailerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerId")
  public @Nullable Long getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(@Nullable Long retailerId) {
    this.retailerId = retailerId;
  }

  public RetailerFullResponse name(@Nullable String name) {
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

  public RetailerFullResponse facebookUrl(@Nullable String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

  /**
   * Get facebookUrl
   * @return facebookUrl
   */
  
  @Schema(name = "facebookUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebookUrl")
  public @Nullable String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(@Nullable String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public RetailerFullResponse twitterUrl(@Nullable String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

  /**
   * Get twitterUrl
   * @return twitterUrl
   */
  
  @Schema(name = "twitterUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitterUrl")
  public @Nullable String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(@Nullable String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }

  public RetailerFullResponse active(@Nullable Boolean active) {
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

  public RetailerFullResponse contact(@Nullable ContactInfoResponse contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @Valid 
  @Schema(name = "contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contact")
  public @Nullable ContactInfoResponse getContact() {
    return contact;
  }

  public void setContact(@Nullable ContactInfoResponse contact) {
    this.contact = contact;
  }

  public RetailerFullResponse logo(@Nullable AssetShortResponse logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @Valid 
  @Schema(name = "logo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logo")
  public @Nullable AssetShortResponse getLogo() {
    return logo;
  }

  public void setLogo(@Nullable AssetShortResponse logo) {
    this.logo = logo;
  }

  public RetailerFullResponse picture1(@Nullable AssetShortResponse picture1) {
    this.picture1 = picture1;
    return this;
  }

  /**
   * Get picture1
   * @return picture1
   */
  @Valid 
  @Schema(name = "picture1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture1")
  public @Nullable AssetShortResponse getPicture1() {
    return picture1;
  }

  public void setPicture1(@Nullable AssetShortResponse picture1) {
    this.picture1 = picture1;
  }

  public RetailerFullResponse picture2(@Nullable AssetShortResponse picture2) {
    this.picture2 = picture2;
    return this;
  }

  /**
   * Get picture2
   * @return picture2
   */
  @Valid 
  @Schema(name = "picture2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture2")
  public @Nullable AssetShortResponse getPicture2() {
    return picture2;
  }

  public void setPicture2(@Nullable AssetShortResponse picture2) {
    this.picture2 = picture2;
  }

  public RetailerFullResponse latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public RetailerFullResponse longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public RetailerFullResponse visibility(@Nullable String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable String getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable String visibility) {
    this.visibility = visibility;
  }

  public RetailerFullResponse responsible(@Nullable ProfileShortResponse responsible) {
    this.responsible = responsible;
    return this;
  }

  /**
   * Get responsible
   * @return responsible
   */
  @Valid 
  @Schema(name = "responsible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responsible")
  public @Nullable ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(@Nullable ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public RetailerFullResponse manager(@Nullable ProfileShortResponse manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   */
  @Valid 
  @Schema(name = "manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manager")
  public @Nullable ProfileShortResponse getManager() {
    return manager;
  }

  public void setManager(@Nullable ProfileShortResponse manager) {
    this.manager = manager;
  }

  public RetailerFullResponse billableEntity(@Nullable BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntityResponse getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntityResponse billableEntity) {
    this.billableEntity = billableEntity;
  }

  public RetailerFullResponse counts(@Nullable RetailerCountResponse counts) {
    this.counts = counts;
    return this;
  }

  /**
   * Get counts
   * @return counts
   */
  @Valid 
  @Schema(name = "counts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("counts")
  public @Nullable RetailerCountResponse getCounts() {
    return counts;
  }

  public void setCounts(@Nullable RetailerCountResponse counts) {
    this.counts = counts;
  }

  public RetailerFullResponse locations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
    return this;
  }

  public RetailerFullResponse addLocationsItem(RetailerLocationShortResponse locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   * @return locations
   */
  @Valid 
  @Schema(name = "locations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locations")
  public List<@Valid RetailerLocationShortResponse> getLocations() {
    return locations;
  }

  public void setLocations(List<@Valid RetailerLocationShortResponse> locations) {
    this.locations = locations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetailerFullResponse retailerFullResponse = (RetailerFullResponse) o;
    return Objects.equals(this.retailerId, retailerFullResponse.retailerId) &&
        Objects.equals(this.name, retailerFullResponse.name) &&
        Objects.equals(this.facebookUrl, retailerFullResponse.facebookUrl) &&
        Objects.equals(this.twitterUrl, retailerFullResponse.twitterUrl) &&
        Objects.equals(this.active, retailerFullResponse.active) &&
        Objects.equals(this.contact, retailerFullResponse.contact) &&
        Objects.equals(this.logo, retailerFullResponse.logo) &&
        Objects.equals(this.picture1, retailerFullResponse.picture1) &&
        Objects.equals(this.picture2, retailerFullResponse.picture2) &&
        Objects.equals(this.latitude, retailerFullResponse.latitude) &&
        Objects.equals(this.longitude, retailerFullResponse.longitude) &&
        Objects.equals(this.visibility, retailerFullResponse.visibility) &&
        Objects.equals(this.responsible, retailerFullResponse.responsible) &&
        Objects.equals(this.manager, retailerFullResponse.manager) &&
        Objects.equals(this.billableEntity, retailerFullResponse.billableEntity) &&
        Objects.equals(this.counts, retailerFullResponse.counts) &&
        Objects.equals(this.locations, retailerFullResponse.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailerId, name, facebookUrl, twitterUrl, active, contact, logo, picture1, picture2, latitude, longitude, visibility, responsible, manager, billableEntity, counts, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailerFullResponse {\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    picture1: ").append(toIndentedString(picture1)).append("\n");
    sb.append("    picture2: ").append(toIndentedString(picture2)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

