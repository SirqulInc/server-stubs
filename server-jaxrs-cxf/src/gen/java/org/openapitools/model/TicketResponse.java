package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.PurchaseItemShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TicketResponse  {
  
public enum ActionEnum {

DATA(String.valueOf("DATA")), SAVE(String.valueOf("SAVE")), DELETE(String.valueOf("DELETE")), GET(String.valueOf("GET"));


    private String value;

    ActionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
        for (ActionEnum b : ActionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ActionEnum action;

  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  private Long objectId;

public enum TypeEnum {

GAME_OBJECT(String.valueOf("GAME_OBJECT")), GAME_LEVEL(String.valueOf("GAME_LEVEL")), PACK(String.valueOf("PACK")), GAME(String.valueOf("GAME")), MISSION(String.valueOf("MISSION")), PROFILE(String.valueOf("PROFILE")), APPLICATION(String.valueOf("APPLICATION")), TICKETS(String.valueOf("TICKETS")), ASSET(String.valueOf("ASSET")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TypeEnum type;

public enum ActionTypeEnum {

COMPLETED(String.valueOf("COMPLETED")), REDEEMED(String.valueOf("REDEEMED")), USERS_PLAYED(String.valueOf("USERS_PLAYED")), TOURNAMENT_OWNER(String.valueOf("TOURNAMENT_OWNER")), PURCHASED(String.valueOf("PURCHASED")), SUMATION(String.valueOf("SUMATION")), GIFTED(String.valueOf("GIFTED")), REFUNDED(String.valueOf("REFUNDED"));


    private String value;

    ActionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ActionTypeEnum fromValue(String value) {
        for (ActionTypeEnum b : ActionTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ActionTypeEnum actionType;

  @ApiModelProperty(value = "")

  private Long used;

  @ApiModelProperty(value = "")

  private Long count;

  @ApiModelProperty(value = "")

  @Valid

  private PurchaseItemShortResponse purchaseItem;

  @ApiModelProperty(value = "")

  private String customMessage;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse sender;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid AccountShortResponse> receiver = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse customAsset;

  @ApiModelProperty(value = "")

  private String receiptToken;

  @ApiModelProperty(value = "")

  private String ticketType;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationShortResponse application;
 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    if (action == null) {
      return null;
    }
    return action.value();
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public TicketResponse action(ActionEnum action) {
    this.action = action;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TicketResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public TicketResponse accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get objectId
   * @return objectId
  **/
  @JsonProperty("objectId")
  public Long getObjectId() {
    return objectId;
  }

  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }

  public TicketResponse objectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TicketResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get actionType
   * @return actionType
  **/
  @JsonProperty("actionType")
  public String getActionType() {
    if (actionType == null) {
      return null;
    }
    return actionType.value();
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public TicketResponse actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

 /**
   * Get used
   * @return used
  **/
  @JsonProperty("used")
  public Long getUsed() {
    return used;
  }

  public void setUsed(Long used) {
    this.used = used;
  }

  public TicketResponse used(Long used) {
    this.used = used;
    return this;
  }

 /**
   * Get count
   * @return count
  **/
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public TicketResponse count(Long count) {
    this.count = count;
    return this;
  }

 /**
   * Get purchaseItem
   * @return purchaseItem
  **/
  @JsonProperty("purchaseItem")
  public PurchaseItemShortResponse getPurchaseItem() {
    return purchaseItem;
  }

  public void setPurchaseItem(PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
  }

  public TicketResponse purchaseItem(PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
    return this;
  }

 /**
   * Get customMessage
   * @return customMessage
  **/
  @JsonProperty("customMessage")
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  public TicketResponse customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

 /**
   * Get sender
   * @return sender
  **/
  @JsonProperty("sender")
  public AccountShortResponse getSender() {
    return sender;
  }

  public void setSender(AccountShortResponse sender) {
    this.sender = sender;
  }

  public TicketResponse sender(AccountShortResponse sender) {
    this.sender = sender;
    return this;
  }

 /**
   * Get receiver
   * @return receiver
  **/
  @JsonProperty("receiver")
  public List<@Valid AccountShortResponse> getReceiver() {
    return receiver;
  }

  public void setReceiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
  }

  public TicketResponse receiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
    return this;
  }

  public TicketResponse addReceiverItem(AccountShortResponse receiverItem) {
    this.receiver.add(receiverItem);
    return this;
  }

 /**
   * Get customAsset
   * @return customAsset
  **/
  @JsonProperty("customAsset")
  public AssetShortResponse getCustomAsset() {
    return customAsset;
  }

  public void setCustomAsset(AssetShortResponse customAsset) {
    this.customAsset = customAsset;
  }

  public TicketResponse customAsset(AssetShortResponse customAsset) {
    this.customAsset = customAsset;
    return this;
  }

 /**
   * Get receiptToken
   * @return receiptToken
  **/
  @JsonProperty("receiptToken")
  public String getReceiptToken() {
    return receiptToken;
  }

  public void setReceiptToken(String receiptToken) {
    this.receiptToken = receiptToken;
  }

  public TicketResponse receiptToken(String receiptToken) {
    this.receiptToken = receiptToken;
    return this;
  }

 /**
   * Get ticketType
   * @return ticketType
  **/
  @JsonProperty("ticketType")
  public String getTicketType() {
    return ticketType;
  }

  public void setTicketType(String ticketType) {
    this.ticketType = ticketType;
  }

  public TicketResponse ticketType(String ticketType) {
    this.ticketType = ticketType;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }

  public TicketResponse application(ApplicationShortResponse application) {
    this.application = application;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

