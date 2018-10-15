package chapter02.section02.thread_2_2_1.project_1_t5;

public class Task {
	
	private String getData1;
	private String getData2;
	
//	public void doLongTimeTask() {
	synchronized public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
//			String privateGetData1 = "��ʱ�䴦��������Զ�̷��ص�ֵ1threadName="
//					+ Thread.currentThread().getName();
//			String privateGetData2 = "��ʱ�䴦��������Զ�̷��ص�ֵ2threadName="
//					+ Thread.currentThread().getName();
//			synchronized(this) {
//				getData1 = privateGetData1;
//				getData2 = privateGetData2;
//			}
			getData1 = "��ʱ�䴦��������Զ�̷��ص�ֵ1threadName="
					+ Thread.currentThread().getName();
			getData2 = "��ʱ�䴦��������Զ�̷��ص�ֵ2threadName="
					+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
