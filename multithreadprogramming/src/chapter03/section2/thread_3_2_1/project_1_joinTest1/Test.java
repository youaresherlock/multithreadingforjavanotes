package chapter03.section2.thread_3_2_1.project_1_joinTest1;

public class Test {
	public static void main(String[] args) {
		MyTest threadTest = new MyTest();
		threadTest.start();
		
		// Thread.sleep(?)
		System.out.println("���뵱threadTest����ִ����Ϻ�����ִ��");
		System.out.println("����������е�sleep()�е�ֵӦ��д�����أ�");
		System.out.println("���ǣ����ݲ���ȷ��:)");	
	}
}
