/**
 * 
 */
package com.data.rest.db.entity;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author ArunJSR
 *
 */
public class InvoiceInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String invoiceNumber;
	private String invoiceJson;
	private String invoiceStatus;
	private String invoiceCreatedDate;
	private String invoiceUpdatedDate;
	private String lastUpdatedBy;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
