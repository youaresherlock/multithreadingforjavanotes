package chapter03.section4.thread_3_4_2.project_1_InheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<Date> {
	@Override
	protected Date initialValue() {
		return new Date();
	}
	
	@Override
	protected Date childValue(Date parentValue) {
		return new Date(); //重新改变时间
	}
}
