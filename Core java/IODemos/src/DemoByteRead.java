import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoByteRead {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		//Inputstream -> implementation of byte stream
		
		File f=new File("f:/input.txt");
		try {
			fis=new FileInputStream(f);
			int data=0;
			while((data = fis.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fis.close();
	}
}
