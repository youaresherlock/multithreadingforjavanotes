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
不带注释代码的结果result:
......
215359
215360
215361
215362
215363
215364
215365
带上注释代码的结果:
main end!
 */