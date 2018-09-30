package chapter01.section07.thread_1_7_3.project_2_t13forprint;

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
		//System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
	}
}
