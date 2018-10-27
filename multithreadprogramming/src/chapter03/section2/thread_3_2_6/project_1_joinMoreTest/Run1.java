package chapter03.section2.thread_3_2_6.project_1_joinMoreTest;

public class Run1 {
	public static void main(String[] args) {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			System.out.println("                    main end "
					+ System.currentTimeMillis());
	}
}
/*
result3:
                    main end 1540622542511
begin A ThreadName=Thread-1  1540622542511
  end A ThreadName=Thread-1  1540622547512
begin B ThreadName=Thread-0  1540622547512
  end B ThreadName=Thread-0  1540622552517
result:
 */