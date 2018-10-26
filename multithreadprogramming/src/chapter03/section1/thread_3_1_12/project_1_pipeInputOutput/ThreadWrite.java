package chapter03.section1.thread_3_1_12.project_1_pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread{
	
	private WriteData write;
	private PipedOutputStream out;
	
	public ThreadWrite(WriteData write, PipedOutputStream out) {
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		write.writeMethod(out);
	}
}
