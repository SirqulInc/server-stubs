package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.ParticipantResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListingFullResponse   {
  
  private Long id;
  private String name;
  private String description;
  private Long start;
  private Long end;
  private String locationName;
  private String locationDescription;
  private Boolean privateListing;
  private Boolean active;
  private List<@Valid ParticipantResponse> participants = new ArrayList<>();
  private AccountShortResponse owner;
  private List<@Valid FilterResponse> filters = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }
  public void setStart(Long start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  public Long getEnd() {
    return end;
  }
  public void setEnd(Long end) {
    this.end = end;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationName")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("privateListing")
  public Boolean getPrivateListing() {
    return privateListing;
  }
  public void setPrivateListing(Boolean privateListing) {
    this.privateListing = privateListing;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("participants")
  @Valid
  public List<@Valid ParticipantResponse> getParticipants() {
    return participants;
  }
  public void setParticipants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filters")
  @Valid
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }
  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingFullResponse listingFullResponse = (ListingFullResponse) o;
    return Objects.equals(this.id, listingFullResponse.id) &&
        Objects.equals(this.name, listingFullResponse.name) &&
        Objects.equals(this.description, listingFullResponse.description) &&
        Objects.equals(this.start, listingFullResponse.start) &&
        Objects.equals(this.end, listingFullResponse.end) &&
        Objects.equals(this.locationName, listingFullResponse.locationName) &&
        Objects.equals(this.locationDescription, listingFullResponse.locationDescription) &&
        Objects.equals(this.privateListing, listingFullResponse.privateListing) &&
        Objects.equals(this.active, listingFullResponse.active) &&
        Objects.equals(this.participants, listingFullResponse.participants) &&
        Objects.equals(this.owner, listingFullResponse.owner) &&
        Objects.equals(this.filters, listingFullResponse.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, start, end, locationName, locationDescription, privateListing, active, participants, owner, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingFullResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    privateListing: ").append(toIndentedString(privateListing)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

