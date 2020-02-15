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

	private ClassicTypeTestConstants() {
	}
}
