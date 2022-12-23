/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.Address;
import com.adyen.model.legalentitymanagement.PhoneNumber;
import com.adyen.model.legalentitymanagement.StockData;
import com.adyen.model.legalentitymanagement.TaxInformation;
import com.adyen.model.legalentitymanagement.TaxReportingClassification;
import com.adyen.model.legalentitymanagement.WebData;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * Organization
 */

public class Organization {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOING_BUSINESS_AS = "doingBusinessAs";
  @SerializedName(SERIALIZED_NAME_DOING_BUSINESS_AS)
  private String doingBusinessAs;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private PhoneNumber phone;

  public static final String SERIALIZED_NAME_PRINCIPAL_PLACE_OF_BUSINESS = "principalPlaceOfBusiness";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_PLACE_OF_BUSINESS)
  private Address principalPlaceOfBusiness;

  public static final String SERIALIZED_NAME_REGISTERED_ADDRESS = "registeredAddress";
  @SerializedName(SERIALIZED_NAME_REGISTERED_ADDRESS)
  private Address registeredAddress;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registrationNumber";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  public static final String SERIALIZED_NAME_STOCK_DATA = "stockData";
  @SerializedName(SERIALIZED_NAME_STOCK_DATA)
  private StockData stockData;

  public static final String SERIALIZED_NAME_TAX_INFORMATION = "taxInformation";
  @SerializedName(SERIALIZED_NAME_TAX_INFORMATION)
  private List<TaxInformation> taxInformation = null;

  public static final String SERIALIZED_NAME_TAX_REPORTING_CLASSIFICATION = "taxReportingClassification";
  @SerializedName(SERIALIZED_NAME_TAX_REPORTING_CLASSIFICATION)
  private TaxReportingClassification taxReportingClassification;

  /**
   * Type of organization.   Possible values: **associationIncorporated**, **governmentalOrganization**, **listedPublicCompany**, **nonProfit**, **partnershipIncorporated**, **privateCompany**.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ASSOCIATIONINCORPORATED("associationIncorporated"),
    
    GOVERNMENTALORGANIZATION("governmentalOrganization"),
    
    LISTEDPUBLICCOMPANY("listedPublicCompany"),
    
    NONPROFIT("nonProfit"),
    
    PARTNERSHIPINCORPORATED("partnershipIncorporated"),
    
    PRIVATECOMPANY("privateCompany");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The reason the organization has not provided a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
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

  public static final String SERIALIZED_NAME_WEB_DATA = "webData";
  @SerializedName(SERIALIZED_NAME_WEB_DATA)
  private WebData webData;

  public Organization() { 
  }

  public Organization description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the organization.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your description for the organization.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Organization doingBusinessAs(String doingBusinessAs) {
    
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

   /**
   * The organization&#39;s trading name, if different from the registered legal name.
   * @return doingBusinessAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's trading name, if different from the registered legal name.")

  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }


  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }


  public Organization email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the legal entity.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the legal entity.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Organization legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The organization&#39;s legal name.
   * @return legalName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The organization's legal name.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public Organization phone(PhoneNumber phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhoneNumber getPhone() {
    return phone;
  }


  public void setPhone(PhoneNumber phone) {
    this.phone = phone;
  }


  public Organization principalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
    return this;
  }

   /**
   * Get principalPlaceOfBusiness
   * @return principalPlaceOfBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getPrincipalPlaceOfBusiness() {
    return principalPlaceOfBusiness;
  }


  public void setPrincipalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
  }


  public Organization registeredAddress(Address registeredAddress) {
    
    this.registeredAddress = registeredAddress;
    return this;
  }

   /**
   * Get registeredAddress
   * @return registeredAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Address getRegisteredAddress() {
    return registeredAddress;
  }


  public void setRegisteredAddress(Address registeredAddress) {
    this.registeredAddress = registeredAddress;
  }


  public Organization registrationNumber(String registrationNumber) {
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * The organization&#39;s registration number.
   * @return registrationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's registration number.")

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public Organization stockData(StockData stockData) {
    
    this.stockData = stockData;
    return this;
  }

   /**
   * Get stockData
   * @return stockData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StockData getStockData() {
    return stockData;
  }


  public void setStockData(StockData stockData) {
    this.stockData = stockData;
  }


  public Organization taxInformation(List<TaxInformation> taxInformation) {
    
    this.taxInformation = taxInformation;
    return this;
  }

  public Organization addTaxInformationItem(TaxInformation taxInformationItem) {
    if (this.taxInformation == null) {
      this.taxInformation = new ArrayList<>();
    }
    this.taxInformation.add(taxInformationItem);
    return this;
  }

   /**
   * The tax information of the organization.
   * @return taxInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tax information of the organization.")

  public List<TaxInformation> getTaxInformation() {
    return taxInformation;
  }


  public void setTaxInformation(List<TaxInformation> taxInformation) {
    this.taxInformation = taxInformation;
  }


  public Organization taxReportingClassification(TaxReportingClassification taxReportingClassification) {
    
    this.taxReportingClassification = taxReportingClassification;
    return this;
  }

   /**
   * Get taxReportingClassification
   * @return taxReportingClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxReportingClassification getTaxReportingClassification() {
    return taxReportingClassification;
  }


  public void setTaxReportingClassification(TaxReportingClassification taxReportingClassification) {
    this.taxReportingClassification = taxReportingClassification;
  }


  public Organization type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of organization.   Possible values: **associationIncorporated**, **governmentalOrganization**, **listedPublicCompany**, **nonProfit**, **partnershipIncorporated**, **privateCompany**.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of organization.   Possible values: **associationIncorporated**, **governmentalOrganization**, **listedPublicCompany**, **nonProfit**, **partnershipIncorporated**, **privateCompany**.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Organization vatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    
    this.vatAbsenceReason = vatAbsenceReason;
    return this;
  }

   /**
   * The reason the organization has not provided a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   * @return vatAbsenceReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason the organization has not provided a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.")

  public VatAbsenceReasonEnum getVatAbsenceReason() {
    return vatAbsenceReason;
  }


  public void setVatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    this.vatAbsenceReason = vatAbsenceReason;
  }


  public Organization vatNumber(String vatNumber) {
    
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * The organization&#39;s VAT number.
   * @return vatNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's VAT number.")

  public String getVatNumber() {
    return vatNumber;
  }


  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }


  public Organization webData(WebData webData) {
    
    this.webData = webData;
    return this;
  }

   /**
   * Get webData
   * @return webData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebData getWebData() {
    return webData;
  }


  public void setWebData(WebData webData) {
    this.webData = webData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.description, organization.description) &&
        Objects.equals(this.doingBusinessAs, organization.doingBusinessAs) &&
        Objects.equals(this.email, organization.email) &&
        Objects.equals(this.legalName, organization.legalName) &&
        Objects.equals(this.phone, organization.phone) &&
        Objects.equals(this.principalPlaceOfBusiness, organization.principalPlaceOfBusiness) &&
        Objects.equals(this.registeredAddress, organization.registeredAddress) &&
        Objects.equals(this.registrationNumber, organization.registrationNumber) &&
        Objects.equals(this.stockData, organization.stockData) &&
        Objects.equals(this.taxInformation, organization.taxInformation) &&
        Objects.equals(this.taxReportingClassification, organization.taxReportingClassification) &&
        Objects.equals(this.type, organization.type) &&
        Objects.equals(this.vatAbsenceReason, organization.vatAbsenceReason) &&
        Objects.equals(this.vatNumber, organization.vatNumber) &&
        Objects.equals(this.webData, organization.webData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, doingBusinessAs, email, legalName, phone, principalPlaceOfBusiness, registeredAddress, registrationNumber, stockData, taxInformation, taxReportingClassification, type, vatAbsenceReason, vatNumber, webData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    principalPlaceOfBusiness: ").append(toIndentedString(principalPlaceOfBusiness)).append("\n");
    sb.append("    registeredAddress: ").append(toIndentedString(registeredAddress)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    stockData: ").append(toIndentedString(stockData)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    taxReportingClassification: ").append(toIndentedString(taxReportingClassification)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vatAbsenceReason: ").append(toIndentedString(vatAbsenceReason)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("doingBusinessAs");
    openapiFields.add("email");
    openapiFields.add("legalName");
    openapiFields.add("phone");
    openapiFields.add("principalPlaceOfBusiness");
    openapiFields.add("registeredAddress");
    openapiFields.add("registrationNumber");
    openapiFields.add("stockData");
    openapiFields.add("taxInformation");
    openapiFields.add("taxReportingClassification");
    openapiFields.add("type");
    openapiFields.add("vatAbsenceReason");
    openapiFields.add("vatNumber");
    openapiFields.add("webData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("legalName");
    openapiRequiredFields.add("registeredAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Organization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Organization.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Organization is not found in the empty JSON string", Organization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Organization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Organization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Organization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field doingBusinessAs
      if (jsonObj.get("doingBusinessAs") != null && !jsonObj.get("doingBusinessAs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doingBusinessAs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doingBusinessAs").toString()));
      }
      // validate the optional field email
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field legalName
      if (jsonObj.get("legalName") != null && !jsonObj.get("legalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalName").toString()));
      }
      // validate the optional field `phone`
      if (jsonObj.getAsJsonObject("phone") != null) {
        PhoneNumber.validateJsonObject(jsonObj.getAsJsonObject("phone"));
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
        throw new IllegalArgumentException(String.format("Expected the field `registrationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationNumber").toString()));
      }
      // validate the optional field `stockData`
      if (jsonObj.getAsJsonObject("stockData") != null) {
        StockData.validateJsonObject(jsonObj.getAsJsonObject("stockData"));
      }
      JsonArray jsonArraytaxInformation = jsonObj.getAsJsonArray("taxInformation");
      if (jsonArraytaxInformation != null) {
        // ensure the json data is an array
        if (!jsonObj.get("taxInformation").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `taxInformation` to be an array in the JSON string but got `%s`", jsonObj.get("taxInformation").toString()));
        }

        // validate the optional field `taxInformation` (array)
        for (int i = 0; i < jsonArraytaxInformation.size(); i++) {
          TaxInformation.validateJsonObject(jsonArraytaxInformation.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `taxReportingClassification`
      if (jsonObj.getAsJsonObject("taxReportingClassification") != null) {
        TaxReportingClassification.validateJsonObject(jsonObj.getAsJsonObject("taxReportingClassification"));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
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
        throw new IllegalArgumentException(String.format("Expected the field `vatNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vatNumber").toString()));
      }
      // validate the optional field `webData`
      if (jsonObj.getAsJsonObject("webData") != null) {
        WebData.validateJsonObject(jsonObj.getAsJsonObject("webData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Organization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Organization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Organization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Organization.class));

       return (TypeAdapter<T>) new TypeAdapter<Organization>() {
           @Override
           public void write(JsonWriter out, Organization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Organization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Organization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Organization
  * @throws IOException if the JSON string is invalid with respect to Organization
  */
  public static Organization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Organization.class);
  }

 /**
  * Convert an instance of Organization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

