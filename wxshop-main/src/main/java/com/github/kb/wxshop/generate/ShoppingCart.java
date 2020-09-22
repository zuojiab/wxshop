package com.github.kb.wxshop.generate;

import java.io.Serializable;
import java.util.Date;

public class ShoppingCart implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.USER_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.GOODS_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.SHOP_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Long shopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.NUMBER
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.STATUS
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.CREATED_AT
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SHOPPING_CART.UPDATED_AT
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SHOPPING_CART
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.ID
     *
     * @return the value of SHOPPING_CART.ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.ID
     *
     * @param id the value for SHOPPING_CART.ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.USER_ID
     *
     * @return the value of SHOPPING_CART.USER_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.USER_ID
     *
     * @param userId the value for SHOPPING_CART.USER_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.GOODS_ID
     *
     * @return the value of SHOPPING_CART.GOODS_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.GOODS_ID
     *
     * @param goodsId the value for SHOPPING_CART.GOODS_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.SHOP_ID
     *
     * @return the value of SHOPPING_CART.SHOP_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.SHOP_ID
     *
     * @param shopId the value for SHOPPING_CART.SHOP_ID
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.NUMBER
     *
     * @return the value of SHOPPING_CART.NUMBER
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.NUMBER
     *
     * @param number the value for SHOPPING_CART.NUMBER
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.STATUS
     *
     * @return the value of SHOPPING_CART.STATUS
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.STATUS
     *
     * @param status the value for SHOPPING_CART.STATUS
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.CREATED_AT
     *
     * @return the value of SHOPPING_CART.CREATED_AT
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.CREATED_AT
     *
     * @param createdAt the value for SHOPPING_CART.CREATED_AT
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SHOPPING_CART.UPDATED_AT
     *
     * @return the value of SHOPPING_CART.UPDATED_AT
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SHOPPING_CART.UPDATED_AT
     *
     * @param updatedAt the value for SHOPPING_CART.UPDATED_AT
     *
     * @mbg.generated Tue Sep 22 22:14:21 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}