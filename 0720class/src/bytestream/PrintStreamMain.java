package bytestream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			//true���� �ָ� �̾�Ⱑ��
			ps = new PrintStream(new FileOutputStream("./data.dat",true));
			ps.println("�ȳ��ϼ���");
			ps.println("�ݰ����ϴ�");
			ps.flush();
		}catch(Exception e) {
			System.out.println("���Ͼ��� ����:"+e.getMessage());
		}finally {
			if(ps !=null)
				ps.close();
		}

	}

}
