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
@Table(name = "warehouse_delivery", schema = DBconstants.PUBLIC_SCHEMA)
public class WareHouseDelivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "warehouse_delivery_id")
	private Integer id;
	@Column(name = "warehouse_delivery_shop_order_id")
	private Integer shopeOrderId;
	@Column(name = "warehouse_delivery_shoppy_id")
	private Integer shoppyId;
	@Column(name = "warehouse_delivery_retailer_id")
	private Integer retailerId;
	@Column(name = "warehouse_delivery_sta")
	private Character status;
	@Column(name = "warehouse_delivery_created_by")
	private String createdBy;
	@Column(name = "warehouse_delivery_created_on")
	private Date createdDate;
	@Column(name = "warehouse_delivery_created_time")
	private String createdTime;
	@Column(name = "warehouse_delivery_updated_by")
	private String updatedBy;
	@Column(name = "warehouse_delivery_updated_on")
	private Date updatedDate;
	@Column(name = "warehouse_delivery_updated_time")
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
	 * @return the shopeOrderId
	 */
	public Integer getShopeOrderId() {
		return shopeOrderId;
	}
	/**
	 * @param shopeOrderId the shopeOrderId to set
	 */
	public void setShopeOrderId(Integer shopeOrderId) {
		this.shopeOrderId = shopeOrderId;
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
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
