package chapter01.section07.thread_1_7_3.project_2_t13forprint;

public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}

/*
result:
......
i=454658
i=454659
i=454660
end!
已经是停止状态了!我要退出了!

去掉注释
........
i=487355
i=487356
i=487357
end!
已经是停止状态了!我要退出了!
我被输出，如果此代码是for又继续运行，线程并未停止！
*/