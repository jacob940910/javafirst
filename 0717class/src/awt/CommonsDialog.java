package awt;

import java.awt.*;

public class CommonsDialog extends Frame {
	//������ - �ν��Ͻ��� �����Ҷ� ȣ���ϴ¸޼ҵ�
	public CommonsDialog() {
		 // ��ġ�� ũ�⸦ ����
	      setBounds(200, 200, 600, 600);
	      // ���� ����
	      setTitle("���� ��ȭ ����");
	      // FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ� ������ ���� ��θ� ���̺� ���
	      // FileDialog�� ������ �� ù��° �Ű������� Dialog�� Frame�� �ּ��ε�
	      // ������ ���� this�� �����ϸ� �ȴ�.
	      FileDialog fileDialog = new FileDialog(this);
	      // ȭ�����
	      fileDialog.setVisible(true);
	      // ������ ���丮�� �����̸��� ��������
	      String filePath = fileDialog.getDirectory() + fileDialog.getFile();
	      
	      // ���̺� ����
	      Label label = new Label (filePath);
	      add(label);
	      
	      // ȭ�� ���
	      setVisible(true);

		
	}

}
