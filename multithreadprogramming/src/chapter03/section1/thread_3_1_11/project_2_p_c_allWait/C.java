package chapter03.section1.thread_3_1_11.project_2_p_c_allWait;

//消费者
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
					//消费者等待生产者生产
					System.out.println("消费者 " 
							+ Thread.currentThread().getName() + " WAITING了#");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName()
						+ " RUNNABLE了");
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











































