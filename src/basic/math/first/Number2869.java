package basic.math.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2869 {
	public void snail() throws IOException {
		// A: 주간에 올라간 미터
		// B : 야간에 떨어진 미터.
		// V: 내가 올라야할 미터
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A;
		int B;
		int V;
		int day = 1;
		int dist = 0;

		String[] strs = bf.readLine().split(" ");
		A = Integer.parseInt(strs[0]);
		B = Integer.parseInt(strs[1]);
		V = Integer.parseInt(strs[2]);

		for (dist = 0; dist < V; day++) {
			dist += A;
			if (dist >= V) {
				break;
			} else {
				dist -= B;
			}
		}

		System.out.println(day);
		
		day = (V-B-1) / (A - B) + 1;
		System.out.println(day);
	}
}
