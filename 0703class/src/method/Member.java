package method;

public class Member {
	private String email;
	private String password;
	private String nickname;
	private String phonenumber;
	private int age;
	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber=phonenumber;
	}

public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 // public void display() {
 // System.out.println("이메일"+email+"\n"+"비밀번호"+password+"\n"+"닉네임"+nickname+"\n"+"나이"+age+"\n"+"휴대폰번호"+phonenumber);
 // }
@Override
public String toString() {
	return "Member [email=" + email + ", password=" + password + ", nickname=" + nickname + ", phonenumber="
			+ phonenumber + ", age=" + age + "]";
}

     //static 메소드: 클래스 이름으로 호출할수 있는 메소드
     //매개변수에 ... 이있으면 매개변수 개수에 상관없이 대입가능
     public static int sum(int ... ar) {
    	 int tot=0;
    	 //heap에 있는 데이터를 stack에저장
    	 //자주 사용하기 떄문에 heap에 있으면 효울이 떨어짐
    	 int len=ar.length;
    	 
    	 for(int i=0; i<len;i=i+1) {
    		 tot=tot+ar[i];
    	 }
    	 return tot;
     }
}
