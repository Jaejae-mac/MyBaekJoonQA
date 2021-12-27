package basic.math.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2581 {
	public void sosu() throws NumberFormatException, IOException {
		//주어진 n개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램.
		//1은 합성수.
		//소수 : 1과 자기자신으로만 나누어 떨어지는 자연수.
		int m = 0;//소수의 개수.
		int n = 0; //숫자의 개수.
		int sum = 0;
		int tmp = 0;
		int min = 0;
		boolean flag = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		m = Integer.parseInt(br.readLine());//시작숫자.
		n = Integer.parseInt(br.readLine());//종료숫자.
		
		for(int i = m; i <= n; i++) {
			if(i == 1) continue;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					tmp++;
				}
			}
			if(tmp == 1) {
				sum+=i;
				if(!flag) {
					min = i;
					flag = true;
				}
			}
			tmp = 0;
		}
		if(sum == 0) {
			sum = -1;
			System.out.println(sum);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}
}
