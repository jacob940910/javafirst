package constructor;

public class Main {

	public static void main(String[] args) {
		//Practice 클래스의 인스턴스 생성
		Practice practice1=new Practice();
		//practice1.setName("noname");
		System.out.println(practice1.getName());
		
		
		Practice practice2=new Practice();
		//practice2.setName("noname");
		System.out.println(practice2.getName());
		
		Practice practice3=new Practice("lee");
		System.out.println(practice3.getName());
		
	    String str="Hello World";
	    int r=str.lastIndexOf("llok");
	    System.out.println(r);
	    
	    r=str.length();
	    System.out.println(r);
	    
	    practice3.display();
	    

	}

}
