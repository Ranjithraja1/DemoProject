package org.com;

public class Sample {

	public static void main(String[] args) {
		
		String s1 = "java Programming Session";
		String s2= "Java Programming Session";
		
		
		int identityHashCode = System.identityHashCode(s1);
		System.out.println("identityHashCode:"+identityHashCode);
		
		int length = s1.length();
		System.out.println("length:"+length);
		
		String upperCase = s1.toUpperCase();
		System.out.println("upperCase:"+upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println("lowercase:"+lowerCase);
		
		boolean startsWith = s1.startsWith("java");
		System.out.println("startsWith:"+startsWith);
		
		boolean endsWith = s1.endsWith("Session");
		System.out.println("endsWith:"+endsWith);
		
		boolean contains = s1.contains("Programming");
		System.out.println("contains:"+contains);
		
		String substring = s1.substring(5);
		System.out.println("substring:"+substring);
		
		String substring2 = s1.substring(5, 17);
		System.out.println("substring2:"+substring2);
		
		char charAt = s1.charAt(3);
		System.out.println("charAt:"+charAt);
		
		int indexOf = s1.indexOf("v");
		System.out.println("indexOf:"+indexOf);
		
		int lastIndexOf = s1.lastIndexOf("i");
		System.out.println("lastIndexOf:"+lastIndexOf);
		
		String replace = s1.replace("a", "*");
		System.out.println("replace:"+replace);
		
		String replace2 = s1.replace("java", "Selenium");
		System.out.println("replace2:"+replace2);
		
		String replaceAll = s1.replaceAll("Session", "class");
		System.out.println("replaceAll:"+replaceAll);
		
		boolean empty = s1.isEmpty();
		System.out.println("empty:"+empty);
		
		String trim = s1.trim();
		System.out.println("trim:"+trim);
	    
		boolean equals = s1.equals(s2);
		System.out.println("equals:"+equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println("equalsIgnoreCase:"+equalsIgnoreCase);
		
		String concat = s1.concat(s2);
		System.out.println("concat:"+concat);
		
		int compareTo = s1.compareTo(s2);
		System.out.println("compareTo:"+compareTo);
	
	}
}
