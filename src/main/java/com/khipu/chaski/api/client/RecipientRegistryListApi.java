package com.khipu.chaski.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.chaski.api.model.ServiceError;
import com.khipu.chaski.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RecipientRegistryListApi {
  private ApiClient apiClient;

  public RecipientRegistryListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecipientRegistryListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Lista de receptores de asociados a la aplicacion
   * Obtiene la lista de receptores asociados a la aplicacion
   * @param options Mapa de par��metros opcionales
   * @return List<String>
   */
  public List<String> getRecipients ( Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/recipients".replaceAll("\\{format\\}","json");

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
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    
    TypeRef returnType = new TypeRef<List<String>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Lista de receptores de asociados a la aplicacion
  * Obtiene la lista de receptores asociados a la aplicacion
  * @return List<String>
  */
  public List<String> getRecipients () throws ApiException {
    return getRecipients(null);
    
  }
  

}
