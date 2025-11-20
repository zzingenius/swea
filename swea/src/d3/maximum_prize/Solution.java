package d3.maximum_prize;
import java.util.*;
public class Solution {
	
	static int max;
	static HashSet<String> visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트 케이스 개수
		
		for(int tc = 1 ; tc<=T; tc++) {
			String num = sc.next();
			int k = sc.nextInt();
			
			char[] arr = num.toCharArray();
			
			max = 0;
			
			visited = new HashSet<>();
			
			dfs(arr, k);
			
			System.out.println("#" + tc + " " + max);
		}		
	}
	static void dfs(char[] arr, int k) {
		if(k==0) {
			//교환 종료 시 현재 값과 max 값 크기 비교 후 값 리턴
			int val = Integer.parseInt(new String(arr)); 
			
			if(val > max)
				max = val;
			return;
		}
		
		String state = new String(arr) + "/" + k;
		
		//이미 방문한 적 있으면 종료
		if(visited.contains(state))
			return;
		visited.add(state);

		//배열을 돌며 모든 자리 교환
		for(int i = 0; i < arr.length  - 1 ; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				swap(arr, i , j);
				dfs(arr, k - 1);
				swap(arr, i ,j);
			}
		}
	}
	//위치 바꾸기
	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
