package org.createNewAccount;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
public static void generateJvmReport(String jsonPath) {
	File f = new File("C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\Reports\\CreateNewAccountReport\\JsonReport");

	Configuration c = new Configuration(f, "Facebook Application");
	c.addClassifications("employee name", "ashif");
	c.addClassifications("employee id ", "61151202144121");
	List<String> l = new ArrayList();
	l.add(jsonPath);
	
	ReportBuilder r = new ReportBuilder(l, c);
	r.generateReports();
	
	
	
	
	
	
}
}
