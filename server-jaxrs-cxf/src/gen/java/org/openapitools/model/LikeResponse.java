package org.openapitools.model;

import org.openapitools.model.AccountShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LikeResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse account;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  public LikeResponse account(AccountShortResponse account) {
    this.account = account;
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
    LikeResponse likeResponse = (LikeResponse) o;
    return Objects.equals(this.account, likeResponse.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LikeResponse {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

