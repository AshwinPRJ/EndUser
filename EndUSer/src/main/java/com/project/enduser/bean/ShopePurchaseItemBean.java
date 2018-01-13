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
@Table(name = "shop_purchase_items", schema = DBconstants.PUBLIC_SCHEMA)
public class ShopePurchaseItemBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shop_purchase_orders_id")
	private Integer id;
	@Column(name = "shop_purchase_orders_itemsid")
	private Integer itemsId;
	@Column(name = "shop_purchase_orders_itemsquantity")
	private Integer itemsQueantity;
	@Column(name = "shop_purchase_orders_shop_itemsprice")
	private BigDecimal itemPrice;
	@Column(name = "shop_purchase_orders_retailer_itemsprice")
	private BigDecimal retailerItemPrice;
	@Column(name = "shop_purchase_orders_quantity_received")
	private Integer quatntityReceived;
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
	 * @return the itemsId
	 */
	public Integer getItemsId() {
		return itemsId;
	}
	/**
	 * @param itemsId the itemsId to set
	 */
	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}
	/**
	 * @return the itemsQueantity
	 */
	public Integer getItemsQueantity() {
		return itemsQueantity;
	}
	/**
	 * @param itemsQueantity the itemsQueantity to set
	 */
	public void setItemsQueantity(Integer itemsQueantity) {
		this.itemsQueantity = itemsQueantity;
	}
	/**
	 * @return the itemPrice
	 */
	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	/**
	 * @return the retailerItemPrice
	 */
	public BigDecimal getRetailerItemPrice() {
		return retailerItemPrice;
	}
	/**
	 * @param retailerItemPrice the retailerItemPrice to set
	 */
	public void setRetailerItemPrice(BigDecimal retailerItemPrice) {
		this.retailerItemPrice = retailerItemPrice;
	}
	/**
	 * @return the quatntityReceived
	 */
	public Integer getQuatntityReceived() {
		return quatntityReceived;
	}
	/**
	 * @param quatntityReceived the quatntityReceived to set
	 */
	public void setQuatntityReceived(Integer quatntityReceived) {
		this.quatntityReceived = quatntityReceived;
	}

}
