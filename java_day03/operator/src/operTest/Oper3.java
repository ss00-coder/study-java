package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��)	183 -> 183 ���
//			183.5 -> 183.5 ���
//		���� �����ڸ� ���!
		
//		��Ʈ!
//		�������� Ǯ�� ����
//		���Ĺ��ڷ� Ǯ�� �� ����
		double height = 0.0;
		String message = "Ű: ";
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		String format = null;
		String forLength = "";
		int length = 0;
		
		System.out.print(message);
		height = sc.nextDouble();
		check = height - (int)height == 0;
		forLength = height - (int)height + "";
		
		length = forLength.length() > 8 ? 8 : forLength.length();
		
		format = check ? "%.0fcm" : "%." + (length - 2) + "fcm";
		System.out.printf(format, height); 
	}
}

















