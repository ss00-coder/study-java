package arrayListTask;

import java.util.ArrayList;

public class Market {
	public ArrayList<Fruit> fruits = DBConnecter.fruits;
	
// ���� �˻�
	public Fruit checkFruit(String name) {
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {
				return fruit;
			}
		}
		return null;
	}
	
//	���� �߰�
	public void add(Fruit fruit) {
		fruits.add(fruit);
	}
	
//	���� ����
	public void remove(String name) {
		Fruit fruit = checkFruit(name);
		fruits.remove(fruit);
	}
	
//	���� ������ ��� ���ݺ��� ���� �� �˻�
	public boolean checkPrice(int price) {
		return getAverage() > price;
	}
	
//	��� ����
	private double getAverage() {
		int total = 0;
		
		for (Fruit fruit : fruits) {
			total += fruit.getPrice();
		}
		
		return (double)total / fruits.size();
	}
	
//	���� ��ü ��ȸ
	public ArrayList<Fruit> selectAll() {
		return fruits;
	}
	
//	���� �̸����� ���� ��ȸ
	public int findByName(String name) {
		return checkFruit(name).getPrice();
	}
}











