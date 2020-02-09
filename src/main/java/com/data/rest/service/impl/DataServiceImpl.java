/**
 * 
 */
package com.data.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.rest.db.entity.CustomerInfo;
import com.data.rest.db.repository.IDataRepository;
import com.data.rest.service.IDataService;

/**
 * @author 
 */
@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private IDataRepository dataRepository;
	
	/**
	 * @see com.data.rest.service.IDataService#addData()
	 */
	@Override
	public void addData() {

	}

	@Override
	public List<CustomerInfo> getAllInfo() {
		
		return dataRepository.getAllInfo();
	}
	
}
