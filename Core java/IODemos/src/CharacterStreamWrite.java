import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamWrite {

	public static void main(String[] args) {
		
		File f=new File("f:/rajesh1.txt");
		
		String str="welcome to chennai capgemini";
		char[] ch=new char[str.length()];
		str.getChars(0, str.length(),ch, 0);
			try {
				FileWriter fr=new FileWriter(f);
				fr.write(ch);
				fr.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		
	}

}
