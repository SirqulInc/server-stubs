package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChartData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ChartData {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable String identifier;

  private @Nullable String idAttribute;

  private @Nullable String label;

  private @Nullable Long maxValue;

  private @Nullable Long totalCount;

  @Valid
  private List<Object> items = new ArrayList<>();

  @Valid
  private List<Object> aggregatedItems = new ArrayList<>();

  private @Nullable String caption;

  private @Nullable String showAnchor;

  private @Nullable String anchorAlpha;

  private @Nullable String getxAxisName;

  private @Nullable String getyAxisMinValue;

  private @Nullable String getyAxisName;

  private @Nullable String decimalPrecision;

  private @Nullable String formatNumberScale;

  private @Nullable String numberPrefix;

  private @Nullable String showNames;

  private @Nullable String showValues;

  private @Nullable String showAlternateHGridColor;

  private @Nullable String alternateHGridColor;

  private @Nullable String divLineColor;

  private @Nullable String divLineAlpha;

  private @Nullable String alternateHGridAlpha;

  private @Nullable String rotateNames;

  private @Nullable String returning;

  public ChartData valid(@Nullable Boolean valid) {
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

  public ChartData message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ChartData version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public ChartData serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ChartData startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ChartData errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public ChartData request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ChartData addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ChartData identifier(@Nullable String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
   */
  
  @Schema(name = "identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identifier")
  public @Nullable String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(@Nullable String identifier) {
    this.identifier = identifier;
  }

  public ChartData idAttribute(@Nullable String idAttribute) {
    this.idAttribute = idAttribute;
    return this;
  }

  /**
   * Get idAttribute
   * @return idAttribute
   */
  
  @Schema(name = "idAttribute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idAttribute")
  public @Nullable String getIdAttribute() {
    return idAttribute;
  }

  public void setIdAttribute(@Nullable String idAttribute) {
    this.idAttribute = idAttribute;
  }

  public ChartData label(@Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  
  @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public @Nullable String getLabel() {
    return label;
  }

  public void setLabel(@Nullable String label) {
    this.label = label;
  }

  public ChartData maxValue(@Nullable Long maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Get maxValue
   * @return maxValue
   */
  
  @Schema(name = "maxValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxValue")
  public @Nullable Long getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(@Nullable Long maxValue) {
    this.maxValue = maxValue;
  }

  public ChartData totalCount(@Nullable Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  
  @Schema(name = "totalCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCount")
  public @Nullable Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(@Nullable Long totalCount) {
    this.totalCount = totalCount;
  }

  public ChartData items(List<Object> items) {
    this.items = items;
    return this;
  }

  public ChartData addItemsItem(Object itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }

  public void setItems(List<Object> items) {
    this.items = items;
  }

  public ChartData aggregatedItems(List<Object> aggregatedItems) {
    this.aggregatedItems = aggregatedItems;
    return this;
  }

  public ChartData addAggregatedItemsItem(Object aggregatedItemsItem) {
    if (this.aggregatedItems == null) {
      this.aggregatedItems = new ArrayList<>();
    }
    this.aggregatedItems.add(aggregatedItemsItem);
    return this;
  }

  /**
   * Get aggregatedItems
   * @return aggregatedItems
   */
  
  @Schema(name = "aggregatedItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aggregatedItems")
  public List<Object> getAggregatedItems() {
    return aggregatedItems;
  }

  public void setAggregatedItems(List<Object> aggregatedItems) {
    this.aggregatedItems = aggregatedItems;
  }

  public ChartData caption(@Nullable String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   * @return caption
   */
  
  @Schema(name = "caption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caption")
  public @Nullable String getCaption() {
    return caption;
  }

  public void setCaption(@Nullable String caption) {
    this.caption = caption;
  }

  public ChartData showAnchor(@Nullable String showAnchor) {
    this.showAnchor = showAnchor;
    return this;
  }

  /**
   * Get showAnchor
   * @return showAnchor
   */
  
  @Schema(name = "showAnchor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showAnchor")
  public @Nullable String getShowAnchor() {
    return showAnchor;
  }

  public void setShowAnchor(@Nullable String showAnchor) {
    this.showAnchor = showAnchor;
  }

  public ChartData anchorAlpha(@Nullable String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
    return this;
  }

  /**
   * Get anchorAlpha
   * @return anchorAlpha
   */
  
  @Schema(name = "anchorAlpha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anchorAlpha")
  public @Nullable String getAnchorAlpha() {
    return anchorAlpha;
  }

  public void setAnchorAlpha(@Nullable String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
  }

  public ChartData getxAxisName(@Nullable String getxAxisName) {
    this.getxAxisName = getxAxisName;
    return this;
  }

  /**
   * Get getxAxisName
   * @return getxAxisName
   */
  
  @Schema(name = "getxAxisName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("getxAxisName")
  public @Nullable String getGetxAxisName() {
    return getxAxisName;
  }

  public void setGetxAxisName(@Nullable String getxAxisName) {
    this.getxAxisName = getxAxisName;
  }

  public ChartData getyAxisMinValue(@Nullable String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
    return this;
  }

  /**
   * Get getyAxisMinValue
   * @return getyAxisMinValue
   */
  
  @Schema(name = "getyAxisMinValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("getyAxisMinValue")
  public @Nullable String getGetyAxisMinValue() {
    return getyAxisMinValue;
  }

  public void setGetyAxisMinValue(@Nullable String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
  }

  public ChartData getyAxisName(@Nullable String getyAxisName) {
    this.getyAxisName = getyAxisName;
    return this;
  }

  /**
   * Get getyAxisName
   * @return getyAxisName
   */
  
  @Schema(name = "getyAxisName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("getyAxisName")
  public @Nullable String getGetyAxisName() {
    return getyAxisName;
  }

  public void setGetyAxisName(@Nullable String getyAxisName) {
    this.getyAxisName = getyAxisName;
  }

  public ChartData decimalPrecision(@Nullable String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
    return this;
  }

  /**
   * Get decimalPrecision
   * @return decimalPrecision
   */
  
  @Schema(name = "decimalPrecision", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decimalPrecision")
  public @Nullable String getDecimalPrecision() {
    return decimalPrecision;
  }

  public void setDecimalPrecision(@Nullable String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }

  public ChartData formatNumberScale(@Nullable String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
    return this;
  }

  /**
   * Get formatNumberScale
   * @return formatNumberScale
   */
  
  @Schema(name = "formatNumberScale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formatNumberScale")
  public @Nullable String getFormatNumberScale() {
    return formatNumberScale;
  }

  public void setFormatNumberScale(@Nullable String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
  }

  public ChartData numberPrefix(@Nullable String numberPrefix) {
    this.numberPrefix = numberPrefix;
    return this;
  }

  /**
   * Get numberPrefix
   * @return numberPrefix
   */
  
  @Schema(name = "numberPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberPrefix")
  public @Nullable String getNumberPrefix() {
    return numberPrefix;
  }

  public void setNumberPrefix(@Nullable String numberPrefix) {
    this.numberPrefix = numberPrefix;
  }

  public ChartData showNames(@Nullable String showNames) {
    this.showNames = showNames;
    return this;
  }

  /**
   * Get showNames
   * @return showNames
   */
  
  @Schema(name = "showNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showNames")
  public @Nullable String getShowNames() {
    return showNames;
  }

  public void setShowNames(@Nullable String showNames) {
    this.showNames = showNames;
  }

  public ChartData showValues(@Nullable String showValues) {
    this.showValues = showValues;
    return this;
  }

  /**
   * Get showValues
   * @return showValues
   */
  
  @Schema(name = "showValues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showValues")
  public @Nullable String getShowValues() {
    return showValues;
  }

  public void setShowValues(@Nullable String showValues) {
    this.showValues = showValues;
  }

  public ChartData showAlternateHGridColor(@Nullable String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
    return this;
  }

  /**
   * Get showAlternateHGridColor
   * @return showAlternateHGridColor
   */
  
  @Schema(name = "showAlternateHGridColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("showAlternateHGridColor")
  public @Nullable String getShowAlternateHGridColor() {
    return showAlternateHGridColor;
  }

  public void setShowAlternateHGridColor(@Nullable String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
  }

  public ChartData alternateHGridColor(@Nullable String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
    return this;
  }

  /**
   * Get alternateHGridColor
   * @return alternateHGridColor
   */
  
  @Schema(name = "alternateHGridColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternateHGridColor")
  public @Nullable String getAlternateHGridColor() {
    return alternateHGridColor;
  }

  public void setAlternateHGridColor(@Nullable String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
  }

  public ChartData divLineColor(@Nullable String divLineColor) {
    this.divLineColor = divLineColor;
    return this;
  }

  /**
   * Get divLineColor
   * @return divLineColor
   */
  
  @Schema(name = "divLineColor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("divLineColor")
  public @Nullable String getDivLineColor() {
    return divLineColor;
  }

  public void setDivLineColor(@Nullable String divLineColor) {
    this.divLineColor = divLineColor;
  }

  public ChartData divLineAlpha(@Nullable String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
    return this;
  }

  /**
   * Get divLineAlpha
   * @return divLineAlpha
   */
  
  @Schema(name = "divLineAlpha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("divLineAlpha")
  public @Nullable String getDivLineAlpha() {
    return divLineAlpha;
  }

  public void setDivLineAlpha(@Nullable String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
  }

  public ChartData alternateHGridAlpha(@Nullable String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
    return this;
  }

  /**
   * Get alternateHGridAlpha
   * @return alternateHGridAlpha
   */
  
  @Schema(name = "alternateHGridAlpha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternateHGridAlpha")
  public @Nullable String getAlternateHGridAlpha() {
    return alternateHGridAlpha;
  }

  public void setAlternateHGridAlpha(@Nullable String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
  }

  public ChartData rotateNames(@Nullable String rotateNames) {
    this.rotateNames = rotateNames;
    return this;
  }

  /**
   * Get rotateNames
   * @return rotateNames
   */
  
  @Schema(name = "rotateNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rotateNames")
  public @Nullable String getRotateNames() {
    return rotateNames;
  }

  public void setRotateNames(@Nullable String rotateNames) {
    this.rotateNames = rotateNames;
  }

  public ChartData returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartData chartData = (ChartData) o;
    return Objects.equals(this.valid, chartData.valid) &&
        Objects.equals(this.message, chartData.message) &&
        Objects.equals(this.version, chartData.version) &&
        Objects.equals(this.serializeNulls, chartData.serializeNulls) &&
        Objects.equals(this.startTimeLog, chartData.startTimeLog) &&
        Objects.equals(this.errorCode, chartData.errorCode) &&
        Objects.equals(this.request, chartData.request) &&
        Objects.equals(this.identifier, chartData.identifier) &&
        Objects.equals(this.idAttribute, chartData.idAttribute) &&
        Objects.equals(this.label, chartData.label) &&
        Objects.equals(this.maxValue, chartData.maxValue) &&
        Objects.equals(this.totalCount, chartData.totalCount) &&
        Objects.equals(this.items, chartData.items) &&
        Objects.equals(this.aggregatedItems, chartData.aggregatedItems) &&
        Objects.equals(this.caption, chartData.caption) &&
        Objects.equals(this.showAnchor, chartData.showAnchor) &&
        Objects.equals(this.anchorAlpha, chartData.anchorAlpha) &&
        Objects.equals(this.getxAxisName, chartData.getxAxisName) &&
        Objects.equals(this.getyAxisMinValue, chartData.getyAxisMinValue) &&
        Objects.equals(this.getyAxisName, chartData.getyAxisName) &&
        Objects.equals(this.decimalPrecision, chartData.decimalPrecision) &&
        Objects.equals(this.formatNumberScale, chartData.formatNumberScale) &&
        Objects.equals(this.numberPrefix, chartData.numberPrefix) &&
        Objects.equals(this.showNames, chartData.showNames) &&
        Objects.equals(this.showValues, chartData.showValues) &&
        Objects.equals(this.showAlternateHGridColor, chartData.showAlternateHGridColor) &&
        Objects.equals(this.alternateHGridColor, chartData.alternateHGridColor) &&
        Objects.equals(this.divLineColor, chartData.divLineColor) &&
        Objects.equals(this.divLineAlpha, chartData.divLineAlpha) &&
        Objects.equals(this.alternateHGridAlpha, chartData.alternateHGridAlpha) &&
        Objects.equals(this.rotateNames, chartData.rotateNames) &&
        Objects.equals(this.returning, chartData.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, identifier, idAttribute, label, maxValue, totalCount, items, aggregatedItems, caption, showAnchor, anchorAlpha, getxAxisName, getyAxisMinValue, getyAxisName, decimalPrecision, formatNumberScale, numberPrefix, showNames, showValues, showAlternateHGridColor, alternateHGridColor, divLineColor, divLineAlpha, alternateHGridAlpha, rotateNames, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartData {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    idAttribute: ").append(toIndentedString(idAttribute)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    aggregatedItems: ").append(toIndentedString(aggregatedItems)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    showAnchor: ").append(toIndentedString(showAnchor)).append("\n");
    sb.append("    anchorAlpha: ").append(toIndentedString(anchorAlpha)).append("\n");
    sb.append("    getxAxisName: ").append(toIndentedString(getxAxisName)).append("\n");
    sb.append("    getyAxisMinValue: ").append(toIndentedString(getyAxisMinValue)).append("\n");
    sb.append("    getyAxisName: ").append(toIndentedString(getyAxisName)).append("\n");
    sb.append("    decimalPrecision: ").append(toIndentedString(decimalPrecision)).append("\n");
    sb.append("    formatNumberScale: ").append(toIndentedString(formatNumberScale)).append("\n");
    sb.append("    numberPrefix: ").append(toIndentedString(numberPrefix)).append("\n");
    sb.append("    showNames: ").append(toIndentedString(showNames)).append("\n");
    sb.append("    showValues: ").append(toIndentedString(showValues)).append("\n");
    sb.append("    showAlternateHGridColor: ").append(toIndentedString(showAlternateHGridColor)).append("\n");
    sb.append("    alternateHGridColor: ").append(toIndentedString(alternateHGridColor)).append("\n");
    sb.append("    divLineColor: ").append(toIndentedString(divLineColor)).append("\n");
    sb.append("    divLineAlpha: ").append(toIndentedString(divLineAlpha)).append("\n");
    sb.append("    alternateHGridAlpha: ").append(toIndentedString(alternateHGridAlpha)).append("\n");
    sb.append("    rotateNames: ").append(toIndentedString(rotateNames)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
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

