package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
public void employeeName() {
System.out.println("Employee Name is ");
}
public static void main(String[] args) {
	Employee c = new Employee();
	c.employeeName();
	
	Company d = new Company();
	d.companyName();
	
	Client e = new Client();
	e.clientName();
	
	Project f = new Project();
	f.projectName();
}
   
   
}
