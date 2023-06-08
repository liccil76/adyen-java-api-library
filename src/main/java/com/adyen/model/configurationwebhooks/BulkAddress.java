/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

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

import com.adyen.model.configurationwebhooks.JSON;

/**
 * BulkAddress
 */

public class BulkAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME = "houseNumberOrName";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME)
  private String houseNumberOrName;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE_OR_PROVINCE = "stateOrProvince";
  @SerializedName(SERIALIZED_NAME_STATE_OR_PROVINCE)
  private String stateOrProvince;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public BulkAddress() { 
  }

  public BulkAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The name of the city.
   * @return city
  **/
  @ApiModelProperty(value = "The name of the city.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public BulkAddress company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The name of the company.
   * @return company
  **/
  @ApiModelProperty(value = "The name of the company.")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public BulkAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The two-character ISO-3166-1 alpha-2 country code. For example, **US**.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public BulkAddress email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address.
   * @return email
  **/
  @ApiModelProperty(value = "The email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public BulkAddress houseNumberOrName(String houseNumberOrName) {
    
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

   /**
   * The house number or name.
   * @return houseNumberOrName
  **/
  @ApiModelProperty(value = "The house number or name.")

  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }


  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }


  public BulkAddress mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * The full telephone number.
   * @return mobile
  **/
  @ApiModelProperty(value = "The full telephone number.")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public BulkAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code.  Maximum length:  * 5 digits for addresses in the US.  * 10 characters for all other countries.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public BulkAddress stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The two-letter ISO 3166-2 state or province code.  Maximum length: 2 characters for addresses in the US.")

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public BulkAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The streetname of the house.
   * @return street
  **/
  @ApiModelProperty(value = "The streetname of the house.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkAddress bulkAddress = (BulkAddress) o;
    return Objects.equals(this.city, bulkAddress.city) &&
        Objects.equals(this.company, bulkAddress.company) &&
        Objects.equals(this.country, bulkAddress.country) &&
        Objects.equals(this.email, bulkAddress.email) &&
        Objects.equals(this.houseNumberOrName, bulkAddress.houseNumberOrName) &&
        Objects.equals(this.mobile, bulkAddress.mobile) &&
        Objects.equals(this.postalCode, bulkAddress.postalCode) &&
        Objects.equals(this.stateOrProvince, bulkAddress.stateOrProvince) &&
        Objects.equals(this.street, bulkAddress.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, company, country, email, houseNumberOrName, mobile, postalCode, stateOrProvince, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("company");
    openapiFields.add("country");
    openapiFields.add("email");
    openapiFields.add("houseNumberOrName");
    openapiFields.add("mobile");
    openapiFields.add("postalCode");
    openapiFields.add("stateOrProvince");
    openapiFields.add("street");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BulkAddress.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BulkAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkAddress is not found in the empty JSON string", BulkAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BulkAddress.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BulkAddress` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkAddress.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field city
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field company
      if (jsonObj.get("company") != null && !jsonObj.get("company").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      // validate the optional field country
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field email
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field houseNumberOrName
      if (jsonObj.get("houseNumberOrName") != null && !jsonObj.get("houseNumberOrName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `houseNumberOrName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("houseNumberOrName").toString()));
      }
      // validate the optional field mobile
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      // validate the optional field postalCode
      if (jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      // validate the optional field stateOrProvince
      if (jsonObj.get("stateOrProvince") != null && !jsonObj.get("stateOrProvince").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `stateOrProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOrProvince").toString()));
      }
      // validate the optional field street
      if (jsonObj.get("street") != null && !jsonObj.get("street").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkAddress>() {
           @Override
           public void write(JsonWriter out, BulkAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkAddress
  * @throws IOException if the JSON string is invalid with respect to BulkAddress
  */
  public static BulkAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkAddress.class);
  }

 /**
  * Convert an instance of BulkAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

