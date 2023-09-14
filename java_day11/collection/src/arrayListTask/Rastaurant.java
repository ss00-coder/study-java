package arrayListTask;

import java.util.ArrayList;

public class Rastaurant {
	ArrayList<Food> foods = DBConnecter.foods;
	
//	���� �߰�
	public void add(Food food) {
		foods.add(food);
	}
	
//	���� �̸����� ���� ���� ��ȸ
	public String findKindByName(String name) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				return food.getKind();
			}
		}
		return null;
	}
	
//	����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> findAllByKind(String kind){
		ArrayList<Food> results = new ArrayList<Food>();
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				results.add(food);
			}
		}
		return results;
	}
	
//	���� ���� ���� �� ���� 10% ���
	public void update(Food food) {
		for (Food foodInDatabase : foods) {
			if(foodInDatabase.getName().equals(food.getName())) {
				foodInDatabase.setKind(food.getKind());
				foodInDatabase.setPrice((int)(foodInDatabase.getPrice() * 1.1));
			}
		}
	}
	
//	����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public int getCountByKind(String kind) {
		int count = 0;
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				count ++;
			}
		}
		return count;
	}
}











