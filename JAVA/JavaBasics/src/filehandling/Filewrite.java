package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class Filewrite {

	public static void main(String[] args) {
		try {
			FileWriter fwrite=new FileWriter("D:normal.txt");
			fwrite.write("hi all . good morning");
			fwrite.close();
			System.out.println("content added successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
