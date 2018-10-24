package chapter03.section1.thread_3_1_11.project_1_p_r_test;

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
				if(!ValueObject.value.equals("")) {
					lock.wait(); //等待消费者消费
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("set的值是" + value);
				ValueObject.value = value;
				lock.notify();	
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}







































































