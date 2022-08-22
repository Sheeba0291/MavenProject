package week3.day1.org.college;

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
public class College {
	
	// Create the method to print the CollegeName.
	public void collegeName()
	{
		System.out.println("Name of the College     :      CEG, Anna University");
	}

	// Create the method to print the CollegeCode.
	public void collegeCode()
	{
		System.out.println("College  Code           :      001");
	}
	
	// Create the method to print the CollegeRank.
	public void collegeRank()
	{
		System.out.println("College  Rank           :      2");
	}
}
