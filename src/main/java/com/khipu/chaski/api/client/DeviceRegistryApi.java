package com.khipu.chaski.api.client;

import com.khipu.ApiException;
import com.khipu.ApiClient;
import com.khipu.Configuration;
import com.khipu.Pair;
import com.khipu.TypeRef;

import com.khipu.chaski.api.model.ServiceError;
import com.khipu.chaski.api.model.SuccessResponse;
import com.khipu.chaski.api.model.Device;
import com.khipu.chaski.api.model.AuthorizationError;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DeviceRegistryApi {
  private ApiClient apiClient;

  public DeviceRegistryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DeviceRegistryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Registro de dispositivo
   * Registra un dispositivo identificado por su tokenId
   * @param device Dispositivo a registrar
   * @param options Mapa de par��metros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse addDevice (Device device,  Map<String, Object> options) throws ApiException {
    Object postBody = device;
    
    // verify the required parameter 'device' is set
    if (device == null) {
      throw new ApiException(400, "Missing the required parameter 'device' when calling addDevice");
    }
    
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
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Obtiene dispositivo
   * Obtiene la informacion de un dispositivo especifico
   * @param tokenId Token que identifica al dispositivo. Tiene la forma &lt;platform&gt;:&lt;registryId&gt;, donde platform puede tomar los valores \&quot;and\&quot; o \&quot;ios\&quot;.
   * @param options Mapa de par��metros opcionales
   * @return Device
   */
  public Device getDevice (String tokenId,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'tokenId' is set
    if (tokenId == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenId' when calling getDevice");
    }
    
    // create path and map variables
    String path = "/devices/{tokenId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()));

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

    
    TypeRef returnType = new TypeRef<Device>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Agregar receptor
   * Agregar receptor de un dispositivo especifico
   * @param tokenId Token que identifica al dispositivo. Tiene la forma &lt;platform&gt;:&lt;registryId&gt;, donde platform puede tomar los valores \&quot;and\&quot; o \&quot;ios\&quot;.
   * @param recipientId Identificador asociado a un receptor de mensajes push
   * @param options Mapa de par��metros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse addDeviceRecipient (String tokenId, String recipientId,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'tokenId' is set
    if (tokenId == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenId' when calling addDeviceRecipient");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling addDeviceRecipient");
    }
    
    // create path and map variables
    String path = "/devices/{tokenId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()))
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
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Elimina receptor
   * Elimina receptor de un dispositivo especifico
   * @param tokenId Token que identifica al dispositivo. Tiene la forma &lt;platform&gt;:&lt;registryId&gt;, donde platform puede tomar los valores \&quot;and\&quot; o \&quot;ios\&quot;.
   * @param recipientId Identificador asociado a un receptor de mensajes push
   * @param options Mapa de par��metros opcionales
   * @return SuccessResponse
   */
  public SuccessResponse removeDeviceRecipient (String tokenId, String recipientId,  Map<String, Object> options) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'tokenId' is set
    if (tokenId == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenId' when calling removeDeviceRecipient");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling removeDeviceRecipient");
    }
    
    // create path and map variables
    String path = "/devices/{tokenId}/recipients/{recipientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tokenId" + "\\}", apiClient.escapeString(tokenId.toString()))
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
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "khipu" };

    
    TypeRef returnType = new TypeRef<SuccessResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  


  
  /**
  * Registro de dispositivo
  * Registra un dispositivo identificado por su tokenId
  * @param device Dispositivo a registrar
  * @return SuccessResponse
  */
  public SuccessResponse addDevice (Device device) throws ApiException {
    return addDevice(device, null);
    
  }
  
  /**
  * Obtiene dispositivo
  * Obtiene la informacion de un dispositivo especifico
  * @param tokenId Token que identifica al dispositivo. Tiene la forma &lt;platform&gt;:&lt;registryId&gt;, donde platform puede tomar los valores \&quot;and\&quot; o \&quot;ios\&quot;.
  * @return Device
  */
  public Device getDevice (String tokenId) throws ApiException {
    return getDevice(tokenId, null);
    
  }
  
  /**
  * Agregar receptor
  * Agregar receptor de un dispositivo especifico
  * @param tokenId Token que identifica al dispositivo. Tiene la forma &lt;platform&gt;:&lt;registryId&gt;, donde platform puede tomar los valores \&quot;and\&quot; o \&quot;ios\&quot;.
  * @param recipientId Identificador asociado a un receptor de mensajes push
  * @return SuccessResponse
  */
  public SuccessResponse addDeviceRecipient (String tokenId, String recipientId) throws ApiException {
    return addDeviceRecipient(tokenId, recipientId, null);
    
  }
  
  /**
  * Elimina receptor
  * Elimina receptor de un dispositivo especifico
  * @param tokenId Token que identifica al dispositivo. Tiene la forma &lt;platform&gt;:&lt;registryId&gt;, donde platform puede tomar los valores \&quot;and\&quot; o \&quot;ios\&quot;.
  * @param recipientId Identificador asociado a un receptor de mensajes push
  * @return SuccessResponse
  */
  public SuccessResponse removeDeviceRecipient (String tokenId, String recipientId) throws ApiException {
    return removeDeviceRecipient(tokenId, recipientId, null);
    
  }
  

}
