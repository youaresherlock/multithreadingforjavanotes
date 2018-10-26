package chapter03.section1.thread_3_1_11.project_2_p_c_allWait;

//生产者
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
					System.out.println("生产者 "  
							+ Thread.currentThread().getName() + " WAITING了*");
					lock.wait();
				} 
				System.out.println("生产者 " + Thread.currentThread().getName()
						+ " RUNNABLE了");
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






























