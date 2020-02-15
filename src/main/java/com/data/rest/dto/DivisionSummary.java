
package com.data.rest.dto;

import java.util.List;

public class DivisionSummary {

    public String divisionNumber;
    public Integer numberOfEnrollees;
    public List<MemberDetail> memberDetails = null;
    public List<CoverageOption_> coverageOptions = null;
    public Fee fee;
	/**
	 * @return the divisionNumber
	 */
	public String getDivisionNumber() {
		return divisionNumber;
	}
	/**
	 * @param divisionNumber the divisionNumber to set
	 */
	public void setDivisionNumber(String divisionNumber) {
		this.divisionNumber = divisionNumber;
	}
	/**
	 * @return the numberOfEnrollees
	 */
	public Integer getNumberOfEnrollees() {
		return numberOfEnrollees;
	}
	/**
	 * @param numberOfEnrollees the numberOfEnrollees to set
	 */
	public void setNumberOfEnrollees(Integer numberOfEnrollees) {
		this.numberOfEnrollees = numberOfEnrollees;
	}
	/**
	 * @return the memberDetails
	 */
	public List<MemberDetail> getMemberDetails() {
		return memberDetails;
	}
	/**
	 * @param memberDetails the memberDetails to set
	 */
	public void setMemberDetails(List<MemberDetail> memberDetails) {
		this.memberDetails = memberDetails;
	}
	/**
	 * @return the coverageOptions
	 */
	public List<CoverageOption_> getCoverageOptions() {
		return coverageOptions;
	}
	/**
	 * @param coverageOptions the coverageOptions to set
	 */
	public void setCoverageOptions(List<CoverageOption_> coverageOptions) {
		this.coverageOptions = coverageOptions;
	}
	/**
	 * @return the fee
	 */
	public Fee getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(Fee fee) {
		this.fee = fee;
	}

}
