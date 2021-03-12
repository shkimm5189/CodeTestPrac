package week_four_number1;

import java.util.HashSet;
import java.util.Set;

class Student{
	int no;
	String name;
	public Student(int no ,String name) {
		this.no = no;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.no;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if( obj instanceof Student) {
			Student stu = (Student)obj;
			return this.hashCode() == stu.hashCode();
		}
		return false;
	}
	
}
public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Student s1 = new Student(21533, "kim");
		Student s2 = new Student(21533, "kim");
		
		Set<Student> personSet = new HashSet<>();
		personSet.add(s1);
		personSet.add(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(personSet.size() == 1);
	}
}
