package COLLECTION;

import java.util.*;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		p1.setPrice(2050.50);
		p1.setPname("samsung");
		p2.setPrice(150000.20);
		p2.setPname("iphone");
		p3.setPrice(360000.50);
		p3.setPname("lenovo");
		
		ArrayList<Product> arr=new ArrayList();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			Product p=(Product) itr.next();
			System.out.println(p.getPname()+" ===> "+p.getPrice());
		}
		

	}

}
