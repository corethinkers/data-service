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
	
	
}
