package chapter03.section1.thread_3_1_14.project_1_wait_noify_insert_test;

public class DBTools {
	
	/**
	 * 变量prevIsA的主要作用就是确保备份"****"数据库A首先执行，
	 * 然后"@@@@"数据库B交替进行备份
	 */
	volatile private boolean prevIsA = false;
	
	synchronized public void backupA() {
		try {
			while(prevIsA == true) {
				wait(); //先前A备份，则A等待B备份
			}
			for(int i = 0; i < 5; i++) {
				System.out.println("****");
			}
			prevIsA = true;
			notifyAll();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized public void backupB() {
		try {
			while(prevIsA == false) {
				wait();
			}
			for(int i = 0; i < 5; i++) {
				System.out.println("@@@@");
			}
			prevIsA = false;
			notifyAll();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}






























