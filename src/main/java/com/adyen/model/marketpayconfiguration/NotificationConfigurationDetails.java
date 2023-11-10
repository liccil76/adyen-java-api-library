/*
 * Notification Configuration API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Notification Configuration API provides endpoints for setting up and testing notifications that inform you of events on your platform, for example when a verification check or a payout has been completed.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic/notifications). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Notification Configuration API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Notification/v6/createNotificationConfiguration ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayconfiguration;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpayconfiguration.NotificationEventConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * NotificationConfigurationDetails
 */
@JsonPropertyOrder({
  NotificationConfigurationDetails.JSON_PROPERTY_ACTIVE,
  NotificationConfigurationDetails.JSON_PROPERTY_API_VERSION,
  NotificationConfigurationDetails.JSON_PROPERTY_DESCRIPTION,
  NotificationConfigurationDetails.JSON_PROPERTY_EVENT_CONFIGS,
  NotificationConfigurationDetails.JSON_PROPERTY_HMAC_SIGNATURE_KEY,
  NotificationConfigurationDetails.JSON_PROPERTY_NOTIFICATION_ID,
  NotificationConfigurationDetails.JSON_PROPERTY_NOTIFY_PASSWORD,
  NotificationConfigurationDetails.JSON_PROPERTY_NOTIFY_U_R_L,
  NotificationConfigurationDetails.JSON_PROPERTY_NOTIFY_USERNAME,
  NotificationConfigurationDetails.JSON_PROPERTY_SSL_PROTOCOL
})

public class NotificationConfigurationDetails {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
  private Integer apiVersion;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVENT_CONFIGS = "eventConfigs";
  private List<NotificationEventConfiguration> eventConfigs = null;

  public static final String JSON_PROPERTY_HMAC_SIGNATURE_KEY = "hmacSignatureKey";
  private String hmacSignatureKey;

  public static final String JSON_PROPERTY_NOTIFICATION_ID = "notificationId";
  private Long notificationId;

  public static final String JSON_PROPERTY_NOTIFY_PASSWORD = "notifyPassword";
  private String notifyPassword;

  public static final String JSON_PROPERTY_NOTIFY_U_R_L = "notifyURL";
  private String notifyURL;

  public static final String JSON_PROPERTY_NOTIFY_USERNAME = "notifyUsername";
  private String notifyUsername;

  /**
   * The SSL protocol employed by the endpoint. &gt;Permitted values: &#x60;TLSv12&#x60;, &#x60;TLSv13&#x60;.
   */
  public enum SslProtocolEnum {
    TLSV12("TLSv12"),
    
    TLSV13("TLSv13");

    private String value;

    SslProtocolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SslProtocolEnum fromValue(String value) {
      for (SslProtocolEnum b : SslProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SSL_PROTOCOL = "sslProtocol";
  private SslProtocolEnum sslProtocol;

  public NotificationConfigurationDetails() { 
  }

  public NotificationConfigurationDetails active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates whether the notification subscription is active.
   * @return active
  **/
  @ApiModelProperty(value = "Indicates whether the notification subscription is active.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public NotificationConfigurationDetails apiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The version of the notification to which you are subscribing. To make sure that your integration can properly process the notification, subscribe to the same version as the API that you&#39;re using.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "The version of the notification to which you are subscribing. To make sure that your integration can properly process the notification, subscribe to the same version as the API that you're using.")
  @JsonProperty(JSON_PROPERTY_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getApiVersion() {
    return apiVersion;
  }


  @JsonProperty(JSON_PROPERTY_API_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
  }


  public NotificationConfigurationDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the notification subscription configuration.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the notification subscription configuration.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public NotificationConfigurationDetails eventConfigs(List<NotificationEventConfiguration> eventConfigs) {
    this.eventConfigs = eventConfigs;
    return this;
  }

  public NotificationConfigurationDetails addEventConfigsItem(NotificationEventConfiguration eventConfigsItem) {
    if (this.eventConfigs == null) {
      this.eventConfigs = new ArrayList<>();
    }
    this.eventConfigs.add(eventConfigsItem);
    return this;
  }

   /**
   * Contains objects that define event types and their subscription settings.
   * @return eventConfigs
  **/
  @ApiModelProperty(value = "Contains objects that define event types and their subscription settings.")
  @JsonProperty(JSON_PROPERTY_EVENT_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NotificationEventConfiguration> getEventConfigs() {
    return eventConfigs;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventConfigs(List<NotificationEventConfiguration> eventConfigs) {
    this.eventConfigs = eventConfigs;
  }


  public NotificationConfigurationDetails hmacSignatureKey(String hmacSignatureKey) {
    this.hmacSignatureKey = hmacSignatureKey;
    return this;
  }

   /**
   * A string with which to salt the notification(s) before hashing. If this field is provided, a hash value will be included under the notification header &#x60;HmacSignature&#x60; and the hash protocol will be included under the notification header &#x60;Protocol&#x60;. A notification body along with its &#x60;hmacSignatureKey&#x60; and &#x60;Protocol&#x60; can be used to calculate a hash value; matching this hash value with the &#x60;HmacSignature&#x60; will ensure that the notification body has not been tampered with or corrupted.  &gt;Must be a 32-byte hex-encoded string (i.e. a string containing 64 hexadecimal characters; e.g. \&quot;b0ea55c2fe60d4d1d605e9c385e0e7f7e6cafbb939ce07010f31a327a0871f27\&quot;).  The omission of this field will preclude the provision of the &#x60;HmacSignature&#x60; and &#x60;Protocol&#x60; headers in notification(s).
   * @return hmacSignatureKey
  **/
  @ApiModelProperty(value = "A string with which to salt the notification(s) before hashing. If this field is provided, a hash value will be included under the notification header `HmacSignature` and the hash protocol will be included under the notification header `Protocol`. A notification body along with its `hmacSignatureKey` and `Protocol` can be used to calculate a hash value; matching this hash value with the `HmacSignature` will ensure that the notification body has not been tampered with or corrupted.  >Must be a 32-byte hex-encoded string (i.e. a string containing 64 hexadecimal characters; e.g. \"b0ea55c2fe60d4d1d605e9c385e0e7f7e6cafbb939ce07010f31a327a0871f27\").  The omission of this field will preclude the provision of the `HmacSignature` and `Protocol` headers in notification(s).")
  @JsonProperty(JSON_PROPERTY_HMAC_SIGNATURE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHmacSignatureKey() {
    return hmacSignatureKey;
  }


  @JsonProperty(JSON_PROPERTY_HMAC_SIGNATURE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHmacSignatureKey(String hmacSignatureKey) {
    this.hmacSignatureKey = hmacSignatureKey;
  }


  public NotificationConfigurationDetails notificationId(Long notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * Adyen-generated ID for the entry, returned in the response when you create a notification configuration. Required when updating an existing configuration using [&#x60;/updateNotificationConfiguration&#x60;](https://docs.adyen.com/api-explorer/#/NotificationConfigurationService/latest/post/updateNotificationConfiguration).
   * @return notificationId
  **/
  @ApiModelProperty(value = "Adyen-generated ID for the entry, returned in the response when you create a notification configuration. Required when updating an existing configuration using [`/updateNotificationConfiguration`](https://docs.adyen.com/api-explorer/#/NotificationConfigurationService/latest/post/updateNotificationConfiguration).")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNotificationId() {
    return notificationId;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationId(Long notificationId) {
    this.notificationId = notificationId;
  }


  public NotificationConfigurationDetails notifyPassword(String notifyPassword) {
    this.notifyPassword = notifyPassword;
    return this;
  }

   /**
   * The password to use when accessing the notifyURL with the specified username.
   * @return notifyPassword
  **/
  @ApiModelProperty(value = "The password to use when accessing the notifyURL with the specified username.")
  @JsonProperty(JSON_PROPERTY_NOTIFY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyPassword() {
    return notifyPassword;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyPassword(String notifyPassword) {
    this.notifyPassword = notifyPassword;
  }


  public NotificationConfigurationDetails notifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
    return this;
  }

   /**
   * The URL to which the notifications are to be sent.
   * @return notifyURL
  **/
  @ApiModelProperty(value = "The URL to which the notifications are to be sent.")
  @JsonProperty(JSON_PROPERTY_NOTIFY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyURL() {
    return notifyURL;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
  }


  public NotificationConfigurationDetails notifyUsername(String notifyUsername) {
    this.notifyUsername = notifyUsername;
    return this;
  }

   /**
   * The username to use when accessing the notifyURL.
   * @return notifyUsername
  **/
  @ApiModelProperty(value = "The username to use when accessing the notifyURL.")
  @JsonProperty(JSON_PROPERTY_NOTIFY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyUsername() {
    return notifyUsername;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyUsername(String notifyUsername) {
    this.notifyUsername = notifyUsername;
  }


  public NotificationConfigurationDetails sslProtocol(SslProtocolEnum sslProtocol) {
    this.sslProtocol = sslProtocol;
    return this;
  }

   /**
   * The SSL protocol employed by the endpoint. &gt;Permitted values: &#x60;TLSv12&#x60;, &#x60;TLSv13&#x60;.
   * @return sslProtocol
  **/
  @ApiModelProperty(value = "The SSL protocol employed by the endpoint. >Permitted values: `TLSv12`, `TLSv13`.")
  @JsonProperty(JSON_PROPERTY_SSL_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SslProtocolEnum getSslProtocol() {
    return sslProtocol;
  }


  @JsonProperty(JSON_PROPERTY_SSL_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslProtocol(SslProtocolEnum sslProtocol) {
    this.sslProtocol = sslProtocol;
  }


  /**
   * Return true if this NotificationConfigurationDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationConfigurationDetails notificationConfigurationDetails = (NotificationConfigurationDetails) o;
    return Objects.equals(this.active, notificationConfigurationDetails.active) &&
        Objects.equals(this.apiVersion, notificationConfigurationDetails.apiVersion) &&
        Objects.equals(this.description, notificationConfigurationDetails.description) &&
        Objects.equals(this.eventConfigs, notificationConfigurationDetails.eventConfigs) &&
        Objects.equals(this.hmacSignatureKey, notificationConfigurationDetails.hmacSignatureKey) &&
        Objects.equals(this.notificationId, notificationConfigurationDetails.notificationId) &&
        Objects.equals(this.notifyPassword, notificationConfigurationDetails.notifyPassword) &&
        Objects.equals(this.notifyURL, notificationConfigurationDetails.notifyURL) &&
        Objects.equals(this.notifyUsername, notificationConfigurationDetails.notifyUsername) &&
        Objects.equals(this.sslProtocol, notificationConfigurationDetails.sslProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, apiVersion, description, eventConfigs, hmacSignatureKey, notificationId, notifyPassword, notifyURL, notifyUsername, sslProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationConfigurationDetails {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventConfigs: ").append(toIndentedString(eventConfigs)).append("\n");
    sb.append("    hmacSignatureKey: ").append(toIndentedString(hmacSignatureKey)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notifyPassword: ").append(toIndentedString(notifyPassword)).append("\n");
    sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
    sb.append("    notifyUsername: ").append(toIndentedString(notifyUsername)).append("\n");
    sb.append("    sslProtocol: ").append(toIndentedString(sslProtocol)).append("\n");
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

/**
   * Create an instance of NotificationConfigurationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationConfigurationDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to NotificationConfigurationDetails
   */
  public static NotificationConfigurationDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NotificationConfigurationDetails.class);
  }
/**
  * Convert an instance of NotificationConfigurationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
