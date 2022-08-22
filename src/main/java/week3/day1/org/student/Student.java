package week3.day1.org.student;

import week3.day1.org.department.Department;

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

// Student extends Department
public class Student extends Department{
	
	// Create the method to print the StudentName.
	public void studentName()
	{
		System.out.println("Name of the Student     :      Raja Sheeba MS");
	}

	// Create the method to print the StudentDepartment.
	public void studentDept()
	{
		System.out.println("Student Dept           :      Bio Med");
	}
	
	// Create the method to print the StudentID.
	public void studentID()
	{
		System.out.println("Student Id           :      11060035");
	}
	
	public static void main(String[] args) {
		
		// Create an object for the class Student.
		Student newStudent = new Student();
		
		// call the methods from the Base class College
		newStudent.collegeName();
		newStudent.collegeCode();
		newStudent.collegeRank();
		
		// call the methods from the inherited class Department
		newStudent.deptName();
		
		// call the methods from the derived class Student
		newStudent.studentName();
		newStudent.studentID();
		newStudent.studentDept();
	}
}
