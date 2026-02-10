package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.ParticipantResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListingFullResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ListingFullResponse {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable Long start;

  private @Nullable Long end;

  private @Nullable String locationName;

  private @Nullable String locationDescription;

  private @Nullable Boolean privateListing;

  private @Nullable Boolean active;

  @Valid
  private List<@Valid ParticipantResponse> participants = new ArrayList<>();

  private @Nullable AccountShortResponse owner;

  @Valid
  private List<@Valid FilterResponse> filters = new ArrayList<>();

  public ListingFullResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ListingFullResponse name(@Nullable String name) {
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

  public ListingFullResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ListingFullResponse start(@Nullable Long start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  
  @Schema(name = "start", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
  public @Nullable Long getStart() {
    return start;
  }

  public void setStart(@Nullable Long start) {
    this.start = start;
  }

  public ListingFullResponse end(@Nullable Long end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  
  @Schema(name = "end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end")
  public @Nullable Long getEnd() {
    return end;
  }

  public void setEnd(@Nullable Long end) {
    this.end = end;
  }

  public ListingFullResponse locationName(@Nullable String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * Get locationName
   * @return locationName
   */
  
  @Schema(name = "locationName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationName")
  public @Nullable String getLocationName() {
    return locationName;
  }

  public void setLocationName(@Nullable String locationName) {
    this.locationName = locationName;
  }

  public ListingFullResponse locationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

  /**
   * Get locationDescription
   * @return locationDescription
   */
  
  @Schema(name = "locationDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDescription")
  public @Nullable String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(@Nullable String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public ListingFullResponse privateListing(@Nullable Boolean privateListing) {
    this.privateListing = privateListing;
    return this;
  }

  /**
   * Get privateListing
   * @return privateListing
   */
  
  @Schema(name = "privateListing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privateListing")
  public @Nullable Boolean getPrivateListing() {
    return privateListing;
  }

  public void setPrivateListing(@Nullable Boolean privateListing) {
    this.privateListing = privateListing;
  }

  public ListingFullResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ListingFullResponse participants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
    return this;
  }

  public ListingFullResponse addParticipantsItem(ParticipantResponse participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

  /**
   * Get participants
   * @return participants
   */
  @Valid 
  @Schema(name = "participants", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("participants")
  public List<@Valid ParticipantResponse> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
  }

  public ListingFullResponse owner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public ListingFullResponse filters(List<@Valid FilterResponse> filters) {
    this.filters = filters;
    return this;
  }

  public ListingFullResponse addFiltersItem(FilterResponse filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

