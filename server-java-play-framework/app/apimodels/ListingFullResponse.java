package apimodels;

import apimodels.AccountShortResponse;
import apimodels.FilterResponse;
import apimodels.ParticipantResponse;
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
 * ListingFullResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListingFullResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("start")
  
  private Long start;

  @JsonProperty("end")
  
  private Long end;

  @JsonProperty("locationName")
  
  private String locationName;

  @JsonProperty("locationDescription")
  
  private String locationDescription;

  @JsonProperty("privateListing")
  
  private Boolean privateListing;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("participants")
  @Valid

  private List<@Valid ParticipantResponse> participants = null;

  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("filters")
  @Valid

  private List<@Valid FilterResponse> filters = null;

  public ListingFullResponse id(Long id) {
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

  public ListingFullResponse name(String name) {
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

  public ListingFullResponse description(String description) {
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

  public ListingFullResponse start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public ListingFullResponse end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public ListingFullResponse locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public ListingFullResponse locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public ListingFullResponse privateListing(Boolean privateListing) {
    this.privateListing = privateListing;
    return this;
  }

   /**
   * Get privateListing
   * @return privateListing
  **/
  public Boolean getPrivateListing() {
    return privateListing;
  }

  public void setPrivateListing(Boolean privateListing) {
    this.privateListing = privateListing;
  }

  public ListingFullResponse active(Boolean active) {
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
  **/
  public List<@Valid ParticipantResponse> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
  }

  public ListingFullResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
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
  **/
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
    return Objects.equals(id, listingFullResponse.id) &&
        Objects.equals(name, listingFullResponse.name) &&
        Objects.equals(description, listingFullResponse.description) &&
        Objects.equals(start, listingFullResponse.start) &&
        Objects.equals(end, listingFullResponse.end) &&
        Objects.equals(locationName, listingFullResponse.locationName) &&
        Objects.equals(locationDescription, listingFullResponse.locationDescription) &&
        Objects.equals(privateListing, listingFullResponse.privateListing) &&
        Objects.equals(active, listingFullResponse.active) &&
        Objects.equals(participants, listingFullResponse.participants) &&
        Objects.equals(owner, listingFullResponse.owner) &&
        Objects.equals(filters, listingFullResponse.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, start, end, locationName, locationDescription, privateListing, active, participants, owner, filters);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

