package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.ApiTestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: Banner控制器
 * @author: Created by ccarlos
 * @date: 2019/11/8 19:55
 */
@Slf4j
@RestController
@RequestMapping("/banner")
public class BannerController {


    /**
     * @description: 根据Banner名获取Banner
     * @author: ccarlos
     * @date: 2019/11/8 20:01
      * @param: request
     * @return: java.lang.String
     */
    @GetMapping("/name/{name}")
    public String getBannerByName(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("根据Banner名获取Banner,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("根据Banner名获取Banner,,请求返回数据:{}", ApiTestData.getBannerByName);
        return ApiTestData.getBannerByName;
    }
}
