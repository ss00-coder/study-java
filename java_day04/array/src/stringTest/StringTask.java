package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		String message = "���� �Է� : ";
//		null�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
//		""�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
//		String string = null, result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(message);
//		string = sc.nextLine();
//		
////		����ڰ� �Է��� ���ڿ� ���̸�ŭ �ݺ��Ͽ�
//		for (int i = 0; i < string.length(); i++) {
////			�� ���ڸ� c�� ��´�.
//			char c = string.charAt(i);
////			�� ���ڰ� �빮���� ���
//			if(c >= 65 && c <= 90) {
////				�ҹ��ڷ� �����Ͽ� result�� �����Ѵ�.
//				result += (char)(c + 32);
//			}else if(c >= 97 && c <= 122){
////				�ҹ����� ���
////				�빮�ڷ� �����Ͽ� result�� �����Ѵ�.
//				result += (char)(c - 32);
//			}else {
////				���ĺ��� �ƴϸ� �״�� result�� �����Ѵ�.
//				result += c;
//			}
//		}
//		
//		System.out.println(result);
		
			
//		������ �ѱ۷� ����
//		��) 1024 -> �ϰ��̻�
		String message = "���� : ", result = "";
		String hangle = "�����̻�����ĥ�ȱ�";
		Scanner sc = new Scanner(System.in);
		String data = null;
		
		System.out.print(message);
		data = sc.next();
		
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		
		System.out.println(result);
		
		
		
//		int number = 0;
//		
//		System.out.print(message);
//		number = sc.nextInt();
//		
//		while(number != 0) { // ��� ����� ���� 0�� �� ������ �ݺ�
//			result = hangle.charAt(number % 10) + result;
//			number /= 10;
//		}
//		System.out.println(result);
	}
}

























