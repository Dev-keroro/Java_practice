package org.Dev_keroro.java.inheritance.example2;

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

class SubstractionalbeCalculator extends Calculator{
	public SubstractionalbeCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void substract() {
        System.out.println(this.left - this.right);
    }
}


public class CalculatorDemo4 {

	public static void main(String[] args) {
		SubstractionalbeCalculator c1 = new SubstractionalbeCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
