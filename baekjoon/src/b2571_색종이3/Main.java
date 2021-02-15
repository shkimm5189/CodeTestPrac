package b2571_색종이3;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 
//색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
//두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
//색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
/*
 * 최대넓이 구해야함
 */
public class Main {
	public static void main(String[] args) throws IOException{
		int[][] board = new int[101][101];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		// 입력한 좌표의 10 * 10 색종이 붙이기
		while(num-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			int startX = Integer.parseInt(st.nextToken()) ;
			int startY = Integer.parseInt(st.nextToken()) + 10;
			for(int i = startX ;  i < startX+10;i++) {
				for(int j =startY; j >startY-10 ; j--) {
					board[i][j] += 1;
				}
			}	
		}
		int cnt = 0 ;
		for(int i = 0 ; i < board.length; i++) {
			for(int j = 0 ; j <board[i].length; j++) {
				if(board[i][j]>1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}

