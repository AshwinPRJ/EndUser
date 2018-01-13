package com.project.enduser.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.enduser.constants.DBconstants;

@Entity
@Table(name = "user_details", schema = DBconstants.PUBLIC_SCHEMA)
public class UserDetailsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_details_id")
	private Integer id;
	@Column(name = "user_details_grahakid")
	private String grahakId;
	@Column(name = "user_details_fullname")
	private String fullName;
	@Column(name = "user_details_mobile")
	private BigInteger mobileNumber;
	@Column(name = "user_details_address")
	private String address;
	@Column(name = "user_details_city")
	private String city;
	@Column(name = "user_details_state")
	private String state;
	@Column(name = "user_details_email")
	private String email;
	@Column(name = "user_details_is_admin")
	private Character isAdmin;
	@Column(name = "user_details_last_visit")
	private Date lastVsit;
	@Column(name = "user_details_last_totamt_purchased")
	private BigDecimal lastTotalAmountPurchased;
	@Column(name = "user_details_earned_points")
	private Integer earnedPoints;
	@Column(name = "user_details_sta")
	private Character status;
	@Column(name = "user_details_created_by")
	private String createdBy;
	@Column(name = "user_details_created_on")
	private Date createdOn;
	@Column(name = "user_details_created_time")
	private String createdTime;
	@Column(name = "user_details_updated_by")
	private String updatedBy;
	@Column(name = "user_details_updated_on")
	private Date updatedDate;
	@Column(name = "user_details_updated_time")
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
	 * @return the grahakId
	 */
	public String getGrahakId() {
		return grahakId;
	}
	/**
	 * @param grahakId the grahakId to set
	 */
	public void setGrahakId(String grahakId) {
		this.grahakId = grahakId;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the mobileNumber
	 */
	public BigInteger getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the isAdmin
	 */
	public Character getIsAdmin() {
		return isAdmin;
	}
	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setIsAdmin(Character isAdmin) {
		this.isAdmin = isAdmin;
	}
	/**
	 * @return the lastVsit
	 */
	public Date getLastVsit() {
		return lastVsit;
	}
	/**
	 * @param lastVsit the lastVsit to set
	 */
	public void setLastVsit(Date lastVsit) {
		this.lastVsit = lastVsit;
	}
	
	/**
	 * @return the lastTotalAmountPurchased
	 */
	public BigDecimal getLastTotalAmountPurchased() {
		return lastTotalAmountPurchased;
	}
	/**
	 * @param lastTotalAmountPurchased the lastTotalAmountPurchased to set
	 */
	public void setLastTotalAmountPurchased(BigDecimal lastTotalAmountPurchased) {
		this.lastTotalAmountPurchased = lastTotalAmountPurchased;
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