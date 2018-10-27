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
			System.out.println("��δ�Ź�ֵ");
			t1.set("�ҵ�ֵ");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
		System.out.println(t2.get());
		System.out.println(t2.get());
	}
}
/*
result:
����Ĭ��ֵ, ��һ��get����Ϊnull
����Ĭ��ֵ, ��һ��get����Ϊnull
t2
t2
*/





















