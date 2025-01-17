/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.BalanceAccountNotificationData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BalanceAccountNotificationRequest
 */
@JsonPropertyOrder({
  BalanceAccountNotificationRequest.JSON_PROPERTY_DATA,
  BalanceAccountNotificationRequest.JSON_PROPERTY_ENVIRONMENT,
  BalanceAccountNotificationRequest.JSON_PROPERTY_TYPE
})

public class BalanceAccountNotificationRequest {
  public static final String JSON_PROPERTY_DATA = "data";
  private BalanceAccountNotificationData data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  /**
   * Type of webhook.
   */
  public enum TypeEnum {
    UPDATED("balancePlatform.balanceAccount.updated"),
    
    CREATED("balancePlatform.balanceAccount.created");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public BalanceAccountNotificationRequest() { 
  }

  public BalanceAccountNotificationRequest data(BalanceAccountNotificationData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BalanceAccountNotificationData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(BalanceAccountNotificationData data) {
    this.data = data;
  }


  public BalanceAccountNotificationRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "The environment from which the webhook originated.  Possible values: **test**, **live**.")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public BalanceAccountNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of webhook.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of webhook.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this BalanceAccountNotificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountNotificationRequest balanceAccountNotificationRequest = (BalanceAccountNotificationRequest) o;
    return Objects.equals(this.data, balanceAccountNotificationRequest.data) &&
        Objects.equals(this.environment, balanceAccountNotificationRequest.environment) &&
        Objects.equals(this.type, balanceAccountNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountNotificationRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of BalanceAccountNotificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccountNotificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceAccountNotificationRequest
   */
  public static BalanceAccountNotificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceAccountNotificationRequest.class);
  }
/**
  * Convert an instance of BalanceAccountNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

