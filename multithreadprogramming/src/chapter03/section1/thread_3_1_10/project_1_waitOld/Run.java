package chapter03.section1.thread_3_1_10.project_1_waitOld;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");

		Add add = new Add(lock);
		Substract subtract = new Substract(lock);

		ThreadSubstract subtract1Thread = new ThreadSubstract(subtract);
		subtract1Thread.setName("subtract1Thread");
		subtract1Thread.start();

		ThreadSubstract subtract2Thread = new ThreadSubstract(subtract);
		subtract2Thread.setName("subtract2Thread");
		subtract2Thread.start();

		Thread.sleep(1000);

		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();
	}
}

/*
不加注释result:
wait begin ThreadName=subtract1Thread
wait begin ThreadName=subtract2Thread
wait   end ThreadName=subtract1Thread
list size=0
wait   end ThreadName=subtract2Thread
Exception in thread "subtract2Thread" java.lang.IndexOutOfBoundsException: Index 0 out-of-bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
	at java.base/java.util.Objects.checkIndex(Unknown Source)
	at java.base/java.util.ArrayList.remove(Unknown Source)
	at chapter03.section1.tread_3_1_10.project_1_waitOld.Substract.substract(Substract.java:21)
	at chapter03.section1.tread_3_1_10.project_1_waitOld.ThreadSubstract.run(ThreadSubstract.java:13)
加上注释带上while循环result:
wait begin ThreadName=subtract2Thread
wait begin ThreadName=subtract1Thread
wait   end ThreadName=subtract2Thread
list size=0
wait   end ThreadName=subtract1Thread
wait begin ThreadName=subtract1Thread
*/
