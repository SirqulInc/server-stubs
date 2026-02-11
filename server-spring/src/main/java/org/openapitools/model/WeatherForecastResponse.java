package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WeatherForecastResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WeatherForecastResponse {

  private @Nullable Long id;

  private @Nullable Long forecastDate;

  private @Nullable Double precipMM;

  private @Nullable Integer tempMaxC;

  private @Nullable Integer tempMaxF;

  private @Nullable Integer tempMinC;

  private @Nullable Integer tempMinF;

  private @Nullable Integer weatherCode;

  private @Nullable String weatherDesc;

  private @Nullable String weatherIconUrl;

  private @Nullable String winddir16Point;

  private @Nullable Integer winddirDegree;

  private @Nullable String winddirection;

  private @Nullable Integer windspeedKmph;

  private @Nullable Integer windspeedMiles;

  public WeatherForecastResponse id(@Nullable Long id) {
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

  public WeatherForecastResponse forecastDate(@Nullable Long forecastDate) {
    this.forecastDate = forecastDate;
    return this;
  }

  /**
   * Get forecastDate
   * @return forecastDate
   */
  
  @Schema(name = "forecastDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forecastDate")
  public @Nullable Long getForecastDate() {
    return forecastDate;
  }

  public void setForecastDate(@Nullable Long forecastDate) {
    this.forecastDate = forecastDate;
  }

  public WeatherForecastResponse precipMM(@Nullable Double precipMM) {
    this.precipMM = precipMM;
    return this;
  }

  /**
   * Get precipMM
   * @return precipMM
   */
  
  @Schema(name = "precipMM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precipMM")
  public @Nullable Double getPrecipMM() {
    return precipMM;
  }

  public void setPrecipMM(@Nullable Double precipMM) {
    this.precipMM = precipMM;
  }

  public WeatherForecastResponse tempMaxC(@Nullable Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
    return this;
  }

  /**
   * Get tempMaxC
   * @return tempMaxC
   */
  
  @Schema(name = "tempMaxC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tempMaxC")
  public @Nullable Integer getTempMaxC() {
    return tempMaxC;
  }

  public void setTempMaxC(@Nullable Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
  }

  public WeatherForecastResponse tempMaxF(@Nullable Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
    return this;
  }

  /**
   * Get tempMaxF
   * @return tempMaxF
   */
  
  @Schema(name = "tempMaxF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tempMaxF")
  public @Nullable Integer getTempMaxF() {
    return tempMaxF;
  }

  public void setTempMaxF(@Nullable Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
  }

  public WeatherForecastResponse tempMinC(@Nullable Integer tempMinC) {
    this.tempMinC = tempMinC;
    return this;
  }

  /**
   * Get tempMinC
   * @return tempMinC
   */
  
  @Schema(name = "tempMinC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tempMinC")
  public @Nullable Integer getTempMinC() {
    return tempMinC;
  }

  public void setTempMinC(@Nullable Integer tempMinC) {
    this.tempMinC = tempMinC;
  }

  public WeatherForecastResponse tempMinF(@Nullable Integer tempMinF) {
    this.tempMinF = tempMinF;
    return this;
  }

  /**
   * Get tempMinF
   * @return tempMinF
   */
  
  @Schema(name = "tempMinF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tempMinF")
  public @Nullable Integer getTempMinF() {
    return tempMinF;
  }

  public void setTempMinF(@Nullable Integer tempMinF) {
    this.tempMinF = tempMinF;
  }

  public WeatherForecastResponse weatherCode(@Nullable Integer weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

  /**
   * Get weatherCode
   * @return weatherCode
   */
  
  @Schema(name = "weatherCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherCode")
  public @Nullable Integer getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(@Nullable Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  public WeatherForecastResponse weatherDesc(@Nullable String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

  /**
   * Get weatherDesc
   * @return weatherDesc
   */
  
  @Schema(name = "weatherDesc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherDesc")
  public @Nullable String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(@Nullable String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public WeatherForecastResponse weatherIconUrl(@Nullable String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
    return this;
  }

  /**
   * Get weatherIconUrl
   * @return weatherIconUrl
   */
  
  @Schema(name = "weatherIconUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weatherIconUrl")
  public @Nullable String getWeatherIconUrl() {
    return weatherIconUrl;
  }

  public void setWeatherIconUrl(@Nullable String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  public WeatherForecastResponse winddir16Point(@Nullable String winddir16Point) {
    this.winddir16Point = winddir16Point;
    return this;
  }

  /**
   * Get winddir16Point
   * @return winddir16Point
   */
  
  @Schema(name = "winddir16Point", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winddir16Point")
  public @Nullable String getWinddir16Point() {
    return winddir16Point;
  }

  public void setWinddir16Point(@Nullable String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  public WeatherForecastResponse winddirDegree(@Nullable Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
    return this;
  }

  /**
   * Get winddirDegree
   * @return winddirDegree
   */
  
  @Schema(name = "winddirDegree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winddirDegree")
  public @Nullable Integer getWinddirDegree() {
    return winddirDegree;
  }

  public void setWinddirDegree(@Nullable Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  public WeatherForecastResponse winddirection(@Nullable String winddirection) {
    this.winddirection = winddirection;
    return this;
  }

  /**
   * Get winddirection
   * @return winddirection
   */
  
  @Schema(name = "winddirection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winddirection")
  public @Nullable String getWinddirection() {
    return winddirection;
  }

  public void setWinddirection(@Nullable String winddirection) {
    this.winddirection = winddirection;
  }

  public WeatherForecastResponse windspeedKmph(@Nullable Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
    return this;
  }

  /**
   * Get windspeedKmph
   * @return windspeedKmph
   */
  
  @Schema(name = "windspeedKmph", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windspeedKmph")
  public @Nullable Integer getWindspeedKmph() {
    return windspeedKmph;
  }

  public void setWindspeedKmph(@Nullable Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  public WeatherForecastResponse windspeedMiles(@Nullable Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
    return this;
  }

  /**
   * Get windspeedMiles
   * @return windspeedMiles
   */
  
  @Schema(name = "windspeedMiles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windspeedMiles")
  public @Nullable Integer getWindspeedMiles() {
    return windspeedMiles;
  }

  public void setWindspeedMiles(@Nullable Integer windspeedMiles) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

