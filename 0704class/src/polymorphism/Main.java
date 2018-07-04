package polymorphism;

public class Main {

	public static void main(String[] args) {
//		//Super 클래스의 인스턴스를 생성
//		Super base = new Super();
//		//Sub클래스의 인스턴스를 생성
//		Sub drive = new Sub();
//		
//		//상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수
//		//있습니다.
//		Super ob1=new Sub();
//		
//		//하위 클래스파일의 변수에 상위 클래스 타입의 인스턴스 주소를 대입하는 것은
//		//강제 형 변환을 통해서만 가능합니다.
//		//문제가 발생할 수 있습니다. ~예외가 발생합니다.
//	    Sub ob2= (Sub)(new Super());
//	    
		//상위 클래스 타입의 변수에 하위클래스 타입의주소를 대입할수 있습니다.
		//obj는 기본적으로 Super 것만 호출할수잇습니다.
		
		//오버라이딩 된 메소드는 변수를 선언할 때 사용된자료형이 아니라 
		//인스턴스를 만들어서 대입할때 사용한 자료형의 것을 호출합니다.
		Super obj = new Super();
	    obj.display();
	    
	    obj = new Sub();
	    obj.display();
	    
	}

}
