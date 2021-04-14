package COLLECTION;

import java.util.*;

public class Linked_ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt = new LinkedList();
		lt.add("sayan");
		lt.add("sriajn");
		lt.add("samrat");
		lt.add("koushik");
		
		System.out.println(lt);
		
		lt.addFirst("saikat");
		lt.addLast("souvik");
		System.out.println(lt);
		
		lt.removeFirst();
		lt.removeLast();
		System.out.println(lt);
		
		lt.add(4,"sayani");
		System.out.println(lt);
	}

}
