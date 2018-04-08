package com.allen.cart.data;


/**
 *
 * 课程（商品）类
 *
 *
 */


public class Product {

    /**
     * 课程id
     */
    private Long id;
    /**
     * 课程标签
     */
    private String tag;
    /**
     * 课程名称
     */
    private String name;
    /**
     * 课程级别
     */
    private String level;
    /**
     * 课程描述
     */
    private String desc;
    /**
     * 课程价格
     */
    private int price;

    public Product(Long id, String tag, String name, String level, String desc, int price) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.level = level;
        this.desc = desc;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
