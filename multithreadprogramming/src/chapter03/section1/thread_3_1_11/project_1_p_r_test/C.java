package chapter03.section1.thread_3_1_11.project_1_p_r_test;
//������
public class C {
	
	private String lock;
	
	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized(lock) {
				if(ValueObject.value.equals("")) {
					lock.wait(); //�ȴ�����������
				}
				System.out.println("get��ֵ��" + ValueObject.value);
				ValueObject.value = "";
				lock.notify(); //����������������
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}







































