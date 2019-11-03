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
 * @description: 主题控制器
 * @author: Created by ccarlos
 * @date: 2019/11/3 16:10
 */
@Slf4j
@RestController
@RequestMapping("/theme")
public class ThemeController {

    /**
     * @description: 获取单个的主题数据
     * @author: ccarlos
     * @date: 2019/11/3 16:12
     * @return: java.lang.String
     */
    @GetMapping("/by/names")
    public String getSingleTheme(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("获取单个的主题数据,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("获取单个的主题数据,,请求返回数据:{}", ApiTestData.singleThemeStr);
        return ApiTestData.singleThemeStr;
    }
}
