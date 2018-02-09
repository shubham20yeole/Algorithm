package DailyAlgoPractice;
import java.util.*;  

public class SampleComparator {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Student(101, 24, "Shubham"));
		al.add(new Student(102, 26, "Ayushi"));
		al.add(new Student(103, 23, "Harshada"));
		
		Collections.sort(al, new AgeComparator());
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Student st = (Student)itr.next();
			System.out.println(st.age+", "+st.rollno+", "+st.name);
		}
	}

}

class Student{
	int rollno;
	int age;
	String name;
	Student(int rollno, int age, String name){
		this.rollno = rollno;
		this.age=age;
		this.name = name;
	}
}

class AgeComparator implements Comparator{  
	public int compare(Object O1, Object O2){
		Student s1 = (Student)O1;
		Student s2 = (Student)O2;
		
		if(s1.age==s2.age) return 0;
		else if(s1.age<s2.age) return -1;
		else return 1;
	}
}

class nameComparator implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.name.compareTo(s2.name);
	}
}