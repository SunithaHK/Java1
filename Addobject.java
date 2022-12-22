package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Addobject {
    
    public static void main(String[] args) {
    	Student s1=new Student("suni",2,87);
        Student s2=new Student("abc",1,85);
        Student s3=new Student("xyg",8,86);
        Student s4=new Student("ooo",6,89);
    	Map<Integer,Student> m=new LinkedHashMap<>();
    	m.put(s1.getId(),s1);
    	m.put(s2.getId(),s2);
    	m.put(s3.getId(),s3);
    	m.put(s4.getId(),s4);
    	//convert map into set of keys
    	
    	//Set<Entry<Integere,student>> set=map.entrySet();
    	Set<Integer> keys=m.keySet();//2,1,8,6
    	System.out.println("entries present inside map");
    	for(int key:keys)
    	{
    		System.out.println(m.get(key));
    	}
    	System.out.println("-------------");
    	//add the values from the map into arraylist
    	
    	List<Student>  l=new ArrayList<Student>();
    	for(int key:keys)
    	{
    		Student obj=m.get(key);//Student obj=new Student("sun",2,80);
    		l.add(obj);//l.add(m.get(key));//getting s1,s2,s3,
    	}
    	System.out.println("objects prsent in list");
    	for(Student s:l)
    	{
    		System.out.println(s);
    	}
    	System.out.println("-------------");
    	while(true) {
    	Scanner s= new Scanner(System.in);
    	System.out.println("enter your choice");
    	int choice=s.nextInt();
    	switch(choice) {
    	case 1:
    		Collections.sort(l,new SortByNmae());
    		for(Student st: l)
    		{
    			System.out.println(st);
    		}
    	break;
    	case 2:
    		Collections.sort(l,new SortStudentsByid());
    		for(Student st: l)
    		{
    			System.out.println(st);
    		}
    	break;
    	case 3:
    		Collections.sort(l,new SortByMarks());
    		for(Student st: l)
    		{
    			System.out.println(st);
    		}
    	break;
    	default: System.out.println("invalid choices");
    	
    	}
    	
    	}	
	}
	
}
