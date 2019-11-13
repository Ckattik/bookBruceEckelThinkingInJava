package yakovFain.lesson16;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream7 {

	public TestFileInputStream7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (FileInputStream myFile = new  FileInputStream(
				 "C:\\Users\\User\\git\\repository\\BookJavaThinkingInJava\\src\\yakovFain\\lesson16\\abc.dat")) {
	            
	            boolean eof = false;

	            while (!eof) {
	                int byteValue = myFile.read();
	                System.out.print(byteValue + " ");
	                if (byteValue  == -1)
	                    eof = true;
	           }
	       
	  } catch (IOException e) {
	           System.out.println("Could not read file: " + 
	                                           e.toString());
	  } 

	}

}
