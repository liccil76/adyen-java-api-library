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
 * CheckoutThreeDS2Action
 */
@JsonPropertyOrder({
  CheckoutThreeDS2Action.JSON_PROPERTY_AUTHORISATION_TOKEN,
  CheckoutThreeDS2Action.JSON_PROPERTY_PAYMENT_DATA,
  CheckoutThreeDS2Action.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  CheckoutThreeDS2Action.JSON_PROPERTY_SUBTYPE,
  CheckoutThreeDS2Action.JSON_PROPERTY_TOKEN,
  CheckoutThreeDS2Action.JSON_PROPERTY_TYPE,
  CheckoutThreeDS2Action.JSON_PROPERTY_URL
})

public class CheckoutThreeDS2Action {
  public static final String JSON_PROPERTY_AUTHORISATION_TOKEN = "authorisationToken";
  private String authorisationToken;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private String paymentMethodType;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private String subtype;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  /**
   * **threeDS2**
   */
  public enum TypeEnum {
    THREEDS2("threeDS2");

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

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CheckoutThreeDS2Action() { 
  }

  public CheckoutThreeDS2Action authorisationToken(String authorisationToken) {
    this.authorisationToken = authorisationToken;
    return this;
  }

   /**
   * A token needed to authorise a payment.
   * @return authorisationToken
  **/
  @ApiModelProperty(value = "A token needed to authorise a payment.")
  @JsonProperty(JSON_PROPERTY_AUTHORISATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorisationToken() {
    return authorisationToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORISATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorisationToken(String authorisationToken) {
    this.authorisationToken = authorisationToken;
  }


  public CheckoutThreeDS2Action paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * A value that must be submitted to the &#x60;/payments/details&#x60; endpoint to verify this payment.
   * @return paymentData
  **/
  @ApiModelProperty(value = "A value that must be submitted to the `/payments/details` endpoint to verify this payment.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentData() {
    return paymentData;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public CheckoutThreeDS2Action paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Specifies the payment method.
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "Specifies the payment method.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethodType() {
    return paymentMethodType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public CheckoutThreeDS2Action subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * A subtype of the token.
   * @return subtype
  **/
  @ApiModelProperty(value = "A subtype of the token.")
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtype() {
    return subtype;
  }


  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public CheckoutThreeDS2Action token(String token) {
    this.token = token;
    return this;
  }

   /**
   * A token to pass to the 3DS2 Component to get the fingerprint.
   * @return token
  **/
  @ApiModelProperty(value = "A token to pass to the 3DS2 Component to get the fingerprint.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public CheckoutThreeDS2Action type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **threeDS2**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**threeDS2**")
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


  public CheckoutThreeDS2Action url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL to redirect to.
   * @return url
  **/
  @ApiModelProperty(value = "Specifies the URL to redirect to.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this CheckoutThreeDS2Action object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutThreeDS2Action checkoutThreeDS2Action = (CheckoutThreeDS2Action) o;
    return Objects.equals(this.authorisationToken, checkoutThreeDS2Action.authorisationToken) &&
        Objects.equals(this.paymentData, checkoutThreeDS2Action.paymentData) &&
        Objects.equals(this.paymentMethodType, checkoutThreeDS2Action.paymentMethodType) &&
        Objects.equals(this.subtype, checkoutThreeDS2Action.subtype) &&
        Objects.equals(this.token, checkoutThreeDS2Action.token) &&
        Objects.equals(this.type, checkoutThreeDS2Action.type) &&
        Objects.equals(this.url, checkoutThreeDS2Action.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationToken, paymentData, paymentMethodType, subtype, token, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutThreeDS2Action {\n");
    sb.append("    authorisationToken: ").append(toIndentedString(authorisationToken)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * Create an instance of CheckoutThreeDS2Action given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutThreeDS2Action
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutThreeDS2Action
   */
  public static CheckoutThreeDS2Action fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutThreeDS2Action.class);
  }
/**
  * Convert an instance of CheckoutThreeDS2Action to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

