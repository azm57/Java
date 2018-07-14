package com.in.string;

import java.util.regex.Pattern;

public class ReverseWords {
	public static void doReverseWords(String s)
	{
		Pattern pattern = Pattern.compile("\\s");
		String[] temp = pattern.split(s);
		String result = "";
		
		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
				result = temp[i]+result;
			else
				result = " "+temp[i]+result;
		}
		System.out.print(result);
	}
	public static void main(String[] args)
	{
		String str = "Have a nice day !!";
		doReverseWords(str);
	}
}