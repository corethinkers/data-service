package com.data.rest.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.utils.ClassicTypeTestConstants;

/**
 * @author 
 */
@Repository
public interface ClassicTypeTestRepository extends JpaRepository<ClassicTypeTest, Long> {
	
	@Query(value = ClassicTypeTestConstants.QUERY_FEE_FROM_INVOICE_BY_DIVISION_NUMBER + "?1", nativeQuery = true)
	List getFeeDetailsFromInvoiceByDivisionNumber(String divisionNumber); 
	
	@Query(value = ClassicTypeTestConstants.QUERY_COVERAGE_OPTIONS_FROM_INVOICE_BY_DIVISION_NUMBER + "?1", nativeQuery = true)
	List getCoverageOptionsFromInvoiceByDivisionNumber(String divisionNumber);
	
	@Query(value = ClassicTypeTestConstants.QUERY_MEMBER_DETAILS_FROM_INVOICE_BY_DIVISION_NUMBER + "?1", nativeQuery = true)
	List getMemberDetailsFromInvoiceByDivisionNumber(String divisionNumber);
	
	@Query(value = ClassicTypeTestConstants.QUERY_ALL_DIVISION_SUMMARY_FROM_INVOICE_BY_DIVISION_NUMBER + "?1", nativeQuery = true)
	List getAllDivisionSummaryFromInvoiceByDivisionNumber(String divisionNumber);
	
	@Query(value = ClassicTypeTestConstants.QUERY_INVOICE_INFO_BY_BILLING_ANALYST_CODE + "?1",nativeQuery = true)
	List getInvoiceInfoByBillingAnalystCode();
	
	@Query(value = ClassicTypeTestConstants.QUERY_INVOICE_INFO_BY_ACCOUNT_NUMBER + "?1",nativeQuery = true)
	List getInvoiceInfoByAccountNumber();
	
	@Query(value = ClassicTypeTestConstants.QUERY_INVOICE_INFO_BY_CUSTOMER_TYPE + "?1",nativeQuery = true)
	List getInvoiceInfoByCustomerType();
	
	@Query(value = ClassicTypeTestConstants.QUERY_INVOICE_INFO_BY_GROUP_NAME + "?1",nativeQuery = true)
	List getInvoiceInfoByGroupName();
	
	@Query(value = ClassicTypeTestConstants.QUERY_INVOICE_INFO_BY_BILL_GROUP_NUMBER + "?1",nativeQuery = true)
	List getInvoiceInfoByBillingGroupNumber();
	
	@Query(value = ClassicTypeTestConstants.QUERY_INVOICE_INFO_BY_FINANCIAL_COMPANY_NAME + "?1",nativeQuery = true)
	List getInvoiceInfoByFinancialCompanyName();
	
}
