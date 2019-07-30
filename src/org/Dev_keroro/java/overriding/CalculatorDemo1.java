package org.Dev_keroro.java.overriding;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
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

class SubstarationableCalculator extends Calculator{
	
	public SubstarationableCalculator(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("실행결과는 " + (this.left + this.right) + "입니다.");
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubstarationableCalculator c1 = new SubstarationableCalculator(20, 10);
		c1.sum();
		c1.avg();

	}

}
