package oops;

public class PolymophismTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p= new Parent2();
		System.out.println(p.mony);
		Child2 c= new Child2();
		System.out.println(c.mony);
		System.out.println(c.land());
		System.out.println(c.land(1));
	}

}

class Parent2{
	int mony=1234;
	int land() {
		return mony;
	}
}
class Child2 extends Parent2{
	
	int mony=12345;
	int land() {
		return super.mony;
	}
	int land(int a) {
		return super.mony;
	}
}
