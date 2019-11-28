package thinkinginJavaWeekend_11.assListInference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssListInference {

	public AssListInference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		
		List<Snow> snow3 = new ArrayList<Snow>();
		
		Collections.addAll(snow3, new Light(), new Heavy());
		
		// явно указаным аргументом типа
		
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
		
	}

}
