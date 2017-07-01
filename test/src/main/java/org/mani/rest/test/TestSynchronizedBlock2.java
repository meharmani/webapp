package org.mani.rest.test;

public class TestSynchronizedBlock2{  
public static void main(String args[]){  
final Table obj = new Table();//only one object  
final Table obj1=new Table();  
Thread t1=new Thread(){  
public void run(){  
obj.printTable(5);  
}  
};  
Thread t2=new Thread(){  
public void run(){  
obj.printTable(100);  
}  
};  
Thread t3=new Thread(){  
public void run(){  
obj1.printTable(1);  
}  
};  
  
Thread t4=new Thread(){  
public void run(){  
obj1.printTable(0);  
}  
};  
  
  
t1.start();  
t2.start();  
t3.start();  
t4.start();  

}  
}  
