package b1991_트리순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {
	static Map<String , List<String>> map = new HashMap<String, List<String>>(); 
	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int depth  = Integer.parseInt(br.readLine());

		while(depth-- > 0 ) {
			String[] temp = br.readLine().split(" ");

			List<String> list = new ArrayList<String>();

			list.add(temp[1]);
			list.add(temp[2]);
			map.put(temp[0], list);
		}
		preorder("A");
	}
	
	static void preorder(String s) {
		if(s.equals(".")) {
			return;
		}
		
		System.out.println(s);
		preorder(map.get(s).get(0));
		preorder(map.get(s).get(1));
	}
	
	static void inorder(String s) {
		if(s.equals(".")) {
			return;
		}
		
		inorder(map.get(s).get(0));
		System.out.println(s);
		inorder(map.get(s).get(1));
	}




	static void postorder(String s) {
		if(s.equals(".")) {
			return;
		}
		postorder(map.get(s).get(0));
		postorder(map.get(s).get(1));
		System.out.println(s);
	}

}
