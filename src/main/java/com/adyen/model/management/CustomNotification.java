/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.management.Amount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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

import com.adyen.model.management.JSON;

/**
 * CustomNotification
 */

public class CustomNotification {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_EVENT_CODE = "eventCode";
  @SerializedName(SERIALIZED_NAME_EVENT_CODE)
  private String eventCode;

  public static final String SERIALIZED_NAME_EVENT_DATE = "eventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private OffsetDateTime eventDate;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE = "merchantReference";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE)
  private String merchantReference;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public CustomNotification() { 
  }

  public CustomNotification amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public CustomNotification eventCode(String eventCode) {
    
    this.eventCode = eventCode;
    return this;
  }

   /**
   * The event that caused the notification to be sent.Currently supported values: * **AUTHORISATION** * **CANCELLATION** * **REFUND** * **CAPTURE** * **DEACTIVATE_RECURRING** * **REPORT_AVAILABLE** * **CHARGEBACK** * **REQUEST_FOR_INFORMATION** * **NOTIFICATION_OF_CHARGEBACK** * **NOTIFICATIONTEST** * **ORDER_OPENED** * **ORDER_CLOSED** * **CHARGEBACK_REVERSED** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA**
   * @return eventCode
  **/
  @ApiModelProperty(value = "The event that caused the notification to be sent.Currently supported values: * **AUTHORISATION** * **CANCELLATION** * **REFUND** * **CAPTURE** * **DEACTIVATE_RECURRING** * **REPORT_AVAILABLE** * **CHARGEBACK** * **REQUEST_FOR_INFORMATION** * **NOTIFICATION_OF_CHARGEBACK** * **NOTIFICATIONTEST** * **ORDER_OPENED** * **ORDER_CLOSED** * **CHARGEBACK_REVERSED** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA**")

  public String getEventCode() {
    return eventCode;
  }


  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public CustomNotification eventDate(OffsetDateTime eventDate) {
    
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The time of the event. Format: [ISO 8601](http://www.w3.org/TR/NOTE-datetime), YYYY-MM-DDThh:mm:ssTZD.
   * @return eventDate
  **/
  @ApiModelProperty(value = "The time of the event. Format: [ISO 8601](http://www.w3.org/TR/NOTE-datetime), YYYY-MM-DDThh:mm:ssTZD.")

  public OffsetDateTime getEventDate() {
    return eventDate;
  }


  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public CustomNotification merchantReference(String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * Your reference for the custom test notification.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "Your reference for the custom test notification.")

  public String getMerchantReference() {
    return merchantReference;
  }


  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public CustomNotification paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method for the payment that the notification is about. Possible values: * **amex** * **visa** * **mc** * **maestro** * **bcmc** * **paypal**  * **sms**  * **bankTransfer_NL** * **bankTransfer_DE** * **bankTransfer_BE** * **ideal** * **elv** * **sepadirectdebit** 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method for the payment that the notification is about. Possible values: * **amex** * **visa** * **mc** * **maestro** * **bcmc** * **paypal**  * **sms**  * **bankTransfer_NL** * **bankTransfer_DE** * **bankTransfer_BE** * **ideal** * **elv** * **sepadirectdebit** ")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public CustomNotification reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * A descripton of what caused the notification.
   * @return reason
  **/
  @ApiModelProperty(value = "A descripton of what caused the notification.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public CustomNotification success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * The outcome of the event which the notification is about. Set to either **true** or **false**. 
   * @return success
  **/
  @ApiModelProperty(value = "The outcome of the event which the notification is about. Set to either **true** or **false**. ")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotification customNotification = (CustomNotification) o;
    return Objects.equals(this.amount, customNotification.amount) &&
        Objects.equals(this.eventCode, customNotification.eventCode) &&
        Objects.equals(this.eventDate, customNotification.eventDate) &&
        Objects.equals(this.merchantReference, customNotification.merchantReference) &&
        Objects.equals(this.paymentMethod, customNotification.paymentMethod) &&
        Objects.equals(this.reason, customNotification.reason) &&
        Objects.equals(this.success, customNotification.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, eventCode, eventDate, merchantReference, paymentMethod, reason, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotification {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("eventCode");
    openapiFields.add("eventDate");
    openapiFields.add("merchantReference");
    openapiFields.add("paymentMethod");
    openapiFields.add("reason");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(CustomNotification.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomNotification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomNotification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomNotification is not found in the empty JSON string", CustomNotification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomNotification.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `CustomNotification` properties.", entry.getKey()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field eventCode
      if (jsonObj.get("eventCode") != null && !jsonObj.get("eventCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `eventCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventCode").toString()));
      }
      // validate the optional field merchantReference
      if (jsonObj.get("merchantReference") != null && !jsonObj.get("merchantReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantReference").toString()));
      }
      // validate the optional field paymentMethod
      if (jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `paymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethod").toString()));
      }
      // validate the optional field reason
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomNotification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomNotification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomNotification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomNotification.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomNotification>() {
           @Override
           public void write(JsonWriter out, CustomNotification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomNotification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomNotification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomNotification
  * @throws IOException if the JSON string is invalid with respect to CustomNotification
  */
  public static CustomNotification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomNotification.class);
  }

 /**
  * Convert an instance of CustomNotification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

