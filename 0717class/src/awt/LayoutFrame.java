package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		//��ġ�� ũ�⸦ ����
		setBounds(100,100, 500,500);
		//������
		setTitle("���̾ƿ� ����");
		
		Panel panel = new Panel();
		
		//panel�� ���̾ƿ��� ����
		//panel.setLayout(new FlowLayout());
		
		/*
		//Button btn = null;
		//������Ʈ ��ġ
		for(int i=0; i<10; i=i+1) {
			Button btn = 
					new Button("��ư"+i);
			panel.add(btn);
		}
		*/
		/*
		panel.setLayout(new BorderLayout());
		
		Button btnWest = new Button("����");
		panel.add("West", btnWest);
		
		Button btnEast = new Button("����");
		panel.add("East", btnEast);
		
		Button btnCenter = new Button("�߾�");
		panel.add("Center", btnCenter);
		*/
		
		/*
		panel.setLayout(new GridLayout(2,3, 10, 10));
		for(int i=0; i<20; i=i+1) {
			Button btn = new Button("��ư"+i);
			panel.add(btn);
		}
		*/
		
		//������Ʈ�� ũ��� ��ġ�� ������� ������ �� �ֽ��ϴ�.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10, 50 ,30 ,50);
		add(label);
		
		add(panel);
		//ȭ�� ũ�������� ���ϵ��ϼ���
		setResizable(false);
		//ȭ�����
		setVisible(true);
		
		Thread th = new Thread() {
			public void run() {
				//���� �ݺ�
				while(true) {
					//���� ���̺��� ��ġ�� ��������
					int x= label.getLocation().x;
					int y= label.getLocation().y;
					//label.setLocation(x+10 , y);
					
					//�����ϰ� �����̱�
					Random r = new Random();
					label.setLocation(
							r.nextInt(300),r.nextInt(300));
					try { 
						Thread.sleep(100);
						if(x>=370) {
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th.start();
	}

}
