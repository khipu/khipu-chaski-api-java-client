package com.khipu.chaski.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.chaski.api.model.ServiceError;
import com.khipu.chaski.api.model.DeviceList;
import com.khipu.chaski.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DeviceRegistryListApi {
  private ApiClient apiClient;

  public DeviceRegistryListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DeviceRegistryListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Lista de dispositivos
   * Obtiene la lista de dispositivos registrados
   * @param options Mapa de par��metros opcionales
   * @return DeviceList
   */
  public DeviceList getDevices ( Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/devices".replaceAll("\\{format\\}","json");

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

    
    TypeRef returnType = new TypeRef<DeviceList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista de dispositivos asociados a un id de receptor
   * Obtiene la lista de dispositivos asociados a un receptor
   * @param recipientId Identificador asociado a un receptor de mensajes push
   * @param options Mapa de par��metros opcionales
   * @return DeviceList
   */
  public DeviceList getRecipientDevices (String recipientId,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientDevices");
    }
    
    // create path and map variables
    String path = "/recipients/{recipientId}/devices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    
    TypeRef returnType = new TypeRef<DeviceList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Lista de dispositivos
  * Obtiene la lista de dispositivos registrados
  * @return DeviceList
  */
  public DeviceList getDevices () throws ApiException {
    return getDevices(null);
    
  }
  
  /**
  * Lista de dispositivos asociados a un id de receptor
  * Obtiene la lista de dispositivos asociados a un receptor
  * @param recipientId Identificador asociado a un receptor de mensajes push
  * @return DeviceList
  */
  public DeviceList getRecipientDevices (String recipientId) throws ApiException {
    return getRecipientDevices(recipientId, null);
    
  }
  

}
