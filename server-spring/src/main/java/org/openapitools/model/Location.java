package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Address;
import org.openapitools.model.Asset;
import org.openapitools.model.CellCarrier;
import org.openapitools.model.Note;
import org.openapitools.model.Program;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Territory;
import org.openapitools.model.YayOrNay;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Location
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Location {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Double latitude;

  private @Nullable Double longitude;

  private @Nullable String locationDescription;

  private @Nullable String name;

  private @Nullable Territory territory;

  private @Nullable ServiceHub hub;

  private @Nullable Asset picture;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  private @Nullable String homePhone;

  private @Nullable String cellPhone;

  private @Nullable CellCarrier cellCarrier;

  private @Nullable String businessPhone;

  private @Nullable String businessPhoneExt;

  private @Nullable String faxNumber;

  private @Nullable String timeZone;

  private @Nullable String utcOffset;

  private @Nullable String code501c3;

  private @Nullable String emailAddress;

  private @Nullable Address address;

  private @Nullable String web;

  private @Nullable Program program;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    FRIENDS("FRIENDS");

    private final String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VisibilityEnum visibility;

  private @Nullable String groupingId;

  private @Nullable Boolean destination;

  private @Nullable Long dockingTime;

  private @Nullable Long usageCount;

  private @Nullable String timeFramesAllowed;

  @Valid
  private List<@Valid YayOrNay> likes = new ArrayList<>();

  private @Nullable Long likeCount;

  private @Nullable Long dislikeCount;

  private @Nullable String ownerDisplay;

  private @Nullable String contentName;

  public Location id(@Nullable Long id) {
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

  public Location active(@Nullable Boolean active) {
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

  public Location valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Location latitude(@Nullable Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   */
  
  @Schema(name = "latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public @Nullable Double getLatitude() {
    return latitude;
  }

  public void setLatitude(@Nullable Double latitude) {
    this.latitude = latitude;
  }

  public Location longitude(@Nullable Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   */
  
  @Schema(name = "longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public @Nullable Double getLongitude() {
    return longitude;
  }

  public void setLongitude(@Nullable Double longitude) {
    this.longitude = longitude;
  }

  public Location locationDescription(@Nullable String locationDescription) {
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

  public Location name(@Nullable String name) {
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

  public Location territory(@Nullable Territory territory) {
    this.territory = territory;
    return this;
  }

  /**
   * Get territory
   * @return territory
   */
  @Valid 
  @Schema(name = "territory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("territory")
  public @Nullable Territory getTerritory() {
    return territory;
  }

  public void setTerritory(@Nullable Territory territory) {
    this.territory = territory;
  }

  public Location hub(@Nullable ServiceHub hub) {
    this.hub = hub;
    return this;
  }

  /**
   * Get hub
   * @return hub
   */
  @Valid 
  @Schema(name = "hub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hub")
  public @Nullable ServiceHub getHub() {
    return hub;
  }

  public void setHub(@Nullable ServiceHub hub) {
    this.hub = hub;
  }

  public Location picture(@Nullable Asset picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Get picture
   * @return picture
   */
  @Valid 
  @Schema(name = "picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("picture")
  public @Nullable Asset getPicture() {
    return picture;
  }

  public void setPicture(@Nullable Asset picture) {
    this.picture = picture;
  }

  public Location notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Location addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  @Valid 
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Location noteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

  /**
   * Get noteCount
   * @return noteCount
   */
  
  @Schema(name = "noteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("noteCount")
  public @Nullable Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(@Nullable Long noteCount) {
    this.noteCount = noteCount;
  }

  public Location homePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  /**
   * Get homePhone
   * @return homePhone
   */
  
  @Schema(name = "homePhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homePhone")
  public @Nullable String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(@Nullable String homePhone) {
    this.homePhone = homePhone;
  }

  public Location cellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

  /**
   * Get cellPhone
   * @return cellPhone
   */
  
  @Schema(name = "cellPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellPhone")
  public @Nullable String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(@Nullable String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Location cellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

  /**
   * Get cellCarrier
   * @return cellCarrier
   */
  @Valid 
  @Schema(name = "cellCarrier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cellCarrier")
  public @Nullable CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(@Nullable CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Location businessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

  /**
   * Get businessPhone
   * @return businessPhone
   */
  
  @Schema(name = "businessPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhone")
  public @Nullable String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(@Nullable String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Location businessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

  /**
   * Get businessPhoneExt
   * @return businessPhoneExt
   */
  
  @Schema(name = "businessPhoneExt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessPhoneExt")
  public @Nullable String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(@Nullable String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Location faxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * Get faxNumber
   * @return faxNumber
   */
  
  @Schema(name = "faxNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("faxNumber")
  public @Nullable String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Location timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   */
  
  @Schema(name = "timeZone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public Location utcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * Get utcOffset
   * @return utcOffset
   */
  
  @Schema(name = "utcOffset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("utcOffset")
  public @Nullable String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(@Nullable String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Location code501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

  /**
   * Get code501c3
   * @return code501c3
   */
  
  @Schema(name = "code501c3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code501c3")
  public @Nullable String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(@Nullable String code501c3) {
    this.code501c3 = code501c3;
  }

  public Location emailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  
  @Schema(name = "emailAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public @Nullable String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(@Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Location address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  public void setAddress(@Nullable Address address) {
    this.address = address;
  }

  public Location web(@Nullable String web) {
    this.web = web;
    return this;
  }

  /**
   * Get web
   * @return web
   */
  
  @Schema(name = "web", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("web")
  public @Nullable String getWeb() {
    return web;
  }

  public void setWeb(@Nullable String web) {
    this.web = web;
  }

  public Location program(@Nullable Program program) {
    this.program = program;
    return this;
  }

  /**
   * Get program
   * @return program
   */
  @Valid 
  @Schema(name = "program", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("program")
  public @Nullable Program getProgram() {
    return program;
  }

  public void setProgram(@Nullable Program program) {
    this.program = program;
  }

  public Location visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
   */
  
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Location groupingId(@Nullable String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

  /**
   * Get groupingId
   * @return groupingId
   */
  
  @Schema(name = "groupingId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupingId")
  public @Nullable String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(@Nullable String groupingId) {
    this.groupingId = groupingId;
  }

  public Location destination(@Nullable Boolean destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
   */
  
  @Schema(name = "destination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination")
  public @Nullable Boolean getDestination() {
    return destination;
  }

  public void setDestination(@Nullable Boolean destination) {
    this.destination = destination;
  }

  public Location dockingTime(@Nullable Long dockingTime) {
    this.dockingTime = dockingTime;
    return this;
  }

  /**
   * Get dockingTime
   * @return dockingTime
   */
  
  @Schema(name = "dockingTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dockingTime")
  public @Nullable Long getDockingTime() {
    return dockingTime;
  }

  public void setDockingTime(@Nullable Long dockingTime) {
    this.dockingTime = dockingTime;
  }

  public Location usageCount(@Nullable Long usageCount) {
    this.usageCount = usageCount;
    return this;
  }

  /**
   * Get usageCount
   * @return usageCount
   */
  
  @Schema(name = "usageCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageCount")
  public @Nullable Long getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(@Nullable Long usageCount) {
    this.usageCount = usageCount;
  }

  public Location timeFramesAllowed(@Nullable String timeFramesAllowed) {
    this.timeFramesAllowed = timeFramesAllowed;
    return this;
  }

  /**
   * Get timeFramesAllowed
   * @return timeFramesAllowed
   */
  
  @Schema(name = "timeFramesAllowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeFramesAllowed")
  public @Nullable String getTimeFramesAllowed() {
    return timeFramesAllowed;
  }

  public void setTimeFramesAllowed(@Nullable String timeFramesAllowed) {
    this.timeFramesAllowed = timeFramesAllowed;
  }

  public Location likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Location addLikesItem(YayOrNay likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Get likes
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Location likeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * Get likeCount
   * @return likeCount
   */
  
  @Schema(name = "likeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likeCount")
  public @Nullable Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(@Nullable Long likeCount) {
    this.likeCount = likeCount;
  }

  public Location dislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

  /**
   * Get dislikeCount
   * @return dislikeCount
   */
  
  @Schema(name = "dislikeCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dislikeCount")
  public @Nullable Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(@Nullable Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public Location ownerDisplay(@Nullable String ownerDisplay) {
    this.ownerDisplay = ownerDisplay;
    return this;
  }

  /**
   * Get ownerDisplay
   * @return ownerDisplay
   */
  
  @Schema(name = "ownerDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerDisplay")
  public @Nullable String getOwnerDisplay() {
    return ownerDisplay;
  }

  public void setOwnerDisplay(@Nullable String ownerDisplay) {
    this.ownerDisplay = ownerDisplay;
  }

  public Location contentName(@Nullable String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Get contentName
   * @return contentName
   */
  
  @Schema(name = "contentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentName")
  public @Nullable String getContentName() {
    return contentName;
  }

  public void setContentName(@Nullable String contentName) {
    this.contentName = contentName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.active, location.active) &&
        Objects.equals(this.valid, location.valid) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.locationDescription, location.locationDescription) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.territory, location.territory) &&
        Objects.equals(this.hub, location.hub) &&
        Objects.equals(this.picture, location.picture) &&
        Objects.equals(this.notes, location.notes) &&
        Objects.equals(this.noteCount, location.noteCount) &&
        Objects.equals(this.homePhone, location.homePhone) &&
        Objects.equals(this.cellPhone, location.cellPhone) &&
        Objects.equals(this.cellCarrier, location.cellCarrier) &&
        Objects.equals(this.businessPhone, location.businessPhone) &&
        Objects.equals(this.businessPhoneExt, location.businessPhoneExt) &&
        Objects.equals(this.faxNumber, location.faxNumber) &&
        Objects.equals(this.timeZone, location.timeZone) &&
        Objects.equals(this.utcOffset, location.utcOffset) &&
        Objects.equals(this.code501c3, location.code501c3) &&
        Objects.equals(this.emailAddress, location.emailAddress) &&
        Objects.equals(this.address, location.address) &&
        Objects.equals(this.web, location.web) &&
        Objects.equals(this.program, location.program) &&
        Objects.equals(this.visibility, location.visibility) &&
        Objects.equals(this.groupingId, location.groupingId) &&
        Objects.equals(this.destination, location.destination) &&
        Objects.equals(this.dockingTime, location.dockingTime) &&
        Objects.equals(this.usageCount, location.usageCount) &&
        Objects.equals(this.timeFramesAllowed, location.timeFramesAllowed) &&
        Objects.equals(this.likes, location.likes) &&
        Objects.equals(this.likeCount, location.likeCount) &&
        Objects.equals(this.dislikeCount, location.dislikeCount) &&
        Objects.equals(this.ownerDisplay, location.ownerDisplay) &&
        Objects.equals(this.contentName, location.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, name, territory, hub, picture, notes, noteCount, homePhone, cellPhone, cellCarrier, businessPhone, businessPhoneExt, faxNumber, timeZone, utcOffset, code501c3, emailAddress, address, web, program, visibility, groupingId, destination, dockingTime, usageCount, timeFramesAllowed, likes, likeCount, dislikeCount, ownerDisplay, contentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    cellPhone: ").append(toIndentedString(cellPhone)).append("\n");
    sb.append("    cellCarrier: ").append(toIndentedString(cellCarrier)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessPhoneExt: ").append(toIndentedString(businessPhoneExt)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    code501c3: ").append(toIndentedString(code501c3)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    groupingId: ").append(toIndentedString(groupingId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    dockingTime: ").append(toIndentedString(dockingTime)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
    sb.append("    timeFramesAllowed: ").append(toIndentedString(timeFramesAllowed)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    ownerDisplay: ").append(toIndentedString(ownerDisplay)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
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

