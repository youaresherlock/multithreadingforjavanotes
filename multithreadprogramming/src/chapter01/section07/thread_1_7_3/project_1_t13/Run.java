package chapter01.section07.thread_1_7_3.project_1_t13;

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
*/