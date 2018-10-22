package chapter03.section1.thread_3_1_1.project_1_TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List<String> list = new ArrayList<>();
	
	public void add() {
		list.add("Clarence");
	}
	
	public int size() {
		return list.size();
	}
}
