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
import com.adyen.model.management.ScheduleTerminalActionsRequestActionDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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

import com.adyen.model.management.JSON;

/**
 * ScheduleTerminalActionsRequest
 */

public class ScheduleTerminalActionsRequest {
  public static final String SERIALIZED_NAME_ACTION_DETAILS = "actionDetails";
  @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
  private ScheduleTerminalActionsRequestActionDetails actionDetails;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduledAt";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private String scheduledAt;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_TERMINAL_IDS = "terminalIds";
  @SerializedName(SERIALIZED_NAME_TERMINAL_IDS)
  private List<String> terminalIds = null;

  public ScheduleTerminalActionsRequest() { 
  }

  public ScheduleTerminalActionsRequest actionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScheduleTerminalActionsRequestActionDetails getActionDetails() {
    return actionDetails;
  }


  public void setActionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }


  public ScheduleTerminalActionsRequest scheduledAt(String scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.")

  public String getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ScheduleTerminalActionsRequest storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the &#x60;terminalIds&#x60; list must be assigned to this store.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the `terminalIds` list must be assigned to this store.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public ScheduleTerminalActionsRequest terminalIds(List<String> terminalIds) {
    
    this.terminalIds = terminalIds;
    return this;
  }

  public ScheduleTerminalActionsRequest addTerminalIdsItem(String terminalIdsItem) {
    if (this.terminalIds == null) {
      this.terminalIds = new ArrayList<>();
    }
    this.terminalIds.add(terminalIdsItem);
    return this;
  }

   /**
   * A list of unique IDs of the terminals to apply the action to. You can extract the IDs from the [GET &#x60;/terminals&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/terminals) response. Maximum length: 100 IDs.
   * @return terminalIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of unique IDs of the terminals to apply the action to. You can extract the IDs from the [GET `/terminals`](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/terminals) response. Maximum length: 100 IDs.")

  public List<String> getTerminalIds() {
    return terminalIds;
  }


  public void setTerminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleTerminalActionsRequest scheduleTerminalActionsRequest = (ScheduleTerminalActionsRequest) o;
    return Objects.equals(this.actionDetails, scheduleTerminalActionsRequest.actionDetails) &&
        Objects.equals(this.scheduledAt, scheduleTerminalActionsRequest.scheduledAt) &&
        Objects.equals(this.storeId, scheduleTerminalActionsRequest.storeId) &&
        Objects.equals(this.terminalIds, scheduleTerminalActionsRequest.terminalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDetails, scheduledAt, storeId, terminalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleTerminalActionsRequest {\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    terminalIds: ").append(toIndentedString(terminalIds)).append("\n");
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
    openapiFields.add("actionDetails");
    openapiFields.add("scheduledAt");
    openapiFields.add("storeId");
    openapiFields.add("terminalIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScheduleTerminalActionsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScheduleTerminalActionsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScheduleTerminalActionsRequest is not found in the empty JSON string", ScheduleTerminalActionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScheduleTerminalActionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScheduleTerminalActionsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `actionDetails`
      if (jsonObj.getAsJsonObject("actionDetails") != null) {
        ScheduleTerminalActionsRequestActionDetails.validateJsonObject(jsonObj.getAsJsonObject("actionDetails"));
      }
      // validate the optional field scheduledAt
      if (jsonObj.get("scheduledAt") != null && !jsonObj.get("scheduledAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduledAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduledAt").toString()));
      }
      // validate the optional field storeId
      if (jsonObj.get("storeId") != null && !jsonObj.get("storeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("terminalIds") != null && !jsonObj.get("terminalIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminalIds` to be an array in the JSON string but got `%s`", jsonObj.get("terminalIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScheduleTerminalActionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScheduleTerminalActionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScheduleTerminalActionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScheduleTerminalActionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ScheduleTerminalActionsRequest>() {
           @Override
           public void write(JsonWriter out, ScheduleTerminalActionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScheduleTerminalActionsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScheduleTerminalActionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScheduleTerminalActionsRequest
  * @throws IOException if the JSON string is invalid with respect to ScheduleTerminalActionsRequest
  */
  public static ScheduleTerminalActionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScheduleTerminalActionsRequest.class);
  }

 /**
  * Convert an instance of ScheduleTerminalActionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

