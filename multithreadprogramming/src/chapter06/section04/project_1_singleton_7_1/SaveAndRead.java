package chapter06.section04.project_1_singleton_7_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndRead {
	public static void main(String[] args) {
		try {
			MyObject myObject = MyObject.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File(
					"myObjectFile.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fisRef = new FileInputStream(new File(
					"myObjectFile.txt"));
			ObjectInputStream oisRef = new ObjectInputStream(fisRef);
			MyObject myObject = (MyObject)oisRef.readObject();			
			oisRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
/*
result:
1612799726
787387795
去掉注释:
1612799726
调用了readResolve方法!
1612799726
*/



































