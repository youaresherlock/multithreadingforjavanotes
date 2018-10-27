package chapter03.section2.thread_3_2_6.project_1_joinMoreTest;

public class RunFirst {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		b.join(2000);
		System.out.println("   main end=" + System.currentTimeMillis());
	}
}
/*
result1:
begin B ThreadName=Thread-0  1540621815361
  end B ThreadName=Thread-0  1540621820366
   main end=1540621820366
begin A ThreadName=Thread-1  1540621820366
  end A ThreadName=Thread-1  1540621825376
result2:
begin A ThreadName=Thread-1  1540621971188
  end A ThreadName=Thread-1  1540621976192
   main end=1540621976192
begin B ThreadName=Thread-0  1540621976192
  end B ThreadName=Thread-0  1540621981197
*/
