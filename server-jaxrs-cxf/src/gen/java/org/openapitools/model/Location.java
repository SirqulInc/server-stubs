package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Location  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private String locationDescription;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private Territory territory;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;

  @ApiModelProperty(value = "")

  @Valid

  private Asset picture;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private String homePhone;

  @ApiModelProperty(value = "")

  private String cellPhone;

  @ApiModelProperty(value = "")

  @Valid

  private CellCarrier cellCarrier;

  @ApiModelProperty(value = "")

  private String businessPhone;

  @ApiModelProperty(value = "")

  private String businessPhoneExt;

  @ApiModelProperty(value = "")

  private String faxNumber;

  @ApiModelProperty(value = "")

  private String timeZone;

  @ApiModelProperty(value = "")

  private String utcOffset;

  @ApiModelProperty(value = "")

  private String code501c3;

  @ApiModelProperty(value = "")

  private String emailAddress;

  @ApiModelProperty(value = "")

  @Valid

  private Address address;

  @ApiModelProperty(value = "")

  private String web;

  @ApiModelProperty(value = "")

  @Valid

  private Program program;

public enum VisibilityEnum {

PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE")), FRIENDS(String.valueOf("FRIENDS"));


    private String value;

    VisibilityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private VisibilityEnum visibility;

  @ApiModelProperty(value = "")

  private String groupingId;

  @ApiModelProperty(value = "")

  private Boolean destination;

  @ApiModelProperty(value = "")

  private Long dockingTime;

  @ApiModelProperty(value = "")

  private Long usageCount;

  @ApiModelProperty(value = "")

  private String timeFramesAllowed;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid YayOrNay> likes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long likeCount;

  @ApiModelProperty(value = "")

  private Long dislikeCount;

  @ApiModelProperty(value = "")

  private String ownerDisplay;

  @ApiModelProperty(value = "")

  private String contentName;
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

  public Location id(Long id) {
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

  public Location active(Boolean active) {
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

  public Location valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Location latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Location longitude(Double longitude) {
    this.longitude = longitude;
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

  public Location locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
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

  public Location name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get territory
   * @return territory
  **/
  @JsonProperty("territory")
  public Territory getTerritory() {
    return territory;
  }

  public void setTerritory(Territory territory) {
    this.territory = territory;
  }

  public Location territory(Territory territory) {
    this.territory = territory;
    return this;
  }

 /**
   * Get hub
   * @return hub
  **/
  @JsonProperty("hub")
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public Location hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

 /**
   * Get picture
   * @return picture
  **/
  @JsonProperty("picture")
  public Asset getPicture() {
    return picture;
  }

  public void setPicture(Asset picture) {
    this.picture = picture;
  }

  public Location picture(Asset picture) {
    this.picture = picture;
    return this;
  }

 /**
   * Get notes
   * @return notes
  **/
  @JsonProperty("notes")
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Location notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Location addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Get noteCount
   * @return noteCount
  **/
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Location noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get homePhone
   * @return homePhone
  **/
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public Location homePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

 /**
   * Get cellPhone
   * @return cellPhone
  **/
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }

  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  public Location cellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
    return this;
  }

 /**
   * Get cellCarrier
   * @return cellCarrier
  **/
  @JsonProperty("cellCarrier")
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }

  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  public Location cellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
    return this;
  }

 /**
   * Get businessPhone
   * @return businessPhone
  **/
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Location businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

 /**
   * Get businessPhoneExt
   * @return businessPhoneExt
  **/
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }

  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  public Location businessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
    return this;
  }

 /**
   * Get faxNumber
   * @return faxNumber
  **/
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Location faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

 /**
   * Get timeZone
   * @return timeZone
  **/
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Location timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

 /**
   * Get utcOffset
   * @return utcOffset
  **/
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public Location utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

 /**
   * Get code501c3
   * @return code501c3
  **/
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }

  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  public Location code501c3(String code501c3) {
    this.code501c3 = code501c3;
    return this;
  }

 /**
   * Get emailAddress
   * @return emailAddress
  **/
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Location emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Location address(Address address) {
    this.address = address;
    return this;
  }

 /**
   * Get web
   * @return web
  **/
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }

  public void setWeb(String web) {
    this.web = web;
  }

  public Location web(String web) {
    this.web = web;
    return this;
  }

 /**
   * Get program
   * @return program
  **/
  @JsonProperty("program")
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public Location program(Program program) {
    this.program = program;
    return this;
  }

 /**
   * Get visibility
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    if (visibility == null) {
      return null;
    }
    return visibility.value();
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Location visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * Get groupingId
   * @return groupingId
  **/
  @JsonProperty("groupingId")
  public String getGroupingId() {
    return groupingId;
  }

  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  public Location groupingId(String groupingId) {
    this.groupingId = groupingId;
    return this;
  }

 /**
   * Get destination
   * @return destination
  **/
  @JsonProperty("destination")
  public Boolean getDestination() {
    return destination;
  }

  public void setDestination(Boolean destination) {
    this.destination = destination;
  }

  public Location destination(Boolean destination) {
    this.destination = destination;
    return this;
  }

 /**
   * Get dockingTime
   * @return dockingTime
  **/
  @JsonProperty("dockingTime")
  public Long getDockingTime() {
    return dockingTime;
  }

  public void setDockingTime(Long dockingTime) {
    this.dockingTime = dockingTime;
  }

  public Location dockingTime(Long dockingTime) {
    this.dockingTime = dockingTime;
    return this;
  }

 /**
   * Get usageCount
   * @return usageCount
  **/
  @JsonProperty("usageCount")
  public Long getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(Long usageCount) {
    this.usageCount = usageCount;
  }

  public Location usageCount(Long usageCount) {
    this.usageCount = usageCount;
    return this;
  }

 /**
   * Get timeFramesAllowed
   * @return timeFramesAllowed
  **/
  @JsonProperty("timeFramesAllowed")
  public String getTimeFramesAllowed() {
    return timeFramesAllowed;
  }

  public void setTimeFramesAllowed(String timeFramesAllowed) {
    this.timeFramesAllowed = timeFramesAllowed;
  }

  public Location timeFramesAllowed(String timeFramesAllowed) {
    this.timeFramesAllowed = timeFramesAllowed;
    return this;
  }

 /**
   * Get likes
   * @return likes
  **/
  @JsonProperty("likes")
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  public Location likes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
    return this;
  }

  public Location addLikesItem(YayOrNay likesItem) {
    this.likes.add(likesItem);
    return this;
  }

 /**
   * Get likeCount
   * @return likeCount
  **/
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public Location likeCount(Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

 /**
   * Get dislikeCount
   * @return dislikeCount
  **/
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public Location dislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
    return this;
  }

 /**
   * Get ownerDisplay
   * @return ownerDisplay
  **/
  @JsonProperty("ownerDisplay")
  public String getOwnerDisplay() {
    return ownerDisplay;
  }

  public void setOwnerDisplay(String ownerDisplay) {
    this.ownerDisplay = ownerDisplay;
  }

  public Location ownerDisplay(String ownerDisplay) {
    this.ownerDisplay = ownerDisplay;
    return this;
  }

 /**
   * Get contentName
   * @return contentName
  **/
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }

  public void setContentName(String contentName) {
    this.contentName = contentName;
  }

  public Location contentName(String contentName) {
    this.contentName = contentName;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

