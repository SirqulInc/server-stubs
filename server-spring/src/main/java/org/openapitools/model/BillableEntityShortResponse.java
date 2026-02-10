package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ProfileShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillableEntityShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillableEntityShortResponse {

  private @Nullable Long billableEntityId;

  private @Nullable String name;

  private @Nullable ProfileShortResponse responsible;

  public BillableEntityShortResponse billableEntityId(@Nullable Long billableEntityId) {
    this.billableEntityId = billableEntityId;
    return this;
  }

  /**
   * Get billableEntityId
   * @return billableEntityId
   */
  
  @Schema(name = "billableEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntityId")
  public @Nullable Long getBillableEntityId() {
    return billableEntityId;
  }

  public void setBillableEntityId(@Nullable Long billableEntityId) {
    this.billableEntityId = billableEntityId;
  }

  public BillableEntityShortResponse name(@Nullable String name) {
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

  public BillableEntityShortResponse responsible(@Nullable ProfileShortResponse responsible) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

