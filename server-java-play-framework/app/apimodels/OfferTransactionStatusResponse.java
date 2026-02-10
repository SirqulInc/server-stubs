package apimodels;

import apimodels.ApplicationShortResponse;
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
 * OfferTransactionStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferTransactionStatusResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("code")
  
  private Integer code;

  @JsonProperty("role")
  
  private String role;

  @JsonProperty("applications")
  @Valid

  private List<@Valid ApplicationShortResponse> applications = null;

  public OfferTransactionStatusResponse id(Long id) {
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

  public OfferTransactionStatusResponse active(Boolean active) {
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

  public OfferTransactionStatusResponse name(String name) {
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

  public OfferTransactionStatusResponse description(String description) {
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

  public OfferTransactionStatusResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public OfferTransactionStatusResponse role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public OfferTransactionStatusResponse applications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
    return this;
  }

  public OfferTransactionStatusResponse addApplicationsItem(ApplicationShortResponse applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  public List<@Valid ApplicationShortResponse> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid ApplicationShortResponse> applications) {
    this.applications = applications;
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
    return Objects.equals(id, offerTransactionStatusResponse.id) &&
        Objects.equals(active, offerTransactionStatusResponse.active) &&
        Objects.equals(name, offerTransactionStatusResponse.name) &&
        Objects.equals(description, offerTransactionStatusResponse.description) &&
        Objects.equals(code, offerTransactionStatusResponse.code) &&
        Objects.equals(role, offerTransactionStatusResponse.role) &&
        Objects.equals(applications, offerTransactionStatusResponse.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name, description, code, role, applications);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

