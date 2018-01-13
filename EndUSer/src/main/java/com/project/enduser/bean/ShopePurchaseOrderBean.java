package com.project.enduser.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.enduser.constants.DBconstants;

@Entity
@Table(name = "shop_purchase_orders", schema = DBconstants.PUBLIC_SCHEMA)
public class ShopePurchaseOrderBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shop_purchase_orders_id")
	private Integer serialNumber;
	@Column(name = "shop_purchase_orders_shoppyid")
	private Integer shoppyId;
	@Column(name = "shop_purchase_orders_retailerid")
	private Integer retailerId;
	@Column(name = "shop_purchase_orders_shop_totalprice")
	private BigDecimal shopeTotalPrice;
	@Column(name = "shop_purchase_orders_retailer_totalprice")
	private BigDecimal retailerTotalPrice;
	@Column(name = "shop_purchase_orders_expecteddate")
	private String exceptedDate;
	@Column(name = "shop_purchase_orders_remarks")
	private String remarks;
	@Column(name = "shop_purchase_orders_sta")
	private Character status;
	@Column(name = "shop_purchase_orders_amt_sta")
	private Character amountStatus;
	@Column(name = "shop_purchase_orders_shop_created_by")
	private String shopeCreatedBy;
	@Column(name = "shop_purchase_orders_shop_created_on")
	private Date shopeCreatedOn;
	@Column(name = "shop_purchase_orders_shop_created_time")
	private String shopeCreatedTime;
	@Column(name = "shop_purchase_orders_retailer_created_by")
	private String retailerCreatedBy;
	@Column(name = "shop_purchase_orders_retailer_created_on")
	private Date retailerCreatedOn;
	@Column(name = "shop_purchase_orders_retailer_created_time")
	private String retailer;
	@Column(name = "shop_purchase_orders_updated_by")
	private String updatedBy;
	@Column(name = "shop_purchase_orders_updated_on")
	private Date updatedDate;
	@Column(name = "shop_purchase_orders_updated_time")
	private String updatedTime;
	/**
	 * @return the serialNumber
	 */
	public Integer getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the shoppyId
	 */
	public Integer getShoppyId() {
		return shoppyId;
	}
	/**
	 * @param shoppyId the shoppyId to set
	 */
	public void setShoppyId(Integer shoppyId) {
		this.shoppyId = shoppyId;
	}
	/**
	 * @return the retailerId
	 */
	public Integer getRetailerId() {
		return retailerId;
	}
	/**
	 * @param retailerId the retailerId to set
	 */
	public void setRetailerId(Integer retailerId) {
		this.retailerId = retailerId;
	}
	/**
	 * @return the shopeTotalPrice
	 */
	public BigDecimal getShopeTotalPrice() {
		return shopeTotalPrice;
	}
	/**
	 * @param shopeTotalPrice the shopeTotalPrice to set
	 */
	public void setShopeTotalPrice(BigDecimal shopeTotalPrice) {
		this.shopeTotalPrice = shopeTotalPrice;
	}
	/**
	 * @return the retailerTotalPrice
	 */
	public BigDecimal getRetailerTotalPrice() {
		return retailerTotalPrice;
	}
	/**
	 * @param retailerTotalPrice the retailerTotalPrice to set
	 */
	public void setRetailerTotalPrice(BigDecimal retailerTotalPrice) {
		this.retailerTotalPrice = retailerTotalPrice;
	}
	/**
	 * @return the exceptedDate
	 */
	public String getExceptedDate() {
		return exceptedDate;
	}
	/**
	 * @param exceptedDate the exceptedDate to set
	 */
	public void setExceptedDate(String exceptedDate) {
		this.exceptedDate = exceptedDate;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the status
	 */
	public Character getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Character status) {
		this.status = status;
	}
	/**
	 * @return the amountStatus
	 */
	public Character getAmountStatus() {
		return amountStatus;
	}
	/**
	 * @param amountStatus the amountStatus to set
	 */
	public void setAmountStatus(Character amountStatus) {
		this.amountStatus = amountStatus;
	}
	/**
	 * @return the shopeCreatedBy
	 */
	public String getShopeCreatedBy() {
		return shopeCreatedBy;
	}
	/**
	 * @param shopeCreatedBy the shopeCreatedBy to set
	 */
	public void setShopeCreatedBy(String shopeCreatedBy) {
		this.shopeCreatedBy = shopeCreatedBy;
	}
	/**
	 * @return the shopeCreatedOn
	 */
	public Date getShopeCreatedOn() {
		return shopeCreatedOn;
	}
	/**
	 * @param shopeCreatedOn the shopeCreatedOn to set
	 */
	public void setShopeCreatedOn(Date shopeCreatedOn) {
		this.shopeCreatedOn = shopeCreatedOn;
	}
	/**
	 * @return the shopeCreatedTime
	 */
	public String getShopeCreatedTime() {
		return shopeCreatedTime;
	}
	/**
	 * @param shopeCreatedTime the shopeCreatedTime to set
	 */
	public void setShopeCreatedTime(String shopeCreatedTime) {
		this.shopeCreatedTime = shopeCreatedTime;
	}
	/**
	 * @return the retailerCreatedBy
	 */
	public String getRetailerCreatedBy() {
		return retailerCreatedBy;
	}
	/**
	 * @param retailerCreatedBy the retailerCreatedBy to set
	 */
	public void setRetailerCreatedBy(String retailerCreatedBy) {
		this.retailerCreatedBy = retailerCreatedBy;
	}
	/**
	 * @return the retailerCreatedOn
	 */
	public Date getRetailerCreatedOn() {
		return retailerCreatedOn;
	}
	/**
	 * @param retailerCreatedOn the retailerCreatedOn to set
	 */
	public void setRetailerCreatedOn(Date retailerCreatedOn) {
		this.retailerCreatedOn = retailerCreatedOn;
	}
	/**
	 * @return the retailer
	 */
	public String getRetailer() {
		return retailer;
	}
	/**
	 * @param retailer the retailer to set
	 */
	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @return the updatedTime
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}
	/**
	 * @param updatedTime the updatedTime to set
	 */
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	
}
