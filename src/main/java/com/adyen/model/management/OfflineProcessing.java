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
import com.adyen.model.management.MinorUnitsMonetaryValue;
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
 * OfflineProcessing
 */

public class OfflineProcessing {
  public static final String SERIALIZED_NAME_CHIP_FLOOR_LIMIT = "chipFloorLimit";
  @SerializedName(SERIALIZED_NAME_CHIP_FLOOR_LIMIT)
  private Integer chipFloorLimit;

  public static final String SERIALIZED_NAME_OFFLINE_SWIPE_LIMITS = "offlineSwipeLimits";
  @SerializedName(SERIALIZED_NAME_OFFLINE_SWIPE_LIMITS)
  private List<MinorUnitsMonetaryValue> offlineSwipeLimits = null;

  public OfflineProcessing() { 
  }

  public OfflineProcessing chipFloorLimit(Integer chipFloorLimit) {
    
    this.chipFloorLimit = chipFloorLimit;
    return this;
  }

   /**
   * The maximum offline transaction amount for chip cards, in the processing currency and specified in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return chipFloorLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum offline transaction amount for chip cards, in the processing currency and specified in [minor units](https://docs.adyen.com/development-resources/currency-codes).")

  public Integer getChipFloorLimit() {
    return chipFloorLimit;
  }


  public void setChipFloorLimit(Integer chipFloorLimit) {
    this.chipFloorLimit = chipFloorLimit;
  }


  public OfflineProcessing offlineSwipeLimits(List<MinorUnitsMonetaryValue> offlineSwipeLimits) {
    
    this.offlineSwipeLimits = offlineSwipeLimits;
    return this;
  }

  public OfflineProcessing addOfflineSwipeLimitsItem(MinorUnitsMonetaryValue offlineSwipeLimitsItem) {
    if (this.offlineSwipeLimits == null) {
      this.offlineSwipeLimits = new ArrayList<>();
    }
    this.offlineSwipeLimits.add(offlineSwipeLimitsItem);
    return this;
  }

   /**
   * The maximum offline transaction amount for swiped cards, in the specified currency.
   * @return offlineSwipeLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum offline transaction amount for swiped cards, in the specified currency.")

  public List<MinorUnitsMonetaryValue> getOfflineSwipeLimits() {
    return offlineSwipeLimits;
  }


  public void setOfflineSwipeLimits(List<MinorUnitsMonetaryValue> offlineSwipeLimits) {
    this.offlineSwipeLimits = offlineSwipeLimits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineProcessing offlineProcessing = (OfflineProcessing) o;
    return Objects.equals(this.chipFloorLimit, offlineProcessing.chipFloorLimit) &&
        Objects.equals(this.offlineSwipeLimits, offlineProcessing.offlineSwipeLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chipFloorLimit, offlineSwipeLimits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineProcessing {\n");
    sb.append("    chipFloorLimit: ").append(toIndentedString(chipFloorLimit)).append("\n");
    sb.append("    offlineSwipeLimits: ").append(toIndentedString(offlineSwipeLimits)).append("\n");
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
    openapiFields.add("chipFloorLimit");
    openapiFields.add("offlineSwipeLimits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OfflineProcessing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OfflineProcessing.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfflineProcessing is not found in the empty JSON string", OfflineProcessing.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OfflineProcessing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfflineProcessing` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayofflineSwipeLimits = jsonObj.getAsJsonArray("offlineSwipeLimits");
      if (jsonArrayofflineSwipeLimits != null) {
        // ensure the json data is an array
        if (!jsonObj.get("offlineSwipeLimits").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `offlineSwipeLimits` to be an array in the JSON string but got `%s`", jsonObj.get("offlineSwipeLimits").toString()));
        }

        // validate the optional field `offlineSwipeLimits` (array)
        for (int i = 0; i < jsonArrayofflineSwipeLimits.size(); i++) {
          MinorUnitsMonetaryValue.validateJsonObject(jsonArrayofflineSwipeLimits.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfflineProcessing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfflineProcessing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfflineProcessing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfflineProcessing.class));

       return (TypeAdapter<T>) new TypeAdapter<OfflineProcessing>() {
           @Override
           public void write(JsonWriter out, OfflineProcessing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfflineProcessing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfflineProcessing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfflineProcessing
  * @throws IOException if the JSON string is invalid with respect to OfflineProcessing
  */
  public static OfflineProcessing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfflineProcessing.class);
  }

 /**
  * Convert an instance of OfflineProcessing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

