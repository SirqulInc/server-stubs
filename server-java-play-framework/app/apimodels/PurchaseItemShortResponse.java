package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PurchaseItemShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PurchaseItemShortResponse   {
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

  public PurchaseItemShortResponse id(Long id) {
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

  public PurchaseItemShortResponse name(String name) {
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

  public PurchaseItemShortResponse description(String description) {
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

  public PurchaseItemShortResponse tickets(Integer tickets) {
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

  public PurchaseItemShortResponse coverAsset(AssetShortResponse coverAsset) {
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

  public PurchaseItemShortResponse promoAsset(AssetShortResponse promoAsset) {
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

  public PurchaseItemShortResponse giftable(Boolean giftable) {
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

  public PurchaseItemShortResponse assetable(Boolean assetable) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseItemShortResponse purchaseItemShortResponse = (PurchaseItemShortResponse) o;
    return Objects.equals(id, purchaseItemShortResponse.id) &&
        Objects.equals(name, purchaseItemShortResponse.name) &&
        Objects.equals(description, purchaseItemShortResponse.description) &&
        Objects.equals(tickets, purchaseItemShortResponse.tickets) &&
        Objects.equals(coverAsset, purchaseItemShortResponse.coverAsset) &&
        Objects.equals(promoAsset, purchaseItemShortResponse.promoAsset) &&
        Objects.equals(giftable, purchaseItemShortResponse.giftable) &&
        Objects.equals(assetable, purchaseItemShortResponse.assetable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tickets, coverAsset, promoAsset, giftable, assetable);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

