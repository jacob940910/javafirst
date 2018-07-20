package bytestream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			//true값을 주면 이어쓰기가됨
			ps = new PrintStream(new FileOutputStream("./data.dat",true));
			ps.println("안녕하세요");
			ps.println("반갑습니다");
			ps.flush();
		}catch(Exception e) {
			System.out.println("파일쓰기 예외:"+e.getMessage());
		}finally {
			if(ps !=null)
				ps.close();
		}

	}

}
