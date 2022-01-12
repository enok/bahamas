# ClientsJsonApi

All URIs are relative to *https://enok.app.invoicexpress.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientsJsonPost**](ClientsJsonApi.md#clientsJsonPost) | **POST** /clients.json | Creates a new client.



## clientsJsonPost

> ClientPostResponse clientsJsonPost(apiKey, clientPostRequest)

Creates a new client.

To try it out use api_key: 8b90b198bb858c0e047ee107175c51cd9a3d25a2

### Example

```java
// Import classes:
import gov.bahamas.ApiClient;
import gov.bahamas.ApiException;
import gov.bahamas.Configuration;
import gov.bahamas.auth.*;
import gov.bahamas.models.*;
import gov.bahamas.clients.ClientsJsonApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://enok.app.invoicexpress.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        ClientsJsonApi apiInstance = new ClientsJsonApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Consumer api key.
        ClientPostRequest clientPostRequest = new ClientPostRequest(); // ClientPostRequest | 
        try {
            ClientPostResponse result = apiInstance.clientsJsonPost(apiKey, clientPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsJsonApi#clientsJsonPost");
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
 **apiKey** | **String**| Consumer api key. |
 **clientPostRequest** | [**ClientPostRequest**](ClientPostRequest.md)|  |

### Return type

[**ClientPostResponse**](ClientPostResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml, application/javascript

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Business objects that represents a Client. |  -  |
| **401** | Acess Denied |  -  |
| **422** | Unprocessable Entity |  -  |

