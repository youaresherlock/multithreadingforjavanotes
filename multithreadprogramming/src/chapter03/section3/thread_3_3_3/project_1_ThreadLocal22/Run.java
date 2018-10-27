package chapter03.section3.thread_3_3_3.project_1_ThreadLocal22;

public class Run {
	public static ThreadLocalExt t1= new ThreadLocalExt();
	public static ThreadLocal<String> t2 = new ThreadLocal<>() {
		@Override 
		protected String initialValue() {
			return "t2";
		}
	};
	
	public static void main(String[] args) {
		if(t1.get() == null) {
			System.out.println("从未放过值");
			t1.set("我的值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
		System.out.println(t2.get());
		System.out.println(t2.get());
	}
}
/*
result:
我是默认值, 第一次get不再为null
我是默认值, 第一次get不再为null
t2
t2
*/





















