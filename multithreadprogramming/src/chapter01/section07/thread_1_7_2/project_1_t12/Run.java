package chapter01.section07.thread_1_7_2.project_1_t12;

public class Run {
	
	 public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt(); //thread.interrupt()ֻ�Ǹ�thread�߳��������ж�״̬
			System.out.println("�Ƿ�ֹͣ1? =" + Thread.interrupted()); //interrupted()�����ǳ��󷽷�
			System.out.print("�Ƿ�ֹͣ2? =" + thread.interrupted());	//�̵߳��ж�״̬�����÷������		
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}

/*
result:
i=4996
i=4997
i=4998
i=4999
i=5000
�Ƿ�ֹͣ1? =false
�Ƿ�ֹͣ2? =false
 */