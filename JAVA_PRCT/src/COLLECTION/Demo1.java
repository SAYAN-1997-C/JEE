package COLLECTION;

import java.util.*;

class product
{
	double price;
	String name;
	
	product(double price,String name)
	{
		this.price=price;
		this.name=name;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product(99.20,"phone");
		product p2=new product(100.20,"tab");
		product p3=new product(19000.20,"refregaretor");
		product p4=new product(105800.20,"ac");
		product p5=new product(100047.20,"furniture");
		
		ArrayList arr=new ArrayList();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			product p=(product) itr.next();
			System.out.println("Product Name : "+p.name+"  ==>  Price :"+p.price);
		}
		
	}

}
