package apimodels;

import apimodels.Account;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Flag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Flag   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("owner")
  @Valid

  private Account owner;

  @JsonProperty("flagableObjectType")
  
  private String flagableObjectType;

  @JsonProperty("flagableObjectId")
  
  private Long flagableObjectId;

  @JsonProperty("flagDescription")
  
  private String flagDescription;

  @JsonProperty("app")
  
  private String app;

  public Flag id(Long id) {
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

  public Flag active(Boolean active) {
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

  public Flag valid(Boolean valid) {
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

  public Flag owner(Account owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Flag flagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
    return this;
  }

   /**
   * Get flagableObjectType
   * @return flagableObjectType
  **/
  public String getFlagableObjectType() {
    return flagableObjectType;
  }

  public void setFlagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
  }

  public Flag flagableObjectId(Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
    return this;
  }

   /**
   * Get flagableObjectId
   * @return flagableObjectId
  **/
  public Long getFlagableObjectId() {
    return flagableObjectId;
  }

  public void setFlagableObjectId(Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
  }

  public Flag flagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
    return this;
  }

   /**
   * Get flagDescription
   * @return flagDescription
  **/
  public String getFlagDescription() {
    return flagDescription;
  }

  public void setFlagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
  }

  public Flag app(String app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flag flag = (Flag) o;
    return Objects.equals(id, flag.id) &&
        Objects.equals(active, flag.active) &&
        Objects.equals(valid, flag.valid) &&
        Objects.equals(owner, flag.owner) &&
        Objects.equals(flagableObjectType, flag.flagableObjectType) &&
        Objects.equals(flagableObjectId, flag.flagableObjectId) &&
        Objects.equals(flagDescription, flag.flagDescription) &&
        Objects.equals(app, flag.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, flagableObjectType, flagableObjectId, flagDescription, app);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    flagableObjectType: ").append(toIndentedString(flagableObjectType)).append("\n");
    sb.append("    flagableObjectId: ").append(toIndentedString(flagableObjectId)).append("\n");
    sb.append("    flagDescription: ").append(toIndentedString(flagDescription)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

