package project;

import java.util.Scanner;

public class DynamicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		char op,ch;
		Operations ob=new Operations();
		do {
			System.out.println("Enter the number 1");
			a=s.nextInt();
			System.out.println("Enter the number 2");
			b=s.nextInt();
			System.out.println("Enter the operation ( + - * / ) you want to perform");
			op=s.next().charAt(0);
			switch(op) {
			case '+': System.out.print(ob.add(a, b));
					 break;
			case '-': System.out.print(ob.sub(a, b));
			 		 break;
			case '*': System.out.print(ob.mul(a, b));
			 		 break;
			case '/': System.out.print(ob.div(a, b));
						break;
			default:System.out.println("Invalid option");
					break;
				
			}
			System.out.println("\nDo you whish to continue y/n");
			ch=s.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
		
		
	}

}
class Operations{
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
