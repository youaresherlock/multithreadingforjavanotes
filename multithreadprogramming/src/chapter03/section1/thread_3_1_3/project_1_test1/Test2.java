package chapter03.section1.thread_3_1_3.project_1_test1;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn����");
			synchronized(lock) {
				System.out.println("syn��һ��");
				lock.wait();
				System.out.println("wait�µĴ���!");
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
syn����
syn��һ��
*/























