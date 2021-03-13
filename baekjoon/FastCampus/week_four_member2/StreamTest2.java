package week_four_member2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	class Member{
		private String name;
		private int penaltyCount;
		private String nickName;
		
		public Member(String name, int penaltyCount, String nickName) {
			this.name = name;
			this.penaltyCount = penaltyCount;
			this.nickName = nickName;
		}
		
		public int getPenaltyCount() {
			return this.penaltyCount;
		}
	}
	public static void main(String[] args) {
		StreamTest2 outterClass = new StreamTest2();
		List<StreamTest2.Member> members = Arrays.asList(
				outterClass.new Member("기영이", 2,"바트심슨"),
				outterClass.new Member("기철이",5 ,"불꽃드립"),
				outterClass.new Member("오덕" ,0,"으어엌" ),
				outterClass.new Member("가방",6,"만두")
		
		);
		int sum = 0;
		sum = members.stream().mapToInt(s -> s.getPenaltyCount()).sum();
		System.out.println("기영이네 패널티 합은 : " +sum);
		
		
	}
}
