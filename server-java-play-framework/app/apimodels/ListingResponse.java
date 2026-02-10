package apimodels;

import apimodels.AccountShortResponse;
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
 * ListingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListingResponse   {
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

  public ListingResponse id(Long id) {
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

  public ListingResponse name(String name) {
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

  public ListingResponse description(String description) {
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

  public ListingResponse start(Long start) {
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

  public ListingResponse end(Long end) {
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

  public ListingResponse locationName(String locationName) {
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

  public ListingResponse locationDescription(String locationDescription) {
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

  public ListingResponse privateListing(Boolean privateListing) {
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

  public ListingResponse active(Boolean active) {
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

  public ListingResponse participants(List<@Valid ParticipantResponse> participants) {
    this.participants = participants;
    return this;
  }

  public ListingResponse addParticipantsItem(ParticipantResponse participantsItem) {
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

  public ListingResponse owner(AccountShortResponse owner) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingResponse listingResponse = (ListingResponse) o;
    return Objects.equals(id, listingResponse.id) &&
        Objects.equals(name, listingResponse.name) &&
        Objects.equals(description, listingResponse.description) &&
        Objects.equals(start, listingResponse.start) &&
        Objects.equals(end, listingResponse.end) &&
        Objects.equals(locationName, listingResponse.locationName) &&
        Objects.equals(locationDescription, listingResponse.locationDescription) &&
        Objects.equals(privateListing, listingResponse.privateListing) &&
        Objects.equals(active, listingResponse.active) &&
        Objects.equals(participants, listingResponse.participants) &&
        Objects.equals(owner, listingResponse.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, start, end, locationName, locationDescription, privateListing, active, participants, owner);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingResponse {\n");
    
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

