package basic.math.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1929 {
	// 에라토스테네스의 체
	public void sosu() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		int[] num = new int[n+1];
		for (int i = 2; i <= n; i++) {
			num[i] = i;
		}
		
		for (int i = 2; i <= n; i++) {
			if(num[i] == 0) continue;
			for (int j = 2 * i; j <= n; j += i) {
				if(num[j] % i == 0) {
					num[j] = 0;
				}
			}
		}

		for (int i = m; i < num.length; i++) {
			if (num[i] != 0)
				System.out.println(num[i]);
		}

	}
}
