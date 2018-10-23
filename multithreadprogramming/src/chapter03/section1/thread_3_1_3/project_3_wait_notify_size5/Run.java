package chapter03.section1.thread_3_1_3.project_3_wait_notify_size5;

public class Run {
	 public static void main(String[] args) {
		try {
			Object lock = new Object();
			
			ThreadA a = new ThreadA(lock);
			a.start();
			
			Thread.sleep(50);
			
			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
wait begin 1540274044982
�����1��Ԫ��!
�����2��Ԫ��!
�����3��Ԫ��!
�����4��Ԫ��!
�ѷ���֪ͨ!
�����5��Ԫ��!
�����6��Ԫ��!
�����7��Ԫ��!
�����8��Ԫ��!
�����9��Ԫ��!
�����10��Ԫ��!
wait end 1540274055097
*/
