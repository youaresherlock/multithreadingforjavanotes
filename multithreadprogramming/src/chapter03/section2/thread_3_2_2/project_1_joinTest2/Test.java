package chapter03.section2.thread_3_2_2.project_1_joinTest2;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		MyTest threadTest = new MyTest();
		threadTest.start();
		
		threadTest.join();
		
		// Thread.sleep(?)
		System.out.println("���뵱threadTest����ִ����Ϻ�����ִ��");
		System.out.println("����������е�sleep()�е�ֵӦ��д�����أ�");
		System.out.println("���ǣ����ݲ���ȷ��:)");	
	}
}
/*
result:
8370
���뵱threadTest����ִ����Ϻ�����ִ��
����������е�sleep()�е�ֵӦ��д�����أ�
���ǣ����ݲ���ȷ��:)
*/
