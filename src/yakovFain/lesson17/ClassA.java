package yakovFain.lesson17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassA {
	public static void main(String args[]){
	    
		Employee emp = new Employee();
	    emp.lName = "John";
	    emp.fName = "Smith"; 
	    emp.salary = 50000;
	       
	    try (FileOutputStream fOut = new FileOutputStream(
	    		"C:\\Users\\User\\git\\repository\\BookJavaThinkingInJava\\src\\yakovFain\\lesson17\\BestEmployee.ser");
	    	 ObjectOutputStream oOut = new ObjectOutputStream(fOut);){   

	     oOut.writeObject(emp);  //serializing employee
	   } catch (IOException e){
	      e.printStackTrace();
	   }  
	   System.out.println("The Employee object has been serialized into BestEmployee.ser");
	  } 

}
