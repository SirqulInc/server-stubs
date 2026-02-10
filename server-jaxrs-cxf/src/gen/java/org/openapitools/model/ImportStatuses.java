package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ShipmentImportStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImportStatuses  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ShipmentImportStatus> statuses = new ArrayList<>();
 /**
   * Get statuses
   * @return statuses
  **/
  @JsonProperty("statuses")
  public List<@Valid ShipmentImportStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid ShipmentImportStatus> statuses) {
    this.statuses = statuses;
  }

  public ImportStatuses statuses(List<@Valid ShipmentImportStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public ImportStatuses addStatusesItem(ShipmentImportStatus statusesItem) {
    this.statuses.add(statusesItem);
    return this;
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
    return Objects.equals(this.statuses, importStatuses.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

