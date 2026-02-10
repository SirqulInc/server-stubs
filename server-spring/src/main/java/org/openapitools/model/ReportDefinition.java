package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportDefinition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportDefinition {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String query;

  private @Nullable String queryName;

  private @Nullable String displayName;

  @Valid
  private List<String> columnNames = new ArrayList<>();

  private @Nullable Boolean nativeSql;

  private @Nullable Boolean display;

  /**
   * Gets or Sets dataSource
   */
  public enum DataSourceEnum {
    WRITE("WRITE"),
    
    ANALYTIC("ANALYTIC"),
    
    READ1("READ1");

    private final String value;

    DataSourceEnum(String value) {
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
    public static DataSourceEnum fromValue(String value) {
      for (DataSourceEnum b : DataSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DataSourceEnum dataSource;

  private @Nullable Long maxLimit;

  private @Nullable Integer maxDateRange;

  private @Nullable String displayParams;

  private @Nullable String metaData;

  private @Nullable String columnNamesRaw;

  public ReportDefinition id(@Nullable Long id) {
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

  public ReportDefinition active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ReportDefinition valid(@Nullable Boolean valid) {
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

  public ReportDefinition query(@Nullable String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  
  @Schema(name = "query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public @Nullable String getQuery() {
    return query;
  }

  public void setQuery(@Nullable String query) {
    this.query = query;
  }

  public ReportDefinition queryName(@Nullable String queryName) {
    this.queryName = queryName;
    return this;
  }

  /**
   * Get queryName
   * @return queryName
   */
  
  @Schema(name = "queryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryName")
  public @Nullable String getQueryName() {
    return queryName;
  }

  public void setQueryName(@Nullable String queryName) {
    this.queryName = queryName;
  }

  public ReportDefinition displayName(@Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public @Nullable String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(@Nullable String displayName) {
    this.displayName = displayName;
  }

  public ReportDefinition columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public ReportDefinition addColumnNamesItem(String columnNamesItem) {
    if (this.columnNames == null) {
      this.columnNames = new ArrayList<>();
    }
    this.columnNames.add(columnNamesItem);
    return this;
  }

  /**
   * Get columnNames
   * @return columnNames
   */
  
  @Schema(name = "columnNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public ReportDefinition nativeSql(@Nullable Boolean nativeSql) {
    this.nativeSql = nativeSql;
    return this;
  }

  /**
   * Get nativeSql
   * @return nativeSql
   */
  
  @Schema(name = "nativeSql", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nativeSql")
  public @Nullable Boolean getNativeSql() {
    return nativeSql;
  }

  public void setNativeSql(@Nullable Boolean nativeSql) {
    this.nativeSql = nativeSql;
  }

  public ReportDefinition display(@Nullable Boolean display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable Boolean getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable Boolean display) {
    this.display = display;
  }

  public ReportDefinition dataSource(@Nullable DataSourceEnum dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   * @return dataSource
   */
  
  @Schema(name = "dataSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSource")
  public @Nullable DataSourceEnum getDataSource() {
    return dataSource;
  }

  public void setDataSource(@Nullable DataSourceEnum dataSource) {
    this.dataSource = dataSource;
  }

  public ReportDefinition maxLimit(@Nullable Long maxLimit) {
    this.maxLimit = maxLimit;
    return this;
  }

  /**
   * Get maxLimit
   * @return maxLimit
   */
  
  @Schema(name = "maxLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxLimit")
  public @Nullable Long getMaxLimit() {
    return maxLimit;
  }

  public void setMaxLimit(@Nullable Long maxLimit) {
    this.maxLimit = maxLimit;
  }

  public ReportDefinition maxDateRange(@Nullable Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
    return this;
  }

  /**
   * Get maxDateRange
   * @return maxDateRange
   */
  
  @Schema(name = "maxDateRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxDateRange")
  public @Nullable Integer getMaxDateRange() {
    return maxDateRange;
  }

  public void setMaxDateRange(@Nullable Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
  }

  public ReportDefinition displayParams(@Nullable String displayParams) {
    this.displayParams = displayParams;
    return this;
  }

  /**
   * Get displayParams
   * @return displayParams
   */
  
  @Schema(name = "displayParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayParams")
  public @Nullable String getDisplayParams() {
    return displayParams;
  }

  public void setDisplayParams(@Nullable String displayParams) {
    this.displayParams = displayParams;
  }

  public ReportDefinition metaData(@Nullable String metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  
  @Schema(name = "metaData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metaData")
  public @Nullable String getMetaData() {
    return metaData;
  }

  public void setMetaData(@Nullable String metaData) {
    this.metaData = metaData;
  }

  public ReportDefinition columnNamesRaw(@Nullable String columnNamesRaw) {
    this.columnNamesRaw = columnNamesRaw;
    return this;
  }

  /**
   * Get columnNamesRaw
   * @return columnNamesRaw
   */
  
  @Schema(name = "columnNamesRaw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columnNamesRaw")
  public @Nullable String getColumnNamesRaw() {
    return columnNamesRaw;
  }

  public void setColumnNamesRaw(@Nullable String columnNamesRaw) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

