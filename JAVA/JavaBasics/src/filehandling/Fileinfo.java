package filehandling;
import java.io.File;
public class Fileinfo {

	public static void main(String[] args) {
		File f=new File("D:normal.txt");
		if(f.exists()) {
			System.out.println("the file path  is " + f.getPath());
			System.out.println("the file detail path is " + f.getAbsolutePath());
			System.out.println("the file name is " + f.getName());
		}
		else {
			System.out.println("invalid file");
		}
	}

}
