package chapter06.section02.project_6_singleton_5;

public class MyObject {
	private static MyObject myObject;
	
	//ע��˴�Ϊprivate
	private MyObject() {}
	
	//ʹ��˫���������������
	//����֤�˲���Ҫͬ���������첽
	//�ֱ�֤�˵�����Ч��
	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
				Thread.sleep(3000);
				synchronized(MyObject.class) {
					if(myObject == null) {
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
	
	// �˰汾�Ĵ����Ϊ��
	// ˫�ؼ��Double-Check Locking
}



























