package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class MyWindow1 extends JFrame {
   String[] data = { "Encapsulation", "Inheritance", "Polymorphism", "Information Hiding" };

   // ������ Ŭ����
   public MyWindow1() {
      setBounds(500, 500, 1000, 1000);
      setTitle("����");
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      JList<String>list = new JList<>(data);
      JComboBox<String>combo = new JComboBox<>(data);
      JPanel p = new JPanel();
      p.add(list);
      p.add(combo);
      add(p);
      
      setVisible(true);
   }
}