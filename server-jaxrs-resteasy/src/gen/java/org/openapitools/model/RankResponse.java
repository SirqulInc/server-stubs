package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RankResponse   {
  
  private AccountShortResponse owner;
  private String rank;
  private Long scoreValue;
  private Long timeValue;
  private Long countValue;
  private Long updated;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  @Valid
  public AccountShortResponse getOwner() {
    return owner;
  }
  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rank")
  public String getRank() {
    return rank;
  }
  public void setRank(String rank) {
    this.rank = rank;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scoreValue")
  public Long getScoreValue() {
    return scoreValue;
  }
  public void setScoreValue(Long scoreValue) {
    this.scoreValue = scoreValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeValue")
  public Long getTimeValue() {
    return timeValue;
  }
  public void setTimeValue(Long timeValue) {
    this.timeValue = timeValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("countValue")
  public Long getCountValue() {
    return countValue;
  }
  public void setCountValue(Long countValue) {
    this.countValue = countValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

