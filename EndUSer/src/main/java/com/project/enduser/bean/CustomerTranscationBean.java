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
@Table(name = "cust_transactions", schema = DBconstants.PUBLIC_SCHEMA)
public class CustomerTranscationBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_transactions_id")
	private Integer id;
	@Column(name = "cust_transactions_cust_id")
	private String customerId;
	@Column(name = "cust_transactions_total_amount_purchased")
	private BigDecimal totalTranscationAmountPurchased;
	@Column(name = "cust_transactions_created_by")
	private String createdBy;
	@Column(name = "cust_transactions_created_on")
	private Date createdOn;
	@Column(name = "cust_transactions_created_time")
	private String createdTime;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the totalTranscationAmountPurchased
	 */
	public BigDecimal getTotalTranscationAmountPurchased() {
		return totalTranscationAmountPurchased;
	}

	/**
	 * @param totalTranscationAmountPurchased
	 *            the totalTranscationAmountPurchased to set
	 */
	public void setTotalTranscationAmountPurchased(BigDecimal totalTranscationAmountPurchased) {
		this.totalTranscationAmountPurchased = totalTranscationAmountPurchased;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
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
	 * @param createdOn
	 *            the createdOn to set
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
	 * @param createdTime
	 *            the createdTime to set
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

}
