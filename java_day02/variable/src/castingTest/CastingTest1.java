package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		�ڵ� ����ȯ
		System.out.println(11 / 9);
		System.out.println(11.0 / 9);
		
//		���� ����ȯ
		System.out.println((double)11 / 9);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
//		8.43 + 2.59 = 10
		System.out.println((int)8.43 + (int)2.59);
	}
}
