package com.orangehrm;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="java";
		
		char ch[] = name. toCharArray();
		for( int i=0;i<=name.length()-1;i++) {
		//	System.out.print(ch[i]);
			
		}
		
		for(int j=name.length()-1;j>=0;j--){
			
			System.out.print(ch[j]);
			
		}
	}

}




