package swing;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddressBook extends JFrame {
   // �÷� �̸� �迭
   String[] columns = { "�̸�", "��ȭ��ȣ", "�ּ�" };
   // ������ �迭
   String[][] data = { { "ȫ�浿", "01012345678", "��⵵ ��õ�� ���絿" },
		   { "�Ӳ���", "01012569382", "��⵵ ��õ�� ���ǵ�" },
         { "�̸���", "01098765432", "��⵵ ��õ�� ���̵�" },
         { "������", "01067382915", "��⵵ ��õ�� ���ڵ�" } };

   public AddressBook() {
      setBounds(100, 100, 400, 400);
      setTitle("����ó");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      // ���̺� �� �����
      DefaultTableModel model = new DefaultTableModel(data, columns);
      // ���̺� ���� �̿��ؼ� ���̺� �����
      JTable table = new JTable(model);
      // table.setModel(model);
      // ��� ������ ũ�⺸�� table�� Ŀ������
      // ��ũ�� �ٸ� �̿��� �� �ֵ��� Scroll�� ����
      JScrollPane scrollPane = new JScrollPane(table);
      // ��ũ�� ������ �����ӿ� ����
      add(scrollPane);

      // �޴� �ٸ� ����
      JMenuBar menuBar = new JMenuBar();

      JMenu file = new JMenu("����");
      // ����Ű ����
      file.setMnemonic('a');

      JMenuItem item1 = new JMenuItem("����");
      file.add(item1);

      JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("����");
      file.add(item2);

      JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("����");
      file.add(item3);

      menuBar.add(file);

      // �޴� �ٸ� �����쿡 ����
      setJMenuBar(menuBar);
      
      JLabel lblName = new JLabel("�̸�");
      JTextField tfName = new JTextField(10);
      JLabel lblPhone = new JLabel("��ȭ��ȣ");
      JTextField tfPhone = new JTextField(15);
      JLabel lblAddress = new JLabel("�ּ�");
      JTextField tfAddress = new JTextField(30);
      
      JButton btnInsert = new JButton("����");
      JButton btnDelete = new JButton("����");
      
      JPanel southPanel = new JPanel();
      southPanel.add(lblName);
      southPanel.add(tfName);
      southPanel.add(lblPhone);
      southPanel.add(tfPhone);
      southPanel.add(lblAddress);
      southPanel.add(tfAddress);
      southPanel.add(btnInsert);
      southPanel.add(btnDelete);
      
      add("South",southPanel);

      setVisible(true);
      
      //���Թ�ư�� Ŭ�� �̺�Ʈ (ActionListener)ó��
      ActionListener insertListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//�ؽ�Ʈ �ʵ忡 �Էµ� ���밡������
			String name =tfName.getText();
			String phone = tfPhone.getText();
			String address = tfAddress.getText();
			
			//�¿� ���� �����ϱ�
			name = name.trim();
			phone = phone.trim();
			address = address.trim();
			
			//name�� �ʼ� �Է�
			//�̸��� �Էµ��� ���� ���, ���̰� 0  
			if(name.length() == 0) {
				JOptionPane.showMessageDialog(null, "�̸��� �ʼ��Է�",
						"�̸�", JOptionPane.WARNING_MESSAGE);
				//�Ʒ����� ���̻� �������� �ʵ��� ����
				return;
			}
			if(address.length() == 0) {
				JOptionPane.showMessageDialog(null, "�ּҴ� �ʼ��Է�",
						"�ּ�", JOptionPane.WARNING_MESSAGE);
				return;
			}
			if(phone.length() == 0) {
				JOptionPane.showMessageDialog(null, "��ȣ�� �ʼ��Է�",
						"��ȣ", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			
			//���̺��� �����͸� �����ϱ����ؼ� ���̺��� ������ ���� �����ɴϴ�.
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			//�����͸� �߰��ϱ����ؼ� �߰��� ������ �迭�� ����
			String [] row = {name,phone,address};
			//�𵨿� �߰� 
			model.addRow(row);
			//���̺��� ����
			table.updateUI();
			
			tfName.setText(" ");
			tfPhone.setText(" ");
			tfAddress.setText(" ");
			
			JOptionPane.showMessageDialog(null, "������ ���� ����",
					"�����۾�", JOptionPane.PLAIN_MESSAGE);
			
		}
      };
      btnInsert.addActionListener(insertListener);
      
      ActionListener deleteListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//������ ���ȣ ã��
			int idx = table.getSelectedRow();
			//���̺��� ���� ���������ʾҴٸ�
			if(idx<0 || idx>=table.getRowCount()) {
				JOptionPane.showMessageDialog(null, "���� �����ϼ���!!",
						"��������", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			//���̺��� �� ��������
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			
			//������ �࿡ �ش��ϴ� �����������
			model.removeRow(idx);
			table.updateUI();
			JOptionPane.showMessageDialog(null, "������ ���� ����", 
					"����", JOptionPane.WARNING_MESSAGE);
			
		}
    	  
      };
      btnDelete.addActionListener(deleteListener);

      // �޽��� ���̾�α� ���
      /*
       * JOptionPane.showMessageDialog (null, "�޽��� ���̾�α�", "��ȭ����",
       * JOptionPane.QUESTION_MESSAGE);
       */

      // ���� ���̾�α� ���
      /*
       * int r = JOptionPane.showConfirmDialog (null, "�޽��� ���̾�α�", "��ȭ����",
       * JOptionPane.YES_NO_OPTION); System.out.println(r);
       */

      // �� �� �Է¹޴� ���̾�α� ���
      /*
       * String r = JOptionPane.showInputDialog (null, "�޽��� ���̾�α�", "��ȭ����",
       * JOptionPane.YES_NO_OPTION); System.out.println(r);
       */

   }

}