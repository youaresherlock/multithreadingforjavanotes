package chapter03.section3.thread_3_3_2.project_1_ThreadLocalTest;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			ThreadB b = new ThreadB();
			a.start();
			b.start();
			
			for(int i = 0; i < 100; i++) {
				if(Tools.t1.get() == null) {
					Tools.t1.set("Main" + (i + 1));
				} else {
					System.out.println("Main get Value=" + Tools.t1.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
..........................
ThreadB get Value=ThreadB1
ThreadA get Value=ThreadA1
Main get Value=Main1
ThreadB get Value=ThreadB1
ThreadA get Value=ThreadA1
Main get Value=Main1
ThreadB get Value=ThreadB1
ThreadA get Value=ThreadA1
Main get Value=Main1
ThreadA get Value=ThreadA1
ThreadB get Value=ThreadB1
..........................
*/
































