package chapter03.section1.thread_3_1_11.project_2_p_c_allWait;

//������
public class P {
	
	private String lock;
	
	public P(String lock) {
		super();
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized(lock) {
				while(!ValueObject.value.equals("")) {
					System.out.println("������ "  
							+ Thread.currentThread().getName() + " WAITING��*");
					lock.wait();
				} 
				System.out.println("������ " + Thread.currentThread().getName()
						+ " RUNNABLE��");
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				ValueObject.value = value;
				lock.notify();
//				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}






























