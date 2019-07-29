package org.Dev_keroro.java.construct;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {		//생성자(construtor),클래스 명과 동일한 메소드, 클래스가 생성될 때 자동으로 생성자가 가장 먼저 실행되도록 약속되어있다.
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);	//new Calculator <- 는 클래스가 아니라 생성자!!
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();

	}

}
