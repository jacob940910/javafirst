package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//앞에서 만든 클래스의 인스턴스를 만들고 run 메소드를호출 
		//ThreadEx1 thread1 = new ThreadEx1();
		//thread1.run();
		//ThreadEx1 thread2 = new ThreadEx1();
		//thread2.run();
		
		
		//스레드로 실행
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		ThreadEx1 th2 = new ThreadEx1();
		th2.start();
	}

}
