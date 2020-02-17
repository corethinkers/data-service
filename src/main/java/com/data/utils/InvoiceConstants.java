/**
 * 
 */
package com.data.utils;

/**
 * @author SUMIT
 *
 */
public class InvoiceConstants {
	
	public static final String QUERY_INVOICE_DETAILS_BY_INVOICE_NUMBER = "SELECT\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.invoice_json, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM invoice c\r\n" + 
			"WHERE JSON_VALUE(c.invoice_json, '$.invoiceNumber') = ";
	
	public static final String QUERY_INVOICE_DETAILS_BY_ID = "SELECT\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.invoice_json, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM invoice c\r\n" + 
			"WHERE JSON_VALUE(c.invoice_json, '$.id') = ";
	
	public static final String QUERY_INVOICE_DETAILS_BY_STATUS = "SELECT\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.invoice_json, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM invoice c\r\n" + 
			"WHERE JSON_VALUE(c.invoice_json, '$.status') = ";
	
	public static final String QUERY_INVOICE_DETAILS_BY_INVOICE_GENERATION_DATE = "SELECT\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.invoice_json, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.invoice_json, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM invoice c\r\n" + 
			"WHERE CONVERT(varchar,JSON_VALUE(c.invoice_json, '$.invoiceGenerationDate')) BETWEEN ?1 AND ?2 ;";
	
	public static final String QUERY_INVOICE_DETAILS_BY_BILLING_ANALYST_CODE = "SELECT\r\n" + 
			"JSON_VALUE(c.json_object, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.json_object, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.json_object, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.json_object, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.json_object, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.json_object, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.json_object, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.json_object, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM classictypetest c\r\n" + 
			"WHERE JSON_VALUE(c.json_object, '$.billingAnalystCode') like %?1% ;";
	
	public static final String QUERY_INVOICE_DETAILS_BY_GROUP_NUMBER = "SELECT\r\n" + 
			"JSON_VALUE(c.json_object, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.json_object, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.json_object, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.json_object, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.json_object, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.json_object, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.json_object, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.json_object, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM classictypetest c\r\n" + 
			"WHERE JSON_VALUE(c.json_object, '$.billToGroupNumber') like %?1% ;";
	
	public static final String QUERY_INVOICE_DETAILS_BY_CUSTOMER_TYPE = "SELECT\r\n" + 
			"JSON_VALUE(c.json_object, '$.id') as id,\r\n" + 
			"JSON_VALUE(c.json_object, '$.accountNumber') as accountNumber,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceCreationDate') as invoiceCreationDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceGenerationDate') as invoiceGenerationDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceType') as invoiceType,\r\n" + 
			"JSON_VALUE(c.json_object, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(c.json_object, '$.billingAnalystCode') as billingAnalystCode,\r\n" + 
			"JSON_VALUE(c.json_object, '$.billToGroupNumber') as billToGroupNumber,\r\n" + 
			"JSON_VALUE(c.json_object, '$.coverageEndDate') as coverageEndDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.coverageStartDate') as coverageStartDate,\r\n" + 
			"JSON_VALUE(c.json_object, '$.customerType') as customerType,\r\n" + 
			"JSON_VALUE(c.json_object, '$.financialCompanyName') as financialCompanyName,\r\n" + 
			"JSON_VALUE(c.json_object, '$.invoiceSubType') as invoiceSubType,\r\n" + 
			"JSON_QUERY(c.json_object, '$.groupSummary') AS groupSummary\r\n" + 
			"FROM classictypetest c\r\n" + 
			"WHERE JSON_VALUE(c.json_object, '$.customerType') like  %?1% ;";
	
	public static final String QUERY_GROUP_DETAILS_BY_AMOUNT_RANGE = "SELECT\r\n" + 
			"JSON_VALUE(groupSummary.value, '$.groupNumber') AS groupNumber,\r\n" + 
			"JSON_VALUE(groupSummary.value, '$.amount') AS amount,\r\n" + 
			"JSON_VALUE(c.json_object, '$.groupName') as groupName,\r\n" + 
			"JSON_VALUE(divisionSummary.value, '$.divisionNumber') AS divisionNumber,\r\n" + 
			"JSON_VALUE(divisionSummary.value, '$.numberOfEnrollees') AS divisionNumberOfEnrollees,\r\n" + 
			"JSON_VALUE(divisionSummary.value, '$.memberDetails') AS divisionMemberDetails,\r\n" + 
			"JSON_QUERY(divisionSummary.value, '$.coverageOptions') AS divisionCoverageOptions,\r\n" + 
			"JSON_QUERY(divisionSummary.value, '$.fee') AS divisionFee\r\n" + 
			"FROM classictypetest c\r\n" + 
			"CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary\r\n" + 
			"CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary\r\n" + 
			"WHERE CONVERT(varchar,JSON_VALUE(groupSummary.value, '$.amount')) BETWEEN ?1 AND ?2";
	
	
	public static final String QUERY_MEMBER_DETAILS_BY_FIRST_NAME = "SELECT\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.amount') AS amount,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.assignedId') AS assignedId,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.coverageEffectiveDate') AS coverageEffectiveDate,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.coverageOptionCode') AS coverageOptionCode,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.premium') AS premium,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.firstName') AS firstName,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.lastName') AS lastName,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.memberId') AS memberId,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.supplierId') AS supplierId\r\n" + 
			"FROM classictypetest c\r\n" + 
			"CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary\r\n" + 
			"CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary\r\n" + 
			"CROSS APPLY OPENJSON(divisionSummary.value, '$.memberDetails') as memberDetails\r\n" + 
			"WHERE JSON_VALUE(memberDetails.value, '$.firstName') LIKE %?1% ;";
	
	public static final String QUERY_MEMBER_DETAILS_BY_LAST_NAME = "SELECT\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.amount') AS amount,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.assignedId') AS assignedId,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.coverageEffectiveDate') AS coverageEffectiveDate,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.coverageOptionCode') AS coverageOptionCode,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.premium') AS premium,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.firstName') AS firstName,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.lastName') AS lastName,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.memberId') AS memberId,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.supplierId') AS supplierId\r\n" + 
			"FROM classictypetest c\r\n" + 
			"CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary\r\n" + 
			"CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary\r\n" + 
			"CROSS APPLY OPENJSON(divisionSummary.value, '$.memberDetails') as memberDetails\r\n" + 
			"WHERE JSON_VALUE(memberDetails.value, '$.lastName') LIKE %?1% ;";
	
	
	public static final String QUERY_MEMBER_DETAILS_BY_MEMBER_ID = "SELECT\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.amount') AS amount,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.assignedId') AS assignedId,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.coverageEffectiveDate') AS coverageEffectiveDate,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.coverageOptionCode') AS coverageOptionCode,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.premium') AS premium,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.firstName') AS firstName,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.lastName') AS lastName,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.memberId') AS memberId,\r\n" + 
			"JSON_VALUE(memberDetails.value, '$.supplierId') AS supplierId\r\n" + 
			"FROM classictypetest c\r\n" + 
			"CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary\r\n" + 
			"CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary\r\n" + 
			"CROSS APPLY OPENJSON(divisionSummary.value, '$.memberDetails') as memberDetails\r\n" + 
			"WHERE JSON_VALUE(memberDetails.value, '$.memberId') LIKE %?1% ;";

}
