package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		{
			int i =0;
			int num =0;
			String n = "";
			for (i = 1; i <= 100; i++)
			{
			int counter=0;
			for(num =i; num>=1; num--)
			{
			if(i%num==0)
			{
			counter = counter + 1;
			}
			}
			if (counter ==2)
			{
			n = n + i + " ";
			}
			}
			System.out.println("Primeers between 1 and 100 are :");
			System.out.println(n);
			}
			}
}
