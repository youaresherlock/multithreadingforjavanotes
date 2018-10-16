package chapter02.section02.thread_2_2_9.project_3_synMoreObjectStaticOneLock;

public class Service {

//	synchronized public static void printA() {
	public static void printA() {
		synchronized (Service.class) {
		try {
			System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "����printA");
			Thread.sleep(3000);
			System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "�뿪printA");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
 }
	
//	synchronized public void printB() {
	public static void printB() {
		synchronized (Service.class) {
		System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName() + "��"
				+ System.currentTimeMillis() + "����printB");
		System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName() + "��"
				+ System.currentTimeMillis() + "�뿪printB");
		}
	}
}
