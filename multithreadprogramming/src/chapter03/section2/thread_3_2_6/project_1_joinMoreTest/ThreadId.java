package chapter03.section2.thread_3_2_6.project_1_joinMoreTest;

	 import java.util.concurrent.atomic.AtomicInteger;

	 public class ThreadId {
	     // Atomic integer containing the next thread ID to be assigned
	     /*
	     在这里需要注意的是:
	     final修饰的量视为常量
	     当使用final修饰一个变量时，是指其引用的对象不变，而不是引用对象指定的内容。
	     也是固定了栈内存的引用reference不变，不是修饰堆内存的内容。
	     */
	     private static final AtomicInteger nextId = new AtomicInteger(10);

	     // Thread local variable containing each thread's ID
	     private static final ThreadLocal<Integer> threadId =
	         new ThreadLocal<Integer>() {
	             @Override protected Integer initialValue() {
	                 return nextId.getAndIncrement();
	         }
	     };

	     // Returns the current thread's unique ID, assigning it if necessary
	     public static int get() {
	         return threadId.get();
	     }
	 }

