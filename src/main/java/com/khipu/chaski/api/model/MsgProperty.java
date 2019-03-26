package com.khipu.chaski.api.model;

import com.khipu.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MsgProperty   {
  
  private String key = null;
  private String value = null;

  
  /**
   * nombre de la propiedad
   **/
  @ApiModelProperty(value = "nombre de la propiedad")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * valor de la propiedad
   **/
  @ApiModelProperty(value = "valor de la propiedad")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgProperty {\n");
    
    sb.append("    key: ").append(StringUtil.toIndentedString(key)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
