package chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData;

public class ThreadA extends Thread {

	private MyList list;

	public ThreadA(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("�����" + (i + 1) + "��Ԫ��");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}







































