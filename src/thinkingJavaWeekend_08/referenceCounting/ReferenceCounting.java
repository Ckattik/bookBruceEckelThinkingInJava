package thinkingJavaWeekend_08.referenceCounting;

public class ReferenceCounting {

	public void finalize() {
		
	}
	
	
	public ReferenceCounting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shared shared = new Shared();
		
		Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};

		for (Composing c: composing) {
			c.dispose();
		}
		
	}

}
