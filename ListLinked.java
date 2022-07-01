import java.util.*;

public class ListLinked{
	public static void main(String args[]){
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("sun");
		l1.add("mon");
		l1.add("tues");
		l1.add("wednes");
		l1.add("thurs");
		l1.add("fri");
		l1.add("satur");
		System.out.println(l1);
		System.out.println("list contains mon:"+l1.contains("mon"));
        l1.remove("mon");
        System.out.println("list contains mon:"+l1.contains("mon"));
        System.out.println("list size:"+l1.size());	
        l1.addFirst("***Days of weak");	
        System.out.println("list after addFirst:"+l1);	
		l1.addLast("Days of weak***");	
        System.out.println("list after addLast:"+l1);
		System.out.println("list first element:"+l1.getFirst());
		System.out.println("list last element:"+l1.getLast());
		l1.removeFirst();	
        System.out.println("list after removeFirst:"+l1);	
		l1.removeLast();	
        System.out.println("list after removeLast:"+l1);
		
		l1.clear();
        System.out.println("list after clear\n"+l1);
		}
}