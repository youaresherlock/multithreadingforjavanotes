package chapter01.section07.thread_1_7_3.project_1_t13;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		
		for(int i = 0; i < 500000; i++) {
			//当前线程是否中断转改，执行后悔清除状态标志位false
			if(Thread.interrupted()) {
				System.out.println("已经是停止状态了!我要退出了!");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
	}
}
