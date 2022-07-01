import java.util.*;

public class SetHash{
	public static void main(String args[]){
		HashSet<String> h1= new HashSet<String>();
		h1.add("sun");
		h1.add("mon");
		h1.add("tues");
		h1.add("wednes");
		h1.add("thurs");
		h1.add("fri");
		h1.add("satur");
		System.out.println(h1);
		System.out.println("HashSet contains mon:"+h1.contains("mon"));
        h1.remove("mon");
        System.out.println("HashSet contains mon:"+h1.contains("mon"));
        System.out.println("HashSet size:"+h1.size());	
		h1.clear();
        System.out.println("HashSet after clear\n"+h1);
		}
}