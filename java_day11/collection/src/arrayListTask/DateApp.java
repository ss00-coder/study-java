package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {

	public ArrayList<Love> loves = DBConnecter.loves;
	
//	�̻��� �߰�
	public void add(Love love) {
		loves.add(love);
	}
	
//	����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
	public ArrayList<Love> findAllByAge(int age) {
		ArrayList<Love> results = new ArrayList<Love>();
		for (Love love : loves) {
			if(love.getAge() == age) {
				results.add(love);
			}
		}
		return results;
	}
	
//	�̻����� ���� ����
	public void updateAge(Love love) {
		for (Love loveInDatabase : loves) {
			if(loveInDatabase.getNumber() == love.getNumber()) {
				loveInDatabase.setAge(love.getAge());
			}
		}
	}
	
//	�̻��� ���� �� ����
	public void sort() {
//		DB�� �ִ� �̻������� ���� ������ ������ ���
		ArrayList<Love> results = new ArrayList<Love>();
		
//		�̻������� ���̸� ���� �ڷᱸ��
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
//		loves���� ���̸� �����ͼ� ages�� �߰�
		for (Love love : loves) {
			ages.add(love.getAge());
		}
		
//		������������ ����
		Collections.sort(ages);
		
		for (int age : ages) {
			for (int i=0; i<loves.size(); i++) {
				if(loves.get(i).getAge() == age) {
					results.add(loves.get(i));
					loves.remove(loves.get(i));
				}
			}
		}
		loves = results;
	}
}














