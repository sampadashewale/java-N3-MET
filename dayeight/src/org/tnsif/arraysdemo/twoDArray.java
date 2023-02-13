package org.tnsif.arraysdemo;
import java.util.Scanner;

public class twoDArray {
	public static void main(String[] args) {
		int[][] a=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("enter row and column");
		int m=s.nextInt();//main array
		int n=s.nextInt();//inner array
		
		System.out.println("initializing array");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
			System.out.println("----------");
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

}
