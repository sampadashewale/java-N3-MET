package org.tnsif.arraysdemo;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		//initialize array
		System.out.println("enter no. in array in "+n+" times");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		Arrays.sort(arr);// element sort in assending order 
		//print array
		/*for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}*/
		
		//for each without initializing and incrementing i
		System.out.println("Sorted Array");
		for(int i:arr) {
		System.out.print(i+" ");
	}
	}

}
