package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChartData  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String identifier;

  @ApiModelProperty(value = "")

  private String idAttribute;

  @ApiModelProperty(value = "")

  private String label;

  @ApiModelProperty(value = "")

  private Long maxValue;

  @ApiModelProperty(value = "")

  private Long totalCount;

  @ApiModelProperty(value = "")

  private List<Object> items = new ArrayList<>();

  @ApiModelProperty(value = "")

  private List<Object> aggregatedItems = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String caption;

  @ApiModelProperty(value = "")

  private String showAnchor;

  @ApiModelProperty(value = "")

  private String anchorAlpha;

  @ApiModelProperty(value = "")

  private String getxAxisName;

  @ApiModelProperty(value = "")

  private String getyAxisMinValue;

  @ApiModelProperty(value = "")

  private String getyAxisName;

  @ApiModelProperty(value = "")

  private String decimalPrecision;

  @ApiModelProperty(value = "")

  private String formatNumberScale;

  @ApiModelProperty(value = "")

  private String numberPrefix;

  @ApiModelProperty(value = "")

  private String showNames;

  @ApiModelProperty(value = "")

  private String showValues;

  @ApiModelProperty(value = "")

  private String showAlternateHGridColor;

  @ApiModelProperty(value = "")

  private String alternateHGridColor;

  @ApiModelProperty(value = "")

  private String divLineColor;

  @ApiModelProperty(value = "")

  private String divLineAlpha;

  @ApiModelProperty(value = "")

  private String alternateHGridAlpha;

  @ApiModelProperty(value = "")

  private String rotateNames;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ChartData valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChartData message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ChartData version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ChartData serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ChartData startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ChartData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ChartData request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ChartData addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get identifier
   * @return identifier
  **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ChartData identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

 /**
   * Get idAttribute
   * @return idAttribute
  **/
  @JsonProperty("idAttribute")
  public String getIdAttribute() {
    return idAttribute;
  }

  public void setIdAttribute(String idAttribute) {
    this.idAttribute = idAttribute;
  }

  public ChartData idAttribute(String idAttribute) {
    this.idAttribute = idAttribute;
    return this;
  }

 /**
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ChartData label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get maxValue
   * @return maxValue
  **/
  @JsonProperty("maxValue")
  public Long getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Long maxValue) {
    this.maxValue = maxValue;
  }

  public ChartData maxValue(Long maxValue) {
    this.maxValue = maxValue;
    return this;
  }

 /**
   * Get totalCount
   * @return totalCount
  **/
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public ChartData totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }

  public void setItems(List<Object> items) {
    this.items = items;
  }

  public ChartData items(List<Object> items) {
    this.items = items;
    return this;
  }

  public ChartData addItemsItem(Object itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get aggregatedItems
   * @return aggregatedItems
  **/
  @JsonProperty("aggregatedItems")
  public List<Object> getAggregatedItems() {
    return aggregatedItems;
  }

  public void setAggregatedItems(List<Object> aggregatedItems) {
    this.aggregatedItems = aggregatedItems;
  }

  public ChartData aggregatedItems(List<Object> aggregatedItems) {
    this.aggregatedItems = aggregatedItems;
    return this;
  }

  public ChartData addAggregatedItemsItem(Object aggregatedItemsItem) {
    this.aggregatedItems.add(aggregatedItemsItem);
    return this;
  }

 /**
   * Get caption
   * @return caption
  **/
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public ChartData caption(String caption) {
    this.caption = caption;
    return this;
  }

 /**
   * Get showAnchor
   * @return showAnchor
  **/
  @JsonProperty("showAnchor")
  public String getShowAnchor() {
    return showAnchor;
  }

  public void setShowAnchor(String showAnchor) {
    this.showAnchor = showAnchor;
  }

  public ChartData showAnchor(String showAnchor) {
    this.showAnchor = showAnchor;
    return this;
  }

 /**
   * Get anchorAlpha
   * @return anchorAlpha
  **/
  @JsonProperty("anchorAlpha")
  public String getAnchorAlpha() {
    return anchorAlpha;
  }

  public void setAnchorAlpha(String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
  }

  public ChartData anchorAlpha(String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
    return this;
  }

 /**
   * Get getxAxisName
   * @return getxAxisName
  **/
  @JsonProperty("getxAxisName")
  public String getGetxAxisName() {
    return getxAxisName;
  }

  public void setGetxAxisName(String getxAxisName) {
    this.getxAxisName = getxAxisName;
  }

  public ChartData getxAxisName(String getxAxisName) {
    this.getxAxisName = getxAxisName;
    return this;
  }

 /**
   * Get getyAxisMinValue
   * @return getyAxisMinValue
  **/
  @JsonProperty("getyAxisMinValue")
  public String getGetyAxisMinValue() {
    return getyAxisMinValue;
  }

  public void setGetyAxisMinValue(String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
  }

  public ChartData getyAxisMinValue(String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
    return this;
  }

 /**
   * Get getyAxisName
   * @return getyAxisName
  **/
  @JsonProperty("getyAxisName")
  public String getGetyAxisName() {
    return getyAxisName;
  }

  public void setGetyAxisName(String getyAxisName) {
    this.getyAxisName = getyAxisName;
  }

  public ChartData getyAxisName(String getyAxisName) {
    this.getyAxisName = getyAxisName;
    return this;
  }

 /**
   * Get decimalPrecision
   * @return decimalPrecision
  **/
  @JsonProperty("decimalPrecision")
  public String getDecimalPrecision() {
    return decimalPrecision;
  }

  public void setDecimalPrecision(String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }

  public ChartData decimalPrecision(String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
    return this;
  }

 /**
   * Get formatNumberScale
   * @return formatNumberScale
  **/
  @JsonProperty("formatNumberScale")
  public String getFormatNumberScale() {
    return formatNumberScale;
  }

  public void setFormatNumberScale(String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
  }

  public ChartData formatNumberScale(String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
    return this;
  }

 /**
   * Get numberPrefix
   * @return numberPrefix
  **/
  @JsonProperty("numberPrefix")
  public String getNumberPrefix() {
    return numberPrefix;
  }

  public void setNumberPrefix(String numberPrefix) {
    this.numberPrefix = numberPrefix;
  }

  public ChartData numberPrefix(String numberPrefix) {
    this.numberPrefix = numberPrefix;
    return this;
  }

 /**
   * Get showNames
   * @return showNames
  **/
  @JsonProperty("showNames")
  public String getShowNames() {
    return showNames;
  }

  public void setShowNames(String showNames) {
    this.showNames = showNames;
  }

  public ChartData showNames(String showNames) {
    this.showNames = showNames;
    return this;
  }

 /**
   * Get showValues
   * @return showValues
  **/
  @JsonProperty("showValues")
  public String getShowValues() {
    return showValues;
  }

  public void setShowValues(String showValues) {
    this.showValues = showValues;
  }

  public ChartData showValues(String showValues) {
    this.showValues = showValues;
    return this;
  }

 /**
   * Get showAlternateHGridColor
   * @return showAlternateHGridColor
  **/
  @JsonProperty("showAlternateHGridColor")
  public String getShowAlternateHGridColor() {
    return showAlternateHGridColor;
  }

  public void setShowAlternateHGridColor(String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
  }

  public ChartData showAlternateHGridColor(String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
    return this;
  }

 /**
   * Get alternateHGridColor
   * @return alternateHGridColor
  **/
  @JsonProperty("alternateHGridColor")
  public String getAlternateHGridColor() {
    return alternateHGridColor;
  }

  public void setAlternateHGridColor(String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
  }

  public ChartData alternateHGridColor(String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
    return this;
  }

 /**
   * Get divLineColor
   * @return divLineColor
  **/
  @JsonProperty("divLineColor")
  public String getDivLineColor() {
    return divLineColor;
  }

  public void setDivLineColor(String divLineColor) {
    this.divLineColor = divLineColor;
  }

  public ChartData divLineColor(String divLineColor) {
    this.divLineColor = divLineColor;
    return this;
  }

 /**
   * Get divLineAlpha
   * @return divLineAlpha
  **/
  @JsonProperty("divLineAlpha")
  public String getDivLineAlpha() {
    return divLineAlpha;
  }

  public void setDivLineAlpha(String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
  }

  public ChartData divLineAlpha(String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
    return this;
  }

 /**
   * Get alternateHGridAlpha
   * @return alternateHGridAlpha
  **/
  @JsonProperty("alternateHGridAlpha")
  public String getAlternateHGridAlpha() {
    return alternateHGridAlpha;
  }

  public void setAlternateHGridAlpha(String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
  }

  public ChartData alternateHGridAlpha(String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
    return this;
  }

 /**
   * Get rotateNames
   * @return rotateNames
  **/
  @JsonProperty("rotateNames")
  public String getRotateNames() {
    return rotateNames;
  }

  public void setRotateNames(String rotateNames) {
    this.rotateNames = rotateNames;
  }

  public ChartData rotateNames(String rotateNames) {
    this.rotateNames = rotateNames;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public ChartData returning(String returning) {
    this.returning = returning;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

