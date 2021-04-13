package COLLECTION;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(2, "sayan");
		hm.put("saya", "srijan");
		hm.put(1, "saikat");
		hm.put(4,"anirban");
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
				Map.Entry me=(Map.Entry) itr.next();
				System.out.println(me.getKey()+"======>"+me.getValue());
		}
		
	}

}
