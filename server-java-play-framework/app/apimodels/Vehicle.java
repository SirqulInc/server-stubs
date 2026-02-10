package apimodels;

import apimodels.Account;
import apimodels.Asset;
import apimodels.Note;
import apimodels.Program;
import apimodels.Region;
import apimodels.ServiceHub;
import apimodels.VehicleType;
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
 * Vehicle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Vehicle   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("vehicleType")
  @Valid

  private VehicleType vehicleType;

  @JsonProperty("vin")
  
  private String vin;

  @JsonProperty("licensePlateNumber")
  
  private String licensePlateNumber;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("hub")
  @Valid

  private ServiceHub hub;

  @JsonProperty("programs")
  @Valid

  private List<@Valid Program> programs = null;

  @JsonProperty("seatQuantity")
  
  private Long seatQuantity;

  @JsonProperty("picture")
  @Valid

  private Asset picture;

  @JsonProperty("markerIcon")
  @Valid

  private Asset markerIcon;

  @JsonProperty("trackingColor")
  
  private String trackingColor;

  @JsonProperty("belongsTo")
  @Valid

  private Account belongsTo;

  @JsonProperty("zone")
  @Valid

  private Region zone;

  @JsonProperty("notes")
  @Valid

  private List<@Valid Note> notes = null;

  @JsonProperty("noteCount")
  
  private Long noteCount;

  @JsonProperty("inUse")
  
  private Boolean inUse;

  @JsonProperty("contentName")
  
  private String contentName;

  public Vehicle id(Long id) {
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

  public Vehicle active(Boolean active) {
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

  public Vehicle valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Vehicle name(String name) {
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

  public Vehicle description(String description) {
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

  public Vehicle vehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

   /**
   * Get vehicleType
   * @return vehicleType
  **/
  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Vehicle vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Get vin
   * @return vin
  **/
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Vehicle licensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
    return this;
  }

   /**
   * Get licensePlateNumber
   * @return licensePlateNumber
  **/
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }

  public Vehicle externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Vehicle hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

   /**
   * Get hub
   * @return hub
  **/
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public Vehicle programs(List<@Valid Program> programs) {
    this.programs = programs;
    return this;
  }

  public Vehicle addProgramsItem(Program programsItem) {
    if (this.programs == null) {
      this.programs = new ArrayList<>();
    }
    this.programs.add(programsItem);
    return this;
  }

   /**
   * Get programs
   * @return programs
  **/
  public List<@Valid Program> getPrograms() {
    return programs;
  }

  public void setPrograms(List<@Valid Program> programs) {
    this.programs = programs;
  }

  public Vehicle seatQuantity(Long seatQuantity) {
    this.seatQuantity = seatQuantity;
    return this;
  }

   /**
   * Get seatQuantity
   * @return seatQuantity
  **/
  public Long getSeatQuantity() {
    return seatQuantity;
  }

  public void setSeatQuantity(Long seatQuantity) {
    this.seatQuantity = seatQuantity;
  }

  public Vehicle picture(Asset picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  public Asset getPicture() {
    return picture;
  }

  public void setPicture(Asset picture) {
    this.picture = picture;
  }

  public Vehicle markerIcon(Asset markerIcon) {
    this.markerIcon = markerIcon;
    return this;
  }

   /**
   * Get markerIcon
   * @return markerIcon
  **/
  public Asset getMarkerIcon() {
    return markerIcon;
  }

  public void setMarkerIcon(Asset markerIcon) {
    this.markerIcon = markerIcon;
  }

  public Vehicle trackingColor(String trackingColor) {
    this.trackingColor = trackingColor;
    return this;
  }

   /**
   * Get trackingColor
   * @return trackingColor
  **/
  public String getTrackingColor() {
    return trackingColor;
  }

  public void setTrackingColor(String trackingColor) {
    this.trackingColor = trackingColor;
  }

  public Vehicle belongsTo(Account belongsTo) {
    this.belongsTo = belongsTo;
    return this;
  }

   /**
   * Get belongsTo
   * @return belongsTo
  **/
  public Account getBelongsTo() {
    return belongsTo;
  }

  public void setBelongsTo(Account belongsTo) {
    this.belongsTo = belongsTo;
  }

  public Vehicle zone(Region zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  public Region getZone() {
    return zone;
  }

  public void setZone(Region zone) {
    this.zone = zone;
  }

  public Vehicle notes(List<@Valid Note> notes) {
    this.notes = notes;
    return this;
  }

  public Vehicle addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  public List<@Valid Note> getNotes() {
    return notes;
  }

  public void setNotes(List<@Valid Note> notes) {
    this.notes = notes;
  }

  public Vehicle noteCount(Long noteCount) {
    this.noteCount = noteCount;
    return this;
  }

   /**
   * Get noteCount
   * @return noteCount
  **/
  public Long getNoteCount() {
    return noteCount;
  }

  public void setNoteCount(Long noteCount) {
    this.noteCount = noteCount;
  }

  public Vehicle inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

   /**
   * Get inUse
   * @return inUse
  **/
  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public Vehicle contentName(String contentName) {
    this.contentName = contentName;
    return this;
  }

   /**
   * Get contentName
   * @return contentName
  **/
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
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(id, vehicle.id) &&
        Objects.equals(active, vehicle.active) &&
        Objects.equals(valid, vehicle.valid) &&
        Objects.equals(name, vehicle.name) &&
        Objects.equals(description, vehicle.description) &&
        Objects.equals(vehicleType, vehicle.vehicleType) &&
        Objects.equals(vin, vehicle.vin) &&
        Objects.equals(licensePlateNumber, vehicle.licensePlateNumber) &&
        Objects.equals(externalId, vehicle.externalId) &&
        Objects.equals(hub, vehicle.hub) &&
        Objects.equals(programs, vehicle.programs) &&
        Objects.equals(seatQuantity, vehicle.seatQuantity) &&
        Objects.equals(picture, vehicle.picture) &&
        Objects.equals(markerIcon, vehicle.markerIcon) &&
        Objects.equals(trackingColor, vehicle.trackingColor) &&
        Objects.equals(belongsTo, vehicle.belongsTo) &&
        Objects.equals(zone, vehicle.zone) &&
        Objects.equals(notes, vehicle.notes) &&
        Objects.equals(noteCount, vehicle.noteCount) &&
        Objects.equals(inUse, vehicle.inUse) &&
        Objects.equals(contentName, vehicle.contentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, vehicleType, vin, licensePlateNumber, externalId, hub, programs, seatQuantity, picture, markerIcon, trackingColor, belongsTo, zone, notes, noteCount, inUse, contentName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

