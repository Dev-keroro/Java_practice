package org.Dev_keroro.java.Scope;

class C{
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(v);			//지역변수
		System.out.println(this.v);		//c1 인스턴스 전역변수
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
