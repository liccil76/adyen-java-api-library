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
import com.adyen.model.management.ModelFile;
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
 * Profile
 */

public class Profile {
  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_AUTO_WIFI = "autoWifi";
  @SerializedName(SERIALIZED_NAME_AUTO_WIFI)
  private Boolean autoWifi;

  public static final String SERIALIZED_NAME_BSS_TYPE = "bssType";
  @SerializedName(SERIALIZED_NAME_BSS_TYPE)
  private String bssType;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Integer channel;

  public static final String SERIALIZED_NAME_DEFAULT_PROFILE = "defaultProfile";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PROFILE)
  private Boolean defaultProfile;

  public static final String SERIALIZED_NAME_EAP = "eap";
  @SerializedName(SERIALIZED_NAME_EAP)
  private String eap;

  public static final String SERIALIZED_NAME_EAP_CA_CERT = "eapCaCert";
  @SerializedName(SERIALIZED_NAME_EAP_CA_CERT)
  private ModelFile eapCaCert;

  public static final String SERIALIZED_NAME_EAP_CLIENT_CERT = "eapClientCert";
  @SerializedName(SERIALIZED_NAME_EAP_CLIENT_CERT)
  private ModelFile eapClientCert;

  public static final String SERIALIZED_NAME_EAP_CLIENT_KEY = "eapClientKey";
  @SerializedName(SERIALIZED_NAME_EAP_CLIENT_KEY)
  private ModelFile eapClientKey;

  public static final String SERIALIZED_NAME_EAP_CLIENT_PWD = "eapClientPwd";
  @SerializedName(SERIALIZED_NAME_EAP_CLIENT_PWD)
  private String eapClientPwd;

  public static final String SERIALIZED_NAME_EAP_IDENTITY = "eapIdentity";
  @SerializedName(SERIALIZED_NAME_EAP_IDENTITY)
  private String eapIdentity;

  public static final String SERIALIZED_NAME_EAP_INTERMEDIATE_CERT = "eapIntermediateCert";
  @SerializedName(SERIALIZED_NAME_EAP_INTERMEDIATE_CERT)
  private ModelFile eapIntermediateCert;

  public static final String SERIALIZED_NAME_EAP_PWD = "eapPwd";
  @SerializedName(SERIALIZED_NAME_EAP_PWD)
  private String eapPwd;

  public static final String SERIALIZED_NAME_HIDDEN_SSID = "hiddenSsid";
  @SerializedName(SERIALIZED_NAME_HIDDEN_SSID)
  private Boolean hiddenSsid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PSK = "psk";
  @SerializedName(SERIALIZED_NAME_PSK)
  private String psk;

  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private String ssid;

  public static final String SERIALIZED_NAME_WSEC = "wsec";
  @SerializedName(SERIALIZED_NAME_WSEC)
  private String wsec;

  public Profile() { 
  }

  public Profile authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**.
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**.")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public Profile autoWifi(Boolean autoWifi) {
    
    this.autoWifi = autoWifi;
    return this;
  }

   /**
   * Indicates whether to automatically select the best authentication method available. Does not work on older terminal models.
   * @return autoWifi
  **/
  @ApiModelProperty(value = "Indicates whether to automatically select the best authentication method available. Does not work on older terminal models.")

  public Boolean getAutoWifi() {
    return autoWifi;
  }


  public void setAutoWifi(Boolean autoWifi) {
    this.autoWifi = autoWifi;
  }


  public Profile bssType(String bssType) {
    
    this.bssType = bssType;
    return this;
  }

   /**
   * Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations.
   * @return bssType
  **/
  @ApiModelProperty(required = true, value = "Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations.")

  public String getBssType() {
    return bssType;
  }


  public void setBssType(String bssType) {
    this.bssType = bssType;
  }


  public Profile channel(Integer channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection.
   * @return channel
  **/
  @ApiModelProperty(value = "The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection.")

  public Integer getChannel() {
    return channel;
  }


  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public Profile defaultProfile(Boolean defaultProfile) {
    
    this.defaultProfile = defaultProfile;
    return this;
  }

   /**
   * Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first.
   * @return defaultProfile
  **/
  @ApiModelProperty(value = "Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first.")

  public Boolean getDefaultProfile() {
    return defaultProfile;
  }


  public void setDefaultProfile(Boolean defaultProfile) {
    this.defaultProfile = defaultProfile;
  }


  public Profile eap(String eap) {
    
    this.eap = eap;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast**
   * @return eap
  **/
  @ApiModelProperty(value = "For `authType` **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast**")

  public String getEap() {
    return eap;
  }


  public void setEap(String eap) {
    this.eap = eap;
  }


  public Profile eapCaCert(ModelFile eapCaCert) {
    
    this.eapCaCert = eapCaCert;
    return this;
  }

   /**
   * Get eapCaCert
   * @return eapCaCert
  **/
  @ApiModelProperty(value = "")

  public ModelFile getEapCaCert() {
    return eapCaCert;
  }


  public void setEapCaCert(ModelFile eapCaCert) {
    this.eapCaCert = eapCaCert;
  }


  public Profile eapClientCert(ModelFile eapClientCert) {
    
    this.eapClientCert = eapClientCert;
    return this;
  }

   /**
   * Get eapClientCert
   * @return eapClientCert
  **/
  @ApiModelProperty(value = "")

  public ModelFile getEapClientCert() {
    return eapClientCert;
  }


  public void setEapClientCert(ModelFile eapClientCert) {
    this.eapClientCert = eapClientCert;
  }


  public Profile eapClientKey(ModelFile eapClientKey) {
    
    this.eapClientKey = eapClientKey;
    return this;
  }

   /**
   * Get eapClientKey
   * @return eapClientKey
  **/
  @ApiModelProperty(value = "")

  public ModelFile getEapClientKey() {
    return eapClientKey;
  }


  public void setEapClientKey(ModelFile eapClientKey) {
    this.eapClientKey = eapClientKey;
  }


  public Profile eapClientPwd(String eapClientPwd) {
    
    this.eapClientPwd = eapClientPwd;
    return this;
  }

   /**
   * For &#x60;eap&#x60; **tls**. The password of the RSA key file, if that file is password-protected.
   * @return eapClientPwd
  **/
  @ApiModelProperty(value = "For `eap` **tls**. The password of the RSA key file, if that file is password-protected.")

  public String getEapClientPwd() {
    return eapClientPwd;
  }


  public void setEapClientPwd(String eapClientPwd) {
    this.eapClientPwd = eapClientPwd;
  }


  public Profile eapIdentity(String eapIdentity) {
    
    this.eapIdentity = eapIdentity;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server.
   * @return eapIdentity
  **/
  @ApiModelProperty(value = "For `authType` **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server.")

  public String getEapIdentity() {
    return eapIdentity;
  }


  public void setEapIdentity(String eapIdentity) {
    this.eapIdentity = eapIdentity;
  }


  public Profile eapIntermediateCert(ModelFile eapIntermediateCert) {
    
    this.eapIntermediateCert = eapIntermediateCert;
    return this;
  }

   /**
   * Get eapIntermediateCert
   * @return eapIntermediateCert
  **/
  @ApiModelProperty(value = "")

  public ModelFile getEapIntermediateCert() {
    return eapIntermediateCert;
  }


  public void setEapIntermediateCert(ModelFile eapIntermediateCert) {
    this.eapIntermediateCert = eapIntermediateCert;
  }


  public Profile eapPwd(String eapPwd) {
    
    this.eapPwd = eapPwd;
    return this;
  }

   /**
   * For &#x60;eap&#x60; **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server.
   * @return eapPwd
  **/
  @ApiModelProperty(value = "For `eap` **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server.")

  public String getEapPwd() {
    return eapPwd;
  }


  public void setEapPwd(String eapPwd) {
    this.eapPwd = eapPwd;
  }


  public Profile hiddenSsid(Boolean hiddenSsid) {
    
    this.hiddenSsid = hiddenSsid;
    return this;
  }

   /**
   * Indicates if the network doesn&#39;t broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network.
   * @return hiddenSsid
  **/
  @ApiModelProperty(value = "Indicates if the network doesn't broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network.")

  public Boolean getHiddenSsid() {
    return hiddenSsid;
  }


  public void setHiddenSsid(Boolean hiddenSsid) {
    this.hiddenSsid = hiddenSsid;
  }


  public Profile name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Your name for the Wi-Fi profile.
   * @return name
  **/
  @ApiModelProperty(value = "Your name for the Wi-Fi profile.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Profile psk(String psk) {
    
    this.psk = psk;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-psk or **wpa2-psk**. The password to the wireless network.
   * @return psk
  **/
  @ApiModelProperty(value = "For `authType` **wpa-psk or **wpa2-psk**. The password to the wireless network.")

  public String getPsk() {
    return psk;
  }


  public void setPsk(String psk) {
    this.psk = psk;
  }


  public Profile ssid(String ssid) {
    
    this.ssid = ssid;
    return this;
  }

   /**
   * The name of the wireless network.
   * @return ssid
  **/
  @ApiModelProperty(required = true, value = "The name of the wireless network.")

  public String getSsid() {
    return ssid;
  }


  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public Profile wsec(String wsec) {
    
    this.wsec = wsec;
    return this;
  }

   /**
   * The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip**
   * @return wsec
  **/
  @ApiModelProperty(required = true, value = "The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip**")

  public String getWsec() {
    return wsec;
  }


  public void setWsec(String wsec) {
    this.wsec = wsec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.authType, profile.authType) &&
        Objects.equals(this.autoWifi, profile.autoWifi) &&
        Objects.equals(this.bssType, profile.bssType) &&
        Objects.equals(this.channel, profile.channel) &&
        Objects.equals(this.defaultProfile, profile.defaultProfile) &&
        Objects.equals(this.eap, profile.eap) &&
        Objects.equals(this.eapCaCert, profile.eapCaCert) &&
        Objects.equals(this.eapClientCert, profile.eapClientCert) &&
        Objects.equals(this.eapClientKey, profile.eapClientKey) &&
        Objects.equals(this.eapClientPwd, profile.eapClientPwd) &&
        Objects.equals(this.eapIdentity, profile.eapIdentity) &&
        Objects.equals(this.eapIntermediateCert, profile.eapIntermediateCert) &&
        Objects.equals(this.eapPwd, profile.eapPwd) &&
        Objects.equals(this.hiddenSsid, profile.hiddenSsid) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.psk, profile.psk) &&
        Objects.equals(this.ssid, profile.ssid) &&
        Objects.equals(this.wsec, profile.wsec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, autoWifi, bssType, channel, defaultProfile, eap, eapCaCert, eapClientCert, eapClientKey, eapClientPwd, eapIdentity, eapIntermediateCert, eapPwd, hiddenSsid, name, psk, ssid, wsec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoWifi: ").append(toIndentedString(autoWifi)).append("\n");
    sb.append("    bssType: ").append(toIndentedString(bssType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    defaultProfile: ").append(toIndentedString(defaultProfile)).append("\n");
    sb.append("    eap: ").append(toIndentedString(eap)).append("\n");
    sb.append("    eapCaCert: ").append(toIndentedString(eapCaCert)).append("\n");
    sb.append("    eapClientCert: ").append(toIndentedString(eapClientCert)).append("\n");
    sb.append("    eapClientKey: ").append(toIndentedString(eapClientKey)).append("\n");
    sb.append("    eapClientPwd: ").append(toIndentedString(eapClientPwd)).append("\n");
    sb.append("    eapIdentity: ").append(toIndentedString(eapIdentity)).append("\n");
    sb.append("    eapIntermediateCert: ").append(toIndentedString(eapIntermediateCert)).append("\n");
    sb.append("    eapPwd: ").append(toIndentedString(eapPwd)).append("\n");
    sb.append("    hiddenSsid: ").append(toIndentedString(hiddenSsid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    wsec: ").append(toIndentedString(wsec)).append("\n");
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
    openapiFields.add("authType");
    openapiFields.add("autoWifi");
    openapiFields.add("bssType");
    openapiFields.add("channel");
    openapiFields.add("defaultProfile");
    openapiFields.add("eap");
    openapiFields.add("eapCaCert");
    openapiFields.add("eapClientCert");
    openapiFields.add("eapClientKey");
    openapiFields.add("eapClientPwd");
    openapiFields.add("eapIdentity");
    openapiFields.add("eapIntermediateCert");
    openapiFields.add("eapPwd");
    openapiFields.add("hiddenSsid");
    openapiFields.add("name");
    openapiFields.add("psk");
    openapiFields.add("ssid");
    openapiFields.add("wsec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authType");
    openapiRequiredFields.add("bssType");
    openapiRequiredFields.add("ssid");
    openapiRequiredFields.add("wsec");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Profile.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Profile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Profile.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Profile is not found in the empty JSON string", Profile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Profile.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Profile` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Profile.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field authType
      if (jsonObj.get("authType") != null && !jsonObj.get("authType").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `authType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authType").toString()));
      }
      // validate the optional field bssType
      if (jsonObj.get("bssType") != null && !jsonObj.get("bssType").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `bssType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bssType").toString()));
      }
      // validate the optional field eap
      if (jsonObj.get("eap") != null && !jsonObj.get("eap").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `eap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eap").toString()));
      }
      // validate the optional field `eapCaCert`
      if (jsonObj.getAsJsonObject("eapCaCert") != null) {
        ModelFile.validateJsonObject(jsonObj.getAsJsonObject("eapCaCert"));
      }
      // validate the optional field `eapClientCert`
      if (jsonObj.getAsJsonObject("eapClientCert") != null) {
        ModelFile.validateJsonObject(jsonObj.getAsJsonObject("eapClientCert"));
      }
      // validate the optional field `eapClientKey`
      if (jsonObj.getAsJsonObject("eapClientKey") != null) {
        ModelFile.validateJsonObject(jsonObj.getAsJsonObject("eapClientKey"));
      }
      // validate the optional field eapClientPwd
      if (jsonObj.get("eapClientPwd") != null && !jsonObj.get("eapClientPwd").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `eapClientPwd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eapClientPwd").toString()));
      }
      // validate the optional field eapIdentity
      if (jsonObj.get("eapIdentity") != null && !jsonObj.get("eapIdentity").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `eapIdentity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eapIdentity").toString()));
      }
      // validate the optional field `eapIntermediateCert`
      if (jsonObj.getAsJsonObject("eapIntermediateCert") != null) {
        ModelFile.validateJsonObject(jsonObj.getAsJsonObject("eapIntermediateCert"));
      }
      // validate the optional field eapPwd
      if (jsonObj.get("eapPwd") != null && !jsonObj.get("eapPwd").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `eapPwd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eapPwd").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field psk
      if (jsonObj.get("psk") != null && !jsonObj.get("psk").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `psk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("psk").toString()));
      }
      // validate the optional field ssid
      if (jsonObj.get("ssid") != null && !jsonObj.get("ssid").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `ssid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssid").toString()));
      }
      // validate the optional field wsec
      if (jsonObj.get("wsec") != null && !jsonObj.get("wsec").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `wsec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wsec").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Profile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Profile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Profile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Profile.class));

       return (TypeAdapter<T>) new TypeAdapter<Profile>() {
           @Override
           public void write(JsonWriter out, Profile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Profile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Profile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Profile
  * @throws IOException if the JSON string is invalid with respect to Profile
  */
  public static Profile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Profile.class);
  }

 /**
  * Convert an instance of Profile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

