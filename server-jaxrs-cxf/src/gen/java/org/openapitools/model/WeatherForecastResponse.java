package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WeatherForecastResponse  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Long forecastDate;

  @ApiModelProperty(value = "")

  private Double precipMM;

  @ApiModelProperty(value = "")

  private Integer tempMaxC;

  @ApiModelProperty(value = "")

  private Integer tempMaxF;

  @ApiModelProperty(value = "")

  private Integer tempMinC;

  @ApiModelProperty(value = "")

  private Integer tempMinF;

  @ApiModelProperty(value = "")

  private Integer weatherCode;

  @ApiModelProperty(value = "")

  private String weatherDesc;

  @ApiModelProperty(value = "")

  private String weatherIconUrl;

  @ApiModelProperty(value = "")

  private String winddir16Point;

  @ApiModelProperty(value = "")

  private Integer winddirDegree;

  @ApiModelProperty(value = "")

  private String winddirection;

  @ApiModelProperty(value = "")

  private Integer windspeedKmph;

  @ApiModelProperty(value = "")

  private Integer windspeedMiles;
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

  public WeatherForecastResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get forecastDate
   * @return forecastDate
  **/
  @JsonProperty("forecastDate")
  public Long getForecastDate() {
    return forecastDate;
  }

  public void setForecastDate(Long forecastDate) {
    this.forecastDate = forecastDate;
  }

  public WeatherForecastResponse forecastDate(Long forecastDate) {
    this.forecastDate = forecastDate;
    return this;
  }

 /**
   * Get precipMM
   * @return precipMM
  **/
  @JsonProperty("precipMM")
  public Double getPrecipMM() {
    return precipMM;
  }

  public void setPrecipMM(Double precipMM) {
    this.precipMM = precipMM;
  }

  public WeatherForecastResponse precipMM(Double precipMM) {
    this.precipMM = precipMM;
    return this;
  }

 /**
   * Get tempMaxC
   * @return tempMaxC
  **/
  @JsonProperty("tempMaxC")
  public Integer getTempMaxC() {
    return tempMaxC;
  }

  public void setTempMaxC(Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
  }

  public WeatherForecastResponse tempMaxC(Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
    return this;
  }

 /**
   * Get tempMaxF
   * @return tempMaxF
  **/
  @JsonProperty("tempMaxF")
  public Integer getTempMaxF() {
    return tempMaxF;
  }

  public void setTempMaxF(Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
  }

  public WeatherForecastResponse tempMaxF(Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
    return this;
  }

 /**
   * Get tempMinC
   * @return tempMinC
  **/
  @JsonProperty("tempMinC")
  public Integer getTempMinC() {
    return tempMinC;
  }

  public void setTempMinC(Integer tempMinC) {
    this.tempMinC = tempMinC;
  }

  public WeatherForecastResponse tempMinC(Integer tempMinC) {
    this.tempMinC = tempMinC;
    return this;
  }

 /**
   * Get tempMinF
   * @return tempMinF
  **/
  @JsonProperty("tempMinF")
  public Integer getTempMinF() {
    return tempMinF;
  }

  public void setTempMinF(Integer tempMinF) {
    this.tempMinF = tempMinF;
  }

  public WeatherForecastResponse tempMinF(Integer tempMinF) {
    this.tempMinF = tempMinF;
    return this;
  }

 /**
   * Get weatherCode
   * @return weatherCode
  **/
  @JsonProperty("weatherCode")
  public Integer getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  public WeatherForecastResponse weatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

 /**
   * Get weatherDesc
   * @return weatherDesc
  **/
  @JsonProperty("weatherDesc")
  public String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public WeatherForecastResponse weatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

 /**
   * Get weatherIconUrl
   * @return weatherIconUrl
  **/
  @JsonProperty("weatherIconUrl")
  public String getWeatherIconUrl() {
    return weatherIconUrl;
  }

  public void setWeatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  public WeatherForecastResponse weatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
    return this;
  }

 /**
   * Get winddir16Point
   * @return winddir16Point
  **/
  @JsonProperty("winddir16Point")
  public String getWinddir16Point() {
    return winddir16Point;
  }

  public void setWinddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  public WeatherForecastResponse winddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
    return this;
  }

 /**
   * Get winddirDegree
   * @return winddirDegree
  **/
  @JsonProperty("winddirDegree")
  public Integer getWinddirDegree() {
    return winddirDegree;
  }

  public void setWinddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  public WeatherForecastResponse winddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
    return this;
  }

 /**
   * Get winddirection
   * @return winddirection
  **/
  @JsonProperty("winddirection")
  public String getWinddirection() {
    return winddirection;
  }

  public void setWinddirection(String winddirection) {
    this.winddirection = winddirection;
  }

  public WeatherForecastResponse winddirection(String winddirection) {
    this.winddirection = winddirection;
    return this;
  }

 /**
   * Get windspeedKmph
   * @return windspeedKmph
  **/
  @JsonProperty("windspeedKmph")
  public Integer getWindspeedKmph() {
    return windspeedKmph;
  }

  public void setWindspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  public WeatherForecastResponse windspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
    return this;
  }

 /**
   * Get windspeedMiles
   * @return windspeedMiles
  **/
  @JsonProperty("windspeedMiles")
  public Integer getWindspeedMiles() {
    return windspeedMiles;
  }

  public void setWindspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
  }

  public WeatherForecastResponse windspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

