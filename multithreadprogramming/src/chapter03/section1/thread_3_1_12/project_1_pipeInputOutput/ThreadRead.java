package chapter03.section1.thread_3_1_12.project_1_pipeInputOutput;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{
	private ReadData read;
	private PipedInputStream input;
	
	public ThreadRead(ReadData read, PipedInputStream input) {
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		read.readMethod(input);
	}
}
