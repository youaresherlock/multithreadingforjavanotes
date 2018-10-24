package chapter03.section1.thread_3_1_11.project_1_p_r_test;
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
				if(ValueObject.value.equals("")) {
					lock.wait(); //等待生产者生产
				}
				System.out.println("get的值是" + ValueObject.value);
				ValueObject.value = "";
				lock.notify(); //唤醒生产者来生产
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}







































