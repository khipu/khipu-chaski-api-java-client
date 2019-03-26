package com.khipu.chaski.api.model;

import com.khipu.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Device   {
  
  private String tokenId = null;
  private List<String> recipients = new ArrayList<String>();
  private String extraData = null;

  
  /**
   * token para notificaciones asociado al dispositivo. Tiene la forma <platform>:<registryId>, donde platform puede tomar los valores \"and\" o \"ios\".
   **/
  @ApiModelProperty(value = "token para notificaciones asociado al dispositivo. Tiene la forma <platform>:<registryId>, donde platform puede tomar los valores \"and\" o \"ios\".")
  @JsonProperty("tokenId")
  public String getTokenId() {
    return tokenId;
  }
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  
  /**
   * Lista de receptores asociados al dispositivo
   **/
  @ApiModelProperty(value = "Lista de receptores asociados al dispositivo")
  @JsonProperty("recipients")
  public List<String> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  
  /**
   * informacion adicional del dispositivo
   **/
  @ApiModelProperty(value = "informacion adicional del dispositivo")
  @JsonProperty("extraData")
  public String getExtraData() {
    return extraData;
  }
  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    tokenId: ").append(StringUtil.toIndentedString(tokenId)).append("\n");
    sb.append("    recipients: ").append(StringUtil.toIndentedString(recipients)).append("\n");
    sb.append("    extraData: ").append(StringUtil.toIndentedString(extraData)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
