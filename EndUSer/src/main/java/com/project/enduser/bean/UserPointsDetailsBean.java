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
@Table(name = "user_points_details", schema = DBconstants.PUBLIC_SCHEMA)
public class UserPointsDetailsBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_points_id")
	private Integer id;
	@Column(name = "user_points_grahakid")
	private String grahakId;
	@Column(name = "user_points_user_points")
	private Integer userPoint;
	@Column(name = "user_points_created_by")
	private String createdBy;
	@Column(name = "user_points_created_on")
	private Date createdOn;
	@Column(name = "user_points_created_time")
	private String createdTime;
	@Column(name = "user_points_update_by")
	private String updatedBy;
	@Column(name = "user_points_updated_on")
	private Date updatedDate;
	@Column(name = "user_points_update_time")
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
	 * @return the userPoint
	 */
	public Integer getUserPoint() {
		return userPoint;
	}
	/**
	 * @param userPoint the userPoint to set
	 */
	public void setUserPoint(Integer userPoint) {
		this.userPoint = userPoint;
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
