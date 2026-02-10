package apimodels;

import apimodels.LoadShortResponse;
import apimodels.NodeRequest;
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
 * StopResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StopResponse   {
  @JsonProperty("geoId")
  
  private String geoId;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("startWindow")
  
  private Long startWindow;

  @JsonProperty("endWindow")
  
  private Long endWindow;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    PICKUP("PICKUP"),
    
    DROPOFF("DROPOFF"),
    
    START("START"),
    
    END("END"),
    
    ROUTING("ROUTING");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("type")
  
  private TypeEnum type;

  @JsonProperty("eta")
  
  private Long eta;

  @JsonProperty("etd")
  
  private Long etd;

  @JsonProperty("score")
  
  private Long score;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("error")
  
  private String error;

  @JsonProperty("itemId")
  
  private String itemId;

  @JsonProperty("itemSize")
  
  private Long itemSize;

  @JsonProperty("load")
  @Valid

  private LoadShortResponse load;

  @JsonProperty("floorPlanPath")
  @Valid

  private List<@Valid NodeRequest> floorPlanPath = null;

  @JsonProperty("valid")
  
  private Boolean valid;

  public StopResponse geoId(String geoId) {
    this.geoId = geoId;
    return this;
  }

   /**
   * Get geoId
   * @return geoId
  **/
  public String getGeoId() {
    return geoId;
  }

  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }

  public StopResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public StopResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public StopResponse startWindow(Long startWindow) {
    this.startWindow = startWindow;
    return this;
  }

   /**
   * Get startWindow
   * @return startWindow
  **/
  public Long getStartWindow() {
    return startWindow;
  }

  public void setStartWindow(Long startWindow) {
    this.startWindow = startWindow;
  }

  public StopResponse endWindow(Long endWindow) {
    this.endWindow = endWindow;
    return this;
  }

   /**
   * Get endWindow
   * @return endWindow
  **/
  public Long getEndWindow() {
    return endWindow;
  }

  public void setEndWindow(Long endWindow) {
    this.endWindow = endWindow;
  }

  public StopResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StopResponse eta(Long eta) {
    this.eta = eta;
    return this;
  }

   /**
   * Get eta
   * @return eta
  **/
  public Long getEta() {
    return eta;
  }

  public void setEta(Long eta) {
    this.eta = eta;
  }

  public StopResponse etd(Long etd) {
    this.etd = etd;
    return this;
  }

   /**
   * Get etd
   * @return etd
  **/
  public Long getEtd() {
    return etd;
  }

  public void setEtd(Long etd) {
    this.etd = etd;
  }

  public StopResponse score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public StopResponse errorCode(String errorCode) {
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

  public StopResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public StopResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public StopResponse itemSize(Long itemSize) {
    this.itemSize = itemSize;
    return this;
  }

   /**
   * Get itemSize
   * @return itemSize
  **/
  public Long getItemSize() {
    return itemSize;
  }

  public void setItemSize(Long itemSize) {
    this.itemSize = itemSize;
  }

  public StopResponse load(LoadShortResponse load) {
    this.load = load;
    return this;
  }

   /**
   * Get load
   * @return load
  **/
  public LoadShortResponse getLoad() {
    return load;
  }

  public void setLoad(LoadShortResponse load) {
    this.load = load;
  }

  public StopResponse floorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
    return this;
  }

  public StopResponse addFloorPlanPathItem(NodeRequest floorPlanPathItem) {
    if (this.floorPlanPath == null) {
      this.floorPlanPath = new ArrayList<>();
    }
    this.floorPlanPath.add(floorPlanPathItem);
    return this;
  }

   /**
   * Get floorPlanPath
   * @return floorPlanPath
  **/
  public List<@Valid NodeRequest> getFloorPlanPath() {
    return floorPlanPath;
  }

  public void setFloorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
  }

  public StopResponse valid(Boolean valid) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopResponse stopResponse = (StopResponse) o;
    return Objects.equals(geoId, stopResponse.geoId) &&
        Objects.equals(latitude, stopResponse.latitude) &&
        Objects.equals(longitude, stopResponse.longitude) &&
        Objects.equals(startWindow, stopResponse.startWindow) &&
        Objects.equals(endWindow, stopResponse.endWindow) &&
        Objects.equals(type, stopResponse.type) &&
        Objects.equals(eta, stopResponse.eta) &&
        Objects.equals(etd, stopResponse.etd) &&
        Objects.equals(score, stopResponse.score) &&
        Objects.equals(errorCode, stopResponse.errorCode) &&
        Objects.equals(error, stopResponse.error) &&
        Objects.equals(itemId, stopResponse.itemId) &&
        Objects.equals(itemSize, stopResponse.itemSize) &&
        Objects.equals(load, stopResponse.load) &&
        Objects.equals(floorPlanPath, stopResponse.floorPlanPath) &&
        Objects.equals(valid, stopResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoId, latitude, longitude, startWindow, endWindow, type, eta, etd, score, errorCode, error, itemId, itemSize, load, floorPlanPath, valid);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopResponse {\n");
    
    sb.append("    geoId: ").append(toIndentedString(geoId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    startWindow: ").append(toIndentedString(startWindow)).append("\n");
    sb.append("    endWindow: ").append(toIndentedString(endWindow)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    etd: ").append(toIndentedString(etd)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemSize: ").append(toIndentedString(itemSize)).append("\n");
    sb.append("    load: ").append(toIndentedString(load)).append("\n");
    sb.append("    floorPlanPath: ").append(toIndentedString(floorPlanPath)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

