package apimodels;

import apimodels.NameStringValueResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ChartData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChartData   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("identifier")
  
  private String identifier;

  @JsonProperty("idAttribute")
  
  private String idAttribute;

  @JsonProperty("label")
  
  private String label;

  @JsonProperty("maxValue")
  
  private Long maxValue;

  @JsonProperty("totalCount")
  
  private Long totalCount;

  @JsonProperty("items")
  
  private List<Object> items = null;

  @JsonProperty("aggregatedItems")
  
  private List<Object> aggregatedItems = null;

  @JsonProperty("caption")
  
  private String caption;

  @JsonProperty("showAnchor")
  
  private String showAnchor;

  @JsonProperty("anchorAlpha")
  
  private String anchorAlpha;

  @JsonProperty("getxAxisName")
  
  private String getxAxisName;

  @JsonProperty("getyAxisMinValue")
  
  private String getyAxisMinValue;

  @JsonProperty("getyAxisName")
  
  private String getyAxisName;

  @JsonProperty("decimalPrecision")
  
  private String decimalPrecision;

  @JsonProperty("formatNumberScale")
  
  private String formatNumberScale;

  @JsonProperty("numberPrefix")
  
  private String numberPrefix;

  @JsonProperty("showNames")
  
  private String showNames;

  @JsonProperty("showValues")
  
  private String showValues;

  @JsonProperty("showAlternateHGridColor")
  
  private String showAlternateHGridColor;

  @JsonProperty("alternateHGridColor")
  
  private String alternateHGridColor;

  @JsonProperty("divLineColor")
  
  private String divLineColor;

  @JsonProperty("divLineAlpha")
  
  private String divLineAlpha;

  @JsonProperty("alternateHGridAlpha")
  
  private String alternateHGridAlpha;

  @JsonProperty("rotateNames")
  
  private String rotateNames;

  @JsonProperty("returning")
  
  private String returning;

  public ChartData valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ChartData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChartData version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ChartData serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ChartData startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ChartData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ChartData identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ChartData idAttribute(String idAttribute) {
    this.idAttribute = idAttribute;
    return this;
  }

   /**
   * Get idAttribute
   * @return idAttribute
  **/
  public String getIdAttribute() {
    return idAttribute;
  }

  public void setIdAttribute(String idAttribute) {
    this.idAttribute = idAttribute;
  }

  public ChartData label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ChartData maxValue(Long maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Get maxValue
   * @return maxValue
  **/
  public Long getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Long maxValue) {
    this.maxValue = maxValue;
  }

  public ChartData totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
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
  **/
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
  **/
  public List<Object> getAggregatedItems() {
    return aggregatedItems;
  }

  public void setAggregatedItems(List<Object> aggregatedItems) {
    this.aggregatedItems = aggregatedItems;
  }

  public ChartData caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public ChartData showAnchor(String showAnchor) {
    this.showAnchor = showAnchor;
    return this;
  }

   /**
   * Get showAnchor
   * @return showAnchor
  **/
  public String getShowAnchor() {
    return showAnchor;
  }

  public void setShowAnchor(String showAnchor) {
    this.showAnchor = showAnchor;
  }

  public ChartData anchorAlpha(String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
    return this;
  }

   /**
   * Get anchorAlpha
   * @return anchorAlpha
  **/
  public String getAnchorAlpha() {
    return anchorAlpha;
  }

  public void setAnchorAlpha(String anchorAlpha) {
    this.anchorAlpha = anchorAlpha;
  }

  public ChartData getxAxisName(String getxAxisName) {
    this.getxAxisName = getxAxisName;
    return this;
  }

   /**
   * Get getxAxisName
   * @return getxAxisName
  **/
  public String getGetxAxisName() {
    return getxAxisName;
  }

  public void setGetxAxisName(String getxAxisName) {
    this.getxAxisName = getxAxisName;
  }

  public ChartData getyAxisMinValue(String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
    return this;
  }

   /**
   * Get getyAxisMinValue
   * @return getyAxisMinValue
  **/
  public String getGetyAxisMinValue() {
    return getyAxisMinValue;
  }

  public void setGetyAxisMinValue(String getyAxisMinValue) {
    this.getyAxisMinValue = getyAxisMinValue;
  }

  public ChartData getyAxisName(String getyAxisName) {
    this.getyAxisName = getyAxisName;
    return this;
  }

   /**
   * Get getyAxisName
   * @return getyAxisName
  **/
  public String getGetyAxisName() {
    return getyAxisName;
  }

  public void setGetyAxisName(String getyAxisName) {
    this.getyAxisName = getyAxisName;
  }

  public ChartData decimalPrecision(String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
    return this;
  }

   /**
   * Get decimalPrecision
   * @return decimalPrecision
  **/
  public String getDecimalPrecision() {
    return decimalPrecision;
  }

  public void setDecimalPrecision(String decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }

  public ChartData formatNumberScale(String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
    return this;
  }

   /**
   * Get formatNumberScale
   * @return formatNumberScale
  **/
  public String getFormatNumberScale() {
    return formatNumberScale;
  }

  public void setFormatNumberScale(String formatNumberScale) {
    this.formatNumberScale = formatNumberScale;
  }

  public ChartData numberPrefix(String numberPrefix) {
    this.numberPrefix = numberPrefix;
    return this;
  }

   /**
   * Get numberPrefix
   * @return numberPrefix
  **/
  public String getNumberPrefix() {
    return numberPrefix;
  }

  public void setNumberPrefix(String numberPrefix) {
    this.numberPrefix = numberPrefix;
  }

  public ChartData showNames(String showNames) {
    this.showNames = showNames;
    return this;
  }

   /**
   * Get showNames
   * @return showNames
  **/
  public String getShowNames() {
    return showNames;
  }

  public void setShowNames(String showNames) {
    this.showNames = showNames;
  }

  public ChartData showValues(String showValues) {
    this.showValues = showValues;
    return this;
  }

   /**
   * Get showValues
   * @return showValues
  **/
  public String getShowValues() {
    return showValues;
  }

  public void setShowValues(String showValues) {
    this.showValues = showValues;
  }

  public ChartData showAlternateHGridColor(String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
    return this;
  }

   /**
   * Get showAlternateHGridColor
   * @return showAlternateHGridColor
  **/
  public String getShowAlternateHGridColor() {
    return showAlternateHGridColor;
  }

  public void setShowAlternateHGridColor(String showAlternateHGridColor) {
    this.showAlternateHGridColor = showAlternateHGridColor;
  }

  public ChartData alternateHGridColor(String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
    return this;
  }

   /**
   * Get alternateHGridColor
   * @return alternateHGridColor
  **/
  public String getAlternateHGridColor() {
    return alternateHGridColor;
  }

  public void setAlternateHGridColor(String alternateHGridColor) {
    this.alternateHGridColor = alternateHGridColor;
  }

  public ChartData divLineColor(String divLineColor) {
    this.divLineColor = divLineColor;
    return this;
  }

   /**
   * Get divLineColor
   * @return divLineColor
  **/
  public String getDivLineColor() {
    return divLineColor;
  }

  public void setDivLineColor(String divLineColor) {
    this.divLineColor = divLineColor;
  }

  public ChartData divLineAlpha(String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
    return this;
  }

   /**
   * Get divLineAlpha
   * @return divLineAlpha
  **/
  public String getDivLineAlpha() {
    return divLineAlpha;
  }

  public void setDivLineAlpha(String divLineAlpha) {
    this.divLineAlpha = divLineAlpha;
  }

  public ChartData alternateHGridAlpha(String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
    return this;
  }

   /**
   * Get alternateHGridAlpha
   * @return alternateHGridAlpha
  **/
  public String getAlternateHGridAlpha() {
    return alternateHGridAlpha;
  }

  public void setAlternateHGridAlpha(String alternateHGridAlpha) {
    this.alternateHGridAlpha = alternateHGridAlpha;
  }

  public ChartData rotateNames(String rotateNames) {
    this.rotateNames = rotateNames;
    return this;
  }

   /**
   * Get rotateNames
   * @return rotateNames
  **/
  public String getRotateNames() {
    return rotateNames;
  }

  public void setRotateNames(String rotateNames) {
    this.rotateNames = rotateNames;
  }

  public ChartData returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    return Objects.equals(valid, chartData.valid) &&
        Objects.equals(message, chartData.message) &&
        Objects.equals(version, chartData.version) &&
        Objects.equals(serializeNulls, chartData.serializeNulls) &&
        Objects.equals(startTimeLog, chartData.startTimeLog) &&
        Objects.equals(errorCode, chartData.errorCode) &&
        Objects.equals(request, chartData.request) &&
        Objects.equals(identifier, chartData.identifier) &&
        Objects.equals(idAttribute, chartData.idAttribute) &&
        Objects.equals(label, chartData.label) &&
        Objects.equals(maxValue, chartData.maxValue) &&
        Objects.equals(totalCount, chartData.totalCount) &&
        Objects.equals(items, chartData.items) &&
        Objects.equals(aggregatedItems, chartData.aggregatedItems) &&
        Objects.equals(caption, chartData.caption) &&
        Objects.equals(showAnchor, chartData.showAnchor) &&
        Objects.equals(anchorAlpha, chartData.anchorAlpha) &&
        Objects.equals(getxAxisName, chartData.getxAxisName) &&
        Objects.equals(getyAxisMinValue, chartData.getyAxisMinValue) &&
        Objects.equals(getyAxisName, chartData.getyAxisName) &&
        Objects.equals(decimalPrecision, chartData.decimalPrecision) &&
        Objects.equals(formatNumberScale, chartData.formatNumberScale) &&
        Objects.equals(numberPrefix, chartData.numberPrefix) &&
        Objects.equals(showNames, chartData.showNames) &&
        Objects.equals(showValues, chartData.showValues) &&
        Objects.equals(showAlternateHGridColor, chartData.showAlternateHGridColor) &&
        Objects.equals(alternateHGridColor, chartData.alternateHGridColor) &&
        Objects.equals(divLineColor, chartData.divLineColor) &&
        Objects.equals(divLineAlpha, chartData.divLineAlpha) &&
        Objects.equals(alternateHGridAlpha, chartData.alternateHGridAlpha) &&
        Objects.equals(rotateNames, chartData.rotateNames) &&
        Objects.equals(returning, chartData.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, identifier, idAttribute, label, maxValue, totalCount, items, aggregatedItems, caption, showAnchor, anchorAlpha, getxAxisName, getyAxisMinValue, getyAxisName, decimalPrecision, formatNumberScale, numberPrefix, showNames, showValues, showAlternateHGridColor, alternateHGridColor, divLineColor, divLineAlpha, alternateHGridAlpha, rotateNames, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

