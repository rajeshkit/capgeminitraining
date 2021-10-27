import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Cart cart=new Cart(); // object cart - id=1000, productname="tv",quantity=2,cost=80000
		cart.setUserId("1000");
		cart.setProductName("TV");
		cart.setQuantity("2");
		cart.setCost(80000);
		System.out.println(cart.getUserId()+"  "+cart.getProductName()+"  "+cart.getQuantity()+"  "+cart.getCost());
		ObjectOutputStream os=null;
		File f=new File("f:/cart.txt");
		try {
			os=new ObjectOutputStream(new FileOutputStream(f));
			os.writeObject(cart);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//serialize that object i will store in my system file
	}// end of the main function
}
