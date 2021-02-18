package b1931_회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



class Council implements Comparable<Council>{
	
	int startT;
	int endT;
	
	Council(int startT,int endT){
		this.startT = startT;
		this.endT = endT;
	}

	@Override
	public int compareTo(Council o) {
		if(this.endT > o.endT) {
			return 1;
		} else if(this.endT == o.endT) {
			if(this.startT > o.startT) {
				return 1;
			}
		}
		return -1;
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Council[] council = new Council[N]; 
		for(int  i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			council[i] =  new Council(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(council);
		int cnt = 1 ;
		int startT = council[0].startT;
		int endT = council[0].endT;
		for(int i = 1 ; i < council.length; i++) {
			if(endT <= council[i].startT) {
				startT = council[i].startT;
				endT = council[i].endT;
				cnt++;
			}

		
		}

		System.out.println(cnt);
	}
}
