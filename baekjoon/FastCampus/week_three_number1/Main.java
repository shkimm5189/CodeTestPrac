
class DuckTyping implements Duck{
	@Override
	public void flying() { System.out.println("푸드득"); }
	@Override
	public void walking() { System.out.println("뒤뚱 뒤뚱"); }
}

class 닭 implements Duck{
	@Override
	public void flying() { System.out.println("호다닭!"); }
	@Override
	public void quack() { System.out.println("꼬끼오!"); }
	@Override
	public void walking() { System.out.println("뒤뚱 뒤뚱"); }	
}

public class Main {
	public static void main(String[] args) {
		Duck duckTyping = new DuckTyping();
		duckTyping.flying();
		duckTyping.quack();
		duckTyping.walking();
		
		Duck chick = new 닭();
		chick.flying();
		chick.quack();
		chick.walking();
	}
}
