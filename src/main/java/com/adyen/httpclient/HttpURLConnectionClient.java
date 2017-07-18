/**
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
import com.adyen.Client;
import com.adyen.Config;

public class HttpURLConnectionClient implements ClientInterface {
    private HttpURLConnection httpConnection;
    private static final String CHARSET = "UTF-8";
    
    /**
     * Does a POST request.
     * config is used to obtain basic auth username, password and User-Agent
     *
     * @param requestUrl
     * @param requestBody
     * @param config
     * @return
     * @throws IOException
     */
    @Override
    public String request(String requestUrl, String requestBody, Config config) throws IOException, HTTPClientException {
        String response = createRequest(requestUrl, config.getApplicationName())
                .setBasicAuthentication(config.getUsername(), config.getPassword())
                .setContentType("application/json")
                .doPostRequest(requestBody);

        return response;
    }

    private static String getResponseBody(InputStream responseStream)
            throws IOException {
        //\A is the beginning of the stream boundary
        Scanner scanner = new Scanner(responseStream, CHARSET);
        scanner.useDelimiter("\\A");
        String rBody = scanner.useDelimiter("\\A").next();
        scanner.close();
        responseStream.close();
        return rBody;
    }

    /**
     * Does a POST request with HTTP key-value pairs
     *
     * @param requestUrl
     * @param params
     * @param config
     * @return
     * @throws IOException
     * @throws HTTPClientException
     */
    @Override
    public String post(String requestUrl, Map<String, String> params, Config config) throws IOException, HTTPClientException {
        String postQuery = getQuery(params);
        String response = createRequest(requestUrl, config.getApplicationName())
                .doPostRequest(postQuery);

        return response;
    }

    /**
     * Get HTTP querystring from Map<String,String>
     *
     * @param params
     * @return
     * @throws UnsupportedEncodingException
     */
    private String getQuery(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(pair.getKey(), CHARSET));
            result.append("=");
            result.append(URLEncoder.encode(pair.getValue(), CHARSET));
        }

        return result.toString();
    }

    /**
     * Initialize the httpConnection
     *
     * @param requestUrl
     * @param applicationName
     * @return
     * @throws IOException
     */
    private HttpURLConnectionClient createRequest(String requestUrl, String applicationName) throws IOException {
        URL targetUrl = new URL(requestUrl);

        // set configurations
        httpConnection = (HttpURLConnection) targetUrl.openConnection();
        httpConnection.setUseCaches(false);
        httpConnection.setDoOutput(true);
        httpConnection.setRequestMethod("POST");

        httpConnection.setRequestProperty("Accept-Charset", CHARSET);
        httpConnection.setRequestProperty("User-Agent",
                String.format("%s %s%s", applicationName, Client.USER_AGENT_SUFFIX, Client.LIB_VERSION));

        return this;
    }

    /**
     * Adds Basic Authentication headers
     *
     * @param username
     * @param password
     * @return
     */
    private HttpURLConnectionClient setBasicAuthentication(String username, String password) {
        // set basic authentication
        String authString = username + ":" + password;
        byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
        String authStringEnc = new String(authEncBytes);

        httpConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
        return this;
    }

    /**
     * Sets content type
     *
     * @param contentType
     * @return
     */
    private HttpURLConnectionClient setContentType(String contentType) {
        httpConnection.setRequestProperty("Content-Type", contentType);
        return this;
    }

    /**
     * Does a POST request with raw body
     *
     * @param requestBody
     * @return
     * @throws IOException
     * @throws HTTPClientException
     */
    private String doPostRequest(String requestBody) throws IOException, HTTPClientException {
        String response = null;

        OutputStream outputStream = httpConnection.getOutputStream();
        outputStream.write(requestBody.getBytes());
        outputStream.flush();

        int responseCode = httpConnection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            //Read the response from the error stream
            if(httpConnection.getErrorStream() != null) {
                response = getResponseBody(httpConnection.getErrorStream());
            }

            HTTPClientException httpClientException = new HTTPClientException(
                    responseCode,
                    "HTTP Exception",
                    httpConnection.getHeaderFields(),
                    response
            );

            throw httpClientException;
        }

        //InputStream is only available on successful requests >= 200 <400
        response = getResponseBody(httpConnection.getInputStream());

        // close the connection
        httpConnection.disconnect();

        return response;
    }
}
