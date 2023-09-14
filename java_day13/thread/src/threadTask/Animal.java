package threadTask;

public class Animal{
	
//	������ �ڿ��� animal�� ����
	public void makeSounds(Runnable animal) {
		String[] sounds = {"����", "�ſ�", "����"};
		Thread[] threads = new Thread[sounds.length];
		
//		�� �����忡 ������ �ڿ��� �����ϵ��� �����ϰ�, �� �̸��� �����Ҹ��� �����Ѵ�.
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, sounds[i]);
		}
		
		for (int i = 0; i < threads.length; i++) {
//			�� �����带 �����ٸ� �� �� 2���� �����尡 ���ÿ� start �ǰ�, ������ �����常 join�� ���� �����ش�.
			threads[i].start();
			if(i != 0) {
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
	}
	
}
