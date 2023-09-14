package guiTest;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI_TEST extends Frame implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "������1!":
			System.out.println("�� ù ��° ��ư ���Ⱦ�!");
			break;
		case "������2!":
			System.out.println("�� �� ��° ��ư ���Ⱦ�!");
			break;
		}
	}
	
	public GUI_TEST() {
		super("�׽�Ʈ");
		Button button1 = new Button("������1!");
		Button button2 = new Button("������2!");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		this.add(button1);
		this.add(button2);
		
		setLayout(new FlowLayout());
		setSize(500, 600);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - this.getWidth()) / 2;
		int y = (d.height - this.getHeight()) / 2;
		
		setLocation(x, y);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI_TEST();
	}
}





