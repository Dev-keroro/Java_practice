package org.Dev_keroro.java.classinstance;

class C1{
	static int static_variable = 1;
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
	}
	
	static void static_instance() {
		//System.out.println(instance_variable);
	}
	
	void instance_static() {
		System.out.println(static_variable);
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {

	public static void main(String[] args) {
		C1 c = new C1();
		
		c.static_static();		 //인스턴스를 이용하여 클래스매소드 접근(o) -> 클랙스 케소드가  클래스 멤버호출(o)
		c.static_instance();	 //인스턴스를 이용하여 클래스매소드 접근(o) -> 클래스 메소드가 인스턴스 멤버 호출(x)	
		
		c.instance_static();	 //인스턴스를 이용하여 인스턴스메소드 접근(o) -> 인스턴스메소드가 클래스 멤버호출(o)
		c.instance_instance();   //인스턴스를 이용하여 인스턴스메소드 접근(o) -> 인스턴스메소드가 인스턴스 멤버호출(o)
		
		C1.static_static();		 //클래스를 이용하여 클래스매소드 접근(o)	-> 클래스매소드가 클래스멤버호출(o)
		C1.static_instance();	 //클래스를 이용하여 클래스메소드 접근(o) -> 클래스메소드가 인스턴스멤버호출 (x)
		
		//C1.instance_static();	 //클래스를 이용하여 인스턴스메소드 접근(x)
		//C1.instance_instance();//클래스를 이용하여 인스턴스메소드 접근(x)
	}

}
