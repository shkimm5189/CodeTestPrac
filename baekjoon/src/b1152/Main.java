package b1152;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		String[] str = br.readLine().split(" ");
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		List<String> list = new ArrayList<>();
//		for(String s : str) {
//			if(s.equals(" ")) {
//				System.out.println("asd");
//				continue;
//			} 
//			System.out.println(s);
//			list.add(s);
//		}
		
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		bw.write(list.size()+"\n");
		bw.flush();
		bw.close();
	}
}
