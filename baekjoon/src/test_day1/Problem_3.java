package test_day1;

public class Problem_3 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		for(int i = 0 ; i < array.length;i++) {
			max = (array[i] > max) ? array[i] : max;
			
		}
		System.out.println("max = "+ max);
	}
}
