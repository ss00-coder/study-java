package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� ��
//		�� ������ ���� ���
//		next()�� ���.
		String message = "�� ������ �Է��ϼ���\n��)1 2 3";
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		String format = "%d * %d * %d = %d";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		num3 = Integer.parseInt(sc.next());
		
		result = num1 * num2 * num3;
		
		System.out.printf(format, num1, num2, num3, result);
	}
}













