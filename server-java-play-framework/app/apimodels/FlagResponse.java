package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FlagResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FlagResponse   {
  @JsonProperty("flagId")
  
  private Long flagId;

  @JsonProperty("flagableId")
  
  private Long flagableId;

  @JsonProperty("flagableType")
  
  private String flagableType;

  @JsonProperty("flagDescription")
  
  private String flagDescription;

  @JsonProperty("createdDate")
  
  private Long createdDate;

  @JsonProperty("updatedDate")
  
  private Long updatedDate;

  public FlagResponse flagId(Long flagId) {
    this.flagId = flagId;
    return this;
  }

   /**
   * Get flagId
   * @return flagId
  **/
  public Long getFlagId() {
    return flagId;
  }

  public void setFlagId(Long flagId) {
    this.flagId = flagId;
  }

  public FlagResponse flagableId(Long flagableId) {
    this.flagableId = flagableId;
    return this;
  }

   /**
   * Get flagableId
   * @return flagableId
  **/
  public Long getFlagableId() {
    return flagableId;
  }

  public void setFlagableId(Long flagableId) {
    this.flagableId = flagableId;
  }

  public FlagResponse flagableType(String flagableType) {
    this.flagableType = flagableType;
    return this;
  }

   /**
   * Get flagableType
   * @return flagableType
  **/
  public String getFlagableType() {
    return flagableType;
  }

  public void setFlagableType(String flagableType) {
    this.flagableType = flagableType;
  }

  public FlagResponse flagDescription(String flagDescription) {
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

  public FlagResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public FlagResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * Get updatedDate
   * @return updatedDate
  **/
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlagResponse flagResponse = (FlagResponse) o;
    return Objects.equals(flagId, flagResponse.flagId) &&
        Objects.equals(flagableId, flagResponse.flagableId) &&
        Objects.equals(flagableType, flagResponse.flagableType) &&
        Objects.equals(flagDescription, flagResponse.flagDescription) &&
        Objects.equals(createdDate, flagResponse.createdDate) &&
        Objects.equals(updatedDate, flagResponse.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagId, flagableId, flagableType, flagDescription, createdDate, updatedDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagResponse {\n");
    
    sb.append("    flagId: ").append(toIndentedString(flagId)).append("\n");
    sb.append("    flagableId: ").append(toIndentedString(flagableId)).append("\n");
    sb.append("    flagableType: ").append(toIndentedString(flagableType)).append("\n");
    sb.append("    flagDescription: ").append(toIndentedString(flagDescription)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

