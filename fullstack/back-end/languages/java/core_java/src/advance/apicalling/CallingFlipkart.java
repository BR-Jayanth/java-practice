package advance.apicalling;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.*;

public class CallingFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myurl="https://fakestoreapi.com/products";
		var request=HttpRequest.newBuilder().GET().uri(URI.create(myurl)).build();
				
		var client=HttpClient.newBuilder().build();
		try {
//			var response=client.send(request,HttpResponse.BodyHandler.ofstring());
//			System.out.println(((HttpResponse) response).body());
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
