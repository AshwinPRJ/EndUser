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
@Table(name = "customer_details", schema = DBconstants.PUBLIC_SCHEMA)
public class CustomerDetailsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "customer_details_id")
	private Integer id;
	@Column(name = "customer_details_name")
	private String customerName;
	@Column(name = "customer_details_password")
	private String password;
	@Column(name = "customer_details_shop_name")
	private String shopeName;
	@Column(name = "customer_details_place")
	private String place;
	@Column(name = "customer_details_city")
	private String city;
	@Column(name = "customer_details_wallet_amount")
	private BigDecimal walletAmount;
	@Column(name = "customer_details_foodItems")
	private BigDecimal foodItems;
	@Column(name = "customer_details_nonfoodItems")
	private BigDecimal nonFoodItems;
	@Column(name = "customer_details_since")
	private Date since;
	@Column(name = "customer_details_last_recharge")
	private Date lastRecharge;
	@Column(name = "customer_details_last_debited")
	private Date lastDebited;
	@Column(name = "customer_details_wallet_amount_left")
	private BigDecimal walletAmountLeft;
	@Column(name = "customer_details_wallet_amount_debited_till_date")
	private BigDecimal walletAmountDebitedTillDate;
	@Column(name = "customer_details_sta")
	private Character status;
	@Column(name = "customer_details_pswd_reset")
	private Character passwordReset;
	@Column(name = "customer_details_items_percent_change")
	private Character itermPercentChange;
	@Column(name = "customer_details_product_change")
	private Character productChange;
	@Column(name = "customer_details_created_by")
	private String createdBy;
	@Column(name = "customer_details_created_on")
	private Date createdOn;
	@Column(name = "customer_details_created_time")
	private String createdTime;
	@Column(name = "customer_details_updated_by")
	private String updatedBy;
	@Column(name = "customer_details_updated_on")
	private Date updatedDate;
	@Column(name = "customer_details_updated_time")
	private String updatedTime;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the shopeName
	 */
	public String getShopeName() {
		return shopeName;
	}
	/**
	 * @param shopeName the shopeName to set
	 */
	public void setShopeName(String shopeName) {
		this.shopeName = shopeName;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the walletAmount
	 */
	public BigDecimal getWalletAmount() {
		return walletAmount;
	}
	/**
	 * @param walletAmount the walletAmount to set
	 */
	public void setWalletAmount(BigDecimal walletAmount) {
		this.walletAmount = walletAmount;
	}
	/**
	 * @return the foodItems
	 */
	public BigDecimal getFoodItems() {
		return foodItems;
	}
	/**
	 * @param foodItems the foodItems to set
	 */
	public void setFoodItems(BigDecimal foodItems) {
		this.foodItems = foodItems;
	}
	/**
	 * @return the nonFoodItems
	 */
	public BigDecimal getNonFoodItems() {
		return nonFoodItems;
	}
	/**
	 * @param nonFoodItems the nonFoodItems to set
	 */
	public void setNonFoodItems(BigDecimal nonFoodItems) {
		this.nonFoodItems = nonFoodItems;
	}
	/**
	 * @return the since
	 */
	public Date getSince() {
		return since;
	}
	/**
	 * @param since the since to set
	 */
	public void setSince(Date since) {
		this.since = since;
	}
	/**
	 * @return the lastRecharge
	 */
	public Date getLastRecharge() {
		return lastRecharge;
	}
	/**
	 * @param lastRecharge the lastRecharge to set
	 */
	public void setLastRecharge(Date lastRecharge) {
		this.lastRecharge = lastRecharge;
	}
	/**
	 * @return the lastDebited
	 */
	public Date getLastDebited() {
		return lastDebited;
	}
	/**
	 * @param lastDebited the lastDebited to set
	 */
	public void setLastDebited(Date lastDebited) {
		this.lastDebited = lastDebited;
	}
	/**
	 * @return the walletAmountLeft
	 */
	public BigDecimal getWalletAmountLeft() {
		return walletAmountLeft;
	}
	/**
	 * @param walletAmountLeft the walletAmountLeft to set
	 */
	public void setWalletAmountLeft(BigDecimal walletAmountLeft) {
		this.walletAmountLeft = walletAmountLeft;
	}
	/**
	 * @return the walletAmountDebitedTillDate
	 */
	public BigDecimal getWalletAmountDebitedTillDate() {
		return walletAmountDebitedTillDate;
	}
	/**
	 * @param walletAmountDebitedTillDate the walletAmountDebitedTillDate to set
	 */
	public void setWalletAmountDebitedTillDate(BigDecimal walletAmountDebitedTillDate) {
		this.walletAmountDebitedTillDate = walletAmountDebitedTillDate;
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
	 * @return the passwordReset
	 */
	public Character getPasswordReset() {
		return passwordReset;
	}
	/**
	 * @param passwordReset the passwordReset to set
	 */
	public void setPasswordReset(Character passwordReset) {
		this.passwordReset = passwordReset;
	}
	/**
	 * @return the itermPercentChange
	 */
	public Character getItermPercentChange() {
		return itermPercentChange;
	}
	/**
	 * @param itermPercentChange the itermPercentChange to set
	 */
	public void setItermPercentChange(Character itermPercentChange) {
		this.itermPercentChange = itermPercentChange;
	}
	/**
	 * @return the productChange
	 */
	public Character getProductChange() {
		return productChange;
	}
	/**
	 * @param productChange the productChange to set
	 */
	public void setProductChange(Character productChange) {
		this.productChange = productChange;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the createdTime
	 */
	public String getCreatedTime() {
		return createdTime;
	}
	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
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
