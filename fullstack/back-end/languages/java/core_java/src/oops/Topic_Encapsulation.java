package oops;

public class Topic_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi emp= new Sbi();
		System.out.println(emp.name);
//		System.out.println(emp.creditCard);
		System.out.println(emp.name);
		System.out.println(emp.getpas());
		
	}

}

class Sbi{
	String name="aisha";
	private int creditCard=1234;
	private int pin=1234;
	int getpas(){
		return pin;
	}
}