package chapter02.section02.thread_2_2_11.project_1_twoStop;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		ThreadA athread = new ThreadA(service);
		athread.start();

		ThreadB bthread = new ThreadB(service);
		bthread.start();
	}
}
/*
带上注释线程B永远得不到运行的机会，锁死了:
methodA begin 
不带上注释不在出现同步等待的情况: 
methodA begin
methodB begin
methodB   end
*/














































