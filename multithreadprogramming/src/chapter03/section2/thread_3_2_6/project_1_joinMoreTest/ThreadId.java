package chapter03.section2.thread_3_2_6.project_1_joinMoreTest;

	 import java.util.concurrent.atomic.AtomicInteger;

	 public class ThreadId {
	     // Atomic integer containing the next thread ID to be assigned
	     /*
	     ��������Ҫע�����:
	     final���ε�����Ϊ����
	     ��ʹ��final����һ������ʱ����ָ�����õĶ��󲻱䣬���������ö���ָ�������ݡ�
	     Ҳ�ǹ̶���ջ�ڴ������reference���䣬�������ζ��ڴ�����ݡ�
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

