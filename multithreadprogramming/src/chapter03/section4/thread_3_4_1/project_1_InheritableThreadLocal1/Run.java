package chapter03.section4.thread_3_4_1.project_1_InheritableThreadLocal1;


public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("       在Main线程中取值=" + Tools.t1.get().getTime());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
/*
result:
       在Main线程中取值=1540644910398
       在Main线程中取值=1540644910398
       在Main线程中取值=1540644910398
在ThreadA线程中取值=1540644910398
在ThreadA线程中取值=1540644910398
在ThreadA线程中取值=1540644910398
*/
































