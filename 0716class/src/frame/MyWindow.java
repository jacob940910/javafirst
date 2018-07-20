package frame;

import java.awt.*;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;

public class MyWindow extends Frame {
	//생성
	public MyWindow() {
		
		
		this.setBackground(Color.WHITE);
		setSize(700,700);
		setLocation(150,150);
		setTitle("나의첫번쨰 윈도우 프로그램");
		
		Button button = new Button("버튼");
		button.setLabel("버튼의 텍스트변경");
		button.setBackground(Color.BLUE);
		button.setForeground(Color.yellow);
		
		
		
		//add(button);
		Panel panel = new Panel();
		panel.add(button);
		
	    Button btn1= new Button("버튼1");
	    //버튼의 배경색을 변경 하는 스레드
	    //ColorThread th1= new ColorThread(btn1);
	    Thread th1= new Thread() {
	    	public void run() {
	    		Color [] colors = {
	    				Color.cyan, Color.DARK_GRAY,Color.GREEN
	    		};
	    		int idx=0;
	    		while(true){
	    			try {
						Thread.sleep(1000);
						idx=idx+1;
						btn1.setBackground(
								colors[idx % colors.length]);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
	    		}
	    	}
	    };
	    th1.start();
	    panel.add(btn1);
	    
	    Button btn2= new Button("버튼2");
	    //버튼의 텍스트를 변경하는 스레드
	    //TextThread th2 = new TextThread(btn2);
	    Thread th2 = new Thread() {
	    	public void run() {
	    		String[]ar = {"Java","Oracle","FrontEnd","BackEnd","Android","iOS"};
	    		int idx=0;
	    		while(true) {
	    			try {
	    				idx = idx +1;
	    				button.setLabel(ar[idx % ar.length]);
	    				Thread.sleep(1000);
	    			}catch(InterruptedException e){
	    				e.printStackTrace();
	    			}
	    			
	    		}
	    	}
	    };
	    th2.start();
	    panel.add(btn2);
	    
		//패널을 프레임에 추가
		add(panel);
		
		setVisible(true);
		
	}

}
