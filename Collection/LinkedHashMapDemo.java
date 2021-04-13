package COLLECTION;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap obj=new LinkedHashMap();
		obj.put(1, "sayan");
		obj.put(3,"saikat");
		obj.put(3, "biki");
		obj.put(9, "onjit");
		obj.put(8,"Shaswata");
		System.out.println(obj);
		
		Set set=obj.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me= (Map.Entry) itr.next();
			
			System.out.println(me.getKey()+" ===> "+me.getValue());
		}
	}

}
