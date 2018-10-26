package chapter03.section1.thread_3_1_11.project_5_stack_2_new;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyStack myStack = new MyStack();

		P p = new P(myStack);

		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4 = new C(myStack);
		C r5 = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		pThread.start();

		C_Thread cThread1 = new C_Thread(r1);
		C_Thread cThread2 = new C_Thread(r2);
		C_Thread cThread3 = new C_Thread(r3);
		C_Thread cThread4 = new C_Thread(r4);
		C_Thread cThread5 = new C_Thread(r5);
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}
}
/*
result:
push=1
pop=0
pop=anyString=0.2277061445557783
pop操作中的: Thread-4 线程呈wait状态
pop操作中的: Thread-1 线程呈wait状态
pop操作中的: Thread-3 线程呈wait状态
pop操作中的: Thread-2 线程呈wait状态
pop操作中的: Thread-5 线程呈wait状态
push=1
pop=0
pop=anyString=0.919935358446316
pop操作中的: Thread-4 线程呈wait状态
Exception in thread "Thread-1" java.lang.IndexOutOfBoundsException: Index 0 out-of-bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
	at java.base/java.util.Objects.checkIndex(Unknown Source)
	at java.base/java.util.ArrayList.get(Unknown Source)
	at chapter03.section1.thread_3_1_11.project_4_stack_2_old.MyStack.pop(MyStack.java:31)
	at chapter03.section1.thread_3_1_11.project_4_stack_2_old.C.popService(C.java:13)
	at chapter03.section1.thread_3_1_11.project_4_stack_2_old.C_Thread.run(C_Thread.java:15)
可以看到还没有进行push操作，Thread-1被唤醒继续执行remove(0)方法，因此而数组越界异常
 */