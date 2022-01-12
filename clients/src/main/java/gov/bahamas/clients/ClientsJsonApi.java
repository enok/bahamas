package gov.bahamas.clients;

import gov.bahamas.ApiClient;

import gov.bahamas.clients.model.ClientPostRequest;
import gov.bahamas.clients.model.ClientPostResponse;
import gov.bahamas.clients.model.ErrorArray;

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
@Component("gov.bahamas.clients.ClientsJsonApi")
public class ClientsJsonApi {
    private ApiClient apiClient;

    public ClientsJsonApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientsJsonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new client.
     * To try it out use api_key: 8b90b198bb858c0e047ee107175c51cd9a3d25a2
     * <p><b>201</b> - Business objects that represents a Client.
     * <p><b>401</b> - Acess Denied
     * <p><b>422</b> - Unprocessable Entity
     * @param apiKey Consumer api key. (required)
     * @param clientPostRequest  (required)
     * @return ClientPostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientPostResponse clientsJsonPost(String apiKey, ClientPostRequest clientPostRequest) throws RestClientException {
        return clientsJsonPostWithHttpInfo(apiKey, clientPostRequest).getBody();
    }

    /**
     * Creates a new client.
     * To try it out use api_key: 8b90b198bb858c0e047ee107175c51cd9a3d25a2
     * <p><b>201</b> - Business objects that represents a Client.
     * <p><b>401</b> - Acess Denied
     * <p><b>422</b> - Unprocessable Entity
     * @param apiKey Consumer api key. (required)
     * @param clientPostRequest  (required)
     * @return ResponseEntity&lt;ClientPostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientPostResponse> clientsJsonPostWithHttpInfo(String apiKey, ClientPostRequest clientPostRequest) throws RestClientException {
        Object postBody = clientPostRequest;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiKey' when calling clientsJsonPost");
        }
        
        // verify the required parameter 'clientPostRequest' is set
        if (clientPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientPostRequest' when calling clientsJsonPost");
        }
        
        String path = apiClient.expandPath("/clients.json", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<ClientPostResponse> returnType = new ParameterizedTypeReference<ClientPostResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
