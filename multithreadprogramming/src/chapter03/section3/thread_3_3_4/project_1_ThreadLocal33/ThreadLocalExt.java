package chapter03.section3.thread_3_3_4.project_1_ThreadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal<Date> {
	@Override
	protected Date initialValue() {
		return new Date();
	}
}











































