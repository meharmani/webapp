package org.mani.rest.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapExample1 {

	public static void main(String[] args) {  
	    Map<Integer,String> map=new HashMap<Integer,String>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    System.out.print("\n" + map);
	 /*   //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=(Iterator) set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    } */ 
	    for(Map.Entry m:map.entrySet()){  
	    	   System.out.println(m.getKey()+" "+m.getValue());  
	    	  } 
	}  
	}  
