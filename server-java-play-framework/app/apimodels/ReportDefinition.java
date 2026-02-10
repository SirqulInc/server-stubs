package apimodels;

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
 * ReportDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReportDefinition   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("query")
  
  private String query;

  @JsonProperty("queryName")
  
  private String queryName;

  @JsonProperty("displayName")
  
  private String displayName;

  @JsonProperty("columnNames")
  
  private List<String> columnNames = null;

  @JsonProperty("nativeSql")
  
  private Boolean nativeSql;

  @JsonProperty("display")
  
  private Boolean display;

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

  @JsonProperty("dataSource")
  
  private DataSourceEnum dataSource;

  @JsonProperty("maxLimit")
  
  private Long maxLimit;

  @JsonProperty("maxDateRange")
  
  private Integer maxDateRange;

  @JsonProperty("displayParams")
  
  private String displayParams;

  @JsonProperty("metaData")
  
  private String metaData;

  @JsonProperty("columnNamesRaw")
  
  private String columnNamesRaw;

  public ReportDefinition id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReportDefinition active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ReportDefinition valid(Boolean valid) {
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

  public ReportDefinition query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ReportDefinition queryName(String queryName) {
    this.queryName = queryName;
    return this;
  }

   /**
   * Get queryName
   * @return queryName
  **/
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }

  public ReportDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
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
  **/
  public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public ReportDefinition nativeSql(Boolean nativeSql) {
    this.nativeSql = nativeSql;
    return this;
  }

   /**
   * Get nativeSql
   * @return nativeSql
  **/
  public Boolean getNativeSql() {
    return nativeSql;
  }

  public void setNativeSql(Boolean nativeSql) {
    this.nativeSql = nativeSql;
  }

  public ReportDefinition display(Boolean display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public Boolean getDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public ReportDefinition dataSource(DataSourceEnum dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  public DataSourceEnum getDataSource() {
    return dataSource;
  }

  public void setDataSource(DataSourceEnum dataSource) {
    this.dataSource = dataSource;
  }

  public ReportDefinition maxLimit(Long maxLimit) {
    this.maxLimit = maxLimit;
    return this;
  }

   /**
   * Get maxLimit
   * @return maxLimit
  **/
  public Long getMaxLimit() {
    return maxLimit;
  }

  public void setMaxLimit(Long maxLimit) {
    this.maxLimit = maxLimit;
  }

  public ReportDefinition maxDateRange(Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
    return this;
  }

   /**
   * Get maxDateRange
   * @return maxDateRange
  **/
  public Integer getMaxDateRange() {
    return maxDateRange;
  }

  public void setMaxDateRange(Integer maxDateRange) {
    this.maxDateRange = maxDateRange;
  }

  public ReportDefinition displayParams(String displayParams) {
    this.displayParams = displayParams;
    return this;
  }

   /**
   * Get displayParams
   * @return displayParams
  **/
  public String getDisplayParams() {
    return displayParams;
  }

  public void setDisplayParams(String displayParams) {
    this.displayParams = displayParams;
  }

  public ReportDefinition metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  public String getMetaData() {
    return metaData;
  }

  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  public ReportDefinition columnNamesRaw(String columnNamesRaw) {
    this.columnNamesRaw = columnNamesRaw;
    return this;
  }

   /**
   * Get columnNamesRaw
   * @return columnNamesRaw
  **/
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
    return Objects.equals(id, reportDefinition.id) &&
        Objects.equals(active, reportDefinition.active) &&
        Objects.equals(valid, reportDefinition.valid) &&
        Objects.equals(query, reportDefinition.query) &&
        Objects.equals(queryName, reportDefinition.queryName) &&
        Objects.equals(displayName, reportDefinition.displayName) &&
        Objects.equals(columnNames, reportDefinition.columnNames) &&
        Objects.equals(nativeSql, reportDefinition.nativeSql) &&
        Objects.equals(display, reportDefinition.display) &&
        Objects.equals(dataSource, reportDefinition.dataSource) &&
        Objects.equals(maxLimit, reportDefinition.maxLimit) &&
        Objects.equals(maxDateRange, reportDefinition.maxDateRange) &&
        Objects.equals(displayParams, reportDefinition.displayParams) &&
        Objects.equals(metaData, reportDefinition.metaData) &&
        Objects.equals(columnNamesRaw, reportDefinition.columnNamesRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, query, queryName, displayName, columnNames, nativeSql, display, dataSource, maxLimit, maxDateRange, displayParams, metaData, columnNamesRaw);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

