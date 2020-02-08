/**
 * 
 */
package com.data.rest.service;

import org.springframework.stereotype.Service;

/**
 * @author 
 */
@Service
public interface IDataService {
	/**
	 * @implNote : Method is responsible to call the repository method after manipulate the data.
	 */
	void addData();
}
