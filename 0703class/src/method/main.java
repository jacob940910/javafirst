package method;

import java.util.Scanner;

//실행클래스 - main 메소드를 소유한클래스
public class main {

	public static void main(String[] args) {
		//Member 클래스에 인스턴스를생성
		Member member1=new Member();
		Scanner sc=new Scanner(System.in);
		
		//인스턴스 변수를 호출해서 데이터 저장
		System.out.print("이메일:");
		String email=sc.nextLine();
		member1.setEmail(email);
		System.out.print("닉네임:");
		String nickname=sc.nextLine();
		member1.setNickname(nickname);
		System.out.print("나이:");
		int age=sc.nextInt();
		member1.setAge(age);
		System.out.print("비밀번호:");
		String password=sc.nextLine();
		member1.setPassword(password);
        System.out.print("전화번호:");
		String phonenumber=sc.nextLine();
		member1.setPhonenumber(phonenumber);
		
		//member1.display();
		System.out.println(member1); //toString출력문
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
		
		
	}

}
