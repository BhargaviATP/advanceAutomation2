package FrameworkWorkCheck;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	public static void main(String[] args) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./report/ExtentDemo.html");
		
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setDocumentTitle("This is Sample report");
		reporter.config().setReportName("Selenium is my Name");
		
		ExtentReports report= new ExtentReports();
		
		report.attachReporter(reporter);
		
		ExtentTest logger = report.createTest("test1");
		
		ExtentTest logger1 = report.createTest("test2");//Generating multiple test cases by creating multiple instances for ExtentTest.
		
		logger1.log(Status.FAIL, "This is Failed");
		logger1.log(Status.INFO, "This is Information");
		
		logger.log(Status.PASS, "This is Passed");
		logger.log(Status.SKIP, "This is Skipped");
		
		logger1.log(Status.WARNING, "This is Warning");
		//logger1.addScreenCaptureFromPath("C:\\Users\\Bhargavi\\javaclass\\advanceautomation./target/erroshots/First SS.png");
		//Above stmt is hard coding, so, in order to get the system root path into the eclipse project path of screenShot, 
		//we need to use "user.dir",to get the root path of the system directory into the eclipse.
		String directory = System.getProperty("user.dir");
		System.out.println(directory);
		logger1.addScreenCaptureFromPath(directory+"./target/erroshots/First SS.png");
		logger1.addScreenCaptureFromPath("C:\\Users\\Bhargavi\\Pictures\\Screenshots\\Screenshot (2995).png");//adding picture from system(here given system path.
		
		report.flush();
		
		System.out.println("done");
	}

}
