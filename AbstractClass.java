import java.util.Scanner;
public class AbstractClass{
	public static void main(String []arss){
		DemoD obj= new DemoD();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value of lenght,bredth and radius:");
		
		int b=sc.nextInt();
		int c = sc.nextInt();
		double a=sc.nextDouble();
		obj.inputLenght(b);
		obj.inputBreadth(c);
		obj.inputRadius(a);
		int square= obj.area(obj.l);
		double circle=obj.area(obj.r,3.14);
		int rec=obj.area(obj.l,obj.b);
		System.out.println("area of square:"+square);
			System.out.println("area of circle:"+circle);
				System.out.println("area of rectangle:"+rec);
	}
}
abstract class Demo{
	int l,b;
	double r;
	public void inputLenght(int len){};
	public void inputBreadth(int bre){};
	public void inputRadius(double rad){};
}
class DemoD extends Demo{
	public void inputLenght(int len){
		l=len;
	}
	public void inputBreadth (int bre){
		b=bre;
	}
	public void inputRadius(double rad){
		r=rad;
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