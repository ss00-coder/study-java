package objectTest;

class Student {
	private int number;
	private String name;
	
	public Student() {;}
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Student) {
			Student another = (Student) obj;
			if(this.number == another.number) {
				return true;
			}
		}
		return false;
	}
	
	
}

public class ToStringTest {
	public static void main(String[] args) {
		Student �ѵ��� = new Student();
		
		�ѵ���.setNumber(1);
		�ѵ���.setName("�ѵ���");
		
		System.out.println(�ѵ���);
	}
}



















