package chapter06.section02.project_4_singleton_2_2;

public class MyObject {
	private static MyObject myObject;
	
	//ע��˴�Ϊprivate
	private MyObject() {}
	
	 public static MyObject getInstance() {
		try {
			//����д����ͬ��:
			//synchronized public static MyObject getInstance()
			//��д����Ч��һ���ܵͣ�ȫ�����뱻����
			synchronized(MyObject.class) {
				if(myObject != null) {
				} else {
					//ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
					Thread.sleep(3000);
					myObject = new MyObject();
				}
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return myObject;
	}
}



























