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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * AdditionalSettingsResponse
 */

public class AdditionalSettingsResponse {
  public static final String SERIALIZED_NAME_EXCLUDE_EVENT_CODES = "excludeEventCodes";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_EVENT_CODES)
  private List<String> excludeEventCodes = null;

  public static final String SERIALIZED_NAME_INCLUDE_EVENT_CODES = "includeEventCodes";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EVENT_CODES)
  private List<String> includeEventCodes = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Boolean> properties = null;

  public AdditionalSettingsResponse() { 
  }

  public AdditionalSettingsResponse excludeEventCodes(List<String> excludeEventCodes) {
    
    this.excludeEventCodes = excludeEventCodes;
    return this;
  }

  public AdditionalSettingsResponse addExcludeEventCodesItem(String excludeEventCodesItem) {
    if (this.excludeEventCodes == null) {
      this.excludeEventCodes = new ArrayList<>();
    }
    this.excludeEventCodes.add(excludeEventCodesItem);
    return this;
  }

   /**
   * Object containing list of event codes for which the notifcation will not be sent. 
   * @return excludeEventCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object containing list of event codes for which the notifcation will not be sent. ")

  public List<String> getExcludeEventCodes() {
    return excludeEventCodes;
  }


  public void setExcludeEventCodes(List<String> excludeEventCodes) {
    this.excludeEventCodes = excludeEventCodes;
  }


  public AdditionalSettingsResponse includeEventCodes(List<String> includeEventCodes) {
    
    this.includeEventCodes = includeEventCodes;
    return this;
  }

  public AdditionalSettingsResponse addIncludeEventCodesItem(String includeEventCodesItem) {
    if (this.includeEventCodes == null) {
      this.includeEventCodes = new ArrayList<>();
    }
    this.includeEventCodes.add(includeEventCodesItem);
    return this;
  }

   /**
   * Object containing list of event codes for which the notifcation will be sent. 
   * @return includeEventCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object containing list of event codes for which the notifcation will be sent. ")

  public List<String> getIncludeEventCodes() {
    return includeEventCodes;
  }


  public void setIncludeEventCodes(List<String> includeEventCodes) {
    this.includeEventCodes = includeEventCodes;
  }


  public AdditionalSettingsResponse properties(Map<String, Boolean> properties) {
    
    this.properties = properties;
    return this;
  }

  public AdditionalSettingsResponse putPropertiesItem(String key, Boolean propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, &#x60;captureDelayHours&#x60;: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object containing boolean key-value pairs. The key can be any [standard webhook additional setting](https://docs.adyen.com/development-resources/webhooks/additional-settings), and the value indicates if the setting is enabled. For example, `captureDelayHours`: **true** means the standard notifications you get will contain the number of hours remaining until the payment will be captured.")

  public Map<String, Boolean> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Boolean> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalSettingsResponse additionalSettingsResponse = (AdditionalSettingsResponse) o;
    return Objects.equals(this.excludeEventCodes, additionalSettingsResponse.excludeEventCodes) &&
        Objects.equals(this.includeEventCodes, additionalSettingsResponse.includeEventCodes) &&
        Objects.equals(this.properties, additionalSettingsResponse.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeEventCodes, includeEventCodes, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalSettingsResponse {\n");
    sb.append("    excludeEventCodes: ").append(toIndentedString(excludeEventCodes)).append("\n");
    sb.append("    includeEventCodes: ").append(toIndentedString(includeEventCodes)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("excludeEventCodes");
    openapiFields.add("includeEventCodes");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalSettingsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalSettingsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalSettingsResponse is not found in the empty JSON string", AdditionalSettingsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalSettingsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalSettingsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("excludeEventCodes") != null && !jsonObj.get("excludeEventCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excludeEventCodes` to be an array in the JSON string but got `%s`", jsonObj.get("excludeEventCodes").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("includeEventCodes") != null && !jsonObj.get("includeEventCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeEventCodes` to be an array in the JSON string but got `%s`", jsonObj.get("includeEventCodes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalSettingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalSettingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalSettingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalSettingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalSettingsResponse>() {
           @Override
           public void write(JsonWriter out, AdditionalSettingsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalSettingsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalSettingsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalSettingsResponse
  * @throws IOException if the JSON string is invalid with respect to AdditionalSettingsResponse
  */
  public static AdditionalSettingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalSettingsResponse.class);
  }

 /**
  * Convert an instance of AdditionalSettingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

