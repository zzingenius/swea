package d2.baekman;

import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			long profit = 0;
			int size= sc.nextInt();
			int max = 0;
			int[] info = new int[size];
			
			for(int i = 0 ; i <size;i++) {
				info[i] = sc.nextInt(); //배열에 값 집어넣기
			}
			
			max = info[size-1]; //마지막 날을 최대값으로 지정
			for(int i =size-1;i>0;i--) {
				if(info[i-1] < max) {
					//마지막 날의 값이 최댓값이 맞을 시 팔아서 이익 실현
					profit += (max - info[i-1]);
				}else {
					//최댓값 새로 지정
					max = info[i-1];
				}
			}
			System.out.println("#" +t + " " + profit);
		}
	}

}
