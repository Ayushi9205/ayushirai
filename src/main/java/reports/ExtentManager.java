package reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;
	
	public static ExtentReports getReport() {
			   
			   if (extent == null) {

		            // Generate folder name using current date and time
		            String folderName = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss")
		                    .format(new Date());

		            // Report path
		            String reportPath = "reports/" + folderName + "/APIAutomationReport.html";

		            // Create folder
		            new File("reports/" + folderName).mkdirs();

		            // Create HTML report
		            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

		            extent = new ExtentReports();
		            extent.attachReporter(spark);

		            extent.setSystemInfo("Tester", "Ayushi Rai");
		            extent.setSystemInfo("Framework", "REST Assured");
		            extent.setSystemInfo("Environment", "QA");
		        }
			   
		   return extent;
	}}
	
