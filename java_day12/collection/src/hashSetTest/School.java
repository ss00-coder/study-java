package hashSetTest;

import java.util.HashSet;

public class School {
	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student(1, "�ѵ���"));
		studentSet.add(new Student(1, "�ѵ���"));
		
		System.out.println(new Student(1, "�ѵ���").equals(new Student(1, "�ѵ���")));
		System.out.println(studentSet.contains(new Student(2, "�ѵ���")));
		
		System.out.println(studentSet);
	}
}
