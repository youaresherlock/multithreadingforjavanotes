package chapter03.section1.thread_3_1_11.project_2_p_c_allWait;

//������
public class C {
	private String lock;
	
	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized(lock) {
				while(ValueObject.value.equals("")) {
					//�����ߵȴ�����������
					System.out.println("������ " 
							+ Thread.currentThread().getName() + " WAITING��#");
					lock.wait();
				}
				System.out.println("������ " + Thread.currentThread().getName()
						+ " RUNNABLE��");
				ValueObject.value = "";
				lock.notify();
//				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}











































