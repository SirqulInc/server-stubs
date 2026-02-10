package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Location   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private String name;
  private Territory territory;
  private ServiceHub hub;
  private Asset picture;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private String homePhone;
  private String cellPhone;
  private CellCarrier cellCarrier;
  private String businessPhone;
  private String businessPhoneExt;
  private String faxNumber;
  private String timeZone;
  private String utcOffset;
  private String code501c3;
  private String emailAddress;
  private Address address;
  private String web;
  private Program program;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),

        PRIVATE("PRIVATE"),

        FRIENDS("FRIENDS");
    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private VisibilityEnum visibility;
  private String groupingId;
  private Boolean destination;
  private Long dockingTime;
  private Long usageCount;
  private String timeFramesAllowed;
  private List<@Valid YayOrNay> likes = new ArrayList<>();
  private Long likeCount;
  private Long dislikeCount;
  private String ownerDisplay;
  private String contentName;

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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
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
  @JsonProperty("territory")
  @Valid
  public Territory getTerritory() {
    return territory;
  }
  public void setTerritory(Territory territory) {
    this.territory = territory;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hub")
  @Valid
  public ServiceHub getHub() {
    return hub;
  }
  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("picture")
  @Valid
  public Asset getPicture() {
    return picture;
  }
  public void setPicture(Asset picture) {
    this.picture = picture;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  @Valid
  public List<@Valid Note> getNotes() {
    return notes;
  }
  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteCount")
  public Long getNoteCount() {
    return noteCount;
  }
  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("homePhone")
  public String getHomePhone() {
    return homePhone;
  }
  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellPhone")
  public String getCellPhone() {
    return cellPhone;
  }
  public void setCellPhone(String cellPhone) {
    this.cellPhone = cellPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cellCarrier")
  @Valid
  public CellCarrier getCellCarrier() {
    return cellCarrier;
  }
  public void setCellCarrier(CellCarrier cellCarrier) {
    this.cellCarrier = cellCarrier;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhone")
  public String getBusinessPhone() {
    return businessPhone;
  }
  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("businessPhoneExt")
  public String getBusinessPhoneExt() {
    return businessPhoneExt;
  }
  public void setBusinessPhoneExt(String businessPhoneExt) {
    this.businessPhoneExt = businessPhoneExt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("utcOffset")
  public String getUtcOffset() {
    return utcOffset;
  }
  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code501c3")
  public String getCode501c3() {
    return code501c3;
  }
  public void setCode501c3(String code501c3) {
    this.code501c3 = code501c3;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("web")
  public String getWeb() {
    return web;
  }
  public void setWeb(String web) {
    this.web = web;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("program")
  @Valid
  public Program getProgram() {
    return program;
  }
  public void setProgram(Program program) {
    this.program = program;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("groupingId")
  public String getGroupingId() {
    return groupingId;
  }
  public void setGroupingId(String groupingId) {
    this.groupingId = groupingId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("destination")
  public Boolean getDestination() {
    return destination;
  }
  public void setDestination(Boolean destination) {
    this.destination = destination;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dockingTime")
  public Long getDockingTime() {
    return dockingTime;
  }
  public void setDockingTime(Long dockingTime) {
    this.dockingTime = dockingTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("usageCount")
  public Long getUsageCount() {
    return usageCount;
  }
  public void setUsageCount(Long usageCount) {
    this.usageCount = usageCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeFramesAllowed")
  public String getTimeFramesAllowed() {
    return timeFramesAllowed;
  }
  public void setTimeFramesAllowed(String timeFramesAllowed) {
    this.timeFramesAllowed = timeFramesAllowed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likes")
  @Valid
  public List<@Valid YayOrNay> getLikes() {
    return likes;
  }
  public void setLikes(List<@Valid YayOrNay> likes) {
    this.likes = likes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("likeCount")
  public Long getLikeCount() {
    return likeCount;
  }
  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dislikeCount")
  public Long getDislikeCount() {
    return dislikeCount;
  }
  public void setDislikeCount(Long dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ownerDisplay")
  public String getOwnerDisplay() {
    return ownerDisplay;
  }
  public void setOwnerDisplay(String ownerDisplay) {
    this.ownerDisplay = ownerDisplay;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contentName")
  public String getContentName() {
    return contentName;
  }
  public void setContentName(String contentName) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

