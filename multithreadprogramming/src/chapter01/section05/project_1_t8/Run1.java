package chapter01.section05.project_1_t8;

public class Run1 {
 public static void main(String[] args) {
	MyThread1 mythread = new MyThread1();
	System.out.println("begin =" + System.currentTimeMillis());
	mythread.run();
	System.out.println("end =" + System.currentTimeMillis());
}
}

/*
begin =1538226664432
run threadName=main begin
run threadName=main end
end =1538226666433
*/