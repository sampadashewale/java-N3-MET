package org.tnsif.arraysdemo;
import java.util.Scanner;
public class Student {
	private int rollno;
	private String name;
	private float percentage;
	
	
	
	public Student(int rollno, String name, float percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	
	
	public void display() {
		System.out.print(this.rollno+" ");
		System.out.print(this.name+" ");
		System.out.print(this.percentage+" ");	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s[];
		s=new Student[3];
		int i=0;
		while(i<3) {
		System.out.println("enter roll no., name, percentage of "+i+" no. student");
		s[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
		i++;
		}
		
		System.out.println("display all student data");
		for(i=0;i<s.length;i++) {
			System.out.println();
			s[i].display();
		}
		
		}	

} 

//OutPut

/*enter roll no., name, percentage of 0 no. student
1
sam
70
enter roll no., name, percentage of 1 no. student
2
sampada
80
enter roll no., name, percentage of 2 no. student
3
riya
90
display all student data

1 sam 70.0 
2 sampada 80.0 
3 riya 90.0 */
