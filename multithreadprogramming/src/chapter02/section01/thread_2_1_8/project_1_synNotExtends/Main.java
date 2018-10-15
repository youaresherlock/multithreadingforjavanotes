package chapter02.section01.thread_2_1_8.project_1_synNotExtends;

public class Main {
	synchronized public void serviceMethod() {
		try {
			System.out.println("int main ��һ�� sleep begin threadName="
					+ Thread.currentThread().getName() + " time=" 
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int main ��һ�� sleep end threadName=" 
					+ Thread.currentThread().getName() + " time=" 
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
