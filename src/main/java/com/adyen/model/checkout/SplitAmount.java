/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * SplitAmount
 */

public class SplitAmount {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value;

  public SplitAmount() { 
  }

  public SplitAmount currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).  If this value is not provided, the currency in which the payment is made will be used.
   * @return currency
  **/
  @ApiModelProperty(value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).  If this value is not provided, the currency in which the payment is made will be used.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public SplitAmount value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The amount in [minor units](https://docs.adyen.com/development-resources/currency-codes).")

  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitAmount splitAmount = (SplitAmount) o;
    return Objects.equals(this.currency, splitAmount.currency) &&
        Objects.equals(this.value, splitAmount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitAmount {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("currency");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(SplitAmount.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SplitAmount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SplitAmount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SplitAmount is not found in the empty JSON string", SplitAmount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SplitAmount.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `SplitAmount` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SplitAmount.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field currency
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SplitAmount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitAmount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitAmount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitAmount.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitAmount>() {
           @Override
           public void write(JsonWriter out, SplitAmount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitAmount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitAmount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitAmount
  * @throws IOException if the JSON string is invalid with respect to SplitAmount
  */
  public static SplitAmount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitAmount.class);
  }

 /**
  * Convert an instance of SplitAmount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

