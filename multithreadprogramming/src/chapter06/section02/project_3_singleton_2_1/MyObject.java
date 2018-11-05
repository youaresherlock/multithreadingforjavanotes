package chapter06.section02.project_3_singleton_2_1;

public class MyObject {
	private static MyObject myObject;
	
	//ע��˴�Ϊprivate
	private MyObject() {}
	
	//����ͬ������Ч��̫����
	//��������������
	synchronized public static MyObject getInstance() {
		try {
			if(myObject != null) {
			} else {
				//ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return myObject;
	}
}



























