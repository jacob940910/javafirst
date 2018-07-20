package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		//파일에서 바이트단위로 버퍼링을 이용해서 읽기
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(
					new FileInputStream("C:\\Users\\503-19\\Desktop\\자원\\07201.txt"));
			while(true) {
				byte [] b = new byte[1024];
				int r = bis.read(b);
				System.out.println(new String(b));
				if(r <= 0) {
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("예외 발생:"+e.getMessage());
		}finally {
			try {
				if(bis != null);
				bis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
