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
import com.adyen.model.management.AllowedOrigin;
import com.adyen.model.management.ApiCredentialLinks;
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
 * CompanyApiCredential
 */

public class CompanyApiCredential {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ApiCredentialLinks links;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ALLOWED_IP_ADDRESSES = "allowedIpAddresses";
  @SerializedName(SERIALIZED_NAME_ALLOWED_IP_ADDRESSES)
  private List<String> allowedIpAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_ORIGINS = "allowedOrigins";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ORIGINS)
  private List<AllowedOrigin> allowedOrigins = null;

  public static final String SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_MERCHANT_ACCOUNTS)
  private List<String> associatedMerchantAccounts = null;

  public static final String SERIALIZED_NAME_CLIENT_KEY = "clientKey";
  @SerializedName(SERIALIZED_NAME_CLIENT_KEY)
  private String clientKey;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public CompanyApiCredential() { 
  }

  public CompanyApiCredential links(ApiCredentialLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApiCredentialLinks getLinks() {
    return links;
  }


  public void setLinks(ApiCredentialLinks links) {
    this.links = links;
  }


  public CompanyApiCredential active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public CompanyApiCredential allowedIpAddresses(List<String> allowedIpAddresses) {
    
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public CompanyApiCredential addAllowedIpAddressesItem(String allowedIpAddressesItem) {
    this.allowedIpAddresses.add(allowedIpAddressesItem);
    return this;
  }

   /**
   * List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.
   * @return allowedIpAddresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.")

  public List<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }


  public void setAllowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
  }


  public CompanyApiCredential allowedOrigins(List<AllowedOrigin> allowedOrigins) {
    
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public CompanyApiCredential addAllowedOriginsItem(AllowedOrigin allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.
   * @return allowedOrigins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.")

  public List<AllowedOrigin> getAllowedOrigins() {
    return allowedOrigins;
  }


  public void setAllowedOrigins(List<AllowedOrigin> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public CompanyApiCredential associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public CompanyApiCredential addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

   /**
   * List of merchant accounts that the API credential has explicit access to.   If the credential has access to a company, this implies access to all merchant accounts and no merchants for that company will be included.
   * @return associatedMerchantAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of merchant accounts that the API credential has explicit access to.   If the credential has access to a company, this implies access to all merchant accounts and no merchants for that company will be included.")

  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }


  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }


  public CompanyApiCredential clientKey(String clientKey) {
    
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.
   * @return clientKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.")

  public String getClientKey() {
    return clientKey;
  }


  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }


  public CompanyApiCredential description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the API credential.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the API credential.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CompanyApiCredential id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the API credential.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the API credential.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CompanyApiCredential roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public CompanyApiCredential addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.
   * @return roles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public CompanyApiCredential username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyApiCredential companyApiCredential = (CompanyApiCredential) o;
    return Objects.equals(this.links, companyApiCredential.links) &&
        Objects.equals(this.active, companyApiCredential.active) &&
        Objects.equals(this.allowedIpAddresses, companyApiCredential.allowedIpAddresses) &&
        Objects.equals(this.allowedOrigins, companyApiCredential.allowedOrigins) &&
        Objects.equals(this.associatedMerchantAccounts, companyApiCredential.associatedMerchantAccounts) &&
        Objects.equals(this.clientKey, companyApiCredential.clientKey) &&
        Objects.equals(this.description, companyApiCredential.description) &&
        Objects.equals(this.id, companyApiCredential.id) &&
        Objects.equals(this.roles, companyApiCredential.roles) &&
        Objects.equals(this.username, companyApiCredential.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, active, allowedIpAddresses, allowedOrigins, associatedMerchantAccounts, clientKey, description, id, roles, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyApiCredential {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    allowedIpAddresses: ").append(toIndentedString(allowedIpAddresses)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("active");
    openapiFields.add("allowedIpAddresses");
    openapiFields.add("allowedOrigins");
    openapiFields.add("associatedMerchantAccounts");
    openapiFields.add("clientKey");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("roles");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("allowedIpAddresses");
    openapiRequiredFields.add("clientKey");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("roles");
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompanyApiCredential
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CompanyApiCredential.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompanyApiCredential is not found in the empty JSON string", CompanyApiCredential.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CompanyApiCredential.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompanyApiCredential` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompanyApiCredential.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
        ApiCredentialLinks.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      // ensure the json data is an array
      if (jsonObj.get("allowedIpAddresses") != null && !jsonObj.get("allowedIpAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedIpAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("allowedIpAddresses").toString()));
      }
      JsonArray jsonArrayallowedOrigins = jsonObj.getAsJsonArray("allowedOrigins");
      if (jsonArrayallowedOrigins != null) {
        // ensure the json data is an array
        if (!jsonObj.get("allowedOrigins").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `allowedOrigins` to be an array in the JSON string but got `%s`", jsonObj.get("allowedOrigins").toString()));
        }

        // validate the optional field `allowedOrigins` (array)
        for (int i = 0; i < jsonArrayallowedOrigins.size(); i++) {
          AllowedOrigin.validateJsonObject(jsonArrayallowedOrigins.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("associatedMerchantAccounts") != null && !jsonObj.get("associatedMerchantAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedMerchantAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("associatedMerchantAccounts").toString()));
      }
      // validate the optional field clientKey
      if (jsonObj.get("clientKey") != null && !jsonObj.get("clientKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientKey").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      // validate the optional field username
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompanyApiCredential.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompanyApiCredential' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompanyApiCredential> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompanyApiCredential.class));

       return (TypeAdapter<T>) new TypeAdapter<CompanyApiCredential>() {
           @Override
           public void write(JsonWriter out, CompanyApiCredential value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompanyApiCredential read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompanyApiCredential given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompanyApiCredential
  * @throws IOException if the JSON string is invalid with respect to CompanyApiCredential
  */
  public static CompanyApiCredential fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyApiCredential.class);
  }

 /**
  * Convert an instance of CompanyApiCredential to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

