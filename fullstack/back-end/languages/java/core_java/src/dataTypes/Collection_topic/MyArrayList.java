package dataTypes.Collection_topic;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList data= new ArrayList();
		data.add("apple");
		data.add("ball");
		data.add("cat");
		System.out.println(data);
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i));
		}
		data.forEach((val)->{
			System.out.println(val);
		});
	}

}
