package advance.files;

import java.io.FileWriter;
import java.util.Date;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var myData="hello world";
		var currentdate= new Date();
		try {
			var wr= new FileWriter("src/log.txt");
			wr.write(myData+"---"+currentdate);
			wr.close();
			System.out.println("data written");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
