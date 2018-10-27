package chapter03.section2.thread_3_2_5.project_2_join_sleep_2;

public class Run {
	
	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();

			ThreadA a = new ThreadA(b);
			a.start();

			Thread.sleep(1000);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
/*
result:
   b run begin timer=1540608282186
   b run   end timer=1540608287194
¥Ú”°¡ÀbService timer=1540608288190
*/
