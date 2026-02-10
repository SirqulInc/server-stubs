package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Vehicle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Vehicle {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable VehicleType vehicleType;

  private @Nullable String vin;

  private @Nullable String licensePlateNumber;

  private @Nullable String externalId;

  private @Nullable ServiceHub hub;

  @Valid
  private List<@Valid Program> programs = new ArrayList<>();

  private @Nullable Long seatQuantity;

  private @Nullable Asset picture;

  private @Nullable Asset markerIcon;

  private @Nullable String trackingColor;

  private @Nullable Account belongsTo;

  private @Nullable Region zone;

  @Valid
  private List<@Valid Note> notes = new ArrayList<>();

  private @Nullable Long noteCount;

  private @Nullable Boolean inUse;

  private @Nullable String contentName;

  public Vehicle id(@Nullable Long id) {
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

  public Vehicle active(@Nullable Boolean active) {
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

  public Vehicle valid(@Nullable Boolean valid) {
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

  public Vehicle name(@Nullable String name) {
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

  public Vehicle description(@Nullable String description) {
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

  public Vehicle vehicleType(@Nullable VehicleType vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  /**
   * Get vehicleType
   * @return vehicleType
   */
  @Valid 
  @Schema(name = "vehicleType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleType")
  public @Nullable VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(@Nullable VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Vehicle vin(@Nullable String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Get vin
   * @return vin
   */
  
  @Schema(name = "vin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vin")
  public @Nullable String getVin() {
    return vin;
  }

  public void setVin(@Nullable String vin) {
    this.vin = vin;
  }

  public Vehicle licensePlateNumber(@Nullable String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
    return this;
  }

  /**
   * Get licensePlateNumber
   * @return licensePlateNumber
   */
  
  @Schema(name = "licensePlateNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licensePlateNumber")
  public @Nullable String getLicensePlateNumber() {
    return licensePlateNumber;
  }

  public void setLicensePlateNumber(@Nullable String licensePlateNumber) {
    this.licensePlateNumber = licensePlateNumber;
  }

  public Vehicle externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public Vehicle hub(@Nullable ServiceHub hub) {
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
   */
  @Valid 
  @Schema(name = "programs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("programs")
  public List<@Valid Program> getPrograms() {
    return programs;
  }

  public void setPrograms(List<@Valid Program> programs) {
    this.programs = programs;
  }

  public Vehicle seatQuantity(@Nullable Long seatQuantity) {
    this.seatQuantity = seatQuantity;
    return this;
  }

  /**
   * Get seatQuantity
   * @return seatQuantity
   */
  
  @Schema(name = "seatQuantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seatQuantity")
  public @Nullable Long getSeatQuantity() {
    return seatQuantity;
  }

  public void setSeatQuantity(@Nullable Long seatQuantity) {
    this.seatQuantity = seatQuantity;
  }

  public Vehicle picture(@Nullable Asset picture) {
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

  public Vehicle markerIcon(@Nullable Asset markerIcon) {
    this.markerIcon = markerIcon;
    return this;
  }

  /**
   * Get markerIcon
   * @return markerIcon
   */
  @Valid 
  @Schema(name = "markerIcon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("markerIcon")
  public @Nullable Asset getMarkerIcon() {
    return markerIcon;
  }

  public void setMarkerIcon(@Nullable Asset markerIcon) {
    this.markerIcon = markerIcon;
  }

  public Vehicle trackingColor(@Nullable String trackingColor) {
    this.trackingColor = trackingColor;
    return this;
  }

  /**
   * Get trackingColor
   * @return trackingColor
   */
  
  @Schema(name = "trackingColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackingColor")
  public @Nullable String getTrackingColor() {
    return trackingColor;
  }

  public void setTrackingColor(@Nullable String trackingColor) {
    this.trackingColor = trackingColor;
  }

  public Vehicle belongsTo(@Nullable Account belongsTo) {
    this.belongsTo = belongsTo;
    return this;
  }

  /**
   * Get belongsTo
   * @return belongsTo
   */
  @Valid 
  @Schema(name = "belongsTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("belongsTo")
  public @Nullable Account getBelongsTo() {
    return belongsTo;
  }

  public void setBelongsTo(@Nullable Account belongsTo) {
    this.belongsTo = belongsTo;
  }

  public Vehicle zone(@Nullable Region zone) {
    this.zone = zone;
    return this;
  }

  /**
   * Get zone
   * @return zone
   */
  @Valid 
  @Schema(name = "zone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zone")
  public @Nullable Region getZone() {
    return zone;
  }

  public void setZone(@Nullable Region zone) {
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

  public Vehicle noteCount(@Nullable Long noteCount) {
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

  public Vehicle inUse(@Nullable Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Get inUse
   * @return inUse
   */
  
  @Schema(name = "inUse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inUse")
  public @Nullable Boolean getInUse() {
    return inUse;
  }

  public void setInUse(@Nullable Boolean inUse) {
    this.inUse = inUse;
  }

  public Vehicle contentName(@Nullable String contentName) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

