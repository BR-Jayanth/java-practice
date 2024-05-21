package advance.files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        var file= new File("src/log.txt");
       
		
		try {
			 var data = new Scanner(file);
			 while(data.hasNext()) {
				 var newdata=data.next();
				 System.out.println(newdata);
			 }
			System.out.println("data read");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
