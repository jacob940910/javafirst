package bytestream;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 Scanner인스턴스 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수:");
		int x = sc.nextInt();
		System.out.println(x);
		
		System.out.print("이름:");
		String name = sc.nextLine(); //Enter까지 입력
		System.out.println(name);
		
		/*
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		String ? = r.readLine();
		*/

	}

}
