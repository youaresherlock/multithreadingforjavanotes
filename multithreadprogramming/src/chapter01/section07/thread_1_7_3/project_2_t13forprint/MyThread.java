package chapter01.section07.thread_1_7_3.project_2_t13forprint;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		
		for(int i = 0; i < 500000; i++) {
			//��ǰ�߳��Ƿ��ж�ת�ģ�ִ�к�����״̬��־λfalse
			if(Thread.interrupted()) {
				System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		//System.out.println("�ұ����������˴�����for�ּ������У��̲߳�δֹͣ��");
	}
}
