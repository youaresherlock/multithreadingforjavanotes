package chapter03.section2.thread_3_2_2.project_1_joinTest2;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		MyTest threadTest = new MyTest();
		threadTest.start();
		
		threadTest.join();
		
		// Thread.sleep(?)
		System.out.println("我想当threadTest对象执行完毕后我再执行");
		System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
		System.out.println("答案是：根据不能确定:)");	
	}
}
/*
result:
8370
我想当threadTest对象执行完毕后我再执行
但上面代码中的sleep()中的值应该写多少呢？
答案是：根据不能确定:)
*/
