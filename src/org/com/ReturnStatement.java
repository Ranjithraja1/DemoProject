package org.com;

public class ReturnStatement {

	  private int comId() {

		  int age =20;
		  
		  return age;
	}
	
	public static void main(String[] args) {
		
		String s= "java";
		s.length();
		
		ReturnStatement r = new ReturnStatement();
		int comId = r.comId();
		int a= 10;
		System.out.println(a);
		System.out.println(comId);
		System.out.println("sucess");
	}
}
