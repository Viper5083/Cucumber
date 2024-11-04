package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	
	public static void generateJvmReport(String JasonPath) {
		//1. mention the target folder location-file
				File f = new File("C:\\Users\\ronal\\eclipse-workspace\\Cucumber\\target\\Reports\\JvmReport");
				
				
				//2. Add details to the report using configuration class
				Configuration c = new Configuration(f, "facebook application");
			     c.addClassifications("Employee Name", "Ashif");
				 c.addClassifications("Employee Id", "45632");
				
				
				//3. Add Json filoe paths into List<String>
				List<String> l = new ArrayList();
				l.add(JasonPath);
				
				//4. Create Object for ReportBuilder Class
				ReportBuilder r = new ReportBuilder(l, c);
				r.generateReports();
				
				

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
