package Packageimport;

//Scanner 클래스는 패키지이름을 생략하고 사용할 수 있도록해줍니다.
//import java.util.Scanner;

//java.util 패키지의 모든 클래스는 패키지 이름을 생략하고 사용할수있도록 해줍니다.
//Date클래스는 java.util 패키지에있고 java.sql패키지에도 있습니다.
//이렇게 여러패키지에 존재하는 클래스의 경우는 반드시 구체적으로 import를 해야합니다.
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		
		
		sc.close();

	}

}
