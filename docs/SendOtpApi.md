# SendOtpApi

All URIs are relative to *http://localhost:8013*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendOTP**](SendOtpApi.md#sendOTP) | **POST** /otp/send | Send OTP


<a name="sendOTP"></a>
# **sendOTP**
> String sendOTP(sendOtpRequest, clientType)

Send OTP

Send OTP

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SendOtpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8013");

    SendOtpApi apiInstance = new SendOtpApi(defaultClient);
    SendOtpRequest sendOtpRequest = new SendOtpRequest(); // SendOtpRequest | 
    String clientType = "clientType_example"; // String | 
    try {
      String result = apiInstance.sendOTP(sendOtpRequest, clientType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendOtpApi#sendOTP");
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
**200** | Send OTP successfully |  -  |

