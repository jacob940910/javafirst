package event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventHandling2 extends Frame {
	public EventHandling2() {
	setBounds(100,100, 500, 500);
	setTitle("키보드 이벤트");
	setLayout(null);
	
	Label air =new Label("$$");
	air.setBounds(10,40, 30,30);
	add(air);
	
	KeyListener keyListener = new KeyListener() {

		//문자키를 눌럿을때
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		//키보드를 눌럿을 때호출되는 메소드
		@Override
		public void keyPressed(KeyEvent arg0) {
			int x =air.getLocation().x;
			int y =air.getLocation().y;
			if(arg0.getKeyCode() == arg0.VK_LEFT) {	
				x=x-10;
			}
			if(arg0.getKeyCode() == arg0.VK_RIGHT) {	
				x=x+10;
			}
			if(arg0.getKeyCode() == arg0.VK_UP) {
				y=y-10;
			}
			if(arg0.getKeyCode() == arg0.VK_DOWN) {	
				y=y+10;
			}
			air.setLocation(x, y);
			//getModifiers는 같이누른 조합키 값을 리턴
			if(arg0.getModifiers() == KeyEvent.ALT_MASK 
					&& arg0.getKeyCode() == KeyEvent.VK_F1) {
				System.exit(0);
			
		}
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
			Label label = new Label("총알");
			label.setBounds(air.getLocation().x,
					air.getLocation().y-30, 30 ,30);
			add(label);
			Thread th =new Thread() {
				public void run() {
					try {
						while(true){
							Thread.sleep(1000);
							int x = label.getLocation().x;
							int y = label.getLocation().y;
							label.setLocation(x, y-5);
							if(y <50)
								break;
						}
						label.setVisible(false);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				
				}
			};
			th.start();
			
		}
		}
		//키보드에서 손을뗄때
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	addKeyListener(keyListener);
	
	//윈도우조작을 위한 이벤트를 처리하기 위한 리스너
	WindowAdapter windowListener =new WindowAdapter() {
		//종료버튼을 누를때 호출되는 메소드
		@Override
		public void windowClosing(WindowEvent e) {
			//프로그램 종료
			System.exit(0);
		}

		
	};
	
	//프레임에 윈도우 이벤트 연결
	addWindowListener(windowListener);
	
	setVisible(true);
	}

}