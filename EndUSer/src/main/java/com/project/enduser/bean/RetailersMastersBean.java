package com.project.enduser.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.enduser.constants.DBconstants;

@Entity
@Table(name = "retailers_master", schema = DBconstants.PUBLIC_SCHEMA)
public class RetailersMastersBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "retailers_master_id")
	private Integer serialNumber;
	@Column(name = "retailers_master_name")
	private String retailersMasterName;
	@Column(name = "retailers_master_password")
	private String retailersMasterPassword;
	@Column(name = "retailers_master_description")
	private String retailersMasterDescription;
	@Column(name = "retailers_master_sta")
	private Character status;
	@Column(name = "retailers_master_created_by")
	private String createdBy;
	@Column(name = "retailers_master_created_on")
	private Date createdOn;
	@Column(name = "retailers_master_created_time")
	private String createdTime;
	@Column(name = "retailers_master_updated_by")
	private String updatedBy;
	@Column(name = "retailers_master_updated_on")
	private Date updatedDate;
	@Column(name = "retailers_master_updated_time")
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
	 * @return the retailersMasterName
	 */
	public String getRetailersMasterName() {
		return retailersMasterName;
	}
	/**
	 * @param retailersMasterName the retailersMasterName to set
	 */
	public void setRetailersMasterName(String retailersMasterName) {
		this.retailersMasterName = retailersMasterName;
	}
	/**
	 * @return the retailersMasterPassword
	 */
	public String getRetailersMasterPassword() {
		return retailersMasterPassword;
	}
	/**
	 * @param retailersMasterPassword the retailersMasterPassword to set
	 */
	public void setRetailersMasterPassword(String retailersMasterPassword) {
		this.retailersMasterPassword = retailersMasterPassword;
	}
	/**
	 * @return the retailersMasterDescription
	 */
	public String getRetailersMasterDescription() {
		return retailersMasterDescription;
	}
	/**
	 * @param retailersMasterDescription the retailersMasterDescription to set
	 */
	public void setRetailersMasterDescription(String retailersMasterDescription) {
		this.retailersMasterDescription = retailersMasterDescription;
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
