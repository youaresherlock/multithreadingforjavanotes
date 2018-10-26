package chapter03.section1.thread_3_1_11.project_3_stack_1;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C r = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		C_Thread rThread = new C_Thread(r);
		pThread.start();
		rThread.start();
	}
}
/*
result:
.................................
pop=anyString=0.28538502891582784
push=1
pop=0
pop=anyString=0.7583543613696966
push=1
pop=0
pop=anyString=0.1512771979278016
push=1
pop=0
 */