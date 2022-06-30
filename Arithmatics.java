import java.util.Scanner;
public class Arithmatics {
public static void main(String []args){
	Scanner sc = new Scanner (System.in);
    System.out.println("Enetr two integers:");
	int num1=sc.nextInt();
	int num2= sc.nextInt();
	System.out.println("Enetr the your choice:");
	int value=sc.nextInt();
	int result;
	switch(value){
		case 1:  result=num1+num2;
		System.out.println("Your ans is :"+result);
		        break;
	    case 2:  result=num1-num2;
		System.out.println("Your ans is :"+result);
		        break;
		case 3:  result=num1*num2;
		System.out.println("Your ans is :"+result);
		        break;
		case 4:  result=num1/num2;
		System.out.println("Your ans is :"+result);
		        break;
		default: System.out.println("You entered wrong choice");		
	}
	
}
}