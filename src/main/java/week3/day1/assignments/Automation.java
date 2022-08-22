package week3.day1.assignments;

/*
Interface :Language
 Methods   :Java()
 Interface :TestTool
 Methods   :Selenium()
 AbstractClass :MultipleLangauge
 Methods   :python() and un implemented method as ruby()
Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class

*/

// Concrete Class extending the Abstract class MultipleLanguage
public class Automation extends MultipleLanguage{

	// Implemented the method selenium from Interface TestTool
	public void selenium() {
		System.out.println("TestTool used : Selenium");
		
	}

	// Implemented the method java from Interface Language
	public void java() {
		System.out.println("Language used : Java");
		
	}

	// Implemented the method ruby from Abstract class MultipleLanguage
	public void ruby() {
		System.out.println("Language to be learned : Ruby");
		
	}
	
	public static void main(String[] args) {
		
		// Created an object for the class Automation.
		Automation atm = new Automation();
		
		// Call the methods from concrete class - Automation.
		atm.java();
		atm.selenium();
		atm.ruby();
		
		// Call the methods from abstract class - MultipleLanguage.
		atm.python();
	}

}
