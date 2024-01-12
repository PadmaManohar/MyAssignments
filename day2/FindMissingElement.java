package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a [] = {1,4,3,2,8,6,7};
		int s1 =36;
		int s2=0;
		int n;
		
		Arrays.sort(a);
		
		System.out.println("After Sorting");
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int j=0;j<=a.length-1;j++)
		{
			s2=s2+a[j];
			
		}
		
		System.out.println("The sum of s2 is" +s2);
		
		n=s1-s2;
		System.out.println("The missing number is" +n);
		}
}
