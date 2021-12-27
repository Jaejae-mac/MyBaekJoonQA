package basic.math.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11653 {
	//소인수 분해.
	public void factorization() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(bf.readLine());
			int i = 2;
			while(num != 1) {
				if(num % i == 0) {
					num = num / i;
					System.out.println(i);
					i = 2;
				}else {
					i++;
					continue;
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
