
package com.data.rest.dto;

import java.util.List;

public class GroupSummary {

    public String adjustmentAmount;
    public String amount;
    public String billedAmount;
    public String descriptionOfCharges;
    public String feeBasis;
    public String groupNumber;
    public String numberOfClaimsPaid;
    public String numberOfEnrollees;
    public String totalAmount;
    public String unBilledAmount;
    public List<CoverageOption> coverageOptions = null;
    public List<DivisionSummary> divisionSummary = null;
	/**
	 * @return the adjustmentAmount
	 */
	public String getAdjustmentAmount() {
		return adjustmentAmount;
	}
	/**
	 * @param adjustmentAmount the adjustmentAmount to set
	 */
	public void setAdjustmentAmount(String adjustmentAmount) {
		this.adjustmentAmount = adjustmentAmount;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the billedAmount
	 */
	public String getBilledAmount() {
		return billedAmount;
	}
	/**
	 * @param billedAmount the billedAmount to set
	 */
	public void setBilledAmount(String billedAmount) {
		this.billedAmount = billedAmount;
	}
	/**
	 * @return the descriptionOfCharges
	 */
	public String getDescriptionOfCharges() {
		return descriptionOfCharges;
	}
	/**
	 * @param descriptionOfCharges the descriptionOfCharges to set
	 */
	public void setDescriptionOfCharges(String descriptionOfCharges) {
		this.descriptionOfCharges = descriptionOfCharges;
	}
	/**
	 * @return the feeBasis
	 */
	public String getFeeBasis() {
		return feeBasis;
	}
	/**
	 * @param feeBasis the feeBasis to set
	 */
	public void setFeeBasis(String feeBasis) {
		this.feeBasis = feeBasis;
	}
	/**
	 * @return the groupNumber
	 */
	public String getGroupNumber() {
		return groupNumber;
	}
	/**
	 * @param groupNumber the groupNumber to set
	 */
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}
	/**
	 * @return the numberOfClaimsPaid
	 */
	public String getNumberOfClaimsPaid() {
		return numberOfClaimsPaid;
	}
	/**
	 * @param numberOfClaimsPaid the numberOfClaimsPaid to set
	 */
	public void setNumberOfClaimsPaid(String numberOfClaimsPaid) {
		this.numberOfClaimsPaid = numberOfClaimsPaid;
	}
	/**
	 * @return the numberOfEnrollees
	 */
	public String getNumberOfEnrollees() {
		return numberOfEnrollees;
	}
	/**
	 * @param numberOfEnrollees the numberOfEnrollees to set
	 */
	public void setNumberOfEnrollees(String numberOfEnrollees) {
		this.numberOfEnrollees = numberOfEnrollees;
	}
	/**
	 * @return the totalAmount
	 */
	public String getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the unBilledAmount
	 */
	public String getUnBilledAmount() {
		return unBilledAmount;
	}
	/**
	 * @param unBilledAmount the unBilledAmount to set
	 */
	public void setUnBilledAmount(String unBilledAmount) {
		this.unBilledAmount = unBilledAmount;
	}
	/**
	 * @return the coverageOptions
	 */
	public List<CoverageOption> getCoverageOptions() {
		return coverageOptions;
	}
	/**
	 * @param coverageOptions the coverageOptions to set
	 */
	public void setCoverageOptions(List<CoverageOption> coverageOptions) {
		this.coverageOptions = coverageOptions;
	}
	/**
	 * @return the divisionSummary
	 */
	public List<DivisionSummary> getDivisionSummary() {
		return divisionSummary;
	}
	/**
	 * @param divisionSummary the divisionSummary to set
	 */
	public void setDivisionSummary(List<DivisionSummary> divisionSummary) {
		this.divisionSummary = divisionSummary;
	}
}
