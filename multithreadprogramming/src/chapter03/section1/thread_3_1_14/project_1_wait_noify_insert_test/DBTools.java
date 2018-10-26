package chapter03.section1.thread_3_1_14.project_1_wait_noify_insert_test;

public class DBTools {
	
	/**
	 * ����prevIsA����Ҫ���þ���ȷ������"****"���ݿ�A����ִ�У�
	 * Ȼ��"@@@@"���ݿ�B������б���
	 */
	volatile private boolean prevIsA = false;
	
	synchronized public void backupA() {
		try {
			while(prevIsA == true) {
				wait(); //��ǰA���ݣ���A�ȴ�B����
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






























