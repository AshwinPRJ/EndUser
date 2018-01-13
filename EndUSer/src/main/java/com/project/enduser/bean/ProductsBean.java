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
@Table(name = "products", schema = DBconstants.PUBLIC_SCHEMA)
public class ProductsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "products_slno")
	private Integer serialNumber;
	@Column(name = "products_name")
	private String productName;
	@Column(name = "products_mrp")
	private BigDecimal productMRP;
	@Column(name = "products_gpprice")
	private BigDecimal productGPPrice;
	@Column(name = "products_points")
	private BigDecimal productpoints;
	@Column(name = "products_sta")
	private Character status;
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
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productMRP
	 */
	public BigDecimal getProductMRP() {
		return productMRP;
	}
	/**
	 * @param productMRP the productMRP to set
	 */
	public void setProductMRP(BigDecimal productMRP) {
		this.productMRP = productMRP;
	}
	/**
	 * @return the productGPPrice
	 */
	public BigDecimal getProductGPPrice() {
		return productGPPrice;
	}
	/**
	 * @param productGPPrice the productGPPrice to set
	 */
	public void setProductGPPrice(BigDecimal productGPPrice) {
		this.productGPPrice = productGPPrice;
	}
	/**
	 * @return the productpoints
	 */
	public BigDecimal getProductpoints() {
		return productpoints;
	}
	/**
	 * @param productpoints the productpoints to set
	 */
	public void setProductpoints(BigDecimal productpoints) {
		this.productpoints = productpoints;
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

}
