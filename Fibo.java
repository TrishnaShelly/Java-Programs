import java.util.Scanner;

public class Fibo{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		int a=0; int b=1;  
		int c;
		System.out.println("Enter a number to which you want to print fibonacci series:");
		
		int count=sc.nextInt();
		System.out.print("Fibonacci series is:"+a+" "+b);
		
		for(int i=3;i<=count;i++)
		{   c= a+b; 
	        System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}
}