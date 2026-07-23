package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;
	
	public static ExtentReports getReport() {
		   if(extent==null){

	            ExtentSparkReporter spark =
	                    new ExtentSparkReporter("reports/APIAutomationReport.html");

	            extent = new ExtentReports();
	            extent.attachReporter(spark);

	            extent.setSystemInfo("Tester","Ayushi Rai");
	            extent.setSystemInfo("Framework","REST Assured");
	            extent.setSystemInfo("Environment","QA");
	        }
		   return extent;
	}
	
}
