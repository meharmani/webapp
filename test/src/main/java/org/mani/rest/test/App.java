package org.mani.rest.test;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  int a[]={1, 4, 45, 10, 6, -8};
     
        System.out.println("enter elements");
       Scanner s=new Scanner(System.in);
        int a[] =new int[10];
        for(int i=0;i<a.length;i++){//for reading array
            a[i]=s.nextInt();

        }	
        for(int i=0;i<a.length;i++){
        	for(int j=0;j<a.length;j++){
        		if((a[i]+a[j]==6)||(a[i]+a[j]==10)||(a[i]+a[j]==16)){
        		System.out.println("element is:"+"("+a[i]+","+a[j]+")");
        			
        		}
        	}
        }
    }
}
