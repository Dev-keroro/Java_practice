package org.Dev_keroro.java.inheritance.example1;

class MultiplicationalbeCalculator extends Calculator{
	public void multiplication(){
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultiplicationalbeCalculator c2 = new MultiplicationalbeCalculator();
		c2.setOperand(10, 20);
		c2.sum();
		c2.avg();
		c2.multiplication();

	}

}
