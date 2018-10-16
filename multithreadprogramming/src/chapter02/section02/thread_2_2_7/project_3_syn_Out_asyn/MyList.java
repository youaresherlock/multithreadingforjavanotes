package chapter02.section02.thread_2_2_7.project_3_syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List<String> list = new ArrayList<>();
	
	synchronized public void add(String username) {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "ִ����add������");
		list.add(username);
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�˳���add������");
	}
	
	synchronized public int getSize() {
		System.out.println("TheadName=" + Thread.currentThread().getName()
				+ "ִ����getSize������");
		int sizeValue = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�˳���getSize����!");
		return sizeValue;
	}
}














































