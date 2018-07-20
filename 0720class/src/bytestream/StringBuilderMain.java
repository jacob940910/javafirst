package bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/a503-19/0717.txt"));
			StringBuilder sb = new StringBuilder();
			while(true) {
				//한줄을 읽기
				String line = br.readLine();
				//읽은 데이터가없으면 종료
				if(line == null) {
					break;
				}
				
				//읽은 String 에 저장하기 
				String content = sb.toString();
				//메모리 정리를 위해
				sb = null;
				System.out.println(content);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(br != null)
				try {
					br.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		

	}

}
