package chapter02.section02.thread_2_2_16.project_2_setNewPropertiesLockOne;

public class MyService {
	
	public void serviceMethodA(Userinfo userinfo) {
		synchronized (userinfo) {
			try {
				System.out.println(Thread.currentThread().getName());
				userinfo.setUsername("abcabcabc"); //对象属性改变
				Thread.sleep(3000);
				System.out.println("end! time=" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

















