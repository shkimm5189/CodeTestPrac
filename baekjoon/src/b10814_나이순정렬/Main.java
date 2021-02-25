package b10814_나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


class Person {
	int registNum;
	int age;
	String name;
	
	Person(int registNum, int age , String name){
		this.registNum = registNum;
		this.age = age;
		this.name = name;
	}
	
	
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int idx =0 ;
		int N = Integer.parseInt(br.readLine());
		Person[] person = new Person[N];
		for(int i = 0 ; i < person.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			person[i] = new Person(idx++,Integer.parseInt(st.nextToken()),st.nextToken());
		}
		
		Arrays.sort(person,new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if(p1.age > p2.age) {
					return 1;
				} else if( p1.age == p2.age) {
					if(p1.registNum > p2.registNum) return 1;
				}
				return -1;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Person p : person) {
			sb.append(p.age).append(" ").append(p.name).append("\n");
		}
		System.out.println(sb);
	}
}
