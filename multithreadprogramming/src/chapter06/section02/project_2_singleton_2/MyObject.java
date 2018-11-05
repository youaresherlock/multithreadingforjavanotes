package chapter06.section02.project_2_singleton_2;

public class MyObject {
	private static MyObject myObject;
	
	//ע��˴�Ϊprivate
	private MyObject() {}
	
	public static MyObject getInstance() {
		//�ӳټ���
		try {
			if(myObject != null) {
			} else {
				//ģ���ڴ�������֮ǰ��һЩ׼���Թ���
				Thread.sleep(3000); //Ҫ�����쳣
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return myObject;
	}
}



























