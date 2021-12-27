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
		int[] num = new int[n - m + 1];
		int idx = 0;
		for (int i = m; i <= n; i++) {
			num[idx] = i;
			idx++;
		}
		idx = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 2 * i; j <= n; j += i) {
				for (int h = 0; h < num.length; h++) {
					if(num[h] == 0) continue;
					if (num[h] == j) {
						num[h] = 0;
					}
				}

			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0)
				System.out.println(num[i]);
		}

	}
}
