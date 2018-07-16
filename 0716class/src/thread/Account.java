package thread;

public class Account {

	private int balance;

	public void save() {
		System.out.println("�Ա��� �ܾ�:" + balance);
		balance = balance + 1000;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�Ա��� �ܾ�:" + balance);

	}

	public synchronized void depo() {
		if (balance < 1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����� �ܾ�:" + balance);
			balance = balance - 1000;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����� �ܾ�:" + balance);
		}
	}

}
