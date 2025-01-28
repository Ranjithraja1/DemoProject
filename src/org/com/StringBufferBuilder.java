package org.com;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		System.out.println("Immutable String");
		
	  String s1 ="java";
	  System.out.println(System.identityHashCode(s1));
	  
	  String s2 ="selenium";
	  System.out.println(System.identityHashCode(s2));
	  
	  System.out.println(s1);
	  
	  s1 = s1.concat(s2);
	  System.out.println(s1);
	  System.out.println(System.identityHashCode(s1));
	  
	  System.out.println("Mutable String");
	  
	  StringBuffer a1 = new StringBuffer("Git");
	  System.out.println(System.identityHashCode(a1));
	  
	  StringBuffer a2 = new StringBuffer("Jenkins");
	  System.out.println(System.identityHashCode(a2));
	  
	  a1 =a1.append(a2);
	  System.out.println(a1);
	  System.out.println(System.identityHashCode(a1));
	}
}
