package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	    public static void main(String[]args){
	Map<Integer,String> list = new HashMap<>();
	    list.put(12,"Pune");
	    list.put(1,"Mumbai");
	    list.put(2,"Mumbai");
	    list.put(14,"PCMC");
	    list.put(20,"Sambhaji Nagar");
	    
	for( Map.Entry<Integer,String>e1:list.entrySet())
	   System.out.println(" "+e1.getKey()+"\t "+e1.getValue());
	    }
	}    
	    

