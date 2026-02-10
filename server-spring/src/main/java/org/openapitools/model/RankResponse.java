package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccountShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RankResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankResponse {

  private @Nullable AccountShortResponse owner;

  private @Nullable String rank;

  private @Nullable Long scoreValue;

  private @Nullable Long timeValue;

  private @Nullable Long countValue;

  private @Nullable Long updated;

  public RankResponse owner(@Nullable AccountShortResponse owner) {
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
  public @Nullable AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(@Nullable AccountShortResponse owner) {
    this.owner = owner;
  }

  public RankResponse rank(@Nullable String rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   * @return rank
   */
  
  @Schema(name = "rank", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rank")
  public @Nullable String getRank() {
    return rank;
  }

  public void setRank(@Nullable String rank) {
    this.rank = rank;
  }

  public RankResponse scoreValue(@Nullable Long scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

  /**
   * Get scoreValue
   * @return scoreValue
   */
  
  @Schema(name = "scoreValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoreValue")
  public @Nullable Long getScoreValue() {
    return scoreValue;
  }

  public void setScoreValue(@Nullable Long scoreValue) {
    this.scoreValue = scoreValue;
  }

  public RankResponse timeValue(@Nullable Long timeValue) {
    this.timeValue = timeValue;
    return this;
  }

  /**
   * Get timeValue
   * @return timeValue
   */
  
  @Schema(name = "timeValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeValue")
  public @Nullable Long getTimeValue() {
    return timeValue;
  }

  public void setTimeValue(@Nullable Long timeValue) {
    this.timeValue = timeValue;
  }

  public RankResponse countValue(@Nullable Long countValue) {
    this.countValue = countValue;
    return this;
  }

  /**
   * Get countValue
   * @return countValue
   */
  
  @Schema(name = "countValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countValue")
  public @Nullable Long getCountValue() {
    return countValue;
  }

  public void setCountValue(@Nullable Long countValue) {
    this.countValue = countValue;
  }

  public RankResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankResponse rankResponse = (RankResponse) o;
    return Objects.equals(this.owner, rankResponse.owner) &&
        Objects.equals(this.rank, rankResponse.rank) &&
        Objects.equals(this.scoreValue, rankResponse.scoreValue) &&
        Objects.equals(this.timeValue, rankResponse.timeValue) &&
        Objects.equals(this.countValue, rankResponse.countValue) &&
        Objects.equals(this.updated, rankResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, rank, scoreValue, timeValue, countValue, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankResponse {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    scoreValue: ").append(toIndentedString(scoreValue)).append("\n");
    sb.append("    timeValue: ").append(toIndentedString(timeValue)).append("\n");
    sb.append("    countValue: ").append(toIndentedString(countValue)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

