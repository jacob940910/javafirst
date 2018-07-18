package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventHandling1 extends Frame {
   // ������
   public EventHandling1() {
      // ��ġ�� ũ�� ����
      setBounds(300, 300, 300, 200);
      // ���� ����
      setTitle("�̺�Ʈ ó�� ����");
      // ���� ���� ��ġ�ϱ� ���ؼ� �г� ��ġ
      Panel panel = new Panel();

      TextField tf1 = new TextField(5);
      panel.add(tf1);
      Label plus = new Label("+");
      panel.add(plus);

      TextField tf2 = new TextField(5);
      panel.add(tf2);
      Label assign = new Label("=");
      panel.add(assign);

      TextField result = new TextField(6);
      panel.add(result);

      Button btn = new Button("���");
      panel.add(btn);

      // ActionListener �������̽��� anonymous class ����
      ActionListener listener = new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // 1��°�� 2��° �ؽ�Ʈ �ʵ��� ���� ��������
            String n1 = tf1.getText();
            String n2 = tf2.getText();
            // ���ڿ��� ������ ��ȯ�ؼ� ���ϱ�
            int r = Integer.parseInt(n1) + Integer.parseInt(n2);
            result.setText(r + "");

         }

      };

      btn.addActionListener(listener);

      Label lblPw = new Label("��й�ȣ");
      panel.add(lblPw);
      TextField pw = new TextField(15);
      panel.add(pw);
      Label pwResult = new Label();
      panel.add(pwResult);

      // �ؽ�Ʈ �ʵ��� ������ ����� �� ó���� �� �ִ� �������̽��� �ν��Ͻ��� ����
      TextListener t1 = new TextListener() {

         @Override
         public void textValueChanged(TextEvent e) {
            String password = pw.getText();
            //���� ���� ���� ����
            int dae = 0;
            int so = 0;
            int su = 0;
            int etc = 0;
            // password�� ��� ���ڸ� ��ȸ (������ҹ���, ����, Ư�������� ���� �ľ�)
            for (int i = 0; i < password.length(); i = i + 1) {
               char ch = password.charAt(i);
               if (ch >= 'A' && ch <= 'Z') {
                  dae = dae + 1;
               } else if (ch >= 'a' && ch <= 'z') {
                  so = so + 1;
               } else if (ch >= '0' && ch <= '9') {
                  su = su + 1;
               } else {
                  etc = etc + 1;
               }
            }
if(dae*so*su*etc > 0) {
   pwResult.setForeground(Color.RED);
   pwResult.setText("������ ���� ��й�ȣ�Դϴ�.");
}
else {
   pwResult.setForeground(Color.RED);
   pwResult.setText("������ ���� ��й�ȣ�Դϴ�.");
}
         }

      };

      pw.addTextListener(t1);
      add(panel);
      // ȭ�� ���
      setVisible(true);
   }

}