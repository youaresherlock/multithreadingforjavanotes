package chapter02.section01.thread_2_1_5.project_1_t3;

public class Test {
	
	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();
			
			Thread.sleep(200); //打印结果受到此值影响，200<5000,因此会出现脏读
			
			publicVarRef.getValue(); //主线程读取对象的实例变量出现了脏读
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
PublicVar类的getValue()方法不加synchronized关键字的result:
getValue method thread name=main username=B password=AA
setValue method thread name=Thread-0 username=B password=BB
PublicVar类的getValue()方法加synchronized关键字的result:
setValue method thread name=Thread-0 username=B password=BB
getValue method thread name=main username=B password=BB
 */

































