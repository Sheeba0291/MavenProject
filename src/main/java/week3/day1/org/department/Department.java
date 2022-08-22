package week3.day1.org.department;

import week3.day1.org.college.College;

/*
	Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()

     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.

 */

// Department extends College
public class Department extends College{

	// Create the method to print the DepartmentName.
	public void deptName()
	{
		System.out.println("Department     :      BioMedical Engineering");
	}

}
