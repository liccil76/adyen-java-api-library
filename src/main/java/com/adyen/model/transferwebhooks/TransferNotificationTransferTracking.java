/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TransferNotificationTransferTracking
 */
@JsonPropertyOrder({
  TransferNotificationTransferTracking.JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME,
  TransferNotificationTransferTracking.JSON_PROPERTY_STATUS
})

public class TransferNotificationTransferTracking {
  public static final String JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME = "estimatedArrivalTime";
  private OffsetDateTime estimatedArrivalTime;

  /**
   * The tracking status of the transfer.
   */
  public enum StatusEnum {
    CREDITED("credited");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public TransferNotificationTransferTracking() { 
  }

  public TransferNotificationTransferTracking estimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

   /**
   * The estimated time the beneficiary should have access to the funds.
   * @return estimatedArrivalTime
  **/
  @ApiModelProperty(value = "The estimated time the beneficiary should have access to the funds.")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }


  public TransferNotificationTransferTracking status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The tracking status of the transfer.
   * @return status
  **/
  @ApiModelProperty(value = "The tracking status of the transfer.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this TransferNotificationTransferTracking object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferNotificationTransferTracking transferNotificationTransferTracking = (TransferNotificationTransferTracking) o;
    return Objects.equals(this.estimatedArrivalTime, transferNotificationTransferTracking.estimatedArrivalTime) &&
        Objects.equals(this.status, transferNotificationTransferTracking.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedArrivalTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferNotificationTransferTracking {\n");
    sb.append("    estimatedArrivalTime: ").append(toIndentedString(estimatedArrivalTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

/**
   * Create an instance of TransferNotificationTransferTracking given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferNotificationTransferTracking
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransferNotificationTransferTracking
   */
  public static TransferNotificationTransferTracking fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransferNotificationTransferTracking.class);
  }
/**
  * Convert an instance of TransferNotificationTransferTracking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

