package chapter01.section03.project_1_t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
//		myThread.run(); //�������main���߳�ִ��  ����� run�����Ĵ�ӡ: main
	}
}


/*

result:
���췽���Ĵ�ӡ: main
run�����Ĵ�ӡ: Thread-0
 */