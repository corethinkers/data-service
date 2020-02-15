
package com.data.rest.dto;

import java.util.List;

public class InvoiceJsonDTO {

    public String id;
    public String accountNumber;
    public BillingAddress billingAddress;
    public String billingAnalystCode;
    public String billToDivisionNumber;
    public String billToGroupNumber;
    public String coverageEndDate;
    public String coverageStartDate;
    public String customerType;
    public String dualChoice;
    public String financialCompanyName;
    public String groupName;
    public List<GroupSummary> groupSummary = null;
    public String internalReferenceId;
    public String invoiceCreationDate;
    public String invoiceGenerationDate;
    public String invoiceNumber;
    public String status;
    public String invoiceSubType;
    public String invoiceType;
    public String lastReleaseDate;
    public String lastUpdatedDate;
    public String perMemberPerMonthBilling;
    public String publisherName;
    public String purchaseOrderNumber;
    public String statementTypeIdentifier;
    public String underWritingState;
    
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
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the billingAddress
	 */
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	/**
	 * @return the billingAnalystCode
	 */
	public String getBillingAnalystCode() {
		return billingAnalystCode;
	}
	/**
	 * @param billingAnalystCode the billingAnalystCode to set
	 */
	public void setBillingAnalystCode(String billingAnalystCode) {
		this.billingAnalystCode = billingAnalystCode;
	}
	/**
	 * @return the billToDivisionNumber
	 */
	public String getBillToDivisionNumber() {
		return billToDivisionNumber;
	}
	/**
	 * @param billToDivisionNumber the billToDivisionNumber to set
	 */
	public void setBillToDivisionNumber(String billToDivisionNumber) {
		this.billToDivisionNumber = billToDivisionNumber;
	}
	/**
	 * @return the billToGroupNumber
	 */
	public String getBillToGroupNumber() {
		return billToGroupNumber;
	}
	/**
	 * @param billToGroupNumber the billToGroupNumber to set
	 */
	public void setBillToGroupNumber(String billToGroupNumber) {
		this.billToGroupNumber = billToGroupNumber;
	}
	/**
	 * @return the coverageEndDate
	 */
	public String getCoverageEndDate() {
		return coverageEndDate;
	}
	/**
	 * @param coverageEndDate the coverageEndDate to set
	 */
	public void setCoverageEndDate(String coverageEndDate) {
		this.coverageEndDate = coverageEndDate;
	}
	/**
	 * @return the coverageStartDate
	 */
	public String getCoverageStartDate() {
		return coverageStartDate;
	}
	/**
	 * @param coverageStartDate the coverageStartDate to set
	 */
	public void setCoverageStartDate(String coverageStartDate) {
		this.coverageStartDate = coverageStartDate;
	}
	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}
	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	/**
	 * @return the dualChoice
	 */
	public String getDualChoice() {
		return dualChoice;
	}
	/**
	 * @param dualChoice the dualChoice to set
	 */
	public void setDualChoice(String dualChoice) {
		this.dualChoice = dualChoice;
	}
	/**
	 * @return the financialCompanyName
	 */
	public String getFinancialCompanyName() {
		return financialCompanyName;
	}
	/**
	 * @param financialCompanyName the financialCompanyName to set
	 */
	public void setFinancialCompanyName(String financialCompanyName) {
		this.financialCompanyName = financialCompanyName;
	}
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return the groupSummary
	 */
	public List<GroupSummary> getGroupSummary() {
		return groupSummary;
	}
	/**
	 * @param groupSummary the groupSummary to set
	 */
	public void setGroupSummary(List<GroupSummary> groupSummary) {
		this.groupSummary = groupSummary;
	}
	/**
	 * @return the internalReferenceId
	 */
	public String getInternalReferenceId() {
		return internalReferenceId;
	}
	/**
	 * @param internalReferenceId the internalReferenceId to set
	 */
	public void setInternalReferenceId(String internalReferenceId) {
		this.internalReferenceId = internalReferenceId;
	}
	/**
	 * @return the invoiceCreationDate
	 */
	public String getInvoiceCreationDate() {
		return invoiceCreationDate;
	}
	/**
	 * @param invoiceCreationDate the invoiceCreationDate to set
	 */
	public void setInvoiceCreationDate(String invoiceCreationDate) {
		this.invoiceCreationDate = invoiceCreationDate;
	}
	/**
	 * @return the invoiceGenerationDate
	 */
	public String getInvoiceGenerationDate() {
		return invoiceGenerationDate;
	}
	/**
	 * @param invoiceGenerationDate the invoiceGenerationDate to set
	 */
	public void setInvoiceGenerationDate(String invoiceGenerationDate) {
		this.invoiceGenerationDate = invoiceGenerationDate;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the invoiceSubType
	 */
	public String getInvoiceSubType() {
		return invoiceSubType;
	}
	/**
	 * @param invoiceSubType the invoiceSubType to set
	 */
	public void setInvoiceSubType(String invoiceSubType) {
		this.invoiceSubType = invoiceSubType;
	}
	/**
	 * @return the invoiceType
	 */
	public String getInvoiceType() {
		return invoiceType;
	}
	/**
	 * @param invoiceType the invoiceType to set
	 */
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	/**
	 * @return the lastReleaseDate
	 */
	public String getLastReleaseDate() {
		return lastReleaseDate;
	}
	/**
	 * @param lastReleaseDate the lastReleaseDate to set
	 */
	public void setLastReleaseDate(String lastReleaseDate) {
		this.lastReleaseDate = lastReleaseDate;
	}
	/**
	 * @return the lastUpdatedDate
	 */
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/**
	 * @return the perMemberPerMonthBilling
	 */
	public String getPerMemberPerMonthBilling() {
		return perMemberPerMonthBilling;
	}
	/**
	 * @param perMemberPerMonthBilling the perMemberPerMonthBilling to set
	 */
	public void setPerMemberPerMonthBilling(String perMemberPerMonthBilling) {
		this.perMemberPerMonthBilling = perMemberPerMonthBilling;
	}
	/**
	 * @return the publisherName
	 */
	public String getPublisherName() {
		return publisherName;
	}
	/**
	 * @param publisherName the publisherName to set
	 */
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	/**
	 * @return the purchaseOrderNumber
	 */
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	/**
	 * @param purchaseOrderNumber the purchaseOrderNumber to set
	 */
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	/**
	 * @return the statementTypeIdentifier
	 */
	public String getStatementTypeIdentifier() {
		return statementTypeIdentifier;
	}
	/**
	 * @param statementTypeIdentifier the statementTypeIdentifier to set
	 */
	public void setStatementTypeIdentifier(String statementTypeIdentifier) {
		this.statementTypeIdentifier = statementTypeIdentifier;
	}
	/**
	 * @return the underWritingState
	 */
	public String getUnderWritingState() {
		return underWritingState;
	}
	/**
	 * @param underWritingState the underWritingState to set
	 */
	public void setUnderWritingState(String underWritingState) {
		this.underWritingState = underWritingState;
	}

}
