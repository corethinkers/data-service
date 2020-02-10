/**
 * 
 */
package com.data.rest.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.rest.db.entity.IndexTestTable;
import com.data.rest.db.entity.LargeTestTable;
import com.data.rest.db.repository.ClassicTypeTestRepository;
import com.data.rest.db.repository.IndexTestTableRepository;
import com.data.rest.db.repository.LargeTestTableRepository;
import com.data.rest.service.IDataService;

/**
 * @author
 */
@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private ClassicTypeTestRepository classicTypeTestRepository;

	@Autowired
	private IndexTestTableRepository indexTestTableRepository;
	
	@Autowired
	private LargeTestTableRepository largeTestTableRepository;

	/**
	 * @see com.data.rest.service.IDataService#addDataIntoClassicTypeTest(com.data.rest.db.entity.ClassicTypeTest)
	 */
	@Override
	public void addDataIntoClassicTypeTest(ClassicTypeTest classicTypeTest) {
		classicTypeTestRepository.save(classicTypeTest);
	}

	/**
	 * @see com.data.rest.service.IDataService#addDataIntoIndexTestTable(com.data.rest.db.entity.IndexTestTable)
	 */
	@Override
	public void addDataIntoIndexTestTable(IndexTestTable indexTestTable) {
		indexTestTableRepository.save(indexTestTable);
	}

	/**
	 * @see com.data.rest.service.IDataService#addDataIntoLargeTestTable(com.data.rest.db.entity.LargeTestTable)
	 */
	@Override
	public void addDataIntoLargeTestTable(LargeTestTable largeTestTable) {
		largeTestTableRepository.save(largeTestTable);
	}

	/**
	 * @see com.data.rest.service.IDataService#getFilterDataFromClassicTypeTest()
	 */
	@Override
	public List<ClassicTypeTest> getFilterDataFromClassicTypeTest(String id) {
		return classicTypeTestRepository.getFilterData(id);
	}

	/**
	 * @see com.data.rest.service.IDataService#getFilterDataFromIndexTestTable()
	 */
	@Override
	public List<IndexTestTable> getFilterDataFromIndexTestTable(String id) {
		return indexTestTableRepository.getFilterData(id);
	}

	/**
	 * @see com.data.rest.service.IDataService#getFilterDataFromLargeTestTable()
	 */
	@Override
	public List<LargeTestTable> getFilterDataFromLargeTestTable(String id) {
		return largeTestTableRepository.getFilterData(id);
	}

	/**
	 * @see com.data.rest.service.IDataService#getAllClassicTypeTest()
	 */
	@Override
	public List<ClassicTypeTest> getAllClassicTypeTest() {
		return classicTypeTestRepository.findAll();
	}

	/**
	 * @see com.data.rest.service.IDataService#getAllIndexTestTable()
	 */
	@Override
	public List<IndexTestTable> getAllIndexTestTable() {
		return indexTestTableRepository.findAll();
	}

	/**
	 * @see com.data.rest.service.IDataService#getAllLargeTestTable()
	 */
	@Override
	public List<LargeTestTable> getAllLargeTestTable() {
		return largeTestTableRepository.findAll();
	}
	
}
