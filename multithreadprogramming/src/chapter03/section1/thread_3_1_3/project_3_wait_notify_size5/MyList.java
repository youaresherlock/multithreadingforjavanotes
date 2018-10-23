package chapter03.section1.thread_3_1_3.project_3_wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private static List<String> list = new ArrayList<>();
	
	public static void add() {
		list.add("anyString");
	}
	
	public static int size() {
		return list.size();
	}
}
