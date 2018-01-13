package com.project.enduser.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.project.enduser.constants.DBconstants;

@Entity
@Table(name = "custproducts", schema = DBconstants.PUBLIC_SCHEMA)
public class CustomerProductBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "custproducts_productid")
	private Integer productId;
	@Column(name = "custproducts_custname")
	private String customerProductName;
	@Column(name = "custproducts_sta")
	private Character status;
	@Column(name = "custproducts_quantity")
	private BigDecimal customerProductQuantity;
	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * @return the customerProductName
	 */
	public String getCustomerProductName() {
		return customerProductName;
	}
	/**
	 * @param customerProductName the customerProductName to set
	 */
	public void setCustomerProductName(String customerProductName) {
		this.customerProductName = customerProductName;
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
	 * @return the customerProductQuantity
	 */
	public BigDecimal getCustomerProductQuantity() {
		return customerProductQuantity;
	}
	/**
	 * @param customerProductQuantity the customerProductQuantity to set
	 */
	public void setCustomerProductQuantity(BigDecimal customerProductQuantity) {
		this.customerProductQuantity = customerProductQuantity;
	}
	
}
