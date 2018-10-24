package chapter03.section1.thread_3_1_11.project_1_p_r_test;

public class Run {
	public static void main(String[] args) {
		String lock = new String("");
		P p = new P(lock);
		C r= new C(lock);
		
		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);
		
		pThread.start();
		rThread.start();
	}
}
/*
result:
......................................
set的值是1540348717246_1290335084879336
get的值是1540348717246_1290335084879336
set的值是1540348717246_1290335084899247
get的值是1540348717246_1290335084899247
set的值是1540348717246_1290335084915744
get的值是1540348717246_1290335084915744
set的值是1540348717246_1290335084936793
......................................
*/
