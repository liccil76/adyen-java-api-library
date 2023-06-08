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
 * Contact
 */

public class Contact {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_INFIX = "infix";
  @SerializedName(SERIALIZED_NAME_INFIX)
  private String infix;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public Contact() { 
  }

  public Contact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The individual&#39;s email address.
   * @return email
  **/
  @ApiModelProperty(value = "The individual's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Contact firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The individual&#39;s first name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The individual's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Contact infix(String infix) {
    
    this.infix = infix;
    return this;
  }

   /**
   * The infix in the individual&#39;s name, if any.
   * @return infix
  **/
  @ApiModelProperty(value = "The infix in the individual's name, if any.")

  public String getInfix() {
    return infix;
  }


  public void setInfix(String infix) {
    this.infix = infix;
  }


  public Contact lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The individual&#39;s last name.
   * @return lastName
  **/
  @ApiModelProperty(value = "The individual's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Contact phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The individual&#39;s phone number, specified as 10-14 digits with an optional &#x60;+&#x60; prefix.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The individual's phone number, specified as 10-14 digits with an optional `+` prefix.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.email, contact.email) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.infix, contact.infix) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.phoneNumber, contact.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, infix, lastName, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    infix: ").append(toIndentedString(infix)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("firstName");
    openapiFields.add("infix");
    openapiFields.add("lastName");
    openapiFields.add("phoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Contact.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Contact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Contact.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contact is not found in the empty JSON string", Contact.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Contact.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Contact` properties.", entry.getKey()));
        }
      }
      // validate the optional field email
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field firstName
      if (jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      // validate the optional field infix
      if (jsonObj.get("infix") != null && !jsonObj.get("infix").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `infix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infix").toString()));
      }
      // validate the optional field lastName
      if (jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      // validate the optional field phoneNumber
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contact.class));

       return (TypeAdapter<T>) new TypeAdapter<Contact>() {
           @Override
           public void write(JsonWriter out, Contact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Contact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Contact
  * @throws IOException if the JSON string is invalid with respect to Contact
  */
  public static Contact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contact.class);
  }

 /**
  * Convert an instance of Contact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

