package codingTest;

public class ThreadTask implements Runnable{
	// ���ѽð� : 1�ð�
	// 3���� �����尡 �ִ�.
	// Thread1, Thread2, Thread3
	// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

	// �Է� ��) 3 1 2
	// ��� ��) third first second

	// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

	// Thread1 : third
	// Thread2 : first
	// Thread3 : second

	// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
	
	public static int count;
	
	public ThreadTask() {;}

	public void printFirst(Runnable first) {
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {
		third.run(); // ���� ����
	}
	
	@Override
	public void run() {
		switch(Thread.currentThread().getName()) {
		case "1":
			printFirst(() -> {System.out.println("Thread" + ++count + " : first");});
			break;
		case "2":
			printSecond(() -> {System.out.println("Thread" + ++count + " : second");});
			break;
		case "3":
			printThird(() -> {System.out.println("Thread" + ++count + " : third");});
			break;
		}
	}
	
}





