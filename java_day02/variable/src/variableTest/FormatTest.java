package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "�ѵ���";
		int age = 20;
		double height = 123.55;
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d��\n", age);
		System.out.printf("������ : %.2fkg\n", height); // �ݿø�		
	}
}
