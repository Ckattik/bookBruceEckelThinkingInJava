package thinkingJavaWeekend_10.nestedInterfaces.innerclasses;

import myClass.Ckatt;

// ������������ �� ���������� ������
public class InheritInner extends WithInner.Inner {

	// public InheritInner(); �� ��������������!

	public InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
		wi.super();
	}

	public static void main(String[] args) {

		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);

		Ckatt.outConsole(ii.toString());

	}

}
