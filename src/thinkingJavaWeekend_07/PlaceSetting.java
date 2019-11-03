package thinkingJavaWeekend_07;

public class PlaceSetting extends Custom{

	private Spoon sp;
	private Fork frk;
	private Fnife kn;
	private DinnerPlate pl;
	
	
	
	
	public PlaceSetting(int i) {
		// TODO Auto-generated constructor stub
	    super(i + 1);
	    sp = new Spoon(i + 2);
	    frk = new Fork(i + 3);
	    kn = new Fnife(i + 4);
	    pl = new DinnerPlate(i + 5);
	    System.out.println("Конструктор PlaceSetting");
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceSetting x = new PlaceSetting(9);
	}

}
