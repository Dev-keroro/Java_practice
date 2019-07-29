package org.Dev_keroro.java.inheritance.example1;

class DivisionableCalculator extends MultiplicationalbeCalculator{
	public void division(){
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		DivisionableCalculator c3 = new DivisionableCalculator();
		c3.setOperand(10, 20);
		c3.sum();
		c3.avg();
		c3.multiplication();
		c3.division();

	}

}
