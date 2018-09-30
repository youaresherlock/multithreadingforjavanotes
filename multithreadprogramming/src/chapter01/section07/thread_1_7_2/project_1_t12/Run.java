package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run {
	
	 public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt(); //thread.interrupt()只是给thread线程设置了中断状态
			System.out.println("是否停止1? =" + Thread.interrupted()); //interrupted()方法是抽象方法
			System.out.print("是否停止2? =" + thread.interrupted());	//线程的中断状态将被该方法清除		
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}

/*
result:
i=4996
i=4997
i=4998
i=4999
i=5000
是否停止1? =false
是否停止2? =false
 */