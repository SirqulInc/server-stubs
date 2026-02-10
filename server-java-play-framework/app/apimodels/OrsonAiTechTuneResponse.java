package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiTechTuneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiTechTuneResponse   {
  @JsonProperty("requestId")
  
  private String requestId;

  @JsonProperty("responseCode")
  
  private Integer responseCode;

  @JsonProperty("responseRaw")
  
  private String responseRaw;

  @JsonProperty("people")
  
  private Integer people;

  @JsonProperty("wasCutoff")
  
  private Boolean wasCutoff;

  @JsonProperty("frames")
  
  private Integer frames;

  @JsonProperty("framesWithoutAFace")
  
  private Integer framesWithoutAFace;

  @JsonProperty("framesWithFaceOffscreen")
  
  private Integer framesWithFaceOffscreen;

  @JsonProperty("framesWithWrongNumberOfPeople")
  
  private Integer framesWithWrongNumberOfPeople;

  @JsonProperty("height")
  
  private Integer height;

  @JsonProperty("width")
  
  private Integer width;

  @JsonProperty("fps")
  
  private Integer fps;

  public OrsonAiTechTuneResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public OrsonAiTechTuneResponse responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonAiTechTuneResponse responseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

   /**
   * Get responseRaw
   * @return responseRaw
  **/
  public String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonAiTechTuneResponse people(Integer people) {
    this.people = people;
    return this;
  }

   /**
   * Get people
   * @return people
  **/
  public Integer getPeople() {
    return people;
  }

  public void setPeople(Integer people) {
    this.people = people;
  }

  public OrsonAiTechTuneResponse wasCutoff(Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
    return this;
  }

   /**
   * Get wasCutoff
   * @return wasCutoff
  **/
  public Boolean getWasCutoff() {
    return wasCutoff;
  }

  public void setWasCutoff(Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
  }

  public OrsonAiTechTuneResponse frames(Integer frames) {
    this.frames = frames;
    return this;
  }

   /**
   * Get frames
   * @return frames
  **/
  public Integer getFrames() {
    return frames;
  }

  public void setFrames(Integer frames) {
    this.frames = frames;
  }

  public OrsonAiTechTuneResponse framesWithoutAFace(Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
    return this;
  }

   /**
   * Get framesWithoutAFace
   * @return framesWithoutAFace
  **/
  public Integer getFramesWithoutAFace() {
    return framesWithoutAFace;
  }

  public void setFramesWithoutAFace(Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
  }

  public OrsonAiTechTuneResponse framesWithFaceOffscreen(Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
    return this;
  }

   /**
   * Get framesWithFaceOffscreen
   * @return framesWithFaceOffscreen
  **/
  public Integer getFramesWithFaceOffscreen() {
    return framesWithFaceOffscreen;
  }

  public void setFramesWithFaceOffscreen(Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
  }

  public OrsonAiTechTuneResponse framesWithWrongNumberOfPeople(Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
    return this;
  }

   /**
   * Get framesWithWrongNumberOfPeople
   * @return framesWithWrongNumberOfPeople
  **/
  public Integer getFramesWithWrongNumberOfPeople() {
    return framesWithWrongNumberOfPeople;
  }

  public void setFramesWithWrongNumberOfPeople(Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
  }

  public OrsonAiTechTuneResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public OrsonAiTechTuneResponse width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public OrsonAiTechTuneResponse fps(Integer fps) {
    this.fps = fps;
    return this;
  }

   /**
   * Get fps
   * @return fps
  **/
  public Integer getFps() {
    return fps;
  }

  public void setFps(Integer fps) {
    this.fps = fps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiTechTuneResponse orsonAiTechTuneResponse = (OrsonAiTechTuneResponse) o;
    return Objects.equals(requestId, orsonAiTechTuneResponse.requestId) &&
        Objects.equals(responseCode, orsonAiTechTuneResponse.responseCode) &&
        Objects.equals(responseRaw, orsonAiTechTuneResponse.responseRaw) &&
        Objects.equals(people, orsonAiTechTuneResponse.people) &&
        Objects.equals(wasCutoff, orsonAiTechTuneResponse.wasCutoff) &&
        Objects.equals(frames, orsonAiTechTuneResponse.frames) &&
        Objects.equals(framesWithoutAFace, orsonAiTechTuneResponse.framesWithoutAFace) &&
        Objects.equals(framesWithFaceOffscreen, orsonAiTechTuneResponse.framesWithFaceOffscreen) &&
        Objects.equals(framesWithWrongNumberOfPeople, orsonAiTechTuneResponse.framesWithWrongNumberOfPeople) &&
        Objects.equals(height, orsonAiTechTuneResponse.height) &&
        Objects.equals(width, orsonAiTechTuneResponse.width) &&
        Objects.equals(fps, orsonAiTechTuneResponse.fps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, people, wasCutoff, frames, framesWithoutAFace, framesWithFaceOffscreen, framesWithWrongNumberOfPeople, height, width, fps);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiTechTuneResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    wasCutoff: ").append(toIndentedString(wasCutoff)).append("\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    framesWithoutAFace: ").append(toIndentedString(framesWithoutAFace)).append("\n");
    sb.append("    framesWithFaceOffscreen: ").append(toIndentedString(framesWithFaceOffscreen)).append("\n");
    sb.append("    framesWithWrongNumberOfPeople: ").append(toIndentedString(framesWithWrongNumberOfPeople)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
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

