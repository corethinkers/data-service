/**
 * 
 */
package com.data.rest.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ArunJSR
 *
 */
@Entity
@Table(name = "invoice")
public class InvoiceInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name = "invoiceNumber")
	private String invoiceNumber;
	@Column(name = "invoiceJson")
	private String invoiceJson;
	@Column(name = "invoiceStatus")
	private String invoiceStatus;
	@Column(name = "invoiceCreatedDate")
	private String invoiceCreatedDate;
	@Column(name = "invoiceUpdatedDate")
	private String invoiceUpdatedDate;
	@Column(name = "lastUpdatedBy")
	private String lastUpdatedBy;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the invoiceJson
	 */
	public String getInvoiceJson() {
		return invoiceJson;
	}
	/**
	 * @param invoiceJson the invoiceJson to set
	 */
	public void setInvoiceJson(String invoiceJson) {
		this.invoiceJson = invoiceJson;
	}
	/**
	 * @return the invoiceStatus
	 */
	public String getInvoiceStatus() {
		return invoiceStatus;
	}
	/**
	 * @param invoiceStatus the invoiceStatus to set
	 */
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	/**
	 * @return the invoiceCreatedDate
	 */
	public String getInvoiceCreatedDate() {
		return invoiceCreatedDate;
	}
	/**
	 * @param invoiceCreatedDate the invoiceCreatedDate to set
	 */
	public void setInvoiceCreatedDate(String invoiceCreatedDate) {
		this.invoiceCreatedDate = invoiceCreatedDate;
	}
	/**
	 * @return the invoiceUpdatedDate
	 */
	public String getInvoiceUpdatedDate() {
		return invoiceUpdatedDate;
	}
	/**
	 * @param invoiceUpdatedDate the invoiceUpdatedDate to set
	 */
	public void setInvoiceUpdatedDate(String invoiceUpdatedDate) {
		this.invoiceUpdatedDate = invoiceUpdatedDate;
	}
	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
}
