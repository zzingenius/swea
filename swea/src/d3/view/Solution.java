package d3.view;
import java.util.*;
public class Solution {
	public static void main(String[] args) {

		int T = 10; //테스트 케이스 총 개수
		Scanner sc = new Scanner(System.in);
		int size; //배열 개수
		int focus; // 기준이 되는 아파트 층수
		
		for(int test_case = 1; test_case <= T; test_case++ ) {
			long view = 0; //총 확보된 조망권
			int right = 0;
			int left = 0;
			
			size = sc.nextInt();
			
			int[] building = new int[size];
			for(int i= 0 ; i < size; i++) {
				building[i] = sc.nextInt(); //배열에 값 집어넣기
			}
			
			for(int i = 2 ; i <= size-3 ; i++) {
				int highest = Math.max(building[i-2], Math.max(building[i-1], Math.max(building[i+1], building[i+2])));
				
				if(building[i] - highest > 0)
					view += building[i] - highest;

			}
			System.out.println("#" + test_case + " " + view);
		}
	}
}
