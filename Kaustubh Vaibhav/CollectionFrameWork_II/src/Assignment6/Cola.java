package Assignment6;

import java.util.HashMap;
import java.util.Map;


public class Cola {

	public static void main(String[] args) {
	String str="coccacola";
	Map<Character,Integer>List=new HashMap<>();
	for(int i=0;i<str.length();i++)
	{
		Character ch=str.charAt(i);
		if(List.containsKey(ch))
		{
			int no=List.get(ch);
			List.put(ch, ++no);
		}
		else
		{
			List.put(ch, 1);
		}
		
			
	  }	
	for(Map.Entry<Character,Integer>entry:List.entrySet())
	{
		System.out.println("\t"+entry.getKey()+"\t"+entry.getValue());
	}

	}

}
