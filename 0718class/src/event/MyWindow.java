package event;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

//윈도우 클래스
public class MyWindow extends JFrame {
	public MyWindow() {
		//위치와 크기설정
		setBounds(500, 500, 1000, 1000);
		//제목설정
		setTitle("스윙을 이용한 윈도우");
		//종료버튼 이벤트처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//패널을 생성
		JPanel panel = new JPanel();
		
		ImageIcon icon = new ImageIcon("C:\\Users\\503-19\\Desktop\\자원\\이미지\\America.png");
		JLabel label = new JLabel(icon);
		//label.setIcon(icon);
		label.setToolTipText("안녕하세요");
		
		TitledBorder border = new TitledBorder("경계선");
		
		
		label.setBorder(border);
		panel.add(label);
		
		JButton btn = new JButton("버튼");
		panel.add(btn);
		
		//패널을 프레임에 부착
		add(panel);
		
		//화면 출력
		setVisible(true);
		
		//그림 파일 이름을 배열로 만들기
		//배열은 만들면 크기변경이 안됩니다.
		String [] images = {
				"0.png","1.png","2.png","3.png","4.png"
		};
		
		//리스트는 크기 변경이 가능한 배열입니다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("0.png");
		list.add("1.png");
		list.add("2.png");
		list.add("3.png");
		list.add("4.png");
		
		//이미지가 변경되는 동안에도 다른 작업을 진행해야하므로 이미지 변경은 스레드생성
		Thread th = new Thread() {
			public void run() {
				int idx = 0;
				while(true) {
					try {
						//50은 주기 
						Thread.sleep(200);
						//배열로 반복문 만들기
						/*
						ImageIcon icon = new ImageIcon("C:\\Users\\503-19\\Desktop\\자원\\이미지\\"
						+ images[idx%images.length]);
						*/
						//
						ImageIcon icon = new ImageIcon("C:\\Users\\503-19\\Desktop\\자원\\이미지\\"
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
