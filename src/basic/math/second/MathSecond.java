package basic.math.second;

import java.io.IOException;

import runtime.check.CheckRunTime;

public class MathSecond {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CheckRunTime crt = new CheckRunTime();
		Number1978 number1978 = new Number1978();
		Number2581 number2581 = new Number2581();
		crt.getStart();
		//소수찾기.
//		number1978.sosu();
		number2581.sosu();
		
		crt.getEnd();
		crt.getRunTime();
	}
	
	
}
