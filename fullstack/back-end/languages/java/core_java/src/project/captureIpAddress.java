package project;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class captureIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip;
		try {
			ip=InetAddress.getLocalHost();
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     	
	}

}
