package thinkinginJavaWeekend_11.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {

	public AddingGroups() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		Integer[] moreInts = { 6, 7, 8, 9, 10 };

		collection.addAll(Arrays.asList(moreInts));

		// �������� ����������� �������
		// �� Collections ��� �������������� �� �������� :
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);

		// ������� ������ �� ���� �������

		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99);  // OK -- �������� �������
		list.add(21);     // ������ ������� ���������� 
		                  // ������ �������� ������ ���������� �� �����
 
	}

}
