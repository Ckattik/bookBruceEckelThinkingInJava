package Test;

import myClass.Ckatt;

public class Person {

	private String name;
	
	private void setName(String s) {
		name = s;
	}
	
	public void setInner() {
		Inner in = new Inner();
		in.setPesron();
				
	}
	
	public class Inner{
		
		public void setPesron(){
			setName("Vasya");
		}
	}
	
	
	public static void main(String [] args) {
		Person person = new Person();
		person.setInner();
		Ckatt.outConsole(person.name);
		
	}
}
