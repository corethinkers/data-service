/**
 * 
 */
package com.data.rest.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.data.rest.db.entity.CustomerInfo;

/**
 * @author
 */
@Repository
public interface IDataRepository extends JpaRepository<CustomerInfo, Long> {
	
	@Query(value = "SELECT * FROM [dbo].[customerinfo]", nativeQuery = true)
	List<CustomerInfo> getAllInfo();
	
}
