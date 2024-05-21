package advance.files;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("src/log2.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
