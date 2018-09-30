package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.interrupt();
			Thread.sleep(1000);
			System.out.println("�Ƿ�ֹͣ1? =" + thread.isInterrupted());
			System.out.println("�Ƿ�ֹͣ2? =" + thread.isInterrupted());
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}

/*
 MyThread.java�м���ע������֮��
...
i=9995
�Ƿ�ֹͣ? =9994 true
i=9996
�Ƿ�ֹͣ? =9995 true
i=9997
�Ƿ�ֹͣ? =9996 true
i=9998
�Ƿ�ֹͣ? =9997 true
i=9999
�Ƿ�ֹͣ? =9998 true
i=10000
�Ƿ�ֹͣ? =9999 true
�Ƿ�ֹͣ1? =false
�Ƿ�ֹͣ2? =false
*/

