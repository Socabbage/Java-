package 第六次作业;

public class _9_7 {
	/** Main method */
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The numbers of Circle objects is " + 
		  _9_6.numberOfObjects);
	
		// Create C1
		_9_6 c1 = new _9_6();
		
		//Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius +
		  ") and numbers of Circle objects (" +
		  c1.numberOfObjects + ")");
		
		// Create c2
		_9_6 c2 = new _9_6(5);
		
		// Modify c1
		c1.radius = 9;
		
		// Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1:radius (" + c1.radius +
		  ") and number of Circle objects (" +
	      c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
		  ") number of Circle objects (" +
		  c2.numberOfObjects + ")");
		
	}
}
