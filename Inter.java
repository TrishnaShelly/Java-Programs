import java.util.Scanner;

public class Inter{
	public static Scanner sc= new Scanner(System.in);
	public static void main(String []args){
		Area2 calArea= new Area2();
		calArea.inputLenght();
		calArea.inputBreadth();
		calArea.inputRadius();
		int square= calArea.area(calArea.l);
		double circle=calArea.area(calArea.r,3.14);
		int rec=calArea.area(calArea.l,calArea.b);
		System.out.println("area of square:"+square);
	    System.out.println("area of circle:"+circle);
		System.out.println("area of rectangle:"+rec);
	}
}
interface Area{
	
	public void inputLenght();
	public void inputBreadth();
	public void inputRadius();
}
class Area2 implements Area{
	int l,b;
	double r;
	public void inputLenght(){
		System.out.println("enter the value of Lenght:");
		l=Inter.sc.nextInt();
	}
	public void inputBreadth (){
	System.out.println("enter the value of breadth:");
		b=Inter.sc.nextInt();
	}
	public void inputRadius( ){
		System.out.println("enter the value of radius:");
		r=Inter.sc.nextDouble();
	}
	public int area(int a){
		int area=a*a;
	return area;}
	public int area(int a,int b){
		return a*b;
	}
	public double area(double a,double pi){
		return a*pi*a;
	}
}
