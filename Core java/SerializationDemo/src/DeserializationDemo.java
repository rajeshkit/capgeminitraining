import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		File f=new File("f:/cart.txt");
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
			try {
				Cart c = (Cart)ois.readObject();
				System.out.println(c.getUserId());
				System.out.println(c.getQuantity());
				System.out.println(c.getProductName());
				System.out.println(c.getCost());
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
