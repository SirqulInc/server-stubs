package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.PurchaseItemShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TicketResponse   {
  

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),

        SAVE("SAVE"),

        DELETE("DELETE"),

        GET("GET");
    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ActionEnum action;
  private Long id;
  private Long accountId;
  private Long objectId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    GAME_OBJECT("GAME_OBJECT"),

        GAME_LEVEL("GAME_LEVEL"),

        PACK("PACK"),

        GAME("GAME"),

        MISSION("MISSION"),

        PROFILE("PROFILE"),

        APPLICATION("APPLICATION"),

        TICKETS("TICKETS"),

        ASSET("ASSET"),

        CUSTOM("CUSTOM");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;

  /**
   * Gets or Sets actionType
   */
  public enum ActionTypeEnum {
    COMPLETED("COMPLETED"),

        REDEEMED("REDEEMED"),

        USERS_PLAYED("USERS_PLAYED"),

        TOURNAMENT_OWNER("TOURNAMENT_OWNER"),

        PURCHASED("PURCHASED"),

        SUMATION("SUMATION"),

        GIFTED("GIFTED"),

        REFUNDED("REFUNDED");
    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ActionTypeEnum actionType;
  private Long used;
  private Long count;
  private PurchaseItemShortResponse purchaseItem;
  private String customMessage;
  private AccountShortResponse sender;
  private List<@Valid AccountShortResponse> receiver = new ArrayList<>();
  private AssetShortResponse customAsset;
  private String receiptToken;
  private String ticketType;
  private ApplicationShortResponse application;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

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
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("objectId")
  public Long getObjectId() {
    return objectId;
  }
  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("used")
  public Long getUsed() {
    return used;
  }
  public void setUsed(Long used) {
    this.used = used;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("purchaseItem")
  @Valid
  public PurchaseItemShortResponse getPurchaseItem() {
    return purchaseItem;
  }
  public void setPurchaseItem(PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customMessage")
  public String getCustomMessage() {
    return customMessage;
  }
  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sender")
  @Valid
  public AccountShortResponse getSender() {
    return sender;
  }
  public void setSender(AccountShortResponse sender) {
    this.sender = sender;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receiver")
  @Valid
  public List<@Valid AccountShortResponse> getReceiver() {
    return receiver;
  }
  public void setReceiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("customAsset")
  @Valid
  public AssetShortResponse getCustomAsset() {
    return customAsset;
  }
  public void setCustomAsset(AssetShortResponse customAsset) {
    this.customAsset = customAsset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("receiptToken")
  public String getReceiptToken() {
    return receiptToken;
  }
  public void setReceiptToken(String receiptToken) {
    this.receiptToken = receiptToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }
  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationShortResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketResponse ticketResponse = (TicketResponse) o;
    return Objects.equals(this.action, ticketResponse.action) &&
        Objects.equals(this.id, ticketResponse.id) &&
        Objects.equals(this.accountId, ticketResponse.accountId) &&
        Objects.equals(this.objectId, ticketResponse.objectId) &&
        Objects.equals(this.type, ticketResponse.type) &&
        Objects.equals(this.actionType, ticketResponse.actionType) &&
        Objects.equals(this.used, ticketResponse.used) &&
        Objects.equals(this.count, ticketResponse.count) &&
        Objects.equals(this.purchaseItem, ticketResponse.purchaseItem) &&
        Objects.equals(this.customMessage, ticketResponse.customMessage) &&
        Objects.equals(this.sender, ticketResponse.sender) &&
        Objects.equals(this.receiver, ticketResponse.receiver) &&
        Objects.equals(this.customAsset, ticketResponse.customAsset) &&
        Objects.equals(this.receiptToken, ticketResponse.receiptToken) &&
        Objects.equals(this.ticketType, ticketResponse.ticketType) &&
        Objects.equals(this.application, ticketResponse.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, id, accountId, objectId, type, actionType, used, count, purchaseItem, customMessage, sender, receiver, customAsset, receiptToken, ticketType, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    purchaseItem: ").append(toIndentedString(purchaseItem)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    customAsset: ").append(toIndentedString(customAsset)).append("\n");
    sb.append("    receiptToken: ").append(toIndentedString(receiptToken)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

