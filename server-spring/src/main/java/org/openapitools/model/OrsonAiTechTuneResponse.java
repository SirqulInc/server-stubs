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
 * OrsonAiTechTuneResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiTechTuneResponse {

  private @Nullable String requestId;

  private @Nullable Integer responseCode;

  private @Nullable String responseRaw;

  private @Nullable Integer people;

  private @Nullable Boolean wasCutoff;

  private @Nullable Integer frames;

  private @Nullable Integer framesWithoutAFace;

  private @Nullable Integer framesWithFaceOffscreen;

  private @Nullable Integer framesWithWrongNumberOfPeople;

  private @Nullable Integer height;

  private @Nullable Integer width;

  private @Nullable Integer fps;

  public OrsonAiTechTuneResponse requestId(@Nullable String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Get requestId
   * @return requestId
   */
  
  @Schema(name = "requestId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestId")
  public @Nullable String getRequestId() {
    return requestId;
  }

  public void setRequestId(@Nullable String requestId) {
    this.requestId = requestId;
  }

  public OrsonAiTechTuneResponse responseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   */
  
  @Schema(name = "responseCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseCode")
  public @Nullable Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(@Nullable Integer responseCode) {
    this.responseCode = responseCode;
  }

  public OrsonAiTechTuneResponse responseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
    return this;
  }

  /**
   * Get responseRaw
   * @return responseRaw
   */
  
  @Schema(name = "responseRaw", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responseRaw")
  public @Nullable String getResponseRaw() {
    return responseRaw;
  }

  public void setResponseRaw(@Nullable String responseRaw) {
    this.responseRaw = responseRaw;
  }

  public OrsonAiTechTuneResponse people(@Nullable Integer people) {
    this.people = people;
    return this;
  }

  /**
   * Get people
   * @return people
   */
  
  @Schema(name = "people", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("people")
  public @Nullable Integer getPeople() {
    return people;
  }

  public void setPeople(@Nullable Integer people) {
    this.people = people;
  }

  public OrsonAiTechTuneResponse wasCutoff(@Nullable Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
    return this;
  }

  /**
   * Get wasCutoff
   * @return wasCutoff
   */
  
  @Schema(name = "wasCutoff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wasCutoff")
  public @Nullable Boolean getWasCutoff() {
    return wasCutoff;
  }

  public void setWasCutoff(@Nullable Boolean wasCutoff) {
    this.wasCutoff = wasCutoff;
  }

  public OrsonAiTechTuneResponse frames(@Nullable Integer frames) {
    this.frames = frames;
    return this;
  }

  /**
   * Get frames
   * @return frames
   */
  
  @Schema(name = "frames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frames")
  public @Nullable Integer getFrames() {
    return frames;
  }

  public void setFrames(@Nullable Integer frames) {
    this.frames = frames;
  }

  public OrsonAiTechTuneResponse framesWithoutAFace(@Nullable Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
    return this;
  }

  /**
   * Get framesWithoutAFace
   * @return framesWithoutAFace
   */
  
  @Schema(name = "framesWithoutAFace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("framesWithoutAFace")
  public @Nullable Integer getFramesWithoutAFace() {
    return framesWithoutAFace;
  }

  public void setFramesWithoutAFace(@Nullable Integer framesWithoutAFace) {
    this.framesWithoutAFace = framesWithoutAFace;
  }

  public OrsonAiTechTuneResponse framesWithFaceOffscreen(@Nullable Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
    return this;
  }

  /**
   * Get framesWithFaceOffscreen
   * @return framesWithFaceOffscreen
   */
  
  @Schema(name = "framesWithFaceOffscreen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("framesWithFaceOffscreen")
  public @Nullable Integer getFramesWithFaceOffscreen() {
    return framesWithFaceOffscreen;
  }

  public void setFramesWithFaceOffscreen(@Nullable Integer framesWithFaceOffscreen) {
    this.framesWithFaceOffscreen = framesWithFaceOffscreen;
  }

  public OrsonAiTechTuneResponse framesWithWrongNumberOfPeople(@Nullable Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
    return this;
  }

  /**
   * Get framesWithWrongNumberOfPeople
   * @return framesWithWrongNumberOfPeople
   */
  
  @Schema(name = "framesWithWrongNumberOfPeople", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("framesWithWrongNumberOfPeople")
  public @Nullable Integer getFramesWithWrongNumberOfPeople() {
    return framesWithWrongNumberOfPeople;
  }

  public void setFramesWithWrongNumberOfPeople(@Nullable Integer framesWithWrongNumberOfPeople) {
    this.framesWithWrongNumberOfPeople = framesWithWrongNumberOfPeople;
  }

  public OrsonAiTechTuneResponse height(@Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public @Nullable Integer getHeight() {
    return height;
  }

  public void setHeight(@Nullable Integer height) {
    this.height = height;
  }

  public OrsonAiTechTuneResponse width(@Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public @Nullable Integer getWidth() {
    return width;
  }

  public void setWidth(@Nullable Integer width) {
    this.width = width;
  }

  public OrsonAiTechTuneResponse fps(@Nullable Integer fps) {
    this.fps = fps;
    return this;
  }

  /**
   * Get fps
   * @return fps
   */
  
  @Schema(name = "fps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fps")
  public @Nullable Integer getFps() {
    return fps;
  }

  public void setFps(@Nullable Integer fps) {
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
    return Objects.equals(this.requestId, orsonAiTechTuneResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiTechTuneResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiTechTuneResponse.responseRaw) &&
        Objects.equals(this.people, orsonAiTechTuneResponse.people) &&
        Objects.equals(this.wasCutoff, orsonAiTechTuneResponse.wasCutoff) &&
        Objects.equals(this.frames, orsonAiTechTuneResponse.frames) &&
        Objects.equals(this.framesWithoutAFace, orsonAiTechTuneResponse.framesWithoutAFace) &&
        Objects.equals(this.framesWithFaceOffscreen, orsonAiTechTuneResponse.framesWithFaceOffscreen) &&
        Objects.equals(this.framesWithWrongNumberOfPeople, orsonAiTechTuneResponse.framesWithWrongNumberOfPeople) &&
        Objects.equals(this.height, orsonAiTechTuneResponse.height) &&
        Objects.equals(this.width, orsonAiTechTuneResponse.width) &&
        Objects.equals(this.fps, orsonAiTechTuneResponse.fps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, people, wasCutoff, frames, framesWithoutAFace, framesWithFaceOffscreen, framesWithWrongNumberOfPeople, height, width, fps);
  }

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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

