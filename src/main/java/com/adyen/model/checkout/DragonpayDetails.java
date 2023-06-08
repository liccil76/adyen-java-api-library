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
 * DragonpayDetails
 */

public class DragonpayDetails {
  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  /**
   * **dragonpay**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EBANKING("dragonpay_ebanking"),
    
    OTC_BANKING("dragonpay_otc_banking"),
    
    OTC_NON_BANKING("dragonpay_otc_non_banking"),
    
    OTC_PHILIPPINES("dragonpay_otc_philippines");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public DragonpayDetails() { 
  }

  public DragonpayDetails checkoutAttemptId(String checkoutAttemptId) {
    
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public DragonpayDetails issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * The Dragonpay issuer value of the shopper&#39;s selected bank. Set this to an **id** of a Dragonpay issuer to preselect it.
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "The Dragonpay issuer value of the shopper's selected bank. Set this to an **id** of a Dragonpay issuer to preselect it.")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public DragonpayDetails shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper’s email address.
   * @return shopperEmail
  **/
  @ApiModelProperty(value = "The shopper’s email address.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public DragonpayDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **dragonpay**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**dragonpay**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DragonpayDetails dragonpayDetails = (DragonpayDetails) o;
    return Objects.equals(this.checkoutAttemptId, dragonpayDetails.checkoutAttemptId) &&
        Objects.equals(this.issuer, dragonpayDetails.issuer) &&
        Objects.equals(this.shopperEmail, dragonpayDetails.shopperEmail) &&
        Objects.equals(this.type, dragonpayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, issuer, shopperEmail, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DragonpayDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("issuer");
    openapiFields.add("shopperEmail");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("type");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(DragonpayDetails.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DragonpayDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DragonpayDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DragonpayDetails is not found in the empty JSON string", DragonpayDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DragonpayDetails.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `DragonpayDetails` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DragonpayDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // validate the optional field issuer
      if (jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DragonpayDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DragonpayDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DragonpayDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DragonpayDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DragonpayDetails>() {
           @Override
           public void write(JsonWriter out, DragonpayDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DragonpayDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DragonpayDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DragonpayDetails
  * @throws IOException if the JSON string is invalid with respect to DragonpayDetails
  */
  public static DragonpayDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DragonpayDetails.class);
  }

 /**
  * Convert an instance of DragonpayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

