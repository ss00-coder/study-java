package threadTask;

public class Zoo {
	
	public static void main(String[] args) {
//		���ٽ����� run() ������
		Runnable animal = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(400);} catch (InterruptedException e) {;}
			}
		};
		
//		������ animal ��ü�� makeSounds�� ����
		new Animal().makeSounds(animal);
	}
}
