package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Vehicle   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String description;
  private VehicleType vehicleType;
  private String vin;
  private String licensePlateNumber;
  private String externalId;
  private ServiceHub hub;
  private List<@Valid Program> programs = new ArrayList<>();
  private Long seatQuantity;
  private Asset picture;
  private Asset markerIcon;
  private String trackingColor;
  private Account belongsTo;
  private Region zone;
  private List<@Valid Note> notes = new ArrayList<>();
  private Long noteCount;
  private Boolean inUse;
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
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicleType")
  @Valid
  public VehicleType getVehicleType() {
    return vehicleType;
  }
  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }
  public void setVin(String vin) {
    this.vin = vin;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("licensePlateNumber")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }
  public void setLicensePlateNumber(String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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
  @JsonProperty("programs")
  @Valid
  public List<@Valid Program> getPrograms() {
    return programs;
  }
  public void setPrograms(List<@Valid Program> programs) {
    this.programs = programs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seatQuantity")
  public Long getSeatQuantity() {
    return seatQuantity;
  }
  public void setSeatQuantity(Long seatQuantity) {
    this.seatQuantity = seatQuantity;
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
  @JsonProperty("markerIcon")
  @Valid
  public Asset getMarkerIcon() {
    return markerIcon;
  }
  public void setMarkerIcon(Asset markerIcon) {
    this.markerIcon = markerIcon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trackingColor")
  public String getTrackingColor() {
    return trackingColor;
  }
  public void setTrackingColor(String trackingColor) {
    this.trackingColor = trackingColor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("belongsTo")
  @Valid
  public Account getBelongsTo() {
    return belongsTo;
  }
  public void setBelongsTo(Account belongsTo) {
    this.belongsTo = belongsTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("zone")
  @Valid
  public Region getZone() {
    return zone;
  }
  public void setZone(Region zone) {
    this.zone = zone;
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
  @JsonProperty("inUse")
  public Boolean getInUse() {
    return inUse;
  }
  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

