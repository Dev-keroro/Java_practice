package org.Dev_keroro.java.Scope;

public class ScopeDemo {
	static void a() {
		int i = 0;				// main 의 i와 동일한 변수지만 유효범위가 a()에 국한 되기 때문에 main의 i에는 영향을 줄 수 없다.
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}

}
