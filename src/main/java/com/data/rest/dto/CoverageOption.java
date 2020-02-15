
package com.data.rest.dto;

public class CoverageOption {

    public String amount;
    public String coverageOptionCode;
    public String numberOfEnrollees;
    public String rate;
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
	 * @return the coverageOptionCode
	 */
	public String getCoverageOptionCode() {
		return coverageOptionCode;
	}
	/**
	 * @param coverageOptionCode the coverageOptionCode to set
	 */
	public void setCoverageOptionCode(String coverageOptionCode) {
		this.coverageOptionCode = coverageOptionCode;
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
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
    
}
