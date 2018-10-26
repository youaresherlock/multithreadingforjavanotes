package chapter03.section1.thread_3_1_12.project_1_pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
	public void readMethod(PipedInputStream input) {
		try {
			System.out.println("read : ");
			byte[] byteArray = new byte[20];
			int readLength = input.read(byteArray);
			//���شӻ�������ȡ���ֽ���
			while(readLength != -1) {
				String newData = new String(byteArray, 0, readLength);
				System.out.print(newData);
//				readLength = input.read(byteArray, 0, byteArray.length);
				readLength = input.read(byteArray);//һ������ȡ20���ֽڵ�����
			}
			System.out.println();
			input.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
