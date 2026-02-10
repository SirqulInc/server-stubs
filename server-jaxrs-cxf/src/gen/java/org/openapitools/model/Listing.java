package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Filter;
import org.openapitools.model.Participant;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Listing  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Date start;

  @ApiModelProperty(value = "")

  private Date end;

  @ApiModelProperty(value = "")

  private String locationName;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Participant> participants = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String externalGroupId;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Filter> filters = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean _private;
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

  public Listing id(Long id) {
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

  public Listing active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Listing valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Listing owner(Account owner) {
    this.owner = owner;
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

  public Listing name(String name) {
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

  public Listing description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Listing start(Date start) {
    this.start = start;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public Listing end(Date end) {
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

  public Listing locationName(String locationName) {
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

  public Listing locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

 /**
   * Get participants
   * @return participants
  **/
  @JsonProperty("participants")
  public List<@Valid Participant> getParticipants() {
    return participants;
  }

  public void setParticipants(List<@Valid Participant> participants) {
    this.participants = participants;
  }

  public Listing participants(List<@Valid Participant> participants) {
    this.participants = participants;
    return this;
  }

  public Listing addParticipantsItem(Participant participantsItem) {
    this.participants.add(participantsItem);
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Listing externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get externalGroupId
   * @return externalGroupId
  **/
  @JsonProperty("externalGroupId")
  public String getExternalGroupId() {
    return externalGroupId;
  }

  public void setExternalGroupId(String externalGroupId) {
    this.externalGroupId = externalGroupId;
  }

  public Listing externalGroupId(String externalGroupId) {
    this.externalGroupId = externalGroupId;
    return this;
  }

 /**
   * Get filters
   * @return filters
  **/
  @JsonProperty("filters")
  public List<@Valid Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid Filter> filters) {
    this.filters = filters;
  }

  public Listing filters(List<@Valid Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Listing addFiltersItem(Filter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

 /**
   * Get _private
   * @return _private
  **/
  @JsonProperty("private")
  public Boolean getPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public Listing _private(Boolean _private) {
    this._private = _private;
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
    Listing listing = (Listing) o;
    return Objects.equals(this.id, listing.id) &&
        Objects.equals(this.active, listing.active) &&
        Objects.equals(this.valid, listing.valid) &&
        Objects.equals(this.owner, listing.owner) &&
        Objects.equals(this.name, listing.name) &&
        Objects.equals(this.description, listing.description) &&
        Objects.equals(this.start, listing.start) &&
        Objects.equals(this.end, listing.end) &&
        Objects.equals(this.locationName, listing.locationName) &&
        Objects.equals(this.locationDescription, listing.locationDescription) &&
        Objects.equals(this.participants, listing.participants) &&
        Objects.equals(this.externalId, listing.externalId) &&
        Objects.equals(this.externalGroupId, listing.externalGroupId) &&
        Objects.equals(this.filters, listing.filters) &&
        Objects.equals(this._private, listing._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, name, description, start, end, locationName, locationDescription, participants, externalId, externalGroupId, filters, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Listing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalGroupId: ").append(toIndentedString(externalGroupId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

