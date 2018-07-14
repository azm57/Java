package com.in.string;

public class ReverseString {
	public static void doReverseString(String s)
	{
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--)
			reverse = reverse + s.charAt(i);
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good Morning !!";
		doReverseString(str);
	}

}
