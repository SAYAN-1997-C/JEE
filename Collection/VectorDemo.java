package COLLECTION;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector arr=new Vector();
		arr.add("sayan");
		arr.add("srijan");
		arr.add("shaswata");
		arr.add("samrat");
		
		System.out.println(arr);
		
		Integer n=new Integer(5);
		arr.add(n);
		int m=50;
		arr.add(m);
		
		System.out.println(arr);
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator ltr=arr.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}

}
