package com.khipu.chaski.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.chaski.api.model.SuccessResponse;
import com.khipu.chaski.api.model.ServiceError;
import com.khipu.chaski.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-12T13:01:26.004Z")
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
   * @param recipientIdSet Receptores del mensaje
   * @param subject Asunto del mensaje
   * @param body cuerpo del mensaje
   * @param options Mapa de parámetros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse msgPost (String recipientIdSet, String subject, String body,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'recipientIdSet' is set
    if (recipientIdSet == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientIdSet' when calling msgPost");
    }
    
    // verify the required parameter 'subject' is set
    if (subject == null) {
      throw new ApiException(400, "Missing the required parameter 'subject' when calling msgPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling msgPost");
    }
    
    // create path and map variables
    String path = "/msg".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if(options != null) {
        
    }


    

    if(options != null) {
        
    }


    formParams.put("recipientIdSet", recipientIdSet);
    formParams.put("subject", subject);
    formParams.put("body", body);
    

    if(options != null) {
      
    }

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Enviar un nuevo mensaje
  * Encolar un nuevo mensaje para dispositivos moviles.
  * @param recipientIdSet Receptores del mensaje
  * @param subject Asunto del mensaje
  * @param body cuerpo del mensaje
  * @return SuccessResponse
  */
  public SuccessResponse msgPost (String recipientIdSet, String subject, String body) throws ApiException {
    return msgPost(recipientIdSet, subject, body, null);
    
  }
  

}
