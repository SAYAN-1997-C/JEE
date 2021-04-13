package COLLECTION;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("sayan");
		hs.add("samrat");
		hs.add("srijan");
		hs.add("arnab");
		hs.add("susanta");
		hs.add("joydev");
		hs.add("samrat");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.print(hs);
	}

}
