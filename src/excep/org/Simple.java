package excep.org;

import java.util.ArrayList;

public class Simple {

	public static void main(String[] args) {
		System.out.println(3);
		System.out.println(6);
		try {
			System.out.println(6);
			try {
				ArrayList<Integer> li=new ArrayList<Integer>();
				li.add(12);
				li.add(23);
				li.get(3);
				
			}
		catch (Exception e) {
			System.out.println("nullpointer exception");
		}
		}
		catch (Exception e) {
		System.out.println("donot divide by zero");
		}
		finally {
			System.out.println("I am finally");
		}
		}
	}


