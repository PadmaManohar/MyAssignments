package week1.day2;

public class Palindromenumber {

	public static void main(String[] args) {
		int num= 121;
		int rev=0;
		int n;
		int temp = num;
System.out.println("The Reversed Number is");
for(;num!=0;num/=10)
{
	n=num%10;
	rev = rev*10+n;
	
}
		
System.out.println(rev);
if (temp==rev)
{
	System.out.println("The given number is a palindrome");
}
else
{
	System.out.println("The given number is not a palindrome");
}

}
}
