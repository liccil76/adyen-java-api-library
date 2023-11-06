/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * DetailsRequestAuthenticationData
 */
@JsonPropertyOrder({
  DetailsRequestAuthenticationData.JSON_PROPERTY_AUTHENTICATION_ONLY
})

public class DetailsRequestAuthenticationData {
  public static final String JSON_PROPERTY_AUTHENTICATION_ONLY = "authenticationOnly";
  private Boolean authenticationOnly = false;

  public DetailsRequestAuthenticationData() { 
  }

  public DetailsRequestAuthenticationData authenticationOnly(Boolean authenticationOnly) {
    this.authenticationOnly = authenticationOnly;
    return this;
  }

   /**
   * If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. Default: *false**.
   * @return authenticationOnly
  **/
  @ApiModelProperty(value = "If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. Default: *false**.")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthenticationOnly() {
    return authenticationOnly;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationOnly(Boolean authenticationOnly) {
    this.authenticationOnly = authenticationOnly;
  }


  /**
   * Return true if this DetailsRequestAuthenticationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsRequestAuthenticationData detailsRequestAuthenticationData = (DetailsRequestAuthenticationData) o;
    return Objects.equals(this.authenticationOnly, detailsRequestAuthenticationData.authenticationOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsRequestAuthenticationData {\n");
    sb.append("    authenticationOnly: ").append(toIndentedString(authenticationOnly)).append("\n");
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
   * Create an instance of DetailsRequestAuthenticationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailsRequestAuthenticationData
   * @throws JsonProcessingException if the JSON string is invalid with respect to DetailsRequestAuthenticationData
   */
  public static DetailsRequestAuthenticationData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DetailsRequestAuthenticationData.class);
  }
/**
  * Convert an instance of DetailsRequestAuthenticationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

