package COLLECTION;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		
		st.push("sayan");
		st.pop();
		System.out.println(st);
		st.push("sayan");
		st.push("srijan");
		st.push("shaswata");
		st.remove(1);
		System.out.println(st);
		System.out.print(st.peek());
	}

}
