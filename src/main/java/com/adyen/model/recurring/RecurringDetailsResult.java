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
import com.adyen.model.recurring.RecurringDetailWrapper;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.recurring.JSON;

/**
 * RecurringDetailsResult
 */

public class RecurringDetailsResult {
  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<RecurringDetailWrapper> details = null;

  public static final String SERIALIZED_NAME_LAST_KNOWN_SHOPPER_EMAIL = "lastKnownShopperEmail";
  @SerializedName(SERIALIZED_NAME_LAST_KNOWN_SHOPPER_EMAIL)
  private String lastKnownShopperEmail;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public RecurringDetailsResult() { 
  }

  public RecurringDetailsResult creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date when the recurring details were created.
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date when the recurring details were created.")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public RecurringDetailsResult details(List<RecurringDetailWrapper> details) {
    
    this.details = details;
    return this;
  }

  public RecurringDetailsResult addDetailsItem(RecurringDetailWrapper detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Payment details stored for recurring payments.
   * @return details
  **/
  @ApiModelProperty(value = "Payment details stored for recurring payments.")

  public List<RecurringDetailWrapper> getDetails() {
    return details;
  }


  public void setDetails(List<RecurringDetailWrapper> details) {
    this.details = details;
  }


  public RecurringDetailsResult lastKnownShopperEmail(String lastKnownShopperEmail) {
    
    this.lastKnownShopperEmail = lastKnownShopperEmail;
    return this;
  }

   /**
   * The most recent email for this shopper (if available).
   * @return lastKnownShopperEmail
  **/
  @ApiModelProperty(value = "The most recent email for this shopper (if available).")

  public String getLastKnownShopperEmail() {
    return lastKnownShopperEmail;
  }


  public void setLastKnownShopperEmail(String lastKnownShopperEmail) {
    this.lastKnownShopperEmail = lastKnownShopperEmail;
  }


  public RecurringDetailsResult shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The reference you use to uniquely identify the shopper (e.g. user ID or account ID).
   * @return shopperReference
  **/
  @ApiModelProperty(value = "The reference you use to uniquely identify the shopper (e.g. user ID or account ID).")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetailsResult recurringDetailsResult = (RecurringDetailsResult) o;
    return Objects.equals(this.creationDate, recurringDetailsResult.creationDate) &&
        Objects.equals(this.details, recurringDetailsResult.details) &&
        Objects.equals(this.lastKnownShopperEmail, recurringDetailsResult.lastKnownShopperEmail) &&
        Objects.equals(this.shopperReference, recurringDetailsResult.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, details, lastKnownShopperEmail, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetailsResult {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    lastKnownShopperEmail: ").append(toIndentedString(lastKnownShopperEmail)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
    openapiFields.add("creationDate");
    openapiFields.add("details");
    openapiFields.add("lastKnownShopperEmail");
    openapiFields.add("shopperReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(RecurringDetailsResult.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecurringDetailsResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecurringDetailsResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringDetailsResult is not found in the empty JSON string", RecurringDetailsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecurringDetailsResult.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `RecurringDetailsResult` properties.", entry.getKey()));
        }
      }
      JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
      if (jsonArraydetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("details").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
        }

        // validate the optional field `details` (array)
        for (int i = 0; i < jsonArraydetails.size(); i++) {
          RecurringDetailWrapper.validateJsonObject(jsonArraydetails.get(i).getAsJsonObject());
        }
      }
      // validate the optional field lastKnownShopperEmail
      if (jsonObj.get("lastKnownShopperEmail") != null && !jsonObj.get("lastKnownShopperEmail").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lastKnownShopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastKnownShopperEmail").toString()));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringDetailsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringDetailsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringDetailsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringDetailsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringDetailsResult>() {
           @Override
           public void write(JsonWriter out, RecurringDetailsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringDetailsResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringDetailsResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringDetailsResult
  * @throws IOException if the JSON string is invalid with respect to RecurringDetailsResult
  */
  public static RecurringDetailsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringDetailsResult.class);
  }

 /**
  * Convert an instance of RecurringDetailsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

