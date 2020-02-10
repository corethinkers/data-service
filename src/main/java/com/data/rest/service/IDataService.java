/**
 * 
 */
package com.data.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.rest.db.entity.ClassicTypeTest;
import com.data.rest.db.entity.IndexTestTable;
import com.data.rest.db.entity.LargeTestTable;

/**
 * @author
 */
@Service
public interface IDataService {

	void addDataIntoClassicTypeTest(ClassicTypeTest classicTypeTest);

	void addDataIntoIndexTestTable(IndexTestTable indexTestTable);

	void addDataIntoLargeTestTable(LargeTestTable largeTestTable);

	List<ClassicTypeTest> getFilterDataFromClassicTypeTest(String id);

	List<IndexTestTable> getFilterDataFromIndexTestTable(String id);

	List<LargeTestTable> getFilterDataFromLargeTestTable(String id);

	List<ClassicTypeTest> getAllClassicTypeTest();

	List<IndexTestTable> getAllIndexTestTable();

	List<LargeTestTable> getAllLargeTestTable();

}
