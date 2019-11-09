package com.ccarlos.cccmall.controller;

import com.alibaba.fastjson.JSON;
import com.ccarlos.cccmall.data.ThemeTestData;
import com.ccarlos.cccmall.entity.Theme;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
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
        log.info("获取单个的主题数据,,请求返回数据:{}", ThemeTestData.singleThemeStr);
        return ThemeTestData.singleThemeStr;
    }

    /**
     * @description: 根据主题名获取单个主题的详情（含Spu数据）
     * @author: ccarlos
     * @date: 2019/11/9 15:35
     * @param: request
     * @return: java.lang.String
     */
    @GetMapping("/name/{name}/with_spu")
    public String getThemeByNamewithSpu(HttpServletRequest request, @PathVariable("name") String name) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        List<Theme.Spu_list> spu_listList= Lists.newArrayList();
        for(int i=0;i<30;i++){
            Theme.Spu_list spu_list=Theme.Spu_list.builder().id(Long.valueOf(i))
                    .title("title"+i).subtitle("subtitle"+i).category_id(Long.valueOf(100+i))
                    .root_category_id(Long.valueOf(10+i)).price(String.valueOf(20+i))
                    .img("http://i2.sleeve.7yue.pro/m10.png").for_theme_img("http://i2.sleeve.7yue.pro/m10.png")
                    .description("description"+i).discount_price(String.valueOf(32+i)).tags(true)
                    .online(true).build();
            spu_listList.add(spu_list);
        }

        Theme theme=Theme.builder().id(Long.valueOf(5))
                .title("风袖甄选").description("description")
                .name("t-3").entrance_img("http://i2.sleeve.7yue.pro/m9.png")
                .internal_top_img("http://i2.sleeve.7yue.pro/m9.png").online(true)
                .title_img("http://i2.sleeve.7yue.pro/m9.png").tpl_name("tpl_name")
                .spu_list(spu_listList).build();
        log.info("根据主题名获取单个主题的详情（含Spu数据），地址栏参数信息：{}",name );
        log.info("根据主题名获取单个主题的详情（含Spu数据）,请求参数parameterMap:{}", JSON.toJSONString(parameterMap));
        log.info("根据主题名获取单个主题的详情（含Spu数据）,请求返回数据:{}", JSON.toJSONString(theme));
        System.out.println("JSON:"+JSON.toJSONString(theme));
        return JSON.toJSONString(theme);
    }
}
