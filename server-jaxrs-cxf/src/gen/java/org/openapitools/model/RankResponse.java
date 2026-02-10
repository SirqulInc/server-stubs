package org.openapitools.model;

import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RankResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse owner;

  @ApiModelProperty(value = "")

  private String rank;

  @ApiModelProperty(value = "")

  private Long scoreValue;

  @ApiModelProperty(value = "")

  private Long timeValue;

  @ApiModelProperty(value = "")

  private Long countValue;

  @ApiModelProperty(value = "")

  private Long updated;
 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public RankResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get rank
   * @return rank
  **/
  @JsonProperty("rank")
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public RankResponse rank(String rank) {
    this.rank = rank;
    return this;
  }

 /**
   * Get scoreValue
   * @return scoreValue
  **/
  @JsonProperty("scoreValue")
  public Long getScoreValue() {
    return scoreValue;
  }

  public void setScoreValue(Long scoreValue) {
    this.scoreValue = scoreValue;
  }

  public RankResponse scoreValue(Long scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

 /**
   * Get timeValue
   * @return timeValue
  **/
  @JsonProperty("timeValue")
  public Long getTimeValue() {
    return timeValue;
  }

  public void setTimeValue(Long timeValue) {
    this.timeValue = timeValue;
  }

  public RankResponse timeValue(Long timeValue) {
    this.timeValue = timeValue;
    return this;
  }

 /**
   * Get countValue
   * @return countValue
  **/
  @JsonProperty("countValue")
  public Long getCountValue() {
    return countValue;
  }

  public void setCountValue(Long countValue) {
    this.countValue = countValue;
  }

  public RankResponse countValue(Long countValue) {
    this.countValue = countValue;
    return this;
  }

 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public RankResponse updated(Long updated) {
    this.updated = updated;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

