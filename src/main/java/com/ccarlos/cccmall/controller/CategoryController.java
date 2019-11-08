package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.CategoryTestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/category")
public class CategoryController {

    /**
     * @description: 获取模拟分类六宫格数据
     * @author: ccarlos
     * @date: 2019/11/8 23:11
      * @param: request
     * @return: java.lang.String
     */
    @GetMapping("/grid/all")
    public String getCategoryByGrid(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("获取分类六宫格数据,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("获取分类六宫格数据,,请求返回数据:{}", CategoryTestData.getCategoryByGrid);
        return CategoryTestData.getCategoryByGrid;
    }
}
