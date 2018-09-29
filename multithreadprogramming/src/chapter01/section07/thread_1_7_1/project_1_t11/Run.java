package chapter01.section07.thread_1_7_1.project_1_t11;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

/*
result:
.........
i=4999974
i=4999975
i=4999976
i=4999977
i=4999978
i=4999979
i=4999980
i=4999981
i=4999982
i=4999983
i=4999984
.........
*/