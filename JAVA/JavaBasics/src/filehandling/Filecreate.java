package filehandling;
import java.io.File;
public class Filecreate {

	public static void main(String[] args) {
		File f=new File("D:normal.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("the file name is  " +f.getName());
			}
			else {
				System.out.println("file already created");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
