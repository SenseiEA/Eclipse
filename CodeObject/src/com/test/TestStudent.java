package com.test;
import com.obj.Student;
public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(1234,"Noel","Acosta","Cansino");
		Student s3=new Student(1232,"Dana","Treyes");
		Student s4=new Student(1234,"Noel","Acosta","Cansino");
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		boolean b=s2.equals(s4);
		System.out.println(b);
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
	}

}
