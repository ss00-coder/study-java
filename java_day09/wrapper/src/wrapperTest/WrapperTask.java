package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
		//1, 12.5, 86.6F, 'Z', "Hi", false
		//�� 6���� ���� 6ĭ �迭�� ���
		Object[] arData = {1, 12.5, 86.6F, 'Z', "Hi", false};
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}
