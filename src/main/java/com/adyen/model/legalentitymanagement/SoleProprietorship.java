/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.Address;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * SoleProprietorship
 */

public class SoleProprietorship {
  public static final String SERIALIZED_NAME_COUNTRY_OF_GOVERNING_LAW = "countryOfGoverningLaw";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_GOVERNING_LAW)
  private String countryOfGoverningLaw;

  public static final String SERIALIZED_NAME_DATE_OF_INCORPORATION = "dateOfIncorporation";
  @SerializedName(SERIALIZED_NAME_DATE_OF_INCORPORATION)
  private String dateOfIncorporation;

  public static final String SERIALIZED_NAME_DOING_BUSINESS_AS = "doingBusinessAs";
  @SerializedName(SERIALIZED_NAME_DOING_BUSINESS_AS)
  private String doingBusinessAs;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRINCIPAL_PLACE_OF_BUSINESS = "principalPlaceOfBusiness";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_PLACE_OF_BUSINESS)
  private Address principalPlaceOfBusiness;

  public static final String SERIALIZED_NAME_REGISTERED_ADDRESS = "registeredAddress";
  @SerializedName(SERIALIZED_NAME_REGISTERED_ADDRESS)
  private Address registeredAddress;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registrationNumber";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   */
  @JsonAdapter(VatAbsenceReasonEnum.Adapter.class)
  public enum VatAbsenceReasonEnum {
    INDUSTRYEXEMPTION("industryExemption"),
    
    BELOWTAXTHRESHOLD("belowTaxThreshold");

    private String value;

    VatAbsenceReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VatAbsenceReasonEnum fromValue(String value) {
      for (VatAbsenceReasonEnum b : VatAbsenceReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VatAbsenceReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VatAbsenceReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VatAbsenceReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VatAbsenceReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VAT_ABSENCE_REASON = "vatAbsenceReason";
  @SerializedName(SERIALIZED_NAME_VAT_ABSENCE_REASON)
  private VatAbsenceReasonEnum vatAbsenceReason;

  public static final String SERIALIZED_NAME_VAT_NUMBER = "vatNumber";
  @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
  private String vatNumber;

  public SoleProprietorship() { 
  }

  public SoleProprietorship countryOfGoverningLaw(String countryOfGoverningLaw) {
    
    this.countryOfGoverningLaw = countryOfGoverningLaw;
    return this;
  }

   /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.
   * @return countryOfGoverningLaw
  **/
  @ApiModelProperty(required = true, value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.")

  public String getCountryOfGoverningLaw() {
    return countryOfGoverningLaw;
  }


  public void setCountryOfGoverningLaw(String countryOfGoverningLaw) {
    this.countryOfGoverningLaw = countryOfGoverningLaw;
  }


  public SoleProprietorship dateOfIncorporation(String dateOfIncorporation) {
    
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * The date when the legal arrangement was incorporated in YYYY-MM-DD format.
   * @return dateOfIncorporation
  **/
  @ApiModelProperty(value = "The date when the legal arrangement was incorporated in YYYY-MM-DD format.")

  public String getDateOfIncorporation() {
    return dateOfIncorporation;
  }


  public void setDateOfIncorporation(String dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public SoleProprietorship doingBusinessAs(String doingBusinessAs) {
    
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

   /**
   * The registered name, if different from the &#x60;name&#x60;.
   * @return doingBusinessAs
  **/
  @ApiModelProperty(value = "The registered name, if different from the `name`.")

  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }


  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }


  public SoleProprietorship name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The legal name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The legal name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SoleProprietorship principalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
    return this;
  }

   /**
   * Get principalPlaceOfBusiness
   * @return principalPlaceOfBusiness
  **/
  @ApiModelProperty(value = "")

  public Address getPrincipalPlaceOfBusiness() {
    return principalPlaceOfBusiness;
  }


  public void setPrincipalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
  }


  public SoleProprietorship registeredAddress(Address registeredAddress) {
    
    this.registeredAddress = registeredAddress;
    return this;
  }

   /**
   * Get registeredAddress
   * @return registeredAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public Address getRegisteredAddress() {
    return registeredAddress;
  }


  public void setRegisteredAddress(Address registeredAddress) {
    this.registeredAddress = registeredAddress;
  }


  public SoleProprietorship registrationNumber(String registrationNumber) {
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * The registration number.
   * @return registrationNumber
  **/
  @ApiModelProperty(value = "The registration number.")

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public SoleProprietorship vatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    
    this.vatAbsenceReason = vatAbsenceReason;
    return this;
  }

   /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   * @return vatAbsenceReason
  **/
  @ApiModelProperty(value = "The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.")

  public VatAbsenceReasonEnum getVatAbsenceReason() {
    return vatAbsenceReason;
  }


  public void setVatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    this.vatAbsenceReason = vatAbsenceReason;
  }


  public SoleProprietorship vatNumber(String vatNumber) {
    
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * The VAT number.
   * @return vatNumber
  **/
  @ApiModelProperty(value = "The VAT number.")

  public String getVatNumber() {
    return vatNumber;
  }


  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoleProprietorship soleProprietorship = (SoleProprietorship) o;
    return Objects.equals(this.countryOfGoverningLaw, soleProprietorship.countryOfGoverningLaw) &&
        Objects.equals(this.dateOfIncorporation, soleProprietorship.dateOfIncorporation) &&
        Objects.equals(this.doingBusinessAs, soleProprietorship.doingBusinessAs) &&
        Objects.equals(this.name, soleProprietorship.name) &&
        Objects.equals(this.principalPlaceOfBusiness, soleProprietorship.principalPlaceOfBusiness) &&
        Objects.equals(this.registeredAddress, soleProprietorship.registeredAddress) &&
        Objects.equals(this.registrationNumber, soleProprietorship.registrationNumber) &&
        Objects.equals(this.vatAbsenceReason, soleProprietorship.vatAbsenceReason) &&
        Objects.equals(this.vatNumber, soleProprietorship.vatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfGoverningLaw, dateOfIncorporation, doingBusinessAs, name, principalPlaceOfBusiness, registeredAddress, registrationNumber, vatAbsenceReason, vatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoleProprietorship {\n");
    sb.append("    countryOfGoverningLaw: ").append(toIndentedString(countryOfGoverningLaw)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    principalPlaceOfBusiness: ").append(toIndentedString(principalPlaceOfBusiness)).append("\n");
    sb.append("    registeredAddress: ").append(toIndentedString(registeredAddress)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    vatAbsenceReason: ").append(toIndentedString(vatAbsenceReason)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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
    openapiFields.add("countryOfGoverningLaw");
    openapiFields.add("dateOfIncorporation");
    openapiFields.add("doingBusinessAs");
    openapiFields.add("name");
    openapiFields.add("principalPlaceOfBusiness");
    openapiFields.add("registeredAddress");
    openapiFields.add("registrationNumber");
    openapiFields.add("vatAbsenceReason");
    openapiFields.add("vatNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("countryOfGoverningLaw");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("registeredAddress");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(SoleProprietorship.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SoleProprietorship
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SoleProprietorship.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SoleProprietorship is not found in the empty JSON string", SoleProprietorship.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SoleProprietorship.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `SoleProprietorship` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SoleProprietorship.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field countryOfGoverningLaw
      if (jsonObj.get("countryOfGoverningLaw") != null && !jsonObj.get("countryOfGoverningLaw").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `countryOfGoverningLaw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryOfGoverningLaw").toString()));
      }
      // validate the optional field dateOfIncorporation
      if (jsonObj.get("dateOfIncorporation") != null && !jsonObj.get("dateOfIncorporation").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `dateOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfIncorporation").toString()));
      }
      // validate the optional field doingBusinessAs
      if (jsonObj.get("doingBusinessAs") != null && !jsonObj.get("doingBusinessAs").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `doingBusinessAs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doingBusinessAs").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `principalPlaceOfBusiness`
      if (jsonObj.getAsJsonObject("principalPlaceOfBusiness") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("principalPlaceOfBusiness"));
      }
      // validate the optional field `registeredAddress`
      if (jsonObj.getAsJsonObject("registeredAddress") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("registeredAddress"));
      }
      // validate the optional field registrationNumber
      if (jsonObj.get("registrationNumber") != null && !jsonObj.get("registrationNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `registrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationNumber").toString()));
      }
      // ensure the field vatAbsenceReason can be parsed to an enum value
      if (jsonObj.get("vatAbsenceReason") != null) {
        if(!jsonObj.get("vatAbsenceReason").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `vatAbsenceReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vatAbsenceReason").toString()));
        }
        VatAbsenceReasonEnum.fromValue(jsonObj.get("vatAbsenceReason").getAsString());
      }
      // validate the optional field vatNumber
      if (jsonObj.get("vatNumber") != null && !jsonObj.get("vatNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `vatNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vatNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoleProprietorship.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoleProprietorship' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoleProprietorship> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoleProprietorship.class));

       return (TypeAdapter<T>) new TypeAdapter<SoleProprietorship>() {
           @Override
           public void write(JsonWriter out, SoleProprietorship value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoleProprietorship read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SoleProprietorship given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SoleProprietorship
  * @throws IOException if the JSON string is invalid with respect to SoleProprietorship
  */
  public static SoleProprietorship fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoleProprietorship.class);
  }

 /**
  * Convert an instance of SoleProprietorship to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

