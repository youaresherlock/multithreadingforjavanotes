package chapter03.section1.thread_3_1_13.project_1_pipeReaderWriter;

import java.io.PipedReader;

public class ThreadRead extends Thread{
	
	private ReadData read;
	private PipedReader in;
	
	public ThreadRead(ReadData read, PipedReader in) {
		super();
		this.read = read;
		this.in = in;
	}
	
	@Override
	public void run() {
		read.readMethod(in);
	}
}
