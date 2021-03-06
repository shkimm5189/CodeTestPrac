package week_three_number1;
public interface Duck {
	final String quack = "꽑 꽑!";
	public default void quack() {
		System.out.println(quack);
	}
	public void walking();
	public void flying();
}
