/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.VerifyOTPRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidateOtpApi
 */
@Ignore
public class ValidateOtpApiTest {

    private final ValidateOtpApi api = new ValidateOtpApi();

    
    /**
     * Validate OTP
     *
     * Validate OTP
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyOTPTest() throws ApiException {
        VerifyOTPRequest verifyOTPRequest = null;
        String clientType = null;
        String response = api.verifyOTP(verifyOTPRequest, clientType);

        // TODO: test validations
    }
    
}
