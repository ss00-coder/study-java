package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "�ѵ���");
		boolean check = student.equals(new Student(1, "�ѵ���"));
		
		System.out.println(check);
		
	}
}
