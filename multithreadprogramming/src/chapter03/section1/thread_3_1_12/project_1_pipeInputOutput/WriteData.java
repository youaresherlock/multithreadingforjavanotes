package chapter03.section1.thread_3_1_12.project_1_pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
	
	public void writeMethod(PipedOutputStream out) {
		try {
			System.out.println("write :");
			for(int i = 0; i < 50; i++) {
				String outData = "" + (i + 1);
				out.write(outData.getBytes());
				System.out.print(outData);
			}
			System.out.println();
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
