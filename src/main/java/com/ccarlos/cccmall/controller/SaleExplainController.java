package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.SaleExplainTestData;
import com.ccarlos.cccmall.data.SpuTestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: Spu商品补充说明控制器
 * @author: Created by ccarlos
 * @date: 2019/12/21 23:50
 */
@Slf4j
@RestController
@RequestMapping("/sale_explain")
public class SaleExplainController {

    @GetMapping("/fixed")
    public String getDetail(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("获取Spu商品补充说明,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("获取Spu商品补充说明,请求返回数据:{}", SaleExplainTestData.FIXED);
        return SaleExplainTestData.FIXED;
    }
}
