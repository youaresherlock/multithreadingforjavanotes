package chapter01.section08.thread_1_8_2.project_2_suspend_resume_LockStop;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
����ע�ʹ���Ľ��result:
......
215359
215360
215361
215362
215363
215364
215365
����ע�ʹ���Ľ��:
main end!
 */