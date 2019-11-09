package com.ccarlos.cccmall.entity;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @description: Theme主题类
 * @author: Created by ccarlos
 * @date: 2019/11/9 20:25
 */
@Setter
@Getter
@Builder
public class Theme implements Serializable {

    private static final long serialVersionUID = 1134947167868500547L;

    public Long id;

    public String title;

    public String description;

    public String name;

    public String extend;

    public String entrance_img;

    public String internal_top_img;

    public Boolean online;

    public String title_img;

    public String tpl_name;

    public List<Spu_list> spu_list;

    @Getter
    @Setter
    @Builder
    public static class Spu_list implements Serializable{

        private static final long serialVersionUID = -7284499460623958161L;

        public Long id;

        public String title;

        public String subtitle;

        public Long category_id;

        public Long root_category_id;

        public String price;

        public String img;

        public String for_theme_img;

        public String description;

        public String discount_price;

        public Boolean tags;

        public Boolean online;
    }
}
