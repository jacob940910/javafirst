package bytestream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("./char.text");
			char [] buf = new char[20];
			while(true) {
				//buf의 크기만큼 읽어서 buf에 저장하고 읽은 개수를 r에저장
				int r =fr.read(buf);
				if(r <=0) {
					break;
				}
				System.out.println(new String(buf, 0, r ));
			}
			//fr.read(buf);
			/*
			for(char ch : buf) {
				System.out.println(ch);
			}
			*/
			//System.out.println(new String(buf));
			
			
		}catch(Exception e) {
			System.out.println("예외처리:"+e.getMessage());
		}
		finally{
			if(fr !=null)
				try {
					fr.close();
				}catch(IOException e){
					e.printStackTrace();
					
				}
			
			
		}

	}

}
