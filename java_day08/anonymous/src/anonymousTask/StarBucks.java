package anonymousTask;

// ��Ÿ���� ����
public class StarBucks {
//	�������� ó���� �� �� ����� ��
//	���翡�� ���س��� ����� �ۼ��Ͽ� form���� �����Ѵ�. 
	public void register(Form form) {
//		�������� �޴��� ���� ���� �� �˻�
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		
//		���� ���� ������ ���
		if(form instanceof FormAdapter) {
			System.out.println("���ᳪ�� �����Դϴ�.");
			return;
		}
//		���� �Ǹ� ������ ��� �Ǹ� ��� �˻�
		form.sell("�Ƹ޸�ī��");
	}
}
