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
@Table(name = "user_transactions", schema = DBconstants.PUBLIC_SCHEMA)
public class UserTranscationsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_transactions_id")
	private Integer id;
	@Column(name = "user_transactions_grahakid")
	private Integer grahakId;
	@Column(name = "user_transactions_user_number")
	private String usernumber;
	@Column(name = "user_transactions_food_purchased")
	private BigDecimal foodPurchased;
	@Column(name = "user_transactions_nonfood_purchased")
	private BigDecimal nonFoodPurchased;
	@Column(name = "user_transactions_total_amount_purchased")
	private BigDecimal totalAmountPurchased;
	@Column(name = "user_transactions_earned_points")
	private Integer earnedPoints;
	@Column(name = "user_transactions_created_by")
	private String createdBy;
	@Column(name = "user_transactions_created_on")
	private Date createdOn;
	@Column(name = "user_transactions_created_time")
	private String createdTime;
	@Column(name = "user_transactions_updated_by")
	private String updatedBy;
	@Column(name = "user_transactions_updated_on")
	private Date updatedDate;
	@Column(name = "user_transactions_updated_time")
	private Date updatedTime;
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
	 * @return the grahakId
	 */
	public Integer getGrahakId() {
		return grahakId;
	}
	/**
	 * @param grahakId the grahakId to set
	 */
	public void setGrahakId(Integer grahakId) {
		this.grahakId = grahakId;
	}
	/**
	 * @return the usernumber
	 */
	public String getUsernumber() {
		return usernumber;
	}
	/**
	 * @param usernumber the usernumber to set
	 */
	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}
	/**
	 * @return the foodPurchased
	 */
	public BigDecimal getFoodPurchased() {
		return foodPurchased;
	}
	/**
	 * @param foodPurchased the foodPurchased to set
	 */
	public void setFoodPurchased(BigDecimal foodPurchased) {
		this.foodPurchased = foodPurchased;
	}
	/**
	 * @return the nonFoodPurchased
	 */
	public BigDecimal getNonFoodPurchased() {
		return nonFoodPurchased;
	}
	/**
	 * @param nonFoodPurchased the nonFoodPurchased to set
	 */
	public void setNonFoodPurchased(BigDecimal nonFoodPurchased) {
		this.nonFoodPurchased = nonFoodPurchased;
	}
	/**
	 * @return the totalAmountPurchased
	 */
	public BigDecimal getTotalAmountPurchased() {
		return totalAmountPurchased;
	}
	/**
	 * @param totalAmountPurchased the totalAmountPurchased to set
	 */
	public void setTotalAmountPurchased(BigDecimal totalAmountPurchased) {
		this.totalAmountPurchased = totalAmountPurchased;
	}
	/**
	 * @return the earnedPoints
	 */
	public Integer getEarnedPoints() {
		return earnedPoints;
	}
	/**
	 * @param earnedPoints the earnedPoints to set
	 */
	public void setEarnedPoints(Integer earnedPoints) {
		this.earnedPoints = earnedPoints;
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
	public Date getUpdatedTime() {
		return updatedTime;
	}
	/**
	 * @param updatedTime the updatedTime to set
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
}
