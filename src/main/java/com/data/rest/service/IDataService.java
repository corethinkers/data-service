/**
 * 
 */
package com.data.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.rest.dto.CoverageOption;
import com.data.rest.dto.Fee;
import com.data.rest.dto.InvoiceJsonDTO;
import com.data.rest.dto.MemberDetail;

/**
 * @author
 */
@Service
public interface IDataService {

	void addDataIntoClassicTypeTest(ClassicTypeTest classicTypeTest);
	
	List<InvoiceJsonDTO> getAllClassicTypeTest();
	
	List<Fee> getFeeDetailsFromInvoiceByDivisionNumber(String divisionNumber);

	List<MemberDetail> getMemberDetailsFromInvoiceByDivisionNumber(String divisionNumber);
	
	List<CoverageOption> getCoverageOptionsFromInvoiceByDivisionNumber(String divisionNumber);
	
	
}
