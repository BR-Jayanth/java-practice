package conditions;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ran= (int) Math.ceil(Math.random()*7);
		System.out.println(ran);
		switch(ran) {
		case 1:System.out.println("Sunday");
				break;
				
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednessday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
				
		}
	}

}
