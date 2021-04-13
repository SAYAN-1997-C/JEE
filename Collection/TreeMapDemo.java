package COLLECTION;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		
		tm.put(1,"sayan");
		tm.put(2,"srijan");
		tm.put(3, "sayan");
		tm.put(77, "shaswata");
		tm.put(50, "soumik");
		tm.put(25, "samrat");
		
		Set set=tm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry) itr.next();
			System.out.println(me.getKey()+" =====> "+me.getValue());
		}
	}

}
