package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ChartData   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private String identifier;
  private String idAttribute;
  private String label;
  private Long maxValue;
  private Long totalCount;
  private List<Object> items = new ArrayList<>();
  private List<Object> aggregatedItems = new ArrayList<>();
  private String caption;
  private String showAnchor;
  private String anchorAlpha;
  private String getxAxisName;
  private String getyAxisMinValue;
  private String getyAxisName;
  private String decimalPrecision;
  private String formatNumberScale;
  private String numberPrefix;
  private String showNames;
  private String showValues;
  private String showAlternateHGridColor;
  private String alternateHGridColor;
  private String divLineColor;
  private String divLineAlpha;
  private String alternateHGridAlpha;
  private String rotateNames;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("idAttribute")
  public String getIdAttribute() {
    return idAttribute;
  }
  public void setIdAttribute(String idAttribute) {
    this.idAttribute = idAttribute;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxValue")
  public Long getMaxValue() {
    return maxValue;
  }
  public void setMaxValue(Long maxValue) {
    this.maxValue = maxValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }
  public void setItems(List<Object> items) {
    this.items = items;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("aggregatedItems")
  public List<Object> getAggregatedItems() {
    return aggregatedItems;
  }
  public void setAggregatedItems(List<Object> aggregatedItems) {
    this.aggregatedItems = aggregatedItems;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showAnchor")
  public String getShowAnchor() {
    return showAnchor;
  }
  public void setShowAnchor(String showAnchor) {
    this.showAnchor = showAnchor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("anchorAlpha")
  public String getAnchorAlpha() {
    return anchorAlpha;
  }
  public void setAnchorAlpha(String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("getxAxisName")
  public String getGetxAxisName() {
    return getxAxisName;
  }
  public void setGetxAxisName(String getxAxisName) {
    this.getxAxisName = getxAxisName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("getyAxisMinValue")
  public String getGetyAxisMinValue() {
    return getyAxisMinValue;
  }
  public void setGetyAxisMinValue(String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("getyAxisName")
  public String getGetyAxisName() {
    return getyAxisName;
  }
  public void setGetyAxisName(String getyAxisName) {
    this.getyAxisName = getyAxisName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("decimalPrecision")
  public String getDecimalPrecision() {
    return decimalPrecision;
  }
  public void setDecimalPrecision(String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("formatNumberScale")
  public String getFormatNumberScale() {
    return formatNumberScale;
  }
  public void setFormatNumberScale(String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberPrefix")
  public String getNumberPrefix() {
    return numberPrefix;
  }
  public void setNumberPrefix(String numberPrefix) {
    this.numberPrefix = numberPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showNames")
  public String getShowNames() {
    return showNames;
  }
  public void setShowNames(String showNames) {
    this.showNames = showNames;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showValues")
  public String getShowValues() {
    return showValues;
  }
  public void setShowValues(String showValues) {
    this.showValues = showValues;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("showAlternateHGridColor")
  public String getShowAlternateHGridColor() {
    return showAlternateHGridColor;
  }
  public void setShowAlternateHGridColor(String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alternateHGridColor")
  public String getAlternateHGridColor() {
    return alternateHGridColor;
  }
  public void setAlternateHGridColor(String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("divLineColor")
  public String getDivLineColor() {
    return divLineColor;
  }
  public void setDivLineColor(String divLineColor) {
    this.divLineColor = divLineColor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("divLineAlpha")
  public String getDivLineAlpha() {
    return divLineAlpha;
  }
  public void setDivLineAlpha(String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alternateHGridAlpha")
  public String getAlternateHGridAlpha() {
    return alternateHGridAlpha;
  }
  public void setAlternateHGridAlpha(String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rotateNames")
  public String getRotateNames() {
    return rotateNames;
  }
  public void setRotateNames(String rotateNames) {
    this.rotateNames = rotateNames;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

