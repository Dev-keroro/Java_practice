package org.Dev_keroro.java.overloading;

public class OverlogindDemo2 extends OverloadingDemo1 {
	void A(String arg1, String arg2) {
		System.out.println("sub class: void A(String arg1, String arg2)");
	}
	
	void A(){
		System.out.println("sub class: void A()");
	}
	
	public static void main(String[] args) {
		OverlogindDemo2 od2 = new OverlogindDemo2();
		od2.A();
		od2.A("demo1");
		od2.A("coding", "evey");

	}

}
