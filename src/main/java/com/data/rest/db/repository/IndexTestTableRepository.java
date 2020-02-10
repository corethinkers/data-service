/**
 * 
 */
package com.data.rest.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.data.rest.db.entity.IndexTestTable;

/**
 * @author
 */
@Repository
public interface IndexTestTableRepository extends JpaRepository<IndexTestTable, Long> {

	@Query(value = "SELECT JSON_VALUE(json_object, '$.groupSummary[0].adjustmentAmount') as adjustmentAmount, \r\n" + 
			"JSON_VALUE(json_object, '$.groupSummary[0].amount') as amount,\r\n" + 
			"JSON_VALUE(json_object, '$.groupSummary[0].divisionSummary[0].divisionNumber') as divisionSummary,\r\n" + 
			"JSON_VALUE(json_object, '$.groupSummary[0].divisionSummary[0].memberDetails[0].coverageEffectiveDate') as coverageEffectiveDate,\r\n" + 
			"JSON_VALUE(json_object, '$.groupSummary[0].divisionSummary[0].memberDetails[0].firstName') as memberName \r\n" + 
			"FROM indextesttable\r\n" + 
			"WHERE JSON_VALUE(json_object, '$.id') = ?1", nativeQuery = true)
	List getFilterData(String id);
	
}
