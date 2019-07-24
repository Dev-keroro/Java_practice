package org.Dev_keroro.java.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;	//현재 반복문을 일단 종료하여 5는 출력하지 않는다.그 후 그다음 반복문을 계속하여 6부터 반복한다. 
			}
			System.out.println("Coding Everybody" + i);
				
		}
	}

}
