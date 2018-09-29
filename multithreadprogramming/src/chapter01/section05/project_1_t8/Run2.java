package chapter01.section05.project_1_t8;

public class Run2 {
	
	public static void main(String[] args) {
		MyThread2 mythread = new MyThread2();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.start();
		System.out.println("end =" + System.currentTimeMillis());
	}
}


/*
result:
begin =1538226948207
end =1538226948207
run threadName=Thread-0 begin =1538226948207
run threadName=Thread-0 end =1538226950208
*/