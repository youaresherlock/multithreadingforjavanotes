package chapter03.section1.thread_3_1_11.project_7_stack_3;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private List<String> list = new ArrayList<>();
	
	synchronized public void push() {
		try {
			while(list.size() == 1) {
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notifyAll(); 
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try {
			while(list.size() == 0) {
				System.out.println("pop操作中的: "
						+ Thread.currentThread().getName() + " 线程呈wait状态");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop=" + list.size());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return returnValue;
	}
}














































