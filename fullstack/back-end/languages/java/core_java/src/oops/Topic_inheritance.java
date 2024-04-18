package oops;

public class Topic_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p= new Parent();
		System.out.println(p.mony);
		Child c= new Child();
		System.out.println(c.mony);
	}

}


//Single level inheritance
class Parent{
	int mony=1234;
}
class Child extends Parent{
//	int mony=1234;
}

//multi level inheritance
class GrandPa{
	int mony=1234;
}
class Parent1 extends GrandPa{
//	int mony=1234;
}
class Child1 extends Parent{
//	int mony=1234;
}


//hierarchical inheritance
class GrandPa1{
	int mony=1234;
}
class Brother extends GrandPa1{
//	int mony=1234;
}
class Sister extends GrandPa1{
//	int mony=1234;
}
class Boy extends Brother{
//	int mony=1234;
}

class Girl extends Sister{
//	int mony=1234;
}