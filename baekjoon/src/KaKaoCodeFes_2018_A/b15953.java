package KaKaoCodeFes_2018_A;
////
////import java.util.Scanner;
////
//////public class b15953 {
//////	public static void main(String[] args) {
//////		int T, a, b;
//////		Scanner sc = new Scanner(System.in);
//////		T= sc.nextInt();
//////		for(int i = 0; i < T; i++) {
//////			a = sc.nextInt();
//////			b = sc.nextInt();
//////			System.out.println(fesA(a)+fesB(b));
//////		}
//////	}
//////	public static int fesA(int a) {
//////		int[] arrA = {5000000,3000000,3000000,2000000,2000000,2000000,500000,500000,500000,500000,300000,300000,300000,300000,300000,100000,100000,100000,100000,100000,100000};
//////		if(a>0 && a<=21) {
//////			return arrA[a-1];
//////		}else {
//////			return 0;
//////		}
//////	}
//////	public static int fesB(int b) {
//////		int[] arrB = {5120000,2560000,2560000,1280000,1280000,1280000,1280000,640000,640000,640000,640000,640000,640000,640000,640000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000,320000};
//////		if(b>0 && b<=31) {
//////			return arrB[b-1];
//////		}else {
//////			return 0;
//////		}
//////		
//////	}
//////}
////
//////
////public class b15953 {
////	public static void main(String[] args) {
////		int [] a1 = {0, 500, 300, 200, 50, 30, 10};
////		int [] a1p = {0, 1,2,3,4,5,6};
////		int [] a2 = {0,512, 256, 128, 64, 32};
////		int [] a2p = {0,1,2,4,8,16};
////		
////		Scanner sc = new Scanner(System.in);
////		int T = sc.nextInt();
////		while(T-->0) {
////			int p1 = sc.nextInt();
////			int p2 = sc.nextInt();
////			int sang1=0, sang2=0;
////			
////			for (int i = 0; i < a1p.length; i++) {
////				p1 -= a1p[i];
////				if (p1 < 1) {
////					sang1 = a1[i]; 
////					break;
////				}
////			}
//			for (int i = 0; i < a2p.length; i++) {
//				p2 -= a2p[i];
//				if (p2 < 1) {
//					sang2 = a2[i]; 
//					break;
//				}
//			}
//			System.out.println((sang1+sang2) * 10000);
//		}
//	}
//}



public class b15953{
	public static void main(String[] args) {
		int min;
		String name = "JAN";
		
		for(int i = 0 ; i < name.length(); i++ ) {
			min = 0;
			if(name.charAt(i) != 'A'){
				min = Math.abs('A'-name.charAt(i));
				if(min > Math.abs(('Z'+1)-name.charAt(i)) ) {
					min = Math.abs(('Z'+1)-name.charAt(i));
				}
			}
			System.out.println(min);
		}
		
	}
}