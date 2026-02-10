package apimodels;

import apimodels.AccountShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RankResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RankResponse   {
  @JsonProperty("owner")
  @Valid

  private AccountShortResponse owner;

  @JsonProperty("rank")
  
  private String rank;

  @JsonProperty("scoreValue")
  
  private Long scoreValue;

  @JsonProperty("timeValue")
  
  private Long timeValue;

  @JsonProperty("countValue")
  
  private Long countValue;

  @JsonProperty("updated")
  
  private Long updated;

  public RankResponse owner(AccountShortResponse owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  public AccountShortResponse getOwner() {
    return owner;
  }

  public void setOwner(AccountShortResponse owner) {
    this.owner = owner;
  }

  public RankResponse rank(String rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public RankResponse scoreValue(Long scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

   /**
   * Get scoreValue
   * @return scoreValue
  **/
  public Long getScoreValue() {
    return scoreValue;
  }

  public void setScoreValue(Long scoreValue) {
    this.scoreValue = scoreValue;
  }

  public RankResponse timeValue(Long timeValue) {
    this.timeValue = timeValue;
    return this;
  }

   /**
   * Get timeValue
   * @return timeValue
  **/
  public Long getTimeValue() {
    return timeValue;
  }

  public void setTimeValue(Long timeValue) {
    this.timeValue = timeValue;
  }

  public RankResponse countValue(Long countValue) {
    this.countValue = countValue;
    return this;
  }

   /**
   * Get countValue
   * @return countValue
  **/
  public Long getCountValue() {
    return countValue;
  }

  public void setCountValue(Long countValue) {
    this.countValue = countValue;
  }

  public RankResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
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
    return Objects.equals(owner, rankResponse.owner) &&
        Objects.equals(rank, rankResponse.rank) &&
        Objects.equals(scoreValue, rankResponse.scoreValue) &&
        Objects.equals(timeValue, rankResponse.timeValue) &&
        Objects.equals(countValue, rankResponse.countValue) &&
        Objects.equals(updated, rankResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, rank, scoreValue, timeValue, countValue, updated);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

