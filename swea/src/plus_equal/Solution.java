package plus_equal;

import java.util.*;
import java.io.FilterInputStream;
public class Solution {
/*
 A, B, N 값 제공
 A += B 혹은 B += A 해서 N보다 크거나 같은 값을 만드는 것.
 +=연산을 몇번 하는지를 구하고 그 값을 리턴하는 것 
 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for(int t = 1; t<=T ; t++) {
			int cnt = 0;
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			while(a <= n && b <=n) {
				
				if(a > b) {
					b += a;
				} else {
					a += b;
				}
				
				cnt++;
				
			}		
			System.out.println(cnt);
		}
		
	}

}
