package interfaceTest;

public class Puppy implements Pet {

	@Override
	public void giveYourHand() {
		System.out.println("�����!");
	}

	@Override
	public void bang() {
		System.out.println("���´�.");
	}

	@Override
	public void sitDown() {
		System.out.println("�ɴ´�.");
	}

	@Override
	public void waitNow() {
		System.out.println("��ٸ���.");
	}

	@Override
	public void getNose() {
		System.out.println("�հ����� �ڸ� �ִ´�.");
	}

}
