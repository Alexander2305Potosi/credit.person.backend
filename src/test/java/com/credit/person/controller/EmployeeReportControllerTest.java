package com.credit.person.controller;
//package com.report.hour.employee.controller;
//import static org.junit.Assert.assertNull;
//
////
////import static org.junit.Assert.assertEquals;
////
//import java.sql.Timestamp;
//import java.util.Date;
////
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
////import org.mockito.Mockito;
//import org.mockito.runners.MockitoJUnitRunner;
////
//import com.report.hour.employee.dto.CreateEmployeeReport;
//import com.report.hour.employee.model.ReportEmployee;
//import com.report.hour.employee.service.EmployeeReportService;
////
//@RunWith(MockitoJUnitRunner.class)
//public class EmployeeReportControllerTest {
////
//	@InjectMocks
//	private EmployeeReportController employeeReportController;
////
//	@Mock
//	private EmployeeReportService employeeReportService;
////
////
//	@Test
//	public void testRegistryReportEmployee() {
//		CreateEmployeeReport resp = new CreateEmployeeReport();
//		resp.setDateStart(new Timestamp(new Date().getTime()));
//		resp.setDateEnd(new Timestamp(new Date().getTime()));
//		resp.setIDtechnical("");
//		resp.setIDVisit("");
////		
////		Mockito.when((employeeReportService.saveReportEmployee(new ReportEmployee("", "", new Timestamp(new Date().getTime()), new Timestamp(new Date().getTime()))))).thenThrow(NullPointerException.class);
////		
//		ReportEmployee actual = employeeReportController.registryReportEmployee(resp);
////		// Assert
//		assertNull(null);
//	}
////
//}
