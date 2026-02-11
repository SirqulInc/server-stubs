package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * PurchaseItemShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseItemShortResponse {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Integer tickets;

  private @Nullable AssetShortResponse coverAsset;

  private @Nullable AssetShortResponse promoAsset;

  private @Nullable Boolean giftable;

  private @Nullable Boolean assetable;

  public PurchaseItemShortResponse id(@Nullable Long id) {
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

  public PurchaseItemShortResponse name(@Nullable String name) {
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

  public PurchaseItemShortResponse description(@Nullable String description) {
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

  public PurchaseItemShortResponse tickets(@Nullable Integer tickets) {
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

  public PurchaseItemShortResponse coverAsset(@Nullable AssetShortResponse coverAsset) {
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

  public PurchaseItemShortResponse promoAsset(@Nullable AssetShortResponse promoAsset) {
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

  public PurchaseItemShortResponse giftable(@Nullable Boolean giftable) {
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

  public PurchaseItemShortResponse assetable(@Nullable Boolean assetable) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseItemShortResponse purchaseItemShortResponse = (PurchaseItemShortResponse) o;
    return Objects.equals(this.id, purchaseItemShortResponse.id) &&
        Objects.equals(this.name, purchaseItemShortResponse.name) &&
        Objects.equals(this.description, purchaseItemShortResponse.description) &&
        Objects.equals(this.tickets, purchaseItemShortResponse.tickets) &&
        Objects.equals(this.coverAsset, purchaseItemShortResponse.coverAsset) &&
        Objects.equals(this.promoAsset, purchaseItemShortResponse.promoAsset) &&
        Objects.equals(this.giftable, purchaseItemShortResponse.giftable) &&
        Objects.equals(this.assetable, purchaseItemShortResponse.assetable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tickets, coverAsset, promoAsset, giftable, assetable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseItemShortResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    coverAsset: ").append(toIndentedString(coverAsset)).append("\n");
    sb.append("    promoAsset: ").append(toIndentedString(promoAsset)).append("\n");
    sb.append("    giftable: ").append(toIndentedString(giftable)).append("\n");
    sb.append("    assetable: ").append(toIndentedString(assetable)).append("\n");
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

