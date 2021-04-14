package COLLECTION;

import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add("sayan");
		arr.add("koushik");
		arr.add("pritam");
		arr.add("soumik");
		arr.add("Banoshree");
		arr.add(5);
		Integer n=new Integer(25);  //integer class is called wrapper.
		arr.add(n);
		arr.add(new Double(15.5)); //Annonymous object
		/*System.out.println(arr);
		
		arr.add(2,"souvik");
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		arr.remove("sayan");
		System.out.println(arr);
		Collections.sort(arr);*/
		System.out.println(arr);
		
		Iterator itr=arr.iterator();
		Iterator itr1=arr.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(itr1.hasNext())
		{
			if(itr1.next().equals("Banoshree"))
			{
				itr1.remove();
			}
		}
		
		ListIterator ltr=arr.listIterator();
		ListIterator ltr1=arr.listIterator();
		
		while(ltr.hasNext())
		{
			ltr.next();
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		System.out.println(arr);
		while(ltr1.hasNext())
		{
			if(ltr1.next().equals("sayan"))
			{
				ltr1.set("sayani");
			}
		}
		System.out.println(arr);
		
		ListIterator ltr2=arr.listIterator();
		while(ltr2.hasNext())
		{
			if(ltr2.next().equals("soumik"))
			{
				System.out.println(ltr2.previous());
				break;
			}
		}
	}

}
