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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * RiskData
 */
@JsonPropertyOrder({
  RiskData.JSON_PROPERTY_CLIENT_DATA,
  RiskData.JSON_PROPERTY_CUSTOM_FIELDS,
  RiskData.JSON_PROPERTY_FRAUD_OFFSET,
  RiskData.JSON_PROPERTY_PROFILE_REFERENCE
})

public class RiskData {
  public static final String JSON_PROPERTY_CLIENT_DATA = "clientData";
  private String clientData;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Map<String, String> customFields = null;

  public static final String JSON_PROPERTY_FRAUD_OFFSET = "fraudOffset";
  private Integer fraudOffset;

  public static final String JSON_PROPERTY_PROFILE_REFERENCE = "profileReference";
  private String profileReference;

  public RiskData() { 
  }

  public RiskData clientData(String clientData) {
    this.clientData = clientData;
    return this;
  }

   /**
   * Contains client-side data, like the device fingerprint, cookies, and specific browser settings.
   * @return clientData
  **/
  @ApiModelProperty(value = "Contains client-side data, like the device fingerprint, cookies, and specific browser settings.")
  @JsonProperty(JSON_PROPERTY_CLIENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientData() {
    return clientData;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientData(String clientData) {
    this.clientData = clientData;
  }


  public RiskData customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public RiskData putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Any custom fields used as part of the input to configured risk rules.
   * @return customFields
  **/
  @ApiModelProperty(value = "Any custom fields used as part of the input to configured risk rules.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  public RiskData fraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
    return this;
  }

   /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
  **/
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")
  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFraudOffset() {
    return fraudOffset;
  }


  @JsonProperty(JSON_PROPERTY_FRAUD_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }


  public RiskData profileReference(String profileReference) {
    this.profileReference = profileReference;
    return this;
  }

   /**
   * The risk profile to assign to this payment. When left empty, the merchant-level account&#39;s default risk profile will be applied.
   * @return profileReference
  **/
  @ApiModelProperty(value = "The risk profile to assign to this payment. When left empty, the merchant-level account's default risk profile will be applied.")
  @JsonProperty(JSON_PROPERTY_PROFILE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileReference() {
    return profileReference;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileReference(String profileReference) {
    this.profileReference = profileReference;
  }


  /**
   * Return true if this RiskData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskData riskData = (RiskData) o;
    return Objects.equals(this.clientData, riskData.clientData) &&
        Objects.equals(this.customFields, riskData.customFields) &&
        Objects.equals(this.fraudOffset, riskData.fraudOffset) &&
        Objects.equals(this.profileReference, riskData.profileReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientData, customFields, fraudOffset, profileReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskData {\n");
    sb.append("    clientData: ").append(toIndentedString(clientData)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    profileReference: ").append(toIndentedString(profileReference)).append("\n");
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
   * Create an instance of RiskData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RiskData
   * @throws JsonProcessingException if the JSON string is invalid with respect to RiskData
   */
  public static RiskData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RiskData.class);
  }
/**
  * Convert an instance of RiskData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

