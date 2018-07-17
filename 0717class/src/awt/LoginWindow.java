package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {
   // ������ - �ν��Ͻ��� ���� �� ȣ���ϴ� �޼ҵ�
   public LoginWindow() {
      // ũ��, ��ġ �� Ÿ��Ʋ ����
      setSize(500, 500);
      setLocation(200, 200);
      setTitle("�α���");

      // �г��� ����
      Panel panel = new Panel();

      Label lblId = new Label("���̵�");
      TextField txtId = new TextField(10);
      panel.add(lblId);
      panel.add(txtId);

      Label lblPw = new Label("��й�ȣ");
      TextField txtPw = new TextField(10);
      txtPw.setEchoChar('*');
      panel.add(lblPw);
      panel.add(txtPw);

      // ���� �� �Է��� �� �ִ� �ؽ�Ʈ ���� �����
      TextArea ta = new TextArea(10, 30);
      panel.add(ta);

      // �г��� �����ӿ� ����
      add(panel);
      
      // �޴� �� �����
      MenuBar menuBar = new MenuBar();
      
      //�޴� �ٸ� �����쿡 ��ġ
      setMenuBar(menuBar);
      
      //�޴� ����
      Menu file = new Menu("����(F)");
      Menu edit = new Menu("����(E)");
      Menu font = new Menu("����(O)");
      
      //�޴��� �޴� �ٿ� ����
      menuBar.add(file);
      menuBar.add(edit);
      menuBar.add(font);
      
      MenuItem newFile = new MenuItem("���� �����(N)...");
      file.add(newFile);
      MenuItem openFile = new MenuItem("����(O)");
      file.add(openFile);
      MenuItem copy = new MenuItem("����");
      edit.add(copy);
      
      // ȭ�� ���
      setVisible(true);
   }

}