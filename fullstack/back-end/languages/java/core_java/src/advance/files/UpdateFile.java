package advance.files;

import java.io.FileWriter;

public class UpdateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="src/log.txt";
		try {
			FileWriter fw= new FileWriter(fileName);
			fw.append("---ip address");
			fw.close();
			System.out.println("file updated");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
