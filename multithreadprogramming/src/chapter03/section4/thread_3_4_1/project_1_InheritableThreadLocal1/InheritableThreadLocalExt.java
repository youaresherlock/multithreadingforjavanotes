package chapter03.section4.thread_3_4_1.project_1_InheritableThreadLocal1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<Date> {
	@Override
	protected Date initialValue() {
		return new Date();
	}
}
