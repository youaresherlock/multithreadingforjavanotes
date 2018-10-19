package chapter02.section03.thread_2_3_3.project_1_t16;

public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
进入run了
已经赋值为false进入run了
程序陷入死循环
加入volatile关键字后result:
进入run了
已经赋值为false
线程被停止了！
 */