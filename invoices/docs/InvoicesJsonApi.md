# InvoicesJsonApi

All URIs are relative to *https://enok.app.invoicexpress.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoicesJsonPost**](InvoicesJsonApi.md#invoicesJsonPost) | **POST** /invoices.json | Creates a new invoice.



## invoicesJsonPost

> InvoicePostResponse invoicesJsonPost(apiKey, invoicePostRequest)

Creates a new invoice.

To try it out use api_key: 8b90b198bb858c0e047ee107175c51cd9a3d25a2

### Example

```java
// Import classes:
import gov.bahamas.ApiClient;
import gov.bahamas.ApiException;
import gov.bahamas.Configuration;
import gov.bahamas.auth.*;
import gov.bahamas.models.*;
import gov.bahamas.invoices.InvoicesJsonApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://enok.app.invoicexpress.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        InvoicesJsonApi apiInstance = new InvoicesJsonApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Consumer api key.
        InvoicePostRequest invoicePostRequest = new InvoicePostRequest(); // InvoicePostRequest | 
        try {
            InvoicePostResponse result = apiInstance.invoicesJsonPost(apiKey, invoicePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoicesJsonApi#invoicesJsonPost");
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
 **invoicePostRequest** | [**InvoicePostRequest**](InvoicePostRequest.md)|  |

### Return type

[**InvoicePostResponse**](InvoicePostResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml, application/javascript

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Business objects that represents an Invoice. |  -  |
| **401** | Acess Denied |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |

