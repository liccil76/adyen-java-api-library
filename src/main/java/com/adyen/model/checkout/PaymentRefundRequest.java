/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.ApplicationInfo;
import com.adyen.model.checkout.LineItem;
import com.adyen.model.checkout.Split;
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
 * PaymentRefundRequest
 */
@JsonPropertyOrder({
  PaymentRefundRequest.JSON_PROPERTY_AMOUNT,
  PaymentRefundRequest.JSON_PROPERTY_APPLICATION_INFO,
  PaymentRefundRequest.JSON_PROPERTY_LINE_ITEMS,
  PaymentRefundRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  PaymentRefundRequest.JSON_PROPERTY_MERCHANT_REFUND_REASON,
  PaymentRefundRequest.JSON_PROPERTY_REFERENCE,
  PaymentRefundRequest.JSON_PROPERTY_SPLITS
})

public class PaymentRefundRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_APPLICATION_INFO = "applicationInfo";
  private ApplicationInfo applicationInfo;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItem> lineItems = null;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  /**
   * Your reason for the refund request
   */
  public enum MerchantRefundReasonEnum {
    FRAUD("FRAUD"),
    
    CUSTOMER_REQUEST("CUSTOMER REQUEST"),
    
    RETURN("RETURN"),
    
    DUPLICATE("DUPLICATE"),
    
    OTHER("OTHER");

    private String value;

    MerchantRefundReasonEnum(String value) {
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
    public static MerchantRefundReasonEnum fromValue(String value) {
      for (MerchantRefundReasonEnum b : MerchantRefundReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MERCHANT_REFUND_REASON = "merchantRefundReason";
  private MerchantRefundReasonEnum merchantRefundReason;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SPLITS = "splits";
  private List<Split> splits = null;

  public PaymentRefundRequest() { 
  }

  public PaymentRefundRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public PaymentRefundRequest applicationInfo(ApplicationInfo applicationInfo) {
    this.applicationInfo = applicationInfo;
    return this;
  }

   /**
   * Get applicationInfo
   * @return applicationInfo
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplicationInfo getApplicationInfo() {
    return applicationInfo;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationInfo(ApplicationInfo applicationInfo) {
    this.applicationInfo = applicationInfo;
  }


  public PaymentRefundRequest lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public PaymentRefundRequest addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). &gt; This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip.
   * @return lineItems
  **/
  @ApiModelProperty(value = "Price and product information of the refunded items, required for [partial refunds](https://docs.adyen.com/online-payments/refund#refund-a-payment). > This field is required for partial refunds with 3x 4x Oney, Affirm, Afterpay, Atome, Clearpay, Klarna, Ratepay, Walley, and Zip.")
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }


  public PaymentRefundRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public PaymentRefundRequest merchantRefundReason(MerchantRefundReasonEnum merchantRefundReason) {
    this.merchantRefundReason = merchantRefundReason;
    return this;
  }

   /**
   * Your reason for the refund request
   * @return merchantRefundReason
  **/
  @ApiModelProperty(value = "Your reason for the refund request")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUND_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantRefundReasonEnum getMerchantRefundReason() {
    return merchantRefundReason;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFUND_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantRefundReason(MerchantRefundReasonEnum merchantRefundReason) {
    this.merchantRefundReason = merchantRefundReason;
  }


  public PaymentRefundRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the refund request. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the refund request. Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentRefundRequest splits(List<Split> splits) {
    this.splits = splits;
    return this;
  }

  public PaymentRefundRequest addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).
   * @return splits
  **/
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).")
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Split> getSplits() {
    return splits;
  }


  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }


  /**
   * Return true if this PaymentRefundRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRefundRequest paymentRefundRequest = (PaymentRefundRequest) o;
    return Objects.equals(this.amount, paymentRefundRequest.amount) &&
        Objects.equals(this.applicationInfo, paymentRefundRequest.applicationInfo) &&
        Objects.equals(this.lineItems, paymentRefundRequest.lineItems) &&
        Objects.equals(this.merchantAccount, paymentRefundRequest.merchantAccount) &&
        Objects.equals(this.merchantRefundReason, paymentRefundRequest.merchantRefundReason) &&
        Objects.equals(this.reference, paymentRefundRequest.reference) &&
        Objects.equals(this.splits, paymentRefundRequest.splits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, applicationInfo, lineItems, merchantAccount, merchantRefundReason, reference, splits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRefundRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    applicationInfo: ").append(toIndentedString(applicationInfo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    merchantRefundReason: ").append(toIndentedString(merchantRefundReason)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
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
   * Create an instance of PaymentRefundRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentRefundRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentRefundRequest
   */
  public static PaymentRefundRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentRefundRequest.class);
  }
/**
  * Convert an instance of PaymentRefundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

