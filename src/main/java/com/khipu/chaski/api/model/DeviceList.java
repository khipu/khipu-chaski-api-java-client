package com.khipu.chaski.api.model;

import com.khipu.StringUtil;
import com.khipu.chaski.api.model.Device;
import java.util.ArrayList;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Lista de dispositivos
 **/
@ApiModel(description = "Lista de dispositivos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DeviceList extends ArrayList<Device>  {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceList {\n");
    sb.append("    ").append(StringUtil.toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
