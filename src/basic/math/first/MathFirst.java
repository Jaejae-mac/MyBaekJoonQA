package basic.math.first;

import java.io.IOException;

import runtime.check.CheckRunTime;

public class MathFirst {
	public static void main(String[] args) throws IOException {
		Number2869 number2869 = new Number2869();
		CheckRunTime crt = new CheckRunTime();
		crt.getStart();
		number2869.snail();
		crt.getEnd();
		crt.getRunTime();
	}
}
