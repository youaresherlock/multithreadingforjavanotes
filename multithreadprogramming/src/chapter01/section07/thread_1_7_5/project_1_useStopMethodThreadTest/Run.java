package chapter01.section07.thread_1_7_5.project_1_useStopMethodThreadTest;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

/*
result:
i=1
i=2
i=3
i=4
i=5
i=6
i=7
i=8
 */