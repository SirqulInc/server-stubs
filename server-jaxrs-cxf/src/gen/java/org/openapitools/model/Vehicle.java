package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Asset;
import org.openapitools.model.Note;
import org.openapitools.model.Program;
import org.openapitools.model.Region;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.VehicleType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Vehicle  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private VehicleType vehicleType;

  @ApiModelProperty(value = "")

  private String vin;

  @ApiModelProperty(value = "")

  private String licensePlateNumber;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Program> programs = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long seatQuantity;

  @ApiModelProperty(value = "")

  @Valid

  private Asset picture;

  @ApiModelProperty(value = "")

  @Valid

  private Asset markerIcon;

  @ApiModelProperty(value = "")

  private String trackingColor;

  @ApiModelProperty(value = "")

  @Valid

  private Account belongsTo;

  @ApiModelProperty(value = "")

  @Valid

  private Region zone;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Note> notes = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long noteCount;

  @ApiModelProperty(value = "")

  private Boolean inUse;

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

  public Vehicle id(Long id) {
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

  public Vehicle active(Boolean active) {
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

  public Vehicle valid(Boolean valid) {
    this.valid = valid;
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

  public Vehicle name(String name) {
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

  public Vehicle description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get vehicleType
   * @return vehicleType
  **/
  @JsonProperty("vehicleType")
  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Vehicle vehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

 /**
   * Get vin
   * @return vin
  **/
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Vehicle vin(String vin) {
    this.vin = vin;
    return this;
  }

 /**
   * Get licensePlateNumber
   * @return licensePlateNumber
  **/
  @JsonProperty("licensePlateNumber")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }

  public Vehicle licensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
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

  public Vehicle externalId(String externalId) {
    this.externalId = externalId;
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

  public Vehicle hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

 /**
   * Get programs
   * @return programs
  **/
  @JsonProperty("programs")
  public List<@Valid Program> getPrograms() {
    return programs;
  }

  public void setPrograms(List<@Valid Program> programs) {
    this.programs = programs;
  }

  public Vehicle programs(List<@Valid Program> programs) {
    this.programs = programs;
    return this;
  }

  public Vehicle addProgramsItem(Program programsItem) {
    this.programs.add(programsItem);
    return this;
  }

 /**
   * Get seatQuantity
   * @return seatQuantity
  **/
  @JsonProperty("seatQuantity")
  public Long getSeatQuantity() {
    return seatQuantity;
  }

  public void setSeatQuantity(Long seatQuantity) {
    this.seatQuantity = seatQuantity;
  }

  public Vehicle seatQuantity(Long seatQuantity) {
    this.seatQuantity = seatQuantity;
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

  public Vehicle picture(Asset picture) {
    this.picture = picture;
    return this;
  }

 /**
   * Get markerIcon
   * @return markerIcon
  **/
  @JsonProperty("markerIcon")
  public Asset getMarkerIcon() {
    return markerIcon;
  }

  public void setMarkerIcon(Asset markerIcon) {
    this.markerIcon = markerIcon;
  }

  public Vehicle markerIcon(Asset markerIcon) {
    this.markerIcon = markerIcon;
    return this;
  }

 /**
   * Get trackingColor
   * @return trackingColor
  **/
  @JsonProperty("trackingColor")
  public String getTrackingColor() {
    return trackingColor;
  }

  public void setTrackingColor(String trackingColor) {
    this.trackingColor = trackingColor;
  }

  public Vehicle trackingColor(String trackingColor) {
    this.trackingColor = trackingColor;
    return this;
  }

 /**
   * Get belongsTo
   * @return belongsTo
  **/
  @JsonProperty("belongsTo")
  public Account getBelongsTo() {
    return belongsTo;
  }

  public void setBelongsTo(Account belongsTo) {
    this.belongsTo = belongsTo;
  }

  public Vehicle belongsTo(Account belongsTo) {
    this.belongsTo = belongsTo;
    return this;
  }

 /**
   * Get zone
   * @return zone
  **/
  @JsonProperty("zone")
  public Region getZone() {
    return zone;
  }

  public void setZone(Region zone) {
    this.zone = zone;
  }

  public Vehicle zone(Region zone) {
    this.zone = zone;
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

  public Vehicle notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Vehicle addNotesItem(Note notesItem) {
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

  public Vehicle noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

 /**
   * Get inUse
   * @return inUse
  **/
  @JsonProperty("inUse")
  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public Vehicle inUse(Boolean inUse) {
    this.inUse = inUse;
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

  public Vehicle contentName(String contentName) {
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
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.active, vehicle.active) &&
        Objects.equals(this.valid, vehicle.valid) &&
        Objects.equals(this.name, vehicle.name) &&
        Objects.equals(this.description, vehicle.description) &&
        Objects.equals(this.vehicleType, vehicle.vehicleType) &&
        Objects.equals(this.vin, vehicle.vin) &&
        Objects.equals(this.licensePlateNumber, vehicle.licensePlateNumber) &&
        Objects.equals(this.externalId, vehicle.externalId) &&
        Objects.equals(this.hub, vehicle.hub) &&
        Objects.equals(this.programs, vehicle.programs) &&
        Objects.equals(this.seatQuantity, vehicle.seatQuantity) &&
        Objects.equals(this.picture, vehicle.picture) &&
        Objects.equals(this.markerIcon, vehicle.markerIcon) &&
        Objects.equals(this.trackingColor, vehicle.trackingColor) &&
        Objects.equals(this.belongsTo, vehicle.belongsTo) &&
        Objects.equals(this.zone, vehicle.zone) &&
        Objects.equals(this.notes, vehicle.notes) &&
        Objects.equals(this.noteCount, vehicle.noteCount) &&
        Objects.equals(this.inUse, vehicle.inUse) &&
        Objects.equals(this.contentName, vehicle.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, vehicleType, vin, licensePlateNumber, externalId, hub, programs, seatQuantity, picture, markerIcon, trackingColor, belongsTo, zone, notes, noteCount, inUse, contentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    licensePlateNumber: ").append(toIndentedString(licensePlateNumber)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    seatQuantity: ").append(toIndentedString(seatQuantity)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    markerIcon: ").append(toIndentedString(markerIcon)).append("\n");
    sb.append("    trackingColor: ").append(toIndentedString(trackingColor)).append("\n");
    sb.append("    belongsTo: ").append(toIndentedString(belongsTo)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
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

