 package Test;

import Test1.Test1;

public class Test2 extends Test1 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}

	
	public Test2 readInnerClass() {
		
		return new Test2();     // не возможго достучаться к inner class
	}
	
}
