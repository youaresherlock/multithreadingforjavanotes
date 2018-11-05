package chapter07.section02.thread_7_2_6.project_1_groupInnerStop;

public class Run {
	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("Clarence");
			
			for(int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "线程" + (i + 1));
				thread.start();
			}
			Thread.sleep(5000);
			group.interrupt();
			System.out.println("调用了interrupt()方法");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("停了停了!");
			e.printStackTrace();
		}
	}
}

/*
result:
ThreadName=线程1准备开始死循环了 :)
ThreadName=线程5准备开始死循环了 :)
ThreadName=线程4准备开始死循环了 :)
ThreadName=线程3准备开始死循环了 :)
ThreadName=线程2准备开始死循环了 :)
调用了interrupt()方法
ThreadName=线程5结束了 :)
ThreadName=线程1结束了 :)
ThreadName=线程3结束了 :)
ThreadName=线程4结束了 :)
ThreadName=线程2结束了 :)
*/


































