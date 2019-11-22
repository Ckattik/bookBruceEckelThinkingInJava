package thinkingJavaWeekend_10.nestedInterfaces.innerclasses.localInnerClass;

import myClass.Ckatt;

// ������ ������������������ ��������

public class LocalInnerClass {

	public LocalInnerClass() {
		// TODO Auto-generated constructor stub
	}

	private int count = 0;

	public Counter getCounter(final String name) {
		// ��������� ��������� �����

		class LocalCounter implements Counter {
			// � ���������� ������ ����� ���� ���� �����������
			public LocalCounter() {
				// TODO Auto-generated constructor stub

				Ckatt.outConsole("Constractor LocalCounter()");
			}

			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.printf(" " + name); // ���������� ��������
				return count++;
			}
		}

		return new LocalCounter();
	}
	
	// �� �� � ��������� Inner class

	public Counter getCounter2(final String name) {
		
		return new Counter() {
			// ��������� ��������� ����� �� ����� ��������� ����������� ������������ ������������
			//������ ������������� ����������
			{
				Ckatt.outConsole("Counter()");
			}
			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.print(" " + name);     // ���������� ��������
				return count++;
			}
		};
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalInnerClass lic = new LocalInnerClass();
		 
		Counter c1 = lic.getCounter("���������");
		Counter c2 = lic.getCounter2("���������");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(c1.next());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(c2.next());
		}
	}

}
