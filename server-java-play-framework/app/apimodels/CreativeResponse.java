package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AssetShortResponse;
import apimodels.BidResponse;
import apimodels.JsonElement;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreativeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreativeResponse   {
  @JsonProperty("creativeId")
  
  private Long creativeId;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("image")
  @Valid

  private AssetShortResponse image;

  @JsonProperty("action")
  
  private String action;

  @JsonProperty("content")
  @Valid

  private JsonElement content;

  @JsonProperty("suffix")
  
  private String suffix;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("appVersion")
  
  private String appVersion;

  @JsonProperty("preview")
  
  private Boolean preview;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("currentBid")
  @Valid

  private BidResponse currentBid;

  public CreativeResponse creativeId(Long creativeId) {
    this.creativeId = creativeId;
    return this;
  }

   /**
   * Get creativeId
   * @return creativeId
  **/
  public Long getCreativeId() {
    return creativeId;
  }

  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }

  public CreativeResponse active(Boolean active) {
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

  public CreativeResponse name(String name) {
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

  public CreativeResponse description(String description) {
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

  public CreativeResponse image(AssetShortResponse image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  public AssetShortResponse getImage() {
    return image;
  }

  public void setImage(AssetShortResponse image) {
    this.image = image;
  }

  public CreativeResponse action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public CreativeResponse content(JsonElement content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public JsonElement getContent() {
    return content;
  }

  public void setContent(JsonElement content) {
    this.content = content;
  }

  public CreativeResponse suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public CreativeResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreativeResponse appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public CreativeResponse preview(Boolean preview) {
    this.preview = preview;
    return this;
  }

   /**
   * Get preview
   * @return preview
  **/
  public Boolean getPreview() {
    return preview;
  }

  public void setPreview(Boolean preview) {
    this.preview = preview;
  }

  public CreativeResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public CreativeResponse currentBid(BidResponse currentBid) {
    this.currentBid = currentBid;
    return this;
  }

   /**
   * Get currentBid
   * @return currentBid
  **/
  public BidResponse getCurrentBid() {
    return currentBid;
  }

  public void setCurrentBid(BidResponse currentBid) {
    this.currentBid = currentBid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeResponse creativeResponse = (CreativeResponse) o;
    return Objects.equals(creativeId, creativeResponse.creativeId) &&
        Objects.equals(active, creativeResponse.active) &&
        Objects.equals(name, creativeResponse.name) &&
        Objects.equals(description, creativeResponse.description) &&
        Objects.equals(image, creativeResponse.image) &&
        Objects.equals(action, creativeResponse.action) &&
        Objects.equals(content, creativeResponse.content) &&
        Objects.equals(suffix, creativeResponse.suffix) &&
        Objects.equals(type, creativeResponse.type) &&
        Objects.equals(appVersion, creativeResponse.appVersion) &&
        Objects.equals(preview, creativeResponse.preview) &&
        Objects.equals(owner, creativeResponse.owner) &&
        Objects.equals(currentBid, creativeResponse.currentBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeId, active, name, description, image, action, content, suffix, type, appVersion, preview, owner, currentBid);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeResponse {\n");
    
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    currentBid: ").append(toIndentedString(currentBid)).append("\n");
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

