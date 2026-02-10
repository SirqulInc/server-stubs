package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ApplicationShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferTransactionStatusResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Integer code;

  @ApiModelProperty(value = "")

  private String role;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ApplicationShortResponse> applications = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OfferTransactionStatusResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public OfferTransactionStatusResponse active(Boolean active) {
    this.active = active;
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

  public OfferTransactionStatusResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfferTransactionStatusResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public OfferTransactionStatusResponse code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public OfferTransactionStatusResponse role(String role) {
    this.role = role;
    return this;
  }

 /**
   * Get applications
   * @return applications
  **/
  @JsonProperty("applications")
  public List<@Valid ApplicationShortResponse> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
  }

  public OfferTransactionStatusResponse applications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
    return this;
  }

  public OfferTransactionStatusResponse addApplicationsItem(ApplicationShortResponse applicationsItem) {
    this.applications.add(applicationsItem);
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
    OfferTransactionStatusResponse offerTransactionStatusResponse = (OfferTransactionStatusResponse) o;
    return Objects.equals(this.id, offerTransactionStatusResponse.id) &&
        Objects.equals(this.active, offerTransactionStatusResponse.active) &&
        Objects.equals(this.name, offerTransactionStatusResponse.name) &&
        Objects.equals(this.description, offerTransactionStatusResponse.description) &&
        Objects.equals(this.code, offerTransactionStatusResponse.code) &&
        Objects.equals(this.role, offerTransactionStatusResponse.role) &&
        Objects.equals(this.applications, offerTransactionStatusResponse.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name, description, code, role, applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferTransactionStatusResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

