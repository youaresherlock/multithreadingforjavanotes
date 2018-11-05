package chapter06.section05.project_1_singleton_8;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
