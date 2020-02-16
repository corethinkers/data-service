package com.data.utils;

/**
 * @author ArunJSR
 */
public class ClassicTypeTestConstants {

	public static final String QUERY_FEE_FROM_INVOICE_BY_DIVISION_NUMBER = "SELECT JSON_QUERY(divisionSummary.value, '$.fee') AS divisionFee "
			+ " FROM classictypetest c"
			+ " CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary"
			+ " CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary"
			+ " WHERE JSON_VALUE(divisionSummary.value, '$.divisionNumber') = ";

	public static final String QUERY_COVERAGE_OPTIONS_FROM_INVOICE_BY_DIVISION_NUMBER = "SELECT JSON_QUERY(divisionSummary.value, '$.coverageOptions') AS coverageOptions"
			+ " FROM classictypetest c"
			+ " CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary"
			+ " CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary"
			+ " CROSS APPLY OPENJSON(divisionSummary.value, '$.coverageOptions') as coverageOptions"
			+ " WHERE JSON_VALUE(divisionSummary.value, '$.divisionNumber') = ";

	public static final String QUERY_MEMBER_DETAILS_FROM_INVOICE_BY_DIVISION_NUMBER = "SELECT JSON_QUERY(divisionSummary.value, '$.memberDetails') AS memberDetails"
			+ " FROM classictypetest c"
			+ " CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary"
			+ " CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary"
			+ " CROSS APPLY OPENJSON(divisionSummary.value, '$.memberDetails') as memberDetails"
			+ " WHERE JSON_VALUE(divisionSummary.value, '$.divisionNumber') = ";

	public static final String QUERY_ALL_DIVISION_SUMMARY_FROM_INVOICE_BY_DIVISION_NUMBER = "SELECT JSON_VALUE(divisionSummary.value, '$.numberOfEnrollees') AS divisionNumberOfEnrollees,\r\n"
			+ "JSON_QUERY(divisionSummary.value, '$.memberDetails') AS memberDetails,\r\n "
			+ "JSON_QUERY(divisionSummary.value, '$.fee') AS divisionFee,\r\n"
			+ "JSON_QUERY(divisionSummary.value, '$.coverageOptions') AS coverageOptions\r\n"
			+ "FROM classictypetest c \r\n"
			+ "CROSS APPLY OPENJSON(c.json_object, '$.groupSummary') as groupSummary\r\n"
			+ "CROSS APPLY OPENJSON(groupSummary.value, '$.divisionSummary') as divisionSummary \r\n"
			+ "WHERE JSON_VALUE(divisionSummary.value, '$.divisionNumber') = ";

	public static final String QUERY_INVOICE_INFO_BY_BILLING_ANALYST_CODE = "SELECT * \r\n"
			+ "FROM classictypetest c \r\n"
			+ "WHERE JSON_VALUE(c.json_object, '$.billingAnalystCode') = ";
	
	public static final String QUERY_INVOICE_INFO_BY_BILL_GROUP_NUMBER = "SELECT * \r\n"
			+ "FROM classictypetest c \r\n"
			+ "WHERE JSON_VALUE(c.json_object, '$.billToGroupNumber') = ";
	
	public static final String QUERY_INVOICE_INFO_BY_CUSTOMER_TYPE = "SELECT * \r\n"
			+ "FROM classictypetest c \r\n"
			+ "WHERE JSON_VALUE(c.json_object, '$.customerType') = ";
	
	public static final String QUERY_INVOICE_INFO_BY_ACCOUNT_NUMBER = "SELECT * \r\n"
			+ "FROM classictypetest c \r\n"
			+ "WHERE JSON_VALUE(c.json_object, '$.accountNumber') = ";
	
	public static final String QUERY_INVOICE_INFO_BY_FINANCIAL_COMPANY_NAME = "SELECT * \r\n"
			+ "FROM classictypetest c \r\n"
			+ "WHERE JSON_VALUE(c.json_object, '$.financialCompanyName') = ";
	
	public static final String QUERY_INVOICE_INFO_BY_GROUP_NAME = "SELECT * \r\n"
			+ "FROM classictypetest c \r\n"
			+ "WHERE JSON_VALUE(c.json_object, '$.groupName') = ";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_COVERAGE_DATE_RANGE = "";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_BILLING_ANALYST_CODE = "";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_BILL_GROUP_NUMBER = "";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_CUSTOMER_TYPE = "";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_ACCOUNT_NUMBER = "";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_FINANCIAL_COMPANY_NAME = "";
	
	public static final String QUERY_SEARCH_INVOICE_INFO_BY_GROUP_NAME = "";
	
	
	
	private ClassicTypeTestConstants() {
	}
}
