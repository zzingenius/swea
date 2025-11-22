package d2.snail_num;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t<=T;t++) {
			int n = sc.nextInt();
			
			int[][] snail = new int[n][n];
			
			int x = 0 , y = 0 ; //시작 위치
			int num = 1; //넣을 숫자
			int dir = 0; //0 : 오른쪽, 1: 아래, 2:왼쪽, 3:위
			
			snail[x][y] = num;
			
			while(num < n*n) {
				if(dir == 0) {
					if(y + 1 < n && snail[x][y+1] == 0) y++;
					else {
						dir = 1;
						continue;
					}
				} else if(dir == 1) {
					if(x+1 <n && snail[x+1][y] == 0) x++;
					else {
						dir = 2;
						continue;
					}
				} else if(dir == 2) {
					if(y-1 >=0 && snail[x][y-1] == 0) y--;
					else {
						dir = 3;
						continue;
					}
				}else if( dir == 3) {
					if(x-1 >=0 && snail[x-1][y]==0) x--;
					else {
						dir = 0;
						continue;
					}
				}
				
				snail[x][y] = ++num;
			}
			
			System.out.println("#"+t);
			for(int i =0 ; i <n ; i++) {
				for(int j = 0; j < n ; j++) {
					System.out.print(snail[i][j]+ " ");
				}
				System.out.println();
			}
			
		}
	}

}
