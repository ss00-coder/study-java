package arrayListTask;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		Love[] loves = {
			new Love(1, "ȫ�浿", 20),	
			new Love(2, "�̼���", 25),	
			new Love(3, "�庸��", 20),	
			new Love(4, "�����ż�", 23),	
		};
		
		for (int i = 0; i < loves.length; i++) {
			dateApp.add(loves[i]);
		}
		
		dateApp.sort();
		
		System.out.println(dateApp.loves);
	}
}















