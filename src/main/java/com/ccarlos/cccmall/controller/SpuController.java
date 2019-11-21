package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.SpuTestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: Spu商品控制器
 * @author: Created by ccarlos
 * @date: 2019/11/21 22:52
 */
@Slf4j
@RestController
@RequestMapping("/spu")
public class SpuController {

    @GetMapping("/latest")
    public String getLatestSupList(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("获取最新Spu商品列表,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("获取最新Spu商品列表,,请求返回数据:{}", SpuTestData.latestSpuList);
        return SpuTestData.latestSpuList;
    }
}
