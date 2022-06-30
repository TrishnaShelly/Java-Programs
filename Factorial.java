import java.util.Scanner;

public class Factorial{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int fact=1;
		int num= sc.nextInt();
	for(int i=1;i<=num;i++){
		if(num==1 || num==0)
			fact=1;
		else
			fact*=i;
		
	}
	System.out.println("Factorial of a number is:"+fact);
	}
}