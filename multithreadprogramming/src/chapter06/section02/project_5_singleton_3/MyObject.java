package chapter06.section02.project_5_singleton_3;

public class MyObject {
	private static MyObject myObject;
	
	//ע��˴�Ϊprivate
	private MyObject() {}
	
	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
				Thread.sleep(3000);
				// ʹ��synchronized (MyObject.class)
				// ��Ȼ���ִ��뱻����
				// �������з��̰߳�ȫ����
				synchronized (MyObject.class) {
					myObject = new MyObject();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}



























