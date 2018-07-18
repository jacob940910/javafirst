package event;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

//������ Ŭ����
public class MyWindow extends JFrame {
	public MyWindow() {
		//��ġ�� ũ�⼳��
		setBounds(500, 500, 1000, 1000);
		//������
		setTitle("������ �̿��� ������");
		//�����ư �̺�Ʈó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�г��� ����
		JPanel panel = new JPanel();
		
		ImageIcon icon = new ImageIcon("C:\\Users\\503-19\\Desktop\\�ڿ�\\�̹���\\America.png");
		JLabel label = new JLabel(icon);
		//label.setIcon(icon);
		label.setToolTipText("�ȳ��ϼ���");
		
		TitledBorder border = new TitledBorder("��輱");
		
		
		label.setBorder(border);
		panel.add(label);
		
		JButton btn = new JButton("��ư");
		panel.add(btn);
		
		//�г��� �����ӿ� ����
		add(panel);
		
		//ȭ�� ���
		setVisible(true);
		
		//�׸� ���� �̸��� �迭�� �����
		//�迭�� ����� ũ�⺯���� �ȵ˴ϴ�.
		String [] images = {
				"0.png","1.png","2.png","3.png","4.png"
		};
		
		//����Ʈ�� ũ�� ������ ������ �迭�Դϴ�.
		ArrayList<String> list = new ArrayList<String>();
		list.add("0.png");
		list.add("1.png");
		list.add("2.png");
		list.add("3.png");
		list.add("4.png");
		
		//�̹����� ����Ǵ� ���ȿ��� �ٸ� �۾��� �����ؾ��ϹǷ� �̹��� ������ ���������
		Thread th = new Thread() {
			public void run() {
				int idx = 0;
				while(true) {
					try {
						//50�� �ֱ� 
						Thread.sleep(200);
						//�迭�� �ݺ��� �����
						/*
						ImageIcon icon = new ImageIcon("C:\\Users\\503-19\\Desktop\\�ڿ�\\�̹���\\"
						+ images[idx%images.length]);
						*/
						//
						ImageIcon icon = new ImageIcon("C:\\Users\\503-19\\Desktop\\�ڿ�\\�̹���\\"
								+ list.get(idx%list.size()));
						label.setIcon(icon);
						
						idx = idx + 1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th.start();
	}

}
