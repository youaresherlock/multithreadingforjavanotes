package chapter02.section03.thread_2_3_4.project_1_volatileTestThread;

public class Run {
	public static void main(String[] args) {
		MyThread[] mythreadArray = new MyThread[100];
		for(int i = 0; i < 100; i++) {
			mythreadArray[i] = new MyThread();
		}
		
		for(int i = 0; i < 100; i++) {
			mythreadArray[i].start();
		}
	}
}
/*
����ע�ʹ���result:
..........
count=9846
count=9746
count=9546
count=9446
count=9246 ����10000
����ע�ʹ���result:
..........
count=9400
count=9500
count=9600
count=9700
count=9800
count=9900
count=10000
*/
