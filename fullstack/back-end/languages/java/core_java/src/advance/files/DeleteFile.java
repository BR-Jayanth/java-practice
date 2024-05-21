package advance.files;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var file= new File("src/log1.txt");
		if(file.delete()) {
			System.out.println("file deleted");
		}
	}

}
