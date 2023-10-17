package com.example.springboottest.entity;



import java.util.Date;

public class CreditManagerProduct {

    /**
     * 主键ID,机构id
     */
    private Long id;

    /**
     * 信贷经理用户表ID
     */
    private Long userId;

    /**
     * 一级所属机构id
     */
    private Long firstOrgId;

    /**
     * 二级级所属机构id
     */
    private Long secondOrgId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品类别(1,买房贷款，2,买车贷款，3,装修贷款，4,房产抵押，5,汽车抵押，6,信用贷款，7,企业贷款，8,过桥垫资，9,赎楼贷款)
     */
    private Integer productCategory;

    /**
     * 贷款额度范围（1,50万以内, 2,50-100万，3,100-500万，4,500-1000万，5,1000万以上）
     */
    private Integer dabetQuota;

    /**
     * 年化率范围（1,不高于5%，2,不高于7%，3,不高于9%，4,不高于10%，5,不高于12%）
     */
    private Integer anualRate;

    /**
     * 贷款期限(单位月)，(12个月，18个月，24个月，36个月)
     */
    private Integer dabetMonth;

    /**
     * 产品说明
     */
    private String productDesc;

    /**
     * 是否删除
     */
    private Boolean hasDeleted;

    /**
     * 创建用户
     */
    private Long createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改用户
     */
    private Long modifyUser;

    /**
     * 修改时间
     */
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFirstOrgId() {
        return firstOrgId;
    }

    public void setFirstOrgId(Long firstOrgId) {
        this.firstOrgId = firstOrgId;
    }

    public Long getSecondOrgId() {
        return secondOrgId;
    }

    public void setSecondOrgId(Long secondOrgId) {
        this.secondOrgId = secondOrgId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Integer productCategory) {
        this.productCategory = productCategory;
    }

    public Integer getDabetQuota() {
        return dabetQuota;
    }

    public void setDabetQuota(Integer dabetQuota) {
        this.dabetQuota = dabetQuota;
    }

    public Integer getAnualRate() {
        return anualRate;
    }

    public void setAnualRate(Integer anualRate) {
        this.anualRate = anualRate;
    }

    public Integer getDabetMonth() {
        return dabetMonth;
    }

    public void setDabetMonth(Integer dabetMonth) {
        this.dabetMonth = dabetMonth;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Boolean getHasDeleted() {
        return hasDeleted;
    }

    public void setHasDeleted(Boolean hasDeleted) {
        this.hasDeleted = hasDeleted;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
