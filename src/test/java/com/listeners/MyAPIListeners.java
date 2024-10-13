package com.listeners;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.util.ExtentReportUtilitiy;

public class MyAPIListeners implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.print("--------------------------------- API Test Suite-------------------------------------");

		ExtentReportUtilitiy.setupSparkReport("report.html");
	}

	public void onTestStart(ITestResult result) {
		ExtentReportUtilitiy.createTest(result.getMethod().getMethodName());
		ExtentReportUtilitiy.getExtentTest().info(result.getMethod().getMethodName() + " Started!!!");
		ExtentReportUtilitiy.getExtentTest().info("Groups:" + Arrays.toString(result.getMethod().getGroups()));
		ExtentReportUtilitiy.getExtentTest().info("Description:" + result.getMethod().getDescription());

	}

	public void onTestSuccess(ITestResult result) {
		ExtentReportUtilitiy.getExtentTest().pass(result.getMethod().getMethodName() + " Passed!!!");

	}

	public void onTestSkipped(ITestResult result) {
		ExtentReportUtilitiy.getExtentTest().skip(result.getMethod().getMethodName() + " Skipped!!!");
	}

	public void onFinish(ITestContext context) {

		ExtentReportUtilitiy.flushReport();

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Has FAILED!!!!!");
		System.out.println(result.getThrowable().toString());// Important

		ExtentReportUtilitiy.getExtentTest().fail(result.getMethod().getMethodName() + " FAILED!!!");
																					// reason

	}

}
