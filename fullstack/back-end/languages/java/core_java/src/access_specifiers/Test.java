package access_specifiers;

public class Test {
	String check="accesible";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test();
		System.out.println(t.check);
		Onroad t2 =new Onroad();
		System.out.println(t2.acc);
	}

}


class Onroad{
	String acc="u can access";
}

 class Nopermission{
	
}