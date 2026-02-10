package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PurchaseItemShortResponse   {
  
  private Long id;
  private String name;
  private String description;
  private Integer tickets;
  private AssetShortResponse coverAsset;
  private AssetShortResponse promoAsset;
  private Boolean giftable;
  private Boolean assetable;

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

