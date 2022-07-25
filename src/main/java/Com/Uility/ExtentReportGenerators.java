package Com.Uility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerators {
	public static  ExtentReports  extent;

	public static ExtentReports  getReport()  {
		// ExtentSparkReporter ------------>title theme
		//ExtentReports  =======setup
  String path="C:\\Users\\sspm\\eclipse-workspace\\DSS_Bach_MarchFramework\\Report\\index.html";
      ExtentSparkReporter reporter=new ExtentSparkReporter(path);
      reporter.config().setDocumentTitle("Auomation test Report");
      reporter.config().setReportName("DSS test Report");
      reporter.config().setTheme(Theme.DARK);
      
      extent=new ExtentReports();
      extent.attachReporter(reporter);
      extent.setSystemInfo("Project name", "DSS test");
      extent.setSystemInfo("tool", "Selenium Webdriver");
      extent.setSystemInfo("QA", "rox");
	return extent;
  
	}
}