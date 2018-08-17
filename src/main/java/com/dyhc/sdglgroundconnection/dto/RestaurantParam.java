package com.dyhc.sdglgroundconnection.dto;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * web -- html 交互参数类
 * 接收页面交互的餐馆参数（wuyongfei）
 **/
public class RestaurantParam {
    private Integer page; // 当前页码
    private Integer limit; // 每页记录数
    private String restaurantName;  // 餐馆名称
    private String restaurantAddress; // 餐馆地址
    private Double minPrice;    // 最低价格
    private Double maxPrice;    // 最高价格
    private Integer mealType; // 饮食类型编号

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMealType() {
        return mealType;
    }

    public void setMealType(Integer mealType) {
        this.mealType = mealType;
    }
}
