package test_day1;
public class Person	{
	private int age;
	private String name;
	private boolean isMarried;
	private int numberOfChildren;
	Person(int age , String name ,boolean isMarried, int numerOfChildren){
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.numberOfChildren = numerOfChildren;
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void printMyChildren() {
		if(!this.isMarried) {
			System.out.println("나는 미혼입니다.");
	 	} else {
	 		System.out.println("나는 기혼이고 자녀는 " +this.numberOfChildren+ "명 입니다.");
	 	}
		
	}
}

