package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.CategoryTestData;
import com.ccarlos.cccmall.data.TagTestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: 分类控制器
 * @author: Created by ccarlos
 * @date: 2019/11/8 23:07
 */
@Slf4j
@RestController
@RequestMapping("/tag")
public class TagController {

   /**
    * @description: 根据类型获取标签数据
    * @author: ccarlos
    * @date: 2020/2/11 21:58
    * @param: request 请求
    * @param: type 类型
    * @return: java.lang.String
    */
    @GetMapping("/tag/type/{type}")
    public String getCategoryByGrid(HttpServletRequest request,
                                    @PathVariable("type") Integer type){
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("根据类型获取标签数据,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("根据类型获取标签数据,标签类型:{},请求返回数据:{}", type,TagTestData.TAG_DATA);
        return TagTestData.TAG_DATA;
    }

}
