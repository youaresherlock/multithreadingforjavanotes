package chapter02.section01.thread_2_1_2.project_1_t2;

public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
		
		ThreadA athread = new ThreadA(numRef);
		athread.start();
		
		ThreadB bthread = new ThreadB(numRef);
		bthread.start();
	}
}
/*
result:
a set over!
b set over!
b num=200
a num=200

������ݲ�ͬ������ķ������ڷ���ǰ����synchronized.
result:
a set over!
a num=100
b set over!
b num=200
*/






















