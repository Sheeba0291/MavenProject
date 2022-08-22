package week3.day1.assignments;

/*
 *       Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber


*/
public class Students {
	
	// Create the method - getStudentInfo using id.
	public void getStudentInfo(int id)
	{
		
		System.out.println("ID of the student : "+id+" loading ........... ");
		System.out.println("Name of the Student : Sheeba ");
		System.out.println("*****************************");
	}
	
	// Overloaded the method - getStudentInfo by passing id and name.
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Name : "+name+" and ID : "+id+" belongs to ..............");
		System.out.println("Student from Bio-Med Dept 2009-2013 Batch");
		System.out.println("*****************************");
	}
	
	// Overloaded the method - getStudentInfo by passing mailId and phoneNumber.
	public void getStudentInfo(String mailId, long phoneNum)
	{
		System.out.println("MailID : "+mailId+" and Phone NUmber : "+phoneNum+" belongs to ..............");
		System.out.println("Student Raja Sheeba MS from Bio-Med Dept 2009-2013 Batch");
		System.out.println("*****************************");
	}
	
	public static void main(String[] args) {
		
		// Create an object for the class Students.
		Students student = new Students();
		
		// Call the method getStudentInfo by passing id.
		student.getStudentInfo(11060035);
		
		// Call the method getStudentInfo by passing id and Name.
		student.getStudentInfo(11060035, "Sheeba");
		
		// Call the method getStudentInfo by passing mailId and Phone Number.
		student.getStudentInfo("rsheeba.ms@gmail.com", 8220322790l);
	}

}
