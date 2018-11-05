package chapter06.section02.project_2_singleton_2;

public class MyObject {
	private static MyObject myObject;
	
	//注意此处为private
	private MyObject() {}
	
	public static MyObject getInstance() {
		//延迟加载
		try {
			if(myObject != null) {
			} else {
				//模拟在创建对象之前做一些准备性工作
				Thread.sleep(3000); //要捕获异常
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return myObject;
	}
}



























