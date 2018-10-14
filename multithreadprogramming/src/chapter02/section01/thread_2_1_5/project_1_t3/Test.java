package chapter02.section01.thread_2_1_5.project_1_t3;

public class Test {
	
	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();
			
			Thread.sleep(200); //��ӡ����ܵ���ֵӰ�죬200<5000,��˻�������
			
			publicVarRef.getValue(); //���̶߳�ȡ�����ʵ���������������
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
PublicVar���getValue()��������synchronized�ؼ��ֵ�result:
getValue method thread name=main username=B password=AA
setValue method thread name=Thread-0 username=B password=BB
PublicVar���getValue()������synchronized�ؼ��ֵ�result:
setValue method thread name=Thread-0 username=B password=BB
getValue method thread name=main username=B password=BB
 */

































