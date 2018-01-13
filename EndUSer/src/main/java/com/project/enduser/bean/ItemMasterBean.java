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
@Table(name = "items_master", schema = DBconstants.PUBLIC_SCHEMA)
public class ItemMasterBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "items_master_id")
	private Integer itemMasterId;
	@Column(name = "items_master_name")
	private String itemMasterName;
	@Column(name = "items_master_retailmrp")
	private BigDecimal itemMasterRetailMRP;
	@Column(name = "items_master_warehousemrp")
	private BigDecimal itemMasterWareHouseMRP;
	@Column(name = "items_master_sta")
	private Character status;
	@Column(name = "items_master_created_by")
	private String createdBy;
	@Column(name = "items_master_created_on")
	private Date createdOn;
	@Column(name = "items_master_created_time")
	private String createdTime;
	@Column(name = "items_master_updated_by")
	private String updatedBy;
	@Column(name = "items_master_updated_on")
	private Date updatedDate;
	@Column(name = "items_master_updated_time")
	private String updatedTime;
	/**
	 * @return the itemMasterId
	 */
	public Integer getItemMasterId() {
		return itemMasterId;
	}
	/**
	 * @param itemMasterId the itemMasterId to set
	 */
	public void setItemMasterId(Integer itemMasterId) {
		this.itemMasterId = itemMasterId;
	}
	/**
	 * @return the itemMasterName
	 */
	public String getItemMasterName() {
		return itemMasterName;
	}
	/**
	 * @param itemMasterName the itemMasterName to set
	 */
	public void setItemMasterName(String itemMasterName) {
		this.itemMasterName = itemMasterName;
	}
	/**
	 * @return the itemMasterRetailMRP
	 */
	public BigDecimal getItemMasterRetailMRP() {
		return itemMasterRetailMRP;
	}
	/**
	 * @param itemMasterRetailMRP the itemMasterRetailMRP to set
	 */
	public void setItemMasterRetailMRP(BigDecimal itemMasterRetailMRP) {
		this.itemMasterRetailMRP = itemMasterRetailMRP;
	}
	/**
	 * @return the itemMasterWareHouseMRP
	 */
	public BigDecimal getItemMasterWareHouseMRP() {
		return itemMasterWareHouseMRP;
	}
	/**
	 * @param itemMasterWareHouseMRP the itemMasterWareHouseMRP to set
	 */
	public void setItemMasterWareHouseMRP(BigDecimal itemMasterWareHouseMRP) {
		this.itemMasterWareHouseMRP = itemMasterWareHouseMRP;
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
