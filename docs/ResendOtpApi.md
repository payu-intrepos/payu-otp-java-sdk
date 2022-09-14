# ResendOtpApi

All URIs are relative to *http://localhost:8013*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resendOTP**](ResendOtpApi.md#resendOTP) | **POST** /otp/resend | Resend OTP


<a name="resendOTP"></a>
# **resendOTP**
> String resendOTP(sendOtpRequest, clientType, uuid)

Resend OTP

Resend OTP

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ResendOtpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8013");

    ResendOtpApi apiInstance = new ResendOtpApi(defaultClient);
    SendOtpRequest sendOtpRequest = new SendOtpRequest(); // SendOtpRequest | 
    String clientType = "clientType_example"; // String | 
    String uuid = "uuid_example"; // String | 
    try {
      String result = apiInstance.resendOTP(sendOtpRequest, clientType, uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResendOtpApi#resendOTP");
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
 **sendOtpRequest** | [**SendOtpRequest**](SendOtpRequest.md)|  |
 **clientType** | **String**|  | [optional]
 **uuid** | **String**|  | [optional]

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
**200** | Resend OTP successfully |  -  |

