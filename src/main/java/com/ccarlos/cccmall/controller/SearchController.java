package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.SearchTestData;
import com.ccarlos.cccmall.data.TagTestData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: 搜索控制器
 * @author: ccarlos
 * @date: 2020/2/11 22:24
 */
@Slf4j
@RestController
@RequestMapping("/search")
public class SearchController {

   /**
    * @description: 获取商品搜索数据
    * @author: ccarlos
    * @date: 2020/2/11 21:58
    * @param: request 请求
    * @param: type 类型
    * @return: java.lang.String
    */
    @GetMapping()
    public String getSearchItem(HttpServletRequest request,
                                    @RequestParam String q){
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("获取商品搜索数据,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("获取商品搜索数据,搜索关键字:{},请求返回数据:{}", q,SearchTestData.SEARCH_DATA);
        return SearchTestData.SEARCH_DATA;
    }

}
