package oops;

import java.util.Scanner;

public class Topic_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Sbi emp= new Sbi();
		System.out.println(emp.name);
//		System.out.println(emp.creditCard);
//		System.out.println(emp.name);
		System.out.println("enter the  otp");
		int otp= s.nextInt();
		System.out.println(emp.getpas(otp));
		System.out.println("enter the new pass");
		int pass= s.nextInt();
		emp.setPass(pass);
//		System.out.println(emp.getpas(1256));
		
	}

}

class Sbi{
	String name="aisha";
	private int creditCard=1234;
	private int pin=1234;
	int pass=1256;
	int getpas(int otp){
		if(otp==pass) {
			System.out.println("give pin");
			return pin;
		}else {
			System.out.println("wrong otp");
			return 0;
		}
		
	}
	void setPass(int pin) {
		this.pin=pin;
	}
}