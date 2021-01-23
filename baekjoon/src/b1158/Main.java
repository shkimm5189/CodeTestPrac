package b1158;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st =new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 1 ;
		
		for(int i = 1 ; i <= N; i++) {
			que.offer(i);
		}
		sb.append("<");
		while(N > 0) {
			if(que.size() == 1) {
				sb.append(que.poll() + ">");
				break;
			}
			if(cnt == K) {
				sb.append(que.poll()+", ");
				cnt = 1;
				N--;
			} else {
				cnt++;
				que.offer(que.poll());
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
