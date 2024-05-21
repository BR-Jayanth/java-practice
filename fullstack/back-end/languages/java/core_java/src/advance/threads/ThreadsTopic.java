package advance.threads;

public class ThreadsTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("im running 1");
		System.out.println("im running 2");
		Bac rr= new Bac("thread123");
		rr.start();
		Bac rr1= new Bac("thread1234");
		rr.start();
		System.out.println("im running 3");
	}

}

//class DoSomethingInBackground implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=0;i<101000000;i++) {
//			
//		}
//	}
//	
//}

class Bac implements Runnable {
	Thread t;
	String ThreadName;
	
	Bac(String name){
		ThreadName=name;
	}
	public void run() {
		System.out.println("Im running......");
		for(int i=0;i<1010000000000000000d;i++) {}
	}


	public void start() {
		// TODO Auto-generated method stub
	     t= new Thread(this,ThreadName);
//	     ThreadName=t.getName();
		t.start();
	}
}
