package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		
		int num1 = 0, num2 = 0, result = 0;
		String num1Msg = "ù��° ���� : ", num2Msg = "�ι�° ���� : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(num1Msg);
		num1 = Integer.parseInt(sc.next());
		
		System.out.print(num2Msg);
		num2 = Integer.parseInt(sc.next());
		
		result = num1 + num2;
		System.out.printf("%d + %d = %d", num1, num2, result);
		
	}
}















