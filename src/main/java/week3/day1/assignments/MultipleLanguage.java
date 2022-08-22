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

// Abstract class implementing the interface Language and TestTool
public abstract class MultipleLanguage implements Language, TestTool{
	
	// Implemented the method python.
	public void python()
	{
		System.out.println("Language Python is same as that of Java");
	}
	
	// Created an unimplemented method ruby with keyword as "abstract".
	public abstract void ruby();

}
