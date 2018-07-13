package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 클래스의 인스턴스
		ThreadEx4 thread1 = new ThreadEx4("스레드1");
		ThreadEx4 thread2 = new ThreadEx4("스레드2");
		
		//스레드 생성
		Thread th1 = new Thread(thread1);
		Thread th2 = new Thread(thread2);
		
		//스레드의 우선순위 변경
		//가장높은 우선순위로 설정
		th1.setPriority(Thread.MAX_PRIORITY);
		//가장 낮은 우선순위로 설정
		th2.setPriority(Thread.MIN_PRIORITY);
		
		//스레드 시작
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(3000);
			th1.interrupt();
		}catch(InterruptedException e) {
			System.out.println("스레드 종료");
			return;
		}

	}

}
