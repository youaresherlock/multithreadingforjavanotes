package chapter03.section1.tread_3_1_10.project_1_waitOld;

public class Substract {
	private String lock;
	
	public Substract(String lock) {
		super();
		this.lock = lock;
	}
	
	public void substract() {
		try {
			synchronized(lock) {
//				while(ValueObject.list.size() == 0) {
				if(ValueObject.list.size() == 0) {
					System.out.println("wait begin ThreadName="
							+ Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait   end ThreadName="
							+ Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size=" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}



































