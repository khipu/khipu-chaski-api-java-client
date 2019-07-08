package com.khipu.chaski.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.chaski.api.model.ServiceError;
import com.khipu.chaski.api.model.SuccessResponse;
import com.khipu.chaski.api.model.Message;
import com.khipu.chaski.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PushNotificationsApi {
  private ApiClient apiClient;

  public PushNotificationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PushNotificationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Enviar un nuevo mensaje
   * Encolar un nuevo mensaje para dispositivos moviles.
   * @param message Mensaje a enviar
   * @param options Mapa de par��metros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse sendMessage (Message message,  Map<String, Object> options) throws ApiException {
    Object postBody = message;
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling sendMessage");
    }
    
    // create path and map variables
    String path = "/message".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    

    if(options != null) {
      
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Enviar un nuevo mensaje
  * Encolar un nuevo mensaje para dispositivos moviles.
  * @param message Mensaje a enviar
  * @return SuccessResponse
  */
  public SuccessResponse sendMessage (Message message) throws ApiException {
    return sendMessage(message, null);
    
  }
  

}
