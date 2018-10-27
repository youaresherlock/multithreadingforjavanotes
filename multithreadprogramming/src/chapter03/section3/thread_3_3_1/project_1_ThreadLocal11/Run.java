package chapter03.section3.thread_3_3_1.project_1_ThreadLocal11;

public class Run {
	public static ThreadLocal<String> t1 = new ThreadLocal<>();
	public static void main(String[] args) {
		if(t1.get() == null) {
			System.out.println("从未放过值");
			t1.set("我的值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
	
}
/**
result:
从未放过值
我的值
我的值
*/






































