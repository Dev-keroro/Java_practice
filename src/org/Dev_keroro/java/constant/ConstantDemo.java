package org.Dev_keroro.java.constant;

public class ConstantDemo {

	public static void main(String[] args) {
		//int a = 2.2;			/* int는 정수형만 사용할수 있다. */
		//float b = 2.2;		/* java에서는 기본적으로 실수상수는 double형을 채택한다.*/
		double c = 2.2;
		float d = 2.2F;			/*F로 float형으로 명시적 선언을 할수 있다. */
		//int e = 2147483648;	/* int의 범위를 넘어섰다. */
		//long f = 2147483648;	/* java에서는 정수를 기본 int형으로 채택하기 때문에 에러가 발생한다 . */
		long g = 2147483648L;	/* L로 long형으로 명시적 선언을 할수 있다 */
		
		byte h = 100;			/*java에는 byte와 short형은 int로 사용되는 것을 허용한다.*/
		short i = 200;			/*참고 byte: 1byte, short: 2byte, int: 4byte */
	}

}
