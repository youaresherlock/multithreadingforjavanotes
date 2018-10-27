package chapter03.section3.thread_3_3_2.project_2_s5;


public class Run {

	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB();
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
/*
result:
..........................
A 1540642122512
A 1540642122512
A 1540642122512
A 1540642122512
A 1540642122512
A 1540642122512
B 1540642123507
A 1540642122512
B 1540642123507
A 1540642122512
B 1540642123507
A 1540642122512
..........................
*/
































