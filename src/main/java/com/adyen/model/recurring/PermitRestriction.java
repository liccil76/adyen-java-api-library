/*
 * Adyen Recurring API
 * The Recurring APIs allow you to manage and remove your tokens or saved payment details. Tokens should be created with validation during a payment request.  For more information, refer to our [Tokenization documentation](https://docs.adyen.com/online-payments/tokenization). ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Recurring API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Recurring/v68/disable ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Recurring/v68/disable ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.Amount;
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
 * PermitRestriction
 */
@JsonPropertyOrder({
  PermitRestriction.JSON_PROPERTY_MAX_AMOUNT,
  PermitRestriction.JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT,
  PermitRestriction.JSON_PROPERTY_SINGLE_USE
})

public class PermitRestriction {
  public static final String JSON_PROPERTY_MAX_AMOUNT = "maxAmount";
  private Amount maxAmount;

  public static final String JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT = "singleTransactionLimit";
  private Amount singleTransactionLimit;

  public static final String JSON_PROPERTY_SINGLE_USE = "singleUse";
  private Boolean singleUse;

  public PermitRestriction() { 
  }

  public PermitRestriction maxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Get maxAmount
   * @return maxAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getMaxAmount() {
    return maxAmount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
  }


  public PermitRestriction singleTransactionLimit(Amount singleTransactionLimit) {
    this.singleTransactionLimit = singleTransactionLimit;
    return this;
  }

   /**
   * Get singleTransactionLimit
   * @return singleTransactionLimit
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getSingleTransactionLimit() {
    return singleTransactionLimit;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_TRANSACTION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleTransactionLimit(Amount singleTransactionLimit) {
    this.singleTransactionLimit = singleTransactionLimit;
  }


  public PermitRestriction singleUse(Boolean singleUse) {
    this.singleUse = singleUse;
    return this;
  }

   /**
   * Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.
   * @return singleUse
  **/
  @ApiModelProperty(value = "Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.")
  @JsonProperty(JSON_PROPERTY_SINGLE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSingleUse() {
    return singleUse;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingleUse(Boolean singleUse) {
    this.singleUse = singleUse;
  }


  /**
   * Return true if this PermitRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermitRestriction permitRestriction = (PermitRestriction) o;
    return Objects.equals(this.maxAmount, permitRestriction.maxAmount) &&
        Objects.equals(this.singleTransactionLimit, permitRestriction.singleTransactionLimit) &&
        Objects.equals(this.singleUse, permitRestriction.singleUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAmount, singleTransactionLimit, singleUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermitRestriction {\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    singleTransactionLimit: ").append(toIndentedString(singleTransactionLimit)).append("\n");
    sb.append("    singleUse: ").append(toIndentedString(singleUse)).append("\n");
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
   * Create an instance of PermitRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PermitRestriction
   * @throws JsonProcessingException if the JSON string is invalid with respect to PermitRestriction
   */
  public static PermitRestriction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PermitRestriction.class);
  }
/**
  * Convert an instance of PermitRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
