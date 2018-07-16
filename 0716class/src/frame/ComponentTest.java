package frame;

import java.awt.Frame;
import java.awt.*;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("체크박스 테스트");
		setLocation(100,100);
		setSize(500,500);
		
		Panel p = new Panel();
		
		Checkbox cb1= new Checkbox("독서");
		Checkbox cb2= new Checkbox("음악감상");
		Checkbox cb3= new Checkbox("게임");
		Checkbox cb4= new Checkbox("프로그래밍");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//라디오 버튼 만들기
		CheckboxGroup group = 
				new CheckboxGroup();
		Checkbox man =
				new Checkbox("남자",group,true);
		Checkbox woman =
				new Checkbox("여자",group,false);
		
		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		p.add(ch);
		
		
		
		p.add(man);
		p.add(woman);
		
		//5개를 보여주고 여러개를 선택할수 있도록 해주는 List
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
		//list의 romove(int idx)를 이용하면 idx번째를 지울수있습니다
		//list.remove(0);
		//첫번째 에 있는 C%C++과 5번째에있는 Objective-C를 제거
		//여러개를 지울 때는 뒤에서부터 삭제해야합니다.
		list.remove(4);
		list.remove(0);
		
		
		add(p);
		setVisible(true);
	}

}
