package org.Dev_keroro.java.Scope;

public class ScopeDemo {
	static void a() {
		int i = 0;				// main �� i�� ������ �������� ��ȿ������ a()�� ���� �Ǳ� ������ main�� i���� ������ �� �� ����.
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
