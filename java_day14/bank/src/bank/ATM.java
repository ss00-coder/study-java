package bank;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ATM {
	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		Bank[] arBank = null;
		
		final int ACCOUNT_LENGTH = 6;
		
		String message = "1. ��������\n2. ��������\n3. īī����ũ\n4. ������";
//		���°���, �Ա��ϱ�, ����ϱ�, �ܾ���ȸ, ���¹�ȣ ã��(���ο� ���¹߱�, �ڵ��� ��ȣ�� ���� �̿밡��), ������
		String menu = "0. �ֽĽ���\n1. ���°���\n2. �Ա��ϱ�\n3. ����ϱ�\n4. �ܾ���ȸ\n5. ���¹�ȣ ã��\n6. ���� �ٽ� ����";
		Scanner sc = new Scanner(System.in);
		int index = 0, choice = 0, money = 0;
		String account = "", phoneNumber = null, password = null;
		Random random = new Random();
		Bank user = null, userCheck = null;
		
		
		while(true) {
//			������ �����Ѵ�.
			System.out.println(message);
			index = sc.nextInt();
			if(index == 4) {break;} // ������ ������ ������ while�� ��� Ż��!
			index--; // �ε����� �� �Ŷ� 1�� ���ش�.
			
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				if(choice == 6) {break;}
				
				if(choice == 1) { // ���� ����
					arBank = new Bank[] {new Shinhan(), new Kookmin(), new KaKao()};
					
					while(true) {
						for (int i = 0; i < ACCOUNT_LENGTH; i++) {
							account += random.nextInt(10);
						}
						userCheck = Bank.checkAccount(arrBank, arCount, account);
						if(userCheck == null) {break;}
					}
					user = arBank[index];
					account = index + account;
					user.setAccount(account);
					account = "";
					
					System.out.print("������: ");
					user.setName(sc.next());
					
					while(true) {
						System.out.print("�ڵ��� ��ȣ['-' ����]: ");
						phoneNumber = sc.next();
						
						phoneNumber = phoneNumber.replaceAll("-", "");
						if(phoneNumber.length() == 11) {
							if(phoneNumber.startsWith("010")) {
								userCheck = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
								if(userCheck == null) {
									break;
								}
							}
						}
						System.out.println("�߸��� �ڵ��� ��ȣ�Դϴ�.");
					}
					user.setPhoneNumber(phoneNumber);
					
					while(true) {
						System.out.print("��й�ȣ[4�ڸ�]: ");
						password = sc.next();
						if(password.length() == 4) {
							break;
						}
						System.out.println("��й�ȣ�� 4�ڸ��� �������ּ���.");
					}
					user.setPassword(password);
					
					arrBank[index][arCount[index]] = user;
					arCount[index]++;
					System.out.println("ȯ���մϴ� " + user.getName() +" ����, ���°����� �Ϸ�Ǿ����ϴ�.");
					System.out.println("���¹�ȣ: " + user.getAccount());
					continue;
					
				}else if(choice == 5) { // ���¹�ȣ ã��
					System.out.print("�ڵ��� ��ȣ: ");
					phoneNumber = sc.next();
					
					user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
					
					if(user != null) {
						System.out.print("��й�ȣ: ");
						password = sc.next();
						
						if(user.getPassword().equals(password)) {
							while(true) {
								for (int i = 0; i < ACCOUNT_LENGTH; i++) {
									account += random.nextInt(10);
								}
								userCheck = Bank.checkAccount(arrBank, arCount, account);
								if(userCheck == null) {break;}
							}
							System.out.println("���ο� ���¹�ȣ�� ����Ǿ����ϴ�.");
							System.out.println("���¹�ȣ: " + account);
							account = user.getAccount().charAt(0) + account;
							user.setAccount(account);
						}
					}else {
						System.out.println("���� �ڵ��� ��ȣ�Դϴ�.");
					}
					continue;
				}
				
				System.out.print("���¹�ȣ: ");
				account = sc.next();
				
				System.out.print("��й�ȣ: ");
				password = sc.next();
				
				user = Bank.login(arrBank, arCount, account, password);
				
				switch(choice) {
				case 0: // �ֽ� ����
					if(!(user instanceof KaKao)) {
						System.out.println("�ֽ� ���񽺴� ���� īī����ũ������ �̿� �����մϴ�.");
						break;
					}
					String[] buttons = {"�ŵ��ϱ�", "������"};
					KaKao kakaoUser = (KaKao)user;
					Thread stockThread = new Thread(kakaoUser);
					
					if(kakaoUser.getStockMoney() == 0) {
						System.out.print("���ھ�: ");
						kakaoUser.setPrincipal(sc.nextInt());
						kakaoUser.setStockMoney(kakaoUser.getPrincipal());
						kakaoUser.setMoney(kakaoUser.getMoney() - kakaoUser.getPrincipal());
						
						stockThread.start();
					}					
					
					synchronized (kakaoUser) {
						kakaoUser.isExit = false;
						kakaoUser.notify();
					}
					choice = JOptionPane.showOptionDialog(null, "", "�ŵ� ���α׷�", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);
					if(choice == 0) { // �ŵ��ϱ�
						kakaoUser.setMoney(kakaoUser.getMoney() + kakaoUser.getStockMoney());
						kakaoUser.setStockMoney(0);
						System.out.println("���� �ܾ�: " + kakaoUser.getMoney() + "��");
						stockThread.interrupt();
					}else { // ������
						kakaoUser.isExit = true;
					}
					break;
				case 2: // �Ա��ϱ�(���¸� ������ ���࿡���� �Ա� ���� '���¹�ȣ�� ���� �������� ǥ��')
					if(user != null) {
						if(!user.getAccount().startsWith(index + "")) {
							System.out.println("���¹�ȣ�� ������ ���࿡���� �Ա� ���� �̿��� �����մϴ�.");
							break;
						}
						
						System.out.print("�Աݾ�: ");
						money = sc.nextInt();
						if(money > 0) {
							user.deposit(money);
							System.out.println(money + "�� �Ա� �Ϸ�");
						}else {
							System.out.println("�Աݾ��� �ٽ� Ȯ�����ּ���.");
						}
					}else {
						System.out.println("�α��� ����");
					}
					break;
					
				case 3: // ����ϱ�
					if(user != null) {
						System.out.print("��ݾ�: ");
						money = sc.nextInt();
						if(money > 0) {
							if(user.getMoney() >= (user instanceof Kookmin ? money * 1.5 : money)) {
								user.withdraw(money);
							}else {
								System.out.println("��ݾ��� �ٽ� Ȯ�����ּ���.");
							}
						}
					}else {
						System.out.println("�α��� ����");
					}
					break;
				case 4: // �ܾ� ��ȸ
					if(user != null) {
						System.out.println("���� �ܾ�: " + user.showBalance());
					}else {
						System.out.println("�α��� ����");
					}
					break;
				}
			}
		}
	}
}













