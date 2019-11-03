package thinkingJavaWeekend_07.finalArguments;

public class FinalArguments {

	public FinalArguments() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void with(final Gizmo g) {
		// g = new Gizmo();   Запрещено ---- g обьявлено как final
	}
	
	public void withOut(Gizmo g) {
		g.spin();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalArguments bf = new FinalArguments();
		
		bf.with(null);
		bf.withOut(new Gizmo());
	}

}
