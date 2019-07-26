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
		
		c.static_static();		 //�ν��Ͻ��� �̿��Ͽ� Ŭ�����żҵ� ����(o) -> Ŭ���� �ɼҵ尡  Ŭ���� ���ȣ��(o)
		c.static_instance();	 //�ν��Ͻ��� �̿��Ͽ� Ŭ�����żҵ� ����(o) -> Ŭ���� �޼ҵ尡 �ν��Ͻ� ��� ȣ��(x)	
		
		c.instance_static();	 //�ν��Ͻ��� �̿��Ͽ� �ν��Ͻ��޼ҵ� ����(o) -> �ν��Ͻ��޼ҵ尡 Ŭ���� ���ȣ��(o)
		c.instance_instance();   //�ν��Ͻ��� �̿��Ͽ� �ν��Ͻ��޼ҵ� ����(o) -> �ν��Ͻ��޼ҵ尡 �ν��Ͻ� ���ȣ��(o)
		
		C1.static_static();		 //Ŭ������ �̿��Ͽ� Ŭ�����żҵ� ����(o)	-> Ŭ�����żҵ尡 Ŭ�������ȣ��(o)
		C1.static_instance();	 //Ŭ������ �̿��Ͽ� Ŭ�����޼ҵ� ����(o) -> Ŭ�����޼ҵ尡 �ν��Ͻ����ȣ�� (x)
		
		//C1.instance_static();	 //Ŭ������ �̿��Ͽ� �ν��Ͻ��޼ҵ� ����(x)
		//C1.instance_instance();//Ŭ������ �̿��Ͽ� �ν��Ͻ��޼ҵ� ����(x)
	}

}
