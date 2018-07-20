package bytestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/a503-19/access_log.txt"));
			//접속한 아이피를 중복 상관없이 저장하기위한 자료구조
			ArrayList<String> iplist= new ArrayList<>();
			//중복 없이저장하기위한 Set 만들기
			Set<String>ipset = new HashSet<String>();
			while(true) {
				//한줄을 읽기
				String line = br.readLine();
				//읽은 데이터가없으면 종료
				if(line == null) {
					break;
				}
				
				//공백으로 분할 
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
				iplist.add(ar[0]);
				ipset.add(ar[0]);
				
				
				
			}
			for(String ip : ipset) {
				System.out.println(ip);
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
