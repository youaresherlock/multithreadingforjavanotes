package chapter06.section02.project_1_singleton_1;

public class MyObject {
	private static MyObject myObject;
	
	//ע��˴�Ϊprivate
	private MyObject() {}
	
	public static MyObject getInstance() {
		//�ӳټ���
		if(myObject != null) {
		} else {
			//ģ���ڴ�������֮ǰ��һЩ׼���Թ���
//			Thread.sleep(3000); //Ҫ�����쳣
			myObject = new MyObject();
		}
		
		return myObject;
	}
}



























