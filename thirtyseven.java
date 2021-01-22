//wap in java to find sum of diagonal elements of matrix//
import java.io.*;
import java.util.*;
class thirtyseven
{
	public static void main(String args[])
	{
		int arr[][]=new int[3][3];
		int i,j;
		d.sum=0;
		Scanner sc=new scanner(System.in);
		System.out.println("enter element of matrix:");
		for(i=0;i<arr.length;i++)
		for(j=0;j<arr[i].length;j++)
		arr[i][j]=sc.nextInt()
		System.out.println("the matrix is=");
		for(i=0;i<arr.length;i++)
		{
		for(j=0;j<arr[i].length;j++) 
		System.out.println(" "+arr[i][j]);
		System.out.println();
		}
		for(i=0;i<arr .length;i++)
		for(j=0;j<arr[i].length;j++)
		if(i==j)
		dsum=dsum+arr[i][j];
		System.out.println(sum of diagonal elements);
		System.out.println("is"+dsum);
	}
		
}