package project;

public class StaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5,num2 =4;
		Operation op = new Operation();
		System.out.println(op.add(num1, num2));
		System.out.println(op.sub(10, 5));
		System.out.println(op.mul(num1, num2));
		System.out.println(op.div(num1, num2));

	}

}
class Operation{
	int add( int a, int b){
		return a+b;
	}
	int sub( int a, int b){
		return a-b;
	}
	int mul( int a, int b){
		return a*b;
	}
	int div( int a, int b){
		return a/b;
	}
}
