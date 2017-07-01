package org.mani.rest.test;

public class test1  {
	private int data=5;
	public void bump(int inc){
		inc++;
		data=data+inc;
	}

	public static void main(String args[]){
		test1 t= new test1();
		int data=2;
		t.bump(data);
		Boolean b=new Boolean("false");
		Float f=new Float(23.01);
		//Character c= new Character("c");
	}
}
