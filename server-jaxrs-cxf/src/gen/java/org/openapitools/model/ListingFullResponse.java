package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.ParticipantResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListingFullResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Long start;

  @ApiModelProperty(value = "")

  private Long end;

  @ApiModelProperty(value = "")

  private String locationName;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private Boolean privateListing;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ParticipantResponse> participants = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid FilterResponse> filters = new ArrayList<>();
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

  public ListingFullResponse id(Long id) {
    this.id = id;
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

  public ListingFullResponse name(String name) {
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

  public ListingFullResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public ListingFullResponse start(Long start) {
    this.start = start;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public ListingFullResponse end(Long end) {
    this.end = end;
    return this;
  }

 /**
   * Get locationName
   * @return locationName
  **/
  @JsonProperty("locationName")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public ListingFullResponse locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

 /**
   * Get locationDescription
   * @return locationDescription
  **/
  @JsonProperty("locationDescription")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public ListingFullResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get privateListing
   * @return privateListing
  **/
  @JsonProperty("privateListing")
  public Boolean getPrivateListing() {
    return privateListing;
  }

  public void setPrivateListing(Boolean privateListing) {
    this.privateListing = privateListing;
  }

  public ListingFullResponse privateListing(Boolean privateListing) {
    this.privateListing = privateListing;
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

  public ListingFullResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get participants
   * @return participants
  **/
  @JsonProperty("participants")
  public List<@Valid ParticipantResponse> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
  }

  public ListingFullResponse participants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
    return this;
  }

  public ListingFullResponse addParticipantsItem(ParticipantResponse participantsItem) {
    this.participants.add(participantsItem);
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public ListingFullResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid FilterResponse> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
  }

  public ListingFullResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public ListingFullResponse addFiltersItem(FilterResponse filtersItem) {
    this.filters.add(filtersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

