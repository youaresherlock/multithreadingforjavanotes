package chapter06.section03.project_1_singleton_7;

public class MyObject {
	
	//�ڲ��෽ʽ
	private static class MyObjectHandler{
		private static MyObject myObject = new MyObject();
	}
	
	private MyObject() {}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
}



























