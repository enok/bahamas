package gov.bahamas.invoices;

import gov.bahamas.ApiClient;

import gov.bahamas.invoices.model.ErrorArray;
import gov.bahamas.invoices.model.InvoicePostRequest;
import gov.bahamas.invoices.model.InvoicePostResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@Component("gov.bahamas.invoices.InvoicesJsonApi")
public class InvoicesJsonApi {
    private ApiClient apiClient;

    public InvoicesJsonApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvoicesJsonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new invoice.
     * To try it out use api_key: 8b90b198bb858c0e047ee107175c51cd9a3d25a2
     * <p><b>201</b> - Business objects that represents an Invoice.
     * <p><b>401</b> - Acess Denied
     * <p><b>409</b> - Conflict
     * <p><b>422</b> - Unprocessable Entity
     * @param apiKey Consumer api key. (required)
     * @param invoicePostRequest  (required)
     * @return InvoicePostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvoicePostResponse invoicesJsonPost(String apiKey, InvoicePostRequest invoicePostRequest) throws RestClientException {
        return invoicesJsonPostWithHttpInfo(apiKey, invoicePostRequest).getBody();
    }

    /**
     * Creates a new invoice.
     * To try it out use api_key: 8b90b198bb858c0e047ee107175c51cd9a3d25a2
     * <p><b>201</b> - Business objects that represents an Invoice.
     * <p><b>401</b> - Acess Denied
     * <p><b>409</b> - Conflict
     * <p><b>422</b> - Unprocessable Entity
     * @param apiKey Consumer api key. (required)
     * @param invoicePostRequest  (required)
     * @return ResponseEntity&lt;InvoicePostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvoicePostResponse> invoicesJsonPostWithHttpInfo(String apiKey, InvoicePostRequest invoicePostRequest) throws RestClientException {
        Object postBody = invoicePostRequest;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiKey' when calling invoicesJsonPost");
        }
        
        // verify the required parameter 'invoicePostRequest' is set
        if (invoicePostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'invoicePostRequest' when calling invoicesJsonPost");
        }
        
        String path = apiClient.expandPath("/invoices.json", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "api_key", apiKey));

        final String[] localVarAccepts = { 
            "application/json", "application/xml", "application/javascript"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_key" };

        ParameterizedTypeReference<InvoicePostResponse> returnType = new ParameterizedTypeReference<InvoicePostResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
