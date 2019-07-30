package org.Dev_keroro.java.inheritance.example2;

class Calculator1{
	int left, right;
	
	public Calculator1(int left, int right) {
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

class SubstractionalbeCalculator2 extends Calculator1{
	public SubstractionalbeCalculator2(int left, int right) {
		super(left, right);
	}
	
	public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo5 {

	public static void main(String[] args) {
		SubstractionalbeCalculator2 c2 = new SubstractionalbeCalculator2(10, 20);
		c2.sum();
		c2.avg();
		c2.substract();

	}

}
