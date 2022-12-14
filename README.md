# OTP Based User Authentication SDK for Java

The OTP Based User Authentication SDK for Java enables you to easily work with OTP service API of PayU by easily integrating this SDK within your base system.
With our SDK, you do not need to worry about low level details for doing API integration and with few lines of code and a method calling, it can be done within few minutes.

## Features Supported
Following features are supported in the OTP Based User Authentication SDK:
 - Send OTP
 - Resend OTP
 - Verify OTP
 - Validate Token

To get started with OTP service, visit our [API Documentation](https://sandbox.payu.in/otp/doc/)

# Table of Contents
 1. [Requirements](#requirements)
 2. [Getting Started](#getting-started)
 3. [Installation](#installation)
 4. [Documentation for API Endpoints](#documentation-for-api-endpoints)
 5. [Documentation for Models](#documentation-for-models)
 6. [Recommendation](#recommendation)



## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:v0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v0.jar`
* `target/lib/*.jar`

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8013*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ResendOtpApi* | [**resendOTP**](docs/ResendOtpApi.md#resendOTP) | **POST** /otp/resend | Resend OTP
*SendOtpApi* | [**sendOTP**](docs/SendOtpApi.md#sendOTP) | **POST** /otp/send | Send OTP
*ValidateOtpApi* | [**verifyOTP**](docs/ValidateOtpApi.md#verifyOTP) | **POST** /otp/verify | Validate OTP
*ValidateTokenApi* | [**validateToken**](docs/ValidateTokenApi.md#validateToken) | **POST** /token/validate | Validate Token


## Documentation for Models

 - [SendOtpRequest](docs/SendOtpRequest.md)
 - [TokenRequest](docs/TokenRequest.md)
 - [VerifyOTPRequest](docs/VerifyOTPRequest.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
