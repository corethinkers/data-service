/**
 * 
 */
package com.data.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.rest.db.entity.CustomerInfo;

/**
 * @author 
 */
@Service
public interface IDataService {
	
	/**
	 * @implNote : Method is responsible to call the repository method after manipulate the data.
	 */
	void addData();
	
	List<CustomerInfo> getAllInfo();
}
