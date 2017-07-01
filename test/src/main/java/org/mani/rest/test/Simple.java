package org.mani.rest.test;

import java.util.StringTokenizer;

public class Simple{  
	 public static void main(String args[]){  
	   StringTokenizer st = new StringTokenizer("my,name,iskhan",",");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	   }  
	}  