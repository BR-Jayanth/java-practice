package methods;

public class DifferentTypesMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BF vibhav =new  BF();
		BF vibhav =new  BF("no","yes","yes");
		System.out.println(vibhav.idly);
		Marriage abhishake= new Marriage();
		System.out.println(abhishake.marriage("dinner set"));
	}

}

class BF{
	String idly;
	String chatni;
	String dosa;
	BF(String idly,String chatni,String dosa){
//		constructor
		this.chatni=chatni;
		this.idly=idly;
		this.dosa=dosa;
	}
	
}

class Marriage{
	String marriage(String gift) {
//		normal function
		System.out.println(gift);
		return "biriyani";
		
	}
	Bride marriage1(String gift) {
//		normal function
		System.out.println(gift);
		return new Bride();
		
	}
}

class Bride{
	
}

//lambda function


