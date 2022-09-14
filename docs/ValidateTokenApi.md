# ValidateTokenApi

All URIs are relative to *http://localhost:8013*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateToken**](ValidateTokenApi.md#validateToken) | **POST** /token/validate | Validate Token


<a name="validateToken"></a>
# **validateToken**
> String validateToken(authorization, tokenRequest)

Validate Token

Validate token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ValidateTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8013");

    ValidateTokenApi apiInstance = new ValidateTokenApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    TokenRequest tokenRequest = new TokenRequest(); // TokenRequest | 
    try {
      String result = apiInstance.validateToken(authorization, tokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidateTokenApi#validateToken");
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
 **authorization** | **String**|  |
 **tokenRequest** | [**TokenRequest**](TokenRequest.md)|  |

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
**200** | Token validated successfully |  -  |

