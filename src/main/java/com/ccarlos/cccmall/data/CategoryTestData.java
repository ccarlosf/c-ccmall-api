package com.ccarlos.cccmall.data;

/**
 * @description: 分类Api测试数据
 * @author: Created by ccarlos
 * @date: 2019/11/8 23:09
 */
public class CategoryTestData {

    /** 六宫格主题测试数据 */
    public static String getCategoryByGrid="[\n" +
            "    {\n" +
            "        \"id\": 1,\n" +
            "        \"title\": \"服装\",\n" +
            "        \"img\": \"http://i1.sleeve.7yue.pro/grid/clothing.png\",\n" +
            "        \"name\": null,\n" +
            "        \"category_id\": null,\n" +
            "        \"root_category_id\": 2\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"title\": \"包包\",\n" +
            "        \"img\": \"http://i1.sleeve.7yue.pro/grid/bag.png\",\n" +
            "        \"name\": null,\n" +
            "        \"category_id\": null,\n" +
            "        \"root_category_id\": 3\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"title\": \"鞋\",\n" +
            "        \"img\": \"http://i1.sleeve.7yue.pro/grid/shoes.png\",\n" +
            "        \"name\": null,\n" +
            "        \"category_id\": null,\n" +
            "        \"root_category_id\": 1\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 4,\n" +
            "        \"title\": \"饰品\",\n" +
            "        \"img\": \"http://i1.sleeve.7yue.pro/grid/jewelry.png\",\n" +
            "        \"name\": null,\n" +
            "        \"category_id\": null,\n" +
            "        \"root_category_id\": 5\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 5,\n" +
            "        \"title\": \"居家\",\n" +
            "        \"img\": \"http://i1.sleeve.7yue.pro/grid/furniture.png\",\n" +
            "        \"name\": null,\n" +
            "        \"category_id\": null,\n" +
            "        \"root_category_id\": 4\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 6,\n" +
            "        \"title\": \"工艺\",\n" +
            "        \"img\": \"http://i1.sleeve.7yue.pro/grid/book.png\",\n" +
            "        \"name\": null,\n" +
            "        \"category_id\": null,\n" +
            "        \"root_category_id\": 24\n" +
            "    }\n" +
            "]";

    public static String allCategoryData="{\n" +
            "    \"roots\": [\n" +
            "        {\n" +
            "            \"id\": 37,\n" +
            "            \"name\": \"测试数据\",\n" +
            "            \"is_root\": true,\n" +
            "            \"img\": \"http://i2.sleeve.7yue.pro/m1.png\",\n" +
            "            \"parent_id\": null,\n" +
            "            \"index\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 3,\n" +
            "            \"name\": \"包包\",\n" +
            "            \"is_root\": true,\n" +
            "            \"img\": \"http://i1.sleeve.7yue.pro/assets/702f2ce9-5729-4aa4-aeb3-921513327747.png\",\n" +
            "            \"parent_id\": null,\n" +
            "            \"index\": 1\n" +
            "        }\n" +
            "    ],\n" +
            "    \"subs\": [\n" +
            "        {\n" +
            "            \"id\": 6,\n" +
            "            \"name\": \"平底鞋\",\n" +
            "            \"is_root\": false,\n" +
            "            \"img\": \"http://i1.sleeve.7yue.pro/assets/b8e510a1-8340-43c2-a4b0-0e56a40256f9.png\",\n" +
            "            \"parent_id\": 3,\n" +
            "            \"index\": null\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 7,\n" +
            "            \"name\": \"凉鞋\",\n" +
            "            \"is_root\": false,\n" +
            "    \"img\": \"http://i2.sleeve.7yue.pro/m4.png\",\n" +
            "            \"parent_id\": 3,\n" +
            "            \"index\": null\n" +
            "        }\n" +
            "    ]\n" +
            "}";
}
