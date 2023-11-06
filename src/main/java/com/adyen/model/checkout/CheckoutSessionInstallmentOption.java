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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CheckoutSessionInstallmentOption
 */
@JsonPropertyOrder({
  CheckoutSessionInstallmentOption.JSON_PROPERTY_PLANS,
  CheckoutSessionInstallmentOption.JSON_PROPERTY_PRESELECTED_VALUE,
  CheckoutSessionInstallmentOption.JSON_PROPERTY_VALUES
})

public class CheckoutSessionInstallmentOption {
  /**
   * Gets or Sets plans
   */
  public enum PlansEnum {
    REGULAR("regular"),
    
    REVOLVING("revolving");

    private String value;

    PlansEnum(String value) {
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
    public static PlansEnum fromValue(String value) {
      for (PlansEnum b : PlansEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PLANS = "plans";
  private List<PlansEnum> plans = null;

  public static final String JSON_PROPERTY_PRESELECTED_VALUE = "preselectedValue";
  private Integer preselectedValue;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Integer> values = null;

  public CheckoutSessionInstallmentOption() { 
  }

  public CheckoutSessionInstallmentOption plans(List<PlansEnum> plans) {
    this.plans = plans;
    return this;
  }

  public CheckoutSessionInstallmentOption addPlansItem(PlansEnum plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving**
   * @return plans
  **/
  @ApiModelProperty(value = "Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving**")
  @JsonProperty(JSON_PROPERTY_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlansEnum> getPlans() {
    return plans;
  }


  @JsonProperty(JSON_PROPERTY_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlans(List<PlansEnum> plans) {
    this.plans = plans;
  }


  public CheckoutSessionInstallmentOption preselectedValue(Integer preselectedValue) {
    this.preselectedValue = preselectedValue;
    return this;
  }

   /**
   * Preselected number of installments offered for this payment method.
   * @return preselectedValue
  **/
  @ApiModelProperty(value = "Preselected number of installments offered for this payment method.")
  @JsonProperty(JSON_PROPERTY_PRESELECTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPreselectedValue() {
    return preselectedValue;
  }


  @JsonProperty(JSON_PROPERTY_PRESELECTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreselectedValue(Integer preselectedValue) {
    this.preselectedValue = preselectedValue;
  }


  public CheckoutSessionInstallmentOption values(List<Integer> values) {
    this.values = values;
    return this;
  }

  public CheckoutSessionInstallmentOption addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with &#x60;maxValue&#x60;.
   * @return values
  **/
  @ApiModelProperty(value = "An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with `maxValue`.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<Integer> values) {
    this.values = values;
  }


  /**
   * Return true if this CheckoutSessionInstallmentOption object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSessionInstallmentOption checkoutSessionInstallmentOption = (CheckoutSessionInstallmentOption) o;
    return Objects.equals(this.plans, checkoutSessionInstallmentOption.plans) &&
        Objects.equals(this.preselectedValue, checkoutSessionInstallmentOption.preselectedValue) &&
        Objects.equals(this.values, checkoutSessionInstallmentOption.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plans, preselectedValue, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSessionInstallmentOption {\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    preselectedValue: ").append(toIndentedString(preselectedValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
   * Create an instance of CheckoutSessionInstallmentOption given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutSessionInstallmentOption
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutSessionInstallmentOption
   */
  public static CheckoutSessionInstallmentOption fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutSessionInstallmentOption.class);
  }
/**
  * Convert an instance of CheckoutSessionInstallmentOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

