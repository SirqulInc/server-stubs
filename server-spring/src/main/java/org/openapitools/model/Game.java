package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Account;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.openapitools.model.GameLevel;
import org.openapitools.model.Pack;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Game
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Game {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable Application application;

  private @Nullable String title;

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  @Valid
  private List<@Valid Pack> packs = new ArrayList<>();

  /**
   * Gets or Sets sequenceType
   */
  public enum SequenceTypeEnum {
    FIRST_AVAILABLE("FIRST_AVAILABLE"),
    
    ALL_AVAILABLE("ALL_AVAILABLE");

    private final String value;

    SequenceTypeEnum(String value) {
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
    public static SequenceTypeEnum fromValue(String value) {
      for (SequenceTypeEnum b : SequenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SequenceTypeEnum sequenceType;

  private @Nullable String authorOverride;

  private @Nullable Asset icon;

  private @Nullable Asset image;

  private @Nullable Long points;

  private @Nullable String ticketType;

  private @Nullable Long ticketCount;

  private @Nullable Boolean allocateTickets;

  @Valid
  private List<@Valid GameLevel> allGameLevels = new ArrayList<>();

  private @Nullable String contentName;

  private @Nullable String contentType;

  public Game id(@Nullable Long id) {
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

  public Game active(@Nullable Boolean active) {
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

  public Game valid(@Nullable Boolean valid) {
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

  public Game owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public Game application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public Game title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public Game description(@Nullable String description) {
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

  public Game startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Game endDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Game packs(List<@Valid Pack> packs) {
    this.packs = packs;
    return this;
  }

  public Game addPacksItem(Pack packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<>();
    }
    this.packs.add(packsItem);
    return this;
  }

  /**
   * Get packs
   * @return packs
   */
  @Valid 
  @Schema(name = "packs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packs")
  public List<@Valid Pack> getPacks() {
    return packs;
  }

  public void setPacks(List<@Valid Pack> packs) {
    this.packs = packs;
  }

  public Game sequenceType(@Nullable SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
    return this;
  }

  /**
   * Get sequenceType
   * @return sequenceType
   */
  
  @Schema(name = "sequenceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sequenceType")
  public @Nullable SequenceTypeEnum getSequenceType() {
    return sequenceType;
  }

  public void setSequenceType(@Nullable SequenceTypeEnum sequenceType) {
    this.sequenceType = sequenceType;
  }

  public Game authorOverride(@Nullable String authorOverride) {
    this.authorOverride = authorOverride;
    return this;
  }

  /**
   * Get authorOverride
   * @return authorOverride
   */
  
  @Schema(name = "authorOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorOverride")
  public @Nullable String getAuthorOverride() {
    return authorOverride;
  }

  public void setAuthorOverride(@Nullable String authorOverride) {
    this.authorOverride = authorOverride;
  }

  public Game icon(@Nullable Asset icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @Valid 
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public @Nullable Asset getIcon() {
    return icon;
  }

  public void setIcon(@Nullable Asset icon) {
    this.icon = icon;
  }

  public Game image(@Nullable Asset image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image")
  public @Nullable Asset getImage() {
    return image;
  }

  public void setImage(@Nullable Asset image) {
    this.image = image;
  }

  public Game points(@Nullable Long points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
   */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public @Nullable Long getPoints() {
    return points;
  }

  public void setPoints(@Nullable Long points) {
    this.points = points;
  }

  public Game ticketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * Get ticketType
   * @return ticketType
   */
  
  @Schema(name = "ticketType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketType")
  public @Nullable String getTicketType() {
    return ticketType;
  }

  public void setTicketType(@Nullable String ticketType) {
    this.ticketType = ticketType;
  }

  public Game ticketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
    return this;
  }

  /**
   * Get ticketCount
   * @return ticketCount
   */
  
  @Schema(name = "ticketCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ticketCount")
  public @Nullable Long getTicketCount() {
    return ticketCount;
  }

  public void setTicketCount(@Nullable Long ticketCount) {
    this.ticketCount = ticketCount;
  }

  public Game allocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
    return this;
  }

  /**
   * Get allocateTickets
   * @return allocateTickets
   */
  
  @Schema(name = "allocateTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allocateTickets")
  public @Nullable Boolean getAllocateTickets() {
    return allocateTickets;
  }

  public void setAllocateTickets(@Nullable Boolean allocateTickets) {
    this.allocateTickets = allocateTickets;
  }

  public Game allGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
    return this;
  }

  public Game addAllGameLevelsItem(GameLevel allGameLevelsItem) {
    if (this.allGameLevels == null) {
      this.allGameLevels = new ArrayList<>();
    }
    this.allGameLevels.add(allGameLevelsItem);
    return this;
  }

  /**
   * Get allGameLevels
   * @return allGameLevels
   */
  @Valid 
  @Schema(name = "allGameLevels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allGameLevels")
  public List<@Valid GameLevel> getAllGameLevels() {
    return allGameLevels;
  }

  public void setAllGameLevels(List<@Valid GameLevel> allGameLevels) {
    this.allGameLevels = allGameLevels;
  }

  public Game contentName(@Nullable String contentName) {
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

  public Game contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "contentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.active, game.active) &&
        Objects.equals(this.valid, game.valid) &&
        Objects.equals(this.owner, game.owner) &&
        Objects.equals(this.application, game.application) &&
        Objects.equals(this.title, game.title) &&
        Objects.equals(this.description, game.description) &&
        Objects.equals(this.startDate, game.startDate) &&
        Objects.equals(this.endDate, game.endDate) &&
        Objects.equals(this.packs, game.packs) &&
        Objects.equals(this.sequenceType, game.sequenceType) &&
        Objects.equals(this.authorOverride, game.authorOverride) &&
        Objects.equals(this.icon, game.icon) &&
        Objects.equals(this.image, game.image) &&
        Objects.equals(this.points, game.points) &&
        Objects.equals(this.ticketType, game.ticketType) &&
        Objects.equals(this.ticketCount, game.ticketCount) &&
        Objects.equals(this.allocateTickets, game.allocateTickets) &&
        Objects.equals(this.allGameLevels, game.allGameLevels) &&
        Objects.equals(this.contentName, game.contentName) &&
        Objects.equals(this.contentType, game.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, application, title, description, startDate, endDate, packs, sequenceType, authorOverride, icon, image, points, ticketType, ticketCount, allocateTickets, allGameLevels, contentName, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
    sb.append("    sequenceType: ").append(toIndentedString(sequenceType)).append("\n");
    sb.append("    authorOverride: ").append(toIndentedString(authorOverride)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
    sb.append("    allocateTickets: ").append(toIndentedString(allocateTickets)).append("\n");
    sb.append("    allGameLevels: ").append(toIndentedString(allGameLevels)).append("\n");
    sb.append("    contentName: ").append(toIndentedString(contentName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

