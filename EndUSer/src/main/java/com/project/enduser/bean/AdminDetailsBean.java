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
@Table(name = "admin_details", schema = DBconstants.PUBLIC_SCHEMA)
public class AdminDetailsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_details_id")
	private Integer id;
	@Column(name = "admin_details_userid")
	private String adminId;
	@Column(name = "admin_details_password")
	private String password;
	@Column(name = "admin_details_birth_place")
	private String birthPlace;
	@Column(name = "admin_details_birth_city")
	private String birthCity;
	@Column(name = "admin_details_dob")
	private Date dataOfBirth;
	@Column(name = "admin_details_sta")
	private Character status;
	@Column(name = "admin_details_created_by")
	private String createdBy;
	@Column(name = "admin_details_created_on")
	private Date createdDate;
	@Column(name = "admin_details_created_time")
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
	 * @return the adminId
	 */
	public String getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId
	 *            the adminId to set
	 */
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the birthPlace
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * @param birthPlace
	 *            the birthPlace to set
	 */
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	/**
	 * @return the birthCity
	 */
	public String getBirthCity() {
		return birthCity;
	}

	/**
	 * @param birthCity
	 *            the birthCity to set
	 */
	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	/**
	 * @return the dataOfBirth
	 */
	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	/**
	 * @param dataOfBirth
	 *            the dataOfBirth to set
	 */
	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	/**
	 * @return the status
	 */
	public Character getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
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
	 * @param createdBy
	 *            the createdBy to set
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
	 * @param createdDate
	 *            the createdDate to set
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
	 * @param createdTime
	 *            the createdTime to set
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

}
