# ValidateOtpApi

All URIs are relative to *http://localhost:8013*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyOTP**](ValidateOtpApi.md#verifyOTP) | **POST** /otp/verify | Validate OTP


<a name="verifyOTP"></a>
# **verifyOTP**
> String verifyOTP(verifyOTPRequest, clientType)

Validate OTP

Validate OTP

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidateOtpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8013");

    ValidateOtpApi apiInstance = new ValidateOtpApi(defaultClient);
    VerifyOTPRequest verifyOTPRequest = new VerifyOTPRequest(); // VerifyOTPRequest | 
    String clientType = "clientType_example"; // String | 
    try {
      String result = apiInstance.verifyOTP(verifyOTPRequest, clientType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidateOtpApi#verifyOTP");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyOTPRequest** | [**VerifyOTPRequest**](VerifyOTPRequest.md)|  |
 **clientType** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | OTP validated successfully |  -  |

