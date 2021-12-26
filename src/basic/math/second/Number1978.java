package basic.math.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1978 {
	public void sosu() throws NumberFormatException, IOException {
		//주어진 n개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램.
		//1은 합성수.
		//소수 : 1과 자기자신으로만 나누어 떨어지는 자연수.
		//첫째줄에 숫자의 개수가 주어짐.
		//둘째 줄에 숫자가 나열됨.
		int cnt = 0;//소수의 개수.
		int numCnt = 0; //숫자의 개수.
		int[] num; // 숫자가 들어갈 배열.
		int tmp = 0; // 나누어 떨어지는 수가 더 있는지 체크.
		String[] numStr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numCnt = Integer.parseInt(br.readLine());
		num = new int[numCnt];//갯수만큼 배열 생성.
		numStr = br.readLine().split(" ");
		for(int i = 0; i < numStr.length; i++) {
			num[i] = Integer.parseInt(numStr[i]);
		}
		for(int i = 0; i < numCnt; i++) {
			if(num[i] == 1) continue;
			for(int j = 2; j <= num[i]; j++) {
				if(num[i] % j == 0) {
					tmp++;
				}
			}
			if(tmp == 1) cnt++;
			tmp = 0;
		}
		System.out.println(cnt);
		
	}
}
