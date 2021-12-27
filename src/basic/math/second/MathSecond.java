package basic.math.second;

import java.io.IOException;

import runtime.check.CheckRunTime;

public class MathSecond {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CheckRunTime crt = new CheckRunTime();
		Number1978 number1978 = new Number1978();
		Number2581 number2581 = new Number2581();
		Number11653 number11653 = new Number11653();
		crt.getStart();
		//소수찾기.
//		number1978.sosu();
//		number2581.sosu();
		number11653.factorization();
		
		crt.getEnd();
		crt.getRunTime();
	}
	
	
}
