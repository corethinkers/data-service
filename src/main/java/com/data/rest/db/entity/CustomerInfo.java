package com.data.rest.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author
 */
@Entity
@Table(name = "customerinfo")
public class CustomerInfo {

	@Id
	private long _id;
	
	@Column(name = "customer_json")
	private String customerInfo;

	/**
	 * @return the _id
	 */
	public long get_id() {
		return _id;
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(long _id) {
		this._id = _id;
	}

	/**
	 * @return the customerInfo
	 */
	public String getCustomerInfo() {
		return customerInfo;
	}

	/**
	 * @param customerInfo the customerInfo to set
	 */
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}
}
