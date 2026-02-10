package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportDefinition  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String query;

  @ApiModelProperty(value = "")

  private String queryName;

  @ApiModelProperty(value = "")

  private String displayName;

  @ApiModelProperty(value = "")

  private List<String> columnNames = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean nativeSql;

  @ApiModelProperty(value = "")

  private Boolean display;

public enum DataSourceEnum {

WRITE(String.valueOf("WRITE")), ANALYTIC(String.valueOf("ANALYTIC")), READ1(String.valueOf("READ1"));


    private String value;

    DataSourceEnum (String v) {
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
    public static DataSourceEnum fromValue(String value) {
        for (DataSourceEnum b : DataSourceEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private DataSourceEnum dataSource;

  @ApiModelProperty(value = "")

  private Long maxLimit;

  @ApiModelProperty(value = "")

  private Integer maxDateRange;

  @ApiModelProperty(value = "")

  private String displayParams;

  @ApiModelProperty(value = "")

  private String metaData;

  @ApiModelProperty(value = "")

  private String columnNamesRaw;
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

  public ReportDefinition id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ReportDefinition active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public ReportDefinition valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get query
   * @return query
  **/
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ReportDefinition query(String query) {
    this.query = query;
    return this;
  }

 /**
   * Get queryName
   * @return queryName
  **/
  @JsonProperty("queryName")
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  public ReportDefinition queryName(String queryName) {
    this.queryName = queryName;
    return this;
  }

 /**
   * Get displayName
   * @return displayName
  **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ReportDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * Get columnNames
   * @return columnNames
  **/
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public ReportDefinition columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public ReportDefinition addColumnNamesItem(String columnNamesItem) {
    this.columnNames.add(columnNamesItem);
    return this;
  }

 /**
   * Get nativeSql
   * @return nativeSql
  **/
  @JsonProperty("nativeSql")
  public Boolean getNativeSql() {
    return nativeSql;
  }

  public void setNativeSql(Boolean nativeSql) {
    this.nativeSql = nativeSql;
  }

  public ReportDefinition nativeSql(Boolean nativeSql) {
    this.nativeSql = nativeSql;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public Boolean getDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public ReportDefinition display(Boolean display) {
    this.display = display;
    return this;
  }

 /**
   * Get dataSource
   * @return dataSource
  **/
  @JsonProperty("dataSource")
  public String getDataSource() {
    if (dataSource == null) {
      return null;
    }
    return dataSource.value();
  }

  public void setDataSource(DataSourceEnum dataSource) {
    this.dataSource = dataSource;
  }

  public ReportDefinition dataSource(DataSourceEnum dataSource) {
    this.dataSource = dataSource;
    return this;
  }

 /**
   * Get maxLimit
   * @return maxLimit
  **/
  @JsonProperty("maxLimit")
  public Long getMaxLimit() {
    return maxLimit;
  }

  public void setMaxLimit(Long maxLimit) {
    this.maxLimit = maxLimit;
  }

  public ReportDefinition maxLimit(Long maxLimit) {
    this.maxLimit = maxLimit;
    return this;
  }

 /**
   * Get maxDateRange
   * @return maxDateRange
  **/
  @JsonProperty("maxDateRange")
  public Integer getMaxDateRange() {
    return maxDateRange;
  }

  public void setMaxDateRange(Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
  }

  public ReportDefinition maxDateRange(Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
    return this;
  }

 /**
   * Get displayParams
   * @return displayParams
  **/
  @JsonProperty("displayParams")
  public String getDisplayParams() {
    return displayParams;
  }

  public void setDisplayParams(String displayParams) {
    this.displayParams = displayParams;
  }

  public ReportDefinition displayParams(String displayParams) {
    this.displayParams = displayParams;
    return this;
  }

 /**
   * Get metaData
   * @return metaData
  **/
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public ReportDefinition metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

 /**
   * Get columnNamesRaw
   * @return columnNamesRaw
  **/
  @JsonProperty("columnNamesRaw")
  public String getColumnNamesRaw() {
    return columnNamesRaw;
  }

  public void setColumnNamesRaw(String columnNamesRaw) {
    this.columnNamesRaw = columnNamesRaw;
  }

  public ReportDefinition columnNamesRaw(String columnNamesRaw) {
    this.columnNamesRaw = columnNamesRaw;
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
    ReportDefinition reportDefinition = (ReportDefinition) o;
    return Objects.equals(this.id, reportDefinition.id) &&
        Objects.equals(this.active, reportDefinition.active) &&
        Objects.equals(this.valid, reportDefinition.valid) &&
        Objects.equals(this.query, reportDefinition.query) &&
        Objects.equals(this.queryName, reportDefinition.queryName) &&
        Objects.equals(this.displayName, reportDefinition.displayName) &&
        Objects.equals(this.columnNames, reportDefinition.columnNames) &&
        Objects.equals(this.nativeSql, reportDefinition.nativeSql) &&
        Objects.equals(this.display, reportDefinition.display) &&
        Objects.equals(this.dataSource, reportDefinition.dataSource) &&
        Objects.equals(this.maxLimit, reportDefinition.maxLimit) &&
        Objects.equals(this.maxDateRange, reportDefinition.maxDateRange) &&
        Objects.equals(this.displayParams, reportDefinition.displayParams) &&
        Objects.equals(this.metaData, reportDefinition.metaData) &&
        Objects.equals(this.columnNamesRaw, reportDefinition.columnNamesRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, query, queryName, displayName, columnNames, nativeSql, display, dataSource, maxLimit, maxDateRange, displayParams, metaData, columnNamesRaw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryName: ").append(toIndentedString(queryName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    nativeSql: ").append(toIndentedString(nativeSql)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    maxLimit: ").append(toIndentedString(maxLimit)).append("\n");
    sb.append("    maxDateRange: ").append(toIndentedString(maxDateRange)).append("\n");
    sb.append("    displayParams: ").append(toIndentedString(displayParams)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    columnNamesRaw: ").append(toIndentedString(columnNamesRaw)).append("\n");
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

