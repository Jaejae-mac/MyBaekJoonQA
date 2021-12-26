package basic.partString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1157 {
	public void studyWord() throws IOException {
		//단어공부.
		//알파벳 대소문자로 된 단어가 주어지면, 
		//이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 
		//프로그램을 작성 
		//단, 대문자와 소문자를 구분하지 않는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] chars = (br.readLine().toLowerCase()).split("");
		int alpha[] = new int[26];//알파벳.
		int cnt = 0;
		int max = -1;
		int rst = 0;
		int tmp = 0;//aabbccc의 경우 a 와 b의 숫자가 동일해 ? 가 출력되는 걸 방지.
		//97을 빼서 0 부터 소문자 a 로 간주.
		for(int i = 0; i < chars.length; i++) {
			alpha[chars[i].charAt(0) - 97] += 1;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				rst = i;
			}else if(alpha[i] == max) {
				cnt++;
				tmp = max;
			}
		}
		if(tmp != max) {
			cnt = 0;//max 의 카운트가 단 한개일 경우 cnt 의 숫자를 0으로 조정하여 ? 출력 방지.
		}
		if(cnt > 0) {
			System.out.println("?");
		}else {
			System.out.println((char)(rst+65));
		}
		
	}
}
