package com.arrays;

public class PracticeStringReplace {

	public static void main(String[] args) {
		
		String a= "sai Krishna";
		
		System.out.println(a.replace('a', 'A'));                // can replace a particular letter 
		System.out.println(a.replaceFirst("a","AA"));          // only replaces the first letter
		System.out.println(a.replaceAll("sai","naga"));       //  can replace a word

		
		System.out.println(a.startsWith("sai"));            //test weather the string starts with given value in[true or false] form
		
		System.out.println(a.startsWith("Krishna",4));     // with the position of the word of index of the word we will check 
		
		
		
		
		
		System.out.println(a.substring(3));                    //can get  the substring through the string 
		System.out.println(a.substring(4,8));                   // can get the  substring through the string 
		
		
	}

}
