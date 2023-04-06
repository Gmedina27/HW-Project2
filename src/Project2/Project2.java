package Project2;

import java.util.HashMap;
import java.util.Map;

public class Project2 { 
	
	public static void main(String[] args) {
		
		
		Duplicate("Hello"); 
		
	}
	
	
	public static void Duplicate (String str) { 
		
		
		Map<Character,Integer> Duplicate = new HashMap<Character,Integer>(); 
		
		
		char[] Array = str.toCharArray(); 
		
		
		for(char key:Array) { 
			
			
			if(Duplicate.containsKey(key)) { 
				
				
				Duplicate.put(key, Duplicate.get(key)+1); 
				
			}
			
			else Duplicate.put(key, 1); 
			
		}
		
		for(Map.Entry<Character, Integer> Entry : Duplicate.entrySet()) { 
			
			
			if ( Entry.getValue() > 1) { 
				
				
				System.out.println("Duplicate Character: "+Entry.getKey() + " Frecuency: "+Entry.getValue()); 
				
			}
			
		}
		
	}

}
