package com.khipu.chaski.api.model;

import com.khipu.StringUtil;
import java.util.*;
import com.khipu.chaski.api.model.MsgProperty;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Message   {
  
  private String subject = null;
  private List<String> recipientIdSet = new ArrayList<String>();
  private String body = null;
  private List<MsgProperty> msgProperties = new ArrayList<MsgProperty>();

  
  /**
   * Asunto de mensaje
   **/
  @ApiModelProperty(value = "Asunto de mensaje")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * Lista de identificadores de receptores del mensaje
   **/
  @ApiModelProperty(value = "Lista de identificadores de receptores del mensaje")
  @JsonProperty("recipientIdSet")
  public List<String> getRecipientIdSet() {
    return recipientIdSet;
  }
  public void setRecipientIdSet(List<String> recipientIdSet) {
    this.recipientIdSet = recipientIdSet;
  }

  
  /**
   * Cuerpo del mensaje
   **/
  @ApiModelProperty(value = "Cuerpo del mensaje")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   * Lista de propiedades del mensaje
   **/
  @ApiModelProperty(value = "Lista de propiedades del mensaje")
  @JsonProperty("msgProperties")
  public List<MsgProperty> getMsgProperties() {
    return msgProperties;
  }
  public void setMsgProperties(List<MsgProperty> msgProperties) {
    this.msgProperties = msgProperties;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    subject: ").append(StringUtil.toIndentedString(subject)).append("\n");
    sb.append("    recipientIdSet: ").append(StringUtil.toIndentedString(recipientIdSet)).append("\n");
    sb.append("    body: ").append(StringUtil.toIndentedString(body)).append("\n");
    sb.append("    msgProperties: ").append(StringUtil.toIndentedString(msgProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
