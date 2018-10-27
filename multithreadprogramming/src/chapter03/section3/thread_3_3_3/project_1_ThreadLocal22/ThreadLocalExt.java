package chapter03.section3.thread_3_3_3.project_1_ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal<String>{
	@Override
	protected String initialValue() {
		return "我是默认值, 第一次get不再为null";
	}
}












































