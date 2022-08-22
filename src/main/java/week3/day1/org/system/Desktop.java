package week3.day1.org.system;

/*
 *      Package   :org.system
     Class        :Computer
     Methods   :computerModel()

     Class        :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.

 */

public class Desktop extends Computer{

	// Create the method to print the DesktopSize.
	public void desktopSize() {
		System.out.println("The Size of the Desktop is 15 inches");
	}
	
	public static void main(String[] args)
	{
		// Create an object for the class Desktop.
		Desktop mySystem = new Desktop();
		
		// call the methods from the Base class Computer
		mySystem.computerModel();
		
		// call the methods from the derived class Desktop
		mySystem.desktopSize();
	}
}
