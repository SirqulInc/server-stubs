package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.PurchaseItemShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TicketResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TicketResponse {

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    DATA("DATA"),
    
    SAVE("SAVE"),
    
    DELETE("DELETE"),
    
    GET("GET");

    private final String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ActionEnum action;

  private @Nullable Long id;

  private @Nullable Long accountId;

  private @Nullable Long objectId;

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

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

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

    private final String value;

    ActionTypeEnum(String value) {
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
    public static ActionTypeEnum fromValue(String value) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ActionTypeEnum actionType;

  private @Nullable Long used;

  private @Nullable Long count;

  private @Nullable PurchaseItemShortResponse purchaseItem;

  private @Nullable String customMessage;

  private @Nullable AccountShortResponse sender;

  @Valid
  private List<@Valid AccountShortResponse> receiver = new ArrayList<>();

  private @Nullable AssetShortResponse customAsset;

  private @Nullable String receiptToken;

  private @Nullable String ticketType;

  private @Nullable ApplicationShortResponse application;

  public TicketResponse action(@Nullable ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable ActionEnum getAction() {
    return action;
  }

  public void setAction(@Nullable ActionEnum action) {
    this.action = action;
  }

  public TicketResponse id(@Nullable Long id) {
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

  public TicketResponse accountId(@Nullable Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  
  @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public @Nullable Long getAccountId() {
    return accountId;
  }

  public void setAccountId(@Nullable Long accountId) {
    this.accountId = accountId;
  }

  public TicketResponse objectId(@Nullable Long objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * Get objectId
   * @return objectId
   */
  
  @Schema(name = "objectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectId")
  public @Nullable Long getObjectId() {
    return objectId;
  }

  public void setObjectId(@Nullable Long objectId) {
    this.objectId = objectId;
  }

  public TicketResponse type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public TicketResponse actionType(@Nullable ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   * @return actionType
   */
  
  @Schema(name = "actionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actionType")
  public @Nullable ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(@Nullable ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public TicketResponse used(@Nullable Long used) {
    this.used = used;
    return this;
  }

  /**
   * Get used
   * @return used
   */
  
  @Schema(name = "used", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("used")
  public @Nullable Long getUsed() {
    return used;
  }

  public void setUsed(@Nullable Long used) {
    this.used = used;
  }

  public TicketResponse count(@Nullable Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  
  @Schema(name = "count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable Long getCount() {
    return count;
  }

  public void setCount(@Nullable Long count) {
    this.count = count;
  }

  public TicketResponse purchaseItem(@Nullable PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
    return this;
  }

  /**
   * Get purchaseItem
   * @return purchaseItem
   */
  @Valid 
  @Schema(name = "purchaseItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseItem")
  public @Nullable PurchaseItemShortResponse getPurchaseItem() {
    return purchaseItem;
  }

  public void setPurchaseItem(@Nullable PurchaseItemShortResponse purchaseItem) {
    this.purchaseItem = purchaseItem;
  }

  public TicketResponse customMessage(@Nullable String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

  /**
   * Get customMessage
   * @return customMessage
   */
  
  @Schema(name = "customMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customMessage")
  public @Nullable String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(@Nullable String customMessage) {
    this.customMessage = customMessage;
  }

  public TicketResponse sender(@Nullable AccountShortResponse sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @Valid 
  @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sender")
  public @Nullable AccountShortResponse getSender() {
    return sender;
  }

  public void setSender(@Nullable AccountShortResponse sender) {
    this.sender = sender;
  }

  public TicketResponse receiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
    return this;
  }

  public TicketResponse addReceiverItem(AccountShortResponse receiverItem) {
    if (this.receiver == null) {
      this.receiver = new ArrayList<>();
    }
    this.receiver.add(receiverItem);
    return this;
  }

  /**
   * Get receiver
   * @return receiver
   */
  @Valid 
  @Schema(name = "receiver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receiver")
  public List<@Valid AccountShortResponse> getReceiver() {
    return receiver;
  }

  public void setReceiver(List<@Valid AccountShortResponse> receiver) {
    this.receiver = receiver;
  }

  public TicketResponse customAsset(@Nullable AssetShortResponse customAsset) {
    this.customAsset = customAsset;
    return this;
  }

  /**
   * Get customAsset
   * @return customAsset
   */
  @Valid 
  @Schema(name = "customAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customAsset")
  public @Nullable AssetShortResponse getCustomAsset() {
    return customAsset;
  }

  public void setCustomAsset(@Nullable AssetShortResponse customAsset) {
    this.customAsset = customAsset;
  }

  public TicketResponse receiptToken(@Nullable String receiptToken) {
    this.receiptToken = receiptToken;
    return this;
  }

  /**
   * Get receiptToken
   * @return receiptToken
   */
  
  @Schema(name = "receiptToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receiptToken")
  public @Nullable String getReceiptToken() {
    return receiptToken;
  }

  public void setReceiptToken(@Nullable String receiptToken) {
    this.receiptToken = receiptToken;
  }

  public TicketResponse ticketType(@Nullable String ticketType) {
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

  public TicketResponse application(@Nullable ApplicationShortResponse application) {
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
  public @Nullable ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationShortResponse application) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

