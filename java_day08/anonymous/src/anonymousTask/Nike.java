package anonymousTask;

public class Nike {
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("���� ���� ����.");
			return;
		}
		form.sell("�ȭ");
	}
}
