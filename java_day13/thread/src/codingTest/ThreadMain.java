package codingTest;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		final int SIZE = 3;
		Runnable threadTask = new ThreadTask(); //�ڿ�
		Scanner sc = new Scanner(System.in);
		Thread[] arThread = new Thread[SIZE];
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i] = new Thread(threadTask);
		}

		System.out.println("��)3 1 2");
		System.out.print("�Է�[1~3] : ");
		for (int i = 0; i < arThread.length; i++) {
			arThread[i].setName(sc.next());
			arThread[i].start();
			try {arThread[i].join();} catch (InterruptedException e) {;}
		}
	}
}






