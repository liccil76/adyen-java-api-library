/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.CreateCompanyWebhookRequest;
import com.adyen.model.management.GenerateHmacKeyResponse;
import com.adyen.model.management.ListWebhooksResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.TestCompanyWebhookRequest;
import com.adyen.model.management.TestWebhookResponse;
import com.adyen.model.management.UpdateCompanyWebhookRequest;
import com.adyen.model.management.Webhook;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WebhooksCompanyLevelApi extends Service {
    protected String baseURL;

    public WebhooksCompanyLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * Remove a webhook
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @throws ApiException if fails to make API call
    */
    public void removeWebhook(String companyId, String webhookId) throws ApiException, IOException {
        removeWebhook(companyId, webhookId, null);
    }

    /**
    * Remove a webhook
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void removeWebhook(String companyId, String webhookId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (webhookId == null) {
            throw new IllegalArgumentException("Please provide the webhookId path parameter");
        }
        pathParams.put("webhookId", webhookId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks/{webhookId}", null);
        resource.request(requestBody, null, ApiConstants.HttpMethod.DELETE, pathParams);
    }

    /**
    * List all webhooks
    *
    * @param companyId {@link String } Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). (required)
    * @return {@link ListWebhooksResponse }
    * @throws ApiException if fails to make API call
    */
    public ListWebhooksResponse listAllWebhooks(String companyId) throws ApiException, IOException {
        return listAllWebhooks(companyId, null,  null,  null);
    }

    /**
    * List all webhooks
    *
    * @param companyId {@link String } Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). (required)
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListWebhooksResponse }
    * @throws ApiException if fails to make API call
    */
    public ListWebhooksResponse listAllWebhooks(String companyId, Integer pageNumber, Integer pageSize, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListWebhooksResponse.fromJson(jsonResult);
    }

    /**
    * Get a webhook
    *
    * @param companyId {@link String } Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @return {@link Webhook }
    * @throws ApiException if fails to make API call
    */
    public Webhook getWebhook(String companyId, String webhookId) throws ApiException, IOException {
        return getWebhook(companyId, webhookId, null);
    }

    /**
    * Get a webhook
    *
    * @param companyId {@link String } Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Webhook }
    * @throws ApiException if fails to make API call
    */
    public Webhook getWebhook(String companyId, String webhookId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (webhookId == null) {
            throw new IllegalArgumentException("Please provide the webhookId path parameter");
        }
        pathParams.put("webhookId", webhookId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks/{webhookId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return Webhook.fromJson(jsonResult);
    }

    /**
    * Update a webhook
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param updateCompanyWebhookRequest {@link UpdateCompanyWebhookRequest }  (required)
    * @return {@link Webhook }
    * @throws ApiException if fails to make API call
    */
    public Webhook updateWebhook(String companyId, String webhookId, UpdateCompanyWebhookRequest updateCompanyWebhookRequest) throws ApiException, IOException {
        return updateWebhook(companyId, webhookId, updateCompanyWebhookRequest, null);
    }

    /**
    * Update a webhook
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param updateCompanyWebhookRequest {@link UpdateCompanyWebhookRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Webhook }
    * @throws ApiException if fails to make API call
    */
    public Webhook updateWebhook(String companyId, String webhookId, UpdateCompanyWebhookRequest updateCompanyWebhookRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (webhookId == null) {
            throw new IllegalArgumentException("Please provide the webhookId path parameter");
        }
        pathParams.put("webhookId", webhookId);

        String requestBody = updateCompanyWebhookRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks/{webhookId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return Webhook.fromJson(jsonResult);
    }

    /**
    * Set up a webhook
    *
    * @param companyId {@link String } Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). (required)
    * @param createCompanyWebhookRequest {@link CreateCompanyWebhookRequest }  (required)
    * @return {@link Webhook }
    * @throws ApiException if fails to make API call
    */
    public Webhook setUpWebhook(String companyId, CreateCompanyWebhookRequest createCompanyWebhookRequest) throws ApiException, IOException {
        return setUpWebhook(companyId, createCompanyWebhookRequest, null);
    }

    /**
    * Set up a webhook
    *
    * @param companyId {@link String } Unique identifier of the [company account](https://docs.adyen.com/account/account-structure#company-account). (required)
    * @param createCompanyWebhookRequest {@link CreateCompanyWebhookRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Webhook }
    * @throws ApiException if fails to make API call
    */
    public Webhook setUpWebhook(String companyId, CreateCompanyWebhookRequest createCompanyWebhookRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);

        String requestBody = createCompanyWebhookRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return Webhook.fromJson(jsonResult);
    }

    /**
    * Generate an HMAC key
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @return {@link GenerateHmacKeyResponse }
    * @throws ApiException if fails to make API call
    */
    public GenerateHmacKeyResponse generateHmacKey(String companyId, String webhookId) throws ApiException, IOException {
        return generateHmacKey(companyId, webhookId, null);
    }

    /**
    * Generate an HMAC key
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenerateHmacKeyResponse }
    * @throws ApiException if fails to make API call
    */
    public GenerateHmacKeyResponse generateHmacKey(String companyId, String webhookId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (webhookId == null) {
            throw new IllegalArgumentException("Please provide the webhookId path parameter");
        }
        pathParams.put("webhookId", webhookId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks/{webhookId}/generateHmac", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return GenerateHmacKeyResponse.fromJson(jsonResult);
    }

    /**
    * Test a webhook
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param testCompanyWebhookRequest {@link TestCompanyWebhookRequest }  (required)
    * @return {@link TestWebhookResponse }
    * @throws ApiException if fails to make API call
    */
    public TestWebhookResponse testWebhook(String companyId, String webhookId, TestCompanyWebhookRequest testCompanyWebhookRequest) throws ApiException, IOException {
        return testWebhook(companyId, webhookId, testCompanyWebhookRequest, null);
    }

    /**
    * Test a webhook
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param webhookId {@link String } Unique identifier of the webhook configuration. (required)
    * @param testCompanyWebhookRequest {@link TestCompanyWebhookRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TestWebhookResponse }
    * @throws ApiException if fails to make API call
    */
    public TestWebhookResponse testWebhook(String companyId, String webhookId, TestCompanyWebhookRequest testCompanyWebhookRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (webhookId == null) {
            throw new IllegalArgumentException("Please provide the webhookId path parameter");
        }
        pathParams.put("webhookId", webhookId);

        String requestBody = testCompanyWebhookRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/webhooks/{webhookId}/test", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return TestWebhookResponse.fromJson(jsonResult);
    }
}