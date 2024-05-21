package modules;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class Anotherway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			HttpResponse<String> response = Unirest.get("https://fakestoreapi.com/products").asString();
		}catch(Exception e) {
			
		}
		

	}

}
