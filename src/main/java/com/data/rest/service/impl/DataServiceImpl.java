/**
 * 
 */
package com.data.rest.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.rest.db.repository.ClassicTypeTestRepository;
import com.data.rest.dto.CoverageOption;
import com.data.rest.dto.Fee;
import com.data.rest.dto.InvoiceJsonDTO;
import com.data.rest.dto.MemberDetail;
import com.data.rest.service.IDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author
 */
@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private ClassicTypeTestRepository classicTypeTestRepository;

	/**
	 * @see com.data.rest.service.IDataService#addDataIntoClassicTypeTest(com.data.rest.db.entity.ClassicTypeTest)
	 */
	@Override
	public void addDataIntoClassicTypeTest(ClassicTypeTest classicTypeTest) {
		classicTypeTestRepository.save(classicTypeTest);
	}

	/**
	 * @see com.data.rest.service.IDataService#getFilterDataFromClassicTypeTest()
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Fee> getFeeDetailsFromInvoiceByDivisionNumber(String divisionNumber) {
		List result = classicTypeTestRepository.getFeeDetailsFromInvoiceByDivisionNumber(divisionNumber);
		ObjectMapper objectMapper = new ObjectMapper();
		List<Fee> listOfFeeDTO = new ArrayList<Fee>();
		result.forEach(res -> {
			Fee fee;
			try {
				fee = objectMapper.readValue(res.toString(), Fee.class);
				listOfFeeDTO.add(fee);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
		return listOfFeeDTO;
	}

	/**
	 * @see com.data.rest.service.IDataService#getAllClassicTypeTest()
	 */
	@Override
	public List<InvoiceJsonDTO> getAllClassicTypeTest() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<InvoiceJsonDTO> listOfInvoiceJsonDTO = new ArrayList<InvoiceJsonDTO>();
		List<ClassicTypeTest> result = classicTypeTestRepository.findAll();
		result.forEach(classicTypeTest -> {
			InvoiceJsonDTO invoiceJsonDTO;
			try {
				invoiceJsonDTO = objectMapper.readValue(classicTypeTest.getJsonObject(), InvoiceJsonDTO.class);
				listOfInvoiceJsonDTO.add(invoiceJsonDTO);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
		return listOfInvoiceJsonDTO;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<MemberDetail> getMemberDetailsFromInvoiceByDivisionNumber(String divisionNumber) {
		List result = classicTypeTestRepository.getMemberDetailsFromInvoiceByDivisionNumber(divisionNumber);
		List<MemberDetail> listOfMemberDetailDTO = new ArrayList<MemberDetail>();
		ObjectMapper objectMapper = new ObjectMapper();
		for (Object res : result)
			try {
				listOfMemberDetailDTO = objectMapper.readValue(res.toString(), new TypeReference<List<MemberDetail>>() {
				});
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}

		return listOfMemberDetailDTO;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CoverageOption> getCoverageOptionsFromInvoiceByDivisionNumber(String divisionNumber) {
		List result = classicTypeTestRepository.getCoverageOptionsFromInvoiceByDivisionNumber(divisionNumber);
		ObjectMapper objectMapper = new ObjectMapper();
		List<CoverageOption> listOfCoverageOptionDTO = new ArrayList<CoverageOption>();
		for (Object res : result)
			try {
				listOfCoverageOptionDTO = objectMapper.readValue(res.toString(),
						new TypeReference<List<CoverageOption>>() {
						});
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		return listOfCoverageOptionDTO;
	}

}
