package controllStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		String title = "������ ����ּ���!";
		String menu = "1.������\n2.������\n3.�����\n4.���";
		String result = null;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(title);
		System.out.println(menu);
		choice = sc.nextInt();

		switch(choice) {
		case 1:
			result = "Red";
			break;
		case 2:
			result = "Black";
			break;
		case 3:
			result = "Yellow";
			break;
		case 4:
			result = "White";
			break;
		default:
			result = "�ٽ� �Է����ּ���.";
			break;
		}
		
		System.out.println(result);
	}
}


















