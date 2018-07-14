package com.in.string;

public class ReverseString {
	public static void doReverseString(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
	}
	public static void main(String[] args) {
		String str = "Good Morning !!";
		doReverseString(str);
	}

}
