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
import org.openapitools.model.Flag;
import org.openapitools.model.FlagThreshold;
import org.openapitools.model.YayOrNay;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Note   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Double latitude;
  private Double longitude;
  private String locationDescription;
  private Account owner;
  private String notableType;
  private Long notableId;
  private String noteTag;
  private List<@Valid Note> notes = new ArrayList<>();
  private List<@Valid YayOrNay> likes = new ArrayList<>();
  private List<@Valid Asset> assets = new ArrayList<>();
  private String noteDescription;
  private Long likeCount;
  private Long dislikeCount;
  private Long noteCount;
  private List<@Valid Flag> flags = new ArrayList<>();
  private Long flagCount;
  private FlagThreshold flagThreshold;
  private String contentName;
  private Long defaultThreshold;

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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notableType")
  public String getNotableType() {
    return notableType;
  }
  public void setNotableType(String notableType) {
    this.notableType = notableType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notableId")
  public Long getNotableId() {
    return notableId;
  }
  public void setNotableId(Long notableId) {
    this.notableId = notableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteTag")
  public String getNoteTag() {
    return noteTag;
  }
  public void setNoteTag(String noteTag) {
    this.noteTag = noteTag;
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
  @JsonProperty("assets")
  @Valid
  public List<@Valid Asset> getAssets() {
    return assets;
  }
  public void setAssets(List<@Valid Asset> assets) {
    this.assets = assets;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("noteDescription")
  public String getNoteDescription() {
    return noteDescription;
  }
  public void setNoteDescription(String noteDescription) {
    this.noteDescription = noteDescription;
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
  @JsonProperty("flags")
  @Valid
  public List<@Valid Flag> getFlags() {
    return flags;
  }
  public void setFlags(List<@Valid Flag> flags) {
    this.flags = flags;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagCount")
  public Long getFlagCount() {
    return flagCount;
  }
  public void setFlagCount(Long flagCount) {
    this.flagCount = flagCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagThreshold")
  @Valid
  public FlagThreshold getFlagThreshold() {
    return flagThreshold;
  }
  public void setFlagThreshold(FlagThreshold flagThreshold) {
    this.flagThreshold = flagThreshold;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultThreshold")
  public Long getDefaultThreshold() {
    return defaultThreshold;
  }
  public void setDefaultThreshold(Long defaultThreshold) {
    this.defaultThreshold = defaultThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.active, note.active) &&
        Objects.equals(this.valid, note.valid) &&
        Objects.equals(this.latitude, note.latitude) &&
        Objects.equals(this.longitude, note.longitude) &&
        Objects.equals(this.locationDescription, note.locationDescription) &&
        Objects.equals(this.owner, note.owner) &&
        Objects.equals(this.notableType, note.notableType) &&
        Objects.equals(this.notableId, note.notableId) &&
        Objects.equals(this.noteTag, note.noteTag) &&
        Objects.equals(this.notes, note.notes) &&
        Objects.equals(this.likes, note.likes) &&
        Objects.equals(this.assets, note.assets) &&
        Objects.equals(this.noteDescription, note.noteDescription) &&
        Objects.equals(this.likeCount, note.likeCount) &&
        Objects.equals(this.dislikeCount, note.dislikeCount) &&
        Objects.equals(this.noteCount, note.noteCount) &&
        Objects.equals(this.flags, note.flags) &&
        Objects.equals(this.flagCount, note.flagCount) &&
        Objects.equals(this.flagThreshold, note.flagThreshold) &&
        Objects.equals(this.contentName, note.contentName) &&
        Objects.equals(this.defaultThreshold, note.defaultThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, latitude, longitude, locationDescription, owner, notableType, notableId, noteTag, notes, likes, assets, noteDescription, likeCount, dislikeCount, noteCount, flags, flagCount, flagThreshold, contentName, defaultThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    notableType: ").append(toIndentedString(notableType)).append("\n");
    sb.append("    notableId: ").append(toIndentedString(notableId)).append("\n");
    sb.append("    noteTag: ").append(toIndentedString(noteTag)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    noteDescription: ").append(toIndentedString(noteDescription)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    dislikeCount: ").append(toIndentedString(dislikeCount)).append("\n");
    sb.append("    noteCount: ").append(toIndentedString(noteCount)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    flagCount: ").append(toIndentedString(flagCount)).append("\n");
    sb.append("    flagThreshold: ").append(toIndentedString(flagThreshold)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    defaultThreshold: ").append(toIndentedString(defaultThreshold)).append("\n");
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

