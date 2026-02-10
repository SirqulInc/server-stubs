package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * WeatherForecastResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WeatherForecastResponse   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("forecastDate")
  
  private Long forecastDate;

  @JsonProperty("precipMM")
  
  private Double precipMM;

  @JsonProperty("tempMaxC")
  
  private Integer tempMaxC;

  @JsonProperty("tempMaxF")
  
  private Integer tempMaxF;

  @JsonProperty("tempMinC")
  
  private Integer tempMinC;

  @JsonProperty("tempMinF")
  
  private Integer tempMinF;

  @JsonProperty("weatherCode")
  
  private Integer weatherCode;

  @JsonProperty("weatherDesc")
  
  private String weatherDesc;

  @JsonProperty("weatherIconUrl")
  
  private String weatherIconUrl;

  @JsonProperty("winddir16Point")
  
  private String winddir16Point;

  @JsonProperty("winddirDegree")
  
  private Integer winddirDegree;

  @JsonProperty("winddirection")
  
  private String winddirection;

  @JsonProperty("windspeedKmph")
  
  private Integer windspeedKmph;

  @JsonProperty("windspeedMiles")
  
  private Integer windspeedMiles;

  public WeatherForecastResponse id(Long id) {
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

  public WeatherForecastResponse forecastDate(Long forecastDate) {
    this.forecastDate = forecastDate;
    return this;
  }

   /**
   * Get forecastDate
   * @return forecastDate
  **/
  public Long getForecastDate() {
    return forecastDate;
  }

  public void setForecastDate(Long forecastDate) {
    this.forecastDate = forecastDate;
  }

  public WeatherForecastResponse precipMM(Double precipMM) {
    this.precipMM = precipMM;
    return this;
  }

   /**
   * Get precipMM
   * @return precipMM
  **/
  public Double getPrecipMM() {
    return precipMM;
  }

  public void setPrecipMM(Double precipMM) {
    this.precipMM = precipMM;
  }

  public WeatherForecastResponse tempMaxC(Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
    return this;
  }

   /**
   * Get tempMaxC
   * @return tempMaxC
  **/
  public Integer getTempMaxC() {
    return tempMaxC;
  }

  public void setTempMaxC(Integer tempMaxC) {
    this.tempMaxC = tempMaxC;
  }

  public WeatherForecastResponse tempMaxF(Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
    return this;
  }

   /**
   * Get tempMaxF
   * @return tempMaxF
  **/
  public Integer getTempMaxF() {
    return tempMaxF;
  }

  public void setTempMaxF(Integer tempMaxF) {
    this.tempMaxF = tempMaxF;
  }

  public WeatherForecastResponse tempMinC(Integer tempMinC) {
    this.tempMinC = tempMinC;
    return this;
  }

   /**
   * Get tempMinC
   * @return tempMinC
  **/
  public Integer getTempMinC() {
    return tempMinC;
  }

  public void setTempMinC(Integer tempMinC) {
    this.tempMinC = tempMinC;
  }

  public WeatherForecastResponse tempMinF(Integer tempMinF) {
    this.tempMinF = tempMinF;
    return this;
  }

   /**
   * Get tempMinF
   * @return tempMinF
  **/
  public Integer getTempMinF() {
    return tempMinF;
  }

  public void setTempMinF(Integer tempMinF) {
    this.tempMinF = tempMinF;
  }

  public WeatherForecastResponse weatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
    return this;
  }

   /**
   * Get weatherCode
   * @return weatherCode
  **/
  public Integer getWeatherCode() {
    return weatherCode;
  }

  public void setWeatherCode(Integer weatherCode) {
    this.weatherCode = weatherCode;
  }

  public WeatherForecastResponse weatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
    return this;
  }

   /**
   * Get weatherDesc
   * @return weatherDesc
  **/
  public String getWeatherDesc() {
    return weatherDesc;
  }

  public void setWeatherDesc(String weatherDesc) {
    this.weatherDesc = weatherDesc;
  }

  public WeatherForecastResponse weatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
    return this;
  }

   /**
   * Get weatherIconUrl
   * @return weatherIconUrl
  **/
  public String getWeatherIconUrl() {
    return weatherIconUrl;
  }

  public void setWeatherIconUrl(String weatherIconUrl) {
    this.weatherIconUrl = weatherIconUrl;
  }

  public WeatherForecastResponse winddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
    return this;
  }

   /**
   * Get winddir16Point
   * @return winddir16Point
  **/
  public String getWinddir16Point() {
    return winddir16Point;
  }

  public void setWinddir16Point(String winddir16Point) {
    this.winddir16Point = winddir16Point;
  }

  public WeatherForecastResponse winddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
    return this;
  }

   /**
   * Get winddirDegree
   * @return winddirDegree
  **/
  public Integer getWinddirDegree() {
    return winddirDegree;
  }

  public void setWinddirDegree(Integer winddirDegree) {
    this.winddirDegree = winddirDegree;
  }

  public WeatherForecastResponse winddirection(String winddirection) {
    this.winddirection = winddirection;
    return this;
  }

   /**
   * Get winddirection
   * @return winddirection
  **/
  public String getWinddirection() {
    return winddirection;
  }

  public void setWinddirection(String winddirection) {
    this.winddirection = winddirection;
  }

  public WeatherForecastResponse windspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
    return this;
  }

   /**
   * Get windspeedKmph
   * @return windspeedKmph
  **/
  public Integer getWindspeedKmph() {
    return windspeedKmph;
  }

  public void setWindspeedKmph(Integer windspeedKmph) {
    this.windspeedKmph = windspeedKmph;
  }

  public WeatherForecastResponse windspeedMiles(Integer windspeedMiles) {
    this.windspeedMiles = windspeedMiles;
    return this;
  }

   /**
   * Get windspeedMiles
   * @return windspeedMiles
  **/
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
    return Objects.equals(id, weatherForecastResponse.id) &&
        Objects.equals(forecastDate, weatherForecastResponse.forecastDate) &&
        Objects.equals(precipMM, weatherForecastResponse.precipMM) &&
        Objects.equals(tempMaxC, weatherForecastResponse.tempMaxC) &&
        Objects.equals(tempMaxF, weatherForecastResponse.tempMaxF) &&
        Objects.equals(tempMinC, weatherForecastResponse.tempMinC) &&
        Objects.equals(tempMinF, weatherForecastResponse.tempMinF) &&
        Objects.equals(weatherCode, weatherForecastResponse.weatherCode) &&
        Objects.equals(weatherDesc, weatherForecastResponse.weatherDesc) &&
        Objects.equals(weatherIconUrl, weatherForecastResponse.weatherIconUrl) &&
        Objects.equals(winddir16Point, weatherForecastResponse.winddir16Point) &&
        Objects.equals(winddirDegree, weatherForecastResponse.winddirDegree) &&
        Objects.equals(winddirection, weatherForecastResponse.winddirection) &&
        Objects.equals(windspeedKmph, weatherForecastResponse.windspeedKmph) &&
        Objects.equals(windspeedMiles, weatherForecastResponse.windspeedMiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, forecastDate, precipMM, tempMaxC, tempMaxF, tempMinC, tempMinF, weatherCode, weatherDesc, weatherIconUrl, winddir16Point, winddirDegree, winddirection, windspeedKmph, windspeedMiles);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

