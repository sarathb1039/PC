package com.pc.driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.ParallelMode;

import com.pc.utilities.HTML;

import org.testng.xml.XmlTest;

public class TestNGRunner {
	@Parameters({ "DataSheetName","Region" })
	public void Parllel4(String DataSheetName, String Region)
	{
		
	}
	public static void main(String args[])
	{
		
		
		XmlSuite suite = new XmlSuite();
		suite.setName("TestAll");
		suite.setThreadCount(1);
		suite.setParallel(ParallelMode.METHODS);
		
		XmlTest test = new XmlTest(suite);
		test.setName("PC");
		
		test.addParameter("DataSheetName", "Data_Regression");
		test.addParameter("Region", "");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.pc.driver.ParallelExecDriver"));
		test.setXmlClasses(classes);
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();
		
	} 
}
