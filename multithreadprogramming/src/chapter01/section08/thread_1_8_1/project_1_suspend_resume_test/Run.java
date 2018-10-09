package chapter01.section08.thread_1_8_1.project_1_suspend_resume_test;
public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5000);
			//A段
			thread.suspend(); //挂起线程
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			Thread.sleep(5000);
			System.out.println("A= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			
			//B
			thread.resume(); //恢复线程
			Thread.sleep(5000);
			
			
			//C
			thread.suspend();
			System.out.println("B= " + System.currentTimeMillis() + " i="
					+ thread.getI());
			Thread.sleep(5000);
			System.out.println("B= " + System.currentTimeMillis() + " i="
					+ thread.getI());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
A= 1538357269859 i=1777425337
A= 1538357274860 i=1777425337
B= 1538357279861 i=2932004332
B= 1538357284861 i=2932004332
*/






































