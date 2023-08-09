/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
 * DKLocalAccountIdentification
 */
@JsonPropertyOrder({
  DKLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  DKLocalAccountIdentification.JSON_PROPERTY_BANK_CODE,
  DKLocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class DKLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_BANK_CODE = "bankCode";
  private String bankCode;

  /**
   * **dkLocal**
   */
  public enum TypeEnum {
    DKLOCAL("dkLocal");

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
  private TypeEnum type = TypeEnum.DKLOCAL;

  public DKLocalAccountIdentification() { 
  }

  public DKLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 4-10 digits bank account number (Kontonummer) (without separators or whitespace).
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 4-10 digits bank account number (Kontonummer) (without separators or whitespace).")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public DKLocalAccountIdentification bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * The 4-digit bank code (Registreringsnummer) (without separators or whitespace).
   * @return bankCode
  **/
  @ApiModelProperty(required = true, value = "The 4-digit bank code (Registreringsnummer) (without separators or whitespace).")
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankCode() {
    return bankCode;
  }


  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public DKLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **dkLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**dkLocal**")
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
   * Return true if this DKLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DKLocalAccountIdentification dkLocalAccountIdentification = (DKLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, dkLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.bankCode, dkLocalAccountIdentification.bankCode) &&
        Objects.equals(this.type, dkLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DKLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
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
   * Create an instance of DKLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DKLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to DKLocalAccountIdentification
   */
  public static DKLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DKLocalAccountIdentification.class);
  }
/**
  * Convert an instance of DKLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

