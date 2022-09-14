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
import org.openapitools.client.model.SendOtpRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResendOtpApi
 */
@Ignore
public class ResendOtpApiTest {

    private final ResendOtpApi api = new ResendOtpApi();

    
    /**
     * Resend OTP
     *
     * Resend OTP
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resendOTPTest() throws ApiException {
        SendOtpRequest sendOtpRequest = null;
        String clientType = null;
        String uuid = null;
        String response = api.resendOTP(sendOtpRequest, clientType, uuid);

        // TODO: test validations
    }
    
}
