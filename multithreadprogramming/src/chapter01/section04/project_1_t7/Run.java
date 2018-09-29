package chapter01.section04.project_1_t7;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();
//		Thread.sleep(1000);
		System.out.println("end ==" + mythread.isAlive());
	}
}


/*
begin ==false
end ==true 这个值是不确定的，因为mythread线程还没有执行完毕所以是true
run=true

加入Thread.sleep(1000);之后结果
begin ==false
run=true
end ==false 输出结果为false,因为mythread对象已经在1s之内执行完毕
*/