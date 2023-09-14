package job;

import java.util.Random;
import java.util.Scanner;

// Ÿ¥
// ����(��, ��, ����)
// ���� ����� ���
// ���: ȣ��, ����, ����, Ÿ¥
// �и� ���� �� �߰� �ݾ� ����
// ���� �а� ���� �� ���� �� �� ��
// ����, �� ����
// �ǵ�: 1��
// ���� 3ȸ �¸� �� ��� ���

public class CardMaster {
	String nickname;
	int money;
	int level;
	int deck;
	int winCount;
	
	public CardMaster() {;}

	public CardMaster(String nickname, int money) {
		this.nickname = nickname;
		this.money = money;
	}
	
//	�ǵ� �� �߰� �ݾ��� �޴´�.
	void deposit(int money) {
		this.money -= money;
	}
	
//	��(60) ��(30) ����(10)
	void getMyDeck() {
		Random random = new Random();
		int[] rating = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2};
		this.deck = rating[random.nextInt(rating.length)];
	}
	
	int battle(CardMaster cardMaster) {
//		-1 : draw, 0 : lose, 1 : win
		boolean draw = this.deck == cardMaster.deck;
		boolean lose = this.deck > cardMaster.deck;
		boolean win = this.deck < cardMaster.deck;
		boolean[] status = {draw, lose, win};
		int result = 0;
		
		for (int i = -1; i < 2; i++) {
			if(status[1 + i]) {
				result = i;
				break;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String[] arLevel = {"ȣ��", "����", "����", "Ÿ¥"};
		String[] decks = {"����", "��", "��"};
		String[] status = {"���º�", "�й�", "�¸�"};
		String message = "1. ����ϱ�\n2. ���� ����\n3. ������";
		String depositMessage = "1. �߰��ݾ� �Է�\n2. �߰��ݾ� ���� ����";
		int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0;
		Scanner sc = new Scanner(System.in);
		CardMaster me = new CardMaster("���", 0);
		CardMaster computer = new CardMaster("�Ʊ�", 0);
		String title = null;
		
		while (true) {
			title = "[" + arLevel[me.level] + "]" + me.nickname + " �ڻ�: " + me.money + "\n"
					+ "[" + arLevel[computer.level] + "]" + computer.nickname + " �ڻ�: " + computer.money;
			System.out.println(title);
			System.out.println(message);
			choice = sc.nextInt();
			
			if(choice == 3) {break;}
			
			switch(choice) {
			case 1: // ����ϱ�
				me.deposit(defaultMoney);
				computer.deposit(defaultMoney);
				money += defaultMoney * 2;
				me.getMyDeck();
				computer.getMyDeck();
				System.out.println("���� ��: " +decks[me.deck]);
				
				System.out.println(depositMessage);
				choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.print("�߰� �ݾ�: ");
					depositMoney = sc.nextInt();
					me.deposit(depositMoney);
					computer.deposit(depositMoney);
					money += depositMoney * 2;
				}
				
				result = me.battle(computer);
				System.out.println(status[result + 1]);
				
				switch(result) {
				case -1: // ���º�
					while(result == -1) {
						money *= 2;
						System.out.println(money);
						me.getMyDeck();
						System.out.println("���� ��: " +decks[me.deck]);
						System.out.println("1. ��\n2. ����");
						choice = sc.nextInt();
						if(choice == 2) { 
							result = 0; 
							System.out.println(status[result + 1]);
							computer.money += money;
							me.money -= money - defaultMoney - depositMoney;
							me.winCount = 0;
							computer.winCount++;
							break;
						}
						result = me.battle(computer);
						System.out.println(status[result + 1]);
						
						switch(result) {
						case 0: // �й�
							computer.money += money;
							me.money -= money - defaultMoney - depositMoney;
							me.winCount = 0;
							computer.winCount++;
							break;
						case 1: // �¸�
							me.money += money;
							computer.money -= money - defaultMoney - depositMoney;
							me.winCount++;
							computer.winCount = 0;
							break;
						}
					}
					break;
				case 0: // �й�
					computer.money += money;
					me.money -= money - defaultMoney - depositMoney;
					me.winCount = 0;
					computer.winCount++;
					break;
				case 1: // �¸�
					System.out.println(money);
					me.money += money;
					computer.money -= money - defaultMoney - depositMoney;
					me.winCount++;
					computer.winCount = 0;
					break;
				}
				if(me.winCount > 2 && me.level < 3) {
					me.level++;
				}
				if(computer.winCount > 2 && computer.level < 3) {
					computer.level++;
				}
				break;
			case 2: // ���� ����
				break;
			default: // �� ��
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		
		
	}
}









