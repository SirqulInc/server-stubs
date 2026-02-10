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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportDefinition   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String query;
  private String queryName;
  private String displayName;
  private List<String> columnNames = new ArrayList<>();
  private Boolean nativeSql;
  private Boolean display;

  /**
   * Gets or Sets dataSource
   */
  public enum DataSourceEnum {
    WRITE("WRITE"),

        ANALYTIC("ANALYTIC"),

        READ1("READ1");
    private String value;

    DataSourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private DataSourceEnum dataSource;
  private Long maxLimit;
  private Integer maxDateRange;
  private String displayParams;
  private String metaData;
  private String columnNamesRaw;

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
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

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
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queryName")
  public String getQueryName() {
    return queryName;
  }
  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nativeSql")
  public Boolean getNativeSql() {
    return nativeSql;
  }
  public void setNativeSql(Boolean nativeSql) {
    this.nativeSql = nativeSql;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public Boolean getDisplay() {
    return display;
  }
  public void setDisplay(Boolean display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataSource")
  public DataSourceEnum getDataSource() {
    return dataSource;
  }
  public void setDataSource(DataSourceEnum dataSource) {
    this.dataSource = dataSource;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxLimit")
  public Long getMaxLimit() {
    return maxLimit;
  }
  public void setMaxLimit(Long maxLimit) {
    this.maxLimit = maxLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("maxDateRange")
  public Integer getMaxDateRange() {
    return maxDateRange;
  }
  public void setMaxDateRange(Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("displayParams")
  public String getDisplayParams() {
    return displayParams;
  }
  public void setDisplayParams(String displayParams) {
    this.displayParams = displayParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }
  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("columnNamesRaw")
  public String getColumnNamesRaw() {
    return columnNamesRaw;
  }
  public void setColumnNamesRaw(String columnNamesRaw) {
    this.columnNamesRaw = columnNamesRaw;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

