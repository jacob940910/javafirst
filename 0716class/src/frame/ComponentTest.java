package frame;

import java.awt.Frame;
import java.awt.*;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		setLocation(100,100);
		setSize(500,500);
		
		Panel p = new Panel();
		
		Checkbox cb1= new Checkbox("����");
		Checkbox cb2= new Checkbox("���ǰ���");
		Checkbox cb3= new Checkbox("����");
		Checkbox cb4= new Checkbox("���α׷���");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//���� ��ư �����
		CheckboxGroup group = 
				new CheckboxGroup();
		Checkbox man =
				new Checkbox("����",group,true);
		Checkbox woman =
				new Checkbox("����",group,false);
		
		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		p.add(ch);
		
		
		
		p.add(man);
		p.add(woman);
		
		//5���� �����ְ� �������� �����Ҽ� �ֵ��� ���ִ� List
		List list = new List(5,true);
		list.add("C%C++");
		list.add("C#");
		list.add("Java");
		list.add("JavaScript");
		list.add("Objective-C");
		list.add("Python");
		list.add("Swift");
		list.add("Kotlin");
		list.add("Scala");
		
		p.add(list);
		//list�� romove(int idx)�� �̿��ϸ� idx��°�� ������ֽ��ϴ�
		//list.remove(0);
		//ù��° �� �ִ� C%C++�� 5��°���ִ� Objective-C�� ����
		//�������� ���� ���� �ڿ������� �����ؾ��մϴ�.
		list.remove(4);
		list.remove(0);
		
		
		add(p);
		setVisible(true);
	}

}
