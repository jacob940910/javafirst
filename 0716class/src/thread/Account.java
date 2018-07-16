package thread;

public class Account {

	private int balance;

	public void save() {
		System.out.println("입금전 잔액:" + balance);
		balance = balance + 1000;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입금후 잔액:" + balance);

	}

	public synchronized void depo() {
		if (balance < 1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("출금전 잔액:" + balance);
			balance = balance - 1000;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("출금후 잔액:" + balance);
		}
	}

}
