package communication;

public class Communication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		Table t= new Table();
		System.out.println(t.wood);
		Helmet h= new Helmet();
		System.out.println(h.color);
		Fan f=new Fan();
		System.out.println(f.brand);
		Whiteboard w=new Whiteboard();
		System.out.println(w.material);
		Bike b=new Bike();
//		System.out.println(b.engine);
		Bike.main(args);
		b.display();
	}

}
class Table{
	String wood="playwood";
}

class Helmet{
	String color="blue";
}

class Fan{
	String brand="V-guard";
}

class Whiteboard{
	String material="plastic";
}
class Bike{
	 static String engine="286cc";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(engine);
		
	}
	void display()
	{
		System.out.println(engine);
		
	}
	
	
}