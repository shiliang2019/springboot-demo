package com.portal.base.swagger2;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/swagger")
public class SwaggerController {
	
    @ApiOperation(value="获取用户信息", notes="根据id来获取用户详细信息")
    @ApiImplicitParam(name="id", value="用户ID", required=true, dataType="String")
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public Map<String,String> getUserInfo(String id) {
      Map<String ,String> map = new HashMap<String, String>();
      map.put("name", "张三");
      map.put("age", "34");
      map.put("id", id);
       return map;
    }//   http://localhost:8081/swagger-ui.html
}