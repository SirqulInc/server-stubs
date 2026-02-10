package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LoadShortResponse;
import org.openapitools.model.NodeRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StopResponse  {
  
  @ApiModelProperty(value = "")

  private String geoId;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Long startWindow;

  @ApiModelProperty(value = "")

  private Long endWindow;

public enum TypeEnum {

PICKUP(String.valueOf("PICKUP")), DROPOFF(String.valueOf("DROPOFF")), START(String.valueOf("START")), END(String.valueOf("END")), ROUTING(String.valueOf("ROUTING"));


    private String value;

    TypeEnum (String v) {
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
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private TypeEnum type;

  @ApiModelProperty(value = "")

  private Long eta;

  @ApiModelProperty(value = "")

  private Long etd;

  @ApiModelProperty(value = "")

  private Long score;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  private String error;

  @ApiModelProperty(value = "")

  private String itemId;

  @ApiModelProperty(value = "")

  private Long itemSize;

  @ApiModelProperty(value = "")

  @Valid

  private LoadShortResponse load;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NodeRequest> floorPlanPath = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean valid;
 /**
   * Get geoId
   * @return geoId
  **/
  @JsonProperty("geoId")
  public String getGeoId() {
    return geoId;
  }

  public void setGeoId(String geoId) {
    this.geoId = geoId;
  }

  public StopResponse geoId(String geoId) {
    this.geoId = geoId;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public StopResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public StopResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get startWindow
   * @return startWindow
  **/
  @JsonProperty("startWindow")
  public Long getStartWindow() {
    return startWindow;
  }

  public void setStartWindow(Long startWindow) {
    this.startWindow = startWindow;
  }

  public StopResponse startWindow(Long startWindow) {
    this.startWindow = startWindow;
    return this;
  }

 /**
   * Get endWindow
   * @return endWindow
  **/
  @JsonProperty("endWindow")
  public Long getEndWindow() {
    return endWindow;
  }

  public void setEndWindow(Long endWindow) {
    this.endWindow = endWindow;
  }

  public StopResponse endWindow(Long endWindow) {
    this.endWindow = endWindow;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StopResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get eta
   * @return eta
  **/
  @JsonProperty("eta")
  public Long getEta() {
    return eta;
  }

  public void setEta(Long eta) {
    this.eta = eta;
  }

  public StopResponse eta(Long eta) {
    this.eta = eta;
    return this;
  }

 /**
   * Get etd
   * @return etd
  **/
  @JsonProperty("etd")
  public Long getEtd() {
    return etd;
  }

  public void setEtd(Long etd) {
    this.etd = etd;
  }

  public StopResponse etd(Long etd) {
    this.etd = etd;
    return this;
  }

 /**
   * Get score
   * @return score
  **/
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public StopResponse score(Long score) {
    this.score = score;
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

  public StopResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public StopResponse error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Get itemId
   * @return itemId
  **/
  @JsonProperty("itemId")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public StopResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get itemSize
   * @return itemSize
  **/
  @JsonProperty("itemSize")
  public Long getItemSize() {
    return itemSize;
  }

  public void setItemSize(Long itemSize) {
    this.itemSize = itemSize;
  }

  public StopResponse itemSize(Long itemSize) {
    this.itemSize = itemSize;
    return this;
  }

 /**
   * Get load
   * @return load
  **/
  @JsonProperty("load")
  public LoadShortResponse getLoad() {
    return load;
  }

  public void setLoad(LoadShortResponse load) {
    this.load = load;
  }

  public StopResponse load(LoadShortResponse load) {
    this.load = load;
    return this;
  }

 /**
   * Get floorPlanPath
   * @return floorPlanPath
  **/
  @JsonProperty("floorPlanPath")
  public List<@Valid NodeRequest> getFloorPlanPath() {
    return floorPlanPath;
  }

  public void setFloorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
  }

  public StopResponse floorPlanPath(List<@Valid NodeRequest> floorPlanPath) {
    this.floorPlanPath = floorPlanPath;
    return this;
  }

  public StopResponse addFloorPlanPathItem(NodeRequest floorPlanPathItem) {
    this.floorPlanPath.add(floorPlanPathItem);
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

  public StopResponse valid(Boolean valid) {
    this.valid = valid;
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
    StopResponse stopResponse = (StopResponse) o;
    return Objects.equals(this.geoId, stopResponse.geoId) &&
        Objects.equals(this.latitude, stopResponse.latitude) &&
        Objects.equals(this.longitude, stopResponse.longitude) &&
        Objects.equals(this.startWindow, stopResponse.startWindow) &&
        Objects.equals(this.endWindow, stopResponse.endWindow) &&
        Objects.equals(this.type, stopResponse.type) &&
        Objects.equals(this.eta, stopResponse.eta) &&
        Objects.equals(this.etd, stopResponse.etd) &&
        Objects.equals(this.score, stopResponse.score) &&
        Objects.equals(this.errorCode, stopResponse.errorCode) &&
        Objects.equals(this.error, stopResponse.error) &&
        Objects.equals(this.itemId, stopResponse.itemId) &&
        Objects.equals(this.itemSize, stopResponse.itemSize) &&
        Objects.equals(this.load, stopResponse.load) &&
        Objects.equals(this.floorPlanPath, stopResponse.floorPlanPath) &&
        Objects.equals(this.valid, stopResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoId, latitude, longitude, startWindow, endWindow, type, eta, etd, score, errorCode, error, itemId, itemSize, load, floorPlanPath, valid);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

