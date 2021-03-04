


class A extends B{
	
}
class B extends A{
	
}
// 실행 불가  = Cycle detected: a cycle exists in the type hierarchy between A and B

// 상속은 부모 parent-child 관계가 되어야하는데 A클래스와 B클래스가 서로 상속 받게 되면 
// 순환적인 구조가 되므로 상속이 모호해진다. 


public class Main {
	public static void main(String[] args) {
		
		
	}
}
