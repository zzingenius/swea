package baekman;

import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			int profit = 0;
			int size= sc.nextInt();
			int max = 0;
			int[] info = new int[size];
			
			for(int i = 0 ; i <size;i++) {
				info[i] = sc.nextInt(); //배열에 값 집어넣기
			}
			
			max = info[size-1];
			for(int i =size-1;i>0;i--) {
				
				if(info[i-1] < max) {
					profit += (max - info[i-1]);
				}else {
					max = info[i-1];
				}
			}
			System.out.println("#" +t + " " + profit);
			
			
		}
	}

}
