package chapter02.section02.thread_2_2_9.project_1_synStaticMethod;

public class Service {
	
	synchronized public static void printA() {
		try {
			System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "����printA");
			Thread.sleep(3000);
			System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "�뿪printA");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized public static void printB() {
		System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName() + "��"
				+ System.currentTimeMillis() + "����printB");
		System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName() + "��"
				+ System.currentTimeMillis() + "�뿪printB");
	}
}


























