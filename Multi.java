import java.lang.*;

public class Multi{
	public static void main(String []args){
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		t1.start();
       try{
			t1.join(2000);
		}
		catch(Exception e){}
	    
		t2.start();
		t1.suspend();
       try{
			t2.join(10000);
		}
		catch(Exception e){}
		
			t2.stop();
		
		t1.resume();
		//t2.resume();

}
}
class Thread1 extends Thread{
	public int i;
	public void run(){
   for( i=1;i<=30;i++){    
   try{    
    Thread.sleep(500);    
   }catch(Exception e){System.out.println(e);}    
   System.out.println("Thread A"+i);    
  }    
 }    
}
class Thread2 extends Thread{
		public int i;
	public void run(){
   for(i=1;i<=30;i++){    
   try{    
    Thread.sleep(500);    
   }catch(Exception e){System.out.println(e);}    
   System.out.println("Thread B"+i);    
  }    
 }    
	
	}
