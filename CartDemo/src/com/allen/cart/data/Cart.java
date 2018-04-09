package com.allen.cart.data;


/**
 *
 * 购物车类
 *
 */

public class Cart {

    /**
     * 购物车ID
     */
    private long cartID;
    /**
     *购物车中商品ID
     */
    private long productID;
    /**
     * 购物车中商品名称
     */
    private String productName;
    /**
     * 购物车中商品单价
     */
    private int productPrice;
    /**
     * 购物车中商品数量
     */
    private int productCount;
    /**
     * 购物车中商品总价
     */
    private int totalPrice;

    public Cart() {}

    public Cart(long cartID, long productID, String productName, int productPrice, int productCount) {
        this.cartID = cartID;
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
        this.totalPrice = productPrice*productCount;
    }

    public void incrProdcut() {
        productCount++;
        totalPrice = productCount*productPrice;
    }

    public boolean decrProduct() {
        if (productCount<=0) {
            return false;
        } else {
            productCount--;
            totalPrice=productCount*productPrice;
            return true;
        }
    }

    public long getCartID() {
        return cartID;
    }

    public void setCartID(long cartID) {
        this.cartID = cartID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalCount) {
        this.totalPrice = totalCount;
    }


}
