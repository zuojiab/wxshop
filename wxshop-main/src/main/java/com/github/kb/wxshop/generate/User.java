package com.github.kb.wxshop.generate;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.ID
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.NAME
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.TEL
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.AVATAR_URL
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.ADDRESS
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.CREATED_AT
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.UPDATED_AT
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.ID
     *
     * @return the value of USER.ID
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.ID
     *
     * @param id the value for USER.ID
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.NAME
     *
     * @return the value of USER.NAME
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.NAME
     *
     * @param name the value for USER.NAME
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.TEL
     *
     * @return the value of USER.TEL
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.TEL
     *
     * @param tel the value for USER.TEL
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.AVATAR_URL
     *
     * @return the value of USER.AVATAR_URL
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.AVATAR_URL
     *
     * @param avatarUrl the value for USER.AVATAR_URL
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.ADDRESS
     *
     * @return the value of USER.ADDRESS
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.ADDRESS
     *
     * @param address the value for USER.ADDRESS
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.CREATED_AT
     *
     * @return the value of USER.CREATED_AT
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.CREATED_AT
     *
     * @param createdAt the value for USER.CREATED_AT
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.UPDATED_AT
     *
     * @return the value of USER.UPDATED_AT
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.UPDATED_AT
     *
     * @param updatedAt the value for USER.UPDATED_AT
     *
     * @mbg.generated Tue Sep 08 23:12:45 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}