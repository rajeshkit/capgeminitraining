import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamRead {

	public static void main(String[] args) {
		
		File f=new File("f:/input.txt");
		try {
			FileReader fr=new FileReader(f);
			try {
				int data = 0 ;
				while((data = fr.read())!=-1) {
					System.out.print((char)data);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
