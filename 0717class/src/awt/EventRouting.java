package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
   public EventRouting() {

      // �������� ���� ��ǥ�� ũ�⸦ ����
      setBounds(200, 200, 400, 400);
      // �������� ������ ����
      setTitle("�̺�Ʈ �����");
      setBackground(Color.WHITE);
      setForeground(Color.BLACK);

      Button btn1 = new Button("�ѱ���");
      Button btn2 = new Button("����");
      Button btn3 = new Button("����");

      Label label = new Label();

      Panel centerPanel = new Panel();

      centerPanel.add(btn1);
      centerPanel.add(btn2);
      centerPanel.add(btn3);

      add("Center", centerPanel);

      add("South", label);

      /*
       * // ActionEvent�� ó���� �� �ִ� �ν��Ͻ� ����� ActionListener listener1 = new
       * ActionListener() {
       * 
       * @Override public void actionPerformed(ActionEvent e) {
       * label.setText("�ȳ��ϼ���"); } }; // ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
       * btn1.addActionListener(listener1);
       * 
       * // ActionEvent�� ó���� �� �ִ� �ν��Ͻ� ����� ActionListener listener2 = new
       * ActionListener() {
       * 
       * @Override public void actionPerformed(ActionEvent e) {
       * label.setText("Hello"); } }; // ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
       * btn2.addActionListener(listener2);
       * 
       * // ActionEvent�� ó���� �� �ִ� �ν��Ͻ� ����� ActionListener listener3 = new
       * ActionListener() {
       * 
       * @Override public void actionPerformed(ActionEvent e) { System.exit(0); } };
       * // ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ���� btn3.addActionListener(listener3);
       */
      
      ActionListener listener = new ActionListener() {
         
         // �̺�Ʈ�� �߻��� ������Ʈ�� ���ڿ��� ������ �б�
         @Override
         public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
            case "�ѱ���":
               label.setText("�ȳ��ϼ���");
               break;
            case "����":
               label.setText("Hello");
               break;
            case "����":
               System.exit(0);
               break;
            }
         }
      };
      // 3�� ��ư�� �׼� �̺�Ʈ�� listener�� ��� ó��
      btn1.addActionListener(listener);
      btn2.addActionListener(listener);
      btn3.addActionListener(listener);

      // �����츦 ȭ�鿡 ���
      setVisible(true);
   }
}