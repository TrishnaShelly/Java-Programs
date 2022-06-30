import  java.util.concurrent.TimeUnit;

public class Convertion{
	public static void main(String []args){
	   double milliseconds= 1e5;
		double sec=(double)milliseconds/1e3;
		System.out.println(sec+" seconds");
		float min=(float)sec/60;
		System.out.println(min+" minutes");
		System.out.println( TimeUnit.MILLISECONDS.toSeconds((long)milliseconds)+" seconds");
		System.out.println( TimeUnit.MILLISECONDS.toMinutes((long)milliseconds)+" minutes");
	}
}