package thinkinginJavaWeekend_11.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import myClass.Ckatt;

// ���������� ���������������� �������������

public class PrintingContainers {

	public PrintingContainers() {
		// TODO Auto-generated constructor stub
	}

	public static Collection fill(Collection<String> collection) {

		collection.add("�����");
		collection.add("�����");
		collection.add("������");
		collection.add("������");
		return collection;
	}
	
	
	public static Map fill(Map<String,String> map) {
		map.put("�����", "������");
		map.put("�����", "�����");
		map.put("������", "�����");
		map.put("������", "�����");
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ckatt.outConsole(fill(new ArrayList<String>()));
		
		Ckatt.outConsole(fill(new LinkedList<String>()));
		
		Ckatt.outConsole(fill(new HashSet<String>()));
		
		Ckatt.outConsole(fill(new TreeSet<String>()));
		
		Ckatt.outConsole(fill(new LinkedHashSet<String>()));
		
		Ckatt.outConsole(fill(new HashMap<String, String>()));
		
		Ckatt.outConsole(fill(new TreeMap<String, String>()));
		
		Ckatt.outConsole(fill(new LinkedHashMap<String, String>()));
		
		
		
	}

}
