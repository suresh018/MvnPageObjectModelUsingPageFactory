package utilities;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import configurations.InputValues;

public class ReportManager {
	 public static ExtentTest test;
	 public static ExtentReports reports;
	 
	 public void initReport() {
		 
		 
		 reports=new ExtentReports(InputValues.extentReportPath,true);
		 reports.loadConfig(new File(InputValues.extentConfig));
		
		 
	 }
	 
	 public void startTest(String testcase) {
		 test=reports.startTest(testcase);
	 }
	 
	 public void endTest() {
		 reports.endTest(test);
	 }
	 

	 public void terminateReport(){
			reports.flush();
			reports.close();
		
	 }
	 public void PASS(String message){
			test.log(LogStatus.PASS, message);
		}
		public void FAIL(String message){
			test.log(LogStatus.FAIL, message);
		}
		public void SKIP(String message){
			test.log(LogStatus.SKIP, message+" Test skipped");
		}
		public void INFO(String message){
			test.log(LogStatus.INFO, message);
		}
		public void testCaseStarted(String message){
			test.log(LogStatus.INFO, message+" Execution started.");
		}
		public void testCaseFinished(String message){
			test.log(LogStatus.INFO, message+" Execution completed.");
		}
}
