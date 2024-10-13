package com.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtilitiy {
	private static ExtentReports extentReports; /// Heavy lifting
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>(); // storer or collect information
																						// about the test

	public static void setupSparkReport(String path) {
		ExtentSparkReporter extentSparkReporter;
		extentSparkReporter = new ExtentSparkReporter(path);
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
	}

	public static void createTest(String testName) {
		ExtentTest x=extentReports.createTest(testName);
		extentTest.set(x);

	}

	public static ExtentTest getExtentTest() {
		return extentTest.get();//local instance of extent test variable for a particular
	}

	public static void flushReport() {
		extentReports.flush();
	}
}
