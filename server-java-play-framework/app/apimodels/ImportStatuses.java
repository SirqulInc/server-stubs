package apimodels;

import apimodels.ShipmentImportStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ImportStatuses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ImportStatuses   {
  @JsonProperty("statuses")
  @Valid

  private List<@Valid ShipmentImportStatus> statuses = null;

  public ImportStatuses statuses(List<@Valid ShipmentImportStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ImportStatuses addStatusesItem(ShipmentImportStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  public List<@Valid ShipmentImportStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid ShipmentImportStatus> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportStatuses importStatuses = (ImportStatuses) o;
    return Objects.equals(statuses, importStatuses.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportStatuses {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

