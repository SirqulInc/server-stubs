package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WeatherForecastResponse   {
  
  private Long id;
  private Long forecastDate;
  private Double precipMM;
  private Integer tempMaxC;
  private Integer tempMaxF;
  private Integer tempMinC;
  private Integer tempMinF;
  private Integer weatherCode;
  private String weatherDesc;
  private String weatherIconUrl;
  private String winddir16Point;
  private Integer winddirDegree;
  private String winddirection;
  private Integer windspeedKmph;
  private Integer windspeedMiles;

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
  @JsonProperty("forecastDate")
  public Long getForecastDate() {
    return forecastDate;
  }
  public void setForecastDate(Long forecastDate) {
    this.forecastDate = forecastDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("precipMM")
  public Double getPrecipMM() {
    return precipMM;
  }
  public void setPrecipMM(Double precipMM) {
    this.precipMM = precipMM;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempMaxC")
  public Integer getTempMaxC() {
    return tempMaxC;
  }
  public void setTempMaxC(Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempMaxF")
  public Integer getTempMaxF() {
    return tempMaxF;
  }
  public void setTempMaxF(Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempMinC")
  public Integer getTempMinC() {
    return tempMinC;
  }
  public void setTempMinC(Integer tempMinC) {
    this.tempMinC = tempMinC;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tempMinF")
  public Integer getTempMinF() {
    return tempMinF;
  }
  public void setTempMinF(Integer tempMinF) {
    this.tempMinF = tempMinF;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weatherCode")
  public Integer getWeatherCode() {
    return weatherCode;
  }
  public void setWeatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weatherDesc")
  public String getWeatherDesc() {
    return weatherDesc;
  }
  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("weatherIconUrl")
  public String getWeatherIconUrl() {
    return weatherIconUrl;
  }
  public void setWeatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("winddir16Point")
  public String getWinddir16Point() {
    return winddir16Point;
  }
  public void setWinddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("winddirDegree")
  public Integer getWinddirDegree() {
    return winddirDegree;
  }
  public void setWinddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("winddirection")
  public String getWinddirection() {
    return winddirection;
  }
  public void setWinddirection(String winddirection) {
    this.winddirection = winddirection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("windspeedKmph")
  public Integer getWindspeedKmph() {
    return windspeedKmph;
  }
  public void setWindspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("windspeedMiles")
  public Integer getWindspeedMiles() {
    return windspeedMiles;
  }
  public void setWindspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeatherForecastResponse weatherForecastResponse = (WeatherForecastResponse) o;
    return Objects.equals(this.id, weatherForecastResponse.id) &&
        Objects.equals(this.forecastDate, weatherForecastResponse.forecastDate) &&
        Objects.equals(this.precipMM, weatherForecastResponse.precipMM) &&
        Objects.equals(this.tempMaxC, weatherForecastResponse.tempMaxC) &&
        Objects.equals(this.tempMaxF, weatherForecastResponse.tempMaxF) &&
        Objects.equals(this.tempMinC, weatherForecastResponse.tempMinC) &&
        Objects.equals(this.tempMinF, weatherForecastResponse.tempMinF) &&
        Objects.equals(this.weatherCode, weatherForecastResponse.weatherCode) &&
        Objects.equals(this.weatherDesc, weatherForecastResponse.weatherDesc) &&
        Objects.equals(this.weatherIconUrl, weatherForecastResponse.weatherIconUrl) &&
        Objects.equals(this.winddir16Point, weatherForecastResponse.winddir16Point) &&
        Objects.equals(this.winddirDegree, weatherForecastResponse.winddirDegree) &&
        Objects.equals(this.winddirection, weatherForecastResponse.winddirection) &&
        Objects.equals(this.windspeedKmph, weatherForecastResponse.windspeedKmph) &&
        Objects.equals(this.windspeedMiles, weatherForecastResponse.windspeedMiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, forecastDate, precipMM, tempMaxC, tempMaxF, tempMinC, tempMinF, weatherCode, weatherDesc, weatherIconUrl, winddir16Point, winddirDegree, winddirection, windspeedKmph, windspeedMiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeatherForecastResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    forecastDate: ").append(toIndentedString(forecastDate)).append("\n");
    sb.append("    precipMM: ").append(toIndentedString(precipMM)).append("\n");
    sb.append("    tempMaxC: ").append(toIndentedString(tempMaxC)).append("\n");
    sb.append("    tempMaxF: ").append(toIndentedString(tempMaxF)).append("\n");
    sb.append("    tempMinC: ").append(toIndentedString(tempMinC)).append("\n");
    sb.append("    tempMinF: ").append(toIndentedString(tempMinF)).append("\n");
    sb.append("    weatherCode: ").append(toIndentedString(weatherCode)).append("\n");
    sb.append("    weatherDesc: ").append(toIndentedString(weatherDesc)).append("\n");
    sb.append("    weatherIconUrl: ").append(toIndentedString(weatherIconUrl)).append("\n");
    sb.append("    winddir16Point: ").append(toIndentedString(winddir16Point)).append("\n");
    sb.append("    winddirDegree: ").append(toIndentedString(winddirDegree)).append("\n");
    sb.append("    winddirection: ").append(toIndentedString(winddirection)).append("\n");
    sb.append("    windspeedKmph: ").append(toIndentedString(windspeedKmph)).append("\n");
    sb.append("    windspeedMiles: ").append(toIndentedString(windspeedMiles)).append("\n");
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

