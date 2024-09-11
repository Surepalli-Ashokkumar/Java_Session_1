package com.cisco.demo;

public class TypeCastingConversion 
{
   
	
	public static void main(String[] args) 
      {
		byte a= 10;
		System.out.println("Byte: "+a);
		
		short b=a;
		System.out.println("byte to short conversition: "+b);
		
		int c=b;
		System.out.println("short to int conversition: "+c);
		
		int d=a;
		System.out.println("Byte to int converstion: "+d);
		
		float e=d;
		System.out.println("int to float converstion: "+e);
		
		double f=e;
		System.out.println("float to double converstion: "+f);
		
		double g=d;
		System.out.println("int to double converstion: "+g);
	  }
}
