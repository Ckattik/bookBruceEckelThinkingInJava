package thinkinginJavaWeekend_05;

public class TestEnumValue {

	MonneyEnum money;

	
	public TestEnumValue(MonneyEnum money) {
		// TODO Auto-generated constructor stub

	this.money = money;
	
	}
	
	
	public void moneyOfCountry() {
		

		switch (money) {
		
		case DOLLAR:
			System.out.println("This is USA money");
			break;
		case EURO:
			System.out.println("This is EUROPEAN UNION money");
			break;
		case GRIVNA:
			System.out.println("This is Ukranian money");
			break;
		case FUNT:
			System.out.println("This is Switzerland money");
			break;
		case KRONA:
			System.out.println("This is Norway money");
			break;
		case LAT:
			System.out.println("This is Latvia money");
			break;
			
		

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (MonneyEnum enu : MonneyEnum.values()) {
			System.out.println(enu + ", ordinal " + enu.ordinal());
			}
		TestEnumValue money1 = new TestEnumValue(MonneyEnum.DOLLAR);
		TestEnumValue money2 = new TestEnumValue(MonneyEnum.EURO);
		TestEnumValue money3 = new TestEnumValue(MonneyEnum.FUNT);
		TestEnumValue money4 = new TestEnumValue(MonneyEnum.GRIVNA);
		TestEnumValue money5 = new TestEnumValue(MonneyEnum.KRONA);
		TestEnumValue money6 = new TestEnumValue(MonneyEnum.LAT);
		
		money1.moneyOfCountry();
		money2.moneyOfCountry();
		money3.moneyOfCountry();
		money4.moneyOfCountry();
		money5.moneyOfCountry();
		money6.moneyOfCountry();
		
		
		
	}

}
