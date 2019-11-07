package thinkingJavaWeekend_09.expansionInterfacesAnonimusClass;

public class VeryBadVampire {

	public VeryBadVampire() {
		// TODO Auto-generated constructor stub
	}

	public Vampire vampire() {
		
		return new Vampire() {
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drinBlood() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void kill() {
				// TODO Auto-generated method stub
				
			}
			
			
			@Override
			public void menace() {
				// TODO Auto-generated method stub
				
			}
		};
	   
	}
	
	
	
}
