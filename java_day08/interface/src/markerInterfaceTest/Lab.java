package markerInterfaceTest;

public class Lab {
	
	public void checkKinds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof CarnivoreMarker) {
				System.out.println("���ĵ���");
			}else if(animals[i] instanceof HerbivoreMarker) {
				System.out.println("�ʽĵ���");
			}else {
				System.out.println("��ĵ���");
			}
		}
	}
	
	public static void main(String[] args) {
		Animal[] animals = {
				new Bear(),
				new Tiger(),
				new Dog(),
				new Cow()
		};
		new Lab().checkKinds(animals);
	}
}













