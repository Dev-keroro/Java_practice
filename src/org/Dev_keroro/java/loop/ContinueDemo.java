package org.Dev_keroro.java.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;	//���� �ݺ����� �ϴ� �����Ͽ� 5�� ������� �ʴ´�.�� �� �״��� �ݺ����� ����Ͽ� 6���� �ݺ��Ѵ�. 
			}
			System.out.println("Coding Everybody" + i);
				
		}
	}

}
