package basic.partString;

import java.io.IOException;

import runtime.check.CheckRunTime;

public class StringPartMain {
	public static void main(String[] args) throws IOException {
		Number1157 number1157 = new Number1157();
		CheckRunTime crt = new CheckRunTime();
		crt.getStart();
		
		//단어 공부 문제.
		number1157.studyWord();
		
		crt.getEnd();
		crt.getRunTime();
	}
}
