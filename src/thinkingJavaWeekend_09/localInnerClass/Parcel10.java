package thinkingJavaWeekend_09.localInnerClass;

import myClass.Ckatt;
import thinkingJavaWeekend_09.upwardConversionInnerClass.Destination;

// ������������ "������������� ���������� " ��� ���������� ��������������� 
//� ��������� ��������� ������


public class Parcel10 {

	public Parcel10() {
		// TODO Auto-generated constructor stub
	}

	
	public Destination detination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			//������������� ���������� ��� �������� �������(���� ������������ ��� ���������� ������)
			{
				cost = Math.round(price);
				if(cost > 100) {
					Ckatt.outConsole("���������� �������!!!");
				}
			}
			private String label = dest;
			@Override
			public String readlabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parcel10 p = new Parcel10();
		p.detination("��������", 101.395F);
	}
	
	
	

}
