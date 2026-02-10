package org.openapitools.model;

import org.openapitools.model.ProfileShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillableEntityShortResponse  {
  
  @ApiModelProperty(value = "")

  private Long billableEntityId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private ProfileShortResponse responsible;
 /**
   * Get billableEntityId
   * @return billableEntityId
  **/
  @JsonProperty("billableEntityId")
  public Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public BillableEntityShortResponse billableEntityId(Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillableEntityShortResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get responsible
   * @return responsible
  **/
  @JsonProperty("responsible")
  public ProfileShortResponse getResponsible() {
    return responsible;
  }

  public void setResponsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
  }

  public BillableEntityShortResponse responsible(ProfileShortResponse responsible) {
    this.responsible = responsible;
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
    BillableEntityShortResponse billableEntityShortResponse = (BillableEntityShortResponse) o;
    return Objects.equals(this.billableEntityId, billableEntityShortResponse.billableEntityId) &&
        Objects.equals(this.name, billableEntityShortResponse.name) &&
        Objects.equals(this.responsible, billableEntityShortResponse.responsible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableEntityId, name, responsible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableEntityShortResponse {\n");
    
    sb.append("    billableEntityId: ").append(toIndentedString(billableEntityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
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

