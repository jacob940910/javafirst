package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;



public class EventWindow extends Frame {
	public EventWindow() {
		setBounds(200,200, 400,400);
		setTitle("이벤트처리");
		//버튼을 생성
		Button btn1 = new Button("버튼1");
		//여러개의 컴포넌트를 묶어줄 패널생성 
		Panel panel = new Panel();
		//패널에 버튼을 추가
		panel.add(btn1);
		//패널을 윈도우에추가
		add(panel);
		//윈도우를 화면에 출력
		setVisible(true);
		
		
		//버튼을 누를때 이벤트처리는 ActionListner인터페이스가 처리합니다.
		ActionListener listner1 = 
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
			
			
		};
		//버튼과 리스너연결
		//btn1에 ActionEvent가 발생하면 
		//listner1의 메소드를 호출하도록 설정
		btn1.addActionListener(listner1);
	}

}