package COLLECTION;

import java.util.*;

public class Demo3HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		s1.setName("Sayan");
		s1.setDepartment("Computer Science");
		s2.setName("biki");
		s2.setDepartment("Physics");
		s3.setName("shaswata");
		s3.setDepartment("Mathematics");
		s4.setName("Souvik");
		s4.setDepartment("Chemistry");
		
		HashMap hm=new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		hm.put(4, s4);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry s=(Map.Entry) itr.next();
			System.out.print(s.getKey()+" ===> ");
			Student st=(Student) s.getValue();
			System.out.println(st.name+" ===> "+st.department);
		}
	}
}
