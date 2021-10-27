import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoByteWrite {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		File f=new File("f:/rajesh.txt");
		String str="Rajesh is very bad trainer he doesnot care associates";
		byte[] data = str.getBytes();
		try {
			fos=new FileOutputStream(f);
			try {
				fos.write(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
