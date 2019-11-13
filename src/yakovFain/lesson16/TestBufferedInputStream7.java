package yakovFain.lesson16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream7 {

	public TestBufferedInputStream7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (	 FileInputStream myFile = new  FileInputStream(
				 "C:\\Users\\User\\git\\repository\\BookJavaThinkingInJava\\src\\yakovFain\\lesson16\\abc.dat");
				 BufferedInputStream buff = new BufferedInputStream(myFile);){

		            boolean eof = false;
		            while (!eof) {
		                int byteValue = buff.read();
		                System.out.print(byteValue + " ");
		                if (byteValue  == -1)
		                    eof = true;
		           }
		} catch (IOException e) { 
			System.out.println(e);
		}

	}

}
