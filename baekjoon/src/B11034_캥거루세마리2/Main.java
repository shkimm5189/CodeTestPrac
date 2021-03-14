package B11034_캥거루세마리2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int first = Integer.parseInt(st.nextToken());
		int mid = Integer.parseInt(st.nextToken());
		int last = Integer.parseInt(st.nextToken());
		int cnt = 0;
		while(true) {
			if(Math.abs(first - mid) == 1 && Math.abs(last - mid)== 1) {
				break;
			}
			if(Math.abs(first - mid) < Math.abs(last - mid)) {
				first = mid;
				mid = last - 1;
			}else {
				last = mid;
				mid = first + 1;
			}
			System.out.println(first+" "+mid+" "+last);
			cnt ++;
		}
		System.out.println(cnt);
	}


}
